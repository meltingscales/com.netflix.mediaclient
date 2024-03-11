package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import o.C8627dsp;

/* loaded from: classes.dex */
public abstract class TransitionState<S> {
    private final MutableState isRunning$delegate;

    public /* synthetic */ TransitionState(C8627dsp c8627dsp) {
        this();
    }

    public abstract S getCurrentState();

    public abstract S getTargetState();

    public abstract void transitionConfigured$animation_core_release(Transition<S> transition);

    private TransitionState() {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isRunning$delegate = mutableStateOf$default;
    }

    public final boolean isRunning$animation_core_release() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    public final void setRunning$animation_core_release(boolean z) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z));
    }
}
