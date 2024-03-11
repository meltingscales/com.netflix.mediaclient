package androidx.media3.extractor.flv;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes5.dex */
public final class FlvExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.flv.FlvExtractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            Extractor[] lambda$static$0;
            lambda$static$0 = FlvExtractor.lambda$static$0();
            return lambda$static$0;
        }
    };
    private AudioTagPayloadReader audioReader;
    private int bytesToNextTagHeader;
    private ExtractorOutput extractorOutput;
    private long mediaTagTimestampOffsetUs;
    private boolean outputFirstSample;
    private boolean outputSeekMap;
    private int tagDataSize;
    private long tagTimestampUs;
    private int tagType;
    private VideoTagPayloadReader videoReader;
    private final ParsableByteArray scratch = new ParsableByteArray(4);
    private final ParsableByteArray headerBuffer = new ParsableByteArray(9);
    private final ParsableByteArray tagHeaderBuffer = new ParsableByteArray(11);
    private final ParsableByteArray tagData = new ParsableByteArray();
    private final ScriptTagPayloadReader metadataReader = new ScriptTagPayloadReader();
    private int state = 1;

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        if (j == 0) {
            this.state = 1;
            this.outputFirstSample = false;
        } else {
            this.state = 3;
        }
        this.bytesToNextTagHeader = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new FlvExtractor()};
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        extractorInput.peekFully(this.scratch.getData(), 0, 3);
        this.scratch.setPosition(0);
        if (this.scratch.readUnsignedInt24() != 4607062) {
            return false;
        }
        extractorInput.peekFully(this.scratch.getData(), 0, 2);
        this.scratch.setPosition(0);
        if ((this.scratch.readUnsignedShort() & 250) != 0) {
            return false;
        }
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        this.scratch.setPosition(0);
        int readInt = this.scratch.readInt();
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(readInt);
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        this.scratch.setPosition(0);
        return this.scratch.readInt() == 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        Assertions.checkStateNotNull(this.extractorOutput);
        while (true) {
            int i = this.state;
            if (i != 1) {
                if (i == 2) {
                    skipToTagHeader(extractorInput);
                } else if (i != 3) {
                    if (i == 4) {
                        if (readTagData(extractorInput)) {
                            return 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (!readTagHeader(extractorInput)) {
                    return -1;
                }
            } else if (!readFlvHeader(extractorInput)) {
                return -1;
            }
        }
    }

    @RequiresNonNull({"extractorOutput"})
    private boolean readFlvHeader(ExtractorInput extractorInput) {
        if (extractorInput.readFully(this.headerBuffer.getData(), 0, 9, true)) {
            this.headerBuffer.setPosition(0);
            this.headerBuffer.skipBytes(4);
            int readUnsignedByte = this.headerBuffer.readUnsignedByte();
            boolean z = (readUnsignedByte & 4) != 0;
            boolean z2 = (readUnsignedByte & 1) != 0;
            if (z && this.audioReader == null) {
                this.audioReader = new AudioTagPayloadReader(this.extractorOutput.track(8, 1));
            }
            if (z2 && this.videoReader == null) {
                this.videoReader = new VideoTagPayloadReader(this.extractorOutput.track(9, 2));
            }
            this.extractorOutput.endTracks();
            this.bytesToNextTagHeader = this.headerBuffer.readInt() - 5;
            this.state = 2;
            return true;
        }
        return false;
    }

    private void skipToTagHeader(ExtractorInput extractorInput) {
        extractorInput.skipFully(this.bytesToNextTagHeader);
        this.bytesToNextTagHeader = 0;
        this.state = 3;
    }

    private boolean readTagHeader(ExtractorInput extractorInput) {
        if (extractorInput.readFully(this.tagHeaderBuffer.getData(), 0, 11, true)) {
            this.tagHeaderBuffer.setPosition(0);
            this.tagType = this.tagHeaderBuffer.readUnsignedByte();
            this.tagDataSize = this.tagHeaderBuffer.readUnsignedInt24();
            this.tagTimestampUs = this.tagHeaderBuffer.readUnsignedInt24();
            this.tagTimestampUs = ((this.tagHeaderBuffer.readUnsignedByte() << 24) | this.tagTimestampUs) * 1000;
            this.tagHeaderBuffer.skipBytes(3);
            this.state = 4;
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean readTagData(androidx.media3.extractor.ExtractorInput r10) {
        /*
            r9 = this;
            long r0 = r9.getCurrentTimestampUs()
            int r2 = r9.tagType
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L22
            androidx.media3.extractor.flv.AudioTagPayloadReader r3 = r9.audioReader
            if (r3 == 0) goto L22
            r9.ensureReadyForMediaOutput()
            androidx.media3.extractor.flv.AudioTagPayloadReader r2 = r9.audioReader
            androidx.media3.common.util.ParsableByteArray r10 = r9.prepareTagData(r10)
            boolean r10 = r2.consume(r10, r0)
            goto L6c
        L22:
            r3 = 9
            if (r2 != r3) goto L38
            androidx.media3.extractor.flv.VideoTagPayloadReader r3 = r9.videoReader
            if (r3 == 0) goto L38
            r9.ensureReadyForMediaOutput()
            androidx.media3.extractor.flv.VideoTagPayloadReader r2 = r9.videoReader
            androidx.media3.common.util.ParsableByteArray r10 = r9.prepareTagData(r10)
            boolean r10 = r2.consume(r10, r0)
            goto L6c
        L38:
            r3 = 18
            if (r2 != r3) goto L6e
            boolean r2 = r9.outputSeekMap
            if (r2 != 0) goto L6e
            androidx.media3.extractor.flv.ScriptTagPayloadReader r2 = r9.metadataReader
            androidx.media3.common.util.ParsableByteArray r10 = r9.prepareTagData(r10)
            boolean r10 = r2.consume(r10, r0)
            androidx.media3.extractor.flv.ScriptTagPayloadReader r0 = r9.metadataReader
            long r0 = r0.getDurationUs()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L6c
            androidx.media3.extractor.ExtractorOutput r2 = r9.extractorOutput
            androidx.media3.extractor.flv.ScriptTagPayloadReader r3 = r9.metadataReader
            long[] r3 = r3.getKeyFrameTagPositions()
            androidx.media3.extractor.flv.ScriptTagPayloadReader r7 = r9.metadataReader
            androidx.media3.extractor.IndexSeekMap r8 = new androidx.media3.extractor.IndexSeekMap
            long[] r7 = r7.getKeyFrameTimesUs()
            r8.<init>(r3, r7, r0)
            r2.seekMap(r8)
            r9.outputSeekMap = r6
        L6c:
            r0 = r6
            goto L75
        L6e:
            int r0 = r9.tagDataSize
            r10.skipFully(r0)
            r10 = 0
            r0 = r10
        L75:
            boolean r1 = r9.outputFirstSample
            if (r1 != 0) goto L8f
            if (r10 == 0) goto L8f
            r9.outputFirstSample = r6
            androidx.media3.extractor.flv.ScriptTagPayloadReader r10 = r9.metadataReader
            long r1 = r10.getDurationUs()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L8b
            long r1 = r9.tagTimestampUs
            long r1 = -r1
            goto L8d
        L8b:
            r1 = 0
        L8d:
            r9.mediaTagTimestampOffsetUs = r1
        L8f:
            r10 = 4
            r9.bytesToNextTagHeader = r10
            r10 = 2
            r9.state = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.flv.FlvExtractor.readTagData(androidx.media3.extractor.ExtractorInput):boolean");
    }

    private ParsableByteArray prepareTagData(ExtractorInput extractorInput) {
        if (this.tagDataSize > this.tagData.capacity()) {
            ParsableByteArray parsableByteArray = this.tagData;
            parsableByteArray.reset(new byte[Math.max(parsableByteArray.capacity() * 2, this.tagDataSize)], 0);
        } else {
            this.tagData.setPosition(0);
        }
        this.tagData.setLimit(this.tagDataSize);
        extractorInput.readFully(this.tagData.getData(), 0, this.tagDataSize);
        return this.tagData;
    }

    @RequiresNonNull({"extractorOutput"})
    private void ensureReadyForMediaOutput() {
        if (this.outputSeekMap) {
            return;
        }
        this.extractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
        this.outputSeekMap = true;
    }

    private long getCurrentTimestampUs() {
        if (this.outputFirstSample) {
            return this.mediaTagTimestampOffsetUs + this.tagTimestampUs;
        }
        if (this.metadataReader.getDurationUs() == -9223372036854775807L) {
            return 0L;
        }
        return this.tagTimestampUs;
    }
}
