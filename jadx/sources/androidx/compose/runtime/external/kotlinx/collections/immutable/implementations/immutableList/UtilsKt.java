package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;

/* loaded from: classes.dex */
public final class UtilsKt {
    public static final int indexSegment(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] presizedBufferWith(Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static final int rootSize(int i) {
        return (i - 1) & (-32);
    }

    public static final <E> PersistentList<E> persistentVectorOf() {
        return SmallPersistentVector.Companion.getEMPTY();
    }
}
