package o;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class dvQ<K, V> implements Iterator<Map.Entry<K, V>>, dsJ {
    private final dvR<K, V> e;

    public dvQ(dvM<K, V> dvm) {
        C8632dsu.c((Object) dvm, "");
        this.e = new dvR<>(dvm.b(), dvm);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.e.hasNext();
    }

    @Override // java.util.Iterator
    /* renamed from: b */
    public Map.Entry<K, V> next() {
        return new dvO(this.e.d().d(), this.e.e(), this.e.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        this.e.remove();
    }
}
