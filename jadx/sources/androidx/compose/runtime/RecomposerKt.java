package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.C8571dqn;

/* loaded from: classes.dex */
public final class RecomposerKt {
    private static final Object ProduceAnotherFrame = new Object();
    private static final Object FramePending = new Object();

    public static final <K, V> V removeLastMultiValue(Map<K, List<V>> map, K k) {
        Object r;
        List<V> list = map.get(k);
        if (list != null) {
            r = C8571dqn.r(list);
            V v = (V) r;
            if (list.isEmpty()) {
                map.remove(k);
                return v;
            }
            return v;
        }
        return null;
    }

    public static final <K, V> boolean addMultiValue(Map<K, List<V>> map, K k, V v) {
        List<V> list = map.get(k);
        if (list == null) {
            list = new ArrayList<>();
            map.put(k, list);
        }
        return list.add(v);
    }
}
