package androidx.compose.runtime.collection;

import android.util.SparseArray;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class IntMap<E> {
    private final SparseArray<E> sparseArray;

    private IntMap(SparseArray<E> sparseArray) {
        this.sparseArray = sparseArray;
    }

    public IntMap(int i) {
        this(new SparseArray(i));
    }

    public /* synthetic */ IntMap(int i, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    public final E get(int i) {
        return this.sparseArray.get(i);
    }

    public final void set(int i, E e) {
        this.sparseArray.put(i, e);
    }
}
