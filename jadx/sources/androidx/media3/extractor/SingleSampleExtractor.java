package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes5.dex */
public final class SingleSampleExtractor implements Extractor {
    private final String containerMimeType;
    private ExtractorOutput extractorOutput;
    private final int fileSignature;
    private final int fileSignatureLength;
    private int size;
    private int state;
    private TrackOutput trackOutput;

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        if (j == 0 || this.state == 1) {
            this.state = 1;
            this.size = 0;
        }
    }

    public SingleSampleExtractor(int i, int i2, String str) {
        this.fileSignature = i;
        this.fileSignatureLength = i2;
        this.containerMimeType = str;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        Assertions.checkState((this.fileSignature == -1 || this.fileSignatureLength == -1) ? false : true);
        ParsableByteArray parsableByteArray = new ParsableByteArray(this.fileSignatureLength);
        extractorInput.peekFully(parsableByteArray.getData(), 0, this.fileSignatureLength);
        return parsableByteArray.readUnsignedShort() == this.fileSignature;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        outputImageTrackAndSeekMap(this.containerMimeType);
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        int i = this.state;
        if (i == 1) {
            readSegment(extractorInput);
            return 0;
        } else if (i == 2) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    private void readSegment(ExtractorInput extractorInput) {
        int sampleData = ((TrackOutput) Assertions.checkNotNull(this.trackOutput)).sampleData((DataReader) extractorInput, 1024, true);
        if (sampleData != -1) {
            this.size += sampleData;
            return;
        }
        this.state = 2;
        this.trackOutput.sampleMetadata(0L, 1, this.size, 0, null);
        this.size = 0;
    }

    @RequiresNonNull({"this.extractorOutput"})
    private void outputImageTrackAndSeekMap(String str) {
        TrackOutput track = this.extractorOutput.track(1024, 4);
        this.trackOutput = track;
        track.format(new Format.Builder().setContainerMimeType(str).setTileCountHorizontal(1).setTileCountVertical(1).build());
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(new SingleSampleSeekMap(-9223372036854775807L));
        this.state = 1;
    }
}
