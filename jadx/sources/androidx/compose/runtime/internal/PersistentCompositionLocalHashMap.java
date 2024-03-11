package androidx.compose.runtime.internal;

import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalMapKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class PersistentCompositionLocalHashMap extends PersistentHashMap<CompositionLocal<Object>, State<? extends Object>> implements PersistentCompositionLocalMap {
    public static final Companion Companion = new Companion(null);
    private static final PersistentCompositionLocalHashMap Empty;

    public /* bridge */ boolean containsKey(CompositionLocal<Object> compositionLocal) {
        return super.containsKey((PersistentCompositionLocalHashMap) compositionLocal);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, o.dpX, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof CompositionLocal) {
            return containsKey((CompositionLocal) obj);
        }
        return false;
    }

    public /* bridge */ boolean containsValue(State<? extends Object> state) {
        return super.containsValue((Object) state);
    }

    @Override // o.dpX, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof State) {
            return containsValue((State) obj);
        }
        return false;
    }

    @Override // androidx.compose.runtime.CompositionLocalMap
    public /* bridge */ State<Object> get(CompositionLocal<Object> compositionLocal) {
        return (State) super.get((PersistentCompositionLocalHashMap) compositionLocal);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, o.dpX, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof CompositionLocal) {
            return get((CompositionLocal) obj);
        }
        return null;
    }

    public /* bridge */ State<Object> getOrDefault(CompositionLocal<Object> compositionLocal, State<? extends Object> state) {
        return (State) super.getOrDefault((Object) compositionLocal, (CompositionLocal<Object>) state);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof CompositionLocal) ? obj2 : getOrDefault((CompositionLocal) obj, (State) obj2);
    }

    public PersistentCompositionLocalHashMap(TrieNode<CompositionLocal<Object>, State<Object>> trieNode, int i) {
        super(trieNode, i);
    }

    @Override // androidx.compose.runtime.CompositionLocalMap
    public <T> T get(CompositionLocal<T> compositionLocal) {
        return (T) CompositionLocalMapKt.read(this, compositionLocal);
    }

    @Override // androidx.compose.runtime.PersistentCompositionLocalMap
    public PersistentCompositionLocalMap putValue(CompositionLocal<Object> compositionLocal, State<? extends Object> state) {
        TrieNode.ModificationResult<CompositionLocal<Object>, State<? extends Object>> put = getNode$runtime_release().put(compositionLocal.hashCode(), compositionLocal, state, 0);
        return put == null ? this : new PersistentCompositionLocalHashMap(put.getNode(), size() + put.getSizeDelta());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap.Builder<CompositionLocal<Object>, State<? extends Object>> builder() {
        return new Builder(this);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends PersistentHashMapBuilder<CompositionLocal<Object>, State<? extends Object>> implements PersistentCompositionLocalMap.Builder {
        private PersistentCompositionLocalHashMap map;

        public /* bridge */ boolean containsKey(CompositionLocal<Object> compositionLocal) {
            return super.containsKey((Builder) compositionLocal);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof CompositionLocal) {
                return containsKey((CompositionLocal) obj);
            }
            return false;
        }

        public /* bridge */ boolean containsValue(State<? extends Object> state) {
            return super.containsValue((Object) state);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof State) {
                return containsValue((State) obj);
            }
            return false;
        }

        public /* bridge */ State<Object> get(CompositionLocal<Object> compositionLocal) {
            return (State) super.get((Builder) compositionLocal);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof CompositionLocal) {
                return get((CompositionLocal) obj);
            }
            return null;
        }

        public /* bridge */ State<Object> getOrDefault(CompositionLocal<Object> compositionLocal, State<? extends Object> state) {
            return (State) super.getOrDefault((Object) compositionLocal, (CompositionLocal<Object>) state);
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof CompositionLocal) ? obj2 : getOrDefault((CompositionLocal) obj, (State) obj2);
        }

        public /* bridge */ State<Object> remove(CompositionLocal<Object> compositionLocal) {
            return (State) super.remove((Builder) compositionLocal);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof CompositionLocal) {
                return remove((CompositionLocal) obj);
            }
            return null;
        }

        public Builder(PersistentCompositionLocalHashMap persistentCompositionLocalHashMap) {
            super(persistentCompositionLocalHashMap);
            this.map = persistentCompositionLocalHashMap;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
        public PersistentMap<CompositionLocal<Object>, State<? extends Object>> build() {
            PersistentCompositionLocalHashMap persistentCompositionLocalHashMap;
            if (getNode$runtime_release() == this.map.getNode$runtime_release()) {
                persistentCompositionLocalHashMap = this.map;
            } else {
                setOwnership(new MutabilityOwnership());
                persistentCompositionLocalHashMap = new PersistentCompositionLocalHashMap(getNode$runtime_release(), size());
            }
            this.map = persistentCompositionLocalHashMap;
            return persistentCompositionLocalHashMap;
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final PersistentCompositionLocalHashMap getEmpty() {
            return PersistentCompositionLocalHashMap.Empty;
        }
    }

    static {
        TrieNode eMPTY$runtime_release = TrieNode.Companion.getEMPTY$runtime_release();
        C8632dsu.d(eMPTY$runtime_release);
        Empty = new PersistentCompositionLocalHashMap(eMPTY$runtime_release, 0);
    }
}
