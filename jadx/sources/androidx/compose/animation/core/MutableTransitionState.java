package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class MutableTransitionState<S> extends TransitionState<S> {
    public static final int $stable = 0;
    private final MutableState currentState$delegate;
    private final MutableState targetState$delegate;

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionConfigured$animation_core_release(Transition<S> transition) {
    }

    public MutableTransitionState(S s) {
        super(null);
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s, null, 2, null);
        this.currentState$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s, null, 2, null);
        this.targetState$delegate = mutableStateOf$default2;
    }

    public final boolean isIdle() {
        return C8632dsu.c(getCurrentState(), getTargetState()) && !isRunning$animation_core_release();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getCurrentState() {
        return (S) this.currentState$delegate.getValue();
    }

    public void setCurrentState$animation_core_release(S s) {
        this.currentState$delegate.setValue(s);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getTargetState() {
        return (S) this.targetState$delegate.getValue();
    }

    public void setTargetState(S s) {
        this.targetState$delegate.setValue(s);
    }
}
