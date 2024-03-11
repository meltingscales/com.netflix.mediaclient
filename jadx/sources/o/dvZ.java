package o;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class dvZ<K, V> extends AbstractC8558dqa<Map.Entry<? extends K, ? extends V>> implements duV<Map.Entry<? extends K, ? extends V>> {
    private final dvP<K, V> a;

    public dvZ(dvP<K, V> dvp) {
        C8632dsu.c((Object) dvp, "");
        this.a = dvp;
    }

    @Override // o.dpQ, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return c((Map.Entry) obj);
        }
        return false;
    }

    @Override // o.dpQ
    public int getSize() {
        return this.a.size();
    }

    public boolean c(Map.Entry<? extends K, ? extends V> entry) {
        C8632dsu.c((Object) entry, "");
        return C8726dwg.c.a(this.a, entry);
    }

    @Override // o.AbstractC8558dqa, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new dvW(this.a);
    }
}
