package o;

import java.util.Iterator;
import java.util.Map;

/* renamed from: o.dvs  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8711dvs<K, V> extends AbstractC8702dvj<Map.Entry<K, V>, K, V> {
    private final C8707dvo<K, V> a;

    public C8711dvs(C8707dvo<K, V> c8707dvo) {
        C8632dsu.c((Object) c8707dvo, "");
        this.a = c8707dvo;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: a */
    public boolean add(Map.Entry<K, V> entry) {
        C8632dsu.c((Object) entry, "");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new C8713dvu(this.a);
    }

    @Override // o.AbstractC8702dvj
    public boolean e(Map.Entry<? extends K, ? extends V> entry) {
        C8632dsu.c((Object) entry, "");
        return this.a.remove(entry.getKey(), entry.getValue());
    }

    @Override // o.dpY
    public int getSize() {
        return this.a.size();
    }

    @Override // o.AbstractC8702dvj
    public boolean d(Map.Entry<? extends K, ? extends V> entry) {
        C8632dsu.c((Object) entry, "");
        return C8726dwg.c.a(this.a, entry);
    }
}
