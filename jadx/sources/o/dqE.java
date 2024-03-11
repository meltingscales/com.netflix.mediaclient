package o;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class dqE extends dqD {
    public static <K, V> Map<K, V> d() {
        EmptyMap emptyMap = EmptyMap.d;
        C8632dsu.d(emptyMap);
        return emptyMap;
    }

    public static <K, V> Map<K, V> c(Pair<? extends K, ? extends V>... pairArr) {
        Map<K, V> d;
        int e;
        C8632dsu.c((Object) pairArr, "");
        if (pairArr.length > 0) {
            e = dqD.e(pairArr.length);
            return b(pairArr, new LinkedHashMap(e));
        }
        d = d();
        return d;
    }

    public static <K, V> Map<K, V> i(Pair<? extends K, ? extends V>... pairArr) {
        int e;
        C8632dsu.c((Object) pairArr, "");
        e = dqD.e(pairArr.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        a(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static <K, V> HashMap<K, V> b(Pair<? extends K, ? extends V>... pairArr) {
        int e;
        C8632dsu.c((Object) pairArr, "");
        e = dqD.e(pairArr.length);
        HashMap<K, V> hashMap = new HashMap<>(e);
        a(hashMap, pairArr);
        return hashMap;
    }

    public static <K, V> V e(Map<K, ? extends V> map, K k) {
        Object b;
        C8632dsu.c((Object) map, "");
        b = dqC.b(map, k);
        return (V) b;
    }

    public static <K, V> void a(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairArr) {
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) pairArr, "");
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            map.put((K) pair.b(), (V) pair.c());
        }
    }

    public static <K, V> void b(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) iterable, "");
        for (Pair<? extends K, ? extends V> pair : iterable) {
            map.put((K) pair.b(), (V) pair.c());
        }
    }

    public static <K, V> Map<K, V> d(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Map<K, V> d;
        Map<K, V> b;
        int e;
        C8632dsu.c((Object) iterable, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                d = d();
                return d;
            } else if (size == 1) {
                b = dqD.b(iterable instanceof List ? (Pair<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
                return b;
            } else {
                e = dqD.e(collection.size());
                return c(iterable, new LinkedHashMap(e));
            }
        }
        return g(c(iterable, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M c(Iterable<? extends Pair<? extends K, ? extends V>> iterable, M m) {
        C8632dsu.c((Object) iterable, "");
        C8632dsu.c((Object) m, "");
        b((Map) m, (Iterable) iterable);
        return m;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M b(Pair<? extends K, ? extends V>[] pairArr, M m) {
        C8632dsu.c((Object) pairArr, "");
        C8632dsu.c((Object) m, "");
        a(m, pairArr);
        return m;
    }

    public static <K, V> Map<K, V> l(Map<? extends K, ? extends V> map) {
        Map<K, V> d;
        Map<K, V> k;
        C8632dsu.c((Object) map, "");
        int size = map.size();
        if (size == 0) {
            d = d();
            return d;
        } else if (size == 1) {
            return dqD.i(map);
        } else {
            k = k(map);
            return k;
        }
    }

    public static <K, V> Map<K, V> k(Map<? extends K, ? extends V> map) {
        C8632dsu.c((Object) map, "");
        return new LinkedHashMap(map);
    }

    public static <K, V> Map<K, V> e(Map<? extends K, ? extends V> map, Pair<? extends K, ? extends V> pair) {
        Map<K, V> b;
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) pair, "");
        if (map.isEmpty()) {
            b = dqD.b(pair);
            return b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.d(), pair.a());
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> e(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) map2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> h(Map<? extends K, ? extends V> map, K k) {
        Map k2;
        C8632dsu.c((Object) map, "");
        k2 = k(map);
        k2.remove(k);
        return g(k2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> g(Map<K, ? extends V> map) {
        Map<K, V> d;
        C8632dsu.c((Object) map, "");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : dqD.i(map);
        }
        d = d();
        return d;
    }
}
