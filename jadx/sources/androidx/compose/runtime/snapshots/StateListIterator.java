package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import o.dsR;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class StateListIterator<T> implements ListIterator<T>, dsR {
    private int index;
    private int lastRequested = -1;
    private final SnapshotStateList<T> list;
    private int structure;

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.index >= 0;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.index + 1;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.index;
    }

    public StateListIterator(SnapshotStateList<T> snapshotStateList, int i) {
        this.list = snapshotStateList;
        this.index = i - 1;
        this.structure = snapshotStateList.getStructure$runtime_release();
    }

    @Override // java.util.ListIterator
    public T previous() {
        validateModification();
        SnapshotStateListKt.validateRange(this.index, this.list.size());
        int i = this.index;
        this.lastRequested = i;
        this.index--;
        return this.list.get(i);
    }

    @Override // java.util.ListIterator
    public void add(T t) {
        validateModification();
        this.list.add(this.index + 1, t);
        this.lastRequested = -1;
        this.index++;
        this.structure = this.list.getStructure$runtime_release();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.index < this.list.size() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        validateModification();
        int i = this.index + 1;
        this.lastRequested = i;
        SnapshotStateListKt.validateRange(i, this.list.size());
        T t = this.list.get(i);
        this.index = i;
        return t;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        validateModification();
        this.list.remove(this.index);
        this.index--;
        this.lastRequested = -1;
        this.structure = this.list.getStructure$runtime_release();
    }

    @Override // java.util.ListIterator
    public void set(T t) {
        validateModification();
        int i = this.lastRequested;
        if (i < 0) {
            SnapshotStateListKt.invalidIteratorSet();
            throw new KotlinNothingValueException();
        }
        this.list.set(i, t);
        this.structure = this.list.getStructure$runtime_release();
    }

    private final void validateModification() {
        if (this.list.getStructure$runtime_release() != this.structure) {
            throw new ConcurrentModificationException();
        }
    }
}
