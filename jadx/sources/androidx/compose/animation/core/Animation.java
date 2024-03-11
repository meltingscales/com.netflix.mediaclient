package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* loaded from: classes.dex */
public interface Animation<T, V extends AnimationVector> {
    long getDurationNanos();

    T getTargetValue();

    TwoWayConverter<T, V> getTypeConverter();

    T getValueFromNanos(long j);

    V getVelocityVectorFromNanos(long j);

    boolean isInfinite();

    default boolean isFinishedFromNanos(long j) {
        return j >= getDurationNanos();
    }
}
