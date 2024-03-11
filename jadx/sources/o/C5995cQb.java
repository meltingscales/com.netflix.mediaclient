package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.OneShotPreDrawListener;
import com.netflix.mediaclient.android.lottie.drawables.RaterDoubleThumbLottieDrawable;
import com.netflix.mediaclient.android.lottie.drawables.RaterThumbDownLottieDrawable;
import com.netflix.mediaclient.android.lottie.drawables.RaterThumbUpLottieDrawable;
import com.netflix.mediaclient.util.AccessibilityUtils;
import com.netflix.model.leafs.ArtworkColors;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import o.C9834xU;
import o.cPS;
import o.cPX;
import o.dpR;

/* renamed from: o.cQb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5995cQb extends FrameLayout {
    private static int E = 1;
    private static int I;
    public static final e c;
    private static byte e$ss2$3631;
    private final RaterDoubleThumbLottieDrawable A;
    private final ViewGroup B;
    private final ViewGroup C;
    private final String D;
    private final String a;
    private final List<View> b;
    private cPT d;
    private final View e;
    private final Runnable f;
    private final ColorDrawable g;
    private final ViewGroup h;
    private View i;
    private final boolean j;
    private boolean k;
    private List<Animator> l;
    private final int m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private final PathInterpolator f13693o;
    private final PathInterpolator p;
    private final ViewGroup q;
    private final cPP r;
    private final drO<dpR> s;
    private List<Animator> t;
    private final ViewGroup u;
    private final RaterThumbUpLottieDrawable v;
    private final RaterThumbDownLottieDrawable w;
    private final String x;
    private final String y;
    private final Drawable z;

    static {
        j();
        c = new e(null);
    }

    static void j() {
        e$ss2$3631 = (byte) 24;
    }

    public final ViewGroup a() {
        return this.h;
    }

    public final View b() {
        return this.i;
    }

    public final PathInterpolator c() {
        return this.p;
    }

    public final List<Animator> e() {
        return this.l;
    }

    public final void setCachedRatingAdapter(cPT cpt) {
        this.d = cpt;
    }

    public final void setCachedRatingButton(View view) {
        this.i = view;
    }

    public final void setInAnimators(List<Animator> list) {
        C8632dsu.c((Object) list, "");
        this.l = list;
    }

    public final void setOutAnimators(List<Animator> list) {
        C8632dsu.c((Object) list, "");
        this.t = list;
    }

    public final void setShowing(boolean z) {
        this.k = z;
    }

    public /* synthetic */ C5995cQb(Context context, cPP cpp, int i2, boolean z, drO dro, int i3, C8627dsp c8627dsp) {
        this(context, cpp, (i3 & 4) != 0 ? cPX.e.i : i2, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? new drO<dpR>() { // from class: com.netflix.mediaclient.ui.rating.impl.widget.UserRatingOverlayV2$1
            public final void e() {
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                e();
                return dpR.c;
            }
        } : dro);
    }

    /* renamed from: o.cQb$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("UserRatingOverlayV2");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5995cQb(Context context, cPP cpp, int i2, boolean z, drO<dpR> dro) {
        super(context);
        List<String> j;
        List<View> j2;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) cpp, "");
        C8632dsu.c((Object) dro, "");
        this.r = cpp;
        this.m = i2;
        this.j = z;
        this.s = dro;
        ColorDrawable colorDrawable = new ColorDrawable(ArtworkColors.DEFAULT_BACKGROUND_COLOR);
        this.g = colorDrawable;
        RaterThumbUpLottieDrawable raterThumbUpLottieDrawable = new RaterThumbUpLottieDrawable();
        this.v = raterThumbUpLottieDrawable;
        RaterThumbDownLottieDrawable raterThumbDownLottieDrawable = new RaterThumbDownLottieDrawable();
        this.w = raterThumbDownLottieDrawable;
        RaterDoubleThumbLottieDrawable raterDoubleThumbLottieDrawable = new RaterDoubleThumbLottieDrawable();
        this.A = raterDoubleThumbLottieDrawable;
        Drawable drawable = AppCompatResources.getDrawable(context, C9834xU.j.A);
        C8632dsu.d(drawable);
        Drawable mutate = drawable.mutate();
        C8632dsu.a(mutate, "");
        this.z = mutate;
        String string = context.getString(cPX.g.a);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            F(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i3 = 2 % 2;
        }
        C8632dsu.a(string, "");
        this.y = string;
        String string2 = context.getString(cPX.g.c);
        if (string2.startsWith("'!#+")) {
            Object[] objArr2 = new Object[1];
            F(string2.substring(4), objArr2);
            string2 = ((String) objArr2[0]).intern();
            int i4 = I + 3;
            E = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 3;
            } else {
                int i6 = 2 % 2;
            }
        }
        C8632dsu.a(string2, "");
        this.x = string2;
        String string3 = context.getString(cPX.g.e);
        if (string3.startsWith("'!#+")) {
            Object[] objArr3 = new Object[1];
            F(string3.substring(4), objArr3);
            string3 = ((String) objArr3[0]).intern();
            int i7 = E + 55;
            I = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        }
        C8632dsu.a(string3, "");
        this.D = string3;
        String string4 = context.getString(cPS.c.e);
        if (string4.startsWith("'!#+")) {
            int i10 = I + 99;
            E = i10 % 128;
            if (i10 % 2 == 0) {
                Object[] objArr4 = new Object[1];
                F(string4.substring(4), objArr4);
                string4 = ((String) objArr4[0]).intern();
                int i11 = 67 / 0;
            } else {
                Object[] objArr5 = new Object[1];
                F(string4.substring(4), objArr5);
                string4 = ((String) objArr5[0]).intern();
            }
            int i12 = 2 % 2;
        }
        C8632dsu.a(string4, "");
        this.a = string4;
        this.f = new Runnable() { // from class: o.cQg
            @Override // java.lang.Runnable
            public final void run() {
                C5995cQb.g(C5995cQb.this);
            }
        };
        this.l = new ArrayList();
        this.t = new ArrayList();
        this.p = new PathInterpolator(0.5f, 0.0f, 0.1f, 1.0f);
        this.f13693o = new PathInterpolator(0.2f, 0.0f, 0.1f, 1.0f);
        setBackground(colorDrawable);
        View e2 = C9703vR.e(this, i2, 0, 2, null);
        C8632dsu.d(e2);
        ViewGroup viewGroup = (ViewGroup) e2;
        View findViewById = viewGroup.findViewById(cPX.a.b);
        C8632dsu.d(findViewById);
        C9702vQ.a(findViewById);
        findViewById.setClickable(true);
        C8632dsu.a(findViewById, "");
        this.e = findViewById;
        View findViewById2 = viewGroup.findViewById(cPX.a.l);
        C8632dsu.a(findViewById2, "");
        j = C8569dql.j(string, string2, string3);
        int b2 = b((TextView) findViewById2, j);
        ViewGroup a2 = a(cPX.a.j, raterThumbDownLottieDrawable, string, 1, b2);
        this.q = a2;
        ViewGroup a3 = a(cPX.a.g, raterThumbUpLottieDrawable, string2, 2, b2);
        this.u = a3;
        ViewGroup a4 = a(cPX.a.f13688o, raterDoubleThumbLottieDrawable, string3, 3, b2);
        this.B = a4;
        j2 = C8569dql.j(a2.findViewById(cPX.a.a), a2.findViewById(cPX.a.l), a3.findViewById(cPX.a.a), a3.findViewById(cPX.a.l), a4.findViewById(cPX.a.a), a4.findViewById(cPX.a.l));
        this.b = j2;
        View findViewById3 = viewGroup.findViewById(cPX.a.c);
        ViewGroup viewGroup2 = (ViewGroup) findViewById3;
        ImageView imageView = (ImageView) viewGroup2.findViewById(cPX.a.n);
        imageView.setImageResource(cPX.d.b);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        viewGroup2.setOnClickListener(new View.OnClickListener() { // from class: o.cQh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5995cQb.b(C5995cQb.this, view);
            }
        });
        C8632dsu.a(findViewById3, "");
        this.h = viewGroup2;
        this.C = viewGroup;
        setOnClickListener(new View.OnClickListener() { // from class: o.cQj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5995cQb.d(C5995cQb.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C5995cQb c5995cQb) {
        C8632dsu.c((Object) c5995cQb, "");
        c5995cQb.a(c5995cQb.n);
    }

    /* renamed from: o.cQb$a */
    /* loaded from: classes4.dex */
    public static final class a implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewParent parent = C5995cQb.this.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(C5995cQb.this);
            }
        }
    }

    /* renamed from: o.cQb$b */
    /* loaded from: classes4.dex */
    public static final class b implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View b = C5995cQb.this.b();
            if (b != null) {
                b.sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C5995cQb c5995cQb, View view) {
        C8632dsu.c((Object) c5995cQb, "");
        b(c5995cQb, 0L, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C5995cQb c5995cQb, View view) {
        C8632dsu.c((Object) c5995cQb, "");
        b(c5995cQb, 0L, 1, null);
    }

    private final ViewGroup a(int i2, final Drawable drawable, String str, final int i3, int i4) {
        View findViewById = findViewById(i2);
        ViewGroup viewGroup = (ViewGroup) findViewById;
        ((ImageView) viewGroup.findViewById(cPX.a.e)).setImageDrawable(drawable);
        TextView textView = (TextView) viewGroup.findViewById(cPX.a.l);
        textView.setText(str);
        textView.getLayoutParams().width = i4;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        C1332Xp c1332Xp = C1332Xp.b;
        layoutParams.width = i4 + (((int) TypedValue.applyDimension(1, 6, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())) * 2);
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: o.cQi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5995cQb.d(drawable, this, i3, view);
            }
        });
        C8632dsu.a(findViewById, "");
        return viewGroup;
    }

    /* renamed from: o.cQb$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC1101Os<RaterThumbDownLottieDrawable.State> {
        final /* synthetic */ int b;

        @Override // o.InterfaceC1101Os
        public void d(InterfaceC1107Oy<RaterThumbDownLottieDrawable.State> interfaceC1107Oy) {
            C8632dsu.c((Object) interfaceC1107Oy, "");
        }

        c(int i) {
            this.b = i;
        }

        @Override // o.InterfaceC1101Os
        public void e(InterfaceC1107Oy<RaterThumbDownLottieDrawable.State> interfaceC1107Oy) {
            C8632dsu.c((Object) interfaceC1107Oy, "");
            if (interfaceC1107Oy.e() == RaterThumbDownLottieDrawable.State.c) {
                C5995cQb.this.c(this.b, 50L);
                C5995cQb.this.b(400L);
                return;
            }
            C5995cQb.d(C5995cQb.this, 0, 0L, 2, null);
            C5995cQb.this.b(200L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Drawable drawable, C5995cQb c5995cQb, int i2, View view) {
        C8632dsu.c((Object) drawable, "");
        C8632dsu.c((Object) c5995cQb, "");
        if (drawable instanceof RaterThumbDownLottieDrawable) {
            RaterThumbDownLottieDrawable raterThumbDownLottieDrawable = (RaterThumbDownLottieDrawable) drawable;
            raterThumbDownLottieDrawable.setTransitionListener(new c(i2));
            if (raterThumbDownLottieDrawable.getState() == RaterThumbDownLottieDrawable.State.a) {
                raterThumbDownLottieDrawable.animateToState(RaterThumbDownLottieDrawable.State.c);
            } else {
                raterThumbDownLottieDrawable.animateToState(RaterThumbDownLottieDrawable.State.e);
            }
        } else if (drawable instanceof RaterThumbUpLottieDrawable) {
            RaterThumbUpLottieDrawable raterThumbUpLottieDrawable = (RaterThumbUpLottieDrawable) drawable;
            raterThumbUpLottieDrawable.setTransitionListener(new d(i2));
            if (raterThumbUpLottieDrawable.getState() == RaterThumbUpLottieDrawable.State.e) {
                raterThumbUpLottieDrawable.animateToState(RaterThumbUpLottieDrawable.State.b);
            } else {
                raterThumbUpLottieDrawable.animateToState(RaterThumbUpLottieDrawable.State.c);
            }
        } else if (drawable instanceof RaterDoubleThumbLottieDrawable) {
            RaterDoubleThumbLottieDrawable raterDoubleThumbLottieDrawable = (RaterDoubleThumbLottieDrawable) drawable;
            raterDoubleThumbLottieDrawable.setTransitionListener(new i(i2));
            if (raterDoubleThumbLottieDrawable.getState() == RaterDoubleThumbLottieDrawable.State.a) {
                raterDoubleThumbLottieDrawable.animateToState(RaterDoubleThumbLottieDrawable.State.e);
            } else {
                raterDoubleThumbLottieDrawable.animateToState(RaterDoubleThumbLottieDrawable.State.c);
            }
        }
    }

    /* renamed from: o.cQb$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC1101Os<RaterThumbUpLottieDrawable.State> {
        final /* synthetic */ int b;

        @Override // o.InterfaceC1101Os
        public void d(InterfaceC1107Oy<RaterThumbUpLottieDrawable.State> interfaceC1107Oy) {
            C8632dsu.c((Object) interfaceC1107Oy, "");
        }

        d(int i) {
            this.b = i;
        }

        @Override // o.InterfaceC1101Os
        public void e(InterfaceC1107Oy<RaterThumbUpLottieDrawable.State> interfaceC1107Oy) {
            C8632dsu.c((Object) interfaceC1107Oy, "");
            if (interfaceC1107Oy.e() == RaterThumbUpLottieDrawable.State.b) {
                C5995cQb.this.c(this.b, 50L);
                C5995cQb.this.b(400L);
                return;
            }
            C5995cQb.d(C5995cQb.this, 0, 0L, 2, null);
            C5995cQb.this.b(200L);
        }
    }

    /* renamed from: o.cQb$i */
    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC1101Os<RaterDoubleThumbLottieDrawable.State> {
        final /* synthetic */ int b;

        @Override // o.InterfaceC1101Os
        public void d(InterfaceC1107Oy<RaterDoubleThumbLottieDrawable.State> interfaceC1107Oy) {
            C8632dsu.c((Object) interfaceC1107Oy, "");
        }

        i(int i) {
            this.b = i;
        }

        @Override // o.InterfaceC1101Os
        public void e(InterfaceC1107Oy<RaterDoubleThumbLottieDrawable.State> interfaceC1107Oy) {
            C8632dsu.c((Object) interfaceC1107Oy, "");
            if (interfaceC1107Oy.e() == RaterDoubleThumbLottieDrawable.State.e) {
                C5995cQb.this.c(this.b, 50L);
                C5995cQb.this.b(1000L);
                return;
            }
            C5995cQb.d(C5995cQb.this, 0, 0L, 2, null);
            C5995cQb.this.b(200L);
        }
    }

    public final void a(CoordinatorLayout coordinatorLayout, cPT cpt) {
        RaterDoubleThumbLottieDrawable.State state;
        int i2;
        int i3;
        int i4 = 2 % 2;
        C8632dsu.c((Object) coordinatorLayout, "");
        C8632dsu.c((Object) cpt, "");
        if (getParent() != null) {
            int i5 = E + 91;
            I = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        coordinatorLayout.addView(this, new CoordinatorLayout.LayoutParams(-1, -1));
        for (Animator animator : this.t) {
            animator.cancel();
        }
        this.t.clear();
        this.l.clear();
        this.n = cpt.d();
        this.w.setState((RaterThumbDownLottieDrawable) (cpt.d() == 1 ? RaterThumbDownLottieDrawable.State.c : RaterThumbDownLottieDrawable.State.a));
        this.v.setState((RaterThumbUpLottieDrawable) (cpt.d() == 2 ? RaterThumbUpLottieDrawable.State.b : RaterThumbUpLottieDrawable.State.e));
        RaterDoubleThumbLottieDrawable raterDoubleThumbLottieDrawable = this.A;
        if (cpt.d() == 3) {
            state = RaterDoubleThumbLottieDrawable.State.e;
            int i6 = E + 91;
            I = i6 % 128;
            int i7 = i6 % 2;
        } else {
            state = RaterDoubleThumbLottieDrawable.State.a;
        }
        raterDoubleThumbLottieDrawable.setState((RaterDoubleThumbLottieDrawable) state);
        AccessibilityUtils.d(coordinatorLayout, this, true);
        ViewGroup viewGroup = this.q;
        Resources resources = getResources();
        if (cpt.d() == 1) {
            i2 = cPS.c.c;
            int i8 = I + 69;
            E = i8 % 128;
            int i9 = i8 % 2;
        } else {
            i2 = cPS.c.b;
        }
        String string = resources.getString(i2);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            F(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        viewGroup.setContentDescription(string);
        ViewGroup viewGroup2 = this.u;
        Resources resources2 = getResources();
        if (cpt.d() == 2) {
            int i10 = I + 91;
            E = i10 % 128;
            int i11 = i10 % 2;
            i3 = cPS.c.g;
        } else {
            i3 = cPS.c.d;
        }
        String string2 = resources2.getString(i3);
        if (string2.startsWith("'!#+")) {
            Object[] objArr2 = new Object[1];
            F(string2.substring(4), objArr2);
            string2 = ((String) objArr2[0]).intern();
        }
        viewGroup2.setContentDescription(string2);
        ViewGroup viewGroup3 = this.B;
        String string3 = getResources().getString(cpt.d() == 3 ? cPS.c.h : cPS.c.a);
        if (string3.startsWith("'!#+")) {
            Object[] objArr3 = new Object[1];
            F(string3.substring(4), objArr3);
            string3 = ((String) objArr3[0]).intern();
        }
        viewGroup3.setContentDescription(string3);
        C9702vQ.a(this.h, 1.0f);
        this.h.setTranslationY(0.0f);
        this.e.setTranslationY(0.0f);
        for (View view : this.b) {
            view.setTranslationY(0.0f);
        }
        OneShotPreDrawListener.add(this, new f(this, cpt, this));
        this.g.setAlpha(0);
        List<Animator> list = this.l;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.g, PropertyValuesHolder.ofInt(InteractiveAnimation.ANIMATION_TYPE.ALPHA, 0, 176));
        ofPropertyValuesHolder.setDuration(267L);
        ofPropertyValuesHolder.start();
        list.add(ofPropertyValuesHolder);
        this.d = cpt;
        this.i = cpt.c();
        if (this.j) {
            View c2 = cpt.c();
            List<Animator> list2 = this.l;
            ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(c2, PropertyValuesHolder.ofFloat(InteractiveAnimation.ANIMATION_TYPE.ALPHA, c2.getAlpha(), 0.0f));
            ofPropertyValuesHolder2.setDuration(167L);
            ofPropertyValuesHolder2.start();
            list2.add(ofPropertyValuesHolder2);
        }
        this.q.sendAccessibilityEvent(8);
        this.k = true;
    }

    public static /* synthetic */ void b(C5995cQb c5995cQb, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = 0;
        }
        c5995cQb.b(j);
    }

    public final void b(long j) {
        if (j == 0 || C8141del.a() || C8067ddQ.c()) {
            d();
        } else {
            postDelayed(new Runnable() { // from class: o.cQa
                @Override // java.lang.Runnable
                public final void run() {
                    C5995cQb.f(C5995cQb.this);
                }
            }, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C5995cQb c5995cQb) {
        C8632dsu.c((Object) c5995cQb, "");
        c5995cQb.d();
    }

    public final void d() {
        int d2;
        if (this.k) {
            this.k = false;
            ViewParent parent = getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                AccessibilityUtils.d(viewGroup, this, false);
            }
            for (Animator animator : this.l) {
                animator.cancel();
            }
            this.l.clear();
            this.t.clear();
            List<Animator> list = this.t;
            ColorDrawable colorDrawable = this.g;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(colorDrawable, PropertyValuesHolder.ofInt(InteractiveAnimation.ANIMATION_TYPE.ALPHA, colorDrawable.getAlpha(), 0));
            ofPropertyValuesHolder.setStartDelay(33L);
            ofPropertyValuesHolder.setDuration(233L);
            C8632dsu.d(ofPropertyValuesHolder);
            ofPropertyValuesHolder.addListener(new a());
            ofPropertyValuesHolder.start();
            list.add(ofPropertyValuesHolder);
            C1332Xp c1332Xp = C1332Xp.b;
            float applyDimension = (int) TypedValue.applyDimension(1, 30, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
            Collection collection = this.t;
            AnimatorSet animatorSet = new AnimatorSet();
            int i2 = 2;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.e, "translationY", applyDimension);
            ofFloat.setDuration(400L);
            ofFloat.setInterpolator(this.f13693o);
            dpR dpr = dpR.c;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.e, InteractiveAnimation.ANIMATION_TYPE.ALPHA, 0.0f);
            ofFloat2.setDuration(233L);
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.start();
            collection.add(animatorSet);
            List<Animator> list2 = this.t;
            List<View> list3 = this.b;
            d2 = C8572dqo.d(list3, 10);
            ArrayList arrayList = new ArrayList(d2);
            for (View view : list3) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                Animator[] animatorArr = new Animator[i2];
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "translationY", applyDimension);
                ofFloat3.setDuration(400L);
                ofFloat3.setInterpolator(this.f13693o);
                dpR dpr2 = dpR.c;
                animatorArr[0] = ofFloat3;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, InteractiveAnimation.ANIMATION_TYPE.ALPHA, 0.0f);
                ofFloat4.setDuration(133L);
                animatorArr[1] = ofFloat4;
                animatorSet2.playTogether(animatorArr);
                animatorSet2.start();
                arrayList.add(animatorSet2);
                i2 = 2;
            }
            C8571dqn.b(list2, arrayList);
            View view2 = this.i;
            if (view2 != null) {
                C1332Xp c1332Xp2 = C1332Xp.b;
                view2.setTranslationY(-((int) TypedValue.applyDimension(1, 17, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
                Collection collection2 = this.t;
                AnimatorSet animatorSet3 = new AnimatorSet();
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, "translationY", 0.0f);
                ofFloat5.setStartDelay(33L);
                ofFloat5.setDuration(400L);
                ofFloat5.setInterpolator(new PathInterpolator(0.21f, 0.0f, 0.07f, 1.0f));
                dpR dpr3 = dpR.c;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view2, InteractiveAnimation.ANIMATION_TYPE.ALPHA, 1.0f);
                ofFloat6.setStartDelay(100L);
                ofFloat6.setDuration(200L);
                animatorSet3.playTogether(ofFloat5, ofFloat6);
                animatorSet3.addListener(new b());
                animatorSet3.start();
                collection2.add(animatorSet3);
            }
            Collection collection3 = this.t;
            AnimatorSet animatorSet4 = new AnimatorSet();
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.h, "scaleX", 0.0f);
            ofFloat7.setDuration(400L);
            ofFloat7.setInterpolator(this.f13693o);
            dpR dpr4 = dpR.c;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.h, "scaleY", 0.0f);
            ofFloat8.setDuration(400L);
            ofFloat8.setInterpolator(this.f13693o);
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.h, InteractiveAnimation.ANIMATION_TYPE.ALPHA, 0.0f);
            ofFloat9.setDuration(233L);
            animatorSet4.playTogether(ofFloat7, ofFloat8, ofFloat9);
            animatorSet4.start();
            collection3.add(animatorSet4);
            this.s.invoke();
        }
    }

    /* renamed from: o.cQb$f */
    /* loaded from: classes4.dex */
    public static final class f implements Runnable {
        final /* synthetic */ cPT b;
        final /* synthetic */ View c;
        final /* synthetic */ C5995cQb d;

        public f(View view, cPT cpt, C5995cQb c5995cQb) {
            this.c = view;
            this.b = cpt;
            this.d = c5995cQb;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int d;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            this.b.c().getGlobalVisibleRect(rect);
            this.d.a().getGlobalVisibleRect(rect2);
            this.d.C.setTranslationY(this.d.C.getTranslationY() + (rect.top - rect2.top));
            this.d.C.setTranslationX(this.d.C.getTranslationX() + (rect.centerX() - rect2.centerX()));
            C1332Xp c1332Xp = C1332Xp.b;
            float applyDimension = (int) TypedValue.applyDimension(1, 30, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
            this.d.e.setAlpha(0.0f);
            this.d.e.setTranslationY(applyDimension);
            List<Animator> e = this.d.e();
            AnimatorSet animatorSet = new AnimatorSet();
            int i = 2;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.d.e, "translationY", 0.0f);
            long j = 400;
            ofFloat.setDuration(400L);
            ofFloat.setInterpolator(this.d.c());
            dpR dpr = dpR.c;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.d.e, InteractiveAnimation.ANIMATION_TYPE.ALPHA, 1.0f);
            ofFloat2.setStartDelay(100L);
            ofFloat2.setDuration(167L);
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.start();
            e.add(animatorSet);
            List<Animator> e2 = this.d.e();
            List<View> list = this.d.b;
            d = C8572dqo.d(list, 10);
            ArrayList arrayList = new ArrayList(d);
            for (View view : list) {
                view.setAlpha(0.0f);
                view.setTranslationY(applyDimension);
                AnimatorSet animatorSet2 = new AnimatorSet();
                Animator[] animatorArr = new Animator[i];
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "translationY", 0.0f);
                ofFloat3.setDuration(j);
                ofFloat3.setInterpolator(this.d.c());
                dpR dpr2 = dpR.c;
                animatorArr[0] = ofFloat3;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, InteractiveAnimation.ANIMATION_TYPE.ALPHA, 1.0f);
                ofFloat4.setStartDelay(133L);
                ofFloat4.setDuration(200L);
                animatorArr[1] = ofFloat4;
                animatorSet2.playTogether(animatorArr);
                animatorSet2.start();
                arrayList.add(animatorSet2);
                i = 2;
                j = 400;
            }
            C8571dqn.b(e2, arrayList);
            this.d.a().setContentDescription(this.d.a);
            this.d.a().setAlpha(0.0f);
            C9702vQ.a(this.d.a(), 0.7f);
            List<Animator> e3 = this.d.e();
            AnimatorSet animatorSet3 = new AnimatorSet();
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.d.a(), "scaleX", 1.0f);
            ofFloat5.setDuration(400L);
            ofFloat5.setInterpolator(this.d.c());
            dpR dpr3 = dpR.c;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.d.a(), "scaleY", 1.0f);
            ofFloat6.setDuration(400L);
            ofFloat6.setInterpolator(this.d.c());
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.d.a(), InteractiveAnimation.ANIMATION_TYPE.ALPHA, 1.0f);
            ofFloat7.setStartDelay(100L);
            ofFloat7.setDuration(167L);
            animatorSet3.playTogether(ofFloat5, ofFloat6, ofFloat7);
            animatorSet3.start();
            e3.add(animatorSet3);
        }
    }

    public static /* synthetic */ void d(C5995cQb c5995cQb, int i2, long j, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            j = 0;
        }
        c5995cQb.c(i2, j);
    }

    public final void c(int i2, long j) {
        this.n = i2;
        if (j == 0 || C8141del.a()) {
            a(i2);
        } else {
            postDelayed(this.f, j);
        }
    }

    public final void a(int i2) {
        this.n = i2;
        removeCallbacks(this.f);
        if (i2 == 1) {
            this.v.setState((RaterThumbUpLottieDrawable) RaterThumbUpLottieDrawable.State.e);
            this.A.setState((RaterDoubleThumbLottieDrawable) RaterDoubleThumbLottieDrawable.State.a);
        } else if (i2 == 2) {
            this.w.setState((RaterThumbDownLottieDrawable) RaterThumbDownLottieDrawable.State.a);
            this.A.setState((RaterDoubleThumbLottieDrawable) RaterDoubleThumbLottieDrawable.State.a);
        } else if (i2 == 3) {
            this.w.setState((RaterThumbDownLottieDrawable) RaterThumbDownLottieDrawable.State.a);
            this.v.setState((RaterThumbUpLottieDrawable) RaterThumbUpLottieDrawable.State.e);
        }
        cPT cpt = this.d;
        if (cpt != null) {
            this.r.d(cpt, i2);
        }
    }

    private final int b(TextView textView, List<String> list) {
        int c2;
        Paint paint = new Paint();
        paint.setTypeface(textView.getTypeface());
        paint.setTextSize(textView.getTextSize());
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int measureText = (int) paint.measureText((String) it.next());
        while (it.hasNext()) {
            int measureText2 = (int) paint.measureText((String) it.next());
            if (measureText < measureText2) {
                measureText = measureText2;
            }
        }
        C1332Xp c1332Xp = C1332Xp.b;
        c2 = C8657dts.c(measureText, (int) TypedValue.applyDimension(1, 48, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 72, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        return c2;
    }

    private static void F(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$3631);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
