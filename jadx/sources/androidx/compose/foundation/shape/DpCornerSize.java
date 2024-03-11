package androidx.compose.foundation.shape;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import o.C8627dsp;

/* loaded from: classes.dex */
final class DpCornerSize implements CornerSize {
    private final float size;

    public /* synthetic */ DpCornerSize(float f, C8627dsp c8627dsp) {
        this(f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DpCornerSize) && Dp.m2494equalsimpl0(this.size, ((DpCornerSize) obj).size);
    }

    public int hashCode() {
        return Dp.m2495hashCodeimpl(this.size);
    }

    private DpCornerSize(float f) {
        this.size = f;
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo397toPxTmRCtEA(long j, Density density) {
        return density.mo193toPx0680j_4(this.size);
    }

    public String toString() {
        return "CornerSize(size = " + this.size + ".dp)";
    }
}
