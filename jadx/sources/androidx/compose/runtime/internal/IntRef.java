package androidx.compose.runtime.internal;

import o.C8627dsp;
import o.C8632dsu;
import o.C8672dug;

/* loaded from: classes.dex */
public final class IntRef {
    private int element;

    public IntRef() {
        this(0, 1, null);
    }

    public final int getElement() {
        return this.element;
    }

    public final void setElement(int i) {
        this.element = i;
    }

    public IntRef(int i) {
        this.element = i;
    }

    public /* synthetic */ IntRef(int i, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public String toString() {
        int c;
        StringBuilder sb = new StringBuilder();
        sb.append("IntRef(element = ");
        sb.append(this.element);
        sb.append(")@");
        int hashCode = hashCode();
        c = C8672dug.c(16);
        String num = Integer.toString(hashCode, c);
        C8632dsu.a(num, "");
        sb.append(num);
        return sb.toString();
    }
}
