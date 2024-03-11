package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes5.dex */
public final class dqS<K, V> extends dqO<Map.Entry<K, V>, K, V> {
    private final MapBuilder<K, V> c;

    public dqS(MapBuilder<K, V> mapBuilder) {
        C8632dsu.c((Object) mapBuilder, "");
        this.c = mapBuilder;
    }

    @Override // o.dpY
    public int getSize() {
        return this.c.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // o.dqO
    public boolean d(Map.Entry<? extends K, ? extends V> entry) {
        C8632dsu.c((Object) entry, "");
        return this.c.c((Map.Entry) entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: e */
    public boolean add(Map.Entry<K, V> entry) {
        C8632dsu.c((Object) entry, "");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        C8632dsu.c((Object) collection, "");
        throw new UnsupportedOperationException();
    }

    @Override // o.dqO
    public boolean a(Map.Entry entry) {
        C8632dsu.c((Object) entry, "");
        return this.c.a(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.c.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        return this.c.d((Collection<?>) collection);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        this.c.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> collection) {
        C8632dsu.c((Object) collection, "");
        this.c.c();
        return super.retainAll(collection);
    }
}
