package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import o.AbstractC8559dqb;
import o.C8632dsu;

/* loaded from: classes.dex */
public class PersistentHashMapBuilder<K, V> extends AbstractC8559dqb<K, V> implements PersistentMap.Builder<K, V> {
    private PersistentHashMap<K, V> map;
    private int modCount;
    private TrieNode<K, V> node;
    private V operationResult;
    private MutabilityOwnership ownership = new MutabilityOwnership();
    private int size;

    public final int getModCount$runtime_release() {
        return this.modCount;
    }

    public final TrieNode<K, V> getNode$runtime_release() {
        return this.node;
    }

    public final MutabilityOwnership getOwnership() {
        return this.ownership;
    }

    @Override // o.AbstractC8559dqb
    public int getSize() {
        return this.size;
    }

    public final void setModCount$runtime_release(int i) {
        this.modCount = i;
    }

    public final void setOperationResult$runtime_release(V v) {
        this.operationResult = v;
    }

    public final void setOwnership(MutabilityOwnership mutabilityOwnership) {
        this.ownership = mutabilityOwnership;
    }

    public void setSize(int i) {
        this.size = i;
        this.modCount++;
    }

    public PersistentHashMapBuilder(PersistentHashMap<K, V> persistentHashMap) {
        this.map = persistentHashMap;
        this.node = this.map.getNode$runtime_release();
        this.size = this.map.size();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    public PersistentHashMap<K, V> build() {
        PersistentHashMap<K, V> persistentHashMap;
        if (this.node == this.map.getNode$runtime_release()) {
            persistentHashMap = this.map;
        } else {
            this.ownership = new MutabilityOwnership();
            persistentHashMap = new PersistentHashMap<>(this.node, size());
        }
        this.map = persistentHashMap;
        return persistentHashMap;
    }

    @Override // o.AbstractC8559dqb
    public Set<Map.Entry<K, V>> getEntries() {
        return new PersistentHashMapBuilderEntries(this);
    }

    @Override // o.AbstractC8559dqb
    public Set<K> getKeys() {
        return new PersistentHashMapBuilderKeys(this);
    }

    @Override // o.AbstractC8559dqb
    public Collection<V> getValues() {
        return new PersistentHashMapBuilderValues(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(K k) {
        return this.node.containsKey(k != null ? k.hashCode() : 0, k, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(K k) {
        return this.node.get(k != null ? k.hashCode() : 0, k, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        this.operationResult = null;
        this.node = this.node.mutablePut(k != null ? k.hashCode() : 0, k, v, 0, this);
        return this.operationResult;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        PersistentHashMap<K, V> persistentHashMap = map instanceof PersistentHashMap ? (PersistentHashMap) map : null;
        if (persistentHashMap == null) {
            PersistentHashMapBuilder persistentHashMapBuilder = map instanceof PersistentHashMapBuilder ? (PersistentHashMapBuilder) map : null;
            persistentHashMap = persistentHashMapBuilder != null ? persistentHashMapBuilder.build() : null;
        }
        if (persistentHashMap != null) {
            DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
            int size = size();
            TrieNode<K, V> trieNode = this.node;
            TrieNode<K, V> node$runtime_release = persistentHashMap.getNode$runtime_release();
            C8632dsu.d(node$runtime_release);
            this.node = trieNode.mutablePutAll(node$runtime_release, 0, deltaCounter, this);
            int size2 = (persistentHashMap.size() + size) - deltaCounter.getCount();
            if (size != size2) {
                setSize(size2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(K k) {
        this.operationResult = null;
        TrieNode mutableRemove = this.node.mutableRemove(k != null ? k.hashCode() : 0, k, 0, this);
        if (mutableRemove == null) {
            mutableRemove = TrieNode.Companion.getEMPTY$runtime_release();
            C8632dsu.d(mutableRemove);
        }
        this.node = mutableRemove;
        return this.operationResult;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        TrieNode mutableRemove = this.node.mutableRemove(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (mutableRemove == null) {
            mutableRemove = TrieNode.Companion.getEMPTY$runtime_release();
            C8632dsu.d(mutableRemove);
        }
        this.node = mutableRemove;
        return size != size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        TrieNode<K, V> eMPTY$runtime_release = TrieNode.Companion.getEMPTY$runtime_release();
        C8632dsu.d(eMPTY$runtime_release);
        this.node = eMPTY$runtime_release;
        setSize(0);
    }
}
