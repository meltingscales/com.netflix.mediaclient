package com.netflix.mediaclient.ui.home.impl.lolomo;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.LifecycleAwareEpoxyViewBinder;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.android.widgetry.widget.ScrollAwayClipByHeightBehaviour;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.android.widget.NetflixActionBarInterstitials;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.rowconfig.layoutmanager.VerticalRowConfigLayoutManager;
import com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab55851_MobileNav;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.collecttaste.api.CollectTaste;
import com.netflix.mediaclient.ui.home.api.Params;
import com.netflix.mediaclient.ui.home.impl.HomeEpoxyController;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment;
import com.netflix.mediaclient.ui.lomo.LoMoUtils;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.mediaclient.util.AccessibilityUtils;
import com.netflix.model.leafs.originals.BillboardAsset;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.AbstractC2914ap;
import o.AbstractC3179au;
import o.AbstractC6677chn;
import o.AbstractC6719cic;
import o.AbstractC8882fB;
import o.C1045Mp;
import o.C1333Xq;
import o.C1565aG;
import o.C1596aHd;
import o.C1619aI;
import o.C1729aMb;
import o.C1731aMd;
import o.C1860aQy;
import o.C2755am;
import o.C3990bSd;
import o.C4018bTe;
import o.C4022bTi;
import o.C4048bUh;
import o.C4049bUi;
import o.C4050bUj;
import o.C4052bUl;
import o.C5105bsV;
import o.C5398bxx;
import o.C6417ccs;
import o.C6423ccy;
import o.C6452cda;
import o.C6455cdd;
import o.C6652chO;
import o.C6717cia;
import o.C8067ddQ;
import o.C8126deW;
import o.C8151dev;
import o.C8153dex;
import o.C8171dfO;
import o.C8556dpz;
import o.C8586drb;
import o.C8627dsp;
import o.C8632dsu;
import o.C8737dwr;
import o.C8903fW;
import o.C8925fs;
import o.C8930fx;
import o.C8931fy;
import o.C8980gu;
import o.C9726vo;
import o.C9737vz;
import o.C9893ya;
import o.C9935zP;
import o.InterfaceC1593aHa;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import o.InterfaceC1659aJm;
import o.InterfaceC2023aX;
import o.InterfaceC3825bMa;
import o.InterfaceC3829bMe;
import o.InterfaceC3994bSh;
import o.InterfaceC4255bb;
import o.InterfaceC4360bcz;
import o.InterfaceC5155btS;
import o.InterfaceC5303bwH;
import o.InterfaceC5304bwI;
import o.InterfaceC5307bwL;
import o.InterfaceC5425byX;
import o.InterfaceC5840cKh;
import o.InterfaceC5844cKl;
import o.InterfaceC6419ccu;
import o.InterfaceC6675chl;
import o.InterfaceC6905cmC;
import o.InterfaceC7407cvd;
import o.InterfaceC8554dpx;
import o.InterfaceC8585dra;
import o.InterfaceC8660dtv;
import o.InterfaceC8881fA;
import o.InterfaceC8890fJ;
import o.InterfaceC8976gq;
import o.aCP;
import o.aLX;
import o.aQS;
import o.bFO;
import o.bLP;
import o.bLR;
import o.bLU;
import o.bLW;
import o.bNL;
import o.bNN;
import o.bNP;
import o.bNR;
import o.bNS;
import o.bNT;
import o.bNV;
import o.bRZ;
import o.bSJ;
import o.bSY;
import o.bTF;
import o.bTL;
import o.bTM;
import o.bTX;
import o.bTY;
import o.bXD;
import o.cWC;
import o.cYB;
import o.dpB;
import o.dpR;
import o.dqT;
import o.dqZ;
import o.drI;
import o.drM;
import o.drO;
import o.drX;
import o.dsA;
import o.dtC;
import o.dwQ;
import o.dwU;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public abstract class LolomoMvRxFragment extends bTM implements bRZ, bFO {
    private static final String e = "kidsMysteryPrefs" + C8126deW.c();
    static final /* synthetic */ dtC<Object>[] j = {dsA.c(new PropertyReference1Impl(LolomoMvRxFragment.class, "lolomoViewModel", "getLolomoViewModel()Lcom/netflix/mediaclient/ui/home/impl/lolomo/GraphQLLolomoViewModel;", 0))};
    public static final a k = new a(null);
    private C4048bUh C;
    @Inject
    public InterfaceC5303bwH adsPlan;
    @Inject
    public InterfaceC5304bwI adsPlanApplication;
    private final BroadcastReceiver b;
    @Inject
    public Lazy<InterfaceC5425byX> cfourSurvey;
    @Inject
    public Lazy<CollectTaste> collectTaste;
    @Inject
    public Lazy<InterfaceC7407cvd> downloadedForYou;
    @Inject
    public Lazy<bNN> gameModels;
    @Inject
    public Lazy<bNL> gamesAssetFetcher;
    @Inject
    public Lazy<bNT> gamesIdentity;
    @Inject
    public bNP gamesInMyList;
    @Inject
    public Lazy<bNS> gamesInstallationAndLaunch;
    @Inject
    public Lazy<bNR> gamesTab;
    @Inject
    public Lazy<bNV> gamesUtils;
    @Inject
    public InterfaceC3994bSh homeTracking;
    @Inject
    public bXD interstitials;
    @Inject
    public dwQ ioDispatcher;
    private final InterfaceC8554dpx l;
    private final d m = new h();
    @Inject
    public InterfaceC6675chl messaging;
    @Inject
    public InterfaceC6905cmC myList;
    @Inject
    public Lazy<InterfaceC5840cKh> myNetflixLolomo;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private bLW f13274o;
    private final boolean p;
    @Inject
    public InterfaceC4360bcz playerAgentRepository;
    @Inject
    public InterfaceC5844cKl profileApi;
    private final InterfaceC8554dpx q;
    private C6417ccs.b r;
    private e s;
    private Parcelable t;
    private final b u;
    @Inject
    public cWC uma;
    @Inject
    public Lazy<cYB> upNextGps;
    private final InterfaceC8554dpx v;
    private final C3990bSd w;
    private final InterfaceC8554dpx x;
    private Params.Lolomo y;
    private ScrollAwayClipByHeightBehaviour<View> z;

    /* loaded from: classes4.dex */
    public interface d {
        InterfaceC5303bwH a();

        bNN b();

        CollectTaste c();

        InterfaceC7407cvd d();

        bNL e();

        bNP f();

        bNV g();

        InterfaceC5840cKh h();

        InterfaceC6905cmC i();

        bNS j();

        cYB o();
    }

    private final int O() {
        return 0;
    }

    public abstract C4048bUh F();

    public abstract C5105bsV J();

    public boolean X() {
        return false;
    }

    public final d Z() {
        return this.m;
    }

    @Override // o.bRZ
    public boolean ae_() {
        return false;
    }

    public final e ak() {
        return this.s;
    }

    protected int ap() {
        return C4022bTi.a.f13543o;
    }

    public final C4048bUh az() {
        return this.C;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bo_() {
        return this.p;
    }

    public abstract LolomoEpoxyController c(bSY bsy, bLW blw, bTX btx, drX<? super LoMo, ? super Integer, dpR> drx, drO<MiniPlayerVideoGroupViewModel> dro, drM<? super LoMo, dpR> drm);

    public abstract void c(boolean z);

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC8882fB<LolomoMvRxFragment, bTF> {
        final /* synthetic */ InterfaceC8660dtv a;
        final /* synthetic */ drM b;
        final /* synthetic */ boolean d;
        final /* synthetic */ InterfaceC8660dtv e;

        public i(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.a = interfaceC8660dtv;
            this.d = z;
            this.b = drm;
            this.e = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: a */
        public InterfaceC8554dpx<bTF> c(LolomoMvRxFragment lolomoMvRxFragment, dtC<?> dtc) {
            C8632dsu.c((Object) lolomoMvRxFragment, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.a;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.e;
            return d.d(lolomoMvRxFragment, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$special$$inlined$fragmentViewModel$default$2$1
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: d */
                public final String invoke() {
                    String name = drI.e(InterfaceC8660dtv.this).getName();
                    C8632dsu.a(name, "");
                    return name;
                }
            }, dsA.a(C4049bUi.class), this.d, this.b);
        }
    }

    public LolomoMvRxFragment() {
        InterfaceC8554dpx b2;
        InterfaceC8554dpx b3;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.e;
        b2 = dpB.b(lazyThreadSafetyMode, new drO<MiniPlayerVideoGroupViewModel>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$miniPlayerViewModel$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final MiniPlayerVideoGroupViewModel invoke() {
                MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel = (MiniPlayerVideoGroupViewModel) new ViewModelProvider(LolomoMvRxFragment.this).get(MiniPlayerVideoGroupViewModel.class);
                miniPlayerVideoGroupViewModel.a(LolomoMvRxFragment.this.J());
                return miniPlayerVideoGroupViewModel;
            }
        });
        this.v = b2;
        b3 = dpB.b(lazyThreadSafetyMode, new drO<C6717cia>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$playerOrientationManager$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final C6717cia invoke() {
                if (C8067ddQ.c()) {
                    return null;
                }
                C6652chO c6652chO = new C6652chO(LolomoMvRxFragment.this.bh_());
                final LolomoMvRxFragment lolomoMvRxFragment = LolomoMvRxFragment.this;
                drO<bTX> dro = new drO<bTX>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$playerOrientationManager$2.1
                    {
                        super(0);
                    }

                    @Override // o.drO
                    /* renamed from: b */
                    public final bTX invoke() {
                        LolomoMvRxFragment.e ak = LolomoMvRxFragment.this.ak();
                        if (ak != null) {
                            return ak.n();
                        }
                        return null;
                    }
                };
                final LolomoMvRxFragment lolomoMvRxFragment2 = LolomoMvRxFragment.this;
                return new C6717cia(c6652chO, new bTY(dro, new drO<AbstractC2914ap>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$playerOrientationManager$2.2
                    {
                        super(0);
                    }

                    @Override // o.drO
                    /* renamed from: c */
                    public final AbstractC2914ap invoke() {
                        LolomoMvRxFragment.e ak = LolomoMvRxFragment.this.ak();
                        if (ak != null) {
                            return ak.j();
                        }
                        return null;
                    }
                }));
            }
        });
        this.x = b3;
        final InterfaceC8660dtv a2 = dsA.a(bTF.class);
        this.q = new i(a2, false, new drM<InterfaceC8890fJ<bTF, C4049bUi>, bTF>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$special$$inlined$fragmentViewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.bTF, o.fS] */
            @Override // o.drM
            /* renamed from: a */
            public final bTF invoke(InterfaceC8890fJ<bTF, C4049bUi> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a2).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, C4049bUi.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a2).c(this, j[0]);
        this.b = new g();
        this.w = new C3990bSd(this);
        this.u = new b();
        this.l = C1565aG.c(this, C4022bTi.e.i, false, false, new drM<LifecycleAwareEpoxyViewBinder, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$headerViewBinder$2
            public final void a(LifecycleAwareEpoxyViewBinder lifecycleAwareEpoxyViewBinder) {
                C8632dsu.c((Object) lifecycleAwareEpoxyViewBinder, "");
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(LifecycleAwareEpoxyViewBinder lifecycleAwareEpoxyViewBinder) {
                a(lifecycleAwareEpoxyViewBinder);
                return dpR.c;
            }
        }, new drX<InterfaceC2023aX, Context, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$headerViewBinder$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(InterfaceC2023aX interfaceC2023aX, Context context) {
                e(interfaceC2023aX, context);
                return dpR.c;
            }

            public final void e(InterfaceC2023aX interfaceC2023aX, Context context) {
                C8632dsu.c((Object) interfaceC2023aX, "");
                C8632dsu.c((Object) context, "");
                LolomoMvRxFragment.this.d(interfaceC2023aX);
            }
        }, 6, null);
        this.p = true;
    }

    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("LolomoMvRxFragment");
        }
    }

    public final Lazy<CollectTaste> aa() {
        Lazy<CollectTaste> lazy = this.collectTaste;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<bNN> Y() {
        Lazy<bNN> lazy = this.gameModels;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<bNS> ae() {
        Lazy<bNS> lazy = this.gamesInstallationAndLaunch;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<bNV> am() {
        Lazy<bNV> lazy = this.gamesUtils;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<bNR> ag() {
        Lazy<bNR> lazy = this.gamesTab;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<bNT> ad() {
        Lazy<bNT> lazy = this.gamesIdentity;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<InterfaceC7407cvd> ac() {
        Lazy<InterfaceC7407cvd> lazy = this.downloadedForYou;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC5303bwH T() {
        InterfaceC5303bwH interfaceC5303bwH = this.adsPlan;
        if (interfaceC5303bwH != null) {
            return interfaceC5303bwH;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC6905cmC at() {
        InterfaceC6905cmC interfaceC6905cmC = this.myList;
        if (interfaceC6905cmC != null) {
            return interfaceC6905cmC;
        }
        C8632dsu.d("");
        return null;
    }

    public final bNP af() {
        bNP bnp = this.gamesInMyList;
        if (bnp != null) {
            return bnp;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<InterfaceC5840cKh> as() {
        Lazy<InterfaceC5840cKh> lazy = this.myNetflixLolomo;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<cYB> ax() {
        Lazy<cYB> lazy = this.upNextGps;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<bNL> ah() {
        Lazy<bNL> lazy = this.gamesAssetFetcher;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final dwQ ar() {
        dwQ dwq = this.ioDispatcher;
        if (dwq != null) {
            return dwq;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class h implements d {
        h() {
        }

        @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.d
        public CollectTaste c() {
            return LolomoMvRxFragment.this.aa().get();
        }

        @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.d
        public bNN b() {
            bNN bnn = LolomoMvRxFragment.this.Y().get();
            C8632dsu.a(bnn, "");
            return bnn;
        }

        @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.d
        public bNS j() {
            bNS bns = LolomoMvRxFragment.this.ae().get();
            C8632dsu.a(bns, "");
            return bns;
        }

        @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.d
        public bNV g() {
            bNV bnv = LolomoMvRxFragment.this.am().get();
            C8632dsu.a(bnv, "");
            return bnv;
        }

        @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.d
        public InterfaceC7407cvd d() {
            InterfaceC7407cvd interfaceC7407cvd = LolomoMvRxFragment.this.ac().get();
            C8632dsu.a(interfaceC7407cvd, "");
            return interfaceC7407cvd;
        }

        @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.d
        public InterfaceC5303bwH a() {
            return LolomoMvRxFragment.this.T();
        }

        @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.d
        public InterfaceC5840cKh h() {
            InterfaceC5840cKh interfaceC5840cKh = LolomoMvRxFragment.this.as().get();
            C8632dsu.a(interfaceC5840cKh, "");
            return interfaceC5840cKh;
        }

        @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.d
        public InterfaceC6905cmC i() {
            return LolomoMvRxFragment.this.at();
        }

        @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.d
        public bNP f() {
            return LolomoMvRxFragment.this.af();
        }

        @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.d
        public bNL e() {
            bNL bnl = LolomoMvRxFragment.this.ah().get();
            C8632dsu.a(bnl, "");
            return bnl;
        }

        @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.d
        public cYB o() {
            cYB cyb = LolomoMvRxFragment.this.ax().get();
            C8632dsu.a(cyb, "");
            return cyb;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e {
        private final Drawable a;
        private final C6417ccs b;
        private boolean c;
        private bTL d;
        private int e;
        private boolean f;
        private final View g;
        private boolean h;
        private boolean i;
        private final HomeEpoxyController j;
        private final bSY k;
        private final C6423ccy l;
        private final VerticalRowConfigLayoutManager m;
        private final bTX n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f13275o;

        public final Drawable a() {
            return this.a;
        }

        public final void a(boolean z) {
            this.f13275o = z;
        }

        public final int b() {
            return this.e;
        }

        public final void b(int i) {
            this.e = i;
        }

        public final void b(bTL btl) {
            this.d = btl;
        }

        public final void b(boolean z) {
            this.h = z;
        }

        public final C6417ccs c() {
            return this.b;
        }

        public final bTL d() {
            return this.d;
        }

        public final void d(boolean z) {
            this.c = z;
        }

        public final void e(boolean z) {
            this.f = z;
        }

        public final boolean e() {
            return this.h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c(this.g, eVar.g) && C8632dsu.c(this.n, eVar.n) && C8632dsu.c(this.j, eVar.j) && C8632dsu.c(this.k, eVar.k) && C8632dsu.c(this.a, eVar.a) && C8632dsu.c(this.b, eVar.b) && C8632dsu.c(this.l, eVar.l) && C8632dsu.c(this.m, eVar.m) && this.i == eVar.i && this.e == eVar.e && C8632dsu.c(this.d, eVar.d) && this.h == eVar.h && this.f13275o == eVar.f13275o && this.f == eVar.f && this.c == eVar.c;
            }
            return false;
        }

        public final bSY f() {
            return this.k;
        }

        public final boolean g() {
            return this.f;
        }

        public final View h() {
            return this.g;
        }

        public int hashCode() {
            int hashCode = this.g.hashCode();
            int hashCode2 = this.n.hashCode();
            int hashCode3 = this.j.hashCode();
            int hashCode4 = this.k.hashCode();
            Drawable drawable = this.a;
            int hashCode5 = drawable == null ? 0 : drawable.hashCode();
            int hashCode6 = this.b.hashCode();
            int hashCode7 = this.l.hashCode();
            int hashCode8 = this.m.hashCode();
            int hashCode9 = Boolean.hashCode(this.i);
            int hashCode10 = Integer.hashCode(this.e);
            bTL btl = this.d;
            return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (btl != null ? btl.hashCode() : 0)) * 31) + Boolean.hashCode(this.h)) * 31) + Boolean.hashCode(this.f13275o)) * 31) + Boolean.hashCode(this.f)) * 31) + Boolean.hashCode(this.c);
        }

        public final boolean i() {
            return this.f13275o;
        }

        public final HomeEpoxyController j() {
            return this.j;
        }

        public final C6423ccy m() {
            return this.l;
        }

        public final bTX n() {
            return this.n;
        }

        public final VerticalRowConfigLayoutManager o() {
            return this.m;
        }

        public String toString() {
            View view = this.g;
            bTX btx = this.n;
            HomeEpoxyController homeEpoxyController = this.j;
            bSY bsy = this.k;
            Drawable drawable = this.a;
            C6417ccs c6417ccs = this.b;
            C6423ccy c6423ccy = this.l;
            VerticalRowConfigLayoutManager verticalRowConfigLayoutManager = this.m;
            boolean z = this.i;
            int i = this.e;
            bTL btl = this.d;
            boolean z2 = this.h;
            boolean z3 = this.f13275o;
            boolean z4 = this.f;
            boolean z5 = this.c;
            return "Holder(header=" + view + ", recyclerView=" + btx + ", epoxyController=" + homeEpoxyController + ", homeModelTracking=" + bsy + ", actionBarBackground=" + drawable + ", backgroundController=" + c6417ccs + ", lolomoUmaAndBannersController=" + c6423ccy + ", verticalRowConfigLayoutManager=" + verticalRowConfigLayoutManager + ", firstDataLoadComplete=" + z + ", currentVScrollOffset=" + i + ", currentBackground=" + btl + ", dataLoaded=" + z2 + ", lolomoDataModelAdded=" + z3 + ", headerViewChanged=" + z4 + ", backgroundChanged=" + z5 + ")";
        }

        public e(View view, bTX btx, HomeEpoxyController homeEpoxyController, bSY bsy, Drawable drawable, C6417ccs c6417ccs, C6423ccy c6423ccy, VerticalRowConfigLayoutManager verticalRowConfigLayoutManager, boolean z, int i, bTL btl, boolean z2, boolean z3, boolean z4, boolean z5) {
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) btx, "");
            C8632dsu.c((Object) homeEpoxyController, "");
            C8632dsu.c((Object) bsy, "");
            C8632dsu.c((Object) c6417ccs, "");
            C8632dsu.c((Object) c6423ccy, "");
            C8632dsu.c((Object) verticalRowConfigLayoutManager, "");
            this.g = view;
            this.n = btx;
            this.j = homeEpoxyController;
            this.k = bsy;
            this.a = drawable;
            this.b = c6417ccs;
            this.l = c6423ccy;
            this.m = verticalRowConfigLayoutManager;
            this.i = z;
            this.e = i;
            this.d = btl;
            this.h = z2;
            this.f13275o = z3;
            this.f = z4;
            this.c = z5;
        }

        public /* synthetic */ e(View view, bTX btx, HomeEpoxyController homeEpoxyController, bSY bsy, Drawable drawable, C6417ccs c6417ccs, C6423ccy c6423ccy, VerticalRowConfigLayoutManager verticalRowConfigLayoutManager, boolean z, int i, bTL btl, boolean z2, boolean z3, boolean z4, boolean z5, int i2, C8627dsp c8627dsp) {
            this(view, btx, homeEpoxyController, bsy, drawable, c6417ccs, c6423ccy, verticalRowConfigLayoutManager, (i2 & JSONzip.end) != 0 ? false : z, (i2 & 512) != 0 ? 0 : i, (i2 & 1024) != 0 ? null : btl, (i2 & 2048) != 0 ? false : z2, (i2 & 4096) != 0 ? false : z3, (i2 & 8192) != 0 ? false : z4, (i2 & 16384) != 0 ? false : z5);
        }
    }

    protected final Params.Lolomo av() {
        Params.Lolomo lolomo = this.y;
        if (lolomo != null) {
            return lolomo;
        }
        C8632dsu.d("");
        return null;
    }

    public final e aF() {
        e eVar = this.s;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException("Illegal state, holder is null".toString());
    }

    public final MiniPlayerVideoGroupViewModel au() {
        return (MiniPlayerVideoGroupViewModel) this.v.getValue();
    }

    protected C6717cia Q() {
        return (C6717cia) this.x.getValue();
    }

    public bTF aq() {
        return (bTF) this.q.getValue();
    }

    /* loaded from: classes4.dex */
    public static final class g extends BroadcastReceiver {
        g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            e ak = LolomoMvRxFragment.this.ak();
            if (ak == null) {
                return;
            }
            ak.d(true);
        }
    }

    protected final InterfaceC5844cKl ay() {
        InterfaceC5844cKl interfaceC5844cKl = this.profileApi;
        if (interfaceC5844cKl != null) {
            return interfaceC5844cKl;
        }
        C8632dsu.d("");
        return null;
    }

    protected final InterfaceC4360bcz aw() {
        InterfaceC4360bcz interfaceC4360bcz = this.playerAgentRepository;
        if (interfaceC4360bcz != null) {
            return interfaceC4360bcz;
        }
        C8632dsu.d("");
        return null;
    }

    protected final InterfaceC6675chl an() {
        InterfaceC6675chl interfaceC6675chl = this.messaging;
        if (interfaceC6675chl != null) {
            return interfaceC6675chl;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final InterfaceC3994bSh al() {
        InterfaceC3994bSh interfaceC3994bSh = this.homeTracking;
        if (interfaceC3994bSh != null) {
            return interfaceC3994bSh;
        }
        C8632dsu.d("");
        return null;
    }

    protected final InterfaceC5304bwI U() {
        InterfaceC5304bwI interfaceC5304bwI = this.adsPlanApplication;
        if (interfaceC5304bwI != null) {
            return interfaceC5304bwI;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cWC aB() {
        cWC cwc = this.uma;
        if (cwc != null) {
            return cwc;
        }
        C8632dsu.d("");
        return null;
    }

    protected final bXD aj() {
        bXD bxd = this.interstitials;
        if (bxd != null) {
            return bxd;
        }
        C8632dsu.d("");
        return null;
    }

    protected final Lazy<InterfaceC5425byX> V() {
        Lazy<InterfaceC5425byX> lazy = this.cfourSurvey;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final LifecycleAwareEpoxyViewBinder ai() {
        return (LifecycleAwareEpoxyViewBinder) this.l.getValue();
    }

    public void d(InterfaceC2023aX interfaceC2023aX) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8980gu.c(aq(), new drM<C4049bUi, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$buildHeader$1
            public final void b(C4049bUi c4049bUi) {
                C8632dsu.c((Object) c4049bUi, "");
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4049bUi c4049bUi) {
                b(c4049bUi);
                return dpR.c;
            }
        });
    }

    public C9935zP af_() {
        C9935zP.b bVar = C9935zP.b;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        return bVar.d(viewLifecycleOwner);
    }

    @Override // o.bMX, com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("arguments are required".toString());
        }
        Parcelable parcelable = arguments.getParcelable("com.netflix.mediaclient.ui.home.impl.lolomo.Params.Lolomo");
        if (parcelable != null) {
            this.y = (Params.Lolomo) parcelable;
            InterfaceC3994bSh al = al();
            InterfaceC3994bSh.b bVar = InterfaceC3994bSh.b;
            al.e(bVar.b());
            al.d(requireArguments().getBoolean("is_cold_start"));
            bVar.d(false);
            ay().d().c(false);
            AbstractC6677chn a2 = an().a();
            AbstractC6677chn b2 = an().b();
            if (a2 != null || b2 != null) {
                aq().d(a2, b2);
            }
            U().b(this.u);
            return;
        }
        throw new IllegalArgumentException("PARAMS_ARG_NAME is required".toString());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.n = true;
        setHasOptionsMenu(true);
        return layoutInflater.inflate(ap(), viewGroup, false);
    }

    protected c d(View view) {
        C8632dsu.c((Object) view, "");
        C4018bTe a2 = C4018bTe.a(view);
        C8632dsu.a(a2, "");
        FrameLayout frameLayout = a2.a;
        C8632dsu.a(frameLayout, "");
        bTX btx = a2.b;
        C8632dsu.a(btx, "");
        return new c(frameLayout, btx);
    }

    @Override // o.bMX, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (!isHidden()) {
            c(true);
        }
        C6717cia Q = Q();
        if (Q != null) {
            Q.b(this, au());
        }
        au().k();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        C6717cia Q = Q();
        if (Q != null) {
            Q.b();
        }
        au().n();
        c(false);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        e eVar;
        C6417ccs c2;
        HomeEpoxyController j2;
        HomeEpoxyController j3;
        C8632dsu.c((Object) view, "");
        aq().j();
        String string = view.getContext().getSharedPreferences(e, 0).getString("kidsMysteryToken", null);
        if (string != null) {
            aq().d(string);
        }
        c d2 = d(view);
        Context context = view.getContext();
        C8632dsu.a(context, "");
        C1729aMb i2 = InterfaceC6419ccu.d.i(context, 1);
        int a2 = LoMoUtils.a(requireContext());
        Context context2 = view.getContext();
        C8632dsu.a(context2, "");
        VerticalRowConfigLayoutManager b2 = b(context2, i2);
        final bTX c3 = d2.c();
        c3.setLayoutManager(b2);
        c3.setHasFixedSize(true);
        c3.setItemSpacingPx(0);
        C1619aI c1619aI = new C1619aI();
        c1619aI.d(c3);
        C4052bUl M = M();
        dwU e2 = aq().e();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        bSY bsy = new bSY(new bLU(e2, c1619aI, viewLifecycleOwner, new drX<InterfaceC3825bMa, AbstractC3179au, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$onViewCreated$homeVisibilityTracking$1
            @Override // o.drX
            public /* synthetic */ dpR invoke(InterfaceC3825bMa interfaceC3825bMa, AbstractC3179au abstractC3179au) {
                c(interfaceC3825bMa, abstractC3179au);
                return dpR.c;
            }

            public final void c(InterfaceC3825bMa interfaceC3825bMa, AbstractC3179au abstractC3179au) {
                bLP blp;
                drO<TrackingInfo> i3;
                C8632dsu.c((Object) interfaceC3825bMa, "");
                C8632dsu.c((Object) abstractC3179au, "");
                if (interfaceC3825bMa instanceof InterfaceC3829bMe) {
                    InterfaceC3829bMe interfaceC3829bMe = (InterfaceC3829bMe) interfaceC3825bMa;
                    CLv2Utils.b(!interfaceC3829bMe.h(abstractC3179au), interfaceC3829bMe.aj_(), interfaceC3829bMe.m().invoke(), null);
                }
                if (!(interfaceC3825bMa instanceof bLP) || (i3 = (blp = (bLP) interfaceC3825bMa).i()) == null) {
                    return;
                }
                CLv2Utils.b(true, blp.k(), i3.invoke(), null);
            }
        }, 0L, 0, null, null, 240, null), M);
        bLW d3 = d(c1619aI);
        this.f13274o = d3;
        this.C = F();
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        LolomoEpoxyController c4 = c(bsy, d3, c3, M.a(requireContext), new drO<MiniPlayerVideoGroupViewModel>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$onViewCreated$epoxyController$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final MiniPlayerVideoGroupViewModel invoke() {
                return LolomoMvRxFragment.this.au();
            }
        }, new drM<LoMo, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$onViewCreated$epoxyController$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(LoMo loMo) {
                c(loMo);
                return dpR.c;
            }

            public final void c(LoMo loMo) {
                C8632dsu.c((Object) loMo, "");
                LolomoMvRxFragment.this.e(loMo, "bind");
            }
        });
        if (C8153dex.f() || C8153dex.v()) {
            C8980gu.c(aq(), new drM<C4049bUi, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$onViewCreated$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C4049bUi c4049bUi) {
                    a(c4049bUi);
                    return dpR.c;
                }

                public final void a(C4049bUi c4049bUi) {
                    C8632dsu.c((Object) c4049bUi, "");
                    if (c4049bUi.a() == 0) {
                        LolomoMvRxFragment.this.aq().e(LolomoMvRxFragment.this.ab());
                    }
                }
            });
        }
        c3.setTag(aLX.a.d, c4.getDefaultConfig());
        c3.addItemDecoration(new C1731aMd());
        a aVar = k;
        aVar.getLogTag();
        b2.setSpanCount(a2);
        c4.setSpanCount(a2);
        b2.setSpanSizeLookup(c4.getSpanSizeLookup());
        c3.setAdapter(c4.getAdapter());
        e eVar2 = new e(d2.a(), c3, c4, bsy, C6455cdd.a.a(by_()), new C6417ccs(c3, this.r), new C6423ccy(this, aj(), V()), b2, false, 0, null, false, false, false, false, 32512, null);
        eVar2.m().c();
        this.s = eVar2;
        c3.addOnScrollListener(new f());
        if ((C8153dex.f() || C8153dex.v()) && (eVar = this.s) != null && (c2 = eVar.c()) != null) {
            c3.addOnScrollListener(c2.d());
        }
        aH();
        aK();
        aL();
        N();
        e();
        Bundle h2 = aq().h();
        aq().c((Bundle) null);
        Bundle bundle2 = bundle != null ? bundle.getBundle("LolomoMvRxFragment.EPOXY_STATE_SAVED_FLAG") : null;
        if (bundle2 != null) {
            aVar.getLogTag();
            e eVar3 = this.s;
            if (eVar3 != null && (j3 = eVar3.j()) != null) {
                j3.onRestoreInstanceState(bundle2);
            }
        } else if (h2 != null) {
            aVar.getLogTag();
            e eVar4 = this.s;
            if (eVar4 != null && (j2 = eVar4.j()) != null) {
                j2.onRestoreInstanceState(h2);
            }
        }
        if (!C8153dex.U()) {
            aVar.getLogTag();
            c4.addModelBuildListener(new InterfaceC4255bb() { // from class: o.bUe
                @Override // o.InterfaceC4255bb
                public final void b(C2755am c2755am) {
                    LolomoMvRxFragment.c(LolomoMvRxFragment.this, c3, c2755am);
                }
            });
        }
        InterfaceC1659aJm.b.e().c(c3, bx_(), "lolomo_vertical");
        LocalBroadcastManager.getInstance(requireActivity()).registerReceiver(this.b, new IntentFilter("com.netflix.mediaclient.intent.action.BILLBOARD_CHANGED"));
        aJ();
        if (!C8153dex.f()) {
            NetflixActionBar netflixActionBar = by_().getNetflixActionBar();
            ViewGroup g2 = netflixActionBar != null ? netflixActionBar.g() : null;
            NetflixActionBarInterstitials netflixActionBarInterstitials = g2 != null ? (NetflixActionBarInterstitials) g2.findViewById(C5398bxx.a.b) : null;
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            C8632dsu.a(viewLifecycleOwner2, "");
            C8737dwr.c(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new LolomoMvRxFragment$onViewCreated$11(netflixActionBarInterstitials, this, null), 3, null);
        }
        super.onViewCreated(view, bundle);
        this.n = false;
    }

    /* loaded from: classes4.dex */
    public static final class f extends RecyclerView.OnScrollListener {
        f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C8632dsu.c((Object) recyclerView, "");
            NetflixActivity bj_ = LolomoMvRxFragment.this.bj_();
            if (bj_ != null) {
                bj_.onScrolled(i2);
            }
            e ak = LolomoMvRxFragment.this.ak();
            if (ak != null) {
                LolomoMvRxFragment lolomoMvRxFragment = LolomoMvRxFragment.this;
                ak.b(lolomoMvRxFragment.L());
                NetflixActionBar requireNetflixActionBar = lolomoMvRxFragment.by_().requireNetflixActionBar();
                C8632dsu.a(requireNetflixActionBar, "");
                lolomoMvRxFragment.c(requireNetflixActionBar, ak.b());
                ak.c().e();
            }
            if (!aQS.a.b() || i2 >= 0) {
                return;
            }
            LolomoMvRxFragment.this.aq().k();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C8632dsu.c((Object) recyclerView, "");
            if (i == 1) {
                NetflixActivity bj_ = LolomoMvRxFragment.this.bj_();
                if (bj_ != null) {
                    bj_.endRenderNavigationLevelSession(IClientLogging.CompletionReason.canceled, null);
                }
                NetflixApplication.getInstance().b("onScrolled");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(LolomoMvRxFragment lolomoMvRxFragment, bTX btx, C2755am c2755am) {
        RecyclerView.LayoutManager layoutManager;
        C8632dsu.c((Object) lolomoMvRxFragment, "");
        C8632dsu.c((Object) btx, "");
        C8632dsu.c((Object) c2755am, "");
        if (lolomoMvRxFragment.t == null || lolomoMvRxFragment.isLoadingData() || (layoutManager = btx.getLayoutManager()) == null) {
            return;
        }
        layoutManager.onRestoreInstanceState(lolomoMvRxFragment.t);
        lolomoMvRxFragment.t = null;
    }

    protected bLW d(C1619aI c1619aI) {
        C8632dsu.c((Object) c1619aI, "");
        dwU e2 = aq().e();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        return new bLW(e2, c1619aI, viewLifecycleOwner, 0L, 0, new drM<bLR<?>, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$createEpoxyAutoPlay$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(bLR<?> blr) {
                c(blr);
                return dpR.c;
            }

            public final void c(bLR<?> blr) {
                C8632dsu.c((Object) blr, "");
                LolomoMvRxFragment.k.getLogTag();
            }
        }, new drM<bLR<?>, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$createEpoxyAutoPlay$2
            @Override // o.drM
            public /* synthetic */ dpR invoke(bLR<?> blr) {
                d(blr);
                return dpR.c;
            }

            public final void d(bLR<?> blr) {
                C8632dsu.c((Object) blr, "");
                LolomoMvRxFragment.k.getLogTag();
            }
        }, null, 152, null);
    }

    protected C4052bUl M() {
        return new C4052bUl(by_(), aq());
    }

    private final void aJ() {
        DisposableKt.plusAssign(bk_(), SubscribersKt.subscribeBy$default(af_().d(AbstractC6719cic.class), (drM) null, (drO) null, new drM<AbstractC6719cic, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$subscribeToMiniPlayerEvents$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void a(AbstractC6719cic abstractC6719cic) {
                C8632dsu.c((Object) abstractC6719cic, "");
                LolomoMvRxFragment.this.d(abstractC6719cic);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC6719cic abstractC6719cic) {
                a(abstractC6719cic);
                return dpR.c;
            }
        }, 3, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(AbstractC6719cic abstractC6719cic) {
        if (abstractC6719cic instanceof AbstractC6719cic.b) {
            if (au().f()) {
                aE();
            }
        } else if (abstractC6719cic instanceof AbstractC6719cic.a) {
            AbstractC6719cic.a aVar = (AbstractC6719cic.a) abstractC6719cic;
            au().a(Integer.parseInt(aVar.c()));
            au().d(Integer.valueOf(aVar.d()));
            au().b(Integer.valueOf(aVar.d()));
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.bFP
    public boolean o() {
        if (au().f()) {
            aE();
            return true;
        }
        return super.o();
    }

    private final void aE() {
        Object b2;
        FragmentActivity activity = getActivity();
        if (activity == null || C9737vz.a(activity) || (b2 = C9737vz.b(activity, Activity.class)) == null) {
            return;
        }
        ((Activity) b2).setRequestedOrientation(1);
        au().b();
    }

    private final VerticalRowConfigLayoutManager b(Context context, C1729aMb c1729aMb) {
        return new VerticalRowConfigLayoutManager(context, c1729aMb);
    }

    @Override // o.bFO
    public Parcelable a() {
        e eVar;
        bTX n;
        RecyclerView.LayoutManager layoutManager;
        if (C8153dex.U() || (eVar = this.s) == null || (n = eVar.n()) == null || (layoutManager = n.getLayoutManager()) == null) {
            return null;
        }
        return layoutManager.onSaveInstanceState();
    }

    @Override // o.bFO
    public void e(Parcelable parcelable) {
        if (C8153dex.U()) {
            return;
        }
        this.t = parcelable;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onPause() {
        C8980gu.c(aq(), new drM<C4049bUi, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$onPause$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4049bUi c4049bUi) {
                b(c4049bUi);
                return dpR.c;
            }

            public final void b(C4049bUi c4049bUi) {
                C8632dsu.c((Object) c4049bUi, "");
                super/*com.netflix.mediaclient.android.fragment.NetflixFrag*/.onPause();
                NetflixApplication.getInstance().b("onPause");
                LolomoMvRxFragment.this.af_().b(AbstractC6719cic.class, new AbstractC6719cic.e.C0117e(0, 40));
            }
        });
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        HomeEpoxyController j2;
        C8632dsu.c((Object) configuration, "");
        super.onConfigurationChanged(configuration);
        e eVar = this.s;
        if (eVar != null && (j2 = eVar.j()) != null) {
            j2.onConfigChanged();
        }
        C6717cia Q = Q();
        if (Q != null) {
            Q.a(this, au(), configuration);
        }
        e();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        HomeEpoxyController j2;
        e eVar = this.s;
        if (eVar != null && (j2 = eVar.j()) != null) {
            Bundle bundle = new Bundle();
            j2.onSaveInstanceState(bundle);
            aq().c(bundle);
        }
        LocalBroadcastManager.getInstance(requireActivity()).unregisterReceiver(this.b);
        e eVar2 = this.s;
        if (eVar2 != null) {
            eVar2.m().b();
            eVar2.m().e();
            this.r = eVar2.c().b();
            this.s = null;
        }
        super.onDestroyView();
        aq().f();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroy() {
        C4048bUh c4048bUh = this.C;
        if (c4048bUh != null) {
            Context requireContext = requireContext();
            C8632dsu.a(requireContext, "");
            c4048bUh.c(requireContext);
        }
        U().d(this.u);
        super.onDestroy();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        HomeEpoxyController j2;
        C8632dsu.c((Object) bundle, "");
        e eVar = this.s;
        if (eVar != null && (j2 = eVar.j()) != null) {
            Bundle bundle2 = new Bundle();
            j2.onSaveInstanceState(bundle2);
            bundle.putBundle("LolomoMvRxFragment.EPOXY_STATE_SAVED_FLAG", bundle2);
        } else {
            Bundle h2 = aq().h();
            if (h2 != null) {
                bundle.putBundle("LolomoMvRxFragment.EPOXY_STATE_SAVED_FLAG", h2);
            }
        }
        super.onSaveInstanceState(bundle);
    }

    public CoordinatorLayout.Behavior<View> W() {
        NetflixActivity bj_ = bj_();
        NetflixActionBar netflixActionBar = bj_ != null ? bj_.getNetflixActionBar() : null;
        if (this.z == null && netflixActionBar != null) {
            final ViewGroup g2 = netflixActionBar.g();
            this.z = new ScrollAwayClipByHeightBehaviour<View>(g2) { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$getActionBarBehaviorOverride$1
                @Override // com.netflix.android.widgetry.widget.ScrollAwayBehavior
                public int b(Context context) {
                    boolean aG;
                    C8632dsu.c((Object) context, "");
                    int b2 = super.b(context);
                    aG = LolomoMvRxFragment.this.aG();
                    return b2 + (aG ? context.getResources().getDimensionPixelSize(R.b.V) : 0);
                }
            };
        }
        return this.z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean aG() {
        return Config_Ab55851_MobileNav.a.d().h() && C8632dsu.c((Object) av().e(), (Object) "lolomo");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
        if (r4 != false) goto L30;
     */
    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean bD_() {
        /*
            r12 = this;
            com.netflix.mediaclient.android.activity.NetflixActivity r0 = r12.bj_()
            com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$e r1 = r12.s
            boolean r2 = r12.isHidden()
            r3 = 0
            if (r2 != 0) goto Led
            if (r0 == 0) goto Led
            if (r1 == 0) goto Led
            com.netflix.mediaclient.ui.home.api.Params$Lolomo r2 = r12.av()
            java.lang.String r2 = r2.c()
            java.lang.String r4 = "lolomo"
            r5 = 1
            if (r2 != 0) goto L2c
            com.netflix.mediaclient.ui.home.api.Params$Lolomo r2 = r12.av()
            java.lang.String r2 = r2.e()
            boolean r2 = android.text.TextUtils.equals(r2, r4)
            if (r2 == 0) goto L83
        L2c:
            com.netflix.mediaclient.android.widget.NetflixActionBar r2 = r0.getNetflixActionBar()
            boolean r6 = r0 instanceof com.netflix.mediaclient.ui.home.HomeActivity
            if (r6 == 0) goto L83
            if (r2 == 0) goto L83
            com.netflix.mediaclient.ui.home.HomeActivity r0 = (com.netflix.mediaclient.ui.home.HomeActivity) r0
            o.cdd r6 = r0.o()
            if (r6 == 0) goto L67
            com.netflix.mediaclient.ui.home.api.Params$Lolomo r0 = r12.av()
            java.lang.String r0 = r0.c()
            if (r0 != 0) goto L4a
            r8 = r4
            goto L4b
        L4a:
            r8 = r0
        L4b:
            com.netflix.mediaclient.ui.home.api.Params$Lolomo r0 = r12.av()
            java.lang.String r9 = r0.e()
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r10 = r12.W()
            boolean r11 = r12.X()
            r7 = r12
            r6.a(r7, r8, r9, r10, r11)
            int r0 = r1.b()
            r12.c(r2, r0)
            goto L82
        L67:
            com.netflix.mediaclient.android.activity.NetflixActivity r0 = r12.by_()
            com.netflix.mediaclient.android.widget.NetflixActionBar r0 = r0.requireNetflixActionBar()
            com.netflix.mediaclient.android.activity.NetflixActivity r1 = r12.by_()
            com.netflix.mediaclient.android.widget.NetflixActionBar$b$b r1 = r12.a(r1)
            com.netflix.mediaclient.android.widget.NetflixActionBar$b$b r1 = r1.d(r12)
            com.netflix.mediaclient.android.widget.NetflixActionBar$b r1 = r1.c()
            r0.c(r1)
        L82:
            return r5
        L83:
            com.netflix.mediaclient.ui.home.api.Params$Lolomo r2 = r12.av()
            com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem r2 = r2.d()
            if (r2 == 0) goto L92
            java.lang.String r2 = r2.getTitle()
            goto L93
        L92:
            r2 = 0
        L93:
            if (r2 == 0) goto L9b
            boolean r4 = o.C8684dus.a(r2)
            if (r4 == 0) goto L9f
        L9b:
            java.lang.String r2 = r12.K()
        L9f:
            com.netflix.mediaclient.android.widget.NetflixActionBar r4 = r0.getNetflixActionBar()
            if (r4 == 0) goto Led
            com.netflix.mediaclient.android.widget.NetflixActionBar$b$b r0 = r0.getActionBarStateBuilder()
            android.graphics.drawable.Drawable r6 = r1.a()
            r0.c(r6)
            r0.e(r2)
            if (r2 == 0) goto Lca
            boolean r2 = o.C8684dus.a(r2)
            if (r2 == 0) goto Lbc
            goto Lca
        Lbc:
            boolean r2 = r12.aI()
            if (r2 != 0) goto Lc3
            goto Lca
        Lc3:
            r0.l(r5)
            r0.b(r3)
            goto Ldb
        Lca:
            r0.l(r3)
            boolean r2 = r12.S()
            if (r2 != 0) goto Ldb
            r0.b(r5)
            com.netflix.mediaclient.android.widget.NetflixActionBar$LogoType r2 = com.netflix.mediaclient.android.widget.NetflixActionBar.LogoType.b
            r0.b(r2)
        Ldb:
            r0.d(r12)
            com.netflix.mediaclient.android.widget.NetflixActionBar$b r0 = r0.c()
            r4.c(r0)
            int r0 = r1.b()
            r12.c(r4, r0)
            return r5
        Led:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.bD_():boolean");
    }

    private final boolean aI() {
        return ((Boolean) C8980gu.c(aq(), new drM<C4049bUi, Boolean>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$showTitleIfAvailable$1
            @Override // o.drM
            /* renamed from: e */
            public final Boolean invoke(C4049bUi c4049bUi) {
                C8632dsu.c((Object) c4049bUi, "");
                return Boolean.valueOf(c4049bUi.v());
            }
        })).booleanValue();
    }

    private final boolean S() {
        return ((Boolean) C8980gu.c(aq(), new drM<C4049bUi, Boolean>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$hideLogo$1
            @Override // o.drM
            /* renamed from: c */
            public final Boolean invoke(C4049bUi c4049bUi) {
                C8632dsu.c((Object) c4049bUi, "");
                return Boolean.valueOf(c4049bUi.f());
            }
        })).booleanValue();
    }

    private final String K() {
        return (String) C8980gu.c(aq(), new drM<C4049bUi, String>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$getLolomoTitle$1
            @Override // o.drM
            /* renamed from: b */
            public final String invoke(C4049bUi c4049bUi) {
                C8632dsu.c((Object) c4049bUi, "");
                InterfaceC5155btS c2 = c4049bUi.n().c();
                if (c2 != null) {
                    return c2.getTitle();
                }
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(NetflixActionBar netflixActionBar, int i2) {
        C6455cdd.a.b(netflixActionBar, R(), i2, e(netflixActionBar));
    }

    public int e(NetflixActionBar netflixActionBar) {
        C8632dsu.c((Object) netflixActionBar, "");
        return netflixActionBar.i() * 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int L() {
        View childAt;
        e eVar = this.s;
        if (eVar == null || !(eVar.n().getLayoutManager() instanceof LinearLayoutManager)) {
            return Integer.MAX_VALUE;
        }
        RecyclerView.LayoutManager layoutManager = eVar.n().getLayoutManager();
        C8632dsu.d(layoutManager);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0) {
            return 0;
        }
        if (linearLayoutManager.findFirstVisibleItemPosition() != 0 || (childAt = eVar.n().getChildAt(0)) == null) {
            return Integer.MAX_VALUE;
        }
        if (eVar.n().computeVerticalScrollOffset() == 0 || childAt.getY() == 0.0f) {
            return 0;
        }
        return eVar.n().computeVerticalScrollOffset();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean R() {
        return ((Boolean) C8980gu.c(aq(), new drM<C4049bUi, Boolean>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$isTopOfLolomoTranslucent$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(C4049bUi c4049bUi) {
                boolean z;
                C6423ccy m;
                C8632dsu.c((Object) c4049bUi, "");
                boolean z2 = true;
                if (!C8171dfO.e() && (c4049bUi.d() || (!C8632dsu.c((Object) c4049bUi.b(), (Object) "games") && c4049bUi.h()))) {
                    Context requireContext = LolomoMvRxFragment.this.requireContext();
                    C8632dsu.a(requireContext, "");
                    if (InterfaceC6419ccu.c.b(requireContext) || (C8153dex.N() && !c4049bUi.h())) {
                        z = true;
                        LolomoMvRxFragment.e ak = LolomoMvRxFragment.this.ak();
                        boolean z3 = (ak == null && (m = ak.m()) != null && m.d()) || c4049bUi.m() != null;
                        if (z || z3 || c4049bUi.g()) {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    }
                }
                z = false;
                LolomoMvRxFragment.e ak2 = LolomoMvRxFragment.this.ak();
                if (ak2 == null) {
                }
                if (z) {
                }
                z2 = false;
                return Boolean.valueOf(z2);
            }
        })).booleanValue();
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return ((Boolean) C8980gu.c(aq(), new drM<C4049bUi, Boolean>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$isLoadingData$1
            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(C4049bUi c4049bUi) {
                C8632dsu.c((Object) c4049bUi, "");
                return Boolean.valueOf(c4049bUi.n() instanceof InterfaceC8881fA);
            }
        })).booleanValue();
    }

    public void e() {
        C8980gu.c(aq(), new drM<C4049bUi, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$invalidate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4049bUi c4049bUi) {
                d(c4049bUi);
                return dpR.c;
            }

            /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00de A[ADDED_TO_REGION] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void d(o.C4049bUi r15) {
                /*
                    Method dump skipped, instructions count: 672
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$invalidate$1.d(o.bUi):void");
            }
        });
    }

    public boolean b(C4049bUi c4049bUi, bTL btl) {
        C8632dsu.c((Object) c4049bUi, "");
        if (btl == null || !btl.f()) {
            return false;
        }
        Context context = getContext();
        if (((context == null || !InterfaceC6419ccu.c.b(context)) && !C8153dex.N()) || C8171dfO.e()) {
            return false;
        }
        if (context == null || !c(context, btl)) {
            BillboardAsset a2 = btl.a();
            return (a2 != null ? a2.getWidth() : null) != null;
        }
        return true;
    }

    private final boolean c(Context context, bTL btl) {
        if (btl == null) {
            return false;
        }
        return (C8153dex.f() && !btl.i()) || (C8153dex.v() && !C8151dev.j(context) && btl.i());
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void d(Status status) {
        ServiceManager bl_;
        C8632dsu.c((Object) status, "");
        super.d(status);
        e eVar = this.s;
        if (eVar != null) {
            eVar.m().a();
            String c2 = av().c();
            if (c2 == null || C6452cda.e(c2)) {
                return;
            }
            InterfaceC5155btS ag_ = ag_();
            if ((ag_ == null || !C4050bUj.e(ag_)) && R() && (bl_ = bl_()) != null) {
                C8737dwr.c(LifecycleOwnerKt.getLifecycleScope(this), null, null, new LolomoMvRxFragment$onLoaded$1$1$1$1(bl_, this, null), 3, null);
            }
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bs_() {
        return ((Boolean) C8980gu.c(aq(), new drM<C4049bUi, Boolean>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$onLoadedExpectingNoImages$1
            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(C4049bUi c4049bUi) {
                C8632dsu.c((Object) c4049bUi, "");
                return Boolean.valueOf(c4049bUi.w());
            }
        })).booleanValue();
    }

    @Override // o.bRZ
    public InterfaceC5155btS ag_() {
        return (InterfaceC5155btS) C8980gu.c(aq(), new drM<C4049bUi, InterfaceC5155btS>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$lolomoSummary$1
            @Override // o.drM
            /* renamed from: c */
            public final InterfaceC5155btS invoke(C4049bUi c4049bUi) {
                C8632dsu.c((Object) c4049bUi, "");
                return c4049bUi.n().c();
            }
        });
    }

    @Override // o.bRZ
    public void a(int i2, int i3, String str) {
        e eVar = this.s;
        if (eVar != null) {
            if (i2 == 1) {
                eVar.m().a();
            }
            aq().b(i2, i3, str);
        }
    }

    @Override // o.bRZ
    public void a(boolean z) {
        e eVar = this.s;
        if (eVar != null) {
            if (z) {
                eVar.n().smoothScrollToPosition(0);
            } else {
                eVar.n().scrollToPosition(0);
            }
            ScrollAwayClipByHeightBehaviour<View> scrollAwayClipByHeightBehaviour = this.z;
            if (scrollAwayClipByHeightBehaviour != null) {
                scrollAwayClipByHeightBehaviour.d();
            }
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public Map<String, String> bC_() {
        return al().d(ag_());
    }

    @Override // o.bRZ
    public void a(Context context, Map<String, String> map) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) map, "");
        al().e(ag_(), (Map) C9726vo.d(map, Map.class));
    }

    private final void aH() {
        DisposableKt.plusAssign(this.f, SubscribersKt.subscribeBy$default(af_().d(bSJ.class), (drM) null, (drO) null, new drM<bSJ, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$subscribeEvents$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(bSJ bsj) {
                b(bsj);
                return dpR.c;
            }

            public final void b(bSJ bsj) {
                C8632dsu.c((Object) bsj, "");
                if (bsj instanceof bSJ.a) {
                    LolomoMvRxFragment.e ak = LolomoMvRxFragment.this.ak();
                    if (ak != null) {
                        bSJ.a aVar = (bSJ.a) bsj;
                        ak.c().c(aVar.d());
                        C9893ya g2 = ak.n().g();
                        if (g2 == null || g2.d() == aVar.d()) {
                            return;
                        }
                        g2.a(aVar.d());
                        ak.n().invalidateItemDecorations();
                    }
                } else if (!(bsj instanceof bSJ.h)) {
                    if (!(bsj instanceof bSJ.o)) {
                        if (!(bsj instanceof bSJ.j)) {
                            if (bsj instanceof bSJ.n) {
                                bSJ.n nVar = (bSJ.n) bsj;
                                if (nVar.b() == null) {
                                    LolomoMvRxFragment.k.getLogTag();
                                    InterfaceC1593aHa.c.a("HomeEvent.Retry: fetchLolomo is called with RefreshType.HARD");
                                    bTF.c(LolomoMvRxFragment.this.aq(), 1, 0, null, 6, null);
                                    return;
                                }
                                LolomoMvRxFragment.k.getLogTag();
                                InterfaceC1593aHa.a aVar2 = InterfaceC1593aHa.c;
                                String listId = nVar.b().getListId();
                                String listContext = nVar.b().getListContext();
                                int listPos = nVar.b().getListPos();
                                int e2 = nVar.e();
                                aVar2.a("HomeEvent.Retry: fetchTitles is called for listId = " + listId + " listContext = " + listContext + " listPosition = " + listPos + " from = " + e2);
                                bTF.a(LolomoMvRxFragment.this.aq(), nVar.b(), nVar.e(), false, 4, (Object) null);
                                return;
                            } else if (!(bsj instanceof bSJ.c)) {
                                if (bsj instanceof bSJ.g) {
                                    LolomoMvRxFragment.this.by_().startActivity(InterfaceC6905cmC.e.b(LolomoMvRxFragment.this.at(), false, 1, null));
                                    return;
                                } else if (bsj instanceof bSJ.f) {
                                    LolomoMvRxFragment.this.by_().startActivity(LolomoMvRxFragment.this.at().e(true));
                                    return;
                                } else if (bsj instanceof bSJ.d) {
                                    LolomoMvRxFragment.this.aq().d(((bSJ.d) bsj).b());
                                    return;
                                } else if (bsj instanceof bSJ.e) {
                                    return;
                                } else {
                                    if (bsj instanceof bSJ.b) {
                                        bSJ.b bVar = (bSJ.b) bsj;
                                        if (bVar.c()) {
                                            LolomoMvRxFragment.this.aD();
                                            Context context = LolomoMvRxFragment.this.getContext();
                                            if (context != null) {
                                                AccessibilityUtils.b(context, C1333Xq.d(C4022bTi.g.a).d(SignupConstants.Field.VIDEO_TITLE, bVar.b()).c());
                                                return;
                                            }
                                            return;
                                        }
                                        LolomoMvRxFragment.this.aq().e(bVar.a());
                                        LolomoMvRxFragment.this.b(bVar.a());
                                        return;
                                    } else if (bsj instanceof bSJ.i) {
                                        LolomoMvRxFragment.this.aq().e(((bSJ.i) bsj).e());
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                LolomoMvRxFragment.k.getLogTag();
                                LolomoMvRxFragment.this.aq().g();
                                return;
                            }
                        }
                        LolomoMvRxFragment.k.getLogTag();
                        InterfaceC1593aHa.a aVar3 = InterfaceC1593aHa.c;
                        bSJ.j jVar = (bSJ.j) bsj;
                        String listId2 = jVar.d().getListId();
                        String listContext2 = jVar.d().getListContext();
                        int listPos2 = jVar.d().getListPos();
                        int e3 = jVar.e();
                        aVar3.a("HomeEvent.MoreTitlesNeeded: fetchTitles is called for listId = " + listId2 + " listContext = " + listContext2 + " listPosition = " + listPos2 + " from = " + e3);
                        bTF.a(LolomoMvRxFragment.this.aq(), jVar.d(), jVar.e(), false, 4, (Object) null);
                        return;
                    }
                    LolomoMvRxFragment.k.getLogTag();
                    LolomoMvRxFragment.this.aq().b(((bSJ.o) bsj).c());
                } else {
                    LolomoMvRxFragment.k.getLogTag();
                    InterfaceC1593aHa.a aVar4 = InterfaceC1593aHa.c;
                    bSJ.h hVar = (bSJ.h) bsj;
                    int c2 = hVar.c();
                    aVar4.a("HomeEvent.MoreRowsNeeded: fetchMoreRows is called from = " + c2);
                    LolomoMvRxFragment.this.aq().a(hVar.c());
                }
            }
        }, 3, (Object) null));
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onHiddenChanged(final boolean z) {
        C8980gu.c(aq(), new drM<C4049bUi, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$onHiddenChanged$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4049bUi c4049bUi) {
                c(c4049bUi);
                return dpR.c;
            }

            public final void c(C4049bUi c4049bUi) {
                bLW blw;
                bSY f2;
                List<LoMo> c2;
                boolean a2;
                C8632dsu.c((Object) c4049bUi, "");
                if (z) {
                    NetflixApplication.getInstance().b("onHiddenChanged");
                }
                if (!z && (c2 = c4049bUi.r().c()) != null) {
                    LolomoMvRxFragment lolomoMvRxFragment = this;
                    ArrayList<LoMo> arrayList = new ArrayList();
                    for (Object obj : c2) {
                        a2 = lolomoMvRxFragment.a((LoMo) obj);
                        if (a2) {
                            arrayList.add(obj);
                        }
                    }
                    LolomoMvRxFragment lolomoMvRxFragment2 = this;
                    for (LoMo loMo : arrayList) {
                        lolomoMvRxFragment2.e(loMo, "hidden");
                    }
                }
                this.c(!z);
                LolomoMvRxFragment.e ak = this.ak();
                if (ak != null && (f2 = ak.f()) != null) {
                    f2.d(z);
                }
                blw = this.f13274o;
                if (blw != null) {
                    blw.e(z);
                }
                super/*com.netflix.mediaclient.android.fragment.NetflixFrag*/.onHiddenChanged(z);
            }
        });
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onResume() {
        C8980gu.c(aq(), new drM<C4049bUi, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$onResume$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4049bUi c4049bUi) {
                a(c4049bUi);
                return dpR.c;
            }

            public final void a(C4049bUi c4049bUi) {
                boolean a2;
                C8632dsu.c((Object) c4049bUi, "");
                List<LoMo> c2 = c4049bUi.r().c();
                if (c2 != null) {
                    LolomoMvRxFragment lolomoMvRxFragment = LolomoMvRxFragment.this;
                    for (LoMo loMo : c2) {
                        a2 = lolomoMvRxFragment.a(loMo);
                        if (a2) {
                            lolomoMvRxFragment.e(loMo, "resume");
                        }
                        if (!loMo.needsRefresh() && loMo.isVolatile()) {
                            bTF.d(lolomoMvRxFragment.aq(), loMo.getListPos(), false, 2, null);
                        }
                    }
                }
                super/*com.netflix.mediaclient.android.fragment.NetflixFrag*/.onResume();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(final LoMo loMo) {
        return ((Boolean) C8980gu.c(aq(), new drM<C4049bUi, Boolean>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$isRowBoundToRecyclerView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final Boolean invoke(C4049bUi c4049bUi) {
                boolean isBound;
                HomeEpoxyController j2;
                C8632dsu.c((Object) c4049bUi, "");
                if (LolomoMvRxFragment.this.aA()) {
                    isBound = true;
                } else {
                    LolomoMvRxFragment.e ak = LolomoMvRxFragment.this.ak();
                    isBound = (ak == null || (j2 = ak.j()) == null) ? false : j2.isBound(loMo);
                }
                return Boolean.valueOf(isBound);
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean aA() {
        return ((Boolean) C8980gu.c(aq(), new drM<C4049bUi, Boolean>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$isFlatGallery$1
            @Override // o.drM
            /* renamed from: c */
            public final Boolean invoke(C4049bUi c4049bUi) {
                C8632dsu.c((Object) c4049bUi, "");
                InterfaceC5155btS c2 = c4049bUi.n().c();
                return Boolean.valueOf(c2 != null ? C4050bUj.e(c2) : false);
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(LoMo loMo, String str) {
        if (loMo.isVolatile() && loMo.needsRefresh()) {
            aq().c(loMo);
        }
    }

    public int ab() {
        return this.i + ((NetflixFrag) this).d + this.g + O() + P();
    }

    private final int P() {
        return ((Number) C8980gu.c(aq(), new drM<C4049bUi, Integer>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$getTopPaddingAdjustment$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final Integer invoke(C4049bUi c4049bUi) {
                Resources resources;
                C8632dsu.c((Object) c4049bUi, "");
                int i2 = 0;
                if (!c4049bUi.d() && Config_Ab55851_MobileNav.a.a()) {
                    FragmentActivity activity = LolomoMvRxFragment.this.getActivity();
                    if (activity != null && (resources = activity.getResources()) != null) {
                        i2 = resources.getDimensionPixelSize(R.b.w);
                    }
                    i2 = -i2;
                }
                return Integer.valueOf(i2);
            }
        })).intValue();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(final View view) {
        C8632dsu.c((Object) view, "");
        C8980gu.c(aq(), new drM<C4049bUi, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$applyActivityPadding$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C4049bUi c4049bUi) {
                b(c4049bUi);
                return dpR.c;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void b(o.C4049bUi r11) {
                /*
                    r10 = this;
                    java.lang.String r0 = ""
                    o.C8632dsu.c(r11, r0)
                    com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment r0 = com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.this
                    com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$e r0 = r0.ak()
                    if (r0 == 0) goto Lde
                    com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment r1 = com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.this
                    android.view.View r2 = r2
                    com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig$b r3 = com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig.Companion
                    boolean r3 = r3.c()
                    r4 = 0
                    if (r3 == 0) goto L35
                    com.netflix.mediaclient.android.activity.NetflixActivity r3 = r1.bj_()
                    if (r3 == 0) goto L2b
                    com.netflix.mediaclient.android.widget.NetflixActionBar r3 = r3.getNetflixActionBar()
                    if (r3 == 0) goto L2b
                    androidx.fragment.app.Fragment r3 = r3.h()
                    goto L2c
                L2b:
                    r3 = 0
                L2c:
                    boolean r3 = o.C8632dsu.c(r3, r1)
                    if (r3 == 0) goto L33
                    goto L35
                L33:
                    r3 = r4
                    goto L36
                L35:
                    r3 = 1
                L36:
                    boolean r5 = o.C8153dex.f()
                    if (r5 == 0) goto L4a
                    if (r3 == 0) goto L4a
                    o.bTF r5 = r1.aq()
                    com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$applyActivityPadding$1$1$1 r6 = new com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$applyActivityPadding$1$1$1
                    r6.<init>()
                    o.C8980gu.c(r5, r6)
                L4a:
                    boolean r5 = r1.R()
                    if (r5 == 0) goto L52
                    r5 = r4
                    goto L56
                L52:
                    int r5 = r1.ab()
                L56:
                    if (r3 == 0) goto L71
                    o.chn r6 = r11.m()
                    if (r6 == 0) goto L71
                    android.view.View r6 = r0.h()
                    int r7 = r6.getPaddingLeft()
                    int r8 = r6.getPaddingRight()
                    int r9 = r6.getPaddingBottom()
                    r6.setPadding(r7, r5, r8, r9)
                L71:
                    if (r3 == 0) goto Lbc
                    boolean r3 = r1.R()
                    if (r3 != 0) goto La9
                    o.chn r3 = r11.m()
                    if (r3 != 0) goto La9
                    o.aRm$d r3 = o.C1875aRm.a
                    boolean r3 = r3.d()
                    if (r3 == 0) goto L95
                    java.lang.String r11 = r11.b()
                    java.lang.String r3 = "mobileFeeds"
                    boolean r11 = o.C8632dsu.c(r11, r3)
                    if (r11 == 0) goto L95
                    r11 = r2
                    goto L99
                L95:
                    o.bTX r11 = r0.n()
                L99:
                    int r3 = r11.getPaddingLeft()
                    int r4 = r11.getPaddingRight()
                    int r6 = r11.getPaddingBottom()
                    r11.setPadding(r3, r5, r4, r6)
                    goto Lbc
                La9:
                    o.bTX r11 = r0.n()
                    int r3 = r11.getPaddingLeft()
                    int r5 = r11.getPaddingRight()
                    int r6 = r11.getPaddingBottom()
                    r11.setPadding(r3, r4, r5, r6)
                Lbc:
                    o.bTX r11 = r0.n()
                    int r0 = com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment.b(r1)
                    android.content.res.Resources r1 = r2.getResources()
                    int r2 = com.netflix.mediaclient.ui.R.b.q
                    int r1 = r1.getDimensionPixelSize(r2)
                    int r2 = r11.getPaddingLeft()
                    int r3 = r11.getPaddingTop()
                    int r4 = r11.getPaddingRight()
                    int r0 = r0 + r1
                    r11.setPadding(r2, r3, r4, r0)
                Lde:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$applyActivityPadding$1.b(o.bUi):void");
            }
        });
    }

    @Override // o.bRZ
    public boolean ac_() {
        return !an().d();
    }

    @Override // o.bRZ
    /* renamed from: ao */
    public bTX ab_() {
        e eVar = this.s;
        if (eVar != null) {
            return eVar.n();
        }
        return null;
    }

    @Override // o.bRZ
    public void aa_() {
        e eVar = this.s;
        if (eVar != null) {
            e(eVar.n());
        }
    }

    @Override // o.bRZ
    public void ad_() {
        e eVar = this.s;
        if (eVar != null) {
            NetflixActionBar requireNetflixActionBar = by_().requireNetflixActionBar();
            C8632dsu.a(requireNetflixActionBar, "");
            c(requireNetflixActionBar, eVar.b());
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void br_() {
        aw().h();
    }

    @Override // o.bRZ
    public void G() {
        if (ConfigFastPropertyFeatureControlConfig.Companion.f()) {
            ServiceManager bl_ = bl_();
            if (bl_ != null) {
                bl_.e(true);
                return;
            }
            return;
        }
        ServiceManager bl_2 = bl_();
        if (bl_2 != null) {
            bl_2.N();
        }
    }

    private final void N() {
        int i2;
        if (av().a()) {
            this.y = Params.Lolomo.b(av(), null, null, null, null, false, false, 31, null);
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putParcelable("com.netflix.mediaclient.ui.home.impl.lolomo.Params.Lolomo", av());
            }
            i2 = 1;
        } else {
            i2 = 0;
        }
        bTF.c(aq(), i2, 0, null, 6, null);
    }

    public final NetflixActionBar.b.C0051b a(NetflixActivity netflixActivity) {
        C8632dsu.c((Object) netflixActivity, "");
        NetflixActionBar.b.C0051b b2 = netflixActivity.getActionBarStateBuilder().b(NetflixActionBar.LogoType.e);
        Config_Ab55851_MobileNav.c cVar = Config_Ab55851_MobileNav.a;
        return b2.b(!cVar.d().j()).h(true).i(true).f(!cVar.d().j()).j(cVar.d().j()).l(false).k(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public static final class c {
        private final bTX a;
        private final FrameLayout b;

        public final FrameLayout a() {
            return this.b;
        }

        public final bTX c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c(this.b, cVar.b) && C8632dsu.c(this.a, cVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            FrameLayout frameLayout = this.b;
            bTX btx = this.a;
            return "UIBinding(header=" + frameLayout + ", lolomo=" + btx + ")";
        }

        public c(FrameLayout frameLayout, bTX btx) {
            C8632dsu.c((Object) frameLayout, "");
            C8632dsu.c((Object) btx, "");
            this.b = frameLayout;
            this.a = btx;
        }
    }

    /* loaded from: classes4.dex */
    final class b implements InterfaceC5307bwL {
        public b() {
        }

        @Override // o.InterfaceC5307bwL
        public void a(boolean z) {
            LolomoMvRxFragment.this.aC();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void aC() {
        a(1, 0, (String) null);
        aq().d(an().a(), an().b());
    }

    private final void aK() {
        if (C1860aQy.b.e().c()) {
            CompositeDisposable compositeDisposable = this.f;
            Observable d2 = af_().d(bSJ.class);
            final LolomoMvRxFragment$subscribeToCollectTestPrefetchEvent$1 lolomoMvRxFragment$subscribeToCollectTestPrefetchEvent$1 = new drM<bSJ, Boolean>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$subscribeToCollectTestPrefetchEvent$1
                @Override // o.drM
                /* renamed from: c */
                public final Boolean invoke(bSJ bsj) {
                    C8632dsu.c((Object) bsj, "");
                    return Boolean.valueOf(bsj instanceof bSJ.e);
                }
            };
            Observable take = d2.filter(new Predicate() { // from class: o.bUc
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean d3;
                    d3 = LolomoMvRxFragment.d(drM.this, obj);
                    return d3;
                }
            }).take(1L);
            C8632dsu.a(take, "");
            DisposableKt.plusAssign(compositeDisposable, SubscribersKt.subscribeBy$default(take, (drM) null, (drO) null, new drM<bSJ, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$subscribeToCollectTestPrefetchEvent$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                /* loaded from: classes4.dex */
                public static final class d extends dqT implements CoroutineExceptionHandler {
                    public d(CoroutineExceptionHandler.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlinx.coroutines.CoroutineExceptionHandler
                    public void handleException(dqZ dqz, Throwable th) {
                        Throwable th2;
                        if (aCP.a(th) || aCP.c(th)) {
                            return;
                        }
                        InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                        C1596aHd b = new C1596aHd("SPY-36843: Collect Taste: Errors during prefetchCollectTasteMetadata call", null, null, false, null, false, false, 126, null).b(ErrorType.l).d(th).b(false);
                        ErrorType errorType = b.a;
                        if (errorType != null) {
                            b.e.put("errorType", errorType.c());
                            String b2 = b.b();
                            if (b2 != null) {
                                String c = errorType.c();
                                b.a(c + " " + b2);
                            }
                        }
                        if (b.b() != null && b.i != null) {
                            th2 = new Throwable(b.b(), b.i);
                        } else if (b.b() != null) {
                            th2 = new Throwable(b.b());
                        } else {
                            th2 = b.i;
                            if (th2 == null) {
                                th2 = new Throwable("Handled exception with no message");
                            } else if (th2 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        }
                        InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                        InterfaceC1597aHe c2 = dVar2.c();
                        if (c2 != null) {
                            c2.d(b, th2);
                        } else {
                            dVar2.e().b(b, th2);
                        }
                    }
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(bSJ bsj) {
                    a(bsj);
                    return dpR.c;
                }

                public final void a(bSJ bsj) {
                    if (bsj instanceof bSJ.e) {
                        C8737dwr.c(LifecycleOwnerKt.getLifecycleScope(LolomoMvRxFragment.this), new d(CoroutineExceptionHandler.Key).plus(LolomoMvRxFragment.this.ar()), null, new AnonymousClass1(LolomoMvRxFragment.this, bsj, null), 2, null);
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment$subscribeToCollectTestPrefetchEvent$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                    final /* synthetic */ LolomoMvRxFragment a;
                    int b;
                    final /* synthetic */ bSJ c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(LolomoMvRxFragment lolomoMvRxFragment, bSJ bsj, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                        super(2, interfaceC8585dra);
                        this.a = lolomoMvRxFragment;
                        this.c = bsj;
                    }

                    @Override // o.drX
                    /* renamed from: a */
                    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                        return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                        return new AnonymousClass1(this.a, this.c, interfaceC8585dra);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object e;
                        e = C8586drb.e();
                        int i = this.b;
                        if (i == 0) {
                            C8556dpz.d(obj);
                            int listPos = ((bSJ.e) this.c).c().getListPos();
                            String listContext = ((bSJ.e) this.c).c().getListContext();
                            this.b = 1;
                            if (this.a.aa().get().e(listPos, listContext, this) == e) {
                                return e;
                            }
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            C8556dpz.d(obj);
                        }
                        return dpR.c;
                    }
                }
            }, 3, (Object) null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    private final void aL() {
        if (C1860aQy.b.e().c()) {
            C8737dwr.c(LifecycleOwnerKt.getLifecycleScope(this), null, null, new LolomoMvRxFragment$subscribeToCollectStateRowStateChangedEvent$1(this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String str) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        aq().d(str);
        Context context = getContext();
        if (context == null || (sharedPreferences = context.getSharedPreferences(e, 0)) == null || (edit = sharedPreferences.edit()) == null || (putString = edit.putString("kidsMysteryToken", str)) == null) {
            return;
        }
        putString.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void aD() {
        e eVar = this.s;
        if (eVar != null) {
            c(C4022bTi.f.d);
            eVar.n().performHapticFeedback(Build.VERSION.SDK_INT >= 30 ? 17 : 0);
        }
    }

    private final void c(int i2) {
        final MediaPlayer create = MediaPlayer.create(getContext(), i2);
        if (create != null) {
            create.start();
            create.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: o.bUd
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    LolomoMvRxFragment.e(create, mediaPlayer);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MediaPlayer mediaPlayer, MediaPlayer mediaPlayer2) {
        C8632dsu.c((Object) mediaPlayer, "");
        mediaPlayer.release();
    }
}
