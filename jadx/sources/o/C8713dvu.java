package o;

import java.util.Iterator;
import java.util.Map;

/* renamed from: o.dvu  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8713dvu<K, V> implements Iterator<Map.Entry<K, V>>, dsJ {
    private final C8706dvn<K, V, Map.Entry<K, V>> e;

    public C8713dvu(C8707dvo<K, V> c8707dvo) {
        C8632dsu.c((Object) c8707dvo, "");
        dvC[] dvcArr = new dvC[8];
        for (int i = 0; i < 8; i++) {
            dvcArr[i] = new dvH(this);
        }
        this.e = new C8706dvn<>(c8707dvo, dvcArr);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.e.hasNext();
    }

    @Override // java.util.Iterator
    /* renamed from: c */
    public Map.Entry<K, V> next() {
        return this.e.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.e.remove();
    }

    public final void a(K k, V v) {
        this.e.c(k, v);
    }
}
