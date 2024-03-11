package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class TargetBasedAnimation<T, V extends AnimationVector> implements Animation<T, V> {
    private final VectorizedAnimationSpec<V> animationSpec;
    private final long durationNanos;
    private final V endVelocity;
    private final T initialValue;
    private final V initialValueVector;
    private final V initialVelocityVector;
    private final T targetValue;
    private final V targetValueVector;
    private final TwoWayConverter<T, V> typeConverter;

    @Override // androidx.compose.animation.core.Animation
    public long getDurationNanos() {
        return this.durationNanos;
    }

    public final T getInitialValue() {
        return this.initialValue;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getTargetValue() {
        return this.targetValue;
    }

    @Override // androidx.compose.animation.core.Animation
    public TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public TargetBasedAnimation(VectorizedAnimationSpec<V> vectorizedAnimationSpec, TwoWayConverter<T, V> twoWayConverter, T t, T t2, V v) {
        this.animationSpec = vectorizedAnimationSpec;
        this.typeConverter = twoWayConverter;
        this.initialValue = t;
        this.targetValue = t2;
        V invoke = getTypeConverter().getConvertToVector().invoke(t);
        this.initialValueVector = invoke;
        V invoke2 = getTypeConverter().getConvertToVector().invoke(getTargetValue());
        this.targetValueVector = invoke2;
        V v2 = (v == null || (v2 = (V) AnimationVectorsKt.copy(v)) == null) ? (V) AnimationVectorsKt.newInstance(getTypeConverter().getConvertToVector().invoke(t)) : v2;
        this.initialVelocityVector = v2;
        this.durationNanos = vectorizedAnimationSpec.getDurationNanos(invoke, invoke2, v2);
        this.endVelocity = vectorizedAnimationSpec.getEndVelocity(invoke, invoke2, v2);
    }

    public /* synthetic */ TargetBasedAnimation(AnimationSpec animationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector, int i, C8627dsp c8627dsp) {
        this(animationSpec, twoWayConverter, obj, obj2, (i & 16) != 0 ? null : animationVector);
    }

    public TargetBasedAnimation(AnimationSpec<T> animationSpec, TwoWayConverter<T, V> twoWayConverter, T t, T t2, V v) {
        this(animationSpec.vectorize(twoWayConverter), twoWayConverter, t, t2, v);
    }

    @Override // androidx.compose.animation.core.Animation
    public boolean isInfinite() {
        return this.animationSpec.isInfinite();
    }

    @Override // androidx.compose.animation.core.Animation
    public T getValueFromNanos(long j) {
        if (!isFinishedFromNanos(j)) {
            V valueFromNanos = this.animationSpec.getValueFromNanos(j, this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
            int size$animation_core_release = valueFromNanos.getSize$animation_core_release();
            for (int i = 0; i < size$animation_core_release; i++) {
                if (!(!Float.isNaN(valueFromNanos.get$animation_core_release(i)))) {
                    throw new IllegalStateException(("AnimationVector cannot contain a NaN. " + valueFromNanos + ". Animation: " + this + ", playTimeNanos: " + j).toString());
                }
            }
            return getTypeConverter().getConvertFromVector().invoke(valueFromNanos);
        }
        return getTargetValue();
    }

    @Override // androidx.compose.animation.core.Animation
    public V getVelocityVectorFromNanos(long j) {
        return !isFinishedFromNanos(j) ? this.animationSpec.getVelocityFromNanos(j, this.initialValueVector, this.targetValueVector, this.initialVelocityVector) : this.endVelocity;
    }

    public String toString() {
        return "TargetBasedAnimation: " + this.initialValue + " -> " + getTargetValue() + ",initial velocity: " + this.initialVelocityVector + ", duration: " + AnimationKt.getDurationMillis(this) + " ms,animationSpec: " + this.animationSpec;
    }
}
