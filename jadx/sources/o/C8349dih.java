package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionValues;

/* renamed from: o.dih  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8349dih extends C8348dig {
    public static long a = 475;
    public static Interpolator b = PathInterpolatorCompat.create(0.755f, 0.05f, 0.855f, 0.06f);
    public static Interpolator c = PathInterpolatorCompat.create(0.23f, 1.0f, 0.32f, 1.0f);
    public static long d = 525;
    public static int f = 50;

    public C8349dih(boolean z) {
        super(z);
    }

    @Override // o.C8348dig, androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (view == null) {
            return null;
        }
        b(view);
        ObjectAnimator a2 = a(view, true);
        a2.setAutoCancel(true);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f);
        ofFloat.setAutoCancel(true);
        view.setAlpha(0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(a2).with(ofFloat);
        animatorSet.setTarget(view);
        animatorSet.setDuration(a);
        animatorSet.setStartDelay(d);
        animatorSet.setInterpolator(c);
        a(view);
        return animatorSet;
    }

    @Override // o.C8348dig, androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (view == null) {
            return null;
        }
        b(view);
        ObjectAnimator a2 = a(view, false);
        a2.setAutoCancel(true);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f);
        ofFloat.setAutoCancel(true);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(a2).with(ofFloat);
        animatorSet.setTarget(view);
        animatorSet.setDuration(a);
        animatorSet.setInterpolator(b);
        a(view);
        return animatorSet;
    }

    private ObjectAnimator a(View view, boolean z) {
        float b2 = C9870yD.b(view.getContext(), f);
        return z ? ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, -b2, 0.0f) : ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, 0.0f, -b2);
    }

    private void a(final View view) {
        addListener(new TransitionListenerAdapter() { // from class: o.dih.2
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                view.setAlpha(1.0f);
                view.setTranslationY(0.0f);
                transition.removeListener(this);
            }
        });
    }
}
