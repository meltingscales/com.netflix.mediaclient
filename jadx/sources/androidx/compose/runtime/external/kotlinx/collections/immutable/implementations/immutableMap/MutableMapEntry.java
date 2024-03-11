package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import o.dsP;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MutableMapEntry<K, V> extends MapEntry<K, V> implements Map.Entry<K, V>, dsP.b {
    private final PersistentHashMapBuilderEntriesIterator<K, V> parentIterator;
    private V value;

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public void setValue(V v) {
        this.value = v;
    }

    public MutableMapEntry(PersistentHashMapBuilderEntriesIterator<K, V> persistentHashMapBuilderEntriesIterator, K k, V v) {
        super(k, v);
        this.parentIterator = persistentHashMapBuilderEntriesIterator;
        this.value = v;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public V setValue(V v) {
        V value = getValue();
        setValue((MutableMapEntry<K, V>) v);
        this.parentIterator.setValue(getKey(), v);
        return value;
    }
}
