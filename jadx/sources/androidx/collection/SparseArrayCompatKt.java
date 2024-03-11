package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class SparseArrayCompatKt {
    private static final Object DELETED = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> void gc(SparseArrayCompat<E> sparseArrayCompat) {
        int i = sparseArrayCompat.size;
        int[] iArr = sparseArrayCompat.keys;
        Object[] objArr = sparseArrayCompat.values;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != DELETED) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        sparseArrayCompat.garbage = false;
        sparseArrayCompat.size = i2;
    }

    public static final <E> E commonGet(SparseArrayCompat<E> sparseArrayCompat, int i) {
        E e;
        C8632dsu.c((Object) sparseArrayCompat, "");
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        if (binarySearch < 0 || (e = (E) sparseArrayCompat.values[binarySearch]) == DELETED) {
            return null;
        }
        return e;
    }

    public static final <E> E commonGet(SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        E e2;
        C8632dsu.c((Object) sparseArrayCompat, "");
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        return (binarySearch < 0 || (e2 = (E) sparseArrayCompat.values[binarySearch]) == DELETED) ? e : e2;
    }
}
