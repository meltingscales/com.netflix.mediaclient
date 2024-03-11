package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.LongSparseArray;
import o.AbstractC8581dqx;

/* loaded from: classes2.dex */
public final class LongSparseArrayKt {
    public static final <T> AbstractC8581dqx keyIterator(final LongSparseArray<T> longSparseArray) {
        return new AbstractC8581dqx() { // from class: androidx.core.util.LongSparseArrayKt$keyIterator$1
            private int index;

            @Override // java.util.Iterator
            @SuppressLint({"ClassVerificationFailure"})
            public boolean hasNext() {
                return this.index < longSparseArray.size();
            }

            @Override // o.AbstractC8581dqx
            @SuppressLint({"ClassVerificationFailure"})
            public long nextLong() {
                LongSparseArray<T> longSparseArray2 = longSparseArray;
                int i = this.index;
                this.index = i + 1;
                return longSparseArray2.keyAt(i);
            }
        };
    }
}
