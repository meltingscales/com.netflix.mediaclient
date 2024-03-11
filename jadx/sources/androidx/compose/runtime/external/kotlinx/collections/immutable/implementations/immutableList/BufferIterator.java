package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class BufferIterator<T> extends AbstractListIterator<T> {
    private final T[] buffer;

    public BufferIterator(T[] tArr, int i, int i2) {
        super(i, i2);
        this.buffer = tArr;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T[] tArr = this.buffer;
        int index = getIndex();
        setIndex(index + 1);
        return tArr[index];
    }

    @Override // java.util.ListIterator
    public T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        T[] tArr = this.buffer;
        setIndex(getIndex() - 1);
        return tArr[getIndex()];
    }
}
