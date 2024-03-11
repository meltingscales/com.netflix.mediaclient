package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.dse  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C8616dse<T> implements Iterator<T>, dsK {
    private final T[] b;
    private int d;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C8616dse(T[] tArr) {
        C8632dsu.c((Object) tArr, "");
        this.b = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.d < this.b.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.b;
            int i = this.d;
            this.d = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.d--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
