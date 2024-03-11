package o;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.StreamReadFeature;

/* loaded from: classes5.dex */
public class djZ {

    /* loaded from: classes5.dex */
    static class a {
        public static final JsonFactory d = JsonFactory.builder().c(StreamReadFeature.STRICT_DUPLICATE_DETECTION).e(JsonFactory.Feature.INTERN_FIELD_NAMES).e();
    }

    public static JsonFactory b() {
        return a.d;
    }
}
