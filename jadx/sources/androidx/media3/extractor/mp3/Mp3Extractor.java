package androidx.media3.extractor.mp3;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DummyTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.Id3Peeker;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.mp3.Seeker;
import java.io.EOFException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes5.dex */
public final class Mp3Extractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.mp3.Mp3Extractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            Extractor[] lambda$static$0;
            lambda$static$0 = Mp3Extractor.lambda$static$0();
            return lambda$static$0;
        }
    };
    private static final Id3Decoder.FramePredicate REQUIRED_ID3_FRAME_PREDICATE = new Id3Decoder.FramePredicate() { // from class: androidx.media3.extractor.mp3.Mp3Extractor$$ExternalSyntheticLambda1
        @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
        public final boolean evaluate(int i, int i2, int i3, int i4, int i5) {
            boolean lambda$static$1;
            lambda$static$1 = Mp3Extractor.lambda$static$1(i, i2, i3, i4, i5);
            return lambda$static$1;
        }
    };
    private long basisTimeUs;
    private TrackOutput currentTrackOutput;
    private boolean disableSeeking;
    private ExtractorOutput extractorOutput;
    private long firstSamplePosition;
    private final int flags;
    private final long forcedFirstSampleTimestampUs;
    private final GaplessInfoHolder gaplessInfoHolder;
    private final Id3Peeker id3Peeker;
    private boolean isSeekInProgress;
    private Metadata metadata;
    private TrackOutput realTrackOutput;
    private int sampleBytesRemaining;
    private long samplesRead;
    private final ParsableByteArray scratch;
    private long seekTimeUs;
    private Seeker seeker;
    private final TrackOutput skippingTrackOutput;
    private final MpegAudioUtil.Header synchronizedHeader;
    private int synchronizedHeaderData;

    private static boolean headersMatch(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$1(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    public void disableSeeking() {
        this.disableSeeking = true;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new Mp3Extractor()};
    }

    public Mp3Extractor() {
        this(0);
    }

    public Mp3Extractor(int i) {
        this(i, -9223372036854775807L);
    }

    public Mp3Extractor(int i, long j) {
        this.flags = (i & 2) != 0 ? i | 1 : i;
        this.forcedFirstSampleTimestampUs = j;
        this.scratch = new ParsableByteArray(10);
        this.synchronizedHeader = new MpegAudioUtil.Header();
        this.gaplessInfoHolder = new GaplessInfoHolder();
        this.basisTimeUs = -9223372036854775807L;
        this.id3Peeker = new Id3Peeker();
        DummyTrackOutput dummyTrackOutput = new DummyTrackOutput();
        this.skippingTrackOutput = dummyTrackOutput;
        this.currentTrackOutput = dummyTrackOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        return synchronize(extractorInput, true);
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        TrackOutput track = extractorOutput.track(0, 1);
        this.realTrackOutput = track;
        this.currentTrackOutput = track;
        this.extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        this.synchronizedHeaderData = 0;
        this.basisTimeUs = -9223372036854775807L;
        this.samplesRead = 0L;
        this.sampleBytesRemaining = 0;
        this.seekTimeUs = j2;
        Seeker seeker = this.seeker;
        if (!(seeker instanceof IndexSeeker) || ((IndexSeeker) seeker).isTimeUsInIndex(j2)) {
            return;
        }
        this.isSeekInProgress = true;
        this.currentTrackOutput = this.skippingTrackOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        assertInitialized();
        int readInternal = readInternal(extractorInput);
        if (readInternal == -1 && (this.seeker instanceof IndexSeeker)) {
            long computeTimeUs = computeTimeUs(this.samplesRead);
            if (this.seeker.getDurationUs() != computeTimeUs) {
                ((IndexSeeker) this.seeker).setDurationUs(computeTimeUs);
                this.extractorOutput.seekMap(this.seeker);
            }
        }
        return readInternal;
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private int readInternal(ExtractorInput extractorInput) {
        if (this.synchronizedHeaderData == 0) {
            try {
                synchronize(extractorInput, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.seeker == null) {
            Seeker computeSeeker = computeSeeker(extractorInput);
            this.seeker = computeSeeker;
            this.extractorOutput.seekMap(computeSeeker);
            this.currentTrackOutput.format(new Format.Builder().setSampleMimeType(this.synchronizedHeader.mimeType).setMaxInputSize(4096).setChannelCount(this.synchronizedHeader.channels).setSampleRate(this.synchronizedHeader.sampleRate).setEncoderDelay(this.gaplessInfoHolder.encoderDelay).setEncoderPadding(this.gaplessInfoHolder.encoderPadding).setMetadata((this.flags & 8) != 0 ? null : this.metadata).build());
            this.firstSamplePosition = extractorInput.getPosition();
        } else if (this.firstSamplePosition != 0) {
            long position = extractorInput.getPosition();
            long j = this.firstSamplePosition;
            if (position < j) {
                extractorInput.skipFully((int) (j - position));
            }
        }
        return readSample(extractorInput);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    private int readSample(ExtractorInput extractorInput) {
        MpegAudioUtil.Header header;
        if (this.sampleBytesRemaining == 0) {
            extractorInput.resetPeekPosition();
            if (peekEndOfStreamOrHeader(extractorInput)) {
                return -1;
            }
            this.scratch.setPosition(0);
            int readInt = this.scratch.readInt();
            if (!headersMatch(readInt, this.synchronizedHeaderData) || MpegAudioUtil.getFrameSize(readInt) == -1) {
                extractorInput.skipFully(1);
                this.synchronizedHeaderData = 0;
                return 0;
            }
            this.synchronizedHeader.setForHeaderData(readInt);
            if (this.basisTimeUs == -9223372036854775807L) {
                this.basisTimeUs = this.seeker.getTimeUs(extractorInput.getPosition());
                if (this.forcedFirstSampleTimestampUs != -9223372036854775807L) {
                    this.basisTimeUs += this.forcedFirstSampleTimestampUs - this.seeker.getTimeUs(0L);
                }
            }
            this.sampleBytesRemaining = this.synchronizedHeader.frameSize;
            Seeker seeker = this.seeker;
            if (seeker instanceof IndexSeeker) {
                IndexSeeker indexSeeker = (IndexSeeker) seeker;
                indexSeeker.maybeAddSeekPoint(computeTimeUs(this.samplesRead + header.samplesPerFrame), extractorInput.getPosition() + this.synchronizedHeader.frameSize);
                if (this.isSeekInProgress && indexSeeker.isTimeUsInIndex(this.seekTimeUs)) {
                    this.isSeekInProgress = false;
                    this.currentTrackOutput = this.realTrackOutput;
                }
            }
        }
        int sampleData = this.currentTrackOutput.sampleData((DataReader) extractorInput, this.sampleBytesRemaining, true);
        if (sampleData == -1) {
            return -1;
        }
        int i = this.sampleBytesRemaining - sampleData;
        this.sampleBytesRemaining = i;
        if (i > 0) {
            return 0;
        }
        this.currentTrackOutput.sampleMetadata(computeTimeUs(this.samplesRead), 1, this.synchronizedHeader.frameSize, 0, null);
        this.samplesRead += this.synchronizedHeader.samplesPerFrame;
        this.sampleBytesRemaining = 0;
        return 0;
    }

    private long computeTimeUs(long j) {
        return this.basisTimeUs + ((j * 1000000) / this.synchronizedHeader.sampleRate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
        if (r13 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009a, code lost:
        r12.skipFully(r1 + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
        r12.resetPeekPosition();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a2, code lost:
        r11.synchronizedHeaderData = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean synchronize(androidx.media3.extractor.ExtractorInput r12, boolean r13) {
        /*
            r11 = this;
            if (r13 == 0) goto L6
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L8
        L6:
            r0 = 131072(0x20000, float:1.83671E-40)
        L8:
            r12.resetPeekPosition()
            long r1 = r12.getPosition()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L3b
            int r1 = r11.flags
            r1 = r1 & 8
            if (r1 != 0) goto L1f
            r1 = r2
            goto L21
        L1f:
            androidx.media3.extractor.metadata.id3.Id3Decoder$FramePredicate r1 = androidx.media3.extractor.mp3.Mp3Extractor.REQUIRED_ID3_FRAME_PREDICATE
        L21:
            androidx.media3.extractor.Id3Peeker r4 = r11.id3Peeker
            androidx.media3.common.Metadata r1 = r4.peekId3Data(r12, r1)
            r11.metadata = r1
            if (r1 == 0) goto L30
            androidx.media3.extractor.GaplessInfoHolder r4 = r11.gaplessInfoHolder
            r4.setFromMetadata(r1)
        L30:
            long r4 = r12.getPeekPosition()
            int r1 = (int) r4
            if (r13 != 0) goto L3c
            r12.skipFully(r1)
            goto L3c
        L3b:
            r1 = r3
        L3c:
            r4 = r3
            r5 = r4
            r6 = r5
        L3f:
            boolean r7 = r11.peekEndOfStreamOrHeader(r12)
            r8 = 1
            if (r7 == 0) goto L4f
            if (r5 <= 0) goto L49
            goto L98
        L49:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L4f:
            androidx.media3.common.util.ParsableByteArray r7 = r11.scratch
            r7.setPosition(r3)
            androidx.media3.common.util.ParsableByteArray r7 = r11.scratch
            int r7 = r7.readInt()
            if (r4 == 0) goto L63
            long r9 = (long) r4
            boolean r9 = headersMatch(r7, r9)
            if (r9 == 0) goto L6a
        L63:
            int r9 = androidx.media3.extractor.MpegAudioUtil.getFrameSize(r7)
            r10 = -1
            if (r9 != r10) goto L8a
        L6a:
            int r4 = r6 + 1
            if (r6 != r0) goto L78
            if (r13 == 0) goto L71
            return r3
        L71:
            java.lang.String r12 = "Searched too many bytes."
            androidx.media3.common.ParserException r12 = androidx.media3.common.ParserException.createForMalformedContainer(r12, r2)
            throw r12
        L78:
            if (r13 == 0) goto L83
            r12.resetPeekPosition()
            int r5 = r1 + r4
            r12.advancePeekPosition(r5)
            goto L86
        L83:
            r12.skipFully(r8)
        L86:
            r5 = r3
            r6 = r4
            r4 = r5
            goto L3f
        L8a:
            int r5 = r5 + 1
            if (r5 != r8) goto L95
            androidx.media3.extractor.MpegAudioUtil$Header r4 = r11.synchronizedHeader
            r4.setForHeaderData(r7)
            r4 = r7
            goto La5
        L95:
            r7 = 4
            if (r5 != r7) goto La5
        L98:
            if (r13 == 0) goto L9f
            int r1 = r1 + r6
            r12.skipFully(r1)
            goto La2
        L9f:
            r12.resetPeekPosition()
        La2:
            r11.synchronizedHeaderData = r4
            return r8
        La5:
            int r9 = r9 + (-4)
            r12.advancePeekPosition(r9)
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp3.Mp3Extractor.synchronize(androidx.media3.extractor.ExtractorInput, boolean):boolean");
    }

    private boolean peekEndOfStreamOrHeader(ExtractorInput extractorInput) {
        Seeker seeker = this.seeker;
        if (seeker != null) {
            long dataEndPosition = seeker.getDataEndPosition();
            if (dataEndPosition != -1 && extractorInput.getPeekPosition() > dataEndPosition - 4) {
                return true;
            }
        }
        try {
            return !extractorInput.peekFully(this.scratch.getData(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private Seeker computeSeeker(ExtractorInput extractorInput) {
        long id3TlenUs;
        long j;
        Seeker maybeReadSeekFrame = maybeReadSeekFrame(extractorInput);
        MlltSeeker maybeHandleSeekMetadata = maybeHandleSeekMetadata(this.metadata, extractorInput.getPosition());
        if (this.disableSeeking) {
            return new Seeker.UnseekableSeeker();
        }
        if ((this.flags & 4) != 0) {
            if (maybeHandleSeekMetadata != null) {
                id3TlenUs = maybeHandleSeekMetadata.getDurationUs();
                j = maybeHandleSeekMetadata.getDataEndPosition();
            } else if (maybeReadSeekFrame != null) {
                id3TlenUs = maybeReadSeekFrame.getDurationUs();
                j = maybeReadSeekFrame.getDataEndPosition();
            } else {
                id3TlenUs = getId3TlenUs(this.metadata);
                j = -1;
            }
            maybeReadSeekFrame = new IndexSeeker(id3TlenUs, extractorInput.getPosition(), j);
        } else if (maybeHandleSeekMetadata != null) {
            maybeReadSeekFrame = maybeHandleSeekMetadata;
        } else if (maybeReadSeekFrame == null) {
            maybeReadSeekFrame = null;
        }
        if (maybeReadSeekFrame == null || !(maybeReadSeekFrame.isSeekable() || (this.flags & 1) == 0)) {
            return getConstantBitrateSeeker(extractorInput, (this.flags & 2) != 0);
        }
        return maybeReadSeekFrame;
    }

    private Seeker maybeReadSeekFrame(ExtractorInput extractorInput) {
        int i;
        ParsableByteArray parsableByteArray = new ParsableByteArray(this.synchronizedHeader.frameSize);
        extractorInput.peekFully(parsableByteArray.getData(), 0, this.synchronizedHeader.frameSize);
        MpegAudioUtil.Header header = this.synchronizedHeader;
        if ((header.version & 1) != 0) {
            if (header.channels != 1) {
                i = 36;
            }
            i = 21;
        } else {
            if (header.channels == 1) {
                i = 13;
            }
            i = 21;
        }
        int i2 = i;
        int seekFrameHeader = getSeekFrameHeader(parsableByteArray, i2);
        if (seekFrameHeader != 1483304551 && seekFrameHeader != 1231971951) {
            if (seekFrameHeader == 1447187017) {
                VbriSeeker create = VbriSeeker.create(extractorInput.getLength(), extractorInput.getPosition(), this.synchronizedHeader, parsableByteArray);
                extractorInput.skipFully(this.synchronizedHeader.frameSize);
                return create;
            }
            extractorInput.resetPeekPosition();
            return null;
        }
        XingSeeker create2 = XingSeeker.create(extractorInput.getLength(), extractorInput.getPosition(), this.synchronizedHeader, parsableByteArray);
        if (create2 != null && !this.gaplessInfoHolder.hasGaplessInfo()) {
            extractorInput.resetPeekPosition();
            extractorInput.advancePeekPosition(i2 + 141);
            extractorInput.peekFully(this.scratch.getData(), 0, 3);
            this.scratch.setPosition(0);
            this.gaplessInfoHolder.setFromXingHeaderValue(this.scratch.readUnsignedInt24());
        }
        extractorInput.skipFully(this.synchronizedHeader.frameSize);
        return (create2 == null || create2.isSeekable() || seekFrameHeader != 1231971951) ? create2 : getConstantBitrateSeeker(extractorInput, false);
    }

    private Seeker getConstantBitrateSeeker(ExtractorInput extractorInput, boolean z) {
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        this.scratch.setPosition(0);
        this.synchronizedHeader.setForHeaderData(this.scratch.readInt());
        return new ConstantBitrateSeeker(extractorInput.getLength(), extractorInput.getPosition(), this.synchronizedHeader, z);
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    private void assertInitialized() {
        Assertions.checkStateNotNull(this.realTrackOutput);
        Util.castNonNull(this.extractorOutput);
    }

    private static int getSeekFrameHeader(ParsableByteArray parsableByteArray, int i) {
        if (parsableByteArray.limit() >= i + 4) {
            parsableByteArray.setPosition(i);
            int readInt = parsableByteArray.readInt();
            if (readInt == 1483304551 || readInt == 1231971951) {
                return readInt;
            }
        }
        if (parsableByteArray.limit() >= 40) {
            parsableByteArray.setPosition(36);
            return parsableByteArray.readInt() == 1447187017 ? 1447187017 : 0;
        }
        return 0;
    }

    private static MlltSeeker maybeHandleSeekMetadata(Metadata metadata, long j) {
        if (metadata != null) {
            int length = metadata.length();
            for (int i = 0; i < length; i++) {
                Metadata.Entry entry = metadata.get(i);
                if (entry instanceof MlltFrame) {
                    return MlltSeeker.create(j, (MlltFrame) entry, getId3TlenUs(metadata));
                }
            }
            return null;
        }
        return null;
    }

    private static long getId3TlenUs(Metadata metadata) {
        if (metadata != null) {
            int length = metadata.length();
            for (int i = 0; i < length; i++) {
                Metadata.Entry entry = metadata.get(i);
                if (entry instanceof TextInformationFrame) {
                    TextInformationFrame textInformationFrame = (TextInformationFrame) entry;
                    if (textInformationFrame.id.equals("TLEN")) {
                        return Util.msToUs(Long.parseLong(textInformationFrame.values.get(0)));
                    }
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }
}
