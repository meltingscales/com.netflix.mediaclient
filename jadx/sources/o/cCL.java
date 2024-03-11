package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import kotlin.jvm.internal.Ref;

/* loaded from: classes4.dex */
public final class cCL extends C1045Mp {
    private static final boolean a = false;
    public static final cCL b = new cCL();

    private cCL() {
        super("InteractiveAnimationUtil");
    }

    public final long a(Context context, long j) {
        long c;
        C8632dsu.c((Object) context, "");
        float d = d(context);
        if (d <= 0.0f) {
            return j;
        }
        c = dsT.c(((float) j) / d);
        return c;
    }

    private final float d(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02f2, code lost:
        if (r18.equals(com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.ANIMATION_TYPE.TRANSFORM_SCALE) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02f6, code lost:
        r0 = c(r15, (java.lang.Float) r1.d, (java.lang.Float) r2.d, r16, r17, r22, false, false, 96, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008a, code lost:
        if (r18.equals(com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.ANIMATION_TYPE.POSITION_Y) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0094, code lost:
        if (r18.equals(com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.ANIMATION_TYPE.POSITION_X) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e5, code lost:
        if (r18.equals(com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.ANIMATION_TYPE.SCALE) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ef, code lost:
        if (r18.equals(com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.ANIMATION_TYPE.ALPHA) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f9, code lost:
        if (r18.equals(com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.ANIMATION_TYPE.Y) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fd, code lost:
        r0 = r17.delta();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0101, code lost:
        if (r0 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0103, code lost:
        r0 = r16.getLayoutParams();
        o.C8632dsu.d(r0);
        r0 = ((android.view.ViewGroup.MarginLayoutParams) r0).topMargin;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0110, code lost:
        if (r1.d != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0112, code lost:
        r1.d = java.lang.Float.valueOf(r0 / r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011d, code lost:
        if (r2.d != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011f, code lost:
        r2.d = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0123, code lost:
        r0 = r0;
        r1.d = java.lang.Float.valueOf((((java.lang.Number) r1.d).floatValue() * r19) - r0);
        r2.d = java.lang.Float.valueOf((((java.lang.Number) r2.d).floatValue() * r19) - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0146, code lost:
        if (r22 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0148, code lost:
        r16.setTranslationY(((java.lang.Number) r1.d).floatValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0153, code lost:
        r0 = android.animation.ObjectAnimator.ofFloat(r16, android.view.View.TRANSLATION_Y, ((java.lang.Number) r1.d).floatValue(), ((java.lang.Number) r2.d).floatValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0175, code lost:
        if (r17.fromOrigin() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0177, code lost:
        r0 = android.animation.ObjectAnimator.ofFloat(r16, android.view.View.TRANSLATION_Y, 0.0f, r0.floatValue() * r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x018b, code lost:
        r0 = android.animation.ObjectAnimator.ofFloat(r16, android.view.View.TRANSLATION_Y, r0.floatValue() * r19, 0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a5, code lost:
        if (r18.equals(com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.ANIMATION_TYPE.X) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a9, code lost:
        r0 = r17.delta();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01ad, code lost:
        if (r0 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01af, code lost:
        r0 = r16.getLayoutParams();
        o.C8632dsu.d(r0);
        r0 = ((android.view.ViewGroup.MarginLayoutParams) r0).getMarginStart();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01be, code lost:
        if (r1.d != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c0, code lost:
        r1.d = java.lang.Float.valueOf(r0 / r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01cb, code lost:
        if (r2.d != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01cd, code lost:
        r2.d = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d1, code lost:
        r0 = r0;
        r1.d = java.lang.Float.valueOf((((java.lang.Number) r1.d).floatValue() * r19) - r0);
        r2.d = java.lang.Float.valueOf((((java.lang.Number) r2.d).floatValue() * r19) - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f4, code lost:
        if (r22 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f6, code lost:
        r16.setTranslationX(((java.lang.Number) r1.d).floatValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0201, code lost:
        r0 = android.animation.ObjectAnimator.ofFloat(r16, android.view.View.TRANSLATION_X, ((java.lang.Number) r1.d).floatValue(), ((java.lang.Number) r2.d).floatValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0223, code lost:
        if (r17.fromOrigin() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0225, code lost:
        r0 = android.animation.ObjectAnimator.ofFloat(r16, android.view.View.TRANSLATION_X, 0.0f, r0.floatValue() * r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0239, code lost:
        r0 = android.animation.ObjectAnimator.ofFloat(r16, android.view.View.TRANSLATION_X, r0.floatValue() * r19, 0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x029a, code lost:
        if (r18.equals(com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation.ANIMATION_TYPE.OPACITY) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02a0, code lost:
        if (r17.shouldBeRelativeToLastValue() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02a2, code lost:
        r1.d = java.lang.Float.valueOf(r16.getAlpha());
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02af, code lost:
        if (r1.d != 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02b1, code lost:
        r1.d = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02b5, code lost:
        if (r2.d != 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02b7, code lost:
        r2.d = java.lang.Float.valueOf(1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02bf, code lost:
        if (r22 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02c1, code lost:
        r16.setVisibility(0);
        r16.setAlpha(((java.lang.Number) r1.d).floatValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02cf, code lost:
        r0 = android.animation.ObjectAnimator.ofFloat(r16, android.view.View.ALPHA, ((java.lang.Number) r1.d).floatValue(), ((java.lang.Number) r2.d).floatValue());
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x045a  */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Float, T] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Float, T] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Float, T] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Float, T] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Float, T] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Float, T] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Float, T] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Float, T] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.lang.Float, T] */
    /* JADX WARN: Type inference failed for: r3v49, types: [java.lang.Float, T] */
    /* JADX WARN: Type inference failed for: r3v59, types: [java.lang.Float, T] */
    /* JADX WARN: Type inference failed for: r3v69, types: [java.lang.Float, T] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Float, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.ValueAnimator d(final android.view.View r16, com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation r17, java.lang.String r18, float r19, long r20, boolean r22) {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cCL.d(android.view.View, com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation, java.lang.String, float, long, boolean):android.animation.ValueAnimator");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(View view, ValueAnimator valueAnimator) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        view.setTranslationX(((Float) animatedValue).floatValue());
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue2);
        view.setTranslationY(((Float) animatedValue2).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(View view, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, ValueAnimator valueAnimator) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) objectRef, "");
        C8632dsu.c((Object) objectRef2, "");
        C8632dsu.c((Object) valueAnimator, "");
        int i = view.getLayoutParams().width;
        float floatValue = ((Number) objectRef.d).floatValue();
        float floatValue2 = ((Number) objectRef2.d).floatValue();
        float floatValue3 = ((Number) objectRef.d).floatValue();
        Object animatedValue = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        int floatValue4 = (int) (floatValue + ((floatValue2 - floatValue3) * ((Float) animatedValue).floatValue()) + 0.5d);
        if (i != floatValue4) {
            view.getLayoutParams().width = floatValue4;
            view.requestLayout();
        }
        view.getLayoutParams().width = floatValue4;
        view.requestLayout();
    }

    static /* synthetic */ ValueAnimator c(cCL ccl, Float f, Float f2, View view, InteractiveAnimation interactiveAnimation, boolean z, boolean z2, boolean z3, int i, Object obj) {
        return ccl.e(f, f2, view, interactiveAnimation, z, (i & 32) != 0 ? true : z2, (i & 64) != 0 ? true : z3);
    }

    private final ValueAnimator e(Float f, Float f2, final View view, InteractiveAnimation interactiveAnimation, boolean z, final boolean z2, final boolean z3) {
        float floatValue = f != null ? f.floatValue() : 1.0f;
        float floatValue2 = f != null ? f.floatValue() : 1.0f;
        float floatValue3 = f2 != null ? f2.floatValue() : 1.0f;
        if (interactiveAnimation.shouldBeRelativeToLastValue()) {
            floatValue = view.getScaleX();
            floatValue2 = view.getScaleY();
        }
        if (z) {
            if (z2) {
                view.setScaleX(floatValue);
            }
            if (z3) {
                view.setScaleY(floatValue2);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue3);
        ofFloat.addListener(new a(view, interactiveAnimation));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.cCR
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                cCL.d(z2, view, z3, valueAnimator);
            }
        });
        C8632dsu.a(ofFloat, "");
        return ofFloat;
    }

    /* loaded from: classes4.dex */
    public static final class a implements Animator.AnimatorListener {
        final /* synthetic */ View a;
        final /* synthetic */ InteractiveAnimation d;
        private float c = 0.5f;
        private float b = 0.5f;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C8632dsu.c((Object) animator, "");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C8632dsu.c((Object) animator, "");
        }

        a(View view, InteractiveAnimation interactiveAnimation) {
            this.a = view;
            this.d = interactiveAnimation;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C8632dsu.c((Object) animator, "");
            this.c = this.a.getPivotX();
            this.b = this.a.getPivotY();
            View view = this.a;
            view.setPivotX(view.getLayoutParams().width * this.d.pivotX());
            View view2 = this.a;
            view2.setPivotY(view2.getLayoutParams().height * this.d.pivotY());
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            if (Build.VERSION.SDK_INT >= 28) {
                this.a.resetPivot();
                return;
            }
            this.a.setPivotX(this.c);
            this.a.setPivotY(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(boolean z, View view, boolean z2, ValueAnimator valueAnimator) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) valueAnimator, "");
        if (z) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C8632dsu.d(animatedValue);
            view.setScaleX(((Float) animatedValue).floatValue());
        }
        if (z2) {
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            C8632dsu.d(animatedValue2);
            view.setScaleY(((Float) animatedValue2).floatValue());
        }
    }
}
