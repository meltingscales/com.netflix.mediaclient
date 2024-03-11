package androidx.compose.runtime.snapshots;

import java.util.Iterator;
import java.util.Map;
import o.dsJ;

/* loaded from: classes.dex */
final class StateMapMutableEntriesIterator<K, V> extends StateMapMutableIterator<K, V> implements Iterator<Map.Entry<K, V>>, dsJ {
    public StateMapMutableEntriesIterator(SnapshotStateMap<K, V> snapshotStateMap, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(snapshotStateMap, it);
    }

    @Override // java.util.Iterator
    public Map.Entry<K, V> next() {
        advance();
        if (getCurrent() != null) {
            return new StateMapMutableEntriesIterator$next$1(this);
        }
        throw new IllegalStateException();
    }
}
