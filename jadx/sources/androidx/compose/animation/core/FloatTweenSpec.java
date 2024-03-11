package androidx.compose.animation.core;

import o.C8627dsp;
import o.C8657dts;

/* loaded from: classes.dex */
public final class FloatTweenSpec implements FloatAnimationSpec {
    private final int delay;
    private final int duration;
    private final Easing easing;

    public FloatTweenSpec() {
        this(0, 0, null, 7, null);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float f, float f2, float f3) {
        return (this.delay + this.duration) * 1000000;
    }

    public FloatTweenSpec(int i, int i2, Easing easing) {
        this.duration = i;
        this.delay = i2;
        this.easing = easing;
    }

    public /* synthetic */ FloatTweenSpec(int i, int i2, Easing easing, int i3, C8627dsp c8627dsp) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? EasingKt.getFastOutSlowInEasing() : easing);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long j, float f, float f2, float f3) {
        float a;
        long clampPlayTime = clampPlayTime(j / 1000000);
        int i = this.duration;
        float f4 = i == 0 ? 1.0f : ((float) clampPlayTime) / i;
        Easing easing = this.easing;
        a = C8657dts.a(f4, 0.0f, 1.0f);
        return VectorConvertersKt.lerp(f, f2, easing.transform(a));
    }

    private final long clampPlayTime(long j) {
        long b;
        b = C8657dts.b(j - this.delay, 0L, this.duration);
        return b;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long j, float f, float f2, float f3) {
        long clampPlayTime = clampPlayTime(j / 1000000);
        int i = (clampPlayTime > 0L ? 1 : (clampPlayTime == 0L ? 0 : -1));
        if (i < 0) {
            return 0.0f;
        }
        if (i == 0) {
            return f3;
        }
        return (getValueFromNanos(clampPlayTime * 1000000, f, f2, f3) - getValueFromNanos((clampPlayTime - 1) * 1000000, f, f2, f3)) * 1000.0f;
    }
}
