package o;

import java.util.Iterator;
import java.util.Map;

/* renamed from: o.dvx  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8716dvx<K, V> extends AbstractC8558dqa<Map.Entry<? extends K, ? extends V>> implements duV<Map.Entry<? extends K, ? extends V>> {
    private final C8710dvr<K, V> b;

    public C8716dvx(C8710dvr<K, V> c8710dvr) {
        C8632dsu.c((Object) c8710dvr, "");
        this.b = c8710dvr;
    }

    @Override // o.dpQ, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return e((Map.Entry) obj);
        }
        return false;
    }

    @Override // o.dpQ
    public int getSize() {
        return this.b.size();
    }

    public boolean e(Map.Entry<? extends K, ? extends V> entry) {
        C8632dsu.c((Object) entry, "");
        return C8726dwg.c.a(this.b, entry);
    }

    @Override // o.AbstractC8558dqa, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new C8718dvz(this.b.d());
    }
}
