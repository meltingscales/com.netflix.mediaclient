package o;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class dvN<K, V> extends AbstractC8702dvj<Map.Entry<K, V>, K, V> {
    private final dvM<K, V> d;

    public dvN(dvM<K, V> dvm) {
        C8632dsu.c((Object) dvm, "");
        this.d = dvm;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: a */
    public boolean add(Map.Entry<K, V> entry) {
        C8632dsu.c((Object) entry, "");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new dvQ(this.d);
    }

    @Override // o.AbstractC8702dvj
    public boolean e(Map.Entry<? extends K, ? extends V> entry) {
        C8632dsu.c((Object) entry, "");
        return this.d.remove(entry.getKey(), entry.getValue());
    }

    @Override // o.dpY
    public int getSize() {
        return this.d.size();
    }

    @Override // o.AbstractC8702dvj
    public boolean d(Map.Entry<? extends K, ? extends V> entry) {
        C8632dsu.c((Object) entry, "");
        return C8726dwg.c.a(this.d, entry);
    }
}
