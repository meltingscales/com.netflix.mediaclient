package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* loaded from: classes.dex */
public interface VectorizedAnimationSpec<V extends AnimationVector> {
    long getDurationNanos(V v, V v2, V v3);

    V getValueFromNanos(long j, V v, V v2, V v3);

    V getVelocityFromNanos(long j, V v, V v2, V v3);

    boolean isInfinite();

    default V getEndVelocity(V v, V v2, V v3) {
        return getVelocityFromNanos(getDurationNanos(v, v2, v3), v, v2, v3);
    }
}
