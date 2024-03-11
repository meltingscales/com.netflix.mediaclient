package o;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
public final class dqI<T> extends dpT<T> implements RandomAccess {
    private final int b;
    private final Object[] c;
    private int d;
    private int e;

    @Override // o.dpQ
    public int getSize() {
        return this.e;
    }

    public dqI(Object[] objArr, int i) {
        C8632dsu.c((Object) objArr, "");
        this.c = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i).toString());
        } else if (i > objArr.length) {
            throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + objArr.length).toString());
        } else {
            this.b = objArr.length;
            this.e = i;
        }
    }

    public dqI(int i) {
        this(new Object[i], 0);
    }

    @Override // o.dpT, java.util.List
    public T get(int i) {
        dpT.Companion.c(i, size());
        return (T) this.c[(this.d + i) % this.b];
    }

    public final boolean e() {
        return size() == this.b;
    }

    /* loaded from: classes5.dex */
    public static final class e extends dpU<T> {
        final /* synthetic */ dqI<T> b;
        private int c;
        private int e;

        e(dqI<T> dqi) {
            this.b = dqi;
            this.c = dqi.size();
            this.e = ((dqI) dqi).d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.dpU
        protected void b() {
            if (this.c != 0) {
                b(((dqI) this.b).c[this.e]);
                this.e = (this.e + 1) % ((dqI) this.b).b;
                this.c--;
                return;
            }
            e();
        }
    }

    @Override // o.dpT, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return new e(this);
    }

    @Override // o.dpQ, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        Object[] a;
        C8632dsu.c((Object) tArr, "");
        int length = tArr.length;
        T[] tArr2 = tArr;
        if (length < size()) {
            T[] tArr3 = (T[]) Arrays.copyOf(tArr, size());
            C8632dsu.a(tArr3, "");
            tArr2 = tArr3;
        }
        int size = size();
        int i = 0;
        int i2 = 0;
        for (int i3 = this.d; i2 < size && i3 < this.b; i3++) {
            tArr2[i2] = this.c[i3];
            i2++;
        }
        while (i2 < size) {
            tArr2[i2] = this.c[i];
            i2++;
            i++;
        }
        a = C8566dqi.a(size, tArr2);
        return (T[]) a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.dpQ, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dqI<T> c(int i) {
        int i2;
        Object[] array;
        int i3 = this.b;
        i2 = C8657dts.i(i3 + (i3 >> 1) + 1, i);
        if (this.d == 0) {
            array = Arrays.copyOf(this.c, i2);
            C8632dsu.a(array, "");
        } else {
            array = toArray(new Object[i2]);
        }
        return new dqI<>(array, size());
    }

    public final void c(T t) {
        if (e()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.c[(this.d + size()) % this.b] = t;
        this.e = size() + 1;
    }

    public final void e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i).toString());
        } else if (i > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + size()).toString());
        } else if (i > 0) {
            int i2 = this.d;
            int i3 = (i2 + i) % this.b;
            if (i2 > i3) {
                C8564dqg.d(this.c, null, i2, this.b);
                C8564dqg.d(this.c, null, 0, i3);
            } else {
                C8564dqg.d(this.c, null, i2, i3);
            }
            this.d = i3;
            this.e = size() - i;
        }
    }
}
