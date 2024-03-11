package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes5.dex */
public final class H263Reader implements ElementaryStreamReader {
    private static final float[] PIXEL_WIDTH_HEIGHT_RATIO_BY_ASPECT_RATIO_INFO = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final CsdBuffer csdBuffer;
    private String formatId;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private long pesTimeUs;
    private final boolean[] prefixFlags;
    private SampleReader sampleReader;
    private long totalBytesWritten;
    private final NalUnitTargetBuffer userData;
    private final ParsableByteArray userDataParsable;
    private final UserDataReader userDataReader;

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        if (j != -9223372036854775807L) {
            this.pesTimeUs = j;
        }
    }

    public H263Reader() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public H263Reader(UserDataReader userDataReader) {
        ParsableByteArray parsableByteArray;
        this.userDataReader = userDataReader;
        this.prefixFlags = new boolean[4];
        this.csdBuffer = new CsdBuffer(128);
        this.pesTimeUs = -9223372036854775807L;
        if (userDataReader != null) {
            this.userData = new NalUnitTargetBuffer(178, 128);
            parsableByteArray = new ParsableByteArray();
        } else {
            parsableByteArray = null;
            this.userData = null;
        }
        this.userDataParsable = parsableByteArray;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.csdBuffer.reset();
        SampleReader sampleReader = this.sampleReader;
        if (sampleReader != null) {
            sampleReader.reset();
        }
        NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.reset();
        }
        this.totalBytesWritten = 0L;
        this.pesTimeUs = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        this.output = track;
        this.sampleReader = new SampleReader(track);
        UserDataReader userDataReader = this.userDataReader;
        if (userDataReader != null) {
            userDataReader.createTracks(extractorOutput, trackIdGenerator);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        Assertions.checkStateNotNull(this.sampleReader);
        Assertions.checkStateNotNull(this.output);
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        this.totalBytesWritten += parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int findNalUnit = NalUnitUtil.findNalUnit(data, position, limit, this.prefixFlags);
            if (findNalUnit == limit) {
                break;
            }
            int i = findNalUnit + 3;
            int i2 = parsableByteArray.getData()[i] & 255;
            int i3 = findNalUnit - position;
            int i4 = 0;
            if (!this.hasOutputFormat) {
                if (i3 > 0) {
                    this.csdBuffer.onData(data, position, findNalUnit);
                }
                if (this.csdBuffer.onStartCode(i2, i3 < 0 ? -i3 : 0)) {
                    TrackOutput trackOutput = this.output;
                    CsdBuffer csdBuffer = this.csdBuffer;
                    trackOutput.format(parseCsdBuffer(csdBuffer, csdBuffer.volStartPosition, (String) Assertions.checkNotNull(this.formatId)));
                    this.hasOutputFormat = true;
                }
            }
            this.sampleReader.onData(data, position, findNalUnit);
            NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
            if (nalUnitTargetBuffer != null) {
                if (i3 > 0) {
                    nalUnitTargetBuffer.appendToNalUnit(data, position, findNalUnit);
                } else {
                    i4 = -i3;
                }
                if (this.userData.endNalUnit(i4)) {
                    NalUnitTargetBuffer nalUnitTargetBuffer2 = this.userData;
                    ((ParsableByteArray) Util.castNonNull(this.userDataParsable)).reset(this.userData.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer2.nalData, nalUnitTargetBuffer2.nalLength));
                    ((UserDataReader) Util.castNonNull(this.userDataReader)).consume(this.pesTimeUs, this.userDataParsable);
                }
                if (i2 == 178 && parsableByteArray.getData()[findNalUnit + 2] == 1) {
                    this.userData.startNalUnit(i2);
                }
            }
            int i5 = limit - findNalUnit;
            this.sampleReader.onDataEnd(this.totalBytesWritten - i5, i5, this.hasOutputFormat);
            this.sampleReader.onStartCode(i2, this.pesTimeUs);
            position = i;
        }
        if (!this.hasOutputFormat) {
            this.csdBuffer.onData(data, position, limit);
        }
        this.sampleReader.onData(data, position, limit);
        NalUnitTargetBuffer nalUnitTargetBuffer3 = this.userData;
        if (nalUnitTargetBuffer3 != null) {
            nalUnitTargetBuffer3.appendToNalUnit(data, position, limit);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetFinished(boolean z) {
        Assertions.checkStateNotNull(this.sampleReader);
        if (z) {
            this.sampleReader.onDataEnd(this.totalBytesWritten, 0, this.hasOutputFormat);
            this.sampleReader.reset();
        }
    }

    private static Format parseCsdBuffer(CsdBuffer csdBuffer, int i, String str) {
        float f;
        byte[] copyOf = Arrays.copyOf(csdBuffer.data, csdBuffer.length);
        ParsableBitArray parsableBitArray = new ParsableBitArray(copyOf);
        parsableBitArray.skipBytes(i);
        parsableBitArray.skipBytes(4);
        parsableBitArray.skipBit();
        parsableBitArray.skipBits(8);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(4);
            parsableBitArray.skipBits(3);
        }
        int readBits = parsableBitArray.readBits(4);
        if (readBits == 15) {
            int readBits2 = parsableBitArray.readBits(8);
            int readBits3 = parsableBitArray.readBits(8);
            if (readBits3 == 0) {
                Log.w("H263Reader", "Invalid aspect ratio");
                f = 1.0f;
            } else {
                f = readBits2 / readBits3;
            }
        } else {
            float[] fArr = PIXEL_WIDTH_HEIGHT_RATIO_BY_ASPECT_RATIO_INFO;
            if (readBits < fArr.length) {
                f = fArr[readBits];
            } else {
                Log.w("H263Reader", "Invalid aspect ratio");
                f = 1.0f;
            }
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(2);
            parsableBitArray.skipBits(1);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(3);
                parsableBitArray.skipBits(11);
                parsableBitArray.skipBit();
                parsableBitArray.skipBits(15);
                parsableBitArray.skipBit();
            }
        }
        if (parsableBitArray.readBits(2) != 0) {
            Log.w("H263Reader", "Unhandled video object layer shape");
        }
        parsableBitArray.skipBit();
        int readBits4 = parsableBitArray.readBits(16);
        parsableBitArray.skipBit();
        if (parsableBitArray.readBit()) {
            if (readBits4 == 0) {
                Log.w("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i2 = 0;
                for (int i3 = readBits4 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                parsableBitArray.skipBits(i2);
            }
        }
        parsableBitArray.skipBit();
        int readBits5 = parsableBitArray.readBits(13);
        parsableBitArray.skipBit();
        int readBits6 = parsableBitArray.readBits(13);
        parsableBitArray.skipBit();
        parsableBitArray.skipBit();
        return new Format.Builder().setId(str).setSampleMimeType("video/mp4v-es").setWidth(readBits5).setHeight(readBits6).setPixelWidthHeightRatio(f).setInitializationData(Collections.singletonList(copyOf)).build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class CsdBuffer {
        private static final byte[] START_CODE = {0, 0, 1};
        public byte[] data;
        private boolean isFilling;
        public int length;
        private int state;
        public int volStartPosition;

        public void reset() {
            this.isFilling = false;
            this.length = 0;
            this.state = 0;
        }

        public CsdBuffer(int i) {
            this.data = new byte[i];
        }

        public boolean onStartCode(int i, int i2) {
            int i3 = this.state;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i == 179 || i == 181) {
                                this.length -= i2;
                                this.isFilling = false;
                                return true;
                            }
                        } else if ((i & 240) != 32) {
                            Log.w("H263Reader", "Unexpected start code value");
                            reset();
                        } else {
                            this.volStartPosition = this.length;
                            this.state = 4;
                        }
                    } else if (i > 31) {
                        Log.w("H263Reader", "Unexpected start code value");
                        reset();
                    } else {
                        this.state = 3;
                    }
                } else if (i != 181) {
                    Log.w("H263Reader", "Unexpected start code value");
                    reset();
                } else {
                    this.state = 2;
                }
            } else if (i == 176) {
                this.state = 1;
                this.isFilling = true;
            }
            byte[] bArr = START_CODE;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public void onData(byte[] bArr, int i, int i2) {
            if (this.isFilling) {
                int i3 = i2 - i;
                byte[] bArr2 = this.data;
                int length = bArr2.length;
                int i4 = this.length + i3;
                if (length < i4) {
                    this.data = Arrays.copyOf(bArr2, i4 * 2);
                }
                System.arraycopy(bArr, i, this.data, this.length, i3);
                this.length += i3;
            }
        }
    }

    /* loaded from: classes5.dex */
    static final class SampleReader {
        private boolean lookingForVopCodingType;
        private final TrackOutput output;
        private boolean readingSample;
        private boolean sampleIsKeyframe;
        private long samplePosition;
        private long sampleTimeUs;
        private int startCodeValue;
        private int vopBytesRead;

        public void onStartCode(int i, long j) {
            this.startCodeValue = i;
            this.sampleIsKeyframe = false;
            this.readingSample = i == 182 || i == 179;
            this.lookingForVopCodingType = i == 182;
            this.vopBytesRead = 0;
            this.sampleTimeUs = j;
        }

        public void reset() {
            this.readingSample = false;
            this.lookingForVopCodingType = false;
            this.sampleIsKeyframe = false;
            this.startCodeValue = -1;
        }

        public SampleReader(TrackOutput trackOutput) {
            this.output = trackOutput;
        }

        public void onData(byte[] bArr, int i, int i2) {
            if (this.lookingForVopCodingType) {
                int i3 = this.vopBytesRead;
                int i4 = (i + 1) - i3;
                if (i4 >= i2) {
                    this.vopBytesRead = i3 + (i2 - i);
                    return;
                }
                this.sampleIsKeyframe = ((bArr[i4] & 192) >> 6) == 0;
                this.lookingForVopCodingType = false;
            }
        }

        public void onDataEnd(long j, int i, boolean z) {
            if (this.startCodeValue == 182 && z && this.readingSample) {
                long j2 = this.sampleTimeUs;
                if (j2 != -9223372036854775807L) {
                    this.output.sampleMetadata(j2, this.sampleIsKeyframe ? 1 : 0, (int) (j - this.samplePosition), i, null);
                }
            }
            if (this.startCodeValue != 179) {
                this.samplePosition = j;
            }
        }
    }
}
