package o;

import java.util.Map;
import o.dsP;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dvq  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8709dvq<K, V> extends C8703dvk<K, V> implements Map.Entry<K, V>, dsP.b {
    private V d;
    private final C8713dvu<K, V> e;

    public void a(V v) {
        this.d = v;
    }

    @Override // o.C8703dvk, java.util.Map.Entry
    public V getValue() {
        return this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8709dvq(C8713dvu<K, V> c8713dvu, K k, V v) {
        super(k, v);
        C8632dsu.c((Object) c8713dvu, "");
        this.e = c8713dvu;
        this.d = v;
    }

    @Override // o.C8703dvk, java.util.Map.Entry
    public V setValue(V v) {
        V value = getValue();
        a(v);
        this.e.a(getKey(), v);
        return value;
    }
}
