package androidx.media3.extractor.mkv;

import androidx.media3.extractor.ExtractorInput;

/* loaded from: classes2.dex */
interface EbmlReader {
    void init(EbmlProcessor ebmlProcessor);

    boolean read(ExtractorInput extractorInput);

    void reset();
}
