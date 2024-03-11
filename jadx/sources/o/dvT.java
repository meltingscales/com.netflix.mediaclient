package o;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public final class dvT<K, V> extends dpY<K> implements Set<K> {
    private final dvM<K, V> e;

    public dvT(dvM<K, V> dvm) {
        C8632dsu.c((Object) dvm, "");
        this.e = dvm;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.e.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        return new dvV(this.e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (this.e.containsKey(obj)) {
            this.e.remove(obj);
            return true;
        }
        return false;
    }

    @Override // o.dpY
    public int getSize() {
        return this.e.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.e.containsKey(obj);
    }
}
