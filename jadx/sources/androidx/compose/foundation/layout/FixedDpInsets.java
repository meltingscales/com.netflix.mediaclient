package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8627dsp;

/* loaded from: classes5.dex */
final class FixedDpInsets implements WindowInsets {
    private final float bottomDp;
    private final float leftDp;
    private final float rightDp;
    private final float topDp;

    public /* synthetic */ FixedDpInsets(float f, float f2, float f3, float f4, C8627dsp c8627dsp) {
        this(f, f2, f3, f4);
    }

    private FixedDpInsets(float f, float f2, float f3, float f4) {
        this.leftDp = f;
        this.topDp = f2;
        this.rightDp = f3;
        this.bottomDp = f4;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return density.mo187roundToPx0680j_4(this.leftDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        return density.mo187roundToPx0680j_4(this.topDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return density.mo187roundToPx0680j_4(this.rightDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return density.mo187roundToPx0680j_4(this.bottomDp);
    }

    public String toString() {
        return "Insets(left=" + ((Object) Dp.m2496toStringimpl(this.leftDp)) + ", top=" + ((Object) Dp.m2496toStringimpl(this.topDp)) + ", right=" + ((Object) Dp.m2496toStringimpl(this.rightDp)) + ", bottom=" + ((Object) Dp.m2496toStringimpl(this.bottomDp)) + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FixedDpInsets) {
            FixedDpInsets fixedDpInsets = (FixedDpInsets) obj;
            return Dp.m2494equalsimpl0(this.leftDp, fixedDpInsets.leftDp) && Dp.m2494equalsimpl0(this.topDp, fixedDpInsets.topDp) && Dp.m2494equalsimpl0(this.rightDp, fixedDpInsets.rightDp) && Dp.m2494equalsimpl0(this.bottomDp, fixedDpInsets.bottomDp);
        }
        return false;
    }

    public int hashCode() {
        int m2495hashCodeimpl = Dp.m2495hashCodeimpl(this.leftDp);
        int m2495hashCodeimpl2 = Dp.m2495hashCodeimpl(this.topDp);
        return (((((m2495hashCodeimpl * 31) + m2495hashCodeimpl2) * 31) + Dp.m2495hashCodeimpl(this.rightDp)) * 31) + Dp.m2495hashCodeimpl(this.bottomDp);
    }
}
