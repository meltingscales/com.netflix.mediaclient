package o;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class dvU<K, V> implements Iterator<V>, dsJ {
    private final dvR<K, V> c;

    public dvU(dvM<K, V> dvm) {
        C8632dsu.c((Object) dvm, "");
        this.c = new dvR<>(dvm.b(), dvm);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        return this.c.next().c();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.c.remove();
    }
}
