package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* loaded from: classes.dex */
public interface VectorizedDecayAnimationSpec<V extends AnimationVector> {
    float getAbsVelocityThreshold();

    long getDurationNanos(V v, V v2);

    V getTargetValue(V v, V v2);

    V getValueFromNanos(long j, V v, V v2);

    V getVelocityFromNanos(long j, V v, V v2);
}
