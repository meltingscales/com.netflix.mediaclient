package o;

import java.util.Map;
import o.dsP;

/* loaded from: classes5.dex */
final class dvO<K, V> extends C8703dvk<K, V> implements Map.Entry<K, V>, dsP.b {
    private dvI<V> a;
    private final Map<K, dvI<V>> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvO(Map<K, dvI<V>> map, K k, dvI<V> dvi) {
        super(k, dvi.c());
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) dvi, "");
        this.b = map;
        this.a = dvi;
    }

    @Override // o.C8703dvk, java.util.Map.Entry
    public V getValue() {
        return this.a.c();
    }

    @Override // o.C8703dvk, java.util.Map.Entry
    public V setValue(V v) {
        V c = this.a.c();
        this.a = this.a.e(v);
        this.b.put(getKey(), this.a);
        return c;
    }
}
