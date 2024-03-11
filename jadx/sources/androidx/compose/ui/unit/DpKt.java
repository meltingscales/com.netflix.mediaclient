package androidx.compose.ui.unit;

import androidx.compose.ui.util.MathHelpersKt;

/* loaded from: classes.dex */
public final class DpKt {
    /* renamed from: lerp-Md-fbLM  reason: not valid java name */
    public static final float m2504lerpMdfbLM(float f, float f2, float f3) {
        return Dp.m2492constructorimpl(MathHelpersKt.lerp(f, f2, f3));
    }

    /* renamed from: DpOffset-YgX7TsA  reason: not valid java name */
    public static final long m2502DpOffsetYgX7TsA(float f, float f2) {
        return DpOffset.m2506constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: DpSize-YgX7TsA  reason: not valid java name */
    public static final long m2503DpSizeYgX7TsA(float f, float f2) {
        return DpSize.m2515constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }
}
