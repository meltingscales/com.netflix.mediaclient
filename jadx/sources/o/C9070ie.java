package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;

/* renamed from: o.ie  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9070ie {
    public static final String b(JsonReader jsonReader) {
        List<String> e;
        C8632dsu.c((Object) jsonReader, "");
        e = C8566dqi.e("__typename");
        if (jsonReader.a(e) != 0) {
            throw new IllegalStateException("__typename not found".toString());
        }
        String k = jsonReader.k();
        if (k != null) {
            return k;
        }
        throw new IllegalStateException("__typename is null".toString());
    }
}
