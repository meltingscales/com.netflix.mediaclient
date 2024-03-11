package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import o.AbstractC3781bKk;
import o.C3796bKz;
import o.C9834xU;
import o.aLX;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.bKk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3781bKk extends AbstractC3336ax<a> {
    private Integer b;
    private String c;
    private long d;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j = 4;
    private Integer k;
    private boolean l;
    private Integer m;

    /* renamed from: o  reason: collision with root package name */
    private Rect f13515o;

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.q;
    }

    public final void b(Integer num) {
        this.m = num;
    }

    public final void c(String str) {
        this.c = str;
    }

    public final void d(long j) {
        this.d = j;
    }

    public final void e(Rect rect) {
        this.f13515o = rect;
    }

    public final void e(boolean z) {
        this.g = z;
    }

    public final void h_(Integer num) {
        this.k = num;
    }

    public final Integer i() {
        return this.b;
    }

    public final long k() {
        return this.d;
    }

    public final boolean l() {
        return this.h;
    }

    public final String m() {
        return this.c;
    }

    public final boolean n() {
        return this.i;
    }

    public final void n_(boolean z) {
        this.h = z;
    }

    public final int o() {
        return this.j;
    }

    public final void o_(boolean z) {
        this.i = z;
    }

    public final Rect p() {
        return this.f13515o;
    }

    public final void p_(boolean z) {
        this.f = z;
    }

    public final Integer q() {
        return this.k;
    }

    public final boolean r() {
        return this.g;
    }

    public final boolean s() {
        return this.f;
    }

    public final Integer t() {
        return this.m;
    }

    public final boolean x() {
        return this.l;
    }

    @Override // o.AbstractC3336ax
    public /* synthetic */ void a(a aVar, AbstractC3073as abstractC3073as) {
        e(aVar, (AbstractC3073as<?>) abstractC3073as);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public /* synthetic */ void c(Object obj, AbstractC3073as abstractC3073as) {
        e((a) obj, (AbstractC3073as<?>) abstractC3073as);
    }

    public void e(a aVar, AbstractC3073as<?> abstractC3073as) {
        C8632dsu.c((Object) aVar, "");
        C8632dsu.c((Object) abstractC3073as, "");
        if (C8632dsu.c((Object) abstractC3073as.toString(), (Object) toString())) {
            return;
        }
        super.a((AbstractC3781bKk) aVar, abstractC3073as);
    }

    @Override // o.AbstractC3336ax
    public void e(a aVar) {
        int color;
        C8632dsu.c((Object) aVar, "");
        aVar.d(this.l, this.d);
        aVar.c(this.g, this.f, this.k);
        ColorDrawable e = aVar.c().e();
        Integer num = this.b;
        if (num != null) {
            color = num.intValue();
        } else {
            color = ContextCompat.getColor(aVar.d().getContext(), this.h ? C9834xU.c.t : C9834xU.c.s);
        }
        e.setColor(color);
        aVar.c().a(this.f13515o);
        aVar.d().setImportantForAccessibility(this.j);
        aVar.d().setContentDescription(this.c);
        aVar.d().setTag(aLX.a.e, this.i ? Boolean.TRUE : null);
        aVar.d().setTag(aLX.a.h, this.m);
        aVar.c().setAlpha(this.l ? 0 : PrivateKeyType.INVALID);
        aVar.d().invalidate();
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d  reason: avoid collision after fix types in other method */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        aVar.d().setTag(aLX.a.e, null);
        aVar.d().setTag(aLX.a.h, null);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, a aVar) {
        C8632dsu.c((Object) aVar, "");
        if (i == 0) {
            if (aVar.b().isRunning()) {
                return;
            }
            aVar.b().start();
        } else if (i == 1 && aVar.b().isRunning()) {
            aVar.b().cancel();
        }
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void a(a aVar) {
        C8632dsu.c((Object) aVar, "");
        if (aVar.b().isRunning()) {
            return;
        }
        aVar.b().start();
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void d(a aVar) {
        C8632dsu.c((Object) aVar, "");
        if (aVar.b().isRunning()) {
            aVar.b().cancel();
        }
    }

    /* renamed from: o.bKk$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3179au {
        private final ValueAnimator a;
        private View b;
        private Animator e;
        private final AnimatorSet h;
        private final b d = new b();
        private final long c = 1400;

        public final Animator b() {
            return this.e;
        }

        public final b c() {
            return this.d;
        }

        public a() {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.bKh
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    AbstractC3781bKk.a.a(AbstractC3781bKk.a.this, valueAnimator2);
                }
            });
            valueAnimator.setDuration(1400L);
            valueAnimator.setRepeatMode(2);
            valueAnimator.setRepeatCount(-1);
            valueAnimator.setIntValues(PrivateKeyType.INVALID, 51);
            this.a = valueAnimator;
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator valueAnimator2 = new ValueAnimator();
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.bKm
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    AbstractC3781bKk.a.c(AbstractC3781bKk.a.this, valueAnimator3);
                }
            });
            valueAnimator2.setDuration((long) (1400 * 0.8d));
            valueAnimator2.setIntValues(0, PrivateKeyType.INVALID);
            dpR dpr = dpR.c;
            ValueAnimator valueAnimator3 = new ValueAnimator();
            valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.bKo
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    AbstractC3781bKk.a.j(AbstractC3781bKk.a.this, valueAnimator4);
                }
            });
            valueAnimator3.setDuration(1400L);
            valueAnimator3.setRepeatMode(2);
            valueAnimator3.setRepeatCount(-1);
            valueAnimator3.setIntValues(PrivateKeyType.INVALID, 51);
            animatorSet.playSequentially(valueAnimator2, valueAnimator3);
            this.h = animatorSet;
            this.e = valueAnimator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(a aVar, ValueAnimator valueAnimator) {
            C8632dsu.c((Object) aVar, "");
            C8632dsu.c((Object) valueAnimator, "");
            b bVar = aVar.d;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C8632dsu.d(animatedValue);
            bVar.setAlpha(((Integer) animatedValue).intValue());
            aVar.d().invalidate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a aVar, ValueAnimator valueAnimator) {
            C8632dsu.c((Object) aVar, "");
            C8632dsu.c((Object) valueAnimator, "");
            b bVar = aVar.d;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C8632dsu.d(animatedValue);
            bVar.setAlpha(((Integer) animatedValue).intValue());
            aVar.d().invalidate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(a aVar, ValueAnimator valueAnimator) {
            C8632dsu.c((Object) aVar, "");
            C8632dsu.c((Object) valueAnimator, "");
            b bVar = aVar.d;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C8632dsu.d(animatedValue);
            bVar.setAlpha(((Integer) animatedValue).intValue());
            aVar.d().invalidate();
        }

        public final void d(boolean z, long j) {
            Animator animator;
            if (z) {
                if (this.a.isRunning()) {
                    this.a.cancel();
                }
                animator = this.h;
            } else {
                if (this.h.isRunning()) {
                    this.h.cancel();
                }
                animator = this.a;
            }
            this.e = animator;
            animator.setStartDelay(j);
        }

        public final View d() {
            View view = this.b;
            if (view != null) {
                return view;
            }
            C8632dsu.d("");
            return null;
        }

        @Override // o.AbstractC3179au
        public void e(View view) {
            C8632dsu.c((Object) view, "");
            View findViewById = view.findViewById(C3796bKz.a.x);
            if (findViewById != null) {
                view = findViewById;
            }
            this.b = view;
            d().setBackground(this.d);
        }

        public final void c(boolean z, boolean z2, Integer num) {
            if (z) {
                C9702vQ.a(d());
            } else if (!z2) {
                d().setOutlineProvider(null);
            } else if (num != null) {
                C9702vQ.d(d(), num.intValue(), false, false, 6, null);
            } else {
                C9702vQ.d(d(), 0, false, false, 7, null);
            }
        }
    }

    /* renamed from: o.bKk$b */
    /* loaded from: classes4.dex */
    public static final class b extends Drawable {
        private Rect b;
        private final ColorDrawable d = new ColorDrawable();

        public final void a(Rect rect) {
            this.b = rect;
        }

        public final ColorDrawable e() {
            return this.d;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            C8632dsu.c((Object) canvas, "");
            this.d.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public void setBounds(int i, int i2, int i3, int i4) {
            ColorDrawable colorDrawable = this.d;
            Rect rect = this.b;
            colorDrawable.setBounds(rect != null ? rect.left : 0, rect != null ? rect.top : 0, i3 - (rect != null ? rect.right : 0), i4 - (rect != null ? rect.bottom : 0));
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.d.setAlpha(i);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.d.setColorFilter(colorFilter);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return this.d.getOpacity();
        }
    }
}
