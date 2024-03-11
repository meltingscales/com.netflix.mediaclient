package androidx.compose.animation.core;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DecayAnimationSpecImpl<T> implements DecayAnimationSpec<T> {
    private final FloatDecayAnimationSpec floatDecaySpec;

    public DecayAnimationSpecImpl(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        this.floatDecaySpec = floatDecayAnimationSpec;
    }

    @Override // androidx.compose.animation.core.DecayAnimationSpec
    public <V extends AnimationVector> VectorizedDecayAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        return new VectorizedFloatDecaySpec(this.floatDecaySpec);
    }
}
