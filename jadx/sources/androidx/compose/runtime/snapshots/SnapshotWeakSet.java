package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.WeakReference;
import o.C8564dqg;

/* loaded from: classes.dex */
public final class SnapshotWeakSet<T> {
    private int size;
    private int[] hashes = new int[16];
    private WeakReference<T>[] values = new WeakReference[16];

    public final int[] getHashes$runtime_release() {
        return this.hashes;
    }

    public final int getSize$runtime_release() {
        return this.size;
    }

    public final WeakReference<T>[] getValues$runtime_release() {
        return this.values;
    }

    public final void setSize$runtime_release(int i) {
        this.size = i;
    }

    public final boolean add(T t) {
        int i;
        int i2 = this.size;
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(t);
        if (i2 > 0) {
            i = find(t, identityHashCode);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i3 = -(i + 1);
        WeakReference<T>[] weakReferenceArr = this.values;
        int length = weakReferenceArr.length;
        if (i2 == length) {
            int i4 = length * 2;
            WeakReference<T>[] weakReferenceArr2 = new WeakReference[i4];
            int[] iArr = new int[i4];
            int i5 = i3 + 1;
            C8564dqg.d(weakReferenceArr, weakReferenceArr2, i5, i3, i2);
            C8564dqg.e(this.values, weakReferenceArr2, 0, 0, i3, 6, null);
            C8564dqg.c(this.hashes, iArr, i5, i3, i2);
            C8564dqg.b(this.hashes, iArr, 0, 0, i3, 6, null);
            this.values = weakReferenceArr2;
            this.hashes = iArr;
        } else {
            int i6 = i3 + 1;
            C8564dqg.d(weakReferenceArr, weakReferenceArr, i6, i3, i2);
            int[] iArr2 = this.hashes;
            C8564dqg.c(iArr2, iArr2, i6, i3, i2);
        }
        this.values[i3] = new WeakReference<>(t);
        this.hashes[i3] = identityHashCode;
        this.size++;
        return true;
    }

    private final int find(T t, int i) {
        int i2 = this.size - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.hashes[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                WeakReference<T> weakReference = this.values[i4];
                return t == (weakReference != null ? weakReference.get() : null) ? i4 : findExactIndex(i4, t, i);
            } else {
                i2 = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    private final int findExactIndex(int i, T t, int i2) {
        int i3 = i - 1;
        while (true) {
            if (-1 >= i3 || this.hashes[i3] != i2) {
                break;
            }
            WeakReference<T> weakReference = this.values[i3];
            if ((weakReference != null ? weakReference.get() : null) == t) {
                return i3;
            }
            i3--;
        }
        int i4 = i + 1;
        int i5 = this.size;
        while (true) {
            if (i4 >= i5) {
                i4 = this.size;
                break;
            } else if (this.hashes[i4] != i2) {
                break;
            } else {
                WeakReference<T> weakReference2 = this.values[i4];
                if ((weakReference2 != null ? weakReference2.get() : null) == t) {
                    return i4;
                }
                i4++;
            }
        }
        return -(i4 + 1);
    }
}
