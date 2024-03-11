package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* loaded from: classes.dex */
public final class VectorizedSpringSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    private final /* synthetic */ VectorizedFloatAnimationSpec<V> $$delegate_0;
    private final float dampingRatio;
    private final float stiffness;

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V v, V v2, V v3) {
        return this.$$delegate_0.getDurationNanos(v, v2, v3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getEndVelocity(V v, V v2, V v3) {
        return this.$$delegate_0.getEndVelocity(v, v2, v3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j, V v, V v2, V v3) {
        return this.$$delegate_0.getValueFromNanos(j, v, v2, v3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j, V v, V v2, V v3) {
        return this.$$delegate_0.getVelocityFromNanos(j, v, v2, v3);
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public boolean isInfinite() {
        return this.$$delegate_0.isInfinite();
    }

    private VectorizedSpringSpec(float f, float f2, Animations animations) {
        this.dampingRatio = f;
        this.stiffness = f2;
        this.$$delegate_0 = new VectorizedFloatAnimationSpec<>(animations);
    }

    public VectorizedSpringSpec(float f, float f2, V v) {
        this(f, f2, VectorizedAnimationSpecKt.access$createSpringAnimations(v, f, f2));
    }
}
