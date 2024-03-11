package o;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class dvF<K, V> extends dpQ<V> implements duR<V> {
    private final C8710dvr<K, V> b;

    public dvF(C8710dvr<K, V> c8710dvr) {
        C8632dsu.c((Object) c8710dvr, "");
        this.b = c8710dvr;
    }

    @Override // o.dpQ
    public int getSize() {
        return this.b.size();
    }

    @Override // o.dpQ, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.b.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new dvE(this.b.d());
    }
}
