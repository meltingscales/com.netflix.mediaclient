package com.netflix.mediaclient.ui.home.impl.feed;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.TrailerItem;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.home.impl.HomeEpoxyController;
import com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoEpoxyController;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.mediaclient.util.AccessibilityUtils;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.LazyThreadSafetyMode;
import o.AbstractC4032bTs;
import o.AbstractC5271bvc;
import o.AbstractC6233cYu;
import o.C1045Mp;
import o.C1619aI;
import o.C2755am;
import o.C4022bTi;
import o.C4027bTn;
import o.C4029bTp;
import o.C4030bTq;
import o.C4048bUh;
import o.C4049bUi;
import o.C4052bUl;
import o.C5105bsV;
import o.C6232cYt;
import o.C6692ciB;
import o.C6717cia;
import o.C8126deW;
import o.C8153dex;
import o.C8168dfL;
import o.C8569dql;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C8980gu;
import o.C9726vo;
import o.C9935zP;
import o.C9962zq;
import o.InterfaceC1126Pr;
import o.InterfaceC2023aX;
import o.InterfaceC4255bb;
import o.InterfaceC5222bug;
import o.InterfaceC5223buh;
import o.InterfaceC7089cpd;
import o.InterfaceC7090cpe;
import o.InterfaceC8554dpx;
import o.InterfaceC8612dsa;
import o.InterfaceC9960zo;
import o.bKJ;
import o.bLR;
import o.bLW;
import o.bMZ;
import o.bNS;
import o.bSY;
import o.bTF;
import o.bTX;
import o.cYB;
import o.dpB;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import o.dwU;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class FeedLolomoFragment extends AbstractC4032bTs {
    public static final d b = new d(null);
    private static final int e;
    @Inject
    public Lazy<bNS> gamesInstallation;
    private final AppView l;
    private C4027bTn m;
    private InterfaceC4255bb n;
    @Inject
    public InterfaceC7090cpe notificationPermission;
    @Inject
    public InterfaceC7089cpd notificationPermissionHelper;

    /* renamed from: o  reason: collision with root package name */
    private int f13272o;
    private boolean p;
    @Inject
    public Lazy<PlaybackLauncher> playbackLauncher;
    private final InterfaceC8554dpx q;
    private final Void r;
    private int s;
    @Inject
    public InterfaceC1126Pr sharing;
    private RecyclerView.OnItemTouchListener t;

    private final boolean aK() {
        return false;
    }

    protected Void O() {
        return this.r;
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment
    public boolean R() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public AppView bh_() {
        return this.l;
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment
    public void c(boolean z) {
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment
    public /* synthetic */ C6717cia Q() {
        return (C6717cia) O();
    }

    public FeedLolomoFragment() {
        InterfaceC8554dpx b2;
        b2 = dpB.b(LazyThreadSafetyMode.e, new drO<C5105bsV>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment$playbackExperience$2
            @Override // o.drO
            /* renamed from: e */
            public final C5105bsV invoke() {
                return new C5105bsV("trailerInLolomo", false, new drO<String>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment$playbackExperience$2.1
                    @Override // o.drO
                    /* renamed from: b */
                    public final String invoke() {
                        String d2 = C8126deW.d();
                        C8632dsu.a(d2, "");
                        return d2;
                    }
                });
            }
        });
        this.q = b2;
        this.l = AppView.newsFeed;
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("FeedLolomoFragment");
        }
    }

    static {
        e = C8153dex.X() ? 6 : 8;
    }

    public final InterfaceC1126Pr S() {
        InterfaceC1126Pr interfaceC1126Pr = this.sharing;
        if (interfaceC1126Pr != null) {
            return interfaceC1126Pr;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC7090cpe K() {
        InterfaceC7090cpe interfaceC7090cpe = this.notificationPermission;
        if (interfaceC7090cpe != null) {
            return interfaceC7090cpe;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC7089cpd N() {
        InterfaceC7089cpd interfaceC7089cpd = this.notificationPermissionHelper;
        if (interfaceC7089cpd != null) {
            return interfaceC7089cpd;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<bNS> L() {
        Lazy<bNS> lazy = this.gamesInstallation;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<PlaybackLauncher> P() {
        Lazy<PlaybackLauncher> lazy = this.playbackLauncher;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment
    public C5105bsV J() {
        return (C5105bsV) this.q.getValue();
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment, com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String string;
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        NetflixActivity by_ = by_();
        InterfaceC1126Pr S = S();
        bTF aq = aq();
        bNS bns = L().get();
        C8632dsu.a(bns, "");
        this.m = new C4027bTn(by_, this, S, aq, bns, P(), K(), N());
        CompositeDisposable bk_ = bk_();
        C9935zP.b bVar = C9935zP.b;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        Observable d2 = bVar.d(viewLifecycleOwner).d(AbstractC6233cYu.class);
        final drM<AbstractC6233cYu, Boolean> drm = new drM<AbstractC6233cYu, Boolean>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment$onViewCreated$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(AbstractC6233cYu abstractC6233cYu) {
                C8632dsu.c((Object) abstractC6233cYu, "");
                return Boolean.valueOf(FeedLolomoFragment.this.bn_());
            }
        };
        Observable filter = d2.filter(new Predicate() { // from class: o.bTk
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean e2;
                e2 = FeedLolomoFragment.e(drM.this, obj);
                return e2;
            }
        });
        C8632dsu.a(filter, "");
        DisposableKt.plusAssign(bk_, SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<AbstractC6233cYu, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment$onViewCreated$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC6233cYu abstractC6233cYu) {
                c(abstractC6233cYu);
                return dpR.c;
            }

            public final void c(AbstractC6233cYu abstractC6233cYu) {
                C4027bTn c4027bTn;
                c4027bTn = FeedLolomoFragment.this.m;
                if (c4027bTn != null) {
                    C8632dsu.d(abstractC6233cYu);
                    c4027bTn.d(abstractC6233cYu);
                }
            }
        }, 3, (Object) null));
        aC();
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("initial_list_context_extra")) != null) {
            d(string);
        }
        aI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        C8632dsu.c((Object) configuration, "");
        super.onConfigurationChanged(configuration);
        aI();
    }

    private final void aI() {
        LolomoMvRxFragment.e ak = ak();
        if (ak != null) {
            bTX n = ak.n();
            ViewGroup.LayoutParams layoutParams = n.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = requireContext().getResources().getDimensionPixelOffset(C4022bTi.b.b);
                n.setLayoutParams(layoutParams);
                View c2 = ai().c();
                ViewGroup.LayoutParams layoutParams2 = c2.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = requireContext().getResources().getDimensionPixelOffset(C4022bTi.b.e);
                    FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
                    if (layoutParams3 != null) {
                        layoutParams3.gravity = 1;
                    }
                    c2.setLayoutParams(layoutParams2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    private final void d(String str) {
        HomeEpoxyController j = aF().j();
        a aVar = new a(j, str);
        this.n = aVar;
        j.addModelBuildListener(aVar);
    }

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC4255bb {
        final /* synthetic */ HomeEpoxyController b;
        final /* synthetic */ String d;

        a(HomeEpoxyController homeEpoxyController, String str) {
            this.b = homeEpoxyController;
            this.d = str;
        }

        @Override // o.InterfaceC4255bb
        public void b(C2755am c2755am) {
            C8632dsu.c((Object) c2755am, "");
            bTF aq = FeedLolomoFragment.this.aq();
            final FeedLolomoFragment feedLolomoFragment = FeedLolomoFragment.this;
            final HomeEpoxyController homeEpoxyController = this.b;
            final String str = this.d;
            C8980gu.c(aq, new drM<C4049bUi, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment$scrollToSection$1$onModelBuildFinished$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C4049bUi c4049bUi) {
                    a(c4049bUi);
                    return dpR.c;
                }

                public final void a(C4049bUi c4049bUi) {
                    Integer num;
                    InterfaceC9960zo aJ;
                    List<TrailerItem.a> e;
                    C8632dsu.c((Object) c4049bUi, "");
                    C4029bTp e2 = c4049bUi.e();
                    if (e2 == null || (e = e2.e()) == null) {
                        num = null;
                    } else {
                        String str2 = str;
                        Iterator<TrailerItem.a> it = e.iterator();
                        int i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i = -1;
                                break;
                            } else if (C8632dsu.c((Object) it.next().a(), (Object) str2)) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        num = Integer.valueOf(i);
                    }
                    if (num != null) {
                        aJ = FeedLolomoFragment.this.aJ();
                        if (aJ.getFirstTargetItemForSection(num.intValue()) != null) {
                            homeEpoxyController.removeModelBuildListener(this);
                            FeedLolomoFragment.this.s = num.intValue();
                            View c = FeedLolomoFragment.this.ai().c();
                            bKJ bkj = c instanceof bKJ ? (bKJ) c : null;
                            if (bkj != null) {
                                bkj.b(num.intValue());
                            }
                            FeedLolomoFragment.this.e(num.intValue());
                        }
                    }
                }
            });
        }
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment
    public LolomoEpoxyController c(bSY bsy, bLW blw, bTX btx, drX<? super LoMo, ? super Integer, dpR> drx, drO<MiniPlayerVideoGroupViewModel> dro, drM<? super LoMo, dpR> drm) {
        C8632dsu.c((Object) bsy, "");
        C8632dsu.c((Object) blw, "");
        C8632dsu.c((Object) btx, "");
        C8632dsu.c((Object) drx, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) drm, "");
        return new FeedLolomoEpoxyController(by_(), Z(), af_(), blw, new C6232cYt(), new drO<dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment$createEpoxyController$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            public final void c() {
                FeedLolomoFragment.this.e();
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                c();
                return dpR.c;
            }
        }, new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment$createEpoxyController$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Integer num) {
                c(num.intValue());
                return dpR.c;
            }

            public final void c(int i) {
                FeedLolomoFragment.this.aq().c(i);
            }
        }, aG(), bsy, btx, drx, drm, dro, aq().i());
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment
    public bLW d(C1619aI c1619aI) {
        C8632dsu.c((Object) c1619aI, "");
        dwU e2 = aq().e();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C8632dsu.a(viewLifecycleOwner, "");
        return new bLW(e2, c1619aI, viewLifecycleOwner, 350L, 0, new drM<bLR<?>, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment$createEpoxyAutoPlay$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(bLR<?> blr) {
                e(blr);
                return dpR.c;
            }

            public final void e(bLR<?> blr) {
                C8632dsu.c((Object) blr, "");
                FeedLolomoFragment.b.getLogTag();
            }
        }, new drM<bLR<?>, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment$createEpoxyAutoPlay$2
            @Override // o.drM
            public /* synthetic */ dpR invoke(bLR<?> blr) {
                a(blr);
                return dpR.c;
            }

            public final void a(bLR<?> blr) {
                C8632dsu.c((Object) blr, "");
                FeedLolomoFragment.b.getLogTag();
            }
        }, null, 144, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment
    /* renamed from: I */
    public C4030bTq M() {
        return new C4030bTq(by_(), aq());
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment
    public C4048bUh F() {
        return new C4048bUh(new InterfaceC8612dsa<Integer, String, String, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment$buildVolatileRowHandler$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(Integer num, String str, String str2) {
                e(num.intValue(), str, str2);
                return dpR.c;
            }

            public final void e(int i, String str, String str2) {
                bTF.d(FeedLolomoFragment.this.aq(), i, false, 2, null);
            }
        });
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment, o.InterfaceC8894fN
    public void e() {
        super.e();
        C8980gu.c(aq(), new drM<C4049bUi, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment$invalidate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final dpR invoke(C4049bUi c4049bUi) {
                LolomoMvRxFragment.e ak;
                MiniPlayerVideoGroupViewModel au;
                List<LoMo> c2;
                bSY f;
                C8632dsu.c((Object) c4049bUi, "");
                ak = FeedLolomoFragment.this.ak();
                C4052bUl a2 = (ak == null || (f = ak.f()) == null) ? null : f.a();
                final C4030bTq c4030bTq = a2 instanceof C4030bTq ? (C4030bTq) a2 : null;
                if (c4030bTq != null && (c2 = c4049bUi.r().c()) != null) {
                    FeedLolomoFragment feedLolomoFragment = FeedLolomoFragment.this;
                    for (final LoMo loMo : c2) {
                        String listId = loMo.getListId();
                        if (listId != null && loMo.d()) {
                            feedLolomoFragment.aq().b(listId, new drX<LoMo, List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>>, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment$invalidate$1$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // o.drX
                                public /* synthetic */ dpR invoke(LoMo loMo2, List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>> list) {
                                    e(loMo2, list);
                                    return dpR.c;
                                }

                                public final void e(LoMo loMo2, List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>> list) {
                                    List<TrailerItem> j;
                                    List<TrailerItem> j2;
                                    C8632dsu.c((Object) loMo2, "");
                                    C8632dsu.c((Object) list, "");
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj : list) {
                                        if (obj instanceof TrailerItem) {
                                            arrayList.add(obj);
                                        }
                                    }
                                    j = C8576dqs.j((Iterable) arrayList, 3);
                                    C4030bTq c4030bTq2 = c4030bTq;
                                    for (TrailerItem trailerItem : j) {
                                        c4030bTq2.d(trailerItem);
                                    }
                                    if (arrayList.size() == LoMo.this.getLength()) {
                                        j2 = C8576dqs.j((List) arrayList, 2);
                                        C4030bTq c4030bTq3 = c4030bTq;
                                        for (TrailerItem trailerItem2 : j2) {
                                            c4030bTq3.d(trailerItem2);
                                        }
                                    }
                                }
                            });
                        }
                    }
                }
                C4029bTp e2 = c4049bUi.e();
                if (e2 != null) {
                    au = FeedLolomoFragment.this.au();
                    au.c(new AbstractC5271bvc.c("up-next-feed-list", e2.c()));
                    return dpR.c;
                }
                return null;
            }
        });
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment, com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        bMZ fragmentHelper;
        NetflixActivity bj_ = bj_();
        NetflixFrag c2 = (bj_ == null || (fragmentHelper = bj_.getFragmentHelper()) == null) ? null : fragmentHelper.c();
        if (c2 == null || C8632dsu.c(c2, this)) {
            NetflixActivity bj_2 = bj_();
            NetflixActivity bj_3 = bj_();
            Boolean bool = (Boolean) C9726vo.d(bj_2, bj_3 != null ? bj_3.getNetflixActionBar() : null, new drX<NetflixActivity, NetflixActionBar, Boolean>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment$updateActionBar$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(2);
                }

                @Override // o.drX
                /* renamed from: a */
                public final Boolean invoke(NetflixActivity netflixActivity, NetflixActionBar netflixActionBar) {
                    C8632dsu.c((Object) netflixActivity, "");
                    C8632dsu.c((Object) netflixActionBar, "");
                    netflixActionBar.c(netflixActivity.getActionBarStateBuilder().d(FeedLolomoFragment.this).e((CharSequence) C8168dfL.d(R.o.lC)).h(true).c());
                    return Boolean.TRUE;
                }
            });
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return false;
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment
    public void d(final InterfaceC2023aX interfaceC2023aX) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8980gu.c(aq(), new drM<C4049bUi, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment$buildHeader$1
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

            public final void b(C4049bUi c4049bUi) {
                LolomoMvRxFragment.d Z;
                List<TrailerItem.a> i;
                C8632dsu.c((Object) c4049bUi, "");
                Z = FeedLolomoFragment.this.Z();
                cYB o2 = Z.o();
                FragmentActivity activity = FeedLolomoFragment.this.getActivity();
                InterfaceC2023aX interfaceC2023aX2 = interfaceC2023aX;
                C4029bTp e2 = c4049bUi.e();
                if (e2 == null || (i = e2.e()) == null) {
                    i = C8569dql.i();
                }
                final FeedLolomoFragment feedLolomoFragment = FeedLolomoFragment.this;
                o2.d(activity, interfaceC2023aX2, i, new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.feed.FeedLolomoFragment$buildHeader$1.1
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Integer num) {
                        a(num.intValue());
                        return dpR.c;
                    }

                    public final void a(int i2) {
                        FeedLolomoFragment.this.s = i2;
                        FeedLolomoFragment.this.e(i2);
                    }
                });
            }
        });
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment, com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        LolomoMvRxFragment.e ak;
        HomeEpoxyController j;
        LolomoMvRxFragment.e ak2;
        bTX n;
        RecyclerView.OnItemTouchListener onItemTouchListener = this.t;
        if (onItemTouchListener != null && (ak2 = ak()) != null && (n = ak2.n()) != null) {
            n.removeOnItemTouchListener(onItemTouchListener);
        }
        this.t = null;
        InterfaceC4255bb interfaceC4255bb = this.n;
        if (interfaceC4255bb != null && (ak = ak()) != null && (j = ak.j()) != null) {
            j.removeModelBuildListener(interfaceC4255bb);
        }
        this.n = null;
        super.onDestroyView();
    }

    /* loaded from: classes4.dex */
    public static final class e implements RecyclerView.OnItemTouchListener {
        final /* synthetic */ bTX b;

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            C8632dsu.c((Object) recyclerView, "");
            C8632dsu.c((Object) motionEvent, "");
        }

        e(bTX btx) {
            this.b = btx;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            C8632dsu.c((Object) recyclerView, "");
            C8632dsu.c((Object) motionEvent, "");
            InterfaceC4255bb interfaceC4255bb = FeedLolomoFragment.this.n;
            if (interfaceC4255bb != null) {
                FeedLolomoFragment.this.aF().j().removeModelBuildListener(interfaceC4255bb);
            }
            FeedLolomoFragment.this.n = null;
            this.b.removeOnItemTouchListener(this);
            return false;
        }
    }

    private final void aC() {
        bTX n = aF().n();
        e eVar = new e(n);
        n.addOnItemTouchListener(eVar);
        this.t = eVar;
        n.setItemAnimator(null);
        n.addOnScrollListener(new b());
        new C9962zq(aJ()).attachToRecyclerView(n);
    }

    /* loaded from: classes4.dex */
    public static final class b extends RecyclerView.OnScrollListener {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Integer aE;
            C8632dsu.c((Object) recyclerView, "");
            NetflixActivity bj_ = FeedLolomoFragment.this.bj_();
            if (bj_ != null) {
                bj_.onScrolled(i2);
            }
            if (FeedLolomoFragment.this.p || (aE = FeedLolomoFragment.this.aE()) == null) {
                return;
            }
            FeedLolomoFragment feedLolomoFragment = FeedLolomoFragment.this;
            int intValue = aE.intValue();
            if (feedLolomoFragment.s != intValue) {
                feedLolomoFragment.s = intValue;
                recyclerView.performHapticFeedback(0);
                View c = feedLolomoFragment.ai().c();
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
                FeedLolomoFragment.this.p = false;
            } else if (scrollState != 1) {
            } else {
                FeedLolomoFragment.this.p = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer aE() {
        Integer aD = aD();
        if (aD != null) {
            return aJ().getSectionIndexForModelPos(aD.intValue());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(int i) {
        bTX n = aF().n();
        n.performHapticFeedback(0);
        Integer firstTargetItemForSection = aJ().getFirstTargetItemForSection(i);
        if (firstTargetItemForSection != null) {
            int intValue = firstTargetItemForSection.intValue();
            Integer aD = aD();
            if (aD != null) {
                int intValue2 = aD.intValue() - intValue;
                int i2 = e;
                if (intValue2 > i2) {
                    n.scrollToPosition(i2 + intValue);
                } else if (intValue2 < (-i2)) {
                    n.scrollToPosition(intValue - i2);
                }
            }
            d(this, n, intValue, 0, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC9960zo aJ() {
        HomeEpoxyController j = aF().j();
        C8632dsu.d(j);
        return (InterfaceC9960zo) j;
    }

    static /* synthetic */ void d(FeedLolomoFragment feedLolomoFragment, RecyclerView recyclerView, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        feedLolomoFragment.c(recyclerView, i, i2);
    }

    /* loaded from: classes4.dex */
    public static final class c extends LinearSmoothScroller {
        final /* synthetic */ RecyclerView a;
        final /* synthetic */ FeedLolomoFragment b;
        final /* synthetic */ int c;
        final /* synthetic */ RecyclerView.LayoutManager d;
        final /* synthetic */ int e;

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            return this.e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i, FeedLolomoFragment feedLolomoFragment, int i2, RecyclerView recyclerView, RecyclerView.LayoutManager layoutManager, Context context) {
            super(context);
            this.e = i;
            this.b = feedLolomoFragment;
            this.c = i2;
            this.a = recyclerView;
            this.d = layoutManager;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public void onStart() {
            super.onStart();
            this.b.f13272o = this.c;
            this.b.p = true;
            this.a.getViewTreeObserver().addOnPreDrawListener(new a(this.b, this.c, this.a, this.d));
        }

        /* loaded from: classes4.dex */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {
            final /* synthetic */ FeedLolomoFragment b;
            final /* synthetic */ int c;
            final /* synthetic */ RecyclerView d;
            final /* synthetic */ RecyclerView.LayoutManager e;

            a(FeedLolomoFragment feedLolomoFragment, int i, RecyclerView recyclerView, RecyclerView.LayoutManager layoutManager) {
                this.b = feedLolomoFragment;
                this.c = i;
                this.d = recyclerView;
                this.e = layoutManager;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (this.b.p || this.b.f13272o != this.c) {
                    return true;
                }
                this.d.getViewTreeObserver().removeOnPreDrawListener(this);
                RecyclerView.LayoutManager layoutManager = this.e;
                C8632dsu.d(layoutManager);
                int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                int findFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) this.e).findFirstCompletelyVisibleItemPosition();
                int i = this.c;
                if (findFirstVisibleItemPosition == i && (findFirstCompletelyVisibleItemPosition == -1 || findFirstCompletelyVisibleItemPosition == i)) {
                    return true;
                }
                FeedLolomoFragment.d(this.b, this.d, i, 0, 2, null);
                return true;
            }
        }
    }

    private final void c(RecyclerView recyclerView, int i, int i2) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            c cVar = new c(i2, this, i, recyclerView, layoutManager, recyclerView.getContext());
            cVar.setTargetPosition(i);
            layoutManager.startSmoothScroll(cVar);
        }
    }

    private final Integer aD() {
        int findFirstVisibleItemPosition;
        RecyclerView.LayoutManager layoutManager = aF().n().getLayoutManager();
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

    private final boolean aG() {
        return (!C6692ciB.a.d() || AccessibilityUtils.a(by_()) || aK()) ? false : true;
    }
}
