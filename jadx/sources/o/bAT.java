package o;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.PathInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

/* loaded from: classes4.dex */
public final class bAT {
    public static final AnimationSet b(bAQ baq) {
        C8632dsu.c((Object) baq, "");
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new PathInterpolator(0.19f, 0.0f, 0.0f, 1.0f));
        animationSet.addAnimation(a(baq.d(), baq.b(), baq.c()));
        animationSet.addAnimation(b(baq.d(), baq.b(), baq.a(), baq.i()));
        animationSet.addAnimation(c(baq.d(), baq.b(), baq.e()));
        animationSet.setFillAfter(true);
        return animationSet;
    }

    public static /* synthetic */ AnimationSet d(bAU bau, Animation.AnimationListener animationListener, int i, Object obj) {
        if ((i & 2) != 0) {
            animationListener = null;
        }
        return a(bau, animationListener);
    }

    public static final AnimationSet a(bAU bau, Animation.AnimationListener animationListener) {
        C8632dsu.c((Object) bau, "");
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new PathInterpolator(0.19f, 0.0f, 0.0f, 1.0f));
        animationSet.addAnimation(d(bau.a(), bau.e(), bau.c()));
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(bau.b());
        alphaAnimation.setStartOffset(bau.d());
        if (animationListener != null) {
            alphaAnimation.setAnimationListener(animationListener);
        }
        animationSet.addAnimation(alphaAnimation);
        animationSet.setFillAfter(true);
        return animationSet;
    }

    public static final ScaleAnimation a(long j, long j2, float f) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, f, 1.0f, f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(j);
        scaleAnimation.setStartOffset(j2);
        return scaleAnimation;
    }

    public static final TranslateAnimation b(long j, long j2, float f, float f2) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, f, 1, 0.0f, 1, f2);
        translateAnimation.setDuration(j);
        translateAnimation.setStartOffset(j2);
        return translateAnimation;
    }

    public static final RotateAnimation c(long j, long j2, float f) {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(j);
        rotateAnimation.setStartOffset(j2);
        return rotateAnimation;
    }

    public static final ScaleAnimation d(long j, long j2, float f) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, f, 0.0f, f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(j);
        scaleAnimation.setStartOffset(j2);
        return scaleAnimation;
    }
}
