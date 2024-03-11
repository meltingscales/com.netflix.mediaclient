package androidx.compose.animation.core;

/* loaded from: classes.dex */
public final class CubicBezierEasing implements Easing {
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    private final float evaluateCubic(float f, float f2, float f3) {
        float f4 = 3;
        float f5 = 1 - f3;
        return (f * f4 * f5 * f5 * f3) + (f4 * f2 * f5 * f3 * f3) + (f3 * f3 * f3);
    }

    public CubicBezierEasing(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) {
            throw new IllegalArgumentException(("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", " + f4 + '.').toString());
        }
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float f) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            float f3 = 1.0f;
            if (f < 1.0f) {
                while (true) {
                    float f4 = (f2 + f3) / 2;
                    float evaluateCubic = evaluateCubic(this.a, this.c, f4);
                    if (Math.abs(f - evaluateCubic) < 0.001f) {
                        return evaluateCubic(this.b, this.d, f4);
                    }
                    if (evaluateCubic < f) {
                        f2 = f4;
                    } else {
                        f3 = f4;
                    }
                }
            }
        }
        return f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof CubicBezierEasing) {
            CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) obj;
            if (this.a == cubicBezierEasing.a && this.b == cubicBezierEasing.b && this.c == cubicBezierEasing.c && this.d == cubicBezierEasing.d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.c)) * 31) + Float.hashCode(this.d);
    }
}
