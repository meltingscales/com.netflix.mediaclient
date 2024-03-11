package o;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public class dvX<K, V> implements Iterator<dvI<V>>, dsK {
    private int a;
    private Object b;
    private final Map<K, dvI<V>> e;

    public final Object a() {
        return this.b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public dvX(Object obj, Map<K, dvI<V>> map) {
        C8632dsu.c((Object) map, "");
        this.b = obj;
        this.e = map;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.a < this.e.size();
    }

    @Override // java.util.Iterator
    /* renamed from: e */
    public dvI<V> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        dvI<V> dvi = this.e.get(this.b);
        if (dvi == null) {
            throw new ConcurrentModificationException("Hash code of a key (" + a() + ") has changed after it was added to the persistent map.");
        }
        dvI<V> dvi2 = dvi;
        this.a++;
        this.b = dvi2.b();
        return dvi2;
    }
}
