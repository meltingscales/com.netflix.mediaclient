package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import java.util.Iterator;
import o.dpQ;

/* loaded from: classes.dex */
public final class PersistentHashMapValues<K, V> extends dpQ<V> implements ImmutableCollection<V> {
    private final PersistentHashMap<K, V> map;

    public PersistentHashMapValues(PersistentHashMap<K, V> persistentHashMap) {
        this.map = persistentHashMap;
    }

    @Override // o.dpQ
    public int getSize() {
        return this.map.size();
    }

    @Override // o.dpQ, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.map.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new PersistentHashMapValuesIterator(this.map.getNode$runtime_release());
    }
}
