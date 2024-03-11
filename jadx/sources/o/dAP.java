package o;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o.dAR;

/* loaded from: classes5.dex */
public class dAP<T extends dAR & Comparable<? super T>> {
    private static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(dAP.class, "_size");
    private volatile int _size;
    private T[] d;

    public final int b() {
        return e.get(this);
    }

    private final void d(int i) {
        e.set(this, i);
    }

    public final boolean e() {
        return b() == 0;
    }

    public final T d() {
        T[] tArr = this.d;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final T e(int i) {
        T[] tArr = this.d;
        C8632dsu.d(tArr);
        d(b() - 1);
        if (i < b()) {
            c(i, b());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                C8632dsu.d(t);
                T t2 = tArr[i2];
                C8632dsu.d(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    c(i, i2);
                    a(i2);
                }
            }
            c(i);
        }
        T t3 = tArr[b()];
        C8632dsu.d(t3);
        t3.a(null);
        t3.d(-1);
        tArr[b()] = null;
        return t3;
    }

    public final void a(T t) {
        t.a(this);
        T[] f = f();
        int b = b();
        d(b + 1);
        f[b] = t;
        t.d(b);
        a(b);
    }

    private final void a(int i) {
        while (i > 0) {
            T[] tArr = this.d;
            C8632dsu.d(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            C8632dsu.d(t);
            T t2 = tArr[i];
            C8632dsu.d(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            c(i, i2);
            i = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (((java.lang.Comparable) r3).compareTo(r4) < 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.b()
            if (r1 < r2) goto Lb
            return
        Lb:
            T extends o.dAR & java.lang.Comparable<? super T>[] r2 = r5.d
            o.C8632dsu.d(r2)
            int r0 = r0 + 2
            int r3 = r5.b()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            o.C8632dsu.d(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            o.C8632dsu.d(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            o.C8632dsu.d(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            o.C8632dsu.d(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
            return
        L3f:
            r5.c(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dAP.c(int):void");
    }

    private final T[] f() {
        T[] tArr = this.d;
        if (tArr == null) {
            T[] tArr2 = (T[]) new dAR[4];
            this.d = tArr2;
            return tArr2;
        } else if (b() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, b() * 2);
            C8632dsu.a(copyOf, "");
            T[] tArr3 = (T[]) ((dAR[]) copyOf);
            this.d = tArr3;
            return tArr3;
        } else {
            return tArr;
        }
    }

    private final void c(int i, int i2) {
        T[] tArr = this.d;
        C8632dsu.d(tArr);
        T t = tArr[i2];
        C8632dsu.d(t);
        T t2 = tArr[i];
        C8632dsu.d(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.d(i);
        t2.d(i2);
    }

    public final T a() {
        T d;
        synchronized (this) {
            d = d();
        }
        return d;
    }

    public final T c() {
        T e2;
        synchronized (this) {
            e2 = b() > 0 ? e(0) : null;
        }
        return e2;
    }

    public final boolean c(T t) {
        boolean z;
        synchronized (this) {
            if (t.d() == null) {
                z = false;
            } else {
                e(t.c());
                z = true;
            }
        }
        return z;
    }
}
