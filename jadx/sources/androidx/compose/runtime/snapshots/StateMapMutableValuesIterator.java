package androidx.compose.runtime.snapshots;

import java.util.Iterator;
import java.util.Map;
import o.dsJ;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class StateMapMutableValuesIterator<K, V> extends StateMapMutableIterator<K, V> implements Iterator<V>, dsJ {
    public StateMapMutableValuesIterator(SnapshotStateMap<K, V> snapshotStateMap, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(snapshotStateMap, it);
    }

    @Override // java.util.Iterator
    public V next() {
        Map.Entry<K, V> next = getNext();
        if (next == null) {
            throw new IllegalStateException();
        }
        advance();
        return next.getValue();
    }
}
