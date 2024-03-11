package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;

/* loaded from: classes.dex */
public final class OffsetKt {
    /* renamed from: lerp-Wko1d7g  reason: not valid java name */
    public static final long m1152lerpWko1d7g(long j, long j2, float f) {
        return Offset(MathHelpersKt.lerp(Offset.m1137getXimpl(j), Offset.m1137getXimpl(j2), f), MathHelpersKt.lerp(Offset.m1138getYimpl(j), Offset.m1138getYimpl(j2), f));
    }

    /* renamed from: isFinite-k-4lQ0M  reason: not valid java name */
    public static final boolean m1150isFinitek4lQ0M(long j) {
        float m1137getXimpl = Offset.m1137getXimpl(j);
        if (!Float.isInfinite(m1137getXimpl) && !Float.isNaN(m1137getXimpl)) {
            float m1138getYimpl = Offset.m1138getYimpl(j);
            if (!Float.isInfinite(m1138getYimpl) && !Float.isNaN(m1138getYimpl)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isSpecified-k-4lQ0M  reason: not valid java name */
    public static final boolean m1151isSpecifiedk4lQ0M(long j) {
        return j != Offset.Companion.m1148getUnspecifiedF1C5BW0();
    }

    public static final long Offset(float f, float f2) {
        return Offset.m1129constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }
}
