package androidx.compose.animation.core;

/* loaded from: classes.dex */
public final class SpringSimulationKt {
    private static final float UNSET = Float.MAX_VALUE;

    public static final float getUNSET() {
        return UNSET;
    }

    public static final long Motion(float f, float f2) {
        return Motion.m57constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }
}
