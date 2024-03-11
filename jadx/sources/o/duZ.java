package o;

import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class duZ<T> extends AbstractC8693dva<T> {
    private final T[] d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duZ(T[] tArr, int i, int i2) {
        super(i, i2);
        C8632dsu.c((Object) tArr, "");
        this.d = tArr;
    }

    @Override // o.AbstractC8693dva, java.util.ListIterator, java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T[] tArr = this.d;
        int e = e();
        c(e + 1);
        return tArr[e];
    }

    @Override // java.util.ListIterator
    public T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        T[] tArr = this.d;
        c(e() - 1);
        return tArr[e()];
    }
}
