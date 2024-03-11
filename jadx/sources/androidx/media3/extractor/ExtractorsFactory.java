package androidx.media3.extractor;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface ExtractorsFactory {
    public static final ExtractorsFactory EMPTY = new ExtractorsFactory() { // from class: androidx.media3.extractor.ExtractorsFactory$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            Extractor[] lambda$static$0;
            lambda$static$0 = ExtractorsFactory.lambda$static$0();
            return lambda$static$0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[0];
    }

    Extractor[] createExtractors();

    default Extractor[] createExtractors(Uri uri, Map<String, List<String>> map) {
        return createExtractors();
    }
}
