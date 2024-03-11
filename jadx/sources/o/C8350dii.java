package o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import o.C9834xU;

/* renamed from: o.dii  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8350dii extends Visibility {
    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (view == null) {
            return null;
        }
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), C9834xU.e.d);
        animatorSet.setDuration(C8054ddD.e(view.getContext(), C9834xU.f.e));
        animatorSet.setTarget(view);
        return animatorSet;
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (view == null) {
            return null;
        }
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), C9834xU.e.a);
        animatorSet.setDuration(C8054ddD.e(view.getContext(), C9834xU.f.e));
        animatorSet.setTarget(view);
        return animatorSet;
    }
}
