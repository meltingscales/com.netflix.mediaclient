package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class PaddingValuesImpl implements PaddingValues {
    private final float bottom;
    private final float end;
    private final float start;
    private final float top;

    public /* synthetic */ PaddingValuesImpl(float f, float f2, float f3, float f4, C8627dsp c8627dsp) {
        this(f, f2, f3, f4);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public float mo248calculateBottomPaddingD9Ej5fM() {
        return this.bottom;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public float mo251calculateTopPaddingD9Ej5fM() {
        return this.top;
    }

    private PaddingValuesImpl(float f, float f2, float f3, float f4) {
        this.start = f;
        this.top = f2;
        this.end = f3;
        this.bottom = f4;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public float mo249calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.start : this.end;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public float mo250calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.end : this.start;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PaddingValuesImpl) {
            PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) obj;
            return Dp.m2494equalsimpl0(this.start, paddingValuesImpl.start) && Dp.m2494equalsimpl0(this.top, paddingValuesImpl.top) && Dp.m2494equalsimpl0(this.end, paddingValuesImpl.end) && Dp.m2494equalsimpl0(this.bottom, paddingValuesImpl.bottom);
        }
        return false;
    }

    public int hashCode() {
        return (((((Dp.m2495hashCodeimpl(this.start) * 31) + Dp.m2495hashCodeimpl(this.top)) * 31) + Dp.m2495hashCodeimpl(this.end)) * 31) + Dp.m2495hashCodeimpl(this.bottom);
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) Dp.m2496toStringimpl(this.start)) + ", top=" + ((Object) Dp.m2496toStringimpl(this.top)) + ", end=" + ((Object) Dp.m2496toStringimpl(this.end)) + ", bottom=" + ((Object) Dp.m2496toStringimpl(this.bottom)) + ')';
    }
}
