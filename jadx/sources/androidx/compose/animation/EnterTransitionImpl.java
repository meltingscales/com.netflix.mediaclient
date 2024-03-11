package androidx.compose.animation;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class EnterTransitionImpl extends EnterTransition {
    private final TransitionData data;

    @Override // androidx.compose.animation.EnterTransition
    public TransitionData getData$animation_release() {
        return this.data;
    }

    public EnterTransitionImpl(TransitionData transitionData) {
        super(null);
        this.data = transitionData;
    }
}
