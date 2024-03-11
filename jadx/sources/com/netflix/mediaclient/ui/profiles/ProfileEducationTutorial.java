package com.netflix.mediaclient.ui.profiles;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.profiles.FirstTimeProfileEducationFlexEventType;
import com.netflix.mediaclient.ui.profiles.ProfileEducationTutorial;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.rxkotlin.SubscribersKt;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.Abstractanimation.Animation$AnimationListenerC9916yx;
import o.C1097Oo;
import o.C1098Op;
import o.C1176Rp;
import o.C1193Sg;
import o.C1199Sm;
import o.C1203Sq;
import o.C1204Sr;
import o.C1863aRa;
import o.C5855cKw;
import o.C8153dex;
import o.C8310dhv;
import o.C8569dql;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1270Vf;
import o.InterfaceC8598drn;
import o.cKC;
import o.dpR;
import o.dqE;
import o.drM;

@SuppressLint({"ClickableViewAccessibility", "CheckResult"})
/* loaded from: classes4.dex */
public final class ProfileEducationTutorial {
    public static final int b;
    public static final Companion d;
    private static final Interpolator e;
    private static byte e$ss2$4223 = 0;
    private static Companion.DismissMode h = null;
    private static final Interpolator i;
    private static final Interpolator j;
    private static int w = 0;
    private static int x = 1;
    public b a;
    public boolean c;
    private cKC f;
    private final InterfaceC1270Vf g;
    private final int k;
    private int l;
    private final int m;
    private final boolean n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f13311o;
    private final List<a> p;
    private boolean q;
    private final int r;
    private final int s;
    private final boolean t;
    private final boolean v;
    private boolean y;

    /* loaded from: classes4.dex */
    public interface b {
        void b(boolean z);

        void e();
    }

    /* loaded from: classes4.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Companion.DismissMode.values().length];
            try {
                iArr[Companion.DismissMode.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Companion.DismissMode.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    static void g() {
        e$ss2$4223 = (byte) 24;
    }

    public final void c(boolean z) {
        this.q = z;
    }

    public final void d() {
        this.f = null;
    }

    public ProfileEducationTutorial(ViewStub viewStub, InterfaceC1270Vf interfaceC1270Vf) {
        List<a> f2;
        C8632dsu.c((Object) viewStub, "");
        C8632dsu.c((Object) interfaceC1270Vf, "");
        this.g = interfaceC1270Vf;
        this.t = C8310dhv.a();
        C1863aRa.d dVar = C1863aRa.e;
        boolean b2 = dVar.d().b();
        this.f13311o = b2;
        boolean a2 = dVar.d().a();
        this.n = a2;
        boolean c2 = dVar.d().c();
        this.v = c2;
        this.y = dVar.d().f();
        int i2 = C5855cKw.i.s;
        this.s = i2;
        int i3 = C5855cKw.i.p;
        this.r = i3;
        int i4 = C5855cKw.i.q;
        this.m = i4;
        int i5 = C5855cKw.i.r;
        this.k = i5;
        a[] aVarArr = new a[3];
        aVarArr[0] = new a(a2 ? C5855cKw.i.w : i5, a2 ? C5855cKw.i.u : C5855cKw.i.x, c2, b2, i2, i3, C5855cKw.e.j, 90, 269);
        aVarArr[1] = new a(a2 ? C5855cKw.i.B : i5, a2 ? C5855cKw.i.v : C5855cKw.i.y, c2, b2, i2, i3, C5855cKw.e.f, 360, 539);
        aVarArr[2] = new a(a2 ? C5855cKw.i.D : i5, a2 ? C5855cKw.i.z : C5855cKw.i.A, true, false, i4, i4, C5855cKw.e.g, 600, 799);
        f2 = C8569dql.f(aVarArr);
        this.p = f2;
        viewStub.setLayoutResource(a2 ? C5855cKw.c.l : c2 ? C5855cKw.c.g : C5855cKw.c.m);
        this.f = cKC.a(viewStub.inflate());
        n().a().setVisibility(4);
        C1176Rp c1176Rp = n().c;
        C8632dsu.a(c1176Rp, "");
        C1176Rp.setup$default(c1176Rp, f2.size(), 0, C5855cKw.a.j, C5855cKw.a.h, 2, null);
        final long b3 = interfaceC1270Vf.b();
        if (this.y) {
            Single<C1097Oo> observeOn = C1098Op.a.b("lottiefiles/profile_education.json", false).observeOn(AndroidSchedulers.mainThread());
            C8632dsu.a(observeOn, "");
            SubscribersKt.subscribeBy(observeOn, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileEducationTutorial.1
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    e(th);
                    return dpR.c;
                }

                public final void e(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    ProfileEducationTutorial.this.y = false;
                    cKC ckc = ProfileEducationTutorial.this.f;
                    ConstraintLayout constraintLayout = ckc != null ? ckc.d : null;
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(0);
                    }
                    cKC ckc2 = ProfileEducationTutorial.this.f;
                    ProgressBar progressBar = ckc2 != null ? ckc2.h : null;
                    if (progressBar != null) {
                        progressBar.setVisibility(8);
                    }
                    ProfileEducationTutorial.this.a();
                }
            }, new drM<C1097Oo, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileEducationTutorial.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C1097Oo c1097Oo) {
                    e(c1097Oo);
                    return dpR.c;
                }

                public final void e(C1097Oo c1097Oo) {
                    Map<String, String> d2;
                    C1199Sm c1199Sm;
                    long b4 = ProfileEducationTutorial.this.g.b();
                    HashMap hashMap = new HashMap();
                    hashMap.put("lottie_load_time", Integer.valueOf((int) (b4 - b3)));
                    FirstTimeProfileEducationFlexEventType.e eVar = FirstTimeProfileEducationFlexEventType.b;
                    FirstTimeProfileEducationFlexEventType firstTimeProfileEducationFlexEventType = FirstTimeProfileEducationFlexEventType.c;
                    d2 = dqE.d();
                    eVar.e(firstTimeProfileEducationFlexEventType, hashMap, d2);
                    ProfileEducationTutorial profileEducationTutorial = ProfileEducationTutorial.this;
                    ProfileEducationTutorial.a(profileEducationTutorial, profileEducationTutorial.l, false, 2, null);
                    cKC ckc = ProfileEducationTutorial.this.f;
                    if (ckc != null && (c1199Sm = ckc.b) != null) {
                        c1199Sm.setComposition(c1097Oo.d());
                    }
                    cKC ckc2 = ProfileEducationTutorial.this.f;
                    ConstraintLayout constraintLayout = ckc2 != null ? ckc2.d : null;
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(0);
                    }
                    cKC ckc3 = ProfileEducationTutorial.this.f;
                    ProgressBar progressBar = ckc3 != null ? ckc3.h : null;
                    if (progressBar != null) {
                        progressBar.setVisibility(8);
                    }
                    ProfileEducationTutorial.this.l();
                }
            });
            return;
        }
        n().d.setVisibility(0);
        n().h.setVisibility(8);
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class DismissMode {
            private static final /* synthetic */ DismissMode[] a;
            private static final /* synthetic */ InterfaceC8598drn c;
            public static final DismissMode d = new DismissMode("FADE_OUT", 0);
            public static final DismissMode b = new DismissMode("DRAWER", 1);

            private static final /* synthetic */ DismissMode[] a() {
                return new DismissMode[]{d, b};
            }

            public static DismissMode valueOf(String str) {
                return (DismissMode) Enum.valueOf(DismissMode.class, str);
            }

            public static DismissMode[] values() {
                return (DismissMode[]) a.clone();
            }

            private DismissMode(String str, int i) {
            }

            static {
                DismissMode[] a2 = a();
                a = a2;
                c = C8600drp.e(a2);
            }
        }

        private Companion() {
        }

        public final boolean a(NetflixActivity netflixActivity) {
            C8632dsu.c((Object) netflixActivity, "");
            boolean b = b(netflixActivity);
            return C1863aRa.e.d().e() && !C8153dex.d.aa() && (b || (!b && b()));
        }

        public final boolean b(NetflixActivity netflixActivity) {
            C8632dsu.c((Object) netflixActivity, "");
            return netflixActivity.getTutorialHelper().d(netflixActivity);
        }

        public final boolean b() {
            return C1863aRa.e.d().d();
        }
    }

    static {
        g();
        d = new Companion(null);
        b = 8;
        h = Companion.DismissMode.d;
        Interpolator create = PathInterpolatorCompat.create(0.66f, 0.0f, 0.34f, 1.0f);
        C8632dsu.a(create, "");
        i = create;
        Interpolator create2 = PathInterpolatorCompat.create(0.66f, 0.0f, 0.34f, 1.0f);
        C8632dsu.a(create2, "");
        j = create2;
        Interpolator create3 = PathInterpolatorCompat.create(0.4f, 0.0f, 0.9f, 0.25f);
        C8632dsu.a(create3, "");
        e = create3;
    }

    private final cKC n() {
        cKC ckc = this.f;
        if (ckc != null) {
            return ckc;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    public final void e(Companion.DismissMode dismissMode) {
        C8632dsu.c((Object) dismissMode, "");
        this.c = true;
        h = dismissMode;
        n().a().setVisibility(0);
        e(this.l, true);
        h();
    }

    public final void f() {
        if (this.q || this.c) {
            return;
        }
        this.q = true;
        h = Companion.DismissMode.b;
        n().a().setVisibility(4);
        this.c = true;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, n().a().getHeight(), 0.0f);
        translateAnimation.setAnimationListener(new l());
        translateAnimation.setDuration(400L);
        n().a().startAnimation(translateAnimation);
    }

    /* loaded from: classes4.dex */
    public static final class l extends Abstractanimation.Animation$AnimationListenerC9916yx {
        l() {
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            ProfileEducationTutorial.this.l = 0;
            cKC ckc = ProfileEducationTutorial.this.f;
            ConstraintLayout a = ckc != null ? ckc.a() : null;
            if (a != null) {
                a.setVisibility(0);
            }
            ProfileEducationTutorial.this.e(0, true);
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            ProfileEducationTutorial.this.c(false);
            ProfileEducationTutorial.this.h();
            ProfileEducationTutorial.this.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        C1193Sg c1193Sg;
        C1203Sq c1203Sq;
        C1203Sq c1203Sq2;
        cKC ckc = this.f;
        if (ckc != null) {
            final GestureDetector gestureDetector = new GestureDetector(ckc.a().getContext(), new c());
            ckc.a().setOnTouchListener(new View.OnTouchListener() { // from class: o.cNq
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean b2;
                    b2 = ProfileEducationTutorial.b(gestureDetector, view, motionEvent);
                    return b2;
                }
            });
        }
        cKC ckc2 = this.f;
        if (ckc2 != null && (c1203Sq2 = ckc2.g) != null) {
            c1203Sq2.setOnClickListener(new View.OnClickListener() { // from class: o.cNs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileEducationTutorial.b(ProfileEducationTutorial.this, view);
                }
            });
            c1203Sq2.setClickable(true);
        }
        cKC ckc3 = this.f;
        if (ckc3 != null && (c1203Sq = ckc3.i) != null) {
            c1203Sq.setOnClickListener(new View.OnClickListener() { // from class: o.cNr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileEducationTutorial.c(ProfileEducationTutorial.this, view);
                }
            });
            c1203Sq.setClickable(true);
        }
        if (h == Companion.DismissMode.b) {
            cKC ckc4 = this.f;
            C1193Sg c1193Sg2 = ckc4 != null ? ckc4.e : null;
            if (c1193Sg2 != null) {
                c1193Sg2.setVisibility(0);
            }
            cKC ckc5 = this.f;
            if (ckc5 == null || (c1193Sg = ckc5.e) == null) {
                return;
            }
            c1193Sg.setOnClickListener(new View.OnClickListener() { // from class: o.cNt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileEducationTutorial.f(ProfileEducationTutorial.this, view);
                }
            });
            c1193Sg.setClickable(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        C8632dsu.c((Object) gestureDetector, "");
        gestureDetector.onTouchEvent(motionEvent);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ProfileEducationTutorial profileEducationTutorial, View view) {
        Map<String, Integer> d2;
        C8632dsu.c((Object) profileEducationTutorial, "");
        if (profileEducationTutorial.l == profileEducationTutorial.p.size() - 1) {
            profileEducationTutorial.o();
            profileEducationTutorial.a();
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("current_slide", String.valueOf(profileEducationTutorial.l));
        FirstTimeProfileEducationFlexEventType.e eVar = FirstTimeProfileEducationFlexEventType.b;
        FirstTimeProfileEducationFlexEventType firstTimeProfileEducationFlexEventType = FirstTimeProfileEducationFlexEventType.e;
        d2 = dqE.d();
        eVar.e(firstTimeProfileEducationFlexEventType, d2, hashMap);
        profileEducationTutorial.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ProfileEducationTutorial profileEducationTutorial, View view) {
        C8632dsu.c((Object) profileEducationTutorial, "");
        profileEducationTutorial.m();
        profileEducationTutorial.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ProfileEducationTutorial profileEducationTutorial, View view) {
        C8632dsu.c((Object) profileEducationTutorial, "");
        profileEducationTutorial.m();
        profileEducationTutorial.a();
    }

    private final void i() {
        if (this.y) {
            n().b.b();
        }
        n().a().setOnTouchListener(null);
        C1203Sq c1203Sq = n().g;
        C8632dsu.a(c1203Sq, "");
        c1203Sq.setOnClickListener(null);
        c1203Sq.setClickable(false);
        C1203Sq c1203Sq2 = n().i;
        C8632dsu.a(c1203Sq2, "");
        c1203Sq2.setOnClickListener(null);
        c1203Sq2.setClickable(false);
        C1193Sg c1193Sg = n().e;
        C8632dsu.a(c1193Sg, "");
        c1193Sg.setOnClickListener(null);
        c1193Sg.setClickable(false);
        n().e.setVisibility(8);
    }

    public final void a() {
        if (this.q) {
            return;
        }
        this.q = true;
        i();
        j();
    }

    static /* synthetic */ void a(ProfileEducationTutorial profileEducationTutorial, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        profileEducationTutorial.e(i2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(int i2, boolean z) {
        Map<String, Integer> d2;
        int i3;
        int i4 = 2 % 2;
        if (i2 < 0) {
            int i5 = x + 57;
            w = i5 % 128;
            if (i5 % 2 != 0) {
                this.p.size();
                Object obj = null;
                obj.hashCode();
                throw null;
            } else if (i2 >= this.p.size()) {
                return;
            }
        }
        cKC ckc = this.f;
        if (ckc != null) {
            int i6 = x + 81;
            int i7 = i6 % 128;
            w = i7;
            int i8 = i6 % 2;
            if (this.y) {
                int i9 = i7 + 107;
                x = i9 % 128;
                int i10 = i9 % 2;
                d(i2, z);
            }
            int i11 = this.l;
            if (i2 != i11) {
                e(i2);
            } else {
                C1204Sr c1204Sr = ckc.m;
                int h2 = this.p.get(i11).h();
                Context context = c1204Sr.getContext();
                String string = context.getString(h2);
                if (string.startsWith("'!#+")) {
                    Object[] objArr = new Object[1];
                    u(string.substring(4), objArr);
                    string = ((String) objArr[0]).intern();
                    CharSequence text = context.getText(h2);
                    if (text instanceof Spanned) {
                        SpannableString spannableString = new SpannableString(string);
                        TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                        string = spannableString;
                    }
                }
                c1204Sr.setText(string);
                C1204Sr c1204Sr2 = ckc.f;
                int i12 = this.p.get(this.l).i();
                Context context2 = c1204Sr2.getContext();
                String string2 = context2.getString(i12);
                if (string2.startsWith("'!#+")) {
                    int i13 = x + 77;
                    w = i13 % 128;
                    int i14 = i13 % 2;
                    Object[] objArr2 = new Object[1];
                    u(string2.substring(4), objArr2);
                    string2 = ((String) objArr2[0]).intern();
                    CharSequence text2 = context2.getText(i12);
                    if (text2 instanceof Spanned) {
                        SpannableString spannableString2 = new SpannableString(string2);
                        TextUtils.copySpansFrom((SpannedString) text2, 0, string2.length(), Object.class, spannableString2, 0);
                        string2 = spannableString2;
                    }
                }
                c1204Sr2.setText(string2);
            }
            this.l = i2;
            a aVar = this.p.get(i2);
            HashMap hashMap = new HashMap();
            hashMap.put("current_slide", String.valueOf(this.l));
            FirstTimeProfileEducationFlexEventType.e eVar = FirstTimeProfileEducationFlexEventType.b;
            FirstTimeProfileEducationFlexEventType firstTimeProfileEducationFlexEventType = FirstTimeProfileEducationFlexEventType.d;
            d2 = dqE.d();
            eVar.e(firstTimeProfileEducationFlexEventType, d2, hashMap);
            if (!this.y) {
                ckc.b.setImageResource(this.p.get(i2).c());
            }
            ckc.c.c(i2);
            C1203Sq c1203Sq = ckc.g;
            int e2 = aVar.e();
            Context context3 = c1203Sq.getContext();
            String string3 = context3.getString(e2);
            if (string3.startsWith("'!#+")) {
                Object[] objArr3 = new Object[1];
                u(string3.substring(4), objArr3);
                string3 = ((String) objArr3[0]).intern();
                CharSequence text3 = context3.getText(e2);
                if (text3 instanceof Spanned) {
                    SpannableString spannableString3 = new SpannableString(string3);
                    TextUtils.copySpansFrom((SpannedString) text3, 0, string3.length(), Object.class, spannableString3, 0);
                    string3 = spannableString3;
                }
            }
            c1203Sq.setText(string3);
            C1203Sq c1203Sq2 = ckc.g;
            if (aVar.d()) {
                int i15 = x + 109;
                w = i15 % 128;
                int i16 = i15 % 2;
                i3 = 0;
            } else {
                i3 = 8;
            }
            c1203Sq2.setVisibility(i3);
            C1203Sq c1203Sq3 = ckc.i;
            int f2 = aVar.f();
            Context context4 = c1203Sq3.getContext();
            String string4 = context4.getString(f2);
            if (string4.startsWith("'!#+")) {
                Object[] objArr4 = new Object[1];
                u(string4.substring(4), objArr4);
                string4 = ((String) objArr4[0]).intern();
                CharSequence text4 = context4.getText(f2);
                if (text4 instanceof Spanned) {
                    SpannableString spannableString4 = new SpannableString(string4);
                    TextUtils.copySpansFrom((SpannedString) text4, 0, string4.length(), Object.class, spannableString4, 0);
                    string4 = spannableString4;
                } else {
                    int i17 = x + 25;
                    w = i17 % 128;
                    int i18 = i17 % 2;
                }
            }
            c1203Sq3.setText(string4);
            ckc.i.setVisibility(aVar.a() ? 0 : 8);
        }
    }

    private final void d(int i2, boolean z) {
        int g2;
        int b2;
        cKC ckc = this.f;
        if (ckc != null) {
            ckc.b.b();
            if (z) {
                g2 = 0;
            } else {
                int i3 = this.l;
                if (i3 < i2) {
                    g2 = this.p.get(i3).b();
                } else {
                    g2 = this.p.get(i3).g();
                }
            }
            if (this.l < i2) {
                b2 = this.p.get(i2).g();
            } else {
                b2 = this.p.get(i2).b();
            }
            ckc.b.d(g2, b2, new d(i2), 0);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AnimatorListenerAdapter {
        final /* synthetic */ int c;

        d(int i) {
            this.c = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1199Sm c1199Sm;
            C1199Sm c1199Sm2;
            C1199Sm c1199Sm3;
            C8632dsu.c((Object) animator, "");
            cKC ckc = ProfileEducationTutorial.this.f;
            if (ckc != null && (c1199Sm3 = ckc.b) != null) {
                c1199Sm3.d(this);
            }
            cKC ckc2 = ProfileEducationTutorial.this.f;
            if (ckc2 != null && (c1199Sm2 = ckc2.b) != null) {
                c1199Sm2.b();
            }
            cKC ckc3 = ProfileEducationTutorial.this.f;
            if (ckc3 == null || (c1199Sm = ckc3.b) == null) {
                return;
            }
            c1199Sm.d(((a) ProfileEducationTutorial.this.p.get(this.c)).g(), ((a) ProfileEducationTutorial.this.p.get(this.c)).b(), null, -1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends Abstractanimation.Animation$AnimationListenerC9916yx {
        private static int a = 0;
        private static int b = 1;
        private static byte e$ss2$33 = 24;
        final /* synthetic */ int e;

        g(int i) {
            this.e = i;
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C1204Sr c1204Sr;
            int i = 2 % 2;
            int i2 = a + 59;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                cKC ckc = ProfileEducationTutorial.this.f;
                if (ckc == null || (c1204Sr = ckc.m) == null) {
                    return;
                }
                int h = ((a) ProfileEducationTutorial.this.p.get(this.e)).h();
                Context context = c1204Sr.getContext();
                String string = context.getString(h);
                if (string.startsWith("'!#+")) {
                    Object[] objArr = new Object[1];
                    d(string.substring(4), objArr);
                    string = ((String) objArr[0]).intern();
                    CharSequence text = context.getText(h);
                    if (text instanceof Spanned) {
                        SpannableString spannableString = new SpannableString(string);
                        TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                        int i3 = a + 123;
                        b = i3 % 128;
                        int i4 = i3 % 2;
                        string = spannableString;
                    } else {
                        int i5 = b + 63;
                        a = i5 % 128;
                        int i6 = i5 % 2;
                    }
                }
                c1204Sr.setText(string);
                return;
            }
            cKC unused = ProfileEducationTutorial.this.f;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void d(String str, Object[] objArr) {
            byte[] decode = Base64.decode(str, 0);
            byte[] bArr = new byte[decode.length];
            for (int i = 0; i < decode.length; i++) {
                bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$33);
            }
            objArr[0] = new String(bArr, StandardCharsets.UTF_8);
        }
    }

    private final void e(int i2) {
        float width;
        int i3 = 2 % 2;
        int i4 = x + 115;
        int i5 = i4 % 128;
        w = i5;
        int i6 = i4 % 2;
        cKC ckc = this.f;
        if (ckc != null) {
            int i7 = i5 + 63;
            int i8 = i7 % 128;
            x = i8;
            int i9 = i7 % 2;
            if (i2 > this.l) {
                int i10 = i8 + 111;
                w = i10 % 128;
                if (i10 % 2 != 0) {
                    ckc.a().getWidth();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                width = -ckc.a().getWidth();
            } else {
                width = ckc.a().getWidth();
            }
            if (this.n) {
                C1204Sr c1204Sr = ckc.m;
                C8632dsu.a(c1204Sr, "");
                c(c1204Sr, new g(i2), width);
            }
            C1204Sr c1204Sr2 = ckc.f;
            C8632dsu.a(c1204Sr2, "");
            c(c1204Sr2, new f(i2), width);
            if (!(!this.n)) {
                C1204Sr c1204Sr3 = ckc.k;
                int h2 = this.p.get(i2).h();
                Context context = c1204Sr3.getContext();
                String string = context.getString(h2);
                if (string.startsWith("'!#+")) {
                    int i11 = w + 85;
                    x = i11 % 128;
                    int i12 = i11 % 2;
                    Object[] objArr = new Object[1];
                    u(string.substring(4), objArr);
                    string = ((String) objArr[0]).intern();
                    CharSequence text = context.getText(h2);
                    if (text instanceof Spanned) {
                        SpannableString spannableString = new SpannableString(string);
                        TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                        string = spannableString;
                    }
                }
                c1204Sr3.setText(string);
                C1204Sr c1204Sr4 = ckc.k;
                C8632dsu.a(c1204Sr4, "");
                b(c1204Sr4, new i(), -width);
            }
            C1204Sr c1204Sr5 = ckc.j;
            int i13 = this.p.get(i2).i();
            Context context2 = c1204Sr5.getContext();
            String string2 = context2.getString(i13);
            if (string2.startsWith("'!#+")) {
                int i14 = w + 79;
                x = i14 % 128;
                int i15 = i14 % 2;
                Object[] objArr2 = new Object[1];
                u(string2.substring(4), objArr2);
                string2 = ((String) objArr2[0]).intern();
                CharSequence text2 = context2.getText(i13);
                if (text2 instanceof Spanned) {
                    SpannableString spannableString2 = new SpannableString(string2);
                    TextUtils.copySpansFrom((SpannedString) text2, 0, string2.length(), Object.class, spannableString2, 0);
                    string2 = spannableString2;
                }
            }
            c1204Sr5.setText(string2);
            C1204Sr c1204Sr6 = ckc.j;
            C8632dsu.a(c1204Sr6, "");
            b(c1204Sr6, new h(), -width);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends Abstractanimation.Animation$AnimationListenerC9916yx {
        private static int a = 1;
        private static int c = 0;
        private static byte e$ss2$33 = 24;
        final /* synthetic */ int e;

        f(int i) {
            this.e = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
            if ((r1 instanceof android.text.Spanned) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
            if ((r1 instanceof android.text.Spanned) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
            r2 = new android.text.SpannableString(r3);
            android.text.TextUtils.copySpansFrom((android.text.SpannedString) r1, 0, r3.length(), java.lang.Object.class, r2, 0);
            r1 = com.netflix.mediaclient.ui.profiles.ProfileEducationTutorial.f.c + 53;
            com.netflix.mediaclient.ui.profiles.ProfileEducationTutorial.f.a = r1 % 128;
            r1 = r1 % 2;
            r3 = r2;
         */
        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onAnimationEnd(android.view.animation.Animation r11) {
            /*
                r10 = this;
                r11 = 2
                int r0 = r11 % r11
                com.netflix.mediaclient.ui.profiles.ProfileEducationTutorial r0 = com.netflix.mediaclient.ui.profiles.ProfileEducationTutorial.this
                o.cKC r0 = com.netflix.mediaclient.ui.profiles.ProfileEducationTutorial.c(r0)
                if (r0 == 0) goto L99
                o.Sr r0 = r0.f
                if (r0 == 0) goto L99
                com.netflix.mediaclient.ui.profiles.ProfileEducationTutorial r1 = com.netflix.mediaclient.ui.profiles.ProfileEducationTutorial.this
                java.util.List r1 = com.netflix.mediaclient.ui.profiles.ProfileEducationTutorial.b(r1)
                int r2 = r10.e
                java.lang.Object r1 = r1.get(r2)
                com.netflix.mediaclient.ui.profiles.ProfileEducationTutorial$a r1 = (com.netflix.mediaclient.ui.profiles.ProfileEducationTutorial.a) r1
                int r1 = r1.i()
                android.content.Context r2 = r0.getContext()
                java.lang.String r3 = r2.getString(r1)
                java.lang.String r4 = "'!#+"
                boolean r4 = r3.startsWith(r4)
                if (r4 == 0) goto L96
                int r4 = com.netflix.mediaclient.ui.profiles.ProfileEducationTutorial.f.c
                int r4 = r4 + 79
                int r5 = r4 % 128
                com.netflix.mediaclient.ui.profiles.ProfileEducationTutorial.f.a = r5
                int r4 = r4 % r11
                r5 = 1
                r6 = 4
                r7 = 0
                if (r4 != 0) goto L5c
                java.lang.String r3 = r3.substring(r6)
                java.lang.Object[] r4 = new java.lang.Object[r5]
                r10.d(r3, r4)
                r3 = r4[r7]
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String r3 = r3.intern()
                java.lang.CharSequence r1 = r2.getText(r1)
                boolean r2 = r1 instanceof android.text.Spanned
                r4 = 48
                int r4 = r4 / r7
                if (r2 == 0) goto L96
                goto L75
            L5c:
                java.lang.String r3 = r3.substring(r6)
                java.lang.Object[] r4 = new java.lang.Object[r5]
                r10.d(r3, r4)
                r3 = r4[r7]
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String r3 = r3.intern()
                java.lang.CharSequence r1 = r2.getText(r1)
                boolean r2 = r1 instanceof android.text.Spanned
                if (r2 == 0) goto L96
            L75:
                android.text.SpannableString r2 = new android.text.SpannableString
                r2.<init>(r3)
                r4 = r1
                android.text.SpannedString r4 = (android.text.SpannedString) r4
                r5 = 0
                int r6 = r3.length()
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r1 = r2
                android.text.SpannableString r1 = (android.text.SpannableString) r1
                r9 = 0
                r8 = r2
                android.text.TextUtils.copySpansFrom(r4, r5, r6, r7, r8, r9)
                int r1 = com.netflix.mediaclient.ui.profiles.ProfileEducationTutorial.f.c
                int r1 = r1 + 53
                int r3 = r1 % 128
                com.netflix.mediaclient.ui.profiles.ProfileEducationTutorial.f.a = r3
                int r1 = r1 % r11
                r3 = r2
            L96:
                r0.setText(r3)
            L99:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.profiles.ProfileEducationTutorial.f.onAnimationEnd(android.view.animation.Animation):void");
        }

        private void d(String str, Object[] objArr) {
            byte[] decode = Base64.decode(str, 0);
            byte[] bArr = new byte[decode.length];
            for (int i = 0; i < decode.length; i++) {
                bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$33);
            }
            objArr[0] = new String(bArr, StandardCharsets.UTF_8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends Abstractanimation.Animation$AnimationListenerC9916yx {
        i() {
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            cKC ckc = ProfileEducationTutorial.this.f;
            C1204Sr c1204Sr = ckc != null ? ckc.k : null;
            if (c1204Sr == null) {
                return;
            }
            c1204Sr.setVisibility(0);
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            cKC ckc = ProfileEducationTutorial.this.f;
            C1204Sr c1204Sr = ckc != null ? ckc.k : null;
            if (c1204Sr == null) {
                return;
            }
            c1204Sr.setVisibility(8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends Abstractanimation.Animation$AnimationListenerC9916yx {
        h() {
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            cKC ckc = ProfileEducationTutorial.this.f;
            C1204Sr c1204Sr = ckc != null ? ckc.j : null;
            if (c1204Sr == null) {
                return;
            }
            c1204Sr.setVisibility(0);
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            cKC ckc = ProfileEducationTutorial.this.f;
            C1204Sr c1204Sr = ckc != null ? ckc.j : null;
            if (c1204Sr == null) {
                return;
            }
            c1204Sr.setVisibility(8);
        }
    }

    private final void c(View view, Abstractanimation.Animation$AnimationListenerC9916yx r6, float f2) {
        AnimationSet animationSet = new AnimationSet(true);
        if (this.t) {
            f2 = -f2;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, f2, 0.0f, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        animationSet.setAnimationListener(r6);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setInterpolator(i);
        animationSet.setDuration(500L);
        view.startAnimation(animationSet);
    }

    private final void b(View view, Abstractanimation.Animation$AnimationListenerC9916yx r6, float f2) {
        AnimationSet animationSet = new AnimationSet(true);
        if (this.t) {
            f2 = -f2;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(f2, 0.0f, 0.0f, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        animationSet.setAnimationListener(r6);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setInterpolator(j);
        animationSet.setDuration(500L);
        view.startAnimation(animationSet);
    }

    private final void j() {
        int i2 = e.a[h.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, n().a().getHeight());
            translateAnimation.setAnimationListener(new o());
            translateAnimation.setDuration(400L);
            n().a().startAnimation(translateAnimation);
            return;
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.2f, 1.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(200L);
        Interpolator interpolator = e;
        scaleAnimation.setInterpolator(interpolator);
        n().b.startAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setAnimationListener(new j());
        alphaAnimation.setDuration(200L);
        alphaAnimation.setInterpolator(interpolator);
        n().a().startAnimation(alphaAnimation);
    }

    /* loaded from: classes4.dex */
    public static final class j extends Abstractanimation.Animation$AnimationListenerC9916yx {
        j() {
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            b bVar = ProfileEducationTutorial.this.a;
            if (bVar != null) {
                bVar.b(ProfileEducationTutorial.h == Companion.DismissMode.d);
            }
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            cKC ckc = ProfileEducationTutorial.this.f;
            ConstraintLayout a = ckc != null ? ckc.a() : null;
            if (a != null) {
                a.setVisibility(8);
            }
            ProfileEducationTutorial.this.c(false);
            ProfileEducationTutorial profileEducationTutorial = ProfileEducationTutorial.this;
            profileEducationTutorial.c = false;
            b bVar = profileEducationTutorial.a;
            if (bVar != null) {
                bVar.e();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class o extends Abstractanimation.Animation$AnimationListenerC9916yx {
        o() {
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            cKC ckc = ProfileEducationTutorial.this.f;
            ConstraintLayout a = ckc != null ? ckc.a() : null;
            if (a != null) {
                a.setVisibility(8);
            }
            ProfileEducationTutorial.this.c(false);
            ProfileEducationTutorial profileEducationTutorial = ProfileEducationTutorial.this;
            profileEducationTutorial.c = false;
            b bVar = profileEducationTutorial.a;
            if (bVar != null) {
                bVar.b(ProfileEducationTutorial.h == Companion.DismissMode.d);
            }
            b bVar2 = ProfileEducationTutorial.this.a;
            if (bVar2 != null) {
                bVar2.e();
            }
        }
    }

    public final void b() {
        if (this.l < this.p.size() - 1) {
            a(this, this.l + 1, false, 2, null);
        }
    }

    public final void e() {
        int i2 = this.l;
        if (i2 > 0) {
            a(this, i2 - 1, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        FirstTimeProfileEducationFlexEventType.e.c(FirstTimeProfileEducationFlexEventType.b, FirstTimeProfileEducationFlexEventType.g, null, null, 6, null);
    }

    private final void o() {
        FirstTimeProfileEducationFlexEventType.e.c(FirstTimeProfileEducationFlexEventType.b, FirstTimeProfileEducationFlexEventType.h, null, null, 6, null);
    }

    private final void m() {
        Map<String, Integer> d2;
        HashMap hashMap = new HashMap();
        hashMap.put("current_slide", String.valueOf(this.l));
        FirstTimeProfileEducationFlexEventType.e eVar = FirstTimeProfileEducationFlexEventType.b;
        FirstTimeProfileEducationFlexEventType firstTimeProfileEducationFlexEventType = FirstTimeProfileEducationFlexEventType.i;
        d2 = dqE.d();
        eVar.e(firstTimeProfileEducationFlexEventType, d2, hashMap);
    }

    /* loaded from: classes4.dex */
    public final class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            Map<String, Integer> d;
            C8632dsu.c((Object) motionEvent2, "");
            if (motionEvent != null) {
                ProfileEducationTutorial profileEducationTutorial = ProfileEducationTutorial.this;
                float x = motionEvent2.getX() - motionEvent.getX();
                if (Math.abs(x) <= 50.0f || Math.abs(f) <= 25.0f) {
                    return true;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("current_slide", String.valueOf(profileEducationTutorial.l));
                if (x > 0.0f) {
                    if (profileEducationTutorial.t) {
                        profileEducationTutorial.b();
                        hashMap.put("direction", "next");
                    } else {
                        profileEducationTutorial.e();
                        hashMap.put("direction", "previous");
                    }
                } else if (profileEducationTutorial.t) {
                    profileEducationTutorial.e();
                    hashMap.put("direction", "previous");
                } else {
                    profileEducationTutorial.b();
                    hashMap.put("direction", "next");
                }
                FirstTimeProfileEducationFlexEventType.e eVar = FirstTimeProfileEducationFlexEventType.b;
                FirstTimeProfileEducationFlexEventType firstTimeProfileEducationFlexEventType = FirstTimeProfileEducationFlexEventType.f;
                d = dqE.d();
                eVar.e(firstTimeProfileEducationFlexEventType, d, hashMap);
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a {
        private final int a;
        private final int b;
        private final boolean c;
        private final boolean d;
        private final int e;
        private final int f;
        private final int g;
        private final int i;
        private final int j;

        public final boolean a() {
            return this.d;
        }

        public final int b() {
            return this.a;
        }

        public final int c() {
            return this.b;
        }

        public final boolean d() {
            return this.c;
        }

        public final int e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.j == aVar.j && this.f == aVar.f && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.g == aVar.g && this.b == aVar.b && this.i == aVar.i && this.a == aVar.a;
            }
            return false;
        }

        public final int f() {
            return this.g;
        }

        public final int g() {
            return this.i;
        }

        public final int h() {
            return this.j;
        }

        public int hashCode() {
            return (((((((((((((((Integer.hashCode(this.j) * 31) + Integer.hashCode(this.f)) * 31) + Boolean.hashCode(this.c)) * 31) + Boolean.hashCode(this.d)) * 31) + Integer.hashCode(this.e)) * 31) + Integer.hashCode(this.g)) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.i)) * 31) + Integer.hashCode(this.a);
        }

        public final int i() {
            return this.f;
        }

        public String toString() {
            int i = this.j;
            int i2 = this.f;
            boolean z = this.c;
            boolean z2 = this.d;
            int i3 = this.e;
            int i4 = this.g;
            int i5 = this.b;
            int i6 = this.i;
            int i7 = this.a;
            return "ProfileEducationSlide(titleRes=" + i + ", subtitleRes=" + i2 + ", hasNextButton=" + z + ", hasSkipButton=" + z2 + ", nextButtonRes=" + i3 + ", skipButtonRes=" + i4 + ", imageRes=" + i5 + ", startKeyframe=" + i6 + ", endKeyframe=" + i7 + ")";
        }

        public a(int i, int i2, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7) {
            this.j = i;
            this.f = i2;
            this.c = z;
            this.d = z2;
            this.e = i3;
            this.g = i4;
            this.b = i5;
            this.i = i6;
            this.a = i7;
        }
    }

    private void u(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$4223);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
