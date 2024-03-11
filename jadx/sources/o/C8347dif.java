package o;

import androidx.transition.Transition;

/* renamed from: o.dif  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8347dif implements Transition.TransitionListener {
    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
        transition.removeListener(this);
    }
}
