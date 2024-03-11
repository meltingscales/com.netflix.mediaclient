package o;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteTitlesStackManager;
import o.AbstractC3534bBk;

/* renamed from: o.bBv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3545bBv {
    private final C9935zP a;
    private final C3547bBx b;
    private final C3548bBy c;
    private final C3540bBq d;
    private final a e;
    private final CollectTasteTitlesStackManager f;

    public C3545bBv(a aVar, C9935zP c9935zP, C3548bBy c3548bBy, C3540bBq c3540bBq, CollectTasteTitlesStackManager collectTasteTitlesStackManager, C3547bBx c3547bBx) {
        C8632dsu.c((Object) aVar, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) c3548bBy, "");
        C8632dsu.c((Object) c3540bBq, "");
        C8632dsu.c((Object) collectTasteTitlesStackManager, "");
        C8632dsu.c((Object) c3547bBx, "");
        this.e = aVar;
        this.a = c9935zP;
        this.c = c3548bBy;
        this.d = c3540bBq;
        this.f = collectTasteTitlesStackManager;
        this.b = c3547bBx;
    }

    public /* synthetic */ C3545bBv(a aVar, C9935zP c9935zP, C3548bBy c3548bBy, C3540bBq c3540bBq, CollectTasteTitlesStackManager collectTasteTitlesStackManager, C3547bBx c3547bBx, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? new a(false, false, false, false, 15, null) : aVar, c9935zP, c3548bBy, c3540bBq, collectTasteTitlesStackManager, c3547bBx);
    }

    /* renamed from: o.bBv$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private boolean b;
        private boolean c;
        private boolean d;
        private boolean e;

        public a() {
            this(false, false, false, false, 15, null);
        }

        public final void a(boolean z) {
            this.c = z;
        }

        public final void b(boolean z) {
            this.e = z;
        }

        public final boolean b() {
            return this.e;
        }

        public final void c(boolean z) {
            this.d = z;
        }

        public final boolean c() {
            return this.b;
        }

        public final boolean d() {
            return this.d;
        }

        public final void e(boolean z) {
            this.b = z;
        }

        public final boolean e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.d == aVar.d && this.b == aVar.b && this.e == aVar.e && this.c == aVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.d) * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.c);
        }

        public String toString() {
            boolean z = this.d;
            boolean z2 = this.b;
            boolean z3 = this.e;
            boolean z4 = this.c;
            return "HintAnimationState(started=" + z + ", inProgress=" + z2 + ", canceled=" + z3 + ", completed=" + z4 + ")";
        }

        public a(boolean z, boolean z2, boolean z3, boolean z4) {
            this.d = z;
            this.b = z2;
            this.e = z3;
            this.c = z4;
        }

        public /* synthetic */ a(boolean z, boolean z2, boolean z3, boolean z4, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
        }
    }

    public final boolean d() {
        return this.e.e() || this.e.b();
    }

    /* renamed from: o.bBv$d */
    /* loaded from: classes4.dex */
    public static final class d extends Abstractanimation.Animation$AnimationListenerC9916yx {
        d() {
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            C3545bBv.this.e.c(true);
            C3545bBv.this.e.e(true);
            C3545bBv.this.f.i();
            C3545bBv.this.e(new AbstractC3534bBk.d(CollectTasteTitlesStackManager.Companion.HintAnimationDirection.c));
        }
    }

    public final void b() {
        this.c.a().setAnimationListener(new d());
        this.d.d().setAnimationListener(new c());
        this.c.d().setAnimationListener(new b());
        this.c.e().setAnimationListener(new j());
        this.c.b().setAnimationListener(new i());
        this.f.e();
    }

    /* renamed from: o.bBv$c */
    /* loaded from: classes4.dex */
    public static final class c extends Abstractanimation.Animation$AnimationListenerC9916yx {
        c() {
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (C3545bBv.this.e.b()) {
                return;
            }
            C3545bBv.this.b.b();
            C3545bBv.this.f.b(CollectTasteTitlesStackManager.Companion.HintAnimationDirection.d);
        }
    }

    /* renamed from: o.bBv$b */
    /* loaded from: classes4.dex */
    public static final class b extends Abstractanimation.Animation$AnimationListenerC9916yx {
        b() {
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            C3545bBv.this.f.g();
            C3545bBv.this.e(new AbstractC3534bBk.d(CollectTasteTitlesStackManager.Companion.HintAnimationDirection.d));
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (C3545bBv.this.e.b()) {
                return;
            }
            C3545bBv.this.f.b(CollectTasteTitlesStackManager.Companion.HintAnimationDirection.e);
        }
    }

    /* renamed from: o.bBv$j */
    /* loaded from: classes4.dex */
    public static final class j extends Abstractanimation.Animation$AnimationListenerC9916yx {
        j() {
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            C3545bBv.this.f.c();
            C3545bBv.this.e(new AbstractC3534bBk.d(CollectTasteTitlesStackManager.Companion.HintAnimationDirection.e));
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (C3545bBv.this.e.b()) {
                return;
            }
            C3545bBv.this.b.d();
            C3545bBv.this.f.b(CollectTasteTitlesStackManager.Companion.HintAnimationDirection.b);
        }
    }

    /* renamed from: o.bBv$i */
    /* loaded from: classes4.dex */
    public static final class i extends Abstractanimation.Animation$AnimationListenerC9916yx {
        i() {
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            C3545bBv.this.f.f();
            C3545bBv.this.e(new AbstractC3534bBk.d(CollectTasteTitlesStackManager.Companion.HintAnimationDirection.b));
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C3545bBv.this.e.e(false);
            C3545bBv.this.e(AbstractC3534bBk.c.b);
            C3545bBv.this.e.a(true);
        }
    }

    public final void a() {
        this.f.b(CollectTasteTitlesStackManager.Companion.HintAnimationDirection.c);
    }

    public final void j(View view) {
        C8632dsu.c((Object) view, "");
        view.setAlpha(1.0f);
        view.setVisibility(0);
        view.startAnimation(this.d.d());
    }

    public final void i(View view) {
        C8632dsu.c((Object) view, "");
        view.startAnimation(this.d.c());
    }

    public final void b(View view) {
        C8632dsu.c((Object) view, "");
        view.setAlpha(1.0f);
        view.setVisibility(0);
        view.startAnimation(this.d.b());
    }

    public final void f(View view) {
        C8632dsu.c((Object) view, "");
        view.startAnimation(this.d.a());
    }

    public final void a(View view) {
        C8632dsu.c((Object) view, "");
        view.setAlpha(0.0f);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(100L);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void e(View view) {
        C8632dsu.c((Object) view, "");
        view.setOnTouchListener(new View.OnTouchListener() { // from class: o.bBu
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean b2;
                b2 = C3545bBv.b(C3545bBv.this, view2, motionEvent);
                return b2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(C3545bBv c3545bBv, View view, MotionEvent motionEvent) {
        C8632dsu.c((Object) c3545bBv, "");
        if (c3545bBv.e.c()) {
            c3545bBv.c();
        } else if (c3545bBv.e.d()) {
            return false;
        }
        return true;
    }

    public final void c(View view) {
        C8632dsu.c((Object) view, "");
        view.setOnTouchListener(null);
    }

    public final void d(View view) {
        C8632dsu.c((Object) view, "");
        view.clearAnimation();
        view.setVisibility(4);
    }

    public final void a(View view, long j2) {
        C8632dsu.c((Object) view, "");
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setDuration(j2);
        alphaAnimation.setAnimationListener(new e(view));
        view.startAnimation(alphaAnimation);
    }

    /* renamed from: o.bBv$e */
    /* loaded from: classes4.dex */
    public static final class e extends Abstractanimation.Animation$AnimationListenerC9916yx {
        final /* synthetic */ View c;

        e(View view) {
            this.c = view;
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.c.setVisibility(4);
        }
    }

    private final void c() {
        this.e.b(true);
        this.b.g();
        this.b.h();
        this.f.b();
        e(AbstractC3534bBk.b.a);
        this.e.e(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(AbstractC3534bBk abstractC3534bBk) {
        this.a.b(AbstractC3534bBk.class, abstractC3534bBk);
    }
}
