package androidx.compose.ui.unit;

import androidx.compose.ui.util.MathHelpersKt;

/* loaded from: classes.dex */
public final class TextUnitKt {
    /* renamed from: TextUnit-anM5pPY  reason: not valid java name */
    public static final long m2565TextUnitanM5pPY(float f, long j) {
        return pack(j, f);
    }

    /* renamed from: isUnspecified--R2X_6o  reason: not valid java name */
    public static final boolean m2568isUnspecifiedR2X_6o(long j) {
        return TextUnit.m2558getRawTypeimpl(j) == 0;
    }

    public static final long getSp(float f) {
        return pack(4294967296L, f);
    }

    public static final long getSp(double d) {
        return pack(4294967296L, (float) d);
    }

    public static final long getSp(int i) {
        return pack(4294967296L, i);
    }

    public static final long pack(long j, float f) {
        return TextUnit.m2555constructorimpl(j | (Float.floatToIntBits(f) & 4294967295L));
    }

    /* renamed from: checkArithmetic--R2X_6o  reason: not valid java name */
    public static final void m2566checkArithmeticR2X_6o(long j) {
        if (!(!m2568isUnspecifiedR2X_6o(j))) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
    }

    /* renamed from: checkArithmetic-NB67dxo  reason: not valid java name */
    public static final void m2567checkArithmeticNB67dxo(long j, long j2) {
        if (m2568isUnspecifiedR2X_6o(j) || m2568isUnspecifiedR2X_6o(j2)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        if (TextUnitType.m2573equalsimpl0(TextUnit.m2559getTypeUIouoOA(j), TextUnit.m2559getTypeUIouoOA(j2))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m2575toStringimpl(TextUnit.m2559getTypeUIouoOA(j))) + " and " + ((Object) TextUnitType.m2575toStringimpl(TextUnit.m2559getTypeUIouoOA(j2)))).toString());
    }

    /* renamed from: lerp-C3pnCVY  reason: not valid java name */
    public static final long m2569lerpC3pnCVY(long j, long j2, float f) {
        m2567checkArithmeticNB67dxo(j, j2);
        return pack(TextUnit.m2558getRawTypeimpl(j), MathHelpersKt.lerp(TextUnit.m2560getValueimpl(j), TextUnit.m2560getValueimpl(j2), f));
    }
}
