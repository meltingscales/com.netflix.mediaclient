package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;

/* loaded from: classes.dex */
public final class ScaleFactorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToTenths(float f) {
        float f2 = 10;
        float f3 = f * f2;
        int i = (int) f3;
        if (f3 - i >= 0.5f) {
            i++;
        }
        return i / f2;
    }

    /* renamed from: times-UQTWf7w  reason: not valid java name */
    public static final long m1842timesUQTWf7w(long j, long j2) {
        return SizeKt.Size(Size.m1176getWidthimpl(j) * ScaleFactor.m1837getScaleXimpl(j2), Size.m1174getHeightimpl(j) * ScaleFactor.m1838getScaleYimpl(j2));
    }

    public static final long ScaleFactor(float f, float f2) {
        return ScaleFactor.m1835constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }
}
