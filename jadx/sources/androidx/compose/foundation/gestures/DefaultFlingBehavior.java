package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.MotionDurationScale;
import o.C8627dsp;
import o.C8738dws;
import o.InterfaceC8585dra;

/* loaded from: classes.dex */
public final class DefaultFlingBehavior implements FlingBehavior {
    private DecayAnimationSpec<Float> flingDecay;
    private int lastAnimationCycleCount;
    private final MotionDurationScale motionDurationScale;

    public final DecayAnimationSpec<Float> getFlingDecay() {
        return this.flingDecay;
    }

    public final int getLastAnimationCycleCount() {
        return this.lastAnimationCycleCount;
    }

    public final void setFlingDecay(DecayAnimationSpec<Float> decayAnimationSpec) {
        this.flingDecay = decayAnimationSpec;
    }

    public final void setLastAnimationCycleCount(int i) {
        this.lastAnimationCycleCount = i;
    }

    public DefaultFlingBehavior(DecayAnimationSpec<Float> decayAnimationSpec, MotionDurationScale motionDurationScale) {
        this.flingDecay = decayAnimationSpec;
        this.motionDurationScale = motionDurationScale;
    }

    public /* synthetic */ DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec, MotionDurationScale motionDurationScale, int i, C8627dsp c8627dsp) {
        this(decayAnimationSpec, (i & 2) != 0 ? ScrollableKt.getDefaultScrollMotionDurationScale() : motionDurationScale);
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    public Object performFling(ScrollScope scrollScope, float f, InterfaceC8585dra<? super Float> interfaceC8585dra) {
        this.lastAnimationCycleCount = 0;
        return C8738dws.c(this.motionDurationScale, new DefaultFlingBehavior$performFling$2(f, this, scrollScope, null), interfaceC8585dra);
    }
}
