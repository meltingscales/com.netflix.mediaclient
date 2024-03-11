package com.netflix.mediaclient.ui.games.impl.gdp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.GameDetails;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment;
import com.netflix.mediaclient.ui.games.impl.gdp.installInterstitial.InstallInterstitialFragment;
import com.netflix.mediaclient.ui.lomo.qddp.QuickDrawDialogFrag;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Map;
import javax.inject.Inject;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC3910bPe;
import o.AbstractC6719cic;
import o.AbstractC8266dhD;
import o.AbstractC8882fB;
import o.AbstractC8918fl;
import o.C1045Mp;
import o.C1596aHd;
import o.C1619aI;
import o.C3895bOq;
import o.C3908bPc;
import o.C3909bPd;
import o.C3912bPg;
import o.C3947bQo;
import o.C3952bQt;
import o.C3981bRv;
import o.C6652chO;
import o.C6717cia;
import o.C8054ddD;
import o.C8067ddQ;
import o.C8126deW;
import o.C8150deu;
import o.C8171dfO;
import o.C8627dsp;
import o.C8632dsu;
import o.C8903fW;
import o.C8925fs;
import o.C8927fu;
import o.C8930fx;
import o.C8931fy;
import o.C8932fz;
import o.C8971gl;
import o.C8980gu;
import o.C9726vo;
import o.C9737vz;
import o.C9935zP;
import o.InterfaceC1078Nw;
import o.InterfaceC1126Pr;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC3643bFl;
import o.InterfaceC3977bRr;
import o.InterfaceC5185btw;
import o.InterfaceC5283bvo;
import o.InterfaceC8554dpx;
import o.InterfaceC8660dtv;
import o.InterfaceC8890fJ;
import o.InterfaceC8976gq;
import o.bLI;
import o.bLW;
import o.bNK;
import o.bNS;
import o.bOI;
import o.bPG;
import o.bPV;
import o.bPW;
import o.bPX;
import o.bPY;
import o.dpB;
import o.dpD;
import o.dpR;
import o.dqD;
import o.dqE;
import o.drI;
import o.drM;
import o.drO;
import o.drX;
import o.dsA;
import o.dtC;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class GdpFragment extends bPW {
    @Inject
    public Lazy<bLW> billBoardAutoPlay;
    @Inject
    public bPG epoxyControllerFactory;
    @Inject
    public C9935zP eventBusFactory;
    @Inject
    public bNS gameInstallation;
    @Inject
    public C3909bPd gdpCl;
    private final AppView j;
    private final InterfaceC8554dpx k;
    private boolean l;
    private final CompositeDisposable m;
    @Inject
    public Lazy<MiniPlayerVideoGroupViewModel> miniPlayerViewModelField;
    private final InterfaceC8554dpx n;

    /* renamed from: o  reason: collision with root package name */
    private InterfaceC3977bRr f13270o;
    private final InterfaceC8554dpx p;
    private final e q;
    private final InterfaceC8554dpx r;
    private final boolean s;
    @Inject
    public InterfaceC1126Pr sharing;
    private bPX t;
    @Inject
    public TrackingInfoHolder trackingInfoHolder;
    @Inject
    public Lazy<bLW> trailerAutoPlay;
    private bLI v;
    @Inject
    public C1619aI visibilityTracker;
    private int x;
    private bOI y;
    static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(GdpFragment.class, "gdpViewModel", "getGdpViewModel()Lcom/netflix/mediaclient/ui/games/impl/gdp/mvrx/GdpViewModel;", 0))};
    public static final d b = new d(null);

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public AppView bh_() {
        return this.j;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bo_() {
        return this.s;
    }

    /* loaded from: classes4.dex */
    public static final class a extends AbstractC8882fB<GdpFragment, C3952bQt> {
        final /* synthetic */ InterfaceC8660dtv a;
        final /* synthetic */ drM c;
        final /* synthetic */ boolean d;
        final /* synthetic */ InterfaceC8660dtv e;

        public a(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.e = interfaceC8660dtv;
            this.d = z;
            this.c = drm;
            this.a = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: d */
        public InterfaceC8554dpx<C3952bQt> c(GdpFragment gdpFragment, dtC<?> dtc) {
            C8632dsu.c((Object) gdpFragment, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.e;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.a;
            return d.d(gdpFragment, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment$special$$inlined$fragmentViewModel$default$2$1
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: a */
                public final String invoke() {
                    String name = drI.e(InterfaceC8660dtv.this).getName();
                    C8632dsu.a(name, "");
                    return name;
                }
            }, dsA.a(C3952bQt.c.class), this.d, this.c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("GdpFragment");
        }

        public final GdpFragment e(String str, TrackingInfoHolder trackingInfoHolder) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            GdpFragment gdpFragment = new GdpFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("tracking_info_holder", trackingInfoHolder);
            bundle.putString("extra_game_id", str);
            Bundle bundle2 = new Bundle();
            bundle2.putString("game_id", str);
            bundle.putBundle("mavericks:arg", bundle2);
            gdpFragment.setArguments(bundle);
            return gdpFragment;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment$orientationBehaviour$2] */
    public GdpFragment() {
        InterfaceC8554dpx b2;
        InterfaceC8554dpx b3;
        InterfaceC8554dpx b4;
        b2 = dpB.b(new drO<MiniPlayerVideoGroupViewModel>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment$miniPlayerViewModel$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final MiniPlayerVideoGroupViewModel invoke() {
                return GdpFragment.this.J().get();
            }
        });
        this.r = b2;
        final InterfaceC8660dtv a2 = dsA.a(C3952bQt.class);
        this.n = new a(a2, false, new drM<InterfaceC8890fJ<C3952bQt, C3952bQt.c>, C3952bQt>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment$special$$inlined$fragmentViewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.bQt, o.fS] */
            @Override // o.drM
            /* renamed from: d */
            public final C3952bQt invoke(InterfaceC8890fJ<C3952bQt, C3952bQt.c> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a2).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, C3952bQt.c.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a2).c(this, e[0]);
        b3 = dpB.b(new drO<GdpEpoxyController>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment$epoxyController$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final GdpEpoxyController invoke() {
                return GdpFragment.this.I().a();
            }
        });
        this.k = b3;
        this.m = new CompositeDisposable();
        this.q = new e(new drM<Activity, RecyclerView>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment$orientationBehaviour$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final RecyclerView invoke(Activity activity) {
                C8632dsu.c((Object) activity, "");
                bLI bli = GdpFragment.this.v;
                if (bli == null) {
                    C8632dsu.d("");
                    return null;
                }
                return bli;
            }
        });
        b4 = dpB.b(LazyThreadSafetyMode.e, new drO<C6717cia>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment$playerOrientationManager$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final C6717cia invoke() {
                GdpFragment.e eVar;
                if (C8150deu.h() || C8067ddQ.c()) {
                    return null;
                }
                C6652chO c6652chO = new C6652chO(GdpFragment.this.bx_());
                eVar = GdpFragment.this.q;
                return new C6717cia(c6652chO, eVar);
            }
        });
        this.p = b4;
        this.j = AppView.gameDetails;
        this.s = true;
    }

    public final C1619aI O() {
        C1619aI c1619aI = this.visibilityTracker;
        if (c1619aI != null) {
            return c1619aI;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<bLW> P() {
        Lazy<bLW> lazy = this.trailerAutoPlay;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<bLW> F() {
        Lazy<bLW> lazy = this.billBoardAutoPlay;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final C3909bPd M() {
        C3909bPd c3909bPd = this.gdpCl;
        if (c3909bPd != null) {
            return c3909bPd;
        }
        C8632dsu.d("");
        return null;
    }

    public final TrackingInfoHolder R() {
        TrackingInfoHolder trackingInfoHolder = this.trackingInfoHolder;
        if (trackingInfoHolder != null) {
            return trackingInfoHolder;
        }
        C8632dsu.d("");
        return null;
    }

    public final C9935zP G() {
        C9935zP c9935zP = this.eventBusFactory;
        if (c9935zP != null) {
            return c9935zP;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<MiniPlayerVideoGroupViewModel> J() {
        Lazy<MiniPlayerVideoGroupViewModel> lazy = this.miniPlayerViewModelField;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MiniPlayerVideoGroupViewModel X() {
        return (MiniPlayerVideoGroupViewModel) this.r.getValue();
    }

    public final InterfaceC1126Pr L() {
        InterfaceC1126Pr interfaceC1126Pr = this.sharing;
        if (interfaceC1126Pr != null) {
            return interfaceC1126Pr;
        }
        C8632dsu.d("");
        return null;
    }

    public final bPG I() {
        bPG bpg = this.epoxyControllerFactory;
        if (bpg != null) {
            return bpg;
        }
        C8632dsu.d("");
        return null;
    }

    public final bNS K() {
        bNS bns = this.gameInstallation;
        if (bns != null) {
            return bns;
        }
        C8632dsu.d("");
        return null;
    }

    public final C3952bQt N() {
        return (C3952bQt) this.n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GdpEpoxyController Q() {
        return (GdpEpoxyController) this.k.getValue();
    }

    private final bOI U() {
        bOI boi = this.y;
        C8632dsu.d(boi);
        return boi;
    }

    /* loaded from: classes4.dex */
    public static final class e extends bPV {
        e(GdpFragment$orientationBehaviour$2 gdpFragment$orientationBehaviour$2) {
            super(gdpFragment$orientationBehaviour$2);
        }

        @Override // o.bPV, o.C6717cia.a
        public void e(Fragment fragment, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel) {
            C8632dsu.c((Object) fragment, "");
            C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
            GdpFragment.this.X().b(Integer.valueOf(GdpFragment.this.V()));
            super.e(fragment, miniPlayerVideoGroupViewModel);
            c(false);
        }

        @Override // o.bPV, o.C6717cia.a
        public void b(Fragment fragment, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel) {
            C8632dsu.c((Object) fragment, "");
            C8632dsu.c((Object) miniPlayerVideoGroupViewModel, "");
            c(true);
            super.b(fragment, miniPlayerVideoGroupViewModel);
        }

        private final void c(boolean z) {
            bLI bli = GdpFragment.this.v;
            bLI bli2 = null;
            if (bli == null) {
                C8632dsu.d("");
                bli = null;
            }
            bli.setScrollingLocked(z);
            bLI bli3 = GdpFragment.this.v;
            if (bli3 == null) {
                C8632dsu.d("");
            } else {
                bli2 = bli3;
            }
            C3947bQo c3947bQo = (C3947bQo) bli2.findViewById(R.g.ca);
            if (c3947bQo != null) {
                c3947bQo.setScrollingLocked(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6717cia T() {
        return (C6717cia) this.p.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int V() {
        bLI bli = this.v;
        bLI bli2 = null;
        if (bli == null) {
            C8632dsu.d("");
            bli = null;
        }
        C3947bQo c3947bQo = (C3947bQo) bli.findViewById(R.g.ca);
        if (c3947bQo == null) {
            return -1;
        }
        bLI bli3 = this.v;
        if (bli3 == null) {
            C8632dsu.d("");
            bli3 = null;
        }
        View findContainingItemView = bli3.findContainingItemView(c3947bQo);
        if (findContainingItemView == null) {
            return -1;
        }
        bLI bli4 = this.v;
        if (bli4 == null) {
            C8632dsu.d("");
        } else {
            bli2 = bli4;
        }
        return bli2.getChildLayoutPosition(findContainingItemView);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.InterfaceC5091bsH
    public void onManagerReady(ServiceManager serviceManager, Status status) {
        C8632dsu.c((Object) serviceManager, "");
        C8632dsu.c((Object) status, "");
        super.onManagerReady(serviceManager, status);
        InterfaceC5283bvo a2 = C8126deW.a(by_());
        if (a2 != null) {
            Context requireContext = requireContext();
            C8632dsu.a(requireContext, "");
            this.f13270o = C3981bRv.a(requireContext, a2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        View inflate = layoutInflater.inflate(C3895bOq.c.j, viewGroup, false);
        C8632dsu.a(inflate, "");
        return inflate;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Map b2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        this.y = bOI.c(view);
        bLI bli = U().d;
        C8632dsu.a(bli, "");
        this.v = bli;
        if (bli == null) {
            C8632dsu.d("");
            bli = null;
        }
        if (!(bli instanceof EpoxyRecyclerView)) {
            bli = null;
        }
        if (bli != null) {
            bli.setController(Q());
            bli.setLayoutManager(new GridLayoutManager(bli.getContext(), 3, 1, false));
        }
        bLI bli2 = this.v;
        if (bli2 == null) {
            C8632dsu.d("");
            bli2 = null;
        }
        bli2.addOnScrollListener(new c());
        C3952bQt.e(N(), false, 1, (Object) null);
        aa();
        if (C8126deW.a()) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            b2 = dqD.b(dpD.a("appView", String.valueOf(bh_())));
            k = dqE.k(b2);
            C1596aHd c1596aHd = new C1596aHd("GUI-373 Game is shown to kids profile.", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b3 = c1596aHd.b();
                if (b3 != null) {
                    c1596aHd.a(errorType.c() + " " + b3);
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

    /* loaded from: classes4.dex */
    public static final class c extends RecyclerView.OnScrollListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C8632dsu.c((Object) recyclerView, "");
        }

        c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            NetflixActionBar netflixActionBar;
            C8632dsu.c((Object) recyclerView, "");
            NetflixActivity bj_ = GdpFragment.this.bj_();
            if (bj_ == null || (netflixActionBar = bj_.getNetflixActionBar()) == null) {
                return;
            }
            netflixActionBar.e(true, GdpFragment.this.W());
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(final Configuration configuration) {
        C8632dsu.c((Object) configuration, "");
        super.onConfigurationChanged(configuration);
        X().d((Integer) 0);
        C8980gu.c(N(), new drM<C3952bQt.c, dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment$onConfigurationChanged$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C3952bQt.c cVar) {
                b(cVar);
                return dpR.c;
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
                r4 = r3.d.T();
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void b(o.C3952bQt.c r4) {
                /*
                    r3 = this;
                    java.lang.String r0 = ""
                    o.C8632dsu.c(r4, r0)
                    o.fl r1 = r4.c()
                    boolean r1 = r1 instanceof o.C8971gl
                    if (r1 == 0) goto L3f
                    o.fl r4 = r4.c()
                    java.lang.Object r4 = r4.c()
                    o.bQt$d r4 = (o.C3952bQt.d) r4
                    if (r4 == 0) goto L24
                    com.netflix.mediaclient.servicemgr.interface_.GameDetails r4 = r4.d()
                    if (r4 == 0) goto L24
                    com.netflix.mediaclient.servicemgr.interface_.GameDetails$Orientation r4 = r4.C()
                    goto L25
                L24:
                    r4 = 0
                L25:
                    com.netflix.mediaclient.servicemgr.interface_.GameDetails$Orientation r1 = com.netflix.mediaclient.servicemgr.interface_.GameDetails.Orientation.c
                    if (r4 == r1) goto L3f
                    com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment r4 = com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment.this
                    o.cia r4 = com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment.h(r4)
                    if (r4 == 0) goto L3f
                    com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment r1 = com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment.this
                    com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel r2 = com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment.i(r1)
                    o.C8632dsu.a(r2, r0)
                    android.content.res.Configuration r0 = r2
                    r4.a(r1, r2, r0)
                L3f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment$onConfigurationChanged$1.b(o.bQt$c):void");
            }
        });
    }

    @Override // o.bMX, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        C6717cia T = T();
        if (T != null) {
            MiniPlayerVideoGroupViewModel X = X();
            C8632dsu.a(X, "");
            T.b(this, X);
        }
        X().k();
        C1619aI O = O();
        bLI bli = U().d;
        C8632dsu.a(bli, "");
        O.d(bli);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        C6717cia T = T();
        if (T != null) {
            T.b();
        }
        X().n();
        C1619aI O = O();
        bLI bli = U().d;
        C8632dsu.a(bli, "");
        O.c(bli);
        super.onStop();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        P().get().e(z);
        F().get().e(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S() {
        Object b2;
        if (this.l) {
            Z();
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null || C9737vz.a(activity) || (b2 = C9737vz.b(activity, Activity.class)) == null) {
            return;
        }
        ((Activity) b2).setRequestedOrientation(1);
        X().b();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.bFP
    public boolean o() {
        if (X().f()) {
            S();
            return true;
        }
        return super.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int W() {
        bLI bli = this.v;
        bLI bli2 = null;
        if (bli == null) {
            C8632dsu.d("");
            bli = null;
        }
        View childAt = bli.getChildAt(0);
        if (childAt != null) {
            bLI bli3 = this.v;
            if (bli3 == null) {
                C8632dsu.d("");
                bli3 = null;
            }
            if (bli3.computeVerticalScrollOffset() == 0 || childAt.getY() == 0.0f) {
                return 0;
            }
            bLI bli4 = this.v;
            if (bli4 == null) {
                C8632dsu.d("");
            } else {
                bli2 = bli4;
            }
            return bli2.computeVerticalScrollOffset();
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        bPX bpx = this.t;
        if (bpx != null) {
            bpx.d();
        }
        this.t = null;
        this.m.clear();
        this.y = null;
    }

    @Override // o.InterfaceC8894fN
    public void e() {
        C8980gu.c(N(), new drM<C3952bQt.c, dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment$invalidate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C3952bQt.c cVar) {
                b(cVar);
                return dpR.c;
            }

            public final void b(C3952bQt.c cVar) {
                GdpEpoxyController Q;
                GdpEpoxyController Q2;
                boolean c2;
                C6717cia T;
                C6717cia T2;
                GameDetails d2;
                GameDetails d3;
                Map d4;
                Map k;
                Throwable th;
                GdpEpoxyController Q3;
                C8632dsu.c((Object) cVar, "");
                if (cVar.e()) {
                    C8054ddD.a(GdpFragment.this.requireContext(), GdpFragment.this.getString(C3895bOq.e.m), 0);
                    GdpFragment.this.N().h();
                }
                AbstractC8918fl<C3952bQt.d> c3 = cVar.c();
                if (c3 instanceof C8927fu) {
                    InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                    Throwable b2 = ((C8927fu) c3).b();
                    d4 = dqE.d();
                    k = dqE.k(d4);
                    C1596aHd c1596aHd = new C1596aHd("Failed to get game detail data", b2, null, false, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b3 = c1596aHd.b();
                        if (b3 != null) {
                            String c4 = errorType.c();
                            c1596aHd.a(c4 + " " + b3);
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
                    Q3 = GdpFragment.this.Q();
                    Q3.setData(new C3908bPc(null, false, bPY.a.b, null, 8, null));
                } else if (!(c3 instanceof C8971gl)) {
                    if (c3 instanceof C8932fz) {
                        GdpFragment.b.getLogTag();
                        Q = GdpFragment.this.Q();
                        Q.setData(new C3908bPc(null, false, bPY.d.d, null, 8, null));
                    }
                } else {
                    GdpFragment.b.getLogTag();
                    Q2 = GdpFragment.this.Q();
                    GameDetails d5 = ((C3952bQt.d) ((C8971gl) c3).c()).d();
                    GdpFragment gdpFragment = GdpFragment.this;
                    C3952bQt.d c5 = cVar.c().c();
                    GameDetails.Orientation orientation = null;
                    c2 = gdpFragment.c((c5 == null || (d3 = c5.d()) == null) ? null : d3.k());
                    bPY.c cVar3 = bPY.c.c;
                    C3952bQt.d c6 = cVar.c().c();
                    Q2.setData(new C3908bPc(d5, c2, cVar3, c6 != null ? c6.b() : null));
                    C3952bQt.d c7 = cVar.c().c();
                    if (c7 != null && (d2 = c7.d()) != null) {
                        orientation = d2.C();
                    }
                    if (orientation == GameDetails.Orientation.c) {
                        T = GdpFragment.this.T();
                        if (T != null) {
                            T.b();
                        }
                        T2 = GdpFragment.this.T();
                        if (T2 != null) {
                            T2.d();
                        }
                        GdpFragment.this.l = true;
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c(String str) {
        PackageManager packageManager;
        if (str != null) {
            Context context = getContext();
            if (((context == null || (packageManager = context.getPackageManager()) == null) ? null : packageManager.getLaunchIntentForPackage(str)) != null) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"AutoDispose"})
    private final void aa() {
        CompositeDisposable compositeDisposable = this.m;
        Observable d2 = G().d(AbstractC3910bPe.class);
        final drM<AbstractC3910bPe, dpR> drm = new drM<AbstractC3910bPe, dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment$setupEventHandlers$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC3910bPe abstractC3910bPe) {
                d(abstractC3910bPe);
                return dpR.c;
            }

            public final void d(AbstractC3910bPe abstractC3910bPe) {
                InterfaceC3977bRr interfaceC3977bRr;
                InterfaceC3977bRr interfaceC3977bRr2;
                if (abstractC3910bPe instanceof AbstractC3910bPe.i) {
                    String a2 = AbstractC8266dhD.a();
                    C3909bPd M = GdpFragment.this.M();
                    TrackingInfo e2 = TrackingInfoHolder.e(GdpFragment.this.R(), null, 1, null);
                    C8632dsu.d((Object) a2);
                    M.b(e2, a2);
                    GdpFragment.this.b(((AbstractC3910bPe.i) abstractC3910bPe).d(), a2, true);
                } else if (abstractC3910bPe instanceof AbstractC3910bPe.a) {
                    interfaceC3977bRr = GdpFragment.this.f13270o;
                    if (interfaceC3977bRr != null && interfaceC3977bRr.a()) {
                        GdpFragment.this.M().c(TrackingInfoHolder.e(GdpFragment.this.R(), null, 1, null));
                        AbstractC3910bPe.a aVar = (AbstractC3910bPe.a) abstractC3910bPe;
                        if (InstallInterstitialFragment.d.b(GdpFragment.this.by_(), aVar.d(), aVar.a(), GdpFragment.this.R())) {
                            interfaceC3977bRr2 = GdpFragment.this.f13270o;
                            if (interfaceC3977bRr2 != null) {
                                interfaceC3977bRr2.b();
                                return;
                            }
                            return;
                        }
                    }
                    GdpFragment.this.M().a(TrackingInfoHolder.e(GdpFragment.this.R(), null, 1, null));
                    GdpFragment.b(GdpFragment.this, ((AbstractC3910bPe.a) abstractC3910bPe).d(), "", false, 4, null);
                } else if (abstractC3910bPe instanceof AbstractC3910bPe.h) {
                    GdpFragment.this.c(((AbstractC3910bPe.h) abstractC3910bPe).a());
                } else if (abstractC3910bPe instanceof AbstractC3910bPe.g) {
                    GdpFragment.d dVar = GdpFragment.b;
                    GdpFragment.this.N().b(true);
                } else if (abstractC3910bPe instanceof AbstractC3910bPe.e) {
                    GdpFragment gdpFragment = GdpFragment.this;
                    NetflixImmutableStatus netflixImmutableStatus = ((AbstractC3910bPe.e) abstractC3910bPe).e() ? InterfaceC1078Nw.aJ : InterfaceC1078Nw.ad;
                    C8632dsu.d(netflixImmutableStatus);
                    gdpFragment.d(netflixImmutableStatus);
                } else if (abstractC3910bPe instanceof AbstractC3910bPe.c) {
                    InterfaceC3643bFl.b bVar = InterfaceC3643bFl.c;
                    Context requireContext = GdpFragment.this.requireContext();
                    C8632dsu.a(requireContext, "");
                    AbstractC3910bPe.c cVar = (AbstractC3910bPe.c) abstractC3910bPe;
                    InterfaceC3643bFl.c.a(bVar.a(requireContext), GdpFragment.this.by_(), VideoType.GAMES, cVar.d(), cVar.e(), cVar.c(), "sims", null, 64, null);
                } else if (abstractC3910bPe instanceof AbstractC3910bPe.f) {
                    if (C8171dfO.c()) {
                        AbstractC3910bPe.f fVar = (AbstractC3910bPe.f) abstractC3910bPe;
                        GdpFragment.this.M().d(AppView.boxArt, TrackingInfoHolder.e(fVar.d(), null, 1, null), false);
                        QuickDrawDialogFrag.d.a(QuickDrawDialogFrag.e, GdpFragment.this.by_(), fVar.c(), fVar.d(), false, null, 24, null);
                        return;
                    }
                    AbstractC3910bPe.f fVar2 = (AbstractC3910bPe.f) abstractC3910bPe;
                    GdpFragment.this.M().d(AppView.boxArt, TrackingInfoHolder.e(fVar2.d(), null, 1, null), true);
                    InterfaceC3643bFl.b bVar2 = InterfaceC3643bFl.c;
                    Context requireContext2 = GdpFragment.this.requireContext();
                    C8632dsu.a(requireContext2, "");
                    InterfaceC3643bFl.c.a(bVar2.a(requireContext2), GdpFragment.this.by_(), fVar2.e(), fVar2.c(), fVar2.a(), fVar2.d(), fVar2.b(), null, 64, null);
                } else if (abstractC3910bPe instanceof AbstractC3910bPe.d) {
                    C3912bPg.e.c(GdpFragment.this.by_(), ((AbstractC3910bPe.d) abstractC3910bPe).a());
                } else if (abstractC3910bPe instanceof AbstractC3910bPe.b) {
                    AbstractC3910bPe.b bVar3 = (AbstractC3910bPe.b) abstractC3910bPe;
                    GdpFragment.this.a(bVar3.e(), bVar3.d());
                } else if (C8632dsu.c(abstractC3910bPe, AbstractC3910bPe.j.b)) {
                    GdpFragment.this.N().h();
                }
            }
        };
        Disposable subscribe = d2.subscribe(new Consumer() { // from class: o.bPJ
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GdpFragment.b(drM.this, obj);
            }
        });
        C8632dsu.a(subscribe, "");
        DisposableKt.plusAssign(compositeDisposable, subscribe);
        DisposableKt.plusAssign(this.m, SubscribersKt.subscribeBy$default(G().d(AbstractC6719cic.class), (drM) null, (drO) null, new drM<AbstractC6719cic, dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment$setupEventHandlers$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC6719cic abstractC6719cic) {
                c(abstractC6719cic);
                return dpR.c;
            }

            public final void c(AbstractC6719cic abstractC6719cic) {
                boolean z;
                C8632dsu.c((Object) abstractC6719cic, "");
                if (abstractC6719cic instanceof AbstractC6719cic.b) {
                    if (GdpFragment.this.X().f()) {
                        GdpFragment.this.S();
                    }
                } else if (abstractC6719cic instanceof AbstractC6719cic.e.d) {
                    z = GdpFragment.this.l;
                    if (z) {
                        C6717cia.a.getLogTag();
                        if (((AbstractC6719cic.e.d) abstractC6719cic).b()) {
                            GdpFragment.this.ab();
                        } else {
                            GdpFragment.this.Z();
                        }
                    }
                }
            }
        }, 3, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, int i) {
        N().e(str, i, R().a(), TrackingInfoHolder.a(R(), null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ab() {
        Window window;
        Window window2;
        View decorView;
        e eVar = this.q;
        MiniPlayerVideoGroupViewModel X = X();
        C8632dsu.a(X, "");
        eVar.b(this, X);
        NetflixActivity bj_ = bj_();
        this.x = (bj_ == null || (window2 = bj_.getWindow()) == null || (decorView = window2.getDecorView()) == null) ? 0 : decorView.getSystemUiVisibility();
        NetflixActivity bj_2 = bj_();
        View decorView2 = (bj_2 == null || (window = bj_2.getWindow()) == null) ? null : window.getDecorView();
        if (decorView2 != null) {
            decorView2.setSystemUiVisibility(4100);
        }
        X().d(true);
        G().b(AbstractC6719cic.class, new AbstractC6719cic.e.b(false, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z() {
        Window window;
        e eVar = this.q;
        MiniPlayerVideoGroupViewModel X = X();
        C8632dsu.a(X, "");
        eVar.e(this, X);
        NetflixActivity bj_ = bj_();
        View decorView = (bj_ == null || (window = bj_.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            decorView.setSystemUiVisibility(this.x);
        }
        X().d(false);
        G().b(AbstractC6719cic.class, new AbstractC6719cic.e.b(true, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(GdpFragment gdpFragment, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        gdpFragment.b(str, str2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(final String str, final String str2, final boolean z) {
        C8980gu.c(N(), new drM<C3952bQt.c, dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment$onInstallOrOpenButtonClick$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final dpR invoke(C3952bQt.c cVar) {
                C8632dsu.c((Object) cVar, "");
                C3952bQt.d c2 = cVar.c().c();
                if (c2 != null) {
                    GdpFragment gdpFragment = GdpFragment.this;
                    String str3 = str;
                    String str4 = str2;
                    boolean z2 = z;
                    bNS K = gdpFragment.K();
                    bNK.e eVar = bNK.c;
                    NetflixActivity by_ = gdpFragment.by_();
                    String title = c2.d().getTitle();
                    C8632dsu.a(title, "");
                    K.d(eVar.e(by_, str3, str4, title, z2, c2.d().h()));
                    return dpR.c;
                }
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(InterfaceC5185btw interfaceC5185btw) {
        InterfaceC1126Pr.c.e(L(), interfaceC5185btw, null, 2, null);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        NetflixActivity bj_ = bj_();
        NetflixActivity bj_2 = bj_();
        Boolean bool = (Boolean) C9726vo.d(bj_, bj_2 != null ? bj_2.getNetflixActionBar() : null, new drX<NetflixActivity, NetflixActionBar, Boolean>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment$updateActionBar$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            /* renamed from: e */
            public final Boolean invoke(NetflixActivity netflixActivity, NetflixActionBar netflixActionBar) {
                NetflixActionBar netflixActionBar2;
                C8632dsu.c((Object) netflixActivity, "");
                C8632dsu.c((Object) netflixActionBar, "");
                netflixActionBar.c(netflixActivity.getActionBarStateBuilder().l(false).k(true).i(true).k(true).g(false).f(false).h(false).c());
                NetflixActivity bj_3 = GdpFragment.this.bj_();
                if (bj_3 != null && (netflixActionBar2 = bj_3.getNetflixActionBar()) != null) {
                    netflixActionBar2.a(0);
                }
                return Boolean.TRUE;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(View view) {
        C8632dsu.c((Object) view, "");
        view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), this.h);
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return ((Boolean) C8980gu.c(N(), new drM<C3952bQt.c, Boolean>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment$isLoadingData$1
            @Override // o.drM
            /* renamed from: c */
            public final Boolean invoke(C3952bQt.c cVar) {
                C8632dsu.c((Object) cVar, "");
                return Boolean.valueOf(cVar.b());
            }
        })).booleanValue();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public InteractiveTrackerInterface bi_() {
        bPX bpx;
        if (getActivity() == null) {
            bpx = null;
        } else {
            ImageLoader requireImageLoader = NetflixActivity.requireImageLoader(requireActivity());
            C8632dsu.a(requireImageLoader, "");
            bpx = new bPX(requireImageLoader);
        }
        this.t = bpx;
        return bpx;
    }
}
