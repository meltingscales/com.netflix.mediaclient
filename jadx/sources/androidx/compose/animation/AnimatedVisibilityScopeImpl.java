package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.IntSize;

/* loaded from: classes.dex */
public final class AnimatedVisibilityScopeImpl implements AnimatedVisibilityScope {
    private final MutableState<IntSize> targetSize;
    private Transition<EnterExitState> transition;

    public final MutableState<IntSize> getTargetSize$animation_release() {
        return this.targetSize;
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public Transition<EnterExitState> getTransition() {
        return this.transition;
    }

    public AnimatedVisibilityScopeImpl(Transition<EnterExitState> transition) {
        MutableState<IntSize> mutableStateOf$default;
        this.transition = transition;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m2542boximpl(IntSize.Companion.m2551getZeroYbymL2g()), null, 2, null);
        this.targetSize = mutableStateOf$default;
    }
}
