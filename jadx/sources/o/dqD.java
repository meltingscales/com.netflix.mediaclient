package o;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class dqD extends dqC {
    public static int e(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> Map<K, V> b(Pair<? extends K, ? extends V> pair) {
        C8632dsu.c((Object) pair, "");
        Map<K, V> singletonMap = Collections.singletonMap(pair.d(), pair.a());
        C8632dsu.a(singletonMap, "");
        return singletonMap;
    }

    public static <K, V> Map<K, V> e() {
        return new MapBuilder();
    }

    public static <K, V> Map<K, V> b(int i) {
        return new MapBuilder(i);
    }

    public static <K, V> Map<K, V> h(Map<K, V> map) {
        C8632dsu.c((Object) map, "");
        return ((MapBuilder) map).d();
    }

    public static <K extends Comparable<? super K>, V> SortedMap<K, V> j(Map<? extends K, ? extends V> map) {
        C8632dsu.c((Object) map, "");
        return new TreeMap(map);
    }

    public static final <K, V> Map<K, V> i(Map<? extends K, ? extends V> map) {
        C8632dsu.c((Object) map, "");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C8632dsu.a(singletonMap, "");
        return singletonMap;
    }
}
