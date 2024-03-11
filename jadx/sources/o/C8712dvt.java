package o;

import java.util.Iterator;
import java.util.Set;

/* renamed from: o.dvt  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8712dvt<K, V> extends dpY<K> implements Set<K> {
    private final C8707dvo<K, V> c;

    public C8712dvt(C8707dvo<K, V> c8707dvo) {
        C8632dsu.c((Object) c8707dvo, "");
        this.c = c8707dvo;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        return new C8715dvw(this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (this.c.containsKey(obj)) {
            this.c.remove(obj);
            return true;
        }
        return false;
    }

    @Override // o.dpY
    public int getSize() {
        return this.c.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.c.containsKey(obj);
    }
}
