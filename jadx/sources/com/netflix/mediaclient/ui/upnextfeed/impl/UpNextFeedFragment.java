package com.netflix.mediaclient.ui.upnextfeed.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.epoxy.LifecycleAwareEpoxyViewBinder;
import com.netflix.android.widgetry.widget.tabs.BadgeView;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.ViewNotificationsCommand;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment;
import com.netflix.mediaclient.util.AccessibilityUtils;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.nio.charset.StandardCharsets;
import javax.inject.Inject;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC3179au;
import o.AbstractC5271bvc;
import o.AbstractC6242cZc;
import o.AbstractC7916daY;
import o.AbstractC7938dau;
import o.AbstractC8882fB;
import o.C1045Mp;
import o.C1333Xq;
import o.C1565aG;
import o.C1619aI;
import o.C1645aIz;
import o.C1870aRh;
import o.C2755am;
import o.C4146bXy;
import o.C5105bsV;
import o.C6232cYt;
import o.C6491ceM;
import o.C6692ciB;
import o.C7905daN;
import o.C7906daO;
import o.C7912daU;
import o.C7921dad;
import o.C7939dav;
import o.C7940daw;
import o.C7942day;
import o.C7975dbe;
import o.C7978dbh;
import o.C7983dbm;
import o.C8076ddZ;
import o.C8119deP;
import o.C8126deW;
import o.C8150deu;
import o.C8153dex;
import o.C8627dsp;
import o.C8632dsu;
import o.C8657dts;
import o.C8903fW;
import o.C8925fs;
import o.C8930fx;
import o.C8931fy;
import o.C8980gu;
import o.C9726vo;
import o.C9737vz;
import o.C9935zP;
import o.C9962zq;
import o.InterfaceC1126Pr;
import o.InterfaceC2023aX;
import o.InterfaceC3825bMa;
import o.InterfaceC3829bMe;
import o.InterfaceC3993bSg;
import o.InterfaceC4255bb;
import o.InterfaceC5303bwH;
import o.InterfaceC5304bwI;
import o.InterfaceC5307bwL;
import o.InterfaceC6068cSu;
import o.InterfaceC6675chl;
import o.InterfaceC7020coL;
import o.InterfaceC7084cpY;
import o.InterfaceC7089cpd;
import o.InterfaceC7090cpe;
import o.InterfaceC7343cuS;
import o.InterfaceC8554dpx;
import o.InterfaceC8612dsa;
import o.InterfaceC8660dtv;
import o.InterfaceC8890fJ;
import o.InterfaceC8976gq;
import o.aQT;
import o.bJB;
import o.bKJ;
import o.bLP;
import o.bLU;
import o.bLW;
import o.bNN;
import o.bNS;
import o.bNV;
import o.cYQ;
import o.dpB;
import o.dpR;
import o.drI;
import o.drM;
import o.drO;
import o.drX;
import o.dsA;
import o.dtC;
import o.dwU;

@AndroidEntryPoint
/* loaded from: classes5.dex */
public final class UpNextFeedFragment extends AbstractC6242cZc {
    private static final int j;
    @Inject
    public InterfaceC5303bwH adsPlan;
    @Inject
    public InterfaceC5304bwI adsPlanApplication;
    @Inject
    public Lazy<bNN> gameModels;
    @Inject
    public Lazy<bNS> gamesInstallation;
    @Inject
    public Lazy<bNS> gamesInstallationAndLaunch;
    @Inject
    public Lazy<bNV> gamesUtils;
    @Inject
    public Lazy<InterfaceC3993bSg> home;
    private final boolean k;
    private boolean l;
    private final AppView m;
    @Inject
    public InterfaceC6675chl messaging;
    private final InterfaceC8554dpx n;
    @Inject
    public InterfaceC7020coL nonMember;
    @Inject
    public InterfaceC7090cpe notificationPermission;
    @Inject
    public InterfaceC7089cpd notificationPermissionHelper;
    @Inject
    public Lazy<InterfaceC7084cpY> notifications;

    /* renamed from: o  reason: collision with root package name */
    private final a f13326o;
    private Boolean p;
    @Inject
    public Lazy<PlaybackLauncher> playbackLauncher;
    private C7940daw q;
    private int r;
    private final InterfaceC8554dpx s;
    @Inject
    public InterfaceC6068cSu search;
    @Inject
    public InterfaceC1126Pr sharing;
    private int t;
    private final C7905daN u;
    private final InterfaceC8554dpx v;
    private final C5105bsV w;
    private C7942day x;
    private e y;
    static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(UpNextFeedFragment.class, "upNextFeedViewModel", "getUpNextFeedViewModel()Lcom/netflix/mediaclient/ui/upnextfeed/impl/data/UpNextFeedViewModel;", 0))};
    public static final b b = new b(null);

    private final boolean ab() {
        return false;
    }

    public final e T() {
        return this.y;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public AppView bh_() {
        return this.m;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bo_() {
        return this.k;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bw_() {
        return true;
    }

    /* loaded from: classes5.dex */
    public static final class g extends AbstractC8882fB<UpNextFeedFragment, C7975dbe> {
        final /* synthetic */ InterfaceC8660dtv a;
        final /* synthetic */ drM b;
        final /* synthetic */ boolean c;
        final /* synthetic */ InterfaceC8660dtv d;

        public g(InterfaceC8660dtv interfaceC8660dtv, boolean z, drM drm, InterfaceC8660dtv interfaceC8660dtv2) {
            this.a = interfaceC8660dtv;
            this.c = z;
            this.b = drm;
            this.d = interfaceC8660dtv2;
        }

        @Override // o.AbstractC8882fB
        /* renamed from: e */
        public InterfaceC8554dpx<C7975dbe> c(UpNextFeedFragment upNextFeedFragment, dtC<?> dtc) {
            C8632dsu.c((Object) upNextFeedFragment, "");
            C8632dsu.c((Object) dtc, "");
            InterfaceC8976gq d = C8930fx.c.d();
            InterfaceC8660dtv interfaceC8660dtv = this.a;
            final InterfaceC8660dtv interfaceC8660dtv2 = this.d;
            return d.d(upNextFeedFragment, dtc, interfaceC8660dtv, new drO<String>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment$special$$inlined$fragmentViewModel$default$2$1
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: e */
                public final String invoke() {
                    String name = drI.e(InterfaceC8660dtv.this).getName();
                    C8632dsu.a(name, "");
                    return name;
                }
            }, dsA.a(C7978dbh.class), this.c, this.b);
        }
    }

    public UpNextFeedFragment() {
        InterfaceC8554dpx b2;
        final InterfaceC8660dtv a2 = dsA.a(C7975dbe.class);
        this.v = new g(a2, false, new drM<InterfaceC8890fJ<C7975dbe, C7978dbh>, C7975dbe>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment$special$$inlined$fragmentViewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [o.dbe, o.fS] */
            @Override // o.drM
            /* renamed from: c */
            public final C7975dbe invoke(InterfaceC8890fJ<C7975dbe, C7978dbh> interfaceC8890fJ) {
                C8632dsu.c((Object) interfaceC8890fJ, "");
                C8903fW c8903fW = C8903fW.c;
                Class e2 = drI.e(InterfaceC8660dtv.this);
                FragmentActivity requireActivity = this.requireActivity();
                C8632dsu.a(requireActivity, "");
                C8925fs c8925fs = new C8925fs(requireActivity, C8931fy.a(this), this, null, null, 24, null);
                String name = drI.e(a2).getName();
                C8632dsu.a(name, "");
                return C8903fW.e(c8903fW, e2, C7978dbh.class, c8925fs, name, false, interfaceC8890fJ, 16, null);
            }
        }, a2).c(this, e[0]);
        this.f13326o = new a();
        this.w = new C5105bsV(C8150deu.h() ? "ComingSoonTable" : "ComingSoon", false, new drO<String>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment$trailerPlaybackExperience$1
            @Override // o.drO
            /* renamed from: d */
            public final String invoke() {
                String d2 = C8126deW.d();
                C8632dsu.a(d2, "");
                return d2;
            }
        });
        b2 = dpB.b(LazyThreadSafetyMode.e, new drO<MiniPlayerVideoGroupViewModel>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment$miniPlayerViewModel$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final MiniPlayerVideoGroupViewModel invoke() {
                C5105bsV c5105bsV;
                MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel = (MiniPlayerVideoGroupViewModel) new ViewModelProvider(UpNextFeedFragment.this).get(MiniPlayerVideoGroupViewModel.class);
                c5105bsV = UpNextFeedFragment.this.w;
                miniPlayerVideoGroupViewModel.a(c5105bsV);
                return miniPlayerVideoGroupViewModel;
            }
        });
        this.s = b2;
        this.u = new C7905daN();
        this.n = C1565aG.c(this, C7939dav.d.f13822o, false, false, new drM<LifecycleAwareEpoxyViewBinder, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment$headerViewBinder$2
            public final void d(LifecycleAwareEpoxyViewBinder lifecycleAwareEpoxyViewBinder) {
                C8632dsu.c((Object) lifecycleAwareEpoxyViewBinder, "");
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(LifecycleAwareEpoxyViewBinder lifecycleAwareEpoxyViewBinder) {
                d(lifecycleAwareEpoxyViewBinder);
                return dpR.c;
            }
        }, new drX<InterfaceC2023aX, Context, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment$headerViewBinder$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(InterfaceC2023aX interfaceC2023aX, Context context) {
                d(interfaceC2023aX, context);
                return dpR.c;
            }

            public final void d(InterfaceC2023aX interfaceC2023aX, Context context) {
                C7905daN c7905daN;
                C8632dsu.c((Object) interfaceC2023aX, "");
                C8632dsu.c((Object) context, "");
                c7905daN = UpNextFeedFragment.this.u;
                C7975dbe aa = UpNextFeedFragment.this.aa();
                FragmentActivity activity = UpNextFeedFragment.this.getActivity();
                final UpNextFeedFragment upNextFeedFragment = UpNextFeedFragment.this;
                c7905daN.c(interfaceC2023aX, aa, activity, new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment$headerViewBinder$3.1
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Integer num) {
                        c(num.intValue());
                        return dpR.c;
                    }

                    public final void c(int i2) {
                        UpNextFeedFragment.this.r = i2;
                        UpNextFeedFragment.this.b(i2);
                    }
                });
            }
        }, 6, null);
        setHasOptionsMenu(true);
        this.k = true;
        this.m = AppView.newsFeed;
    }

    /* loaded from: classes5.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("UpNextFeedFragment");
        }
    }

    static {
        j = C8153dex.X() ? 6 : 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C7975dbe aa() {
        return (C7975dbe) this.v.getValue();
    }

    public final InterfaceC1126Pr U() {
        InterfaceC1126Pr interfaceC1126Pr = this.sharing;
        if (interfaceC1126Pr != null) {
            return interfaceC1126Pr;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<InterfaceC7084cpY> Q() {
        Lazy<InterfaceC7084cpY> lazy = this.notifications;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC5304bwI G() {
        InterfaceC5304bwI interfaceC5304bwI = this.adsPlanApplication;
        if (interfaceC5304bwI != null) {
            return interfaceC5304bwI;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<bNS> M() {
        Lazy<bNS> lazy = this.gamesInstallation;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<InterfaceC3993bSg> J() {
        Lazy<InterfaceC3993bSg> lazy = this.home;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC6675chl K() {
        InterfaceC6675chl interfaceC6675chl = this.messaging;
        if (interfaceC6675chl != null) {
            return interfaceC6675chl;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<PlaybackLauncher> O() {
        Lazy<PlaybackLauncher> lazy = this.playbackLauncher;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC5303bwH I() {
        InterfaceC5303bwH interfaceC5303bwH = this.adsPlan;
        if (interfaceC5303bwH != null) {
            return interfaceC5303bwH;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC6068cSu W() {
        InterfaceC6068cSu interfaceC6068cSu = this.search;
        if (interfaceC6068cSu != null) {
            return interfaceC6068cSu;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC7090cpe S() {
        InterfaceC7090cpe interfaceC7090cpe = this.notificationPermission;
        if (interfaceC7090cpe != null) {
            return interfaceC7090cpe;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC7089cpd P() {
        InterfaceC7089cpd interfaceC7089cpd = this.notificationPermissionHelper;
        if (interfaceC7089cpd != null) {
            return interfaceC7089cpd;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<bNN> F() {
        Lazy<bNN> lazy = this.gameModels;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<bNS> N() {
        Lazy<bNS> lazy = this.gamesInstallationAndLaunch;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<bNV> L() {
        Lazy<bNV> lazy = this.gamesUtils;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC7020coL R() {
        InterfaceC7020coL interfaceC7020coL = this.nonMember;
        if (interfaceC7020coL != null) {
            return interfaceC7020coL;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC5307bwL {
        a() {
        }

        @Override // o.InterfaceC5307bwL
        public void a(boolean z) {
            UpNextFeedFragment.this.aa().f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MiniPlayerVideoGroupViewModel ac() {
        return (MiniPlayerVideoGroupViewModel) this.s.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LifecycleAwareEpoxyViewBinder Z() {
        return (LifecycleAwareEpoxyViewBinder) this.n.getValue();
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return ((Boolean) C8980gu.c(aa(), new drM<C7978dbh, Boolean>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment$isLoadingData$1
            @Override // o.drM
            /* renamed from: a */
            public final Boolean invoke(C7978dbh c7978dbh) {
                boolean z;
                C8632dsu.c((Object) c7978dbh, "");
                AbstractC7916daY d2 = c7978dbh.d();
                if (C8632dsu.c(d2, AbstractC7916daY.b.a) || C8632dsu.c(d2, AbstractC7916daY.e.b)) {
                    z = true;
                } else if (!C8632dsu.c(d2, AbstractC7916daY.d.e) && !C8632dsu.c(d2, AbstractC7916daY.a.a)) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        })).booleanValue();
    }

    @Override // o.InterfaceC8894fN
    public void e() {
        C8980gu.c(aa(), new drM<C7978dbh, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment$invalidate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7978dbh c7978dbh) {
                e(c7978dbh);
                return dpR.c;
            }

            public final void e(C7978dbh c7978dbh) {
                MiniPlayerVideoGroupViewModel ac;
                UpNextFeedEpoxyController a2;
                C8632dsu.c((Object) c7978dbh, "");
                Status h = c7978dbh.h();
                if (h != null) {
                    UpNextFeedFragment.this.d(h);
                }
                UpNextFeedFragment.e T = UpNextFeedFragment.this.T();
                if (T != null && (a2 = T.a()) != null) {
                    a2.setData(c7978dbh);
                }
                ac = UpNextFeedFragment.this.ac();
                ac.c(new AbstractC5271bvc.c("up-next-feed-list", c7978dbh.a()));
                UpNextFeedFragment.this.Z().e();
            }
        });
    }

    @Override // o.bMX, com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        G().b(this.f13326o);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        if (!C8153dex.B()) {
            CompositeDisposable bk_ = bk_();
            Observable<Integer> observeOn = C8119deP.a(C8126deW.c()).observeOn(AndroidSchedulers.mainThread());
            C8632dsu.a(observeOn, "");
            DisposableKt.plusAssign(bk_, SubscribersKt.subscribeBy$default(observeOn, (drM) null, (drO) null, new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment$onCreateView$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Integer num) {
                    e(num);
                    return dpR.c;
                }

                public final void e(Integer num) {
                    NetflixActivity bj_ = UpNextFeedFragment.this.bj_();
                    if (bj_ != null) {
                        bj_.invalidateOptionsMenu();
                    }
                }
            }, 3, (Object) null));
        }
        View inflate = layoutInflater.inflate((aQT.c.e() || C1870aRh.a.a().e()) ? C7939dav.a.h : C7939dav.a.j, viewGroup, false);
        C8632dsu.a(inflate, "");
        return inflate;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        cYQ cyq;
        final C7906daO c7906daO;
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        C1619aI c1619aI = new C1619aI();
        dwU e2 = aa().e();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        long j2 = aQT.c.c().d() ? 1000L : 500L;
        C8632dsu.d(viewLifecycleOwner);
        bLW blw = new bLW(e2, c1619aI, viewLifecycleOwner, j2, 90, null, null, null, 224, null);
        DisposableKt.plusAssign(bk_(), SubscribersKt.subscribeBy$default(blw.i(), (drM) null, (drO) null, new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment$onViewCreated$autoPlay$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Integer num) {
                c(num.intValue());
                return dpR.c;
            }

            public final void c(int i2) {
                MiniPlayerVideoGroupViewModel ac;
                ac = UpNextFeedFragment.this.ac();
                ac.d(i2 == -1 ? null : Integer.valueOf(i2));
            }
        }, 3, (Object) null));
        dwU e3 = aa().e();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner2, "");
        bLU blu = new bLU(e3, c1619aI, viewLifecycleOwner2, new drX<InterfaceC3825bMa, AbstractC3179au, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment$onViewCreated$epoxyPresentationTracking$1
            @Override // o.drX
            public /* synthetic */ dpR invoke(InterfaceC3825bMa interfaceC3825bMa, AbstractC3179au abstractC3179au) {
                a(interfaceC3825bMa, abstractC3179au);
                return dpR.c;
            }

            public final void a(InterfaceC3825bMa interfaceC3825bMa, AbstractC3179au abstractC3179au) {
                bLP blp;
                drO<TrackingInfo> i2;
                C8632dsu.c((Object) interfaceC3825bMa, "");
                C8632dsu.c((Object) abstractC3179au, "");
                if (interfaceC3825bMa instanceof InterfaceC3829bMe) {
                    InterfaceC3829bMe interfaceC3829bMe = (InterfaceC3829bMe) interfaceC3825bMa;
                    CLv2Utils.b(!interfaceC3829bMe.h(abstractC3179au), interfaceC3829bMe.aj_(), interfaceC3829bMe.m().invoke(), null);
                }
                if (!(interfaceC3825bMa instanceof bLP) || (i2 = (blp = (bLP) interfaceC3825bMa).i()) == null) {
                    return;
                }
                CLv2Utils.b(true, blp.k(), i2.invoke(), null);
            }
        }, 0L, 90, null, null, 208, null);
        C7983dbm d2 = C7983dbm.d(view);
        C8632dsu.a(d2, "");
        C6232cYt c6232cYt = new C6232cYt();
        NetflixActivity by_ = by_();
        MiniPlayerVideoGroupViewModel ac = ac();
        C9935zP.b bVar = C9935zP.b;
        C9935zP d3 = bVar.d(this);
        drO<dpR> dro = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment$onViewCreated$epoxyController$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                e();
                return dpR.c;
            }

            public final void e() {
                UpNextFeedFragment.this.e();
            }
        };
        drM<Integer, dpR> drm = new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment$onViewCreated$epoxyController$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Integer num) {
                c(num.intValue());
                return dpR.c;
            }

            public final void c(int i2) {
                UpNextFeedFragment.this.aa().d(i2);
            }
        };
        boolean V = V();
        InterfaceC5303bwH I = I();
        if (C1870aRh.a.d()) {
            Context requireContext = requireContext();
            C8632dsu.a(requireContext, "");
            C9935zP d4 = bVar.d(this);
            MiniPlayerVideoGroupViewModel ac2 = ac();
            bNN bnn = F().get();
            C8632dsu.a(bnn, "");
            bNN bnn2 = bnn;
            bNS bns = N().get();
            C8632dsu.a(bns, "");
            bNS bns2 = bns;
            bNV bnv = L().get();
            C8632dsu.a(bnv, "");
            cyq = new cYQ(requireContext, d4, blw, blu, ac2, bnn2, bns2, bnv);
        } else {
            cyq = null;
        }
        UpNextFeedEpoxyController upNextFeedEpoxyController = new UpNextFeedEpoxyController(by_, ac, d3, blw, c6232cYt, blu, dro, drm, V, true, I, cyq, R());
        d2.e.setAdapter(upNextFeedEpoxyController.getAdapter());
        d2.e.setHasFixedSize(true);
        if (C8153dex.X()) {
            bJB bjb = d2.e;
            Context context = view.getContext();
            C8632dsu.a(context, "");
            bjb.addItemDecoration(new C7921dad(context));
        }
        d2.e.addOnScrollListener(new c(d2));
        new C9962zq(upNextFeedEpoxyController).attachToRecyclerView(d2.e);
        if (C8153dex.S()) {
            C7906daO c7906daO2 = new C7906daO(this, K());
            c7906daO2.b();
            c7906daO = c7906daO2;
        } else {
            c7906daO = null;
        }
        bJB bjb2 = d2.e;
        C8632dsu.a(bjb2, "");
        FrameLayout frameLayout = d2.d;
        C8632dsu.a(frameLayout, "");
        this.y = new e(bjb2, frameLayout, upNextFeedEpoxyController, c1619aI, blw, c7906daO);
        NetflixActivity by_2 = by_();
        InterfaceC1126Pr U = U();
        C7975dbe aa = aa();
        bNS bns3 = M().get();
        C8632dsu.a(bns3, "");
        this.x = new C7942day(by_2, this, U, aa, bns3, O(), S(), P(), R());
        CompositeDisposable bk_ = bk_();
        Observable d5 = bVar.d(this).d(AbstractC7938dau.class);
        final drM<AbstractC7938dau, Boolean> drm2 = new drM<AbstractC7938dau, Boolean>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment$onViewCreated$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(AbstractC7938dau abstractC7938dau) {
                C8632dsu.c((Object) abstractC7938dau, "");
                return Boolean.valueOf(UpNextFeedFragment.this.bn_());
            }
        };
        Observable filter = d5.filter(new Predicate() { // from class: o.daA
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean c2;
                c2 = UpNextFeedFragment.c(drM.this, obj);
                return c2;
            }
        });
        C8632dsu.a(filter, "");
        DisposableKt.plusAssign(bk_, SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<AbstractC7938dau, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment$onViewCreated$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC7938dau abstractC7938dau) {
                d(abstractC7938dau);
                return dpR.c;
            }

            public final void d(AbstractC7938dau abstractC7938dau) {
                C7942day c7942day;
                c7942day = UpNextFeedFragment.this.x;
                if (c7942day != null) {
                    C8632dsu.d(abstractC7938dau);
                    c7942day.a(abstractC7938dau);
                }
            }
        }, 3, (Object) null));
        C1645aIz.a(this, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment$onViewCreated$4
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
                C8632dsu.c((Object) serviceManager, "");
                if (UpNextFeedFragment.this.bn_() && UpNextFeedFragment.this.getView() != null) {
                    C8119deP.a(serviceManager);
                }
                C7906daO c7906daO3 = c7906daO;
                if (c7906daO3 != null) {
                    c7906daO3.c(UpNextFeedFragment.this.requireContext());
                }
            }
        });
        if (C8153dex.T()) {
            C7940daw c7940daw = new C7940daw(new drO<dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment$onViewCreated$5
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                public final void a() {
                    UpNextFeedFragment.this.aa().j();
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    a();
                    return dpR.c;
                }
            }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment$onViewCreated$6
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                public final void c() {
                    C7975dbe.c(UpNextFeedFragment.this.aa(), 0, false, 1, null);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    c();
                    return dpR.c;
                }
            });
            Context requireContext2 = requireContext();
            C8632dsu.a(requireContext2, "");
            c7940daw.e(requireContext2);
            this.q = c7940daw;
        }
        e();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("initial_section_id_extra") : null;
        if (string != null && C7912daU.d.e().containsKey(string)) {
            a(string);
        }
        Bundle arguments2 = getArguments();
        this.p = arguments2 != null ? Boolean.valueOf(arguments2.getBoolean("show-search-in-action-bar", true)) : Boolean.TRUE;
    }

    /* loaded from: classes5.dex */
    public static final class c extends RecyclerView.OnScrollListener {
        final /* synthetic */ C7983dbm a;

        c(C7983dbm c7983dbm) {
            this.a = c7983dbm;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Integer Y;
            C8632dsu.c((Object) recyclerView, "");
            NetflixActivity bj_ = UpNextFeedFragment.this.bj_();
            if (bj_ != null) {
                bj_.onScrolled(i2);
            }
            e T = UpNextFeedFragment.this.T();
            if (T == null || T.e() || (Y = UpNextFeedFragment.this.Y()) == null) {
                return;
            }
            UpNextFeedFragment upNextFeedFragment = UpNextFeedFragment.this;
            C7983dbm c7983dbm = this.a;
            int intValue = Y.intValue();
            if (upNextFeedFragment.r != intValue) {
                upNextFeedFragment.r = intValue;
                c7983dbm.e.performHapticFeedback(0);
                View c = upNextFeedFragment.Z().c();
                bKJ bkj = c instanceof bKJ ? (bKJ) c : null;
                if (bkj != null) {
                    bkj.b(intValue);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C8632dsu.c((Object) recyclerView, "");
            int scrollState = recyclerView.getScrollState();
            if (scrollState == 0) {
                e T = UpNextFeedFragment.this.T();
                if (T == null) {
                    return;
                }
                T.d(false);
            } else if (scrollState != 1) {
            } else {
                UpNextFeedFragment.this.aa().i();
                e T2 = UpNextFeedFragment.this.T();
                if (T2 == null) {
                    return;
                }
                T2.d(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    private final void a(String str) {
        UpNextFeedEpoxyController a2;
        e eVar = this.y;
        if (eVar == null || (a2 = eVar.a()) == null) {
            return;
        }
        a2.addModelBuildListener(new d(a2, str));
    }

    /* loaded from: classes5.dex */
    public static final class d implements InterfaceC4255bb {
        final /* synthetic */ String a;
        final /* synthetic */ UpNextFeedEpoxyController c;

        d(UpNextFeedEpoxyController upNextFeedEpoxyController, String str) {
            this.c = upNextFeedEpoxyController;
            this.a = str;
        }

        @Override // o.InterfaceC4255bb
        public void b(C2755am c2755am) {
            int b;
            C8632dsu.c((Object) c2755am, "");
            if (UpNextFeedFragment.this.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                Integer num = this.c.getSectionNameToIndex$netflix_modules_ui_up_next_feed_impl_release().get(this.a);
                if (num == null || num.intValue() != 0) {
                    if (num != null) {
                        b = C8657dts.b(num.intValue() - 1, 0);
                        num = Integer.valueOf(b);
                    }
                    Boolean bool = this.c.isSectionFullyLoaded$netflix_modules_ui_up_next_feed_impl_release().get(num);
                    if (bool == null || !bool.booleanValue()) {
                        return;
                    }
                    this.c.removeModelBuildListener(this);
                    Integer num2 = this.c.getSectionNameToIndex$netflix_modules_ui_up_next_feed_impl_release().get(this.a);
                    if (num2 != null) {
                        UpNextFeedFragment upNextFeedFragment = UpNextFeedFragment.this;
                        int intValue = num2.intValue();
                        upNextFeedFragment.r = intValue;
                        View c = upNextFeedFragment.Z().c();
                        bKJ bkj = c instanceof bKJ ? (bKJ) c : null;
                        if (bkj != null) {
                            bkj.b(intValue);
                        }
                        upNextFeedFragment.b(intValue);
                        return;
                    }
                    return;
                }
                UpNextFeedFragment.b.getLogTag();
                this.c.removeModelBuildListener(this);
                return;
            }
            this.c.removeModelBuildListener(this);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        C8632dsu.c((Object) configuration, "");
        super.onConfigurationChanged(configuration);
        ah();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        super.bD_();
        NetflixActivity bj_ = bj_();
        NetflixActivity bj_2 = bj_();
        Boolean bool = (Boolean) C9726vo.d(bj_, bj_2 != null ? bj_2.getNetflixActionBar() : null, new drX<NetflixActivity, NetflixActionBar, Boolean>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment$updateActionBar$1
            private static int d = 1;
            private static int e = 0;
            private static byte e$ss2$42 = 24;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            /* renamed from: a */
            public final Boolean invoke(NetflixActivity netflixActivity, NetflixActionBar netflixActionBar) {
                int i2 = 2 % 2;
                int i3 = d + 81;
                e = i3 % 128;
                int i4 = i3 % 2;
                C8632dsu.c((Object) netflixActivity, "");
                C8632dsu.c((Object) netflixActionBar, "");
                NetflixActionBar.b.C0051b d2 = netflixActivity.getActionBarStateBuilder().k(false).i(true).d(UpNextFeedFragment.this);
                if (C8153dex.X()) {
                    d2.c(new ColorDrawable(netflixActivity.getColor(C7939dav.b.c)));
                    d2.e(true);
                }
                d2.f(C8153dex.Q());
                if (C8153dex.S()) {
                    d2.l(false).b(true).b(NetflixActionBar.LogoType.e);
                } else {
                    NetflixActionBar.b.C0051b l = d2.l(true);
                    String string = netflixActivity.getString(C7939dav.i.x);
                    if (string.startsWith("'!#+")) {
                        Object[] objArr = new Object[1];
                        c(string.substring(4), objArr);
                        string = ((String) objArr[0]).intern();
                    }
                    l.e((CharSequence) string).d(0);
                }
                if (UpNextFeedFragment.this.R().c(netflixActivity)) {
                    int i5 = d + 21;
                    e = i5 % 128;
                    int i6 = i5 % 2;
                    d2.k(true);
                }
                netflixActionBar.c(d2.c());
                Boolean bool2 = Boolean.TRUE;
                int i7 = e + 37;
                d = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 38 / 0;
                }
                return bool2;
            }

            private void c(String str, Object[] objArr) {
                byte[] decode = Base64.decode(str, 0);
                byte[] bArr = new byte[decode.length];
                for (int i2 = 0; i2 < decode.length; i2++) {
                    bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$42);
                }
                objArr[0] = new String(bArr, StandardCharsets.UTF_8);
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        NetflixActivity netflixActivity;
        C8632dsu.c((Object) menu, "");
        C8632dsu.c((Object) menuInflater, "");
        super.onCreateOptionsMenu(menu, menuInflater);
        Context context = getContext();
        if (context != null && (netflixActivity = (NetflixActivity) C9737vz.b(context, NetflixActivity.class)) != null) {
            C6491ceM.c(netflixActivity, menu);
        }
        if (!C8153dex.Q() && C8632dsu.c(this.p, Boolean.TRUE)) {
            W().a(menu);
        }
        if (C8153dex.B()) {
            return;
        }
        menu.add(0, C7939dav.d.s, 0, R.o.hH).setActionView(C7939dav.a.e).setShowAsActionFlags(2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem;
        View actionView;
        C8632dsu.c((Object) menu, "");
        super.onPrepareOptionsMenu(menu);
        if (C8153dex.B() || (findItem = menu.findItem(C7939dav.d.s)) == null || (actionView = findItem.getActionView()) == null) {
            return;
        }
        BadgeView badgeView = (BadgeView) actionView.findViewById(C7939dav.d.b);
        int d2 = C8119deP.d(C8126deW.c());
        if (d2 > 0) {
            C8632dsu.d(badgeView);
            badgeView.setVisibility(0);
            badgeView.setBackgroundColor(actionView.getContext().getResources().getColor(R.c.u));
            badgeView.setDisplayType(BadgeView.DisplayType.TEXT);
            badgeView.setText(String.valueOf(d2));
        } else {
            C8632dsu.d(badgeView);
            badgeView.setVisibility(8);
        }
        actionView.setContentDescription(C1333Xq.d(C7939dav.i.a).a(d2).c());
        actionView.setOnClickListener(new View.OnClickListener() { // from class: o.daC
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpNextFeedFragment.d(UpNextFeedFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(UpNextFeedFragment upNextFeedFragment, View view) {
        C8632dsu.c((Object) upNextFeedFragment, "");
        CLv2Utils.INSTANCE.b(new Focus(AppView.notificationLanding, null), (Command) new ViewNotificationsCommand(), true);
        FragmentActivity activity = upNextFeedFragment.getActivity();
        if (activity != null) {
            activity.startActivity(new Intent(upNextFeedFragment.getActivity(), upNextFeedFragment.Q().get().c()));
        }
    }

    @Override // o.bMX, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ac().k();
        e eVar = this.y;
        if (eVar != null) {
            eVar.h().d(eVar.d());
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onResume() {
        ServiceManager bl_;
        super.onResume();
        if (this.l) {
            if (C8153dex.S() && (bl_ = bl_()) != null) {
                bl_.N();
            }
            this.l = false;
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onPause() {
        this.l = true;
        super.onPause();
        if (C8153dex.S()) {
            NetflixApplication.getInstance().b("upNextPause");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ac().n();
        e eVar = this.y;
        if (eVar != null) {
            eVar.h().c(eVar.d());
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C7906daO f;
        this.f.clear();
        C7940daw c7940daw = this.q;
        if (c7940daw != null) {
            Context requireContext = requireContext();
            C8632dsu.a(requireContext, "");
            c7940daw.a(requireContext);
            this.q = null;
        }
        super.onDestroyView();
        e eVar = this.y;
        if (eVar != null && (f = eVar.f()) != null) {
            f.d();
            f.e();
        }
        this.y = null;
        this.x = null;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroy() {
        G().d(this.f13326o);
        super.onDestroy();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void bq_() {
        bLW c2;
        e eVar = this.y;
        if (eVar == null || (c2 = eVar.c()) == null) {
            return;
        }
        c2.e(true);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void bp_() {
        bLW c2;
        e eVar = this.y;
        if (eVar == null || (c2 = eVar.c()) == null) {
            return;
        }
        c2.e(false);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        bLW c2;
        super.onHiddenChanged(z);
        e eVar = this.y;
        if (eVar != null && (c2 = eVar.c()) != null) {
            c2.e(z);
        }
        if (z) {
            ac().n();
            e eVar2 = this.y;
            if (eVar2 != null) {
                eVar2.h().c(eVar2.d());
                return;
            }
            return;
        }
        ac().k();
        e eVar3 = this.y;
        if (eVar3 != null) {
            eVar3.h().d(eVar3.d());
        }
    }

    /* loaded from: classes5.dex */
    public static final class e {
        private final UpNextFeedEpoxyController a;
        private final EpoxyRecyclerView b;
        private final bLW c;
        private boolean d;
        private final FrameLayout e;
        private final C7906daO f;
        private final C1619aI h;

        public final UpNextFeedEpoxyController a() {
            return this.a;
        }

        public final FrameLayout b() {
            return this.e;
        }

        public final bLW c() {
            return this.c;
        }

        public final EpoxyRecyclerView d() {
            return this.b;
        }

        public final void d(boolean z) {
            this.d = z;
        }

        public final boolean e() {
            return this.d;
        }

        public final C7906daO f() {
            return this.f;
        }

        public final C1619aI h() {
            return this.h;
        }

        public e(EpoxyRecyclerView epoxyRecyclerView, FrameLayout frameLayout, UpNextFeedEpoxyController upNextFeedEpoxyController, C1619aI c1619aI, bLW blw, C7906daO c7906daO) {
            C8632dsu.c((Object) epoxyRecyclerView, "");
            C8632dsu.c((Object) frameLayout, "");
            C8632dsu.c((Object) upNextFeedEpoxyController, "");
            C8632dsu.c((Object) c1619aI, "");
            C8632dsu.c((Object) blw, "");
            this.b = epoxyRecyclerView;
            this.e = frameLayout;
            this.a = upNextFeedEpoxyController;
            this.h = c1619aI;
            this.c = blw;
            this.f = c7906daO;
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean y() {
        e eVar = this.y;
        if (eVar == null || eVar.d() == null) {
            return true;
        }
        b(0);
        View c2 = Z().c();
        bKJ bkj = c2 instanceof bKJ ? (bKJ) c2 : null;
        if (bkj != null) {
            bkj.b(0);
            return true;
        }
        return true;
    }

    static /* synthetic */ void b(UpNextFeedFragment upNextFeedFragment, RecyclerView recyclerView, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = -1;
        }
        upNextFeedFragment.e(recyclerView, i2, i3);
    }

    /* loaded from: classes5.dex */
    public static final class i extends LinearSmoothScroller {
        final /* synthetic */ RecyclerView a;
        final /* synthetic */ int b;
        final /* synthetic */ RecyclerView.LayoutManager c;
        final /* synthetic */ int d;
        final /* synthetic */ UpNextFeedFragment e;

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            return this.d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i, UpNextFeedFragment upNextFeedFragment, int i2, RecyclerView recyclerView, RecyclerView.LayoutManager layoutManager, Context context) {
            super(context);
            this.d = i;
            this.e = upNextFeedFragment;
            this.b = i2;
            this.a = recyclerView;
            this.c = layoutManager;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public void onStart() {
            super.onStart();
            this.e.t = this.b;
            e T = this.e.T();
            if (T != null) {
                T.d(true);
            }
            this.a.getViewTreeObserver().addOnPreDrawListener(new a(this.e, this.b, this.a, this.c));
        }

        /* loaded from: classes5.dex */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {
            final /* synthetic */ int a;
            final /* synthetic */ UpNextFeedFragment b;
            final /* synthetic */ RecyclerView c;
            final /* synthetic */ RecyclerView.LayoutManager d;

            a(UpNextFeedFragment upNextFeedFragment, int i, RecyclerView recyclerView, RecyclerView.LayoutManager layoutManager) {
                this.b = upNextFeedFragment;
                this.a = i;
                this.c = recyclerView;
                this.d = layoutManager;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                e T = this.b.T();
                if (T == null || T.e() || this.b.t != this.a) {
                    return true;
                }
                this.c.getViewTreeObserver().removeOnPreDrawListener(this);
                RecyclerView.LayoutManager layoutManager = this.d;
                C8632dsu.d(layoutManager);
                int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                int findFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) this.d).findFirstCompletelyVisibleItemPosition();
                int i = this.a;
                if (findFirstVisibleItemPosition == i && (findFirstCompletelyVisibleItemPosition == -1 || findFirstCompletelyVisibleItemPosition == i)) {
                    return true;
                }
                UpNextFeedFragment.b(this.b, this.c, i, 0, 2, null);
                return true;
            }
        }
    }

    private final void e(RecyclerView recyclerView, int i2, int i3) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            i iVar = new i(i3, this, i2, recyclerView, layoutManager, recyclerView.getContext());
            iVar.setTargetPosition(i2);
            layoutManager.startSmoothScroll(iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer Y() {
        UpNextFeedEpoxyController a2;
        Integer X = X();
        if (X != null) {
            int intValue = X.intValue();
            e eVar = this.y;
            if (eVar != null && (a2 = eVar.a()) != null) {
                return a2.getSectionIndexForModelPos(intValue);
            }
        }
        return null;
    }

    private final Integer X() {
        int findFirstVisibleItemPosition;
        e eVar = this.y;
        if (eVar != null) {
            RecyclerView.LayoutManager layoutManager = eVar.d().getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                if (C8153dex.X()) {
                    findFirstVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                } else {
                    findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                }
                if (findFirstVisibleItemPosition == -1) {
                    return null;
                }
                return Integer.valueOf(findFirstVisibleItemPosition);
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int i2) {
        e eVar = this.y;
        if (eVar != null) {
            eVar.d().performHapticFeedback(0);
            Integer firstTargetItemForSection = eVar.a().getFirstTargetItemForSection(i2);
            if (firstTargetItemForSection != null) {
                int intValue = firstTargetItemForSection.intValue();
                b.getLogTag();
                Integer X = X();
                if (X != null) {
                    int intValue2 = X.intValue() - intValue;
                    int i3 = j;
                    if (intValue2 > i3) {
                        eVar.d().scrollToPosition(i3 + intValue);
                    } else if (intValue2 < (-i3)) {
                        eVar.d().scrollToPosition(intValue - i3);
                    }
                }
                b(this, eVar.d(), intValue, 0, 2, null);
            }
        }
    }

    private final void ah() {
        e eVar = this.y;
        if (eVar != null) {
            EpoxyRecyclerView d2 = eVar.d();
            ViewGroup.LayoutParams layoutParams = d2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = requireContext().getResources().getDimensionPixelOffset(C7939dav.e.d);
                d2.setLayoutParams(layoutParams);
                FrameLayout b2 = eVar.b();
                ViewGroup.LayoutParams layoutParams2 = b2.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = requireContext().getResources().getDimensionPixelOffset(C7939dav.e.b);
                    b2.setLayoutParams(layoutParams2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void br_() {
        if (C8153dex.S()) {
            NetflixApplication.getInstance().b("upNextRenderComplete");
        }
        af();
        NetflixActivity bj_ = bj_();
        if (bj_ != null) {
            C8076ddZ.k(bj_);
        }
    }

    private final void af() {
        if (C8153dex.S()) {
            NetflixActivity bj_ = bj_();
            UpNextFeedActivity upNextFeedActivity = bj_ instanceof UpNextFeedActivity ? (UpNextFeedActivity) bj_ : null;
            C9726vo.d(upNextFeedActivity, upNextFeedActivity != null ? upNextFeedActivity.getTutorialHelper() : null, bl_(), new InterfaceC8612dsa<UpNextFeedActivity, InterfaceC7343cuS, ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment$showTutorialIfNeeded$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(3);
                }

                @Override // o.InterfaceC8612dsa
                public /* synthetic */ dpR invoke(UpNextFeedActivity upNextFeedActivity2, InterfaceC7343cuS interfaceC7343cuS, ServiceManager serviceManager) {
                    a(upNextFeedActivity2, interfaceC7343cuS, serviceManager);
                    return dpR.c;
                }

                public final void a(UpNextFeedActivity upNextFeedActivity2, final InterfaceC7343cuS interfaceC7343cuS, ServiceManager serviceManager) {
                    C8632dsu.c((Object) upNextFeedActivity2, "");
                    C8632dsu.c((Object) interfaceC7343cuS, "");
                    C8632dsu.c((Object) serviceManager, "");
                    if (C4146bXy.d.e(upNextFeedActivity2)) {
                        interfaceC7343cuS.b();
                    }
                    if (interfaceC7343cuS.f()) {
                        UpNextFeedFragment.this.J().get().d(upNextFeedActivity2, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.UpNextFeedFragment$showTutorialIfNeeded$1.1
                            {
                                super(0);
                            }

                            @Override // o.drO
                            public /* synthetic */ dpR invoke() {
                                c();
                                return dpR.c;
                            }

                            public final void c() {
                                InterfaceC7343cuS.this.b();
                            }
                        });
                    } else {
                        upNextFeedActivity2.d(serviceManager);
                    }
                }
            });
        }
    }

    private final boolean V() {
        return (!C6692ciB.a.d() || AccessibilityUtils.a(by_()) || ab()) ? false : true;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(View view) {
        C8632dsu.c((Object) view, "");
        int i2 = ((NetflixFrag) this).d;
        int i3 = this.i;
        int i4 = i2 + i3;
        view.setPadding(view.getPaddingLeft(), i4, view.getPaddingRight(), this.h);
    }
}
