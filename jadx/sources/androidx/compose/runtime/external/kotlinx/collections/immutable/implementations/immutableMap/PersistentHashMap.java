package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import java.util.Map;
import java.util.Set;
import o.C8627dsp;
import o.C8632dsu;
import o.dpX;

/* loaded from: classes.dex */
public class PersistentHashMap<K, V> extends dpX<K, V> implements PersistentMap<K, V> {
    private final TrieNode<K, V> node;
    private final int size;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final PersistentHashMap EMPTY = new PersistentHashMap(TrieNode.Companion.getEMPTY$runtime_release(), 0);

    public final TrieNode<K, V> getNode$runtime_release() {
        return this.node;
    }

    @Override // o.dpX
    public int getSize() {
        return this.size;
    }

    public PersistentHashMap(TrieNode<K, V> trieNode, int i) {
        this.node = trieNode;
        this.size = i;
    }

    @Override // o.dpX
    public ImmutableSet<K> getKeys() {
        return new PersistentHashMapKeys(this);
    }

    @Override // o.dpX
    public ImmutableCollection<V> getValues() {
        return new PersistentHashMapValues(this);
    }

    private final ImmutableSet<Map.Entry<K, V>> createEntries() {
        return new PersistentHashMapEntries(this);
    }

    @Override // o.dpX
    public final Set<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    @Override // o.dpX, java.util.Map
    public boolean containsKey(K k) {
        return this.node.containsKey(k != null ? k.hashCode() : 0, k, 0);
    }

    @Override // o.dpX, java.util.Map
    public V get(K k) {
        return this.node.get(k != null ? k.hashCode() : 0, k, 0);
    }

    @Override // o.dpX, java.util.Map
    public PersistentHashMap<K, V> put(K k, V v) {
        TrieNode.ModificationResult<K, V> put = this.node.put(k != null ? k.hashCode() : 0, k, v, 0);
        return put == null ? this : new PersistentHashMap<>(put.getNode(), size() + put.getSizeDelta());
    }

    @Override // o.dpX, java.util.Map
    public PersistentHashMap<K, V> remove(K k) {
        TrieNode<K, V> remove = this.node.remove(k != null ? k.hashCode() : 0, k, 0);
        if (this.node == remove) {
            return this;
        }
        if (remove == null) {
            return Companion.emptyOf$runtime_release();
        }
        return new PersistentHashMap<>(remove, size() - 1);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentHashMapBuilder<K, V> builder() {
        return new PersistentHashMapBuilder<>(this);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final <K, V> PersistentHashMap<K, V> emptyOf$runtime_release() {
            PersistentHashMap<K, V> persistentHashMap = PersistentHashMap.EMPTY;
            C8632dsu.d(persistentHashMap);
            return persistentHashMap;
        }
    }
}
