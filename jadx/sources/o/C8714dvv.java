package o;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: o.dvv  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8714dvv<K, V> extends dpV<V> implements Collection<V> {
    private final C8707dvo<K, V> c;

    public C8714dvv(C8707dvo<K, V> c8707dvo) {
        C8632dsu.c((Object) c8707dvo, "");
        this.c = c8707dvo;
    }

    @Override // o.dpV
    public int getSize() {
        return this.c.size();
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
    public void clear() {
        this.c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new dvB(this.c);
    }
}
