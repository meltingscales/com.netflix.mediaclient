package o;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.card.MaterialCardView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C7104cps;

/* renamed from: o.cpr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7103cpr extends AbstractC3336ax<c> {
    public static final b c = new b(null);
    public static final int d = 8;
    private AnimatorSet b;
    private CharSequence f;
    private String i;

    @Override // o.AbstractC3073as
    public int a() {
        return C7104cps.b.l;
    }

    public final void d(CharSequence charSequence) {
        this.f = charSequence;
    }

    public final void e(String str) {
        this.i = str;
    }

    public final String i() {
        return this.i;
    }

    public final CharSequence l() {
        return this.f;
    }

    /* renamed from: o.cpr$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("NotificationsStackModel");
        }
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        cVar.r().setContentDescription(this.i);
        cVar.c().setText(this.f);
        cVar.e().getViewTreeObserver().addOnGlobalLayoutListener(new d(cVar, this));
    }

    /* renamed from: o.cpr$d */
    /* loaded from: classes4.dex */
    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ AbstractC7103cpr b;
        final /* synthetic */ c e;

        d(c cVar, AbstractC7103cpr abstractC7103cpr) {
            this.e = cVar;
            this.b = abstractC7103cpr;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.e.e().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.b.a(this.e);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.b = null;
        super.b((AbstractC7103cpr) cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(c cVar) {
        float f = -(cVar.e().getY() + cVar.e().getHeight());
        cVar.e().setTranslationY(f);
        cVar.b().setTranslationY(f);
        cVar.d().setTranslationY(f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(b(cVar.e(), f), b(cVar.b(), f), b(cVar.d(), f));
        animatorSet.setInterpolator(new FastOutSlowInInterpolator());
        animatorSet.setDuration(400L);
        animatorSet.setStartDelay(600L);
        animatorSet.start();
        this.b = animatorSet;
    }

    private final ObjectAnimator b(View view, float f) {
        return ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f, 0.0f);
    }

    /* renamed from: o.cpr$c */
    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(c.class, "textView", "getTextView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "card", "getCard()Lcom/google/android/material/card/MaterialCardView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "card2", "getCard2()Lcom/google/android/material/card/MaterialCardView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "card3", "getCard3()Lcom/google/android/material/card/MaterialCardView;", 0))};
        public static final int b = 8;
        private final dsZ h = bIF.d(this, C7104cps.e.b, false, 2, null);
        private final dsZ e = bIF.d(this, C7104cps.e.c, false, 2, null);
        private final dsZ d = bIF.d(this, C7104cps.e.e, false, 2, null);
        private final dsZ a = bIF.d(this, C7104cps.e.d, false, 2, null);

        public final C1204Sr c() {
            return (C1204Sr) this.h.getValue(this, c[0]);
        }

        public final MaterialCardView e() {
            return (MaterialCardView) this.e.getValue(this, c[1]);
        }

        public final MaterialCardView b() {
            return (MaterialCardView) this.d.getValue(this, c[2]);
        }

        public final MaterialCardView d() {
            return (MaterialCardView) this.a.getValue(this, c[3]);
        }
    }
}
