package androidx.compose.animation;

/* loaded from: classes.dex */
public final class FlingCalculatorKt {
    private static final float DecelerationRate = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: Access modifiers changed from: private */
    public static final float computeDeceleration(float f, float f2) {
        return f2 * 386.0878f * 160.0f * f;
    }
}
