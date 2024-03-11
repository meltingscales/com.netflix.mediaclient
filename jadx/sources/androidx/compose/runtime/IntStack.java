package androidx.compose.runtime;

import java.util.Arrays;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class IntStack {
    private int[] slots = new int[10];
    private int tos;

    public final void clear() {
        this.tos = 0;
    }

    public final int getSize() {
        return this.tos;
    }

    public final boolean isEmpty() {
        return this.tos == 0;
    }

    public final void push(int i) {
        int i2 = this.tos;
        int[] iArr = this.slots;
        if (i2 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            C8632dsu.a(copyOf, "");
            this.slots = copyOf;
        }
        int[] iArr2 = this.slots;
        int i3 = this.tos;
        this.tos = i3 + 1;
        iArr2[i3] = i;
    }

    public final int pop() {
        int[] iArr = this.slots;
        int i = this.tos - 1;
        this.tos = i;
        return iArr[i];
    }

    public final int peekOr(int i) {
        return this.tos > 0 ? peek() : i;
    }

    public final int peek() {
        return this.slots[this.tos - 1];
    }

    public final int peek(int i) {
        return this.slots[i];
    }

    public final int indexOf(int i) {
        int i2 = this.tos;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.slots[i3] == i) {
                return i3;
            }
        }
        return -1;
    }
}
