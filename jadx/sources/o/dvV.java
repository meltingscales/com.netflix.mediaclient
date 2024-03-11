package o;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class dvV<K, V> implements Iterator<K>, dsJ {
    private final dvR<K, V> b;

    public dvV(dvM<K, V> dvm) {
        C8632dsu.c((Object) dvm, "");
        this.b = new dvR<>(dvm.b(), dvm);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public K next() {
        this.b.next();
        return (K) this.b.e();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.b.remove();
    }
}
