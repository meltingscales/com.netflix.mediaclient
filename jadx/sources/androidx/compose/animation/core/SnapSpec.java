package androidx.compose.animation.core;

import o.C8627dsp;

/* loaded from: classes.dex */
public final class SnapSpec<T> implements DurationBasedAnimationSpec<T> {
    private final int delay;

    public SnapSpec() {
        this(0, 1, null);
    }

    public int hashCode() {
        return this.delay;
    }

    public SnapSpec(int i) {
        this.delay = i;
    }

    public /* synthetic */ SnapSpec(int i, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedDurationBasedAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        return new VectorizedSnapSpec(this.delay);
    }

    public boolean equals(Object obj) {
        return (obj instanceof SnapSpec) && ((SnapSpec) obj).delay == this.delay;
    }
}
