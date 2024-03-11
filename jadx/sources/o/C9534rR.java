package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.rR  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9534rR<T> implements Iterator<T>, Iterable<T> {
    private int c = 0;
    private final T[] e;

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this;
    }

    public C9534rR(T[] tArr) {
        this.e = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c < this.e.length;
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.c;
        T[] tArr = this.e;
        if (i >= tArr.length) {
            throw new NoSuchElementException();
        }
        this.c = i + 1;
        return tArr[i];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
