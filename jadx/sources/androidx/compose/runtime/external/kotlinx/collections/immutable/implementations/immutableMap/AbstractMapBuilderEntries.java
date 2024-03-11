package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import java.util.Map.Entry;
import o.dpY;

/* loaded from: classes.dex */
public abstract class AbstractMapBuilderEntries<E extends Map.Entry<? extends K, ? extends V>, K, V> extends dpY<E> {
    public abstract boolean containsEntry(Map.Entry<? extends K, ? extends V> entry);

    public abstract boolean removeEntry(Map.Entry<? extends K, ? extends V> entry);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((AbstractMapBuilderEntries<E, K, V>) ((Map.Entry) obj));
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return remove((AbstractMapBuilderEntries<E, K, V>) ((Map.Entry) obj));
        }
        return false;
    }

    public final boolean contains(E e) {
        if ((e instanceof Object ? e : null) instanceof Map.Entry) {
            return containsEntry(e);
        }
        return false;
    }

    public final boolean remove(E e) {
        if ((e instanceof Object ? e : null) instanceof Map.Entry) {
            return removeEntry(e);
        }
        return false;
    }
}
