package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.ConcurrentModificationException;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class ArraySetKt {
    public static final <E> int binarySearchInternal(ArraySet<E> arraySet, int i) {
        C8632dsu.c((Object) arraySet, "");
        try {
            return ContainerHelpersKt.binarySearch(arraySet.getHashes$collection(), arraySet.get_size$collection(), i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> int indexOf(ArraySet<E> arraySet, Object obj, int i) {
        C8632dsu.c((Object) arraySet, "");
        int i2 = arraySet.get_size$collection();
        if (i2 == 0) {
            return -1;
        }
        int binarySearchInternal = binarySearchInternal(arraySet, i);
        if (binarySearchInternal >= 0 && !C8632dsu.c(obj, arraySet.getArray$collection()[binarySearchInternal])) {
            int i3 = binarySearchInternal + 1;
            while (i3 < i2 && arraySet.getHashes$collection()[i3] == i) {
                if (C8632dsu.c(obj, arraySet.getArray$collection()[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = binarySearchInternal - 1; i4 >= 0 && arraySet.getHashes$collection()[i4] == i; i4--) {
                if (C8632dsu.c(obj, arraySet.getArray$collection()[i4])) {
                    return i4;
                }
            }
            return ~i3;
        }
        return binarySearchInternal;
    }

    public static final <E> int indexOfNull(ArraySet<E> arraySet) {
        C8632dsu.c((Object) arraySet, "");
        return indexOf(arraySet, null, 0);
    }

    public static final <E> void allocArrays(ArraySet<E> arraySet, int i) {
        C8632dsu.c((Object) arraySet, "");
        arraySet.setHashes$collection(new int[i]);
        arraySet.setArray$collection(new Object[i]);
    }
}
