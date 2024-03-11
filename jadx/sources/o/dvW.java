package o;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class dvW<K, V> implements Iterator<Map.Entry<? extends K, ? extends V>>, dsK {
    private final dvX<K, V> a;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public dvW(dvP<K, V> dvp) {
        C8632dsu.c((Object) dvp, "");
        this.a = new dvX<>(dvp.c(), dvp.b());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    /* renamed from: e */
    public Map.Entry<K, V> next() {
        return new C8703dvk(this.a.a(), this.a.next().c());
    }
}
