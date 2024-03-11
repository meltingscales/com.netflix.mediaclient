package o;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.LinkedHashTreeMap;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import o.dnD;

/* loaded from: classes5.dex */
final class dnJ<K, V> extends dnD<Map<K, V>> {
    public static final dnD.b a = new dnD.b() { // from class: o.dnJ.3
        @Override // o.dnD.b
        public dnD<?> a(Type type, Set<? extends Annotation> set, dnN dnn) {
            Class<?> c;
            if (set.isEmpty() && (c = dnO.c(type)) == Map.class) {
                Type[] d = dnO.d(type, c);
                return new dnJ(dnn, d[0], d[1]).c();
            }
            return null;
        }
    };
    private final dnD<K> c;
    private final dnD<V> e;

    @Override // o.dnD
    public /* bridge */ /* synthetic */ void b(dnK dnk, Object obj) {
        b(dnk, (Map) ((Map) obj));
    }

    dnJ(dnN dnn, Type type, Type type2) {
        this.c = dnn.b(type);
        this.e = dnn.b(type2);
    }

    public void b(dnK dnk, Map<K, V> map) {
        dnk.e();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() == null) {
                throw new JsonDataException("Map key is null at " + dnk.f());
            }
            dnk.j();
            this.c.b(dnk, (dnK) entry.getKey());
            this.e.b(dnk, (dnK) entry.getValue());
        }
        dnk.a();
    }

    @Override // o.dnD
    /* renamed from: a */
    public Map<K, V> d(JsonReader jsonReader) {
        LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
        jsonReader.e();
        while (jsonReader.h()) {
            jsonReader.k();
            K d = this.c.d(jsonReader);
            V d2 = this.e.d(jsonReader);
            Object put = linkedHashTreeMap.put(d, d2);
            if (put != null) {
                throw new JsonDataException("Map key '" + d + "' has multiple values at path " + jsonReader.d() + ": " + put + " and " + d2);
            }
        }
        jsonReader.b();
        return linkedHashTreeMap;
    }

    public String toString() {
        return "JsonAdapter(" + this.c + "=" + this.e + ")";
    }
}
