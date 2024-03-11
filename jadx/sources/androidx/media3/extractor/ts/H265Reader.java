package androidx.media3.extractor.ts;

import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes5.dex */
public final class H265Reader implements ElementaryStreamReader {
    private String formatId;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private SampleReader sampleReader;
    private final SeiReader seiReader;
    private long totalBytesWritten;
    private final boolean[] prefixFlags = new boolean[3];
    private final NalUnitTargetBuffer vps = new NalUnitTargetBuffer(32, 128);
    private final NalUnitTargetBuffer sps = new NalUnitTargetBuffer(33, 128);
    private final NalUnitTargetBuffer pps = new NalUnitTargetBuffer(34, 128);
    private final NalUnitTargetBuffer prefixSei = new NalUnitTargetBuffer(39, 128);
    private final NalUnitTargetBuffer suffixSei = new NalUnitTargetBuffer(40, 128);
    private long pesTimeUs = -9223372036854775807L;
    private final ParsableByteArray seiWrapper = new ParsableByteArray();

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        if (j != -9223372036854775807L) {
            this.pesTimeUs = j;
        }
    }

    public H265Reader(SeiReader seiReader) {
        this.seiReader = seiReader;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.totalBytesWritten = 0L;
        this.pesTimeUs = -9223372036854775807L;
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.vps.reset();
        this.sps.reset();
        this.pps.reset();
        this.prefixSei.reset();
        this.suffixSei.reset();
        SampleReader sampleReader = this.sampleReader;
        if (sampleReader != null) {
            sampleReader.reset();
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        this.output = track;
        this.sampleReader = new SampleReader(track);
        this.seiReader.createTracks(extractorOutput, trackIdGenerator);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        assertTracksCreated();
        while (parsableByteArray.bytesLeft() > 0) {
            int position = parsableByteArray.getPosition();
            int limit = parsableByteArray.limit();
            byte[] data = parsableByteArray.getData();
            this.totalBytesWritten += parsableByteArray.bytesLeft();
            this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
            while (position < limit) {
                int findNalUnit = NalUnitUtil.findNalUnit(data, position, limit, this.prefixFlags);
                if (findNalUnit == limit) {
                    nalUnitData(data, position, limit);
                    return;
                }
                int h265NalUnitType = NalUnitUtil.getH265NalUnitType(data, findNalUnit);
                int i = findNalUnit - position;
                if (i > 0) {
                    nalUnitData(data, position, findNalUnit);
                }
                int i2 = limit - findNalUnit;
                long j = this.totalBytesWritten - i2;
                endNalUnit(j, i2, i < 0 ? -i : 0, this.pesTimeUs);
                startNalUnit(j, i2, h265NalUnitType, this.pesTimeUs);
                position = findNalUnit + 3;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetFinished(boolean z) {
        assertTracksCreated();
        if (z) {
            this.sampleReader.end(this.totalBytesWritten);
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void startNalUnit(long j, int i, int i2, long j2) {
        this.sampleReader.startNalUnit(j, i, i2, j2, this.hasOutputFormat);
        if (!this.hasOutputFormat) {
            this.vps.startNalUnit(i2);
            this.sps.startNalUnit(i2);
            this.pps.startNalUnit(i2);
        }
        this.prefixSei.startNalUnit(i2);
        this.suffixSei.startNalUnit(i2);
    }

    @RequiresNonNull({"sampleReader"})
    private void nalUnitData(byte[] bArr, int i, int i2) {
        this.sampleReader.readNalUnitData(bArr, i, i2);
        if (!this.hasOutputFormat) {
            this.vps.appendToNalUnit(bArr, i, i2);
            this.sps.appendToNalUnit(bArr, i, i2);
            this.pps.appendToNalUnit(bArr, i, i2);
        }
        this.prefixSei.appendToNalUnit(bArr, i, i2);
        this.suffixSei.appendToNalUnit(bArr, i, i2);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void endNalUnit(long j, int i, int i2, long j2) {
        this.sampleReader.endNalUnit(j, i, this.hasOutputFormat);
        if (!this.hasOutputFormat) {
            this.vps.endNalUnit(i2);
            this.sps.endNalUnit(i2);
            this.pps.endNalUnit(i2);
            if (this.vps.isCompleted() && this.sps.isCompleted() && this.pps.isCompleted()) {
                this.output.format(parseMediaFormat(this.formatId, this.vps, this.sps, this.pps));
                this.hasOutputFormat = true;
            }
        }
        if (this.prefixSei.endNalUnit(i2)) {
            NalUnitTargetBuffer nalUnitTargetBuffer = this.prefixSei;
            this.seiWrapper.reset(this.prefixSei.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer.nalData, nalUnitTargetBuffer.nalLength));
            this.seiWrapper.skipBytes(5);
            this.seiReader.consume(j2, this.seiWrapper);
        }
        if (this.suffixSei.endNalUnit(i2)) {
            NalUnitTargetBuffer nalUnitTargetBuffer2 = this.suffixSei;
            this.seiWrapper.reset(this.suffixSei.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer2.nalData, nalUnitTargetBuffer2.nalLength));
            this.seiWrapper.skipBytes(5);
            this.seiReader.consume(j2, this.seiWrapper);
        }
    }

    private static Format parseMediaFormat(String str, NalUnitTargetBuffer nalUnitTargetBuffer, NalUnitTargetBuffer nalUnitTargetBuffer2, NalUnitTargetBuffer nalUnitTargetBuffer3) {
        int i = nalUnitTargetBuffer.nalLength;
        byte[] bArr = new byte[nalUnitTargetBuffer2.nalLength + i + nalUnitTargetBuffer3.nalLength];
        System.arraycopy(nalUnitTargetBuffer.nalData, 0, bArr, 0, i);
        System.arraycopy(nalUnitTargetBuffer2.nalData, 0, bArr, nalUnitTargetBuffer.nalLength, nalUnitTargetBuffer2.nalLength);
        System.arraycopy(nalUnitTargetBuffer3.nalData, 0, bArr, nalUnitTargetBuffer.nalLength + nalUnitTargetBuffer2.nalLength, nalUnitTargetBuffer3.nalLength);
        NalUnitUtil.H265SpsData parseH265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(nalUnitTargetBuffer2.nalData, 3, nalUnitTargetBuffer2.nalLength);
        return new Format.Builder().setId(str).setSampleMimeType("video/hevc").setCodecs(CodecSpecificDataUtil.buildHevcCodecString(parseH265SpsNalUnit.generalProfileSpace, parseH265SpsNalUnit.generalTierFlag, parseH265SpsNalUnit.generalProfileIdc, parseH265SpsNalUnit.generalProfileCompatibilityFlags, parseH265SpsNalUnit.constraintBytes, parseH265SpsNalUnit.generalLevelIdc)).setWidth(parseH265SpsNalUnit.width).setHeight(parseH265SpsNalUnit.height).setColorInfo(new ColorInfo.Builder().setColorSpace(parseH265SpsNalUnit.colorSpace).setColorRange(parseH265SpsNalUnit.colorRange).setColorTransfer(parseH265SpsNalUnit.colorTransfer).setLumaBitdepth(parseH265SpsNalUnit.bitDepthLumaMinus8 + 8).setChromaBitdepth(parseH265SpsNalUnit.bitDepthChromaMinus8 + 8).build()).setPixelWidthHeightRatio(parseH265SpsNalUnit.pixelWidthHeightRatio).setInitializationData(Collections.singletonList(bArr)).build();
    }

    @EnsuresNonNull({"output", "sampleReader"})
    private void assertTracksCreated() {
        Assertions.checkStateNotNull(this.output);
        Util.castNonNull(this.sampleReader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class SampleReader {
        private boolean isFirstPrefixNalUnit;
        private boolean isFirstSlice;
        private boolean lookingForFirstSliceFlag;
        private int nalUnitBytesRead;
        private boolean nalUnitHasKeyframeData;
        private long nalUnitPosition;
        private long nalUnitTimeUs;
        private final TrackOutput output;
        private boolean readingPrefix;
        private boolean readingSample;
        private boolean sampleIsKeyframe;
        private long samplePosition;
        private long sampleTimeUs;

        private static boolean isPrefixNalUnit(int i) {
            return (32 <= i && i <= 35) || i == 39;
        }

        private static boolean isVclBodyNalUnit(int i) {
            return i < 32 || i == 40;
        }

        public void reset() {
            this.lookingForFirstSliceFlag = false;
            this.isFirstSlice = false;
            this.isFirstPrefixNalUnit = false;
            this.readingSample = false;
            this.readingPrefix = false;
        }

        public SampleReader(TrackOutput trackOutput) {
            this.output = trackOutput;
        }

        public void startNalUnit(long j, int i, int i2, long j2, boolean z) {
            boolean z2 = false;
            this.isFirstSlice = false;
            this.isFirstPrefixNalUnit = false;
            this.nalUnitTimeUs = j2;
            this.nalUnitBytesRead = 0;
            this.nalUnitPosition = j;
            if (!isVclBodyNalUnit(i2)) {
                if (this.readingSample && !this.readingPrefix) {
                    if (z) {
                        outputSample(i);
                    }
                    this.readingSample = false;
                }
                if (isPrefixNalUnit(i2)) {
                    this.isFirstPrefixNalUnit = !this.readingPrefix;
                    this.readingPrefix = true;
                }
            }
            boolean z3 = i2 >= 16 && i2 <= 21;
            this.nalUnitHasKeyframeData = z3;
            if (z3 || i2 <= 9) {
                z2 = true;
            }
            this.lookingForFirstSliceFlag = z2;
        }

        public void readNalUnitData(byte[] bArr, int i, int i2) {
            if (this.lookingForFirstSliceFlag) {
                int i3 = this.nalUnitBytesRead;
                int i4 = (i + 2) - i3;
                if (i4 >= i2) {
                    this.nalUnitBytesRead = i3 + (i2 - i);
                    return;
                }
                this.isFirstSlice = (bArr[i4] & 128) != 0;
                this.lookingForFirstSliceFlag = false;
            }
        }

        public void endNalUnit(long j, int i, boolean z) {
            if (this.readingPrefix && this.isFirstSlice) {
                this.sampleIsKeyframe = this.nalUnitHasKeyframeData;
                this.readingPrefix = false;
            } else if (this.isFirstPrefixNalUnit || this.isFirstSlice) {
                if (z && this.readingSample) {
                    outputSample(i + ((int) (j - this.nalUnitPosition)));
                }
                this.samplePosition = this.nalUnitPosition;
                this.sampleTimeUs = this.nalUnitTimeUs;
                this.sampleIsKeyframe = this.nalUnitHasKeyframeData;
                this.readingSample = true;
            }
        }

        private void outputSample(int i) {
            long j = this.sampleTimeUs;
            if (j == -9223372036854775807L) {
                return;
            }
            boolean z = this.sampleIsKeyframe;
            this.output.sampleMetadata(j, z ? 1 : 0, (int) (this.nalUnitPosition - this.samplePosition), i, null);
        }

        public void end(long j) {
            this.nalUnitPosition = j;
            outputSample(0);
            this.readingSample = false;
        }
    }
}
