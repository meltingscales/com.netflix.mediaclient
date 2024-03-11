package androidx.compose.animation.core;

/* loaded from: classes.dex */
public final class DecayAnimationSpecKt {
    public static final <T> DecayAnimationSpec<T> generateDecayAnimationSpec(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        return new DecayAnimationSpecImpl(floatDecayAnimationSpec);
    }
}
