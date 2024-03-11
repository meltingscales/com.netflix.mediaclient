package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.servicemgr.PlaybackExperience;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerControlsType;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.mediaclient.util.PlayContext;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.List;
import o.AbstractC5100bsQ;
import o.AbstractC6719cic;
import o.AbstractC6729cim;
import o.C4355bcu;
import o.C5208buS;
import o.C6728cil;
import o.C6733ciq;
import o.C8632dsu;
import o.InterfaceC4360bcz;
import o.TN;
import o.dpR;
import o.drX;

/* renamed from: o.cim  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6729cim extends AbstractC3336ax<b> {
    public static final d b = new d(null);
    private String A;
    private String B;
    private C6728cil C;
    private InterfaceC5085bsB D;
    private boolean G;
    private int H;
    private C9686vA I;
    private String K;
    private String L;
    private CompositeDisposable N;
    private String O;
    private String P;
    private Boolean S;
    private Integer c;
    public C9935zP d;
    public InterfaceC6718cib g;
    public PlayContext h;
    public String i;
    public MiniPlayerVideoGroupViewModel j;
    private CompositeDisposable k;
    private String m;
    private long n;

    /* renamed from: o  reason: collision with root package name */
    private int f13735o;
    private boolean p;
    private String q;
    private String r;
    private Integer s;
    private Float t;
    private int v;
    private int x;
    private InterfaceC3826bMb z;
    private VideoType M = VideoType.UNKNOWN;
    private boolean F = true;
    private AppView l = AppView.UNKNOWN;
    private String E = "";

    /* renamed from: J  reason: collision with root package name */
    private boolean f13734J = true;
    private MiniPlayerControlsType u = MiniPlayerControlsType.e;
    private drX<? super View, ? super Boolean, dpR> w = new drX<View, Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoViewModel$onScreenOrientationChanged$1
        public final void c(View view, boolean z) {
            C8632dsu.c((Object) view, "");
        }

        @Override // o.drX
        public /* synthetic */ dpR invoke(View view, Boolean bool) {
            c(view, bool.booleanValue());
            return dpR.c;
        }
    };
    private int f = -1;
    private final drM<AbstractC6719cic, dpR> y = new drM<AbstractC6719cic, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoViewModel$onPlayerStateEvent$1
        {
            super(1);
        }

        @Override // o.drM
        public /* synthetic */ dpR invoke(AbstractC6719cic abstractC6719cic) {
            a(abstractC6719cic);
            return dpR.c;
        }

        public final void a(AbstractC6719cic abstractC6719cic) {
            C8632dsu.c((Object) abstractC6719cic, "");
            C6728cil E = AbstractC6729cim.this.E();
            if (E != null) {
                AbstractC6729cim abstractC6729cim = AbstractC6729cim.this;
                if (abstractC6719cic instanceof AbstractC6719cic.e.c) {
                    if (((AbstractC6719cic.e.c) abstractC6719cic).d() == abstractC6729cim.A()) {
                        AbstractC6729cim.b.getLogTag();
                        E.c(true);
                        return;
                    }
                    AbstractC6729cim.b.getLogTag();
                    E.c(false);
                } else if (abstractC6719cic instanceof AbstractC6719cic.e.a) {
                    if (((AbstractC6719cic.e.a) abstractC6719cic).a() == abstractC6729cim.A()) {
                        AbstractC6729cim.b.getLogTag();
                        E.a(true);
                        return;
                    }
                    AbstractC6729cim.b.getLogTag();
                    E.a(false);
                } else if (abstractC6719cic instanceof AbstractC6719cic.e.C0117e) {
                    AbstractC6719cic.e.C0117e c0117e = (AbstractC6719cic.e.C0117e) abstractC6719cic;
                    if (c0117e.d() == abstractC6729cim.A()) {
                        AbstractC6729cim.b.getLogTag();
                        E.d(c0117e.c());
                    }
                } else if (abstractC6719cic instanceof AbstractC6719cic.e.b) {
                    AbstractC6719cic.e.b bVar = (AbstractC6719cic.e.b) abstractC6719cic;
                    if (bVar.b() == abstractC6729cim.A()) {
                        AbstractC6729cim.b.getLogTag();
                        E.e(bVar.c());
                    }
                }
            }
        }
    };

    public final int A() {
        return this.v;
    }

    public final String B() {
        return this.B;
    }

    public final drX<View, Boolean, dpR> D() {
        return this.w;
    }

    public final C6728cil E() {
        return this.C;
    }

    public final InterfaceC3826bMb F() {
        return this.z;
    }

    public final String G() {
        return this.A;
    }

    public final C9686vA J() {
        return this.I;
    }

    public final boolean L() {
        return this.G;
    }

    public final String M() {
        return this.E;
    }

    public final int N() {
        return this.H;
    }

    public final String O() {
        return this.L;
    }

    public final String P() {
        return this.K;
    }

    public final VideoType Q() {
        return this.M;
    }

    public final boolean R() {
        return this.f13734J;
    }

    public final boolean S() {
        return this.F;
    }

    public final String T() {
        return this.P;
    }

    public final Boolean U() {
        return this.S;
    }

    public final String W() {
        return this.O;
    }

    public final void a(long j) {
        this.n = j;
    }

    public final void a_(VideoType videoType) {
        C8632dsu.c((Object) videoType, "");
        this.M = videoType;
    }

    public final void a_(MiniPlayerControlsType miniPlayerControlsType) {
        C8632dsu.c((Object) miniPlayerControlsType, "");
        this.u = miniPlayerControlsType;
    }

    public final void a_(InterfaceC3826bMb interfaceC3826bMb) {
        this.z = interfaceC3826bMb;
    }

    public final AppView aj_() {
        return this.l;
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i;
    }

    public final void b(drX<? super View, ? super Boolean, dpR> drx) {
        C8632dsu.c((Object) drx, "");
        this.w = drx;
    }

    public final void b_(Float f) {
        this.t = f;
    }

    public final void c(Boolean bool) {
        this.S = bool;
    }

    public final void c(C9686vA c9686vA) {
        this.I = c9686vA;
    }

    public final void c_(AppView appView) {
        C8632dsu.c((Object) appView, "");
        this.l = appView;
    }

    public final void h(boolean z) {
        this.p = z;
    }

    public final void i(boolean z) {
        this.F = z;
    }

    public final void j(boolean z) {
        this.f13734J = z;
    }

    public final Integer k() {
        return this.c;
    }

    public final int l() {
        return this.f;
    }

    public final void l(int i) {
        this.f13735o = i;
    }

    public final void m(int i) {
        this.v = i;
    }

    public final void m(String str) {
        this.q = str;
    }

    public final void n(int i) {
        this.f = i;
    }

    public final void n(String str) {
        this.m = str;
    }

    public final void o(String str) {
        this.r = str;
    }

    public final int p() {
        return this.f13735o;
    }

    public final void p(String str) {
        this.A = str;
    }

    public final void q(String str) {
        this.K = str;
    }

    public final boolean q() {
        return this.p;
    }

    public final long r() {
        return this.n;
    }

    public final void r(int i) {
        this.H = i;
    }

    public final void r(String str) {
        this.B = str;
    }

    public final void s(int i) {
        this.x = i;
    }

    public final void s(String str) {
        this.L = str;
    }

    public final String t() {
        return this.m;
    }

    public final void t(String str) {
        this.P = str;
    }

    public final Float u() {
        return this.t;
    }

    public final Integer v() {
        return this.s;
    }

    public final String w() {
        return this.q;
    }

    public final MiniPlayerControlsType x() {
        return this.u;
    }

    public final void x(String str) {
        this.O = str;
    }

    public final String y() {
        return this.r;
    }

    public final int z() {
        return this.x;
    }

    @Override // o.AbstractC3336ax
    public /* synthetic */ void a(b bVar, AbstractC3073as abstractC3073as) {
        e(bVar, (AbstractC3073as<?>) abstractC3073as);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public /* synthetic */ void c(Object obj, AbstractC3073as abstractC3073as) {
        e((b) obj, (AbstractC3073as<?>) abstractC3073as);
    }

    /* renamed from: o.cim$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("MiniPlayerVideoViewModel");
        }
    }

    public final PlayContext C() {
        PlayContext playContext = this.h;
        if (playContext != null) {
            return playContext;
        }
        C8632dsu.d("");
        return null;
    }

    public final MiniPlayerVideoGroupViewModel I() {
        MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel = this.j;
        if (miniPlayerVideoGroupViewModel != null) {
            return miniPlayerVideoGroupViewModel;
        }
        C8632dsu.d("");
        return null;
    }

    public final String K() {
        String str = this.i;
        if (str != null) {
            return str;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC6718cib H() {
        InterfaceC6718cib interfaceC6718cib = this.g;
        if (interfaceC6718cib != null) {
            return interfaceC6718cib;
        }
        C8632dsu.d("");
        return null;
    }

    public final C9935zP s() {
        C9935zP c9935zP = this.d;
        if (c9935zP != null) {
            return c9935zP;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return C6730cin.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public b b(ViewParent viewParent) {
        C8632dsu.c((Object) viewParent, "");
        return new b(s(), this.p, this.w, this.u, this.B);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void d(AbstractC6729cim abstractC6729cim, b bVar, List list, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindVideoViewHolder");
        }
        if ((i & 2) != 0) {
            list = null;
        }
        abstractC6729cim.d(bVar, (List<? extends Object>) list);
    }

    private final void d(b bVar, List<? extends Object> list) {
        MiniPlayerVideoGroupViewModel I = I();
        InterfaceC6718cib H = H();
        InterfaceC3826bMb interfaceC3826bMb = this.z;
        int i = this.v;
        int i2 = this.x;
        PlayContext C = C();
        String str = this.A;
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        String K = K();
        int i3 = this.H;
        String str2 = this.K;
        String str3 = this.O;
        String str4 = this.m;
        VideoType videoType = this.M;
        String str5 = this.r;
        Integer num = this.s;
        String str6 = this.q;
        boolean z = this.G;
        boolean z2 = this.F;
        AppView appView = this.l;
        if (appView == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        String str7 = this.P;
        if (str7 != null) {
            C6728cil c6728cil = new C6728cil(i, i2, C, str, K, i3, str2, str3, str4, videoType, str5, num, str6, z, z2, appView, str7, this.L, this.f13734J, this.f, this.S, this.n);
            this.C = c6728cil;
            if (I().d() && C8153dex.e()) {
                o();
            }
            CompositeDisposable compositeDisposable = new CompositeDisposable();
            compositeDisposable.add(SubscribersKt.subscribeBy$default(s().d(AbstractC6719cic.class), (drM) null, (drO) null, this.y, 3, (Object) null));
            this.N = compositeDisposable;
            dpR dpr = dpR.c;
            bVar.e(I, H, interfaceC3826bMb, c6728cil, this.c, list, this.E, this.I, this.f13735o);
            Float f = this.t;
            if (f != null) {
                bVar.c().d().setAspectRatio(Float.valueOf(f.floatValue()));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        d(this, bVar, (List) null, 2, (Object) null);
    }

    public void e(b bVar, AbstractC3073as<?> abstractC3073as) {
        C8632dsu.c((Object) bVar, "");
        C8632dsu.c((Object) abstractC3073as, "");
        if (C8632dsu.c(this, abstractC3073as)) {
            return;
        }
        d(this, bVar, (List) null, 2, (Object) null);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void d(b bVar, List<Object> list) {
        C8632dsu.c((Object) bVar, "");
        C8632dsu.c((Object) list, "");
        d(bVar, (List<? extends Object>) list);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        if (this.C != null) {
            this.C = null;
        }
        CompositeDisposable compositeDisposable = this.N;
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
            this.N = null;
        }
        CompositeDisposable compositeDisposable2 = this.k;
        if (compositeDisposable2 != null) {
            compositeDisposable2.dispose();
            this.k = null;
        }
        if (this.t != null) {
            bVar.c().d().setAspectRatio(null);
        }
        bVar.e();
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public boolean b(b bVar) {
        C8632dsu.c((Object) bVar, "");
        return bVar.b();
    }

    @Override // o.AbstractC3336ax
    /* renamed from: i */
    public void a(b bVar) {
        C8632dsu.c((Object) bVar, "");
        bVar.a();
    }

    @Override // o.AbstractC3336ax
    /* renamed from: j */
    public void d(b bVar) {
        C8632dsu.c((Object) bVar, "");
        bVar.d();
    }

    /* renamed from: o.cim$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3179au {
        private C9935zP a;
        private final MiniPlayerControlsType b;
        private final boolean c;
        private final String d;
        private final drX<View, Boolean, dpR> e;
        private C6733ciq.e g;

        /* JADX WARN: Multi-variable type inference failed */
        public b(C9935zP c9935zP, boolean z, drX<? super View, ? super Boolean, dpR> drx, MiniPlayerControlsType miniPlayerControlsType, String str) {
            C8632dsu.c((Object) c9935zP, "");
            C8632dsu.c((Object) drx, "");
            C8632dsu.c((Object) miniPlayerControlsType, "");
            this.a = c9935zP;
            this.c = z;
            this.e = drx;
            this.b = miniPlayerControlsType;
            this.d = str;
        }

        public final C6733ciq.e c() {
            C6733ciq.e eVar = this.g;
            if (eVar != null) {
                return eVar;
            }
            C8632dsu.d("");
            return null;
        }

        @Override // o.AbstractC3179au
        public void e(View view) {
            C8632dsu.c((Object) view, "");
            C6733ciq.e eVar = new C6733ciq.e(view, this.a, this.c, this.b, this.d);
            eVar.c(new drX<View, Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoViewModel$Holder$bindView$1$1
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(View view2, Boolean bool) {
                    a(view2, bool.booleanValue());
                    return dpR.c;
                }

                public final void a(View view2, boolean z) {
                    drX drx;
                    C8632dsu.c((Object) view2, "");
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = view2.getResources().getDisplayMetrics().heightPixels;
                            view2.setLayoutParams(layoutParams);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.height = -2;
                            view2.setLayoutParams(layoutParams2);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    }
                    drx = AbstractC6729cim.b.this.e;
                    drx.invoke(view2, Boolean.valueOf(z));
                }
            });
            this.g = eVar;
        }

        public final void e(MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel, InterfaceC6718cib interfaceC6718cib, InterfaceC3826bMb interfaceC3826bMb, C6728cil c6728cil, Integer num, List<? extends Object> list, String str, C9686vA c9686vA, int i) {
            C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
            C8632dsu.c((Object) interfaceC6718cib, "");
            C8632dsu.c((Object) c6728cil, "");
            c().b(miniPlayerVideoGroupViewModel, interfaceC6718cib, interfaceC3826bMb, c6728cil.s(), c6728cil, num, list, str, c9686vA, i);
        }

        public final void g() {
            c().d(false);
        }

        public static /* synthetic */ void a(b bVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            bVar.d(z);
        }

        public final void d(boolean z) {
            c().e(false, z);
        }

        public final void e() {
            c().h();
        }

        public final boolean b() {
            return c().b();
        }

        public final void a() {
            c().c();
        }

        public final void d() {
            c().i();
        }
    }

    private final void o() {
        CompositeDisposable compositeDisposable = this.k;
        if (compositeDisposable != null) {
            compositeDisposable.clear();
        }
        CompositeDisposable compositeDisposable2 = new CompositeDisposable();
        this.k = compositeDisposable2;
        Observable<AbstractC5100bsQ> take = I().h().takeUntil(s().d()).take(1L);
        final drM<AbstractC5100bsQ, dpR> drm = new drM<AbstractC5100bsQ, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoViewModel$onVideoGroup$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC5100bsQ abstractC5100bsQ) {
                e(abstractC5100bsQ);
                return dpR.c;
            }

            public final void e(AbstractC5100bsQ abstractC5100bsQ) {
                if (abstractC5100bsQ == null || !abstractC5100bsQ.d() || TN.a.d() == null) {
                    return;
                }
                AbstractC6729cim.d dVar = AbstractC6729cim.b;
                C5208buS e = AbstractC6729cim.this.I().b(AbstractC6729cim.this.K()).e();
                AbstractC6729cim abstractC6729cim = AbstractC6729cim.this;
                InterfaceC4360bcz a = InterfaceC4360bcz.b.a();
                PlaybackExperience g = AbstractC6729cim.this.I().g();
                PlayContext C = AbstractC6729cim.this.C();
                String b2 = e.b();
                String G = AbstractC6729cim.this.G();
                if (G != null) {
                    abstractC6729cim.D = a.c(new C4355bcu(-1L, abstractC5100bsQ, g, e, C, new PlaylistTimestamp(b2, G, 0L), false, null, null));
                    return;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        };
        compositeDisposable2.add(take.subscribe(new Consumer() { // from class: o.cis
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC6729cim.e(drM.this, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }
}
