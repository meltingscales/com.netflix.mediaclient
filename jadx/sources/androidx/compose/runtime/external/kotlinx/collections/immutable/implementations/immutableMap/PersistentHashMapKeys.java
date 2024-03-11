package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import java.util.Iterator;
import o.AbstractC8558dqa;

/* loaded from: classes.dex */
public final class PersistentHashMapKeys<K, V> extends AbstractC8558dqa<K> implements ImmutableSet<K> {
    private final PersistentHashMap<K, V> map;

    public PersistentHashMapKeys(PersistentHashMap<K, V> persistentHashMap) {
        this.map = persistentHashMap;
    }

    @Override // o.dpQ
    public int getSize() {
        return this.map.size();
    }

    @Override // o.dpQ, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // o.AbstractC8558dqa, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        return new PersistentHashMapKeysIterator(this.map.getNode$runtime_release());
    }
}
