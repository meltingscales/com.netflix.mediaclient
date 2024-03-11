package o;

import java.util.Map;
import java.util.Map.Entry;

/* renamed from: o.dvj  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8702dvj<E extends Map.Entry<? extends K, ? extends V>, K, V> extends dpY<E> {
    public abstract boolean d(Map.Entry<? extends K, ? extends V> entry);

    public abstract boolean e(Map.Entry<? extends K, ? extends V> entry);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return b((Map.Entry) obj);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return c((Map.Entry) obj);
        }
        return false;
    }

    public final boolean b(E e) {
        C8632dsu.c((Object) e, "");
        if ((e instanceof Object ? e : null) instanceof Map.Entry) {
            return d(e);
        }
        return false;
    }

    public final boolean c(E e) {
        C8632dsu.c((Object) e, "");
        if ((e instanceof Object ? e : null) instanceof Map.Entry) {
            return e(e);
        }
        return false;
    }
}
