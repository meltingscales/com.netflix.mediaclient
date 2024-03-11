package o;

import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class dqC {
    public static <K, V> V b(Map<K, ? extends V> map, K k) {
        C8632dsu.c((Object) map, "");
        if (map instanceof InterfaceC8583dqz) {
            return (V) ((InterfaceC8583dqz) map).a(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        throw new NoSuchElementException("Key " + k + " is missing in the map.");
    }

    public static <K, V> Map<K, V> b(Map<K, ? extends V> map, drM<? super K, ? extends V> drm) {
        Map<K, V> b;
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) drm, "");
        if (map instanceof InterfaceC8583dqz) {
            b = b((Map) ((InterfaceC8583dqz) map).a(), (drM) drm);
            return b;
        }
        return new dqG(map, drm);
    }
}
