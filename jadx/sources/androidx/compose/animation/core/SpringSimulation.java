package androidx.compose.animation.core;

/* loaded from: classes.dex */
public final class SpringSimulation {
    private double dampedFreq;
    private float finalPosition;
    private double gammaMinus;
    private double gammaPlus;
    private boolean initialized;
    private double naturalFreq = Math.sqrt(50.0d);
    private float dampingRatio = 1.0f;

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getStiffness() {
        double d = this.naturalFreq;
        return (float) (d * d);
    }

    public final void setFinalPosition(float f) {
        this.finalPosition = f;
    }

    public SpringSimulation(float f) {
        this.finalPosition = f;
    }

    public final void setStiffness(float f) {
        if (getStiffness() <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f);
        this.initialized = false;
    }

    public final void setDampingRatio(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.dampingRatio = f;
        this.initialized = false;
    }

    private final void init() {
        if (this.initialized) {
            return;
        }
        if (this.finalPosition == SpringSimulationKt.getUNSET()) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        float f = this.dampingRatio;
        double d = f;
        double d2 = d * d;
        if (f > 1.0f) {
            double d3 = this.naturalFreq;
            double d4 = d2 - 1;
            this.gammaPlus = ((-f) * d3) + (d3 * Math.sqrt(d4));
            double d5 = this.naturalFreq;
            this.gammaMinus = ((-this.dampingRatio) * d5) - (d5 * Math.sqrt(d4));
        } else if (f >= 0.0f && f < 1.0f) {
            this.dampedFreq = this.naturalFreq * Math.sqrt(1 - d2);
        }
        this.initialized = true;
    }

    /* renamed from: updateValues-IJZedt4$animation_core_release  reason: not valid java name */
    public final long m64updateValuesIJZedt4$animation_core_release(float f, float f2, long j) {
        double exp;
        float f3;
        double cos;
        init();
        float f4 = f - this.finalPosition;
        double d = j / 1000.0d;
        float f5 = this.dampingRatio;
        if (f5 > 1.0f) {
            double d2 = f4;
            double d3 = this.gammaMinus;
            double d4 = ((d3 * d2) - f2) / (d3 - this.gammaPlus);
            double d5 = d2 - d4;
            exp = (Math.exp(d3 * d) * d5) + (Math.exp(this.gammaPlus * d) * d4);
            double d6 = this.gammaMinus;
            double exp2 = Math.exp(d6 * d);
            double d7 = this.gammaPlus;
            cos = (d5 * d6 * exp2) + (d4 * d7 * Math.exp(d7 * d));
        } else if (f5 == 1.0f) {
            double d8 = this.naturalFreq;
            double d9 = f4;
            double d10 = f2 + (d8 * d9);
            double d11 = d9 + (d10 * d);
            double exp3 = Math.exp((-d8) * d);
            double exp4 = Math.exp((-this.naturalFreq) * d);
            double d12 = -this.naturalFreq;
            cos = (d10 * Math.exp(d12 * d)) + (exp4 * d11 * d12);
            exp = d11 * exp3;
        } else {
            double d13 = this.naturalFreq;
            double d14 = f4;
            double d15 = (1 / this.dampedFreq) * ((f5 * d13 * d14) + f2);
            exp = Math.exp((-f5) * d13 * d) * ((Math.cos(this.dampedFreq * d) * d14) + (Math.sin(this.dampedFreq * d) * d15));
            double d16 = this.naturalFreq;
            double d17 = this.dampingRatio;
            double exp5 = Math.exp((-f3) * d16 * d);
            double d18 = this.dampedFreq;
            double d19 = -d18;
            double sin = Math.sin(d18 * d);
            double d20 = this.dampedFreq;
            cos = (((d19 * d14 * sin) + (d15 * d20 * Math.cos(d20 * d))) * exp5) + ((-d16) * exp * d17);
        }
        return SpringSimulationKt.Motion((float) (exp + this.finalPosition), (float) cos);
    }
}
