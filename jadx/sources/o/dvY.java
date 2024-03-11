package o;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class dvY<K, V> implements Iterator<K>, dsK {
    private final dvX<K, V> b;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public dvY(dvP<K, V> dvp) {
        C8632dsu.c((Object) dvp, "");
        this.b = new dvX<>(dvp.c(), dvp.b());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public K next() {
        K k = (K) this.b.a();
        this.b.next();
        return k;
    }
}
