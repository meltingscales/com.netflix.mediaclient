package o;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;
import com.fasterxml.jackson.dataformat.cbor.CBORGenerator;

/* loaded from: classes5.dex */
public class djV {

    /* loaded from: classes5.dex */
    static class b {
        public static final CBORFactory a = CBORFactory.builder().c(StreamReadFeature.STRICT_DUPLICATE_DETECTION).e(JsonFactory.Feature.INTERN_FIELD_NAMES).d(CBORGenerator.Feature.WRITE_TYPE_HEADER).e();
    }

    public static CBORFactory d() {
        return b.a;
    }
}
