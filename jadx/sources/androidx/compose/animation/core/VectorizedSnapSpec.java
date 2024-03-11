package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class VectorizedSnapSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    private final int delayMillis;

    public VectorizedSnapSpec() {
        this(0, 1, null);
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return 0;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j, V v, V v2, V v3) {
        return v3;
    }

    public VectorizedSnapSpec(int i) {
        this.delayMillis = i;
    }

    public /* synthetic */ VectorizedSnapSpec(int i, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j, V v, V v2, V v3) {
        return j < ((long) getDelayMillis()) * 1000000 ? v : v2;
    }
}
