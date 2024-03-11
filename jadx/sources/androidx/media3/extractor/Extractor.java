package androidx.media3.extractor;

/* loaded from: classes2.dex */
public interface Extractor {
    default Extractor getUnderlyingImplementation() {
        return this;
    }

    void init(ExtractorOutput extractorOutput);

    int read(ExtractorInput extractorInput, PositionHolder positionHolder);

    void release();

    void seek(long j, long j2);

    boolean sniff(ExtractorInput extractorInput);
}
