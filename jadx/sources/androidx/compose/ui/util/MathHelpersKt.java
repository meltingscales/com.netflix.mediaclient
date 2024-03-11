package androidx.compose.ui.util;

import o.dsT;

/* loaded from: classes.dex */
public final class MathHelpersKt {
    public static final float lerp(float f, float f2, float f3) {
        return ((1 - f3) * f) + (f3 * f2);
    }

    public static final int lerp(int i, int i2, float f) {
        int b;
        b = dsT.b((i2 - i) * f);
        return i + b;
    }
}
