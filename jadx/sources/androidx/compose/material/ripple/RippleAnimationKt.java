package androidx.compose.material.ripple;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class RippleAnimationKt {
    private static final float BoundedRippleExtraRadius = Dp.m2492constructorimpl(10);

    /* renamed from: getRippleStartRadius-uvyYCjk  reason: not valid java name */
    public static final float m705getRippleStartRadiusuvyYCjk(long j) {
        return Math.max(Size.m1176getWidthimpl(j), Size.m1174getHeightimpl(j)) * 0.3f;
    }

    /* renamed from: getRippleEndRadius-cSwnlzA  reason: not valid java name */
    public static final float m704getRippleEndRadiuscSwnlzA(Density density, boolean z, long j) {
        float m1135getDistanceimpl = Offset.m1135getDistanceimpl(OffsetKt.Offset(Size.m1176getWidthimpl(j), Size.m1174getHeightimpl(j))) / 2.0f;
        return z ? m1135getDistanceimpl + density.mo193toPx0680j_4(BoundedRippleExtraRadius) : m1135getDistanceimpl;
    }
}
