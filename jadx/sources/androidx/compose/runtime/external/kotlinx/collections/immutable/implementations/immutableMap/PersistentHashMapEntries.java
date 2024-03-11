package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import java.util.Iterator;
import java.util.Map;
import o.AbstractC8558dqa;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class PersistentHashMapEntries<K, V> extends AbstractC8558dqa<Map.Entry<? extends K, ? extends V>> implements ImmutableSet<Map.Entry<? extends K, ? extends V>> {
    private final PersistentHashMap<K, V> map;

    public PersistentHashMapEntries(PersistentHashMap<K, V> persistentHashMap) {
        this.map = persistentHashMap;
    }

    @Override // o.dpQ, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry) ((Map.Entry) obj));
        }
        return false;
    }

    @Override // o.dpQ
    public int getSize() {
        return this.map.size();
    }

    public boolean contains(Map.Entry<? extends K, ? extends V> entry) {
        if (entry instanceof Map.Entry) {
            V v = this.map.get(entry.getKey());
            return v != null ? C8632dsu.c(v, entry.getValue()) : entry.getValue() == null && this.map.containsKey(entry.getKey());
        }
        return false;
    }

    @Override // o.AbstractC8558dqa, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new PersistentHashMapEntriesIterator(this.map.getNode$runtime_release());
    }
}
