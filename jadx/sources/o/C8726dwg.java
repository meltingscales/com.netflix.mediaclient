package o;

import java.util.Map;

/* renamed from: o.dwg  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8726dwg {
    public static final C8726dwg c = new C8726dwg();

    private C8726dwg() {
    }

    public final <K, V> boolean a(Map<K, ? extends V> map, Map.Entry<? extends K, ? extends V> entry) {
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) entry, "");
        V v = map.get(entry.getKey());
        Boolean valueOf = v == null ? null : Boolean.valueOf(C8632dsu.c(v, entry.getValue()));
        if (valueOf == null) {
            return entry.getValue() == null && map.containsKey(entry.getKey());
        }
        return valueOf.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> boolean e(Map<K, ? extends V> map, Map<?, ?> map2) {
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) map2, "");
        if (map.size() != map2.size()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!map2.isEmpty()) {
            for (Map.Entry<?, ?> entry : map2.entrySet()) {
                if (!c.a(map, entry)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final <K, V> int e(Map<K, ? extends V> map) {
        C8632dsu.c((Object) map, "");
        return map.entrySet().hashCode();
    }
}
