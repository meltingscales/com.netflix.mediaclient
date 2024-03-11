package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import o.dpR;

/* loaded from: classes.dex */
abstract class StateMapMutableIterator<K, V> {
    private Map.Entry<? extends K, ? extends V> current;
    private final Iterator<Map.Entry<K, V>> iterator;
    private final SnapshotStateMap<K, V> map;
    private int modification;
    private Map.Entry<? extends K, ? extends V> next;

    /* JADX INFO: Access modifiers changed from: protected */
    public final Map.Entry<K, V> getCurrent() {
        return (Map.Entry<? extends K, ? extends V>) this.current;
    }

    public final SnapshotStateMap<K, V> getMap() {
        return this.map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Map.Entry<K, V> getNext() {
        return (Map.Entry<? extends K, ? extends V>) this.next;
    }

    public final boolean hasNext() {
        return this.next != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StateMapMutableIterator(SnapshotStateMap<K, V> snapshotStateMap, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.map = snapshotStateMap;
        this.iterator = it;
        this.modification = snapshotStateMap.getModification$runtime_release();
        advance();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void advance() {
        this.current = this.next;
        this.next = this.iterator.hasNext() ? this.iterator.next() : null;
    }

    public final void remove() {
        if (getMap().getModification$runtime_release() != this.modification) {
            throw new ConcurrentModificationException();
        }
        Map.Entry<? extends K, ? extends V> entry = this.current;
        if (entry != null) {
            this.map.remove(entry.getKey());
            this.current = null;
            dpR dpr = dpR.c;
            this.modification = getMap().getModification$runtime_release();
            return;
        }
        throw new IllegalStateException();
    }
}
