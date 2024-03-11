package androidx.media3.extractor.ts;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.ts.TsPayloadReader;
import com.netflix.android.org.json.zip.JSONzip;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes5.dex */
public final class PsExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.ts.PsExtractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            Extractor[] lambda$static$0;
            lambda$static$0 = PsExtractor.lambda$static$0();
            return lambda$static$0;
        }
    };
    private final PsDurationReader durationReader;
    private boolean foundAllTracks;
    private boolean foundAudioTrack;
    private boolean foundVideoTrack;
    private boolean hasOutputSeekMap;
    private long lastTrackPosition;
    private ExtractorOutput output;
    private PsBinarySearchSeeker psBinarySearchSeeker;
    private final ParsableByteArray psPacketBuffer;
    private final SparseArray<PesReader> psPayloadReaders;
    private final TimestampAdjuster timestampAdjuster;

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.output = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new PsExtractor()};
    }

    public PsExtractor() {
        this(new TimestampAdjuster(0L));
    }

    public PsExtractor(TimestampAdjuster timestampAdjuster) {
        this.timestampAdjuster = timestampAdjuster;
        this.psPacketBuffer = new ParsableByteArray(4096);
        this.psPayloadReaders = new SparseArray<>();
        this.durationReader = new PsDurationReader();
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        byte[] bArr = new byte[14];
        extractorInput.peekFully(bArr, 0, 14);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            extractorInput.advancePeekPosition(bArr[13] & 7);
            extractorInput.peekFully(bArr, 0, 3);
            return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r2 != r7) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r5 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        r4.timestampAdjuster.reset(r7);
     */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void seek(long r5, long r7) {
        /*
            r4 = this;
            androidx.media3.common.util.TimestampAdjuster r5 = r4.timestampAdjuster
            long r5 = r5.getTimestampOffsetUs()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r6 = 0
            if (r5 != 0) goto L12
            r5 = 1
            goto L13
        L12:
            r5 = r6
        L13:
            if (r5 != 0) goto L2a
            androidx.media3.common.util.TimestampAdjuster r5 = r4.timestampAdjuster
            long r2 = r5.getFirstSampleTimestampUs()
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            r0 = 0
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 == 0) goto L31
            goto L2c
        L2a:
            if (r5 == 0) goto L31
        L2c:
            androidx.media3.common.util.TimestampAdjuster r5 = r4.timestampAdjuster
            r5.reset(r7)
        L31:
            androidx.media3.extractor.ts.PsBinarySearchSeeker r5 = r4.psBinarySearchSeeker
            if (r5 == 0) goto L38
            r5.setSeekTargetUs(r7)
        L38:
            android.util.SparseArray<androidx.media3.extractor.ts.PsExtractor$PesReader> r5 = r4.psPayloadReaders
            int r5 = r5.size()
            if (r6 >= r5) goto L4e
            android.util.SparseArray<androidx.media3.extractor.ts.PsExtractor$PesReader> r5 = r4.psPayloadReaders
            java.lang.Object r5 = r5.valueAt(r6)
            androidx.media3.extractor.ts.PsExtractor$PesReader r5 = (androidx.media3.extractor.ts.PsExtractor.PesReader) r5
            r5.seek()
            int r6 = r6 + 1
            goto L38
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.PsExtractor.seek(long, long):void");
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        ElementaryStreamReader elementaryStreamReader;
        Assertions.checkStateNotNull(this.output);
        long length = extractorInput.getLength();
        int i = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i != 0 && !this.durationReader.isDurationReadFinished()) {
            return this.durationReader.readDuration(extractorInput, positionHolder);
        }
        maybeOutputSeekMap(length);
        PsBinarySearchSeeker psBinarySearchSeeker = this.psBinarySearchSeeker;
        if (psBinarySearchSeeker != null && psBinarySearchSeeker.isSeeking()) {
            return this.psBinarySearchSeeker.handlePendingSeek(extractorInput, positionHolder);
        }
        extractorInput.resetPeekPosition();
        long peekPosition = i != 0 ? length - extractorInput.getPeekPosition() : -1L;
        if ((peekPosition == -1 || peekPosition >= 4) && extractorInput.peekFully(this.psPacketBuffer.getData(), 0, 4, true)) {
            this.psPacketBuffer.setPosition(0);
            int readInt = this.psPacketBuffer.readInt();
            if (readInt == 441) {
                return -1;
            }
            if (readInt == 442) {
                extractorInput.peekFully(this.psPacketBuffer.getData(), 0, 10);
                this.psPacketBuffer.setPosition(9);
                extractorInput.skipFully((this.psPacketBuffer.readUnsignedByte() & 7) + 14);
                return 0;
            } else if (readInt == 443) {
                extractorInput.peekFully(this.psPacketBuffer.getData(), 0, 2);
                this.psPacketBuffer.setPosition(0);
                extractorInput.skipFully(this.psPacketBuffer.readUnsignedShort() + 6);
                return 0;
            } else if (((readInt & (-256)) >> 8) != 1) {
                extractorInput.skipFully(1);
                return 0;
            } else {
                int i2 = readInt & PrivateKeyType.INVALID;
                PesReader pesReader = this.psPayloadReaders.get(i2);
                if (!this.foundAllTracks) {
                    if (pesReader == null) {
                        if (i2 == 189) {
                            elementaryStreamReader = new Ac3Reader();
                            this.foundAudioTrack = true;
                            this.lastTrackPosition = extractorInput.getPosition();
                        } else if ((readInt & 224) == 192) {
                            elementaryStreamReader = new MpegAudioReader();
                            this.foundAudioTrack = true;
                            this.lastTrackPosition = extractorInput.getPosition();
                        } else if ((readInt & 240) == 224) {
                            elementaryStreamReader = new H262Reader();
                            this.foundVideoTrack = true;
                            this.lastTrackPosition = extractorInput.getPosition();
                        } else {
                            elementaryStreamReader = null;
                        }
                        if (elementaryStreamReader != null) {
                            elementaryStreamReader.createTracks(this.output, new TsPayloadReader.TrackIdGenerator(i2, JSONzip.end));
                            pesReader = new PesReader(elementaryStreamReader, this.timestampAdjuster);
                            this.psPayloadReaders.put(i2, pesReader);
                        }
                    }
                    if (extractorInput.getPosition() > ((this.foundAudioTrack && this.foundVideoTrack) ? this.lastTrackPosition + PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                        this.foundAllTracks = true;
                        this.output.endTracks();
                    }
                }
                extractorInput.peekFully(this.psPacketBuffer.getData(), 0, 2);
                this.psPacketBuffer.setPosition(0);
                int readUnsignedShort = this.psPacketBuffer.readUnsignedShort() + 6;
                if (pesReader == null) {
                    extractorInput.skipFully(readUnsignedShort);
                } else {
                    this.psPacketBuffer.reset(readUnsignedShort);
                    extractorInput.readFully(this.psPacketBuffer.getData(), 0, readUnsignedShort);
                    this.psPacketBuffer.setPosition(6);
                    pesReader.consume(this.psPacketBuffer);
                    ParsableByteArray parsableByteArray = this.psPacketBuffer;
                    parsableByteArray.setLimit(parsableByteArray.capacity());
                }
                return 0;
            }
        }
        return -1;
    }

    @RequiresNonNull({"output"})
    private void maybeOutputSeekMap(long j) {
        if (this.hasOutputSeekMap) {
            return;
        }
        this.hasOutputSeekMap = true;
        if (this.durationReader.getDurationUs() != -9223372036854775807L) {
            PsBinarySearchSeeker psBinarySearchSeeker = new PsBinarySearchSeeker(this.durationReader.getScrTimestampAdjuster(), this.durationReader.getDurationUs(), j);
            this.psBinarySearchSeeker = psBinarySearchSeeker;
            this.output.seekMap(psBinarySearchSeeker.getSeekMap());
            return;
        }
        this.output.seekMap(new SeekMap.Unseekable(this.durationReader.getDurationUs()));
    }

    /* loaded from: classes5.dex */
    static final class PesReader {
        private boolean dtsFlag;
        private int extendedHeaderLength;
        private final ElementaryStreamReader pesPayloadReader;
        private final ParsableBitArray pesScratch = new ParsableBitArray(new byte[64]);
        private boolean ptsFlag;
        private boolean seenFirstDts;
        private long timeUs;
        private final TimestampAdjuster timestampAdjuster;

        public PesReader(ElementaryStreamReader elementaryStreamReader, TimestampAdjuster timestampAdjuster) {
            this.pesPayloadReader = elementaryStreamReader;
            this.timestampAdjuster = timestampAdjuster;
        }

        public void seek() {
            this.seenFirstDts = false;
            this.pesPayloadReader.seek();
        }

        public void consume(ParsableByteArray parsableByteArray) {
            parsableByteArray.readBytes(this.pesScratch.data, 0, 3);
            this.pesScratch.setPosition(0);
            parseHeader();
            parsableByteArray.readBytes(this.pesScratch.data, 0, this.extendedHeaderLength);
            this.pesScratch.setPosition(0);
            parseHeaderExtension();
            this.pesPayloadReader.packetStarted(this.timeUs, 4);
            this.pesPayloadReader.consume(parsableByteArray);
            this.pesPayloadReader.packetFinished(false);
        }

        private void parseHeader() {
            this.pesScratch.skipBits(8);
            this.ptsFlag = this.pesScratch.readBit();
            this.dtsFlag = this.pesScratch.readBit();
            this.pesScratch.skipBits(6);
            this.extendedHeaderLength = this.pesScratch.readBits(8);
        }

        private void parseHeaderExtension() {
            char c;
            this.timeUs = 0L;
            if (this.ptsFlag) {
                this.pesScratch.skipBits(4);
                long readBits = this.pesScratch.readBits(3);
                this.pesScratch.skipBits(1);
                long readBits2 = this.pesScratch.readBits(15) << 15;
                this.pesScratch.skipBits(1);
                long readBits3 = this.pesScratch.readBits(15);
                this.pesScratch.skipBits(1);
                if (this.seenFirstDts || !this.dtsFlag) {
                    c = 30;
                } else {
                    this.pesScratch.skipBits(4);
                    this.pesScratch.skipBits(1);
                    long readBits4 = this.pesScratch.readBits(15) << 15;
                    this.pesScratch.skipBits(1);
                    long readBits5 = this.pesScratch.readBits(15);
                    this.pesScratch.skipBits(1);
                    c = 30;
                    this.timestampAdjuster.adjustTsTimestamp((this.pesScratch.readBits(3) << 30) | readBits4 | readBits5);
                    this.seenFirstDts = true;
                }
                this.timeUs = this.timestampAdjuster.adjustTsTimestamp((readBits << c) | readBits2 | readBits3);
            }
        }
    }
}
