package com.netflix.android.mdxpanel.skipintro;

import android.animation.ValueAnimator;
import android.view.View;
import com.netflix.android.mdxpanel.skipintro.MdxSkipIntroUIViewImpl$skipIntroAnimator$2;
import kotlin.jvm.internal.Lambda;
import o.C1203Sq;
import o.C8632dsu;
import o.C9754wP;
import o.C9795wi;
import o.C9913yu;
import o.drO;

/* loaded from: classes2.dex */
public final class MdxSkipIntroUIViewImpl$skipIntroAnimator$2 extends Lambda implements drO<ValueAnimator> {
    final /* synthetic */ C9754wP e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MdxSkipIntroUIViewImpl$skipIntroAnimator$2(C9754wP c9754wP) {
        super(0);
        this.e = c9754wP;
    }

    @Override // o.drO
    /* renamed from: a */
    public final ValueAnimator invoke() {
        C1203Sq c1203Sq;
        C1203Sq c1203Sq2;
        ValueAnimator valueAnimator = new ValueAnimator();
        final C9754wP c9754wP = this.e;
        final Runnable runnable = new Runnable() { // from class: o.wW
            @Override // java.lang.Runnable
            public final void run() {
                MdxSkipIntroUIViewImpl$skipIntroAnimator$2.c(C9754wP.this);
            }
        };
        c1203Sq = c9754wP.e;
        c1203Sq.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.wU
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                MdxSkipIntroUIViewImpl$skipIntroAnimator$2.a(C9754wP.this, runnable, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
        c1203Sq2 = c9754wP.e;
        final float dimension = c1203Sq2.getResources().getDimension(C9795wi.c.m);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.wT
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                MdxSkipIntroUIViewImpl$skipIntroAnimator$2.c(C9754wP.this, dimension, valueAnimator2);
            }
        });
        valueAnimator.setDuration(200L);
        return valueAnimator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C9754wP c9754wP) {
        drO dro;
        C8632dsu.c((Object) c9754wP, "");
        dro = c9754wP.c;
        dro.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C9754wP c9754wP, Runnable runnable, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C1203Sq c1203Sq;
        C8632dsu.c((Object) c9754wP, "");
        C8632dsu.c((Object) runnable, "");
        if (i2 == i6 && i4 == i8) {
            return;
        }
        c1203Sq = c9754wP.e;
        c1203Sq.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C9754wP c9754wP, float f, ValueAnimator valueAnimator) {
        C1203Sq c1203Sq;
        C1203Sq c1203Sq2;
        C1203Sq c1203Sq3;
        ValueAnimator r;
        C1203Sq c1203Sq4;
        C8632dsu.c((Object) c9754wP, "");
        C8632dsu.c((Object) valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        float floatValue = ((Float) animatedValue).floatValue();
        c1203Sq = c9754wP.e;
        c1203Sq.getLayoutParams().height = (int) (f * floatValue);
        c1203Sq2 = c9754wP.e;
        c1203Sq2.setAlpha(floatValue);
        c1203Sq3 = c9754wP.e;
        r = c9754wP.r();
        Object animatedValue2 = r.getAnimatedValue();
        C8632dsu.d(animatedValue2);
        c1203Sq3.setVisibility(C9913yu.a(((Float) animatedValue2).floatValue(), 0.0f) ? 4 : 0);
        c1203Sq4 = c9754wP.e;
        c1203Sq4.requestLayout();
    }
}
