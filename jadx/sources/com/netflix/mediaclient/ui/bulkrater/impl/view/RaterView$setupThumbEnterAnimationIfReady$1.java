package com.netflix.mediaclient.ui.bulkrater.impl.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.netflix.mediaclient.ui.bulkrater.impl.lottie.RaterThumbsLottieDrawable;
import com.netflix.mediaclient.ui.bulkrater.impl.view.RaterView$setupThumbEnterAnimationIfReady$1;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.C5410byI;
import o.C8569dql;
import o.C8576dqs;
import o.C8632dsu;
import o.animation.InterpolatorC5439byl;
import o.dpR;
import o.drM;

/* loaded from: classes6.dex */
public final class RaterView$setupThumbEnterAnimationIfReady$1 extends Lambda implements drM<dpR, dpR> {
    final /* synthetic */ C5410byI c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RaterView$setupThumbEnterAnimationIfReady$1(C5410byI c5410byI) {
        super(1);
        this.c = c5410byI;
    }

    /* loaded from: classes6.dex */
    public static final class b implements Animator.AnimatorListener {
        final /* synthetic */ C5410byI c;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public b(C5410byI c5410byI) {
            this.c = c5410byI;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            RaterThumbsLottieDrawable raterThumbsLottieDrawable;
            raterThumbsLottieDrawable = this.c.l;
            raterThumbsLottieDrawable.animateToState(RaterThumbsLottieDrawable.State.c);
        }
    }

    /* loaded from: classes6.dex */
    public static final class e implements Animator.AnimatorListener {
        final /* synthetic */ C5410byI d;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public e(C5410byI c5410byI) {
            this.d = c5410byI;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            RaterThumbsLottieDrawable raterThumbsLottieDrawable;
            raterThumbsLottieDrawable = this.d.q;
            raterThumbsLottieDrawable.animateToState(RaterThumbsLottieDrawable.State.c);
        }
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(dpR dpr) {
        c(dpr);
        return dpR.c;
    }

    public final void c(dpR dpr) {
        RaterThumbsLottieDrawable raterThumbsLottieDrawable;
        List j;
        Comparable F;
        RaterThumbsLottieDrawable raterThumbsLottieDrawable2;
        List j2;
        Comparable F2;
        raterThumbsLottieDrawable = this.c.q;
        RaterThumbsLottieDrawable.State state = RaterThumbsLottieDrawable.State.d;
        raterThumbsLottieDrawable.setState((RaterThumbsLottieDrawable) state);
        this.c.e.k.setTranslationY(this.c.e.k.getHeight() / 2);
        j = C8569dql.j(550L, 430L);
        F = C8576dqs.F(j);
        Long l = (Long) F;
        long longValue = l != null ? l.longValue() : 0L;
        long j3 = longValue;
        final animation.InterpolatorC5439byl animation_interpolatorc5439byl = new animation.InterpolatorC5439byl(0L, 550L, j3, null, 9, null);
        final animation.InterpolatorC5439byl animation_interpolatorc5439byl2 = new animation.InterpolatorC5439byl(100L, 330L, j3, null, 8, null);
        final float translationY = this.c.e.k.getTranslationY();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final C5410byI c5410byI = this.c;
        ofFloat.setStartDelay(500L);
        ofFloat.setDuration(longValue);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.byS
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                RaterView$setupThumbEnterAnimationIfReady$1.c(C5410byI.this, translationY, animation_interpolatorc5439byl, animation_interpolatorc5439byl2, valueAnimator);
            }
        });
        C8632dsu.d(ofFloat);
        ofFloat.addListener(new e(c5410byI));
        ofFloat.start();
        raterThumbsLottieDrawable2 = this.c.l;
        raterThumbsLottieDrawable2.setState((RaterThumbsLottieDrawable) state);
        this.c.e.j.setTranslationY(this.c.e.j.getHeight() / 2);
        j2 = C8569dql.j(650L, 530L);
        F2 = C8576dqs.F(j2);
        Long l2 = (Long) F2;
        long longValue2 = l2 != null ? l2.longValue() : 0L;
        long j4 = longValue2;
        final animation.InterpolatorC5439byl animation_interpolatorc5439byl3 = new animation.InterpolatorC5439byl(100L, 550L, j4, null, 8, null);
        final animation.InterpolatorC5439byl animation_interpolatorc5439byl4 = new animation.InterpolatorC5439byl(200L, 330L, j4, null, 8, null);
        final float translationY2 = this.c.e.j.getTranslationY();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        final C5410byI c5410byI2 = this.c;
        ofFloat2.setStartDelay(500L);
        ofFloat2.setDuration(longValue2);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.byT
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                RaterView$setupThumbEnterAnimationIfReady$1.e(C5410byI.this, translationY2, animation_interpolatorc5439byl3, animation_interpolatorc5439byl4, valueAnimator);
            }
        });
        C8632dsu.d(ofFloat2);
        ofFloat2.addListener(new b(c5410byI2));
        ofFloat2.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C5410byI c5410byI, float f, animation.InterpolatorC5439byl animation_interpolatorc5439byl, animation.InterpolatorC5439byl animation_interpolatorc5439byl2, ValueAnimator valueAnimator) {
        C8632dsu.c((Object) c5410byI, "");
        C8632dsu.c((Object) animation_interpolatorc5439byl, "");
        C8632dsu.c((Object) animation_interpolatorc5439byl2, "");
        C8632dsu.c((Object) valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        float floatValue = ((Float) animatedValue).floatValue();
        c5410byI.e.k.setTranslationY(f - (animation_interpolatorc5439byl.getInterpolation(floatValue) * f));
        c5410byI.e.k.setAlpha(animation_interpolatorc5439byl2.getInterpolation(floatValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C5410byI c5410byI, float f, animation.InterpolatorC5439byl animation_interpolatorc5439byl, animation.InterpolatorC5439byl animation_interpolatorc5439byl2, ValueAnimator valueAnimator) {
        C8632dsu.c((Object) c5410byI, "");
        C8632dsu.c((Object) animation_interpolatorc5439byl, "");
        C8632dsu.c((Object) animation_interpolatorc5439byl2, "");
        C8632dsu.c((Object) valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        float floatValue = ((Float) animatedValue).floatValue();
        c5410byI.e.j.setTranslationY(f - (animation_interpolatorc5439byl.getInterpolation(floatValue) * f));
        c5410byI.e.j.setAlpha(animation_interpolatorc5439byl2.getInterpolation(floatValue));
    }
}
