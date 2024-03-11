package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
final class AnimatedContentScopeImpl implements AnimatedContentScope {
    private final /* synthetic */ AnimatedVisibilityScope $$delegate_0;

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public Modifier animateEnterExit(Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str) {
        return this.$$delegate_0.animateEnterExit(modifier, enterTransition, exitTransition, str);
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public Transition<EnterExitState> getTransition() {
        return this.$$delegate_0.getTransition();
    }

    public AnimatedContentScopeImpl(AnimatedVisibilityScope animatedVisibilityScope) {
        this.$$delegate_0 = animatedVisibilityScope;
    }
}
