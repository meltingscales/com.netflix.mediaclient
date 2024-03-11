package o;

import java.util.Iterator;

/* renamed from: o.dwa  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8720dwa<K, V> extends AbstractC8558dqa<K> implements duV<K> {
    private final dvP<K, V> a;

    public C8720dwa(dvP<K, V> dvp) {
        C8632dsu.c((Object) dvp, "");
        this.a = dvp;
    }

    @Override // o.dpQ
    public int getSize() {
        return this.a.size();
    }

    @Override // o.dpQ, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // o.AbstractC8558dqa, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        return new dvY(this.a);
    }
}
