package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Map;
import o.C8632dsu;
import o.dsP;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
public final class StateMapMutableEntriesIterator$next$1<K, V> implements Map.Entry<K, V>, dsP.b {
    private final K key;
    final /* synthetic */ StateMapMutableEntriesIterator<K, V> this$0;
    private V value;

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public void setValue(V v) {
        this.value = v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StateMapMutableEntriesIterator$next$1(StateMapMutableEntriesIterator<K, V> stateMapMutableEntriesIterator) {
        this.this$0 = stateMapMutableEntriesIterator;
        Map.Entry<K, V> current = stateMapMutableEntriesIterator.getCurrent();
        C8632dsu.d(current);
        this.key = current.getKey();
        Map.Entry<K, V> current2 = stateMapMutableEntriesIterator.getCurrent();
        C8632dsu.d(current2);
        this.value = current2.getValue();
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        StateMapMutableEntriesIterator<K, V> stateMapMutableEntriesIterator = this.this$0;
        if (stateMapMutableEntriesIterator.getMap().getModification$runtime_release() == ((StateMapMutableIterator) stateMapMutableEntriesIterator).modification) {
            V value = getValue();
            stateMapMutableEntriesIterator.getMap().put(getKey(), v);
            setValue((StateMapMutableEntriesIterator$next$1<K, V>) v);
            return value;
        }
        throw new ConcurrentModificationException();
    }
}
