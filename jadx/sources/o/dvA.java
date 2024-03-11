package o;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class dvA<K, V> extends AbstractC8558dqa<K> implements duV<K> {
    private final C8710dvr<K, V> b;

    public dvA(C8710dvr<K, V> c8710dvr) {
        C8632dsu.c((Object) c8710dvr, "");
        this.b = c8710dvr;
    }

    @Override // o.dpQ
    public int getSize() {
        return this.b.size();
    }

    @Override // o.dpQ, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // o.AbstractC8558dqa, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        return new C8717dvy(this.b.d());
    }
}
