package o;

import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

/* renamed from: o.bBi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3532bBi {
    public static final AnimationSet a(C3537bBn c3537bBn) {
        C8632dsu.c((Object) c3537bBn, "");
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new LinearInterpolator());
        RotateAnimation rotateAnimation = new RotateAnimation(c3537bBn.b(), c3537bBn.a(), 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(c3537bBn.e());
        TranslateAnimation translateAnimation = new TranslateAnimation(1, c3537bBn.d(), 1, c3537bBn.h(), 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(c3537bBn.e());
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setStartOffset(c3537bBn.c());
        animationSet.setFillAfter(true);
        return animationSet;
    }

    public static final AnimationSet c(C3536bBm c3536bBm) {
        C8632dsu.c((Object) c3536bBm, "");
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new LinearInterpolator());
        ScaleAnimation scaleAnimation = new ScaleAnimation(c3536bBm.h(), c3536bBm.f(), c3536bBm.g(), c3536bBm.i(), 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(c3536bBm.e());
        AlphaAnimation alphaAnimation = new AlphaAnimation(c3536bBm.d(), c3536bBm.b());
        alphaAnimation.setDuration(c3536bBm.a());
        alphaAnimation.setStartOffset(c3536bBm.c());
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setFillAfter(true);
        return animationSet;
    }

    public static final AnimationSet b(C3536bBm c3536bBm) {
        C8632dsu.c((Object) c3536bBm, "");
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new LinearInterpolator());
        ScaleAnimation scaleAnimation = new ScaleAnimation(c3536bBm.h(), c3536bBm.f(), c3536bBm.g(), c3536bBm.i(), 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(c3536bBm.e());
        AlphaAnimation alphaAnimation = new AlphaAnimation(c3536bBm.d(), c3536bBm.b());
        alphaAnimation.setDuration(c3536bBm.a());
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setStartOffset(c3536bBm.j());
        return animationSet;
    }

    public static final AnimationSet d(C3538bBo c3538bBo) {
        C8632dsu.c((Object) c3538bBo, "");
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new LinearInterpolator());
        ScaleAnimation scaleAnimation = new ScaleAnimation(c3538bBo.i(), c3538bBo.g(), c3538bBo.h(), c3538bBo.j(), 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(c3538bBo.c());
        scaleAnimation.setStartOffset(c3538bBo.f());
        AlphaAnimation alphaAnimation = new AlphaAnimation(c3538bBo.d(), c3538bBo.e());
        alphaAnimation.setDuration(c3538bBo.b());
        alphaAnimation.setStartOffset(c3538bBo.a());
        TranslateAnimation translateAnimation = new TranslateAnimation(1, c3538bBo.l(), 1, c3538bBo.n(), 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(c3538bBo.o());
        translateAnimation.setStartOffset(c3538bBo.k());
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setFillAfter(true);
        return animationSet;
    }

    public static final AnimationSet e(C3538bBo c3538bBo) {
        C8632dsu.c((Object) c3538bBo, "");
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new LinearInterpolator());
        ScaleAnimation scaleAnimation = new ScaleAnimation(c3538bBo.i(), c3538bBo.g(), c3538bBo.h(), c3538bBo.j(), 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(c3538bBo.c());
        AlphaAnimation alphaAnimation = new AlphaAnimation(c3538bBo.d(), c3538bBo.e());
        alphaAnimation.setDuration(c3538bBo.b());
        TranslateAnimation translateAnimation = new TranslateAnimation(1, c3538bBo.l(), 1, c3538bBo.n(), 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(c3538bBo.o());
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setStartOffset(c3538bBo.m());
        animationSet.setFillAfter(true);
        return animationSet;
    }
}
