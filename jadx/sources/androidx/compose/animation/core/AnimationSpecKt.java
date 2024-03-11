package androidx.compose.animation.core;

import androidx.compose.animation.core.KeyframesSpec;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class AnimationSpecKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AnimationVector> V convert(TwoWayConverter<T, V> twoWayConverter, T t) {
        if (t == null) {
            return null;
        }
        return twoWayConverter.getConvertToVector().invoke(t);
    }

    public static /* synthetic */ TweenSpec tween$default(int i, int i2, Easing easing, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            easing = EasingKt.getFastOutSlowInEasing();
        }
        return tween(i, i2, easing);
    }

    public static final <T> TweenSpec<T> tween(int i, int i2, Easing easing) {
        return new TweenSpec<>(i, i2, easing);
    }

    public static /* synthetic */ SpringSpec spring$default(float f, float f2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return spring(f, f2, obj);
    }

    public static final <T> SpringSpec<T> spring(float f, float f2, T t) {
        return new SpringSpec<>(f, f2, t);
    }

    public static final <T> KeyframesSpec<T> keyframes(drM<? super KeyframesSpec.KeyframesSpecConfig<T>, dpR> drm) {
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig();
        drm.invoke(keyframesSpecConfig);
        return new KeyframesSpec<>(keyframesSpecConfig);
    }

    /* renamed from: infiniteRepeatable-9IiC70o$default  reason: not valid java name */
    public static /* synthetic */ InfiniteRepeatableSpec m55infiniteRepeatable9IiC70o$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i & 4) != 0) {
            j = StartOffset.m67constructorimpl$default(0, 0, 2, null);
        }
        return m54infiniteRepeatable9IiC70o(durationBasedAnimationSpec, repeatMode, j);
    }

    /* renamed from: infiniteRepeatable-9IiC70o  reason: not valid java name */
    public static final <T> InfiniteRepeatableSpec<T> m54infiniteRepeatable9IiC70o(DurationBasedAnimationSpec<T> durationBasedAnimationSpec, RepeatMode repeatMode, long j) {
        return new InfiniteRepeatableSpec<>(durationBasedAnimationSpec, repeatMode, j, null);
    }

    public static final <T> SnapSpec<T> snap(int i) {
        return new SnapSpec<>(i);
    }

    public static /* synthetic */ SnapSpec snap$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return snap(i);
    }
}
