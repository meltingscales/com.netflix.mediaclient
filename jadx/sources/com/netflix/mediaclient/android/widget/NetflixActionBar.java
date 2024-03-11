package com.netflix.mediaclient.android.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.Base64;
import android.util.Property;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.Fragment;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.android.widgetry.widget.ScrollAwayClipByHeightBehaviour;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.discrete.Closed;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.ViewAccountMenuCommand;
import com.netflix.hawkins.consumer.tokens.Token;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.home.MoreTabActivity;
import com.netflix.mediaclient.util.ViewUtils;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import kotlin.jvm.internal.Ref;
import o.C1045Mp;
import o.C1204Sr;
import o.C1205Ss;
import o.C1332Xp;
import o.C1596aHd;
import o.C1645aIz;
import o.C8126deW;
import o.C8153dex;
import o.C8310dhv;
import o.C8563dqf;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9703vR;
import o.C9834xU;
import o.C9870yD;
import o.C9895yc;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5283bvo;
import o.InterfaceC8598drn;
import o.LD;
import o.RK;
import o.SE;
import o.SQ;
import o.SW;
import o.dpR;
import o.dqE;
import o.drM;
import org.chromium.net.PrivateKeyType;
import org.linphone.core.Privacy;

/* loaded from: classes.dex */
public class NetflixActionBar {
    private static int K = 1;
    private static int M;
    public static final c a;
    public static final int b;
    private static final TypedValue e;
    private static byte e$ss2$8037;
    private final SE A;
    private final PublishSubject<dpR> B;
    private NetflixImageView C;
    private final SQ D;
    private final ProgressBar E;
    private Boolean F;
    private final ActionBar G;
    private final C1205Ss H;
    private int I;
    private final SW N;
    private final NetflixActivity c;
    private final ViewGroup d;
    private final a f;
    private final View g;
    private final C1204Sr h;
    private b i;
    private int j;
    private int k;
    private int l;
    private Drawable m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private final View.OnLayoutChangeListener f13161o;
    private View p;
    private final boolean q;
    private boolean r;
    private final int s;
    private ViewGroup t;
    private Animator u;
    private boolean v;
    private final Drawable w;
    private final Drawable x;
    private Fragment y;
    private final ViewGroup z;

    /* loaded from: classes3.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[GradientDrawable.Orientation.values().length];
            try {
                iArr[GradientDrawable.Orientation.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GradientDrawable.Orientation.BOTTOM_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            d = iArr;
        }
    }

    private final int d(boolean z) {
        return z ? C9834xU.b.e : C9834xU.b.a;
    }

    static void t() {
        e$ss2$8037 = (byte) 24;
    }

    public final NetflixImageView b() {
        return this.C;
    }

    public final b c() {
        return this.i;
    }

    public final NetflixActivity d() {
        return this.c;
    }

    public final int e() {
        return this.n;
    }

    public final View f() {
        return this.p;
    }

    public final ViewGroup g() {
        return this.t;
    }

    public final Fragment h() {
        return this.y;
    }

    public final int j() {
        return this.l;
    }

    public final C1205Ss k() {
        return this.H;
    }

    protected final ActionBar o() {
        return this.G;
    }

    public final void q() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class LogoType {
        private static final /* synthetic */ InterfaceC8598drn c;
        private static final /* synthetic */ LogoType[] g;
        public static final LogoType a = new LogoType("START_ALIGNED", 0);
        public static final LogoType d = new LogoType("START_MONOCHROME", 1);
        public static final LogoType b = new LogoType("CENTERED", 2);
        public static final LogoType e = new LogoType("START_N_RIBBON", 3);

        private static final /* synthetic */ LogoType[] c() {
            return new LogoType[]{a, d, b, e};
        }

        public static LogoType valueOf(String str) {
            return (LogoType) Enum.valueOf(LogoType.class, str);
        }

        public static LogoType[] values() {
            return (LogoType[]) g.clone();
        }

        private LogoType(String str, int i) {
        }

        static {
            LogoType[] c2 = c();
            g = c2;
            c = C8600drp.e(c2);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("NetflixActionBar");
        }
    }

    static {
        t();
        a = new c(null);
        b = 8;
        e = new TypedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(NetflixActionBar netflixActionBar, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C8632dsu.c((Object) netflixActionBar, "");
        if (netflixActionBar.n != (view != null ? view.getHeight() : 0)) {
            netflixActionBar.n = view != null ? view.getHeight() : 0;
            netflixActionBar.B.onNext(dpR.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets a(NetflixActionBar netflixActionBar, View view, WindowInsets windowInsets) {
        C8632dsu.c((Object) netflixActionBar, "");
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) windowInsets, "");
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        netflixActionBar.I = systemWindowInsetTop;
        C9870yD.d(netflixActionBar.d, 1, systemWindowInsetTop);
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(NetflixActionBar netflixActionBar, View view) {
        C8632dsu.c((Object) netflixActionBar, "");
        CLv2Utils.INSTANCE.b(new Focus(AppView.moreTab, null), (Command) new ViewAccountMenuCommand(), true);
        netflixActionBar.c.startActivity(new Intent(netflixActionBar.c, MoreTabActivity.c()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x013b, code lost:
        if (r7.startsWith("'!#+") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0150, code lost:
        if (r7.startsWith("'!#+") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0152, code lost:
        r2 = r7.substring(4);
        r7 = new java.lang.Object[1];
        J(r2, r7);
        r7 = ((java.lang.String) r7[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0164, code lost:
        r0.setContentDescription(r7);
        r9.C = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0169, code lost:
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x016b, code lost:
        r0.setOnClickListener(new o.RL(r9));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NetflixActionBar(com.netflix.mediaclient.android.activity.NetflixActivity r10, o.SQ r11, boolean r12, java.lang.Integer r13) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.android.widget.NetflixActionBar.<init>(com.netflix.mediaclient.android.activity.NetflixActivity, o.SQ, boolean, java.lang.Integer):void");
    }

    public void s() {
        g(this.i);
    }

    public final b.C0051b p() {
        return new b.C0051b().c(this.x).b(this.w).c(this.H.b()).a(this.H.e()).e(this.H.c()).i(this.q);
    }

    public final Observable<dpR> r() {
        Observable<dpR> hide = this.B.hide();
        C8632dsu.a(hide, "");
        return hide;
    }

    public final boolean m() {
        ViewGroup viewGroup;
        return l() && (viewGroup = this.t) != null && viewGroup.getVisibility() == 0;
    }

    public final void n() {
        this.H.post(new Runnable() { // from class: o.RQ
            @Override // java.lang.Runnable
            public final void run() {
                NetflixActionBar.e(NetflixActionBar.this);
            }
        });
        d(this.i);
        if (this.r) {
            return;
        }
        this.r = true;
        this.A.b(this.i.s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(NetflixActionBar netflixActionBar) {
        C8632dsu.c((Object) netflixActionBar, "");
        if (netflixActionBar.i.c()) {
            netflixActionBar.f(netflixActionBar.i);
        }
    }

    private final void b(boolean z) {
        ScrollAwayClipByHeightBehaviour scrollAwayClipByHeightBehaviour = null;
        if (z) {
            ViewGroup viewGroup = this.t;
            scrollAwayClipByHeightBehaviour = new ScrollAwayClipByHeightBehaviour(48, viewGroup instanceof View ? viewGroup : null);
        }
        c(scrollAwayClipByHeightBehaviour);
    }

    private final void a(b bVar) {
        if (bVar.f() && bVar.a() != null) {
            throw new IllegalStateException("hide on scroll and behavior are mutually exclusive!".toString());
        }
        if (bVar.a() != null) {
            c(bVar.a());
        } else {
            b(bVar.f());
        }
    }

    private final void c(CoordinatorLayout.Behavior<View> behavior) {
        if (this.d.getLayoutParams() instanceof CoordinatorLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
            C8632dsu.d(layoutParams);
            ((CoordinatorLayout.LayoutParams) layoutParams).setBehavior(behavior);
            this.d.requestLayout();
        }
    }

    public final void e(boolean z, int i) {
        int i2 = i() * 4;
        int i3 = PrivateKeyType.INVALID;
        if (z && i <= i2) {
            i3 = (i * PrivateKeyType.INVALID) / i2;
        }
        a(i3);
    }

    public final void a(int i) {
        C8632dsu.c(this.N.getBackground(), this.x);
        if (!this.v) {
            i = Math.min(i, 205);
        }
        if (this.N.getBackground() != null && this.N.getBackground().getAlpha() != i) {
            this.N.getBackground().setAlpha(i);
        }
        NetflixImageView netflixImageView = this.C;
        if (netflixImageView != null && netflixImageView.getBackground() != null && netflixImageView.getBackground().getAlpha() != i) {
            netflixImageView.getBackground().setAlpha(i);
        }
        ViewGroup viewGroup = this.t;
        if (viewGroup != null && viewGroup.getBackground() != null && viewGroup.getBackground().getAlpha() != i) {
            viewGroup.getBackground().setAlpha(i);
        }
        SQ sq = this.D;
        if (sq != null) {
            float f = i / 255.0f;
            if (sq.getAlpha() == f) {
                return;
            }
            sq.setAlpha(f);
        }
    }

    public final int i() {
        return this.H.getHeight() > 0 ? this.H.getHeight() : ViewUtils.d(this.c);
    }

    private final void y() {
        for (View view : C9703vR.e(this.H)) {
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                if (imageView.getDrawable() != null && imageView.getDrawable() == this.H.getNavigationIcon()) {
                    this.p = view;
                    imageView.setId(R.g.dJ);
                    return;
                }
            }
        }
    }

    private final void v() {
        if (C8632dsu.c(this.H.getNavigationIcon(), this.w)) {
            d(R.a.c);
        }
    }

    private final void d(int i) {
        Drawable navigationIcon = this.H.getNavigationIcon();
        if (navigationIcon == null || !this.c.getTheme().resolveAttribute(i, e, true)) {
            return;
        }
        this.H.setNavigationIcon(BrowseExperience.e(navigationIcon, this.c, i));
    }

    private final void u() {
        View findViewById = this.c.findViewById(16908332);
        if (findViewById == null) {
            return;
        }
        ViewParent parent = findViewById.getParent();
        C8632dsu.d(parent);
        ViewGroup viewGroup = (ViewGroup) parent;
        viewGroup.setFocusable(false);
        if (viewGroup.getParent() instanceof View) {
            ViewParent parent2 = viewGroup.getParent();
            C8632dsu.d(parent2);
            ((View) parent2).setFocusable(false);
        }
    }

    private final int b(int i) {
        return ((i == 3 || i == 4) && C8310dhv.a()) ? i == 3 ? 1 : 0 : i;
    }

    @SuppressLint({"SwitchIntDef", "WrongConstant"})
    private final Animator d(int i, boolean z, int i2) {
        int i3;
        float f;
        ObjectAnimator ofFloat;
        float f2;
        float f3;
        int b2 = b(i);
        if (this.N.getWidth() > 0) {
            i3 = this.N.getWidth();
        } else {
            i3 = this.c.getResources().getDisplayMetrics().widthPixels;
        }
        Ref.FloatRef floatRef = new Ref.FloatRef();
        Ref.FloatRef floatRef2 = new Ref.FloatRef();
        if (b2 == 0) {
            if (this.N.getX() <= 0.0f || this.N.getX() >= i3) {
                f = z ? -i3 : 0.0f;
            } else {
                f = this.N.getX();
            }
            this.N.setY(0.0f);
            r6 = z ? 0.0f : -i3;
            floatRef.d = r6;
            ofFloat = ObjectAnimator.ofFloat(this.N, View.TRANSLATION_X, f, r6);
        } else if (b2 == 1) {
            if (this.N.getX() <= 0.0f || this.N.getX() >= i3) {
                f2 = z ? i3 : 0.0f;
            } else {
                f2 = this.N.getX();
            }
            this.N.setY(0.0f);
            r6 = z ? 0.0f : i3;
            floatRef.d = r6;
            ofFloat = ObjectAnimator.ofFloat(this.N, View.TRANSLATION_X, f2, r6);
        } else if (b2 == 2) {
            if (this.N.getY() > (-this.N.getHeight()) && this.N.getY() < 0.0f) {
                f3 = this.N.getY();
            } else {
                f3 = z ? -this.N.getHeight() : 0.0f;
            }
            this.N.setX(0.0f);
            r6 = z ? 0.0f : -this.N.getHeight();
            floatRef2.d = r6;
            ofFloat = ObjectAnimator.ofFloat(this.N, View.TRANSLATION_Y, f3, r6);
        } else if (b2 == 5) {
            float f4 = 1.0f;
            if (!z) {
                r6 = 1.0f;
                f4 = 0.0f;
            }
            ofFloat = ObjectAnimator.ofFloat(this.N, View.ALPHA, r6, f4);
        } else {
            SW sw = this.N;
            Property property = View.TRANSLATION_Y;
            float[] fArr = new float[1];
            fArr[0] = z ? 0.0f : -sw.getHeight();
            ofFloat = ObjectAnimator.ofFloat(sw, property, fArr);
        }
        ofFloat.setDuration(150L);
        ofFloat.setAutoCancel(true);
        ofFloat.addListener(new d(i2, floatRef, floatRef2));
        this.u = ofFloat;
        C8632dsu.d(ofFloat);
        return ofFloat;
    }

    /* loaded from: classes.dex */
    public static final class d extends AnimatorListenerAdapter {
        final /* synthetic */ Ref.FloatRef a;
        final /* synthetic */ int d;
        final /* synthetic */ Ref.FloatRef e;

        d(int i, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
            this.d = i;
            this.e = floatRef;
            this.a = floatRef2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C8632dsu.c((Object) animator, "");
            super.onAnimationStart(animator);
            NetflixActionBar.this.j = this.d == 0 ? 1 : 2;
            NetflixActionBar.this.N.setVisibility(0);
            NetflixActionBar.this.B.onNext(dpR.c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            NetflixActionBar.this.N.setVisibility(this.d);
            NetflixActionBar.this.N.setTranslationX(this.e.d);
            NetflixActionBar.this.N.setTranslationY(this.a.d);
            if (this.d == 8) {
                NetflixActionBar.this.o().hide();
            }
            NetflixActionBar.this.j = 0;
            NetflixActionBar.this.B.onNext(dpR.c);
        }
    }

    public final void a(boolean z) {
        c(z, 2);
    }

    @SuppressLint({"SwitchIntDef"})
    public final void c(boolean z, int i) {
        if (z && this.j != 2) {
            this.j = 2;
            d(i, false, 8).start();
            return;
        }
        x();
        this.N.setVisibility(8);
        this.B.onNext(dpR.c);
    }

    public final void c(boolean z) {
        d(z, 2);
    }

    public final void d(boolean z, int i) {
        if (z && this.j != 1) {
            this.j = 1;
            d(i, true, 0).start();
        } else {
            x();
            this.N.setTranslationX(0.0f);
            this.N.setTranslationY(0.0f);
            this.N.setVisibility(0);
            this.B.onNext(dpR.c);
        }
        this.G.show();
    }

    public final Animator e(int i) {
        return d(i, true, 0);
    }

    public final Animator c(int i) {
        return d(i, false, 8);
    }

    private final void x() {
        Animator animator = this.u;
        if (animator != null) {
            animator.cancel();
            this.u = null;
        }
    }

    private final boolean w() {
        if (this.i.G()) {
            a.getLogTag();
            CLv2Utils.d();
            this.c.performUpAction();
            return true;
        }
        return false;
    }

    static /* synthetic */ void a(NetflixActionBar netflixActionBar, b bVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateStatusBar");
        }
        if ((i & 1) != 0) {
            bVar = netflixActionBar.i;
        }
        netflixActionBar.k(bVar);
    }

    private final void k(b bVar) {
        if (bVar.o()) {
            b(bVar.b());
        } else {
            b((Drawable) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Drawable drawable) {
        SQ sq = this.D;
        if (sq != null) {
            int d2 = d(drawable, this.k);
            if (d2 != d(sq.getBackground(), this.k)) {
                a.getLogTag();
                Drawable background = sq.getBackground();
                ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
                if (colorDrawable != null) {
                    colorDrawable.mutate();
                }
                Drawable background2 = sq.getBackground();
                ColorDrawable colorDrawable2 = background2 instanceof ColorDrawable ? (ColorDrawable) background2 : null;
                if (colorDrawable2 != null) {
                    colorDrawable2.setColor(d2);
                }
            }
            a.getLogTag();
            f(!i(d2));
        }
    }

    private final void f(boolean z) {
        Boolean bool = this.F;
        if (bool != null) {
            z = bool.booleanValue();
        }
        if (z) {
            this.c.getWindow().getDecorView().setSystemUiVisibility(this.c.getWindow().getDecorView().getSystemUiVisibility() & (-8193));
        } else {
            this.c.getWindow().getDecorView().setSystemUiVisibility(this.c.getWindow().getDecorView().getSystemUiVisibility() | 8192);
        }
    }

    private final int d(Drawable drawable, int i) {
        C9895yc c9895yc;
        int[] b2;
        int l;
        if (drawable instanceof ColorDrawable) {
            return ((ColorDrawable) drawable).getColor();
        }
        if (!(drawable instanceof C9895yc) || (b2 = (c9895yc = (C9895yc) drawable).b()) == null) {
            return i;
        }
        if (!(b2.length == 0)) {
            GradientDrawable.Orientation orientation = c9895yc.getOrientation();
            int i2 = orientation == null ? -1 : e.d[orientation.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    return i;
                }
                l = C8563dqf.l(b2);
                return l;
            }
            return b2[0];
        }
        return i;
    }

    private final boolean i(int i) {
        int i2 = (i >> 16) & PrivateKeyType.INVALID;
        int i3 = (i >> 8) & PrivateKeyType.INVALID;
        int i4 = i & PrivateKeyType.INVALID;
        return ((double) ((i >> 24) & PrivateKeyType.INVALID)) > 127.5d && Math.sqrt(((((double) (i2 * i2)) * 0.299d) + (((double) (i3 * i3)) * 0.587d)) + (((double) (i4 * i4)) * 0.114d)) > 127.5d;
    }

    private final void i(b bVar) {
        int w = bVar.w();
        boolean I = bVar.I();
        if (w != 0) {
            if (w == 1) {
                h(bVar);
                return;
            }
            this.G.setDisplayShowTitleEnabled(I);
            this.h.setVisibility(8);
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
        this.h.setLayoutParams(new Toolbar.LayoutParams(layoutParams.width, layoutParams.height, 8388627));
        h(bVar);
        CharSequence u = bVar.u();
        if (u == null || !I || bVar.h()) {
            return;
        }
        int i = u.length() > 14 ? C9834xU.a.am : C9834xU.a.m;
        C1204Sr c1204Sr = this.h;
        C9870yD.d(c1204Sr, 0, c1204Sr.getResources().getDimensionPixelOffset(i));
    }

    private final void h(b bVar) {
        boolean I = bVar.I();
        View.OnClickListener A = bVar.A();
        Drawable z = bVar.z();
        String D = bVar.D();
        C1332Xp c1332Xp = C1332Xp.b;
        int applyDimension = (int) TypedValue.applyDimension(1, 8, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
        this.h.setVisibility(I ? 0 : 8);
        C1204Sr c1204Sr = this.h;
        c1204Sr.setOnClickListener(A);
        c1204Sr.setClickable(A != null);
        this.h.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, z, (Drawable) null);
        this.h.setCompoundDrawablePadding(applyDimension);
        this.h.setContentDescription(D);
        this.G.setDisplayShowTitleEnabled(false);
    }

    public final void c(boolean z, LogoType logoType) {
        Drawable drawable;
        C8632dsu.c((Object) logoType, "");
        int dimensionPixelOffset = (z && logoType == LogoType.a) ? this.H.getResources().getDimensionPixelOffset(C9834xU.a.f13911o) : 0;
        C1205Ss c1205Ss = this.H;
        c1205Ss.setContentInsetsRelative(dimensionPixelOffset, c1205Ss.getContentInsetEnd());
        if (z) {
            if (logoType == LogoType.b) {
                this.g.setVisibility(0);
                this.G.setDisplayUseLogoEnabled(false);
                return;
            }
            this.G.setDisplayUseLogoEnabled(true);
            this.g.setVisibility(8);
            if (logoType == LogoType.a) {
                this.H.setLogo(this.s);
                return;
            } else if (logoType == LogoType.e) {
                this.H.setLogo(R.e.aG);
                return;
            } else if (logoType != LogoType.d || (drawable = this.c.getResources().getDrawable(this.s)) == null) {
                return;
            } else {
                drawable.setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
                this.H.setLogo(drawable);
                return;
            }
        }
        this.g.setVisibility(8);
        this.G.setDisplayUseLogoEnabled(false);
        this.H.setLogo((Drawable) null);
    }

    private final void j(b bVar) {
        this.G.setDisplayHomeAsUpEnabled(bVar.G());
        if (bVar.G()) {
            if (bVar.H() != null) {
                this.H.setNavigationIcon(bVar.H());
            } else {
                this.H.setNavigationIcon(this.w);
            }
            if (!C8632dsu.c(this.i.H(), bVar.H()) || !C8632dsu.c(this.i.b(), bVar.b()) || this.i.c() != bVar.c() || this.i.G() != bVar.G()) {
                if (bVar.c()) {
                    d(bVar.b());
                } else {
                    d((Drawable) null);
                }
            }
        } else {
            this.H.setNavigationIcon((Drawable) null);
        }
        if (bVar.F() == null) {
            this.H.setNavigationContentDescription(R.o.D);
        } else {
            this.H.setNavigationContentDescription(bVar.F());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Drawable drawable) {
        if (drawable == null) {
            v();
        } else {
            d(d(i(d(drawable, this.l))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(b bVar) {
        if (bVar.c()) {
            a(bVar.b());
        } else {
            a((Drawable) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Drawable drawable) {
        if (drawable == null) {
            a((Integer) null);
            return;
        }
        int d2 = d(i(d(drawable, this.l)));
        if (this.c.getTheme().resolveAttribute(d2, e, true)) {
            a(Integer.valueOf(BrowseExperience.a(this.c, d2)));
        }
    }

    private final void a(Integer num) {
        PorterDuffColorFilter porterDuffColorFilter = num == null ? null : new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_ATOP);
        Drawable overflowIcon = this.H.getOverflowIcon();
        if (overflowIcon != null) {
            overflowIcon.setColorFilter(porterDuffColorFilter);
        }
        int childCount = this.H.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.H.getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                ActionMenuView actionMenuView = (ActionMenuView) childAt;
                int childCount2 = actionMenuView.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt2 = actionMenuView.getChildAt(i2);
                    if (childAt2 instanceof AppCompatTextView) {
                        AppCompatTextView appCompatTextView = (AppCompatTextView) childAt2;
                        int length = appCompatTextView.getCompoundDrawables().length;
                        for (int i3 = 0; i3 < length; i3++) {
                            if (appCompatTextView.getCompoundDrawables()[i3] != null) {
                                appCompatTextView.getCompoundDrawables()[i3].mutate().setColorFilter(porterDuffColorFilter);
                            }
                        }
                    }
                }
            }
        }
    }

    private final void g(b bVar) {
        final NetflixImageView netflixImageView = this.C;
        if (netflixImageView != null) {
            boolean z = !C8153dex.B() && bVar.p();
            netflixImageView.setVisibility(z ? 0 : 8);
            if (z) {
                C1645aIz.a(this.c, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.android.widget.NetflixActionBar$setupProfileAvatar$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                        a(serviceManager);
                        return dpR.c;
                    }

                    public final void a(ServiceManager serviceManager) {
                        String avatarUrl;
                        C8632dsu.c((Object) serviceManager, "");
                        InterfaceC5283bvo a2 = C8126deW.a(NetflixActionBar.this.d());
                        if (a2 == null || (avatarUrl = a2.getAvatarUrl()) == null) {
                            return;
                        }
                        netflixImageView.showImage(avatarUrl);
                    }
                });
            }
        }
    }

    private final void b(b bVar) {
        Map d2;
        Map k;
        Throwable th;
        if (bVar.G() && bVar.h() && bVar.g() == LogoType.e) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("Up Action and N Ribbon Logo are mutually exclusive", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b2);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    public void c(b bVar) {
        View j;
        View decorView;
        C8632dsu.c((Object) bVar, "");
        b(bVar);
        this.y = bVar.m();
        this.N.setMaxWidth(bVar.n());
        this.v = bVar.l();
        this.f.a(bVar);
        ProgressBar progressBar = this.E;
        if (progressBar != null) {
            progressBar.setVisibility(bVar.C() ? 0 : 8);
        }
        i(bVar);
        if (this.h.getVisibility() == 0) {
            this.h.setText(C8310dhv.d(bVar.u()));
            if (bVar.v() != 0) {
                TextViewCompat.setTextAppearance(this.h, bVar.v());
            } else {
                LD.e(this.h, Token.Typography.aq.e, null, 2, null);
            }
            this.h.setTextColor(bVar.B());
        }
        this.G.setTitle(C8310dhv.d(bVar.u()));
        if (!C8632dsu.c(this.c.getTitle(), bVar.u())) {
            this.c.setTitle(bVar.u());
            Window window = this.c.getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                decorView.sendAccessibilityEvent(32);
            }
        }
        this.H.setTitleTextAppearance(this.c, bVar.v());
        this.H.setTitleTextColor(bVar.B());
        this.H.setSubtitle(C8310dhv.d(bVar.y()));
        this.H.setSubtitleTextColor(bVar.x());
        j(bVar);
        if (this.r) {
            this.A.b(bVar.s());
        }
        ViewGroup viewGroup = this.t;
        if (viewGroup != null && (j = bVar.j()) != null) {
            if (!C9703vR.c(viewGroup, j)) {
                viewGroup.removeAllViews();
                ActionBar.LayoutParams i = bVar.i();
                if (i != null && ((ViewGroup.MarginLayoutParams) i).height == -1) {
                    ((ViewGroup.MarginLayoutParams) i).height = viewGroup.getResources().getDimensionPixelSize(R.b.s);
                }
                viewGroup.addView(j, i);
            }
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                viewGroup.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        c(bVar.h(), bVar.g());
        g(bVar);
        if (!C8632dsu.c(this.N.getBackground(), bVar.b()) || bVar.o() != this.i.o()) {
            SQ sq = this.D;
            if (sq != null) {
                sq.setAlpha(1.0f);
            }
            this.N.setBackground(bVar.b() == null ? this.m : bVar.b());
        }
        if (this.i.c() != bVar.c()) {
            f(bVar);
        }
        if (bVar.o() != this.i.o() || !C8632dsu.c(bVar.b(), this.i.b())) {
            k(bVar);
        }
        a(bVar);
        e(bVar);
        this.i = bVar;
    }

    private final void d(final b bVar) {
        MenuItem findItem = this.H.getMenu().findItem(R.g.a);
        if (findItem != null) {
            RK.e(findItem, bVar.k());
        }
        MenuItem findItem2 = this.H.getMenu().findItem(R.g.b);
        if (findItem2 != null) {
            RK.e(findItem2, bVar.r());
        }
        MenuItem findItem3 = this.H.getMenu().findItem(R.g.c);
        if (findItem3 == null && bVar.q()) {
            findItem3 = this.H.getMenu().add(0, R.g.c, 5, R.o.au).setIcon(R.e.aB).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: o.RP
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    boolean d2;
                    d2 = NetflixActionBar.d(NetflixActionBar.this, bVar, menuItem);
                    return d2;
                }
            });
            findItem3.setShowAsAction(2);
        }
        if (findItem3 != null) {
            RK.e(findItem3, bVar.q());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(NetflixActionBar netflixActionBar, b bVar, MenuItem menuItem) {
        C8632dsu.c((Object) netflixActionBar, "");
        C8632dsu.c((Object) bVar, "");
        C8632dsu.c((Object) menuItem, "");
        Logger.INSTANCE.logEvent(new Closed(netflixActionBar.c.getUiScreen(), null, CommandValue.CloseCommand, null));
        if (bVar.e() == 1) {
            netflixActionBar.c.finish();
        } else {
            netflixActionBar.c.getFragmentHelper().m();
        }
        return true;
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private final View.OnClickListener A;
        private final int B;
        private final int C;
        private final int D;
        private final boolean E;
        private final String F;
        private final Drawable G;
        private final boolean H;
        private final boolean I;

        /* renamed from: J  reason: collision with root package name */
        private final Drawable f13162J;
        private final String L;
        private final Drawable a;
        private final CoordinatorLayout.Behavior<View> b;
        private final int c;
        private final Drawable d;
        private final boolean e;
        private final View f;
        private final LogoType g;
        private final boolean h;
        private final boolean i;
        private final ActionBar.LayoutParams j;
        private final boolean k;
        private final boolean l;
        private final int m;
        private final boolean n;

        /* renamed from: o  reason: collision with root package name */
        private final Fragment f13163o;
        private final boolean p;
        private final boolean q;
        private final boolean r;
        private final boolean s;
        private final boolean t;
        private final int u;
        private final int v;
        private final boolean w;
        private final int x;
        private final CharSequence y;
        private final CharSequence z;

        public b() {
            this(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -1, 31, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b e(b bVar, CharSequence charSequence, View.OnClickListener onClickListener, Drawable drawable, String str, Drawable drawable2, String str2, View view, ActionBar.LayoutParams layoutParams, Drawable drawable3, CharSequence charSequence2, int i, CoordinatorLayout.Behavior behavior, Drawable drawable4, Fragment fragment, boolean z, int i2, boolean z2, boolean z3, boolean z4, LogoType logoType, boolean z5, int i3, int i4, int i5, int i6, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i7, int i8, boolean z13, boolean z14, boolean z15, int i9, int i10, Object obj) {
            return bVar.d((i9 & 1) != 0 ? bVar.z : charSequence, (i9 & 2) != 0 ? bVar.A : onClickListener, (i9 & 4) != 0 ? bVar.G : drawable, (i9 & 8) != 0 ? bVar.F : str, (i9 & 16) != 0 ? bVar.f13162J : drawable2, (i9 & 32) != 0 ? bVar.L : str2, (i9 & 64) != 0 ? bVar.f : view, (i9 & 128) != 0 ? bVar.j : layoutParams, (i9 & JSONzip.end) != 0 ? bVar.a : drawable3, (i9 & 512) != 0 ? bVar.y : charSequence2, (i9 & 1024) != 0 ? bVar.x : i, (i9 & 2048) != 0 ? bVar.b : behavior, (i9 & 4096) != 0 ? bVar.d : drawable4, (i9 & 8192) != 0 ? bVar.f13163o : fragment, (i9 & 16384) != 0 ? bVar.I : z, (i9 & Privacy.DEFAULT) != 0 ? bVar.B : i2, (i9 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? bVar.H : z2, (i9 & 131072) != 0 ? bVar.E : z3, (i9 & 262144) != 0 ? bVar.h : z4, (i9 & 524288) != 0 ? bVar.g : logoType, (i9 & 1048576) != 0 ? bVar.i : z5, (i9 & 2097152) != 0 ? bVar.C : i3, (i9 & 4194304) != 0 ? bVar.D : i4, (i9 & 8388608) != 0 ? bVar.u : i5, (i9 & 16777216) != 0 ? bVar.v : i6, (i9 & 33554432) != 0 ? bVar.n : z6, (i9 & 67108864) != 0 ? bVar.e : z7, (i9 & 134217728) != 0 ? bVar.t : z8, (i9 & 268435456) != 0 ? bVar.s : z9, (i9 & 536870912) != 0 ? bVar.p : z10, (i9 & 1073741824) != 0 ? bVar.k : z11, (i9 & Integer.MIN_VALUE) != 0 ? bVar.r : z12, (i10 & 1) != 0 ? bVar.c : i7, (i10 & 2) != 0 ? bVar.m : i8, (i10 & 4) != 0 ? bVar.l : z13, (i10 & 8) != 0 ? bVar.q : z14, (i10 & 16) != 0 ? bVar.w : z15);
        }

        public final View.OnClickListener A() {
            return this.A;
        }

        public final int B() {
            return this.D;
        }

        public final boolean C() {
            return this.H;
        }

        public final String D() {
            return this.F;
        }

        public final String F() {
            return this.L;
        }

        public final boolean G() {
            return this.E;
        }

        public final Drawable H() {
            return this.f13162J;
        }

        public final boolean I() {
            return this.I;
        }

        public final CoordinatorLayout.Behavior<View> a() {
            return this.b;
        }

        public final Drawable b() {
            return this.a;
        }

        public final boolean c() {
            return this.e;
        }

        public final Drawable d() {
            return this.d;
        }

        public final b d(CharSequence charSequence, View.OnClickListener onClickListener, Drawable drawable, String str, Drawable drawable2, String str2, View view, ActionBar.LayoutParams layoutParams, Drawable drawable3, CharSequence charSequence2, int i, CoordinatorLayout.Behavior<View> behavior, Drawable drawable4, Fragment fragment, boolean z, int i2, boolean z2, boolean z3, boolean z4, LogoType logoType, boolean z5, int i3, int i4, int i5, int i6, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i7, int i8, boolean z13, boolean z14, boolean z15) {
            C8632dsu.c((Object) logoType, "");
            return new b(charSequence, onClickListener, drawable, str, drawable2, str2, view, layoutParams, drawable3, charSequence2, i, behavior, drawable4, fragment, z, i2, z2, z3, z4, logoType, z5, i3, i4, i5, i6, z6, z7, z8, z9, z10, z11, z12, i7, i8, z13, z14, z15);
        }

        public final int e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c(this.z, bVar.z) && C8632dsu.c(this.A, bVar.A) && C8632dsu.c(this.G, bVar.G) && C8632dsu.c((Object) this.F, (Object) bVar.F) && C8632dsu.c(this.f13162J, bVar.f13162J) && C8632dsu.c((Object) this.L, (Object) bVar.L) && C8632dsu.c(this.f, bVar.f) && C8632dsu.c(this.j, bVar.j) && C8632dsu.c(this.a, bVar.a) && C8632dsu.c(this.y, bVar.y) && this.x == bVar.x && C8632dsu.c(this.b, bVar.b) && C8632dsu.c(this.d, bVar.d) && C8632dsu.c(this.f13163o, bVar.f13163o) && this.I == bVar.I && this.B == bVar.B && this.H == bVar.H && this.E == bVar.E && this.h == bVar.h && this.g == bVar.g && this.i == bVar.i && this.C == bVar.C && this.D == bVar.D && this.u == bVar.u && this.v == bVar.v && this.n == bVar.n && this.e == bVar.e && this.t == bVar.t && this.s == bVar.s && this.p == bVar.p && this.k == bVar.k && this.r == bVar.r && this.c == bVar.c && this.m == bVar.m && this.l == bVar.l && this.q == bVar.q && this.w == bVar.w;
            }
            return false;
        }

        public final boolean f() {
            return this.i;
        }

        public final LogoType g() {
            return this.g;
        }

        public final boolean h() {
            return this.h;
        }

        public int hashCode() {
            CharSequence charSequence = this.z;
            int hashCode = charSequence == null ? 0 : charSequence.hashCode();
            View.OnClickListener onClickListener = this.A;
            int hashCode2 = onClickListener == null ? 0 : onClickListener.hashCode();
            Drawable drawable = this.G;
            int hashCode3 = drawable == null ? 0 : drawable.hashCode();
            String str = this.F;
            int hashCode4 = str == null ? 0 : str.hashCode();
            Drawable drawable2 = this.f13162J;
            int hashCode5 = drawable2 == null ? 0 : drawable2.hashCode();
            String str2 = this.L;
            int hashCode6 = str2 == null ? 0 : str2.hashCode();
            View view = this.f;
            int hashCode7 = view == null ? 0 : view.hashCode();
            ActionBar.LayoutParams layoutParams = this.j;
            int hashCode8 = layoutParams == null ? 0 : layoutParams.hashCode();
            Drawable drawable3 = this.a;
            int hashCode9 = drawable3 == null ? 0 : drawable3.hashCode();
            CharSequence charSequence2 = this.y;
            int hashCode10 = charSequence2 == null ? 0 : charSequence2.hashCode();
            int hashCode11 = Integer.hashCode(this.x);
            CoordinatorLayout.Behavior<View> behavior = this.b;
            int hashCode12 = behavior == null ? 0 : behavior.hashCode();
            Drawable drawable4 = this.d;
            int hashCode13 = drawable4 == null ? 0 : drawable4.hashCode();
            Fragment fragment = this.f13163o;
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + (fragment != null ? fragment.hashCode() : 0)) * 31) + Boolean.hashCode(this.I)) * 31) + Integer.hashCode(this.B)) * 31) + Boolean.hashCode(this.H)) * 31) + Boolean.hashCode(this.E)) * 31) + Boolean.hashCode(this.h)) * 31) + this.g.hashCode()) * 31) + Boolean.hashCode(this.i)) * 31) + Integer.hashCode(this.C)) * 31) + Integer.hashCode(this.D)) * 31) + Integer.hashCode(this.u)) * 31) + Integer.hashCode(this.v)) * 31) + Boolean.hashCode(this.n)) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.t)) * 31) + Boolean.hashCode(this.s)) * 31) + Boolean.hashCode(this.p)) * 31) + Boolean.hashCode(this.k)) * 31) + Boolean.hashCode(this.r)) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.m)) * 31) + Boolean.hashCode(this.l)) * 31) + Boolean.hashCode(this.q)) * 31) + Boolean.hashCode(this.w);
        }

        public final ActionBar.LayoutParams i() {
            return this.j;
        }

        public final View j() {
            return this.f;
        }

        public final boolean k() {
            return this.k;
        }

        public final boolean l() {
            return this.l;
        }

        public final Fragment m() {
            return this.f13163o;
        }

        public final int n() {
            return this.m;
        }

        public final boolean o() {
            return this.n;
        }

        public final boolean p() {
            return this.t;
        }

        public final boolean q() {
            return this.r;
        }

        public final boolean r() {
            return this.p;
        }

        public final boolean s() {
            return this.q;
        }

        public final boolean t() {
            return this.s;
        }

        public String toString() {
            CharSequence charSequence = this.z;
            View.OnClickListener onClickListener = this.A;
            Drawable drawable = this.G;
            String str = this.F;
            Drawable drawable2 = this.f13162J;
            String str2 = this.L;
            View view = this.f;
            ActionBar.LayoutParams layoutParams = this.j;
            Drawable drawable3 = this.a;
            CharSequence charSequence2 = this.y;
            int i = this.x;
            CoordinatorLayout.Behavior<View> behavior = this.b;
            Drawable drawable4 = this.d;
            Fragment fragment = this.f13163o;
            boolean z = this.I;
            int i2 = this.B;
            boolean z2 = this.H;
            boolean z3 = this.E;
            boolean z4 = this.h;
            LogoType logoType = this.g;
            boolean z5 = this.i;
            int i3 = this.C;
            int i4 = this.D;
            int i5 = this.u;
            int i6 = this.v;
            boolean z6 = this.n;
            boolean z7 = this.e;
            boolean z8 = this.t;
            boolean z9 = this.s;
            boolean z10 = this.p;
            boolean z11 = this.k;
            boolean z12 = this.r;
            int i7 = this.c;
            int i8 = this.m;
            boolean z13 = this.l;
            boolean z14 = this.q;
            boolean z15 = this.w;
            return "State(title=" + ((Object) charSequence) + ", titleClickListener=" + onClickListener + ", titleEndDrawable=" + drawable + ", titleContentDescription=" + str + ", upDrawable=" + drawable2 + ", upContentDescription=" + str2 + ", customView=" + view + ", customLayoutParams=" + layoutParams + ", background=" + drawable3 + ", subtitle=" + ((Object) charSequence2) + ", subtitleColor=" + i + ", behavior=" + behavior + ", backgroundToolbarOnly=" + drawable4 + ", ownerFragment=" + fragment + ", titleVisible=" + z + ", titleAlignment=" + i2 + ", titleProgressVisible=" + z2 + ", upActionVisible=" + z3 + ", logoVisible=" + z4 + ", logoType=" + logoType + ", hideOnScroll=" + z5 + ", titleAppearance=" + i3 + ", titleColor=" + i4 + ", subtitleAppearance=" + i5 + ", subtitleColo=" + i6 + ", makeStatusBarMatch=" + z6 + ", autoTintIcons=" + z7 + ", showProfileAvatar=" + z8 + ", showStickyHeader=" + z9 + ", showSearchIcon=" + z10 + ", showCastIcon=" + z11 + ", showCloseIcon=" + z12 + ", closeIconBehavior=" + i7 + ", maxWidth=" + i8 + ", opaqueBackgroundAllowed=" + z13 + ", showSearchBox=" + z14 + ", stickyHeaderWrapsHeight=" + z15 + ")";
        }

        public final CharSequence u() {
            return this.z;
        }

        public final int v() {
            return this.C;
        }

        public final int w() {
            return this.B;
        }

        public final int x() {
            return this.x;
        }

        public final CharSequence y() {
            return this.y;
        }

        public final Drawable z() {
            return this.G;
        }

        public b(CharSequence charSequence, View.OnClickListener onClickListener, Drawable drawable, String str, Drawable drawable2, String str2, View view, ActionBar.LayoutParams layoutParams, Drawable drawable3, CharSequence charSequence2, int i, CoordinatorLayout.Behavior<View> behavior, Drawable drawable4, Fragment fragment, boolean z, int i2, boolean z2, boolean z3, boolean z4, LogoType logoType, boolean z5, int i3, int i4, int i5, int i6, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i7, int i8, boolean z13, boolean z14, boolean z15) {
            C8632dsu.c((Object) logoType, "");
            this.z = charSequence;
            this.A = onClickListener;
            this.G = drawable;
            this.F = str;
            this.f13162J = drawable2;
            this.L = str2;
            this.f = view;
            this.j = layoutParams;
            this.a = drawable3;
            this.y = charSequence2;
            this.x = i;
            this.b = behavior;
            this.d = drawable4;
            this.f13163o = fragment;
            this.I = z;
            this.B = i2;
            this.H = z2;
            this.E = z3;
            this.h = z4;
            this.g = logoType;
            this.i = z5;
            this.C = i3;
            this.D = i4;
            this.u = i5;
            this.v = i6;
            this.n = z6;
            this.e = z7;
            this.t = z8;
            this.s = z9;
            this.p = z10;
            this.k = z11;
            this.r = z12;
            this.c = i7;
            this.m = i8;
            this.l = z13;
            this.q = z14;
            this.w = z15;
        }

        public /* synthetic */ b(CharSequence charSequence, View.OnClickListener onClickListener, Drawable drawable, String str, Drawable drawable2, String str2, View view, ActionBar.LayoutParams layoutParams, Drawable drawable3, CharSequence charSequence2, int i, CoordinatorLayout.Behavior behavior, Drawable drawable4, Fragment fragment, boolean z, int i2, boolean z2, boolean z3, boolean z4, LogoType logoType, boolean z5, int i3, int i4, int i5, int i6, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i7, int i8, boolean z13, boolean z14, boolean z15, int i9, int i10, C8627dsp c8627dsp) {
            this((i9 & 1) != 0 ? null : charSequence, (i9 & 2) != 0 ? null : onClickListener, (i9 & 4) != 0 ? null : drawable, (i9 & 8) != 0 ? null : str, (i9 & 16) != 0 ? null : drawable2, (i9 & 32) != 0 ? null : str2, (i9 & 64) != 0 ? null : view, (i9 & 128) != 0 ? null : layoutParams, (i9 & JSONzip.end) != 0 ? null : drawable3, (i9 & 512) != 0 ? null : charSequence2, (i9 & 1024) != 0 ? 0 : i, (i9 & 2048) != 0 ? null : behavior, (i9 & 4096) != 0 ? null : drawable4, (i9 & 8192) != 0 ? null : fragment, (i9 & 16384) != 0 ? true : z, (i9 & Privacy.DEFAULT) != 0 ? 0 : i2, (i9 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? false : z2, (i9 & 131072) != 0 ? true : z3, (i9 & 262144) != 0 ? false : z4, (i9 & 524288) != 0 ? LogoType.a : logoType, (i9 & 1048576) != 0 ? false : z5, (i9 & 2097152) != 0 ? 0 : i3, (i9 & 4194304) != 0 ? 0 : i4, (i9 & 8388608) != 0 ? 0 : i5, (i9 & 16777216) != 0 ? 0 : i6, (i9 & 33554432) != 0 ? false : z6, (i9 & 67108864) != 0 ? false : z7, (i9 & 134217728) != 0 ? true : z8, (i9 & 268435456) != 0 ? false : z9, (i9 & 536870912) == 0 ? z10 : true, (i9 & 1073741824) != 0 ? false : z11, (i9 & Integer.MIN_VALUE) != 0 ? false : z12, (i10 & 1) != 0 ? 0 : i7, (i10 & 2) != 0 ? Integer.MAX_VALUE : i8, (i10 & 4) != 0 ? false : z13, (i10 & 8) != 0 ? false : z14, (i10 & 16) != 0 ? false : z15);
        }

        /* renamed from: com.netflix.mediaclient.android.widget.NetflixActionBar$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0051b {
            private b a = new b(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -1, 31, null);

            public final b c() {
                return this.a;
            }

            public final C0051b e(CharSequence charSequence) {
                this.a = b.e(this.a, charSequence, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -2, 31, null);
                return this;
            }

            public final C0051b l(boolean z) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, z, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -16385, 31, null);
                return this;
            }

            public final C0051b d(int i) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, i, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -32769, 31, null);
                return this;
            }

            public final C0051b c(int i) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, 0, false, false, false, null, false, 0, i, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -4194305, 31, null);
                return this;
            }

            public final C0051b e(View.OnClickListener onClickListener) {
                this.a = b.e(this.a, null, onClickListener, null, null, null, null, null, null, null, null, 0, null, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -3, 31, null);
                return this;
            }

            public final C0051b e(Drawable drawable) {
                this.a = b.e(this.a, null, null, drawable, null, null, null, null, null, null, null, 0, null, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -5, 31, null);
                return this;
            }

            public final C0051b e(String str) {
                this.a = b.e(this.a, null, null, null, str, null, null, null, null, null, null, 0, null, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -9, 31, null);
                return this;
            }

            public final C0051b n(boolean z) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, 0, z, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -65537, 31, null);
                return this;
            }

            public final C0051b k(boolean z) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, 0, false, z, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -131073, 31, null);
                return this;
            }

            public final C0051b b(Drawable drawable) {
                this.a = b.e(this.a, null, null, null, null, drawable, null, null, null, null, null, 0, null, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -17, 31, null);
                return this;
            }

            public final C0051b b(String str) {
                this.a = b.e(this.a, null, null, null, null, null, str, null, null, null, null, 0, null, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -33, 31, null);
                return this;
            }

            public final C0051b b(LogoType logoType) {
                C8632dsu.c((Object) logoType, "");
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, 0, false, false, false, logoType, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -524289, 31, null);
                return this;
            }

            public final C0051b b(boolean z) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, 0, false, false, z, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -262145, 31, null);
                return this;
            }

            public final C0051b c(View view) {
                this.a = b.e(this.a, null, null, null, null, null, null, view, null, null, null, 0, null, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -65, 31, null);
                return this;
            }

            public final C0051b a(ActionBar.LayoutParams layoutParams) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, layoutParams, null, null, 0, null, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -129, 31, null);
                return this;
            }

            public final C0051b c(Drawable drawable) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, drawable, null, 0, null, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -257, 31, null);
                return this;
            }

            public final C0051b a(boolean z) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, 0, false, false, false, null, z, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -1048577, 31, null);
                return this;
            }

            public final C0051b b(CharSequence charSequence) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, charSequence, 0, null, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -513, 31, null);
                return this;
            }

            public final C0051b e(int i) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, null, i, null, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -1025, 31, null);
                return this;
            }

            public final C0051b a(int i) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, 0, false, false, false, null, false, 0, 0, i, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -8388609, 31, null);
                return this;
            }

            public final C0051b c(CoordinatorLayout.Behavior<View> behavior) {
                C8632dsu.c((Object) behavior, "");
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, null, 0, behavior, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -2049, 31, null);
                return this;
            }

            public final C0051b e(boolean z) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, z, false, false, false, false, false, false, 0, 0, false, false, false, -33554433, 31, null);
                return this;
            }

            public final C0051b d(boolean z) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, z, false, false, false, false, false, 0, 0, false, false, false, -67108865, 31, null);
                return this;
            }

            public final C0051b i(boolean z) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, z, false, false, false, false, 0, 0, false, false, false, -134217729, 31, null);
                return this;
            }

            public final C0051b a(Drawable drawable) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, null, 0, null, drawable, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -4097, 31, null);
                return this;
            }

            public final C0051b g(boolean z) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, z, false, false, false, 0, 0, false, false, false, -268435457, 31, null);
                return this;
            }

            public final C0051b f(boolean z) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, z, false, false, 0, 0, false, false, false, -536870913, 31, null);
                return this;
            }

            public final C0051b h(boolean z) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, z, false, 0, 0, false, false, false, -1073741825, 31, null);
                return this;
            }

            public final C0051b b(int i) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, i, false, false, false, -1, 29, null);
                return this;
            }

            public final C0051b c(boolean z) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, z, false, false, -1, 27, null);
                return this;
            }

            public final C0051b j(boolean z) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, z, false, -1, 23, null);
                return this;
            }

            public final C0051b d(Fragment fragment) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, null, 0, null, null, fragment, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, false, -8193, 31, null);
                return this;
            }

            public final C0051b o(boolean z) {
                this.a = b.e(this.a, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, 0, false, false, false, null, false, 0, 0, 0, 0, false, false, false, false, false, false, false, 0, 0, false, false, z, -1, 15, null);
                return this;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class a implements SW.c {
        private b b;
        private final NetflixActionBar d;

        public final void a(b bVar) {
            C8632dsu.c((Object) bVar, "");
            this.b = bVar;
        }

        public a(NetflixActionBar netflixActionBar, b bVar) {
            C8632dsu.c((Object) netflixActionBar, "");
            C8632dsu.c((Object) bVar, "");
            this.d = netflixActionBar;
            this.b = bVar;
        }

        @Override // o.SW.c
        public void d(Drawable drawable) {
            C8632dsu.c((Object) drawable, "");
            if (drawable.isVisible()) {
                if (this.b.c()) {
                    this.d.d(drawable);
                    this.d.a(drawable);
                }
                if (this.b.o()) {
                    this.d.b(drawable);
                }
            }
        }
    }

    public final boolean l() {
        int i = this.j;
        if (i != 1) {
            return i != 2 && this.N.getVisibility() == 0;
        }
        return true;
    }

    public final void e(boolean z) {
        a.getLogTag();
        this.F = Boolean.valueOf(z);
        a(this, null, 1, null);
    }

    public final void a() {
        a.getLogTag();
        this.F = null;
        a(this, null, 1, null);
    }

    public final boolean a(MenuItem menuItem) {
        C8632dsu.c((Object) menuItem, "");
        a.getLogTag();
        if (menuItem.getItemId() == 16908332) {
            return w();
        }
        return false;
    }

    private final void e(b bVar) {
        ViewGroup viewGroup = this.t;
        if (viewGroup != null) {
            if ((viewGroup.getVisibility() == 0) != bVar.t()) {
                viewGroup.setVisibility(bVar.t() ? 0 : 8);
                this.B.onNext(dpR.c);
            }
        }
        this.H.setBackground(bVar.d());
        d(bVar);
    }

    private static void J(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$8037);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
