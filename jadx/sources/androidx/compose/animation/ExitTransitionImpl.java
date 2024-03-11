package androidx.compose.animation;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ExitTransitionImpl extends ExitTransition {
    private final TransitionData data;

    @Override // androidx.compose.animation.ExitTransition
    public TransitionData getData$animation_release() {
        return this.data;
    }

    public ExitTransitionImpl(TransitionData transitionData) {
        super(null);
        this.data = transitionData;
    }
}
