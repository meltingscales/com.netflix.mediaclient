package androidx.compose.animation.core;

/* loaded from: classes.dex */
public final class AnimationKt {
    public static final long getDurationMillis(Animation<?, ?> animation) {
        return animation.getDurationNanos() / 1000000;
    }

    public static final <T, V extends AnimationVector> TargetBasedAnimation<T, V> TargetBasedAnimation(AnimationSpec<T> animationSpec, TwoWayConverter<T, V> twoWayConverter, T t, T t2, T t3) {
        return new TargetBasedAnimation<>(animationSpec, twoWayConverter, t, t2, twoWayConverter.getConvertToVector().invoke(t3));
    }
}
