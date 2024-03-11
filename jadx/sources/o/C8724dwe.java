package o;

import java.util.Iterator;

/* renamed from: o.dwe  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8724dwe<K, V> extends dpQ<V> implements duR<V> {
    private final dvP<K, V> d;

    public C8724dwe(dvP<K, V> dvp) {
        C8632dsu.c((Object) dvp, "");
        this.d = dvp;
    }

    @Override // o.dpQ
    public int getSize() {
        return this.d.size();
    }

    @Override // o.dpQ, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.d.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new C8721dwb(this.d);
    }
}
