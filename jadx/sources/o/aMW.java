package o;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aMW {
    public static final aMW e = new aMW();

    private aMW() {
    }

    public final Map<String, Object> c(String str, Map<String, ? extends Object> map) {
        Map<String, Object> d;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) map, "");
        Map<String, Object> b = b(str, map);
        Object obj = b != null ? b.get(str) : null;
        Map<String, Object> map2 = obj instanceof Map ? (Map) obj : null;
        if (map2 == null) {
            d = dqE.d();
            return d;
        }
        return map2;
    }

    public final Map<String, Object> b(String str, Map<String, ? extends Object> map) {
        Map<String, Object> d;
        C8632dsu.c((Object) str, "");
        if ((map != null && map.isEmpty()) || map == null) {
            d = dqE.d();
            return d;
        } else if (map.containsKey(str)) {
            return map;
        } else {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                Object value = entry.getValue();
                Map<String, ? extends Object> map2 = value instanceof Map ? (Map) value : null;
                if (map2 == null) {
                    return new LinkedTreeMap();
                }
                if (map2.containsKey(str)) {
                    return map2;
                }
                Map<String, Object> b = b(str, map2);
                if (b != null && b.containsKey(str)) {
                    return b;
                }
            }
            return new LinkedTreeMap();
        }
    }
}
