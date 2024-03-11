package o;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes5.dex */
public final class dAF<T> {
    private volatile AtomicReferenceArray<T> array;

    public dAF(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final int d() {
        return this.array.length();
    }

    public final T a(int i) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    public final void c(int i, T t) {
        int b;
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, t);
            return;
        }
        b = C8657dts.b(i + 1, length * 2);
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(b);
        for (int i2 = 0; i2 < length; i2++) {
            atomicReferenceArray2.set(i2, atomicReferenceArray.get(i2));
        }
        atomicReferenceArray2.set(i, t);
        this.array = atomicReferenceArray2;
    }
}
