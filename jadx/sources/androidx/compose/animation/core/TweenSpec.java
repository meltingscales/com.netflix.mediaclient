package androidx.compose.animation.core;

import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class TweenSpec<T> implements DurationBasedAnimationSpec<T> {
    private final int delay;
    private final int durationMillis;
    private final Easing easing;

    public TweenSpec() {
        this(0, 0, null, 7, null);
    }

    public TweenSpec(int i, int i2, Easing easing) {
        this.durationMillis = i;
        this.delay = i2;
        this.easing = easing;
    }

    public /* synthetic */ TweenSpec(int i, int i2, Easing easing, int i3, C8627dsp c8627dsp) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? EasingKt.getFastOutSlowInEasing() : easing);
    }

    @Override // androidx.compose.animation.core.DurationBasedAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedTweenSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        return new VectorizedTweenSpec<>(this.durationMillis, this.delay, this.easing);
    }

    public boolean equals(Object obj) {
        if (obj instanceof TweenSpec) {
            TweenSpec tweenSpec = (TweenSpec) obj;
            if (tweenSpec.durationMillis == this.durationMillis && tweenSpec.delay == this.delay && C8632dsu.c(tweenSpec.easing, this.easing)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.durationMillis * 31) + this.easing.hashCode()) * 31) + this.delay;
    }
}
