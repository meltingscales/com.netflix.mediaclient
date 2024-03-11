package androidx.compose.animation.core;

import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class SpringSpec<T> implements FiniteAnimationSpec<T> {
    private final float dampingRatio;
    private final float stiffness;
    private final T visibilityThreshold;

    public SpringSpec() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    public final T getVisibilityThreshold() {
        return this.visibilityThreshold;
    }

    public SpringSpec(float f, float f2, T t) {
        this.dampingRatio = f;
        this.stiffness = f2;
        this.visibilityThreshold = t;
    }

    public /* synthetic */ SpringSpec(float f, float f2, Object obj, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? null : obj);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedSpringSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        AnimationVector convert;
        float f = this.dampingRatio;
        float f2 = this.stiffness;
        convert = AnimationSpecKt.convert(twoWayConverter, this.visibilityThreshold);
        return new VectorizedSpringSpec<>(f, f2, convert);
    }

    public boolean equals(Object obj) {
        if (obj instanceof SpringSpec) {
            SpringSpec springSpec = (SpringSpec) obj;
            if (springSpec.dampingRatio == this.dampingRatio && springSpec.stiffness == this.stiffness && C8632dsu.c(springSpec.visibilityThreshold, this.visibilityThreshold)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        T t = this.visibilityThreshold;
        return ((((t != null ? t.hashCode() : 0) * 31) + Float.hashCode(this.dampingRatio)) * 31) + Float.hashCode(this.stiffness);
    }
}
