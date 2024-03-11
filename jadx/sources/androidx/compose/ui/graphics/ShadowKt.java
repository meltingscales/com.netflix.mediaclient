package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;

/* loaded from: classes.dex */
public final class ShadowKt {
    public static final Shadow lerp(Shadow shadow, Shadow shadow2, float f) {
        return new Shadow(ColorKt.m1315lerpjxsXWHM(shadow.m1431getColor0d7_KjU(), shadow2.m1431getColor0d7_KjU(), f), OffsetKt.m1152lerpWko1d7g(shadow.m1432getOffsetF1C5BW0(), shadow2.m1432getOffsetF1C5BW0(), f), MathHelpersKt.lerp(shadow.getBlurRadius(), shadow2.getBlurRadius(), f), null);
    }
}
