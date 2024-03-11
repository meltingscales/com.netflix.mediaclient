package androidx.compose.animation.core;

import o.C8627dsp;

/* loaded from: classes.dex */
public final class FloatSpringSpec implements FloatAnimationSpec {
    private final float dampingRatio;
    private final SpringSimulation spring;
    private final float stiffness;
    private final float visibilityThreshold;

    public FloatSpringSpec() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getEndVelocity(float f, float f2, float f3) {
        return 0.0f;
    }

    public FloatSpringSpec(float f, float f2, float f3) {
        this.dampingRatio = f;
        this.stiffness = f2;
        this.visibilityThreshold = f3;
        SpringSimulation springSimulation = new SpringSimulation(1.0f);
        springSimulation.setDampingRatio(f);
        springSimulation.setStiffness(f2);
        this.spring = springSimulation;
    }

    public /* synthetic */ FloatSpringSpec(float f, float f2, float f3, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? 0.01f : f3);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long j, float f, float f2, float f3) {
        this.spring.setFinalPosition(f2);
        return Motion.m59getValueimpl(this.spring.m64updateValuesIJZedt4$animation_core_release(f, f3, j / 1000000));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long j, float f, float f2, float f3) {
        this.spring.setFinalPosition(f2);
        return Motion.m60getVelocityimpl(this.spring.m64updateValuesIJZedt4$animation_core_release(f, f3, j / 1000000));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float f, float f2, float f3) {
        float stiffness = this.spring.getStiffness();
        float dampingRatio = this.spring.getDampingRatio();
        float f4 = this.visibilityThreshold;
        return SpringEstimationKt.estimateAnimationDurationMillis(stiffness, dampingRatio, f3 / f4, (f - f2) / f4, 1.0f) * 1000000;
    }
}
