package o;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes5.dex */
public final class dqU<V> extends dpV<V> implements Collection<V> {
    private final MapBuilder<?, V> c;

    public dqU(MapBuilder<?, V> mapBuilder) {
        C8632dsu.c((Object) mapBuilder, "");
        this.c = mapBuilder;
    }

    @Override // o.dpV
    public int getSize() {
        return this.c.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.c.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends V> collection) {
        C8632dsu.c((Object) collection, "");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return this.c.k();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.c.a((MapBuilder<?, V>) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        this.c.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        this.c.c();
        return super.retainAll(collection);
    }
}
