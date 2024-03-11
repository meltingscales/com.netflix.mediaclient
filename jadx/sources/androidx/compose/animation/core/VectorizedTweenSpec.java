package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class VectorizedTweenSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    private final VectorizedFloatAnimationSpec<V> anim;
    private final int delayMillis;
    private final int durationMillis;
    private final Easing easing;

    public VectorizedTweenSpec() {
        this(0, 0, null, 7, null);
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    public VectorizedTweenSpec(int i, int i2, Easing easing) {
        this.durationMillis = i;
        this.delayMillis = i2;
        this.easing = easing;
        this.anim = new VectorizedFloatAnimationSpec<>(new FloatTweenSpec(getDurationMillis(), getDelayMillis(), easing));
    }

    public /* synthetic */ VectorizedTweenSpec(int i, int i2, Easing easing, int i3, C8627dsp c8627dsp) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? EasingKt.getFastOutSlowInEasing() : easing);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j, V v, V v2, V v3) {
        return this.anim.getValueFromNanos(j, v, v2, v3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j, V v, V v2, V v3) {
        return this.anim.getVelocityFromNanos(j, v, v2, v3);
    }
}
