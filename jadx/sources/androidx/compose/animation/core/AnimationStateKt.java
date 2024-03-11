package androidx.compose.animation.core;

import o.C8626dso;

/* loaded from: classes.dex */
public final class AnimationStateKt {
    public static /* synthetic */ AnimationState copy$default(AnimationState animationState, Object obj, AnimationVector animationVector, long j, long j2, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = animationState.getValue();
        }
        if ((i & 2) != 0) {
            animationVector = AnimationVectorsKt.copy(animationState.getVelocityVector());
        }
        AnimationVector animationVector2 = animationVector;
        if ((i & 4) != 0) {
            j = animationState.getLastFrameTimeNanos();
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = animationState.getFinishedTimeNanos();
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            z = animationState.isRunning();
        }
        return copy(animationState, obj, animationVector2, j3, j4, z);
    }

    public static final <T, V extends AnimationVector> AnimationState<T, V> copy(AnimationState<T, V> animationState, T t, V v, long j, long j2, boolean z) {
        return new AnimationState<>(animationState.getTypeConverter(), t, v, j, j2, z);
    }

    public static /* synthetic */ AnimationState copy$default(AnimationState animationState, float f, float f2, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = ((Number) animationState.getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((AnimationVector1D) animationState.getVelocityVector()).getValue();
        }
        float f3 = f2;
        if ((i & 4) != 0) {
            j = animationState.getLastFrameTimeNanos();
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = animationState.getFinishedTimeNanos();
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            z = animationState.isRunning();
        }
        return copy(animationState, f, f3, j3, j4, z);
    }

    public static final AnimationState<Float, AnimationVector1D> copy(AnimationState<Float, AnimationVector1D> animationState, float f, float f2, long j, long j2, boolean z) {
        return new AnimationState<>(animationState.getTypeConverter(), Float.valueOf(f), AnimationVectorsKt.AnimationVector(f2), j, j2, z);
    }

    public static /* synthetic */ AnimationState AnimationState$default(float f, float f2, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        long j3 = (i & 4) != 0 ? Long.MIN_VALUE : j;
        long j4 = (i & 8) == 0 ? j2 : Long.MIN_VALUE;
        if ((i & 16) != 0) {
            z = false;
        }
        return AnimationState(f, f2, j3, j4, z);
    }

    public static final AnimationState<Float, AnimationVector1D> AnimationState(float f, float f2, long j, long j2, boolean z) {
        return new AnimationState<>(VectorConvertersKt.getVectorConverter(C8626dso.e), Float.valueOf(f), AnimationVectorsKt.AnimationVector(f2), j, j2, z);
    }

    public static final <T, V extends AnimationVector> AnimationState<T, V> AnimationState(TwoWayConverter<T, V> twoWayConverter, T t, T t2, long j, long j2, boolean z) {
        return new AnimationState<>(twoWayConverter, t, twoWayConverter.getConvertToVector().invoke(t2), j, j2, z);
    }

    public static final <T, V extends AnimationVector> V createZeroVectorFrom(TwoWayConverter<T, V> twoWayConverter, T t) {
        V invoke = twoWayConverter.getConvertToVector().invoke(t);
        invoke.reset$animation_core_release();
        return invoke;
    }
}
