package androidx.compose.runtime.snapshots;

import java.util.Set;
import o.C8628dsq;
import o.dsQ;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class SnapshotMapSet<K, V, E> implements Set<E>, dsQ {
    private final SnapshotStateMap<K, V> map;

    public final SnapshotStateMap<K, V> getMap() {
        return this.map;
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return C8628dsq.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C8628dsq.c(this, tArr);
    }

    public SnapshotMapSet(SnapshotStateMap<K, V> snapshotStateMap) {
        this.map = snapshotStateMap;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return getSize();
    }

    public int getSize() {
        return this.map.size();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.map.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.map.isEmpty();
    }
}
