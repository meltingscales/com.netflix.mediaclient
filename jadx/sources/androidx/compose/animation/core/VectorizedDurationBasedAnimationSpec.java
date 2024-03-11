package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* loaded from: classes.dex */
public interface VectorizedDurationBasedAnimationSpec<V extends AnimationVector> extends VectorizedFiniteAnimationSpec<V> {
    int getDelayMillis();

    int getDurationMillis();

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    default long getDurationNanos(V v, V v2, V v3) {
        return (getDelayMillis() + getDurationMillis()) * 1000000;
    }
}
