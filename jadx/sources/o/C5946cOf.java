package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.ProgressBar;
import androidx.core.view.OneShotPreDrawListener;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_SimplifiedProfileSpinnerAmazon;
import com.netflix.model.leafs.ArtworkColors;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import o.C5855cKw;
import o.C5946cOf;
import o.C9834xU;
import o.C9914yv;
import o.cNY;
import o.dpR;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.cOf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5946cOf implements InterfaceC5847cKo {
    public static final b a = new b(null);
    public static final int d = 8;
    private Animator b;
    private final ColorDrawable c;
    private final NetflixImageView e;
    private final ProgressBar f;
    private cNY.d g;
    private final boolean h;
    private ViewGroup i;
    private boolean j;
    private final View k;
    private final InterfaceC8554dpx l;
    private final NetflixImageView n;

    public final boolean e() {
        return this.h;
    }

    public C5946cOf(ViewGroup viewGroup, boolean z) {
        InterfaceC8554dpx b2;
        C8632dsu.c((Object) viewGroup, "");
        this.h = z;
        ColorDrawable colorDrawable = new ColorDrawable(ArtworkColors.DEFAULT_BACKGROUND_COLOR);
        this.c = colorDrawable;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C5855cKw.c.r, viewGroup, false);
        inflate.setBackground(colorDrawable);
        this.k = inflate;
        this.e = (NetflixImageView) inflate.findViewById(C5855cKw.d.y);
        this.n = (NetflixImageView) inflate.findViewById(C5855cKw.d.m);
        this.f = (ProgressBar) inflate.findViewById(C5855cKw.d.n);
        b2 = dpB.b(new drO<e>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileSplashScreenImpl$stripesHolder$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final C5946cOf.e invoke() {
                C5946cOf.e f2;
                f2 = C5946cOf.this.f();
                return f2;
            }
        });
        this.l = b2;
    }

    /* renamed from: o.cOf$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("ProfileSplashScreenImpl");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e i() {
        return (e) this.l.getValue();
    }

    @Override // o.InterfaceC5847cKo
    public boolean c() {
        return C8632dsu.c(this.k.getParent(), this.i);
    }

    public final boolean b() {
        return Config_FastProperty_SimplifiedProfileSpinnerAmazon.Companion.e() && C8151dev.c();
    }

    public void c(ViewGroup viewGroup, View view, String str, drO<dpR> dro) {
        C8632dsu.c((Object) viewGroup, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) dro, "");
        this.j = true;
        d(viewGroup);
        this.e.showImage(str);
        cNY.a.e(str);
        if (b()) {
            h();
        } else {
            e(true, false);
        }
        this.e.animate().cancel();
        View view2 = this.k;
        C8632dsu.a(view2, "");
        OneShotPreDrawListener.add(view2, new m(view2, view, this, dro));
    }

    /* renamed from: o.cOf$c */
    /* loaded from: classes4.dex */
    public static final class c implements Animator.AnimatorListener {
        final /* synthetic */ drO a;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public c(drO dro) {
            this.a = dro;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C5946cOf.a.getLogTag();
            this.a.invoke();
        }
    }

    /* renamed from: o.cOf$f */
    /* loaded from: classes4.dex */
    public static final class f implements Animator.AnimatorListener {
        final /* synthetic */ drO e;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public f(drO dro) {
            this.e = dro;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C5946cOf.a.getLogTag();
            C5946cOf.this.b = null;
            if (!C5946cOf.this.j) {
                ViewGroup viewGroup = C5946cOf.this.i;
                if (viewGroup != null) {
                    viewGroup.removeView(C5946cOf.this.k);
                }
                C5946cOf.this.i = null;
            }
            this.e.invoke();
        }
    }

    /* renamed from: o.cOf$g */
    /* loaded from: classes4.dex */
    public static final class g implements Animator.AnimatorListener {
        final /* synthetic */ View d;
        final /* synthetic */ drO e;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public g(View view, drO dro) {
            this.d = view;
            this.e = dro;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C5946cOf.a.getLogTag();
            C5946cOf.this.b = null;
            this.d.setAlpha(1.0f);
            ViewGroup viewGroup = C5946cOf.this.i;
            if (viewGroup != null) {
                viewGroup.removeView(C5946cOf.this.k);
            }
            C5946cOf.this.i = null;
            this.e.invoke();
        }
    }

    /* renamed from: o.cOf$k */
    /* loaded from: classes4.dex */
    public static final class k implements Animator.AnimatorListener {
        final /* synthetic */ AnimatedVectorDrawableCompat b;
        final /* synthetic */ boolean d;
        final /* synthetic */ boolean e;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        public k(AnimatedVectorDrawableCompat animatedVectorDrawableCompat, boolean z, boolean z2) {
            this.b = animatedVectorDrawableCompat;
            this.d = z;
            this.e = z2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C5946cOf.this.c(this.b, this.d, this.e);
        }
    }

    /* renamed from: o.cOf$p */
    /* loaded from: classes4.dex */
    public static final class p implements Animator.AnimatorListener {
        final /* synthetic */ drO d;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public p(drO dro) {
            this.d = dro;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C5946cOf.a.getLogTag();
            e i = C5946cOf.this.i();
            if (i != null) {
                i.a(C5946cOf.this.k.getHeight() * 2);
            }
            C5946cOf.this.b = null;
            this.d.invoke();
        }
    }

    /* renamed from: o.cOf$q */
    /* loaded from: classes4.dex */
    public static final class q implements Animator.AnimatorListener {
        final /* synthetic */ drO e;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public q(drO dro) {
            this.e = dro;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C5946cOf.this.b = null;
            this.e.invoke();
        }
    }

    /* renamed from: o.cOf$t */
    /* loaded from: classes4.dex */
    public static final class t implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        public t() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C5946cOf.a.getLogTag();
            if (C5946cOf.this.e()) {
                cNY.a.b(C5855cKw.b.c);
            }
        }
    }

    /* renamed from: o.cOf$h */
    /* loaded from: classes4.dex */
    public static final class h implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C5946cOf.a.getLogTag();
            cNY.a.b(C5855cKw.b.d);
        }
    }

    /* renamed from: o.cOf$d */
    /* loaded from: classes4.dex */
    public static final class d implements View.OnAttachStateChangeListener {
        d() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            C8632dsu.c((Object) view, "");
            if (C8632dsu.c(view, C5946cOf.this.k)) {
                C5946cOf.a.getLogTag();
                cNY.a.c(true);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C8632dsu.c((Object) view, "");
            if (C8632dsu.c(view, C5946cOf.this.k)) {
                C5946cOf.a.getLogTag();
                cNY cny = cNY.a;
                cny.c(false);
                cNY.d dVar = C5946cOf.this.g;
                if (dVar != null) {
                    cny.a(dVar);
                }
            }
        }
    }

    private final void d(ViewGroup viewGroup) {
        this.k.addOnAttachStateChangeListener(new d());
        this.i = viewGroup;
        viewGroup.addView(this.k, -1, -1);
        g();
    }

    public void d(ViewGroup viewGroup, boolean z) {
        C8632dsu.c((Object) viewGroup, "");
        this.j = false;
        d(viewGroup);
        this.e.showImage(cNY.a.a());
        if (b()) {
            h();
        } else {
            e(false, z);
        }
        View view = this.k;
        C8632dsu.a(view, "");
        OneShotPreDrawListener.add(view, new o(view, this));
    }

    /* renamed from: o.cOf$j */
    /* loaded from: classes4.dex */
    public static final class j implements cNY.d {
        j() {
        }

        @Override // o.cNY.d
        public void c(float f) {
            C5946cOf.this.f.setAlpha(f);
        }
    }

    private final void h() {
        j jVar = new j();
        cNY.a.d(jVar);
        this.g = jVar;
        this.f.setVisibility(0);
    }

    /* renamed from: o.cOf$l */
    /* loaded from: classes4.dex */
    public static final class l implements cNY.d {
        l() {
        }

        @Override // o.cNY.d
        public void c(float f) {
            C5946cOf.this.n.setAlpha(f);
        }
    }

    @Override // o.InterfaceC5847cKo
    public void a() {
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            viewGroup.removeView(this.k);
        }
    }

    @Override // o.InterfaceC5847cKo
    public void d(View view, drO<dpR> dro) {
        C8632dsu.c((Object) dro, "");
        cNY.a.e();
        if (this.k.getParent() == null) {
            dro.invoke();
            return;
        }
        a.getLogTag();
        Animator animator = this.b;
        if (animator != null) {
            animator.cancel();
        }
        View view2 = this.k;
        C8632dsu.a(view2, "");
        OneShotPreDrawListener.add(view2, new a(view2, view, this, dro));
        this.k.invalidate();
    }

    /* renamed from: o.cOf$a */
    /* loaded from: classes4.dex */
    public static final class a implements Runnable {
        final /* synthetic */ View a;
        final /* synthetic */ C5946cOf b;
        final /* synthetic */ View c;
        final /* synthetic */ drO e;

        public a(View view, View view2, C5946cOf c5946cOf, drO dro) {
            this.a = view;
            this.c = view2;
            this.b = c5946cOf;
            this.e = dro;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            AnimatorSet animatorSet;
            Animator e;
            C5946cOf.a.getLogTag();
            Rect rect = new Rect();
            View view = this.c;
            if (view != null) {
                view.getGlobalVisibleRect(rect);
            }
            if (this.b.e()) {
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 1);
                ofInt.setStartDelay(200L);
                ofInt.setDuration(1L);
                C8632dsu.d(ofInt);
                ofInt.addListener(new h());
                animatorSet = ofInt;
            } else {
                animatorSet = new AnimatorSet();
            }
            Rect rect2 = new Rect();
            View findViewById = this.b.k.findViewById(C5855cKw.d.y);
            findViewById.getGlobalVisibleRect(rect2);
            if (this.c == null || rect2.isEmpty() || rect.isEmpty()) {
                cNY.a.e(false);
                C5946cOf c5946cOf = this.b;
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b.e, View.ALPHA, 1.0f, 0.0f);
                ofFloat.setDuration(500L);
                dpR dpr = dpR.c;
                animatorSet2.playTogether(C5946cOf.c(this.b, (drO) null, 1, (Object) null), ofFloat, animatorSet);
                animatorSet2.setInterpolator(new LinearInterpolator());
                animatorSet2.addListener(new f(this.e));
                animatorSet2.start();
                c5946cOf.b = animatorSet2;
                return;
            }
            rect.set(rect.left + this.c.getPaddingLeft(), rect.top + this.c.getPaddingTop(), rect.right - this.c.getPaddingRight(), rect.bottom - this.c.getPaddingBottom());
            this.c.setAlpha(0.0f);
            RectF rectF = new RectF(rect2);
            RectF rectF2 = new RectF(rect);
            float height = rectF2.height() / rectF.height();
            float f = rectF2.left;
            float f2 = rectF.left;
            float f3 = 2;
            float width = (rectF.width() - (rectF.width() * height)) / f3;
            float f4 = rectF2.top;
            float f5 = rectF.top;
            float height2 = (rectF.height() - (rectF.height() * height)) / f3;
            int dimensionPixelSize = findViewById.getResources().getDimensionPixelSize(C9834xU.a.s);
            AnimatorSet animatorSet3 = animatorSet;
            PathInterpolator pathInterpolator = new PathInterpolator(0.37f, 0.0f, 0.63f, 1.0f);
            cNY.a.e(false);
            C5946cOf c5946cOf2 = this.b;
            AnimatorSet animatorSet4 = new AnimatorSet();
            AnimatorSet animatorSet5 = new AnimatorSet();
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(findViewById, View.TRANSLATION_X, 0.0f, (f - f2) - width);
            ofFloat2.setInterpolator(new PathInterpolator(0.73f, 0.38f, 0.66f, 0.82f));
            dpR dpr2 = dpR.c;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(findViewById, View.TRANSLATION_Y, 0.0f, (f4 - f5) - height2);
            ofFloat3.setInterpolator(new PathInterpolator(0.17f, 0.67f, 0.62f, 0.9f));
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(findViewById, View.SCALE_X, 1.0f, height);
            ofFloat4.setInterpolator(pathInterpolator);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(findViewById, View.SCALE_Y, 1.0f, height);
            ofFloat5.setInterpolator(pathInterpolator);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(findViewById, View.Z, findViewById.getTranslationZ(), 0.0f);
            ofFloat6.setInterpolator(pathInterpolator);
            C9914yv.a aVar = C9914yv.a;
            C8632dsu.d(findViewById);
            e = aVar.e(findViewById, dimensionPixelSize, (int) (dimensionPixelSize * (rectF.height() / rectF2.height())), (r13 & 8) != 0 ? false : false, (r13 & 16) != 0 ? false : false);
            animatorSet5.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, e);
            animatorSet5.setDuration(850L);
            animatorSet5.setStartDelay(0L);
            animatorSet4.playTogether(C5946cOf.c(this.b, (drO) null, 1, (Object) null), this.b.d(), animatorSet5, animatorSet3);
            animatorSet4.addListener(new g(this.c, this.e));
            animatorSet4.start();
            c5946cOf2.b = animatorSet4;
        }
    }

    /* renamed from: o.cOf$i */
    /* loaded from: classes4.dex */
    public static final class i implements Runnable {
        final /* synthetic */ C5946cOf a;
        final /* synthetic */ View c;
        final /* synthetic */ AnimatedVectorDrawableCompat e;

        public i(View view, C5946cOf c5946cOf, AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
            this.c = view;
            this.a = c5946cOf;
            this.e = animatedVectorDrawableCompat;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.n.setImageDrawable(this.e);
            C5946cOf.a.getLogTag();
            this.e.start();
        }
    }

    /* renamed from: o.cOf$m */
    /* loaded from: classes4.dex */
    public static final class m implements Runnable {
        final /* synthetic */ View a;
        final /* synthetic */ View b;
        final /* synthetic */ C5946cOf c;
        final /* synthetic */ drO e;

        public m(View view, View view2, C5946cOf c5946cOf, drO dro) {
            this.b = view;
            this.a = view2;
            this.c = c5946cOf;
            this.e = dro;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Animator e;
            PathInterpolator pathInterpolator;
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 1);
            ofInt.setDuration(1L);
            C8632dsu.d(ofInt);
            ofInt.addListener(new t());
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            View view = this.a;
            if (view != null) {
                view.getGlobalVisibleRect(rect);
            }
            View findViewById = this.c.k.findViewById(C5855cKw.d.y);
            findViewById.getGlobalVisibleRect(rect2);
            if (this.a != null && !rect.isEmpty() && !rect2.isEmpty()) {
                Animator animator = this.c.b;
                if (animator != null) {
                    animator.cancel();
                }
                this.a.setAlpha(0.0f);
                RectF rectF = new RectF(rect);
                RectF rectF2 = new RectF(rect2);
                float height = rectF.height() / rectF2.height();
                float f = rectF.left;
                float f2 = rectF2.left;
                float f3 = 2;
                float width = (rectF2.width() - (rectF2.width() * height)) / f3;
                float f4 = rectF.top;
                float f5 = rectF2.top;
                float height2 = (rectF2.height() - (rectF2.height() * height)) / f3;
                int dimensionPixelSize = findViewById.getResources().getDimensionPixelSize(C9834xU.a.s);
                C5946cOf c5946cOf = this.c;
                AnimatorSet animatorSet = new AnimatorSet();
                Animator[] animatorArr = new Animator[3];
                AnimatorSet animatorSet2 = new AnimatorSet();
                Property property = View.SCALE_X;
                float[] fArr = {height, 1.0f};
                Property property2 = View.SCALE_Y;
                float[] fArr2 = {height, 1.0f};
                C9914yv.a aVar = C9914yv.a;
                C8632dsu.d(findViewById);
                e = aVar.e(findViewById, (int) ((dimensionPixelSize * rectF2.height()) / rectF.height()), dimensionPixelSize, (r13 & 8) != 0 ? false : false, (r13 & 16) != 0 ? false : false);
                animatorSet2.playTogether(ObjectAnimator.ofFloat(findViewById, View.TRANSLATION_X, f - (f2 + width), 0.0f), ObjectAnimator.ofFloat(findViewById, View.TRANSLATION_Y, f4 - (f5 + height2), 0.0f), ObjectAnimator.ofFloat(findViewById, property, fArr), ObjectAnimator.ofFloat(findViewById, property2, fArr2), e);
                animatorSet2.setDuration(this.c.e() ? 600L : 670L);
                if (this.c.e()) {
                    pathInterpolator = new PathInterpolator(0.34f, 1.56f, 0.64f, 1.0f);
                } else {
                    pathInterpolator = new PathInterpolator(0.22f, 1.0f, 0.36f, 1.0f);
                }
                animatorSet2.setInterpolator(pathInterpolator);
                dpR dpr = dpR.c;
                animatorArr[0] = animatorSet2;
                Animator c = this.c.c(true);
                c.setDuration(250L);
                c.setInterpolator(new LinearInterpolator());
                animatorArr[1] = c;
                animatorArr[2] = ofInt;
                animatorSet.playTogether(animatorArr);
                animatorSet.addListener(new p(this.e));
                animatorSet.start();
                c5946cOf.b = animatorSet;
                return;
            }
            C5946cOf c5946cOf2 = this.c;
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(this.c.c(true), ofInt);
            animatorSet3.setDuration(2000L);
            animatorSet3.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet3.addListener(new q(this.e));
            animatorSet3.start();
            c5946cOf2.b = animatorSet3;
        }
    }

    /* renamed from: o.cOf$n */
    /* loaded from: classes4.dex */
    public static final class n implements Runnable {
        final /* synthetic */ AnimatedVectorDrawableCompat b;
        final /* synthetic */ View d;

        public n(View view, AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
            this.d = view;
            this.b = animatedVectorDrawableCompat;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.b.start();
        }
    }

    /* renamed from: o.cOf$o */
    /* loaded from: classes4.dex */
    public static final class o implements Runnable {
        final /* synthetic */ C5946cOf b;
        final /* synthetic */ View d;

        public o(View view, C5946cOf c5946cOf) {
            this.d = view;
            this.b = c5946cOf;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e i = this.b.i();
            if (i != null) {
                i.a(this.b.k.getHeight() * 2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Animator d() {
        if (this.h) {
            return new AnimatorSet();
        }
        Animator c2 = c(false);
        c2.setStartDelay(333L);
        c2.setDuration(400L);
        return c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Animator c(boolean z) {
        if (z) {
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.c, PropertyValuesHolder.ofInt(InteractiveAnimation.ANIMATION_TYPE.ALPHA, 0, PrivateKeyType.INVALID));
            C8632dsu.a(ofPropertyValuesHolder, "");
            return ofPropertyValuesHolder;
        }
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.c, PropertyValuesHolder.ofInt(InteractiveAnimation.ANIMATION_TYPE.ALPHA, PrivateKeyType.INVALID, 0));
        C8632dsu.a(ofPropertyValuesHolder2, "");
        return ofPropertyValuesHolder2;
    }

    private final void g() {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        if (C8151dev.f() && this.e.getResources().getConfiguration().orientation == 1) {
            dimensionPixelSize = this.e.getResources().getDimensionPixelSize(C5855cKw.a.g);
            dimensionPixelSize2 = this.e.getResources().getDimensionPixelSize(C5855cKw.a.n);
        } else {
            dimensionPixelSize = this.e.getResources().getDimensionPixelSize(C5855cKw.a.i);
            dimensionPixelSize2 = this.e.getResources().getDimensionPixelSize(C5855cKw.a.f13674o);
        }
        NetflixImageView netflixImageView = this.e;
        C8632dsu.a(netflixImageView, "");
        ViewGroup.LayoutParams layoutParams = netflixImageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            netflixImageView.setLayoutParams(layoutParams);
            NetflixImageView netflixImageView2 = this.n;
            C8632dsu.a(netflixImageView2, "");
            ViewGroup.LayoutParams layoutParams2 = netflixImageView2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = dimensionPixelSize2;
                layoutParams2.height = dimensionPixelSize2;
                netflixImageView2.setLayoutParams(layoutParams2);
                ProgressBar progressBar = this.f;
                C8632dsu.a(progressBar, "");
                ViewGroup.LayoutParams layoutParams3 = progressBar.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = dimensionPixelSize2;
                    layoutParams3.height = dimensionPixelSize2;
                    progressBar.setLayoutParams(layoutParams3);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e f() {
        if (this.h) {
            if (C8153dex.C()) {
                ViewStub viewStub = (ViewStub) this.k.findViewById(C5855cKw.d.ad);
                viewStub.setLayoutResource(C5855cKw.c.e);
                View inflate = viewStub.inflate();
                C8632dsu.d(inflate);
                ViewGroup viewGroup = (ViewGroup) inflate;
                View findViewById = viewGroup.findViewById(C5855cKw.d.aa);
                C8632dsu.a(findViewById, "");
                View findViewById2 = viewGroup.findViewById(C5855cKw.d.ab);
                C8632dsu.a(findViewById2, "");
                View findViewById3 = viewGroup.findViewById(C5855cKw.d.Y);
                C8632dsu.a(findViewById3, "");
                View findViewById4 = viewGroup.findViewById(C5855cKw.d.ac);
                C8632dsu.a(findViewById4, "");
                return new e(findViewById, findViewById2, findViewById3, findViewById4);
            }
            ViewStub viewStub2 = (ViewStub) this.k.findViewById(C5855cKw.d.ad);
            viewStub2.setLayoutResource(C5855cKw.c.t);
            View inflate2 = viewStub2.inflate();
            C8632dsu.d(inflate2);
            ViewGroup viewGroup2 = (ViewGroup) inflate2;
            View findViewById5 = viewGroup2.findViewById(C5855cKw.d.u);
            C8632dsu.a(findViewById5, "");
            View findViewById6 = viewGroup2.findViewById(C5855cKw.d.U);
            C8632dsu.a(findViewById6, "");
            View findViewById7 = viewGroup2.findViewById(C5855cKw.d.c);
            C8632dsu.a(findViewById7, "");
            View findViewById8 = viewGroup2.findViewById(C5855cKw.d.f13677o);
            C8632dsu.a(findViewById8, "");
            return new e(findViewById5, findViewById6, findViewById7, findViewById8);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Animator c(C5946cOf c5946cOf, drO dro, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dro = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileSplashScreenImpl$createStripesAnimation$1
                public final void b() {
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    b();
                    return dpR.c;
                }
            };
        }
        return c5946cOf.e(dro);
    }

    private final Animator e(drO<dpR> dro) {
        Animator c2;
        e i2 = i();
        if (!this.h || i2 == null) {
            return new AnimatorSet();
        }
        if (this.j) {
            c2 = new AnimatorSet();
        } else {
            c2 = c(false);
            c2.setDuration(1L);
            c2.setStartDelay(500L);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(e(this, i2.d(), 0L, 2, null), e(i2.d()));
        dpR dpr = dpR.c;
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(d(i2.e(), 50L), e(i2.e()));
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playSequentially(d(i2.b(), 150L), e(i2.b()));
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.playSequentially(d(i2.c(), 200L), e(i2.c()));
        animatorSet.playTogether(animatorSet2, animatorSet3, animatorSet4, animatorSet5, c2);
        animatorSet.setStartDelay(0L);
        animatorSet.addListener(new c(dro));
        return animatorSet;
    }

    static /* synthetic */ Animator e(C5946cOf c5946cOf, View view, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        return c5946cOf.d(view, j2);
    }

    private final Animator d(View view, long j2) {
        view.setTranslationY(-view.getHeight());
        Animator e2 = e(view, -view.getHeight(), (this.k.getHeight() / 2) - (view.getHeight() / 2));
        e2.setStartDelay(j2);
        return e2;
    }

    private final Animator e(View view) {
        return e(view, (this.k.getHeight() / 2) - (view.getHeight() / 2), view.getHeight());
    }

    private final Animator e(View view, int i2, int i3) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, i2, i3);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new PathInterpolator(0.22f, 1.0f, 0.36f, 1.0f));
        C8632dsu.a(ofFloat, "");
        return ofFloat;
    }

    /* renamed from: o.cOf$e */
    /* loaded from: classes4.dex */
    public static final class e {
        private final View a;
        private final View b;
        private final View d;
        private final View e;

        public final View b() {
            return this.b;
        }

        public final View c() {
            return this.a;
        }

        public final View d() {
            return this.e;
        }

        public final View e() {
            return this.d;
        }

        public e(View view, View view2, View view3, View view4) {
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) view2, "");
            C8632dsu.c((Object) view3, "");
            C8632dsu.c((Object) view4, "");
            this.e = view;
            this.b = view2;
            this.a = view3;
            this.d = view4;
        }

        public final void a(int i) {
            this.e.getLayoutParams().height = i;
            float f = -i;
            this.e.setTranslationY(f);
            this.b.getLayoutParams().height = i;
            this.b.setTranslationY(f);
            this.a.getLayoutParams().height = i;
            this.a.setTranslationY(f);
            this.d.getLayoutParams().height = i;
            this.d.setTranslationY(f);
        }
    }

    private final void e(boolean z, boolean z2) {
        a.getLogTag();
        cNY cny = cNY.a;
        AnimatedVectorDrawableCompat c2 = cny.c();
        if (c2 != null) {
            long currentTimeMillis = (this.h ? 1100L : 800L) - (System.currentTimeMillis() - cny.b());
            if (currentTimeMillis > 0) {
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 1);
                ofInt.setStartDelay(currentTimeMillis);
                ofInt.setDuration(1L);
                C8632dsu.d(ofInt);
                ofInt.addListener(new k(c2, z, z2));
                ofInt.start();
                return;
            }
            c(c2, z, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(AnimatedVectorDrawableCompat animatedVectorDrawableCompat, boolean z, boolean z2) {
        b bVar = a;
        bVar.getLogTag();
        if (z || (this.b == null && c())) {
            bVar.getLogTag();
            l lVar = new l();
            cNY cny = cNY.a;
            cny.d(lVar);
            this.g = lVar;
            this.n.setVisibility(0);
            this.n.invalidate();
            if (z) {
                if (!this.h) {
                    cny.e(true);
                }
                this.n.setImageDrawable(animatedVectorDrawableCompat);
                bVar.getLogTag();
                animatedVectorDrawableCompat.start();
            } else if (z2) {
                NetflixImageView netflixImageView = this.n;
                C8632dsu.a(netflixImageView, "");
                OneShotPreDrawListener.add(netflixImageView, new i(netflixImageView, this, animatedVectorDrawableCompat));
            } else {
                this.n.setImageDrawable(animatedVectorDrawableCompat);
                NetflixImageView netflixImageView2 = this.n;
                C8632dsu.a(netflixImageView2, "");
                OneShotPreDrawListener.add(netflixImageView2, new n(netflixImageView2, animatedVectorDrawableCompat));
            }
        }
    }
}
