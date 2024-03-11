package androidx.media3.extractor.text;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleParser;
import java.io.EOFException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class SubtitleTranscodingTrackOutput implements TrackOutput {
    private Format currentFormat;
    private SubtitleParser currentSubtitleParser;
    private final TrackOutput delegate;
    private final SubtitleParser.Factory subtitleParserFactory;
    private final CueEncoder cueEncoder = new CueEncoder();
    private int sampleDataStart = 0;
    private int sampleDataEnd = 0;
    private byte[] sampleData = Util.EMPTY_BYTE_ARRAY;
    private final ParsableByteArray parsableScratch = new ParsableByteArray();

    public SubtitleTranscodingTrackOutput(TrackOutput trackOutput, SubtitleParser.Factory factory) {
        this.delegate = trackOutput;
        this.subtitleParserFactory = factory;
    }

    public void resetSubtitleParser() {
        SubtitleParser subtitleParser = this.currentSubtitleParser;
        if (subtitleParser != null) {
            subtitleParser.reset();
        }
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void format(Format format) {
        Assertions.checkNotNull(format.sampleMimeType);
        Assertions.checkArgument(MimeTypes.getTrackType(format.sampleMimeType) == 3);
        if (!format.equals(this.currentFormat)) {
            this.currentFormat = format;
            this.currentSubtitleParser = this.subtitleParserFactory.supportsFormat(format) ? this.subtitleParserFactory.create(format) : null;
        }
        if (this.currentSubtitleParser == null) {
            this.delegate.format(format);
        } else {
            this.delegate.format(format.buildUpon().setSampleMimeType("application/x-media3-cues").setCodecs(format.sampleMimeType).setSubsampleOffsetUs(Long.MAX_VALUE).setCueReplacementBehavior(this.subtitleParserFactory.getCueReplacementBehavior(format)).build());
        }
    }

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(DataReader dataReader, int i, boolean z, int i2) {
        if (this.currentSubtitleParser == null) {
            return this.delegate.sampleData(dataReader, i, z, i2);
        }
        ensureSampleDataCapacity(i);
        int read = dataReader.read(this.sampleData, this.sampleDataEnd, i);
        if (read != -1) {
            this.sampleDataEnd += read;
            return read;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(ParsableByteArray parsableByteArray, int i, int i2) {
        if (this.currentSubtitleParser == null) {
            this.delegate.sampleData(parsableByteArray, i, i2);
            return;
        }
        ensureSampleDataCapacity(i);
        parsableByteArray.readBytes(this.sampleData, this.sampleDataEnd, i);
        this.sampleDataEnd += i;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleMetadata(final long j, final int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
        if (this.currentSubtitleParser == null) {
            this.delegate.sampleMetadata(j, i, i2, i3, cryptoData);
            return;
        }
        Assertions.checkArgument(cryptoData == null, "DRM on subtitles is not supported");
        int i4 = (this.sampleDataEnd - i3) - i2;
        this.currentSubtitleParser.parse(this.sampleData, i4, i2, SubtitleParser.OutputOptions.allCues(), new Consumer() { // from class: androidx.media3.extractor.text.SubtitleTranscodingTrackOutput$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                SubtitleTranscodingTrackOutput.this.lambda$sampleMetadata$0(j, i, (CuesWithTiming) obj);
            }
        });
        this.sampleDataStart = i4 + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: outputSample */
    public void lambda$sampleMetadata$0(CuesWithTiming cuesWithTiming, long j, int i) {
        Assertions.checkStateNotNull(this.currentFormat);
        byte[] encode = this.cueEncoder.encode(cuesWithTiming.cues, cuesWithTiming.durationUs);
        this.parsableScratch.reset(encode);
        this.delegate.sampleData(this.parsableScratch, encode.length);
        long j2 = cuesWithTiming.startTimeUs;
        if (j2 == -9223372036854775807L) {
            Assertions.checkState(this.currentFormat.subsampleOffsetUs == Long.MAX_VALUE);
        } else {
            long j3 = this.currentFormat.subsampleOffsetUs;
            j = j3 == Long.MAX_VALUE ? j + j2 : j2 + j3;
        }
        this.delegate.sampleMetadata(j, i & Integer.MAX_VALUE, encode.length, 0, null);
    }

    private void ensureSampleDataCapacity(int i) {
        int length = this.sampleData.length;
        int i2 = this.sampleDataEnd;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.sampleDataStart;
        int max = Math.max(i3 * 2, i2 + i);
        byte[] bArr = this.sampleData;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.sampleDataStart, bArr2, 0, i3);
        this.sampleDataStart = 0;
        this.sampleDataEnd = i3;
        this.sampleData = bArr2;
    }
}
