package o;

import java.util.Map;
import java.util.Map.Entry;

/* loaded from: classes5.dex */
public abstract class dqO<E extends Map.Entry<? extends K, ? extends V>, K, V> extends dpY<E> {
    public abstract boolean d(Map.Entry<? extends K, ? extends V> entry);

    public boolean a(Map.Entry<?, ?> entry) {
        return super.remove(entry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return b((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return a((Map.Entry) obj);
        }
        return false;
    }

    public final boolean b(E e) {
        C8632dsu.c((Object) e, "");
        return d(e);
    }
}
