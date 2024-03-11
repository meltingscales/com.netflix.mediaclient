package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import o.C8657dts;

/* loaded from: classes.dex */
public final class DecayAnimation<T, V extends AnimationVector> implements Animation<T, V> {
    private final VectorizedDecayAnimationSpec<V> animationSpec;
    private final long durationNanos;
    private final V endVelocity;
    private final T initialValue;
    private final V initialValueVector;
    private final V initialVelocityVector;
    private final boolean isInfinite;
    private final T targetValue;
    private final TwoWayConverter<T, V> typeConverter;

    @Override // androidx.compose.animation.core.Animation
    public long getDurationNanos() {
        return this.durationNanos;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getTargetValue() {
        return this.targetValue;
    }

    @Override // androidx.compose.animation.core.Animation
    public TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @Override // androidx.compose.animation.core.Animation
    public boolean isInfinite() {
        return this.isInfinite;
    }

    public DecayAnimation(VectorizedDecayAnimationSpec<V> vectorizedDecayAnimationSpec, TwoWayConverter<T, V> twoWayConverter, T t, V v) {
        float a;
        this.animationSpec = vectorizedDecayAnimationSpec;
        this.typeConverter = twoWayConverter;
        this.initialValue = t;
        V invoke = getTypeConverter().getConvertToVector().invoke(t);
        this.initialValueVector = invoke;
        this.initialVelocityVector = (V) AnimationVectorsKt.copy(v);
        this.targetValue = getTypeConverter().getConvertFromVector().invoke(vectorizedDecayAnimationSpec.getTargetValue(invoke, v));
        this.durationNanos = vectorizedDecayAnimationSpec.getDurationNanos(invoke, v);
        V v2 = (V) AnimationVectorsKt.copy(vectorizedDecayAnimationSpec.getVelocityFromNanos(getDurationNanos(), invoke, v));
        this.endVelocity = v2;
        int size$animation_core_release = v2.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v3 = this.endVelocity;
            a = C8657dts.a(v3.get$animation_core_release(i), -this.animationSpec.getAbsVelocityThreshold(), this.animationSpec.getAbsVelocityThreshold());
            v3.set$animation_core_release(i, a);
        }
    }

    public DecayAnimation(DecayAnimationSpec<T> decayAnimationSpec, TwoWayConverter<T, V> twoWayConverter, T t, V v) {
        this(decayAnimationSpec.vectorize(twoWayConverter), twoWayConverter, t, v);
    }

    @Override // androidx.compose.animation.core.Animation
    public T getValueFromNanos(long j) {
        if (!isFinishedFromNanos(j)) {
            return getTypeConverter().getConvertFromVector().invoke(this.animationSpec.getValueFromNanos(j, this.initialValueVector, this.initialVelocityVector));
        }
        return getTargetValue();
    }

    @Override // androidx.compose.animation.core.Animation
    public V getVelocityVectorFromNanos(long j) {
        return !isFinishedFromNanos(j) ? this.animationSpec.getVelocityFromNanos(j, this.initialValueVector, this.initialVelocityVector) : this.endVelocity;
    }
}
