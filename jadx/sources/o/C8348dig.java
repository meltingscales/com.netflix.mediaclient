package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import java.util.HashSet;
import java.util.Set;
import o.C9834xU;

/* renamed from: o.dig  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8348dig extends Visibility {
    private Drawable b;
    protected final boolean e;
    private final Set<Animator> a = new HashSet();
    private final Set<Animator> c = new HashSet();
    private int d = -1;

    public Transition a(int i) {
        this.d = i;
        return this;
    }

    public C8348dig(boolean z) {
        this.e = z;
    }

    public void b(Animator animator) {
        this.a.add(animator);
    }

    public void a(Animator animator) {
        this.c.add(animator);
    }

    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (view == null) {
            return null;
        }
        b(view);
        ObjectAnimator e = e(viewGroup, view, true);
        e.setDuration(C8054ddD.e(view.getContext(), C9834xU.f.e));
        e.setTarget(view);
        if (!this.a.isEmpty()) {
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet.Builder play = animatorSet.play(e);
            for (Animator animator : this.a) {
                animator.setDuration(C9834xU.f.e);
                play.with(animator);
            }
            return animatorSet;
        }
        a(view);
        return e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(final View view) {
        if (this.d != -1) {
            addListener(new C8347dif() { // from class: o.dig.5
                @Override // o.C8347dif, androidx.transition.Transition.TransitionListener
                public void onTransitionStart(Transition transition) {
                    if (C8348dig.this.d != -1) {
                        C8348dig.this.b = view.getBackground();
                        view.setBackgroundResource(C8348dig.this.d);
                    }
                }

                @Override // o.C8347dif, androidx.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                    super.onTransitionEnd(transition);
                    view.setBackground(C8348dig.this.b);
                    C8348dig.this.b = null;
                }
            });
        }
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (view == null) {
            return null;
        }
        b(view);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator e = e(viewGroup, view, false);
        animatorSet.setDuration(C8054ddD.e(view.getContext(), C9834xU.f.e));
        AnimatorSet.Builder play = animatorSet.play(e);
        if (this.e) {
            play.with(ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f));
        }
        animatorSet.setTarget(view);
        for (Animator animator : this.c) {
            animator.setDuration(C9834xU.f.e);
            play.with(animator);
        }
        a(view);
        return animatorSet;
    }

    protected ObjectAnimator e(ViewGroup viewGroup, View view, boolean z) {
        float f;
        if (viewGroup.getX() > 0.0f && viewGroup.getX() < viewGroup.getWidth()) {
            f = viewGroup.getX();
        } else if (z) {
            f = this.e ? viewGroup.getWidth() / 2 : viewGroup.getWidth();
        } else {
            f = 0.0f;
        }
        if (z) {
            return ObjectAnimator.ofFloat(view, View.TRANSLATION_X, f, 0.0f);
        }
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[2];
        fArr[0] = f;
        boolean z2 = this.e;
        int width = viewGroup.getWidth();
        if (z2) {
            width /= 2;
        }
        fArr[1] = width;
        return ObjectAnimator.ofFloat(view, property, fArr);
    }

    private void a(final View view) {
        addListener(new TransitionListenerAdapter() { // from class: o.dig.4
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                view.setTranslationX(0.0f);
                transition.removeListener(this);
            }
        });
    }
}
