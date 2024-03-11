package o;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class dvS<K, V> extends dpV<V> implements Collection<V> {
    private final dvM<K, V> e;

    public dvS(dvM<K, V> dvm) {
        C8632dsu.c((Object) dvm, "");
        this.e = dvm;
    }

    @Override // o.dpV
    public int getSize() {
        return this.e.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.e.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.e.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new dvU(this.e);
    }
}
