package androidx.collection.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class LruHashMap<K, V> {
    private final LinkedHashMap<K, V> map;

    public LruHashMap() {
        this(0, 0.0f, 3, null);
    }

    public LruHashMap(int i, float f) {
        this.map = new LinkedHashMap<>(i, f, true);
    }

    public /* synthetic */ LruHashMap(int i, float f, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? 16 : i, (i2 & 2) != 0 ? 0.75f : f);
    }

    public final boolean isEmpty() {
        return this.map.isEmpty();
    }

    public final Set<Map.Entry<K, V>> getEntries() {
        Set<Map.Entry<K, V>> entrySet = this.map.entrySet();
        C8632dsu.a(entrySet, "");
        return entrySet;
    }

    public final V get(K k) {
        C8632dsu.c((Object) k, "");
        return this.map.get(k);
    }

    public final V put(K k, V v) {
        C8632dsu.c((Object) k, "");
        C8632dsu.c((Object) v, "");
        return this.map.put(k, v);
    }

    public final V remove(K k) {
        C8632dsu.c((Object) k, "");
        return this.map.remove(k);
    }
}
