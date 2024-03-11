package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import o.C8627dsp;

/* loaded from: classes.dex */
public final class DeltaCounter {
    private int count;

    public DeltaCounter() {
        this(0, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeltaCounter) && this.count == ((DeltaCounter) obj).count;
    }

    public final int getCount() {
        return this.count;
    }

    public int hashCode() {
        return Integer.hashCode(this.count);
    }

    public final void plusAssign(int i) {
        this.count += i;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public String toString() {
        return "DeltaCounter(count=" + this.count + ')';
    }

    public DeltaCounter(int i) {
        this.count = i;
    }

    public /* synthetic */ DeltaCounter(int i, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
