package o;

import java.util.Iterator;

/* renamed from: o.dwb  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8721dwb<K, V> implements Iterator<V>, dsK {
    private final dvX<K, V> d;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C8721dwb(dvP<K, V> dvp) {
        C8632dsu.c((Object) dvp, "");
        this.d = new dvX<>(dvp.c(), dvp.b());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.d.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        return this.d.next().c();
    }
}
