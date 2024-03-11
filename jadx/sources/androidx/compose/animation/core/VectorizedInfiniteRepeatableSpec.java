package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class VectorizedInfiniteRepeatableSpec<V extends AnimationVector> implements VectorizedAnimationSpec<V> {
    private final VectorizedDurationBasedAnimationSpec<V> animation;
    private final long durationNanos;
    private final long initialOffsetNanos;
    private final RepeatMode repeatMode;

    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j, C8627dsp c8627dsp) {
        this(vectorizedDurationBasedAnimationSpec, repeatMode, j);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V v, V v2, V v3) {
        return Long.MAX_VALUE;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public boolean isInfinite() {
        return true;
    }

    private VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j) {
        this.animation = vectorizedDurationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        this.durationNanos = (vectorizedDurationBasedAnimationSpec.getDelayMillis() + vectorizedDurationBasedAnimationSpec.getDurationMillis()) * 1000000;
        this.initialOffsetNanos = j * 1000000;
    }

    private final long repetitionPlayTimeNanos(long j) {
        long j2 = j + this.initialOffsetNanos;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.durationNanos;
        long j4 = j2 / j3;
        return (this.repeatMode == RepeatMode.Restart || j4 % ((long) 2) == 0) ? j2 - (j4 * j3) : ((j4 + 1) * j3) - j2;
    }

    private final V repetitionStartVelocity(long j, V v, V v2, V v3) {
        long j2 = this.initialOffsetNanos;
        long j3 = this.durationNanos;
        return j + j2 > j3 ? this.animation.getVelocityFromNanos(j3 - j2, v, v3, v2) : v2;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j, V v, V v2, V v3) {
        return this.animation.getValueFromNanos(repetitionPlayTimeNanos(j), v, v2, repetitionStartVelocity(j, v, v3, v2));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j, V v, V v2, V v3) {
        return this.animation.getVelocityFromNanos(repetitionPlayTimeNanos(j), v, v2, repetitionStartVelocity(j, v, v3, v2));
    }
}
