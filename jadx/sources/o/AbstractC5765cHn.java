package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.ui.player.v2.uiView.PlayerUIView$startTranslateAppearanceAnimation$1;
import o.AbstractC5765cHn;
import o.dpR;

/* renamed from: o.cHn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5765cHn extends AbstractC9944zY<cBO> implements InterfaceC5730cGf {
    public static final e i = new e(null);
    private final float a;
    private final C7491cxH b;
    private final InterfaceC8554dpx c;
    private final Interpolator d;
    private final boolean e;
    private final View f;
    private final Interpolator g;
    private Animator h;
    private final Interpolator j;

    /* renamed from: o  reason: collision with root package name */
    private ViewPropertyAnimator f13663o;

    /* JADX INFO: Access modifiers changed from: protected */
    public final C7491cxH B() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean C() {
        return this.e;
    }

    protected final void e(ViewPropertyAnimator viewPropertyAnimator) {
        this.f13663o = viewPropertyAnimator;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5765cHn(View view) {
        super(view);
        InterfaceC8554dpx b2;
        C8632dsu.c((Object) view, "");
        this.f = view;
        this.e = C8171dfO.b() || C8141del.a();
        this.a = NetflixApplication.getInstance().getResources().getDimension(com.netflix.mediaclient.ui.R.b.A);
        Interpolator create = PathInterpolatorCompat.create(0.19f, 1.0f, 0.22f, 1.0f);
        C8632dsu.a(create, "");
        this.g = create;
        Interpolator create2 = PathInterpolatorCompat.create(0.23f, 1.0f, 0.32f, 1.0f);
        C8632dsu.a(create2, "");
        this.j = create2;
        Interpolator create3 = PathInterpolatorCompat.create(0.755f, 0.05f, 0.855f, 0.06f);
        C8632dsu.a(create3, "");
        this.d = create3;
        this.b = new C7491cxH();
        b2 = dpB.b(new drO<Integer>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PlayerUIView$containerId$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final Integer invoke() {
                return Integer.valueOf(AbstractC5765cHn.this.e().getId());
            }
        });
        this.c = b2;
    }

    /* renamed from: o.cHn$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    public int bI_() {
        return ((Number) this.c.getValue()).intValue();
    }

    public boolean w() {
        return e().getVisibility() == 0;
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void d() {
        c(e(), true);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void b() {
        c(e(), false);
    }

    public final void A() {
        ViewPropertyAnimator viewPropertyAnimator = this.f13663o;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        Animator animator = this.h;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // o.InterfaceC5730cGf
    public void q() {
        A();
        e().setVisibility(8);
    }

    private final void c(final View view, final boolean z) {
        if (view == null) {
            return;
        }
        float f = z ? 1.0f : 0.3f;
        if (this.e) {
            view.setAlpha(f);
            view.setClickable(z);
            return;
        }
        view.clearAnimation();
        view.animate().alpha(f).setDuration(200L).withStartAction(new Runnable() { // from class: o.cHm
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC5765cHn.e(view, z);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(View view, boolean z) {
        view.setClickable(z);
    }

    public static /* synthetic */ void a(AbstractC5765cHn abstractC5765cHn, boolean z, long j, long j2, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startVisibilityFadeAnimation");
        }
        if ((i2 & 2) != 0) {
            j = 150;
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = 100;
        }
        long j4 = j2;
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        abstractC5765cHn.a(z, j3, j4, z2);
    }

    public final void a(boolean z, long j, long j2, boolean z2) {
        if (this.e) {
            e().setVisibility(z ? 0 : z2 ? 4 : 8);
        } else if ((z && e().getVisibility() == 0 && e().getAlpha() == 1.0f) || (!z && (e().getVisibility() != 0 || e().getAlpha() == 0.0f))) {
            ViewPropertyAnimator viewPropertyAnimator = this.f13663o;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
        } else {
            ViewPropertyAnimator viewPropertyAnimator2 = this.f13663o;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
            }
            if (z) {
                if (e().getAlpha() == 1.0f) {
                    e().setAlpha(0.0f);
                }
                e().setVisibility(0);
            }
            this.f13663o = e().animate().setDuration(j).alpha(z ? 1.0f : 0.0f).setStartDelay((z && e().getAlpha() == 0.0f) ? 0L : 0L).setListener(new b(z, this, z2));
        }
    }

    /* renamed from: o.cHn$b */
    /* loaded from: classes4.dex */
    public static final class b extends AnimatorListenerAdapter {
        final /* synthetic */ AbstractC5765cHn a;
        final /* synthetic */ boolean b;
        private boolean c;
        final /* synthetic */ boolean e;

        b(boolean z, AbstractC5765cHn abstractC5765cHn, boolean z2) {
            this.e = z;
            this.a = abstractC5765cHn;
            this.b = z2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C8632dsu.c((Object) animator, "");
            super.onAnimationCancel(animator);
            this.c = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            if (!this.e && !this.c) {
                this.a.e().setVisibility(this.b ? 4 : 8);
                this.a.e().setAlpha(1.0f);
            }
            this.a.e((ViewPropertyAnimator) null);
        }
    }

    public static /* synthetic */ void a(AbstractC5765cHn abstractC5765cHn, boolean z, boolean z2, float f, boolean z3, drO dro, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startTranslateAppearanceAnimation");
        }
        if ((i2 & 4) != 0) {
            f = abstractC5765cHn.a;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            z3 = false;
        }
        boolean z4 = z3;
        PlayerUIView$startTranslateAppearanceAnimation$1 playerUIView$startTranslateAppearanceAnimation$1 = dro;
        if ((i2 & 16) != 0) {
            playerUIView$startTranslateAppearanceAnimation$1 = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PlayerUIView$startTranslateAppearanceAnimation$1
                public final void e() {
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    e();
                    return dpR.c;
                }
            };
        }
        abstractC5765cHn.c(z, z2, f2, z4, playerUIView$startTranslateAppearanceAnimation$1);
    }

    public final void c(boolean z, boolean z2, float f, boolean z3, drO<dpR> dro) {
        C8632dsu.c((Object) dro, "");
        if (this.e) {
            e().setVisibility(z ? 0 : 8);
            e().setAlpha(1.0f);
            dro.invoke();
            return;
        }
        boolean z4 = e().getVisibility() == 0 && C9913yu.a(e().getAlpha(), 1.0f);
        boolean z5 = e().getVisibility() != 0 || C9913yu.a(e().getAlpha(), 0.0f);
        if ((z && z4 && C9913yu.a(e().getTranslationY(), 0.0f)) || (!z && z5)) {
            Animator animator = this.h;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                e().setVisibility(0);
                e().setAlpha(1.0f);
                return;
            }
            return;
        }
        if (f <= 0.0f) {
            f = this.a;
        }
        if (z) {
            e().setVisibility(0);
            if (e().getAlpha() == 1.0f) {
                e().setAlpha(0.0f);
            }
            if (e().getTranslationY() == 0.0f) {
                e().setTranslationY(z2 ? f : -f);
            }
        }
        View e2 = e();
        Property property = View.TRANSLATION_Y;
        float[] fArr = new float[1];
        if (z) {
            f = 0.0f;
        } else if (!z2) {
            f = -f;
        }
        fArr[0] = f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(e2, property, fArr);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(this.j);
        float f2 = z ? z3 ? 0.3f : 1.0f : 0.0f;
        View e3 = e();
        Property property2 = View.ALPHA;
        float[] fArr2 = new float[2];
        fArr2[0] = z ? 0.0f : 1.0f;
        fArr2[1] = f2;
        ObjectAnimator duration = ObjectAnimator.ofFloat(e3, property2, fArr2).setDuration(150L);
        C8632dsu.a(duration, "");
        AnimatorSet animatorSet = new AnimatorSet();
        if (z && e().getAlpha() == 0.0f) {
            r3 = 100;
        }
        animatorSet.setStartDelay(r3);
        animatorSet.play(ofFloat).with(duration);
        animatorSet.addListener(new a(z, dro));
        Animator animator2 = this.h;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.h = animatorSet;
        animatorSet.start();
    }

    /* renamed from: o.cHn$a */
    /* loaded from: classes4.dex */
    public static final class a extends AnimatorListenerAdapter {
        final /* synthetic */ boolean a;
        private boolean b;
        final /* synthetic */ drO<dpR> e;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C8632dsu.c((Object) animator, "");
            this.b = true;
        }

        a(boolean z, drO<dpR> dro) {
            this.a = z;
            this.e = dro;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            if (!this.b) {
                AbstractC5765cHn.this.e().setVisibility(this.a ? 0 : 8);
            }
            this.e.invoke();
        }
    }

    public void x() {
        a();
    }
}
