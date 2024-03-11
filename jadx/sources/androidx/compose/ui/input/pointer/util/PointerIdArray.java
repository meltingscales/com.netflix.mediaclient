package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.input.pointer.PointerId;
import java.util.Arrays;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class PointerIdArray {
    private long[] internalArray = new long[2];
    private int size;

    public final void clear() {
        this.size = 0;
    }

    public final int getSize() {
        return this.size;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    /* renamed from: get-_I2yYro  reason: not valid java name */
    public final long m1775get_I2yYro(int i) {
        return PointerId.m1717constructorimpl(this.internalArray[i]);
    }

    /* renamed from: remove-0FcD4WY  reason: not valid java name */
    public final boolean m1776remove0FcD4WY(long j) {
        return remove(j);
    }

    public final boolean remove(long j) {
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (j == m1775get_I2yYro(i2)) {
                removeAt(i2);
                return true;
            }
        }
        return false;
    }

    public final boolean removeAt(int i) {
        int i2 = this.size;
        if (i < i2) {
            while (i < i2 - 1) {
                long[] jArr = this.internalArray;
                int i3 = i + 1;
                jArr[i] = jArr[i3];
                i = i3;
            }
            this.size--;
            return true;
        }
        return false;
    }

    public final boolean add(long j) {
        if (contains(j)) {
            return false;
        }
        set(this.size, j);
        return true;
    }

    /* renamed from: add-0FcD4WY  reason: not valid java name */
    public final boolean m1774add0FcD4WY(long j) {
        return add(j);
    }

    public final void set(int i, long j) {
        long[] jArr = this.internalArray;
        if (i >= jArr.length) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i + 1, jArr.length * 2));
            C8632dsu.a(copyOf, "");
            this.internalArray = copyOf;
        }
        this.internalArray[i] = j;
        if (i >= this.size) {
            this.size = i + 1;
        }
    }

    public final boolean contains(long j) {
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.internalArray[i2] == j) {
                return true;
            }
        }
        return false;
    }
}
