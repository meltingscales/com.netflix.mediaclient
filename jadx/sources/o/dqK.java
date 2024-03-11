package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class dqK extends dqH {
    public static <K, V> List<Pair<K, V>> n(Map<? extends K, ? extends V> map) {
        List<Pair<K, V>> e;
        List<Pair<K, V>> i;
        List<Pair<K, V>> i2;
        C8632dsu.c((Object) map, "");
        if (map.size() == 0) {
            i2 = C8569dql.i();
            return i2;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            i = C8569dql.i();
            return i;
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            e = C8566dqi.e(new Pair(next.getKey(), next.getValue()));
            return e;
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new Pair(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static <K, V> dtQ<Map.Entry<K, V>> o(Map<? extends K, ? extends V> map) {
        dtQ<Map.Entry<K, V>> C;
        C8632dsu.c((Object) map, "");
        C = C8576dqs.C(map.entrySet());
        return C;
    }
}
