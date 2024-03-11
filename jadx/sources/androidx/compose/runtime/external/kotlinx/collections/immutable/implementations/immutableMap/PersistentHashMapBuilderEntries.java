package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.Map;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class PersistentHashMapBuilderEntries<K, V> extends AbstractMapBuilderEntries<Map.Entry<K, V>, K, V> {
    private final PersistentHashMapBuilder<K, V> builder;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return add((Map.Entry) ((Map.Entry) obj));
    }

    public PersistentHashMapBuilderEntries(PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        this.builder = persistentHashMapBuilder;
    }

    public boolean add(Map.Entry<K, V> entry) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.builder.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new PersistentHashMapBuilderEntriesIterator(this.builder);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractMapBuilderEntries
    public boolean removeEntry(Map.Entry<? extends K, ? extends V> entry) {
        return this.builder.remove(entry.getKey(), entry.getValue());
    }

    @Override // o.dpY
    public int getSize() {
        return this.builder.size();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractMapBuilderEntries
    public boolean containsEntry(Map.Entry<? extends K, ? extends V> entry) {
        V v = this.builder.get(entry.getKey());
        return v != null ? C8632dsu.c(v, entry.getValue()) : entry.getValue() == null && this.builder.containsKey(entry.getKey());
    }
}
