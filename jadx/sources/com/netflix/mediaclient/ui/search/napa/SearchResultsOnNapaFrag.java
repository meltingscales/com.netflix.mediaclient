package com.netflix.mediaclient.ui.search.napa;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.action.Search;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.PlayCommand;
import com.netflix.cl.model.event.session.command.SelectCommand;
import com.netflix.cl.model.event.session.command.ViewDetailsCommand;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.ui.search.SearchUtils;
import com.netflix.mediaclient.ui.search.napa.SearchResultsOnNapaFrag;
import com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchFragmentV3;
import com.netflix.mediaclient.ui.search.v2.SearchEpoxyController;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractC6078cTd;
import o.C1045Mp;
import o.C1076Nu;
import o.C1596aHd;
import o.C6038cRr;
import o.C6127cUw;
import o.C8150deu;
import o.C8153dex;
import o.C8168dfL;
import o.C8169dfM;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.C8737dwr;
import o.C9665ug;
import o.C9726vo;
import o.C9867yA;
import o.C9870yD;
import o.C9935zP;
import o.InterfaceC1270Vf;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC3643bFl;
import o.InterfaceC3645bFn;
import o.InterfaceC5223buh;
import o.InterfaceC5278bvj;
import o.InterfaceC6083cTf;
import o.InterfaceC6086cTi;
import o.InterfaceC8366diy;
import o.NC;
import o.aDB;
import o.bNN;
import o.bZI;
import o.cRD;
import o.cRH;
import o.cRJ;
import o.cRP;
import o.cRR;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;
import o.drX;
import org.chromium.net.PrivateKeyType;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class SearchResultsOnNapaFrag extends cRD {
    public static final b b = new b(null);
    private SearchResultsOnNapaUIView C;
    private InterfaceC6086cTi D;
    @Inject
    public InterfaceC1270Vf clock;
    @Inject
    public InterfaceC3645bFn detailsPagePrefetcher;
    private final AppView e;
    @Inject
    public Lazy<bNN> gameModels;
    @Inject
    public aDB graphQLArtworkParams;
    private C1076Nu j;
    private final c k;
    private final C9935zP l;
    @Inject
    public Lazy<bZI> liveStateManager;
    private boolean m;
    private long n;

    /* renamed from: o  reason: collision with root package name */
    private final Runnable f13320o;
    private String p;
    @Inject
    public Lazy<PlaybackLauncher> playbackLauncher;
    private final C9867yA.b q;
    private Runnable r;
    private final boolean s;
    @Inject
    public InterfaceC6083cTf searchRepositoryFactory;
    private PreQuerySearchFragmentV3 t;
    private final String u;
    private long v;
    private C6127cUw w;
    private Disposable x;
    private Long y;
    private cRP z;

    public SearchResultsOnNapaFrag() {
        this(null, 1, null);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public AppView bh_() {
        return this.e;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bo_() {
        return this.s;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return this.m;
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("SearchResultsOnNapaFrag");
        }

        public final SearchResultsOnNapaFrag e(String str) {
            C8632dsu.c((Object) str, "");
            return new SearchResultsOnNapaFrag(str);
        }
    }

    public SearchResultsOnNapaFrag(String str) {
        C8632dsu.c((Object) str, "");
        this.u = str;
        this.q = new C9867yA.b() { // from class: o.cRL
            @Override // o.C9867yA.b
            public final void onKeyboardStateChanged(boolean z) {
                SearchResultsOnNapaFrag.d(SearchResultsOnNapaFrag.this, z);
            }
        };
        this.k = new c();
        this.p = "";
        this.l = C9935zP.b.d(this);
        this.e = AppView.searchTitleResults;
        this.s = true;
        this.f13320o = new Runnable() { // from class: o.cRK
            @Override // java.lang.Runnable
            public final void run() {
                SearchResultsOnNapaFrag.i(SearchResultsOnNapaFrag.this);
            }
        };
    }

    public /* synthetic */ SearchResultsOnNapaFrag(String str, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? "" : str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(SearchResultsOnNapaFrag searchResultsOnNapaFrag, boolean z) {
        C8632dsu.c((Object) searchResultsOnNapaFrag, "");
        if (z) {
            searchResultsOnNapaFrag.U();
        } else {
            searchResultsOnNapaFrag.V();
        }
    }

    public final InterfaceC1270Vf e() {
        InterfaceC1270Vf interfaceC1270Vf = this.clock;
        if (interfaceC1270Vf != null) {
            return interfaceC1270Vf;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC3645bFn I() {
        InterfaceC3645bFn interfaceC3645bFn = this.detailsPagePrefetcher;
        if (interfaceC3645bFn != null) {
            return interfaceC3645bFn;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<bZI> M() {
        Lazy<bZI> lazy = this.liveStateManager;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<bNN> G() {
        Lazy<bNN> lazy = this.gameModels;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<PlaybackLauncher> J() {
        Lazy<PlaybackLauncher> lazy = this.playbackLauncher;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC6083cTf L() {
        InterfaceC6083cTf interfaceC6083cTf = this.searchRepositoryFactory;
        if (interfaceC6083cTf != null) {
            return interfaceC6083cTf;
        }
        C8632dsu.d("");
        return null;
    }

    public final aDB F() {
        aDB adb = this.graphQLArtworkParams;
        if (adb != null) {
            return adb;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class c implements SearchEpoxyController.b {
        c() {
        }

        @Override // com.netflix.mediaclient.ui.search.v2.SearchEpoxyController.b
        public bNN d() {
            bNN bnn = SearchResultsOnNapaFrag.this.G().get();
            C8632dsu.a(bnn, "");
            return bnn;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String O() {
        String string;
        if (BrowseExperience.a()) {
            string = getString(R.o.lp);
        } else if (C8153dex.w()) {
            string = getString(R.o.lo);
        } else {
            string = getString(R.o.lh);
        }
        C8632dsu.d((Object) string);
        return string;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        X();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (this.j != null) {
            NetflixApplication.getInstance().D().a(this.j);
        }
        super.onDestroy();
    }

    private final void a(Bundle bundle) {
        if (C8168dfL.h(this.p)) {
            bundle.putString("instance_state_query", this.p);
            SearchUtils.a(bundle);
        }
    }

    private final cRJ P() {
        return new cRH();
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"AutoDispose", "CheckResult"})
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        InterfaceC6086cTi interfaceC6086cTi;
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) layoutInflater, "");
        if (viewGroup == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("onCreateView container is null in SearchResultsFrag_Ab22078", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    c1596aHd.a(errorType.c() + " " + b2);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
            return null;
        }
        SearchResultsOnNapaUIView searchResultsOnNapaUIView = new SearchResultsOnNapaUIView(viewGroup, AppView.searchTitleResults, this.l, P(), this, this.k);
        this.C = searchResultsOnNapaUIView;
        Observable<AbstractC6078cTd> takeUntil = searchResultsOnNapaUIView.v().takeUntil(this.l.d());
        final drM<AbstractC6078cTd, dpR> drm = new drM<AbstractC6078cTd, dpR>() { // from class: com.netflix.mediaclient.ui.search.napa.SearchResultsOnNapaFrag$onCreateView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC6078cTd abstractC6078cTd) {
                a(abstractC6078cTd);
                return dpR.c;
            }

            public final void a(final AbstractC6078cTd abstractC6078cTd) {
                NetflixActivity bj_;
                Long l;
                Long l2;
                C9935zP c9935zP;
                String str;
                String str2;
                C9935zP c9935zP2;
                C6127cUw c6127cUw;
                String O;
                if (abstractC6078cTd instanceof AbstractC6078cTd.C) {
                    SearchResultsOnNapaFrag.this.d(((AbstractC6078cTd.C) abstractC6078cTd).e());
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.u) {
                    SearchResultsOnNapaFrag.this.m = false;
                    SearchResultsOnNapaFrag.this.d(false);
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.e) {
                    c6127cUw = SearchResultsOnNapaFrag.this.w;
                    if (c6127cUw != null) {
                        SearchResultsOnNapaFrag searchResultsOnNapaFrag = SearchResultsOnNapaFrag.this;
                        if (!TextUtils.isEmpty(c6127cUw.w().getQuery())) {
                            c6127cUw.a("", true);
                        }
                        O = searchResultsOnNapaFrag.O();
                        c6127cUw.c(O);
                    }
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.o) {
                    SearchResultsOnNapaFrag.this.R();
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.z) {
                    SearchResultsOnNapaFrag.this.R();
                    C6038cRr.e eVar = C6038cRr.e;
                    C8632dsu.d(abstractC6078cTd);
                    C6038cRr.e.b(eVar, (AbstractC6078cTd.z) abstractC6078cTd, SearchResultsOnNapaFrag.this.bj_(), "searchResults", null, 8, null);
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.r) {
                    c9935zP2 = SearchResultsOnNapaFrag.this.l;
                    c9935zP2.b(AbstractC6078cTd.class, AbstractC6078cTd.r.e);
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.w) {
                    Intent intent = new Intent(SearchResultsOnNapaFrag.this.getContext(), cRR.c.c());
                    AbstractC6078cTd.w wVar = (AbstractC6078cTd.w) abstractC6078cTd;
                    intent.putExtra("EntityId", wVar.d());
                    intent.putExtra("Title", wVar.e());
                    intent.putExtra("SuggestionType", wVar.a());
                    str2 = SearchResultsOnNapaFrag.this.p;
                    intent.putExtra("query", str2);
                    intent.putExtra("ParentRefId", wVar.c());
                    Context context = SearchResultsOnNapaFrag.this.getContext();
                    if (context != null) {
                        context.startActivity(intent);
                    }
                    CLv2Utils.INSTANCE.b(new Focus(AppView.searchSuggestionResults, wVar.b().g()), (Command) new SelectCommand(), true);
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.g) {
                    SearchUtils.e(SearchResultsOnNapaFrag.this.requireContext());
                    SearchResultsOnNapaFrag searchResultsOnNapaFrag2 = SearchResultsOnNapaFrag.this;
                    str = searchResultsOnNapaFrag2.p;
                    searchResultsOnNapaFrag2.b(str);
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.x) {
                    c9935zP = SearchResultsOnNapaFrag.this.l;
                    c9935zP.b(AbstractC6078cTd.class, AbstractC6078cTd.x.a);
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.C6081c) {
                    AbstractC6078cTd.C6081c c6081c = (AbstractC6078cTd.C6081c) abstractC6078cTd;
                    if (c6081c.e() != null) {
                        ExtLogger extLogger = ExtLogger.INSTANCE;
                        l2 = SearchResultsOnNapaFrag.this.y;
                        extLogger.failedAction(l2, C8169dfM.d(c6081c.e()));
                        SearchResultsOnNapaFrag.this.y = null;
                        return;
                    }
                    Logger logger = Logger.INSTANCE;
                    l = SearchResultsOnNapaFrag.this.y;
                    logger.endSession(l);
                    SearchResultsOnNapaFrag.this.y = null;
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.q) {
                    SearchResultsOnNapaFrag.this.I().c(SearchResultsOnNapaFrag.this.bl_(), ((AbstractC6078cTd.q) abstractC6078cTd).e());
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.p) {
                    SearchResultsOnNapaFrag.this.R();
                    AbstractC6078cTd.p pVar = (AbstractC6078cTd.p) abstractC6078cTd;
                    final TrackingInfoHolder e = pVar.e();
                    final InterfaceC5278bvj a2 = pVar.a();
                    NetflixActivity bj_2 = SearchResultsOnNapaFrag.this.bj_();
                    final SearchResultsOnNapaFrag searchResultsOnNapaFrag3 = SearchResultsOnNapaFrag.this;
                    C9726vo.d(bj_2, a2, new drX<NetflixActivity, InterfaceC5278bvj, dpR>() { // from class: com.netflix.mediaclient.ui.search.napa.SearchResultsOnNapaFrag$onCreateView$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // o.drX
                        public /* synthetic */ dpR invoke(NetflixActivity netflixActivity, InterfaceC5278bvj interfaceC5278bvj) {
                            c(netflixActivity, interfaceC5278bvj);
                            return dpR.c;
                        }

                        public final void c(NetflixActivity netflixActivity, InterfaceC5278bvj interfaceC5278bvj) {
                            C8632dsu.c((Object) netflixActivity, "");
                            C8632dsu.c((Object) interfaceC5278bvj, "");
                            TrackingInfoHolder trackingInfoHolder = TrackingInfoHolder.this;
                            InterfaceC5223buh aF = ((InterfaceC8366diy) interfaceC5278bvj).aF();
                            C8632dsu.a(aF, "");
                            PlayContextImp b3 = TrackingInfoHolder.b(trackingInfoHolder.e(aF, ((AbstractC6078cTd.p) abstractC6078cTd).d()), PlayLocationType.DIRECT_PLAY, false, 2, null);
                            PlaybackLauncher playbackLauncher = searchResultsOnNapaFrag3.J().get();
                            C8632dsu.a(playbackLauncher, "");
                            InterfaceC5278bvj interfaceC5278bvj2 = a2;
                            VideoType type = interfaceC5278bvj2.getType();
                            C8632dsu.a(type, "");
                            PlaybackLauncher.b.a(playbackLauncher, interfaceC5278bvj2, type, b3, new PlayerExtras(0L, 0L, 0, false, false, null, false, null, 0L, 0.0f, null, null, null, null, null, 32767, null), null, 16, null);
                        }
                    });
                    if (e.e() != null) {
                        CLv2Utils.INSTANCE.b(new Focus(AppView.searchResults, e.g()), (Command) new PlayCommand(null), true);
                    }
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.j) {
                    AbstractC6078cTd.j jVar = (AbstractC6078cTd.j) abstractC6078cTd;
                    CLv2Utils.INSTANCE.b(new Focus(AppView.searchResults, jVar.a().g()), (Command) new ViewDetailsCommand(), false);
                    InterfaceC3643bFl.b bVar = InterfaceC3643bFl.c;
                    Context requireContext = SearchResultsOnNapaFrag.this.requireContext();
                    C8632dsu.a(requireContext, "");
                    InterfaceC3643bFl.c.a(bVar.a(requireContext), SearchResultsOnNapaFrag.this.by_(), VideoType.GAMES, jVar.e(), jVar.b(), jVar.a(), "search", null, 64, null);
                } else if (!(abstractC6078cTd instanceof AbstractC6078cTd.s) || (bj_ = SearchResultsOnNapaFrag.this.bj_()) == null) {
                } else {
                    bj_.onScrolled(((AbstractC6078cTd.s) abstractC6078cTd).e());
                }
            }
        };
        takeUntil.subscribe(new Consumer() { // from class: o.cRM
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SearchResultsOnNapaFrag.c(drM.this, obj);
            }
        });
        NetflixActivity by_ = by_();
        this.D = L().d(this.l.d());
        Observable d3 = this.l.d(AbstractC6078cTd.class);
        InterfaceC6086cTi interfaceC6086cTi2 = this.D;
        if (interfaceC6086cTi2 == null) {
            C8632dsu.d("");
            interfaceC6086cTi = null;
        } else {
            interfaceC6086cTi = interfaceC6086cTi2;
        }
        this.z = new cRP(d3, searchResultsOnNapaUIView, interfaceC6086cTi, this.l.d(), M(), LifecycleOwnerKt.getLifecycleScope(this), F());
        Fragment findFragmentByTag = by_.getSupportFragmentManager().findFragmentByTag("PRE_QUERY_LIST");
        C8632dsu.d(findFragmentByTag);
        this.t = (PreQuerySearchFragmentV3) findFragmentByTag;
        NetflixActionBar netflixActionBar = by_.getNetflixActionBar();
        if (netflixActionBar instanceof C6127cUw) {
            this.w = (C6127cUw) netflixActionBar;
        }
        by_.getKeyboardState().c(this.q);
        d(false);
        W();
        d(bundle);
        return searchResultsOnNapaUIView.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1076Nu {
        d() {
        }

        @Override // o.C1076Nu, o.InterfaceC1072Nq
        public void a(NC nc, boolean z) {
            C8632dsu.c((Object) nc, "");
            SearchResultsOnNapaFrag.this.n = SearchUtils.d();
        }
    }

    private final void X() {
        if (this.j == null) {
            this.j = new d();
        }
        NetflixApplication.getInstance().D().c(this.j);
    }

    private final void d(Bundle bundle) {
        if (bundle == null) {
            SearchResultsOnNapaUIView searchResultsOnNapaUIView = this.C;
            if (searchResultsOnNapaUIView != null) {
                searchResultsOnNapaUIView.o();
            }
        } else if (bundle.containsKey("instance_state_query")) {
            b(bundle);
        } else {
            SearchResultsOnNapaUIView searchResultsOnNapaUIView2 = this.C;
            if (searchResultsOnNapaUIView2 != null) {
                searchResultsOnNapaUIView2.o();
            }
        }
    }

    private final void b(Bundle bundle) {
        Map d2;
        Map k;
        Throwable th;
        if (bundle == null) {
            return;
        }
        if (this.w == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("restoreQuery but searchActionBar == null", null, null, true, k, false, false, 96, null);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        } else if (bundle.containsKey("instance_state_query")) {
            if (!SearchUtils.e(bundle)) {
                String string = bundle.getString("instance_state_query", "");
                C6127cUw c6127cUw = this.w;
                if (c6127cUw != null) {
                    c6127cUw.a(string, true);
                    return;
                }
                return;
            }
            C6127cUw c6127cUw2 = this.w;
            if (c6127cUw2 != null) {
                c6127cUw2.a("", true);
            }
            SearchResultsOnNapaUIView searchResultsOnNapaUIView = this.C;
            if (searchResultsOnNapaUIView != null) {
                searchResultsOnNapaUIView.o();
            }
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        C8632dsu.c((Object) bundle, "");
        a(bundle);
        super.onSaveInstanceState(bundle);
    }

    private final void U() {
        C6127cUw c6127cUw = this.w;
        if (c6127cUw != null) {
            c6127cUw.I();
        }
    }

    private final void V() {
        C6127cUw c6127cUw = this.w;
        if (c6127cUw != null) {
            c6127cUw.C();
        }
    }

    private final void W() {
        Map d2;
        Map k;
        Throwable th;
        C6127cUw c6127cUw = this.w;
        if (c6127cUw != null) {
            Disposable disposable = this.x;
            if (disposable != null) {
                if (disposable != null) {
                    disposable.dispose();
                }
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd("searchTextChanges should be null", null, null, true, k, false, false, 96, null);
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
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
            }
            Observable<C9665ug> takeUntil = c6127cUw.v().observeOn(AndroidSchedulers.mainThread()).takeUntil(this.l.d());
            C8632dsu.a(takeUntil, "");
            this.x = SubscribersKt.subscribeBy$default(takeUntil, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.search.napa.SearchResultsOnNapaFrag$setupQueryTextChangeListener$1$1
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th2) {
                    a(th2);
                    return dpR.c;
                }

                public final void a(Throwable th2) {
                    Map d3;
                    Map k2;
                    Throwable th3;
                    C8632dsu.c((Object) th2, "");
                    InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                    d3 = dqE.d();
                    k2 = dqE.k(d3);
                    C1596aHd c1596aHd2 = new C1596aHd("searchTextChanges error", th2, null, true, k2, false, false, 96, null);
                    ErrorType errorType2 = c1596aHd2.a;
                    if (errorType2 != null) {
                        c1596aHd2.e.put("errorType", errorType2.c());
                        String b3 = c1596aHd2.b();
                        if (b3 != null) {
                            String c3 = errorType2.c();
                            c1596aHd2.a(c3 + " " + b3);
                        }
                    }
                    if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                        th3 = new Throwable(c1596aHd2.b(), c1596aHd2.i);
                    } else if (c1596aHd2.b() != null) {
                        th3 = new Throwable(c1596aHd2.b());
                    } else {
                        th3 = c1596aHd2.i;
                        if (th3 == null) {
                            th3 = new Throwable("Handled exception with no message");
                        } else if (th3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a2 = dVar2.a();
                    if (a2 != null) {
                        a2.e(c1596aHd2, th3);
                    } else {
                        dVar2.e().b(c1596aHd2, th3);
                    }
                }
            }, (drO) null, new drM<C9665ug, dpR>() { // from class: com.netflix.mediaclient.ui.search.napa.SearchResultsOnNapaFrag$setupQueryTextChangeListener$1$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C9665ug c9665ug) {
                    e(c9665ug);
                    return dpR.c;
                }

                public final void e(C9665ug c9665ug) {
                    C6127cUw c6127cUw2;
                    if (SearchResultsOnNapaFrag.this.bn_()) {
                        String obj = c9665ug.d().getQuery().toString();
                        SearchResultsOnNapaFrag.b.getLogTag();
                        SearchResultsOnNapaFrag.this.c(obj);
                        if (c9665ug.c()) {
                            c6127cUw2 = SearchResultsOnNapaFrag.this.w;
                            if (c6127cUw2 != null) {
                                c6127cUw2.u();
                            }
                            SearchResultsOnNapaFrag.this.Q();
                        }
                    }
                }
            }, 2, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(String str) {
        if (str != null && !TextUtils.equals(this.p, str)) {
            b(str);
        } else {
            b.getLogTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String str) {
        if (bo_() && str.length() > 0) {
            bB_();
            bA_().a(bh_(), this, by_()).a(true).a();
        }
        e(str);
        this.v++;
        cRP crp = this.z;
        if (crp == null) {
            C8632dsu.d("");
            crp = null;
        }
        crp.c(this.v);
        if (str.length() == 0) {
            Logger.INSTANCE.endSession(this.y);
            this.y = null;
        }
        SearchResultsOnNapaUIView searchResultsOnNapaUIView = this.C;
        if (searchResultsOnNapaUIView != null) {
            searchResultsOnNapaUIView.c(str);
        }
        SearchResultsOnNapaUIView searchResultsOnNapaUIView2 = this.C;
        if (searchResultsOnNapaUIView2 != null) {
            searchResultsOnNapaUIView2.e(this.v);
        }
        if (this.p.length() == 0) {
            PreQuerySearchFragmentV3 preQuerySearchFragmentV3 = this.t;
            if (preQuerySearchFragmentV3 != null) {
                preQuerySearchFragmentV3.d(true);
                return;
            }
            return;
        }
        this.r = null;
        if (bl_() == null) {
            this.r = this.f13320o;
        } else {
            this.f13320o.run();
        }
        PreQuerySearchFragmentV3 preQuerySearchFragmentV32 = this.t;
        if (preQuerySearchFragmentV32 != null) {
            preQuerySearchFragmentV32.d(false);
        }
    }

    private final void e(String str) {
        boolean g;
        this.p = str;
        g = C8691duz.g(str);
        if (g) {
            this.l.b(AbstractC6078cTd.class, AbstractC6078cTd.y.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(boolean z) {
        C6127cUw c6127cUw = this.w;
        if (c6127cUw != null) {
            if (z) {
                c6127cUw.F();
            } else {
                c6127cUw.z();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        SearchResultsOnNapaUIView searchResultsOnNapaUIView;
        super.onStart();
        if (isVisible() && this.p.length() == 0) {
            PreQuerySearchFragmentV3 preQuerySearchFragmentV3 = this.t;
            if (preQuerySearchFragmentV3 != null) {
                preQuerySearchFragmentV3.d(true);
            }
        } else if (this.p.length() <= 0 || (searchResultsOnNapaUIView = this.C) == null) {
        } else {
            searchResultsOnNapaUIView.n();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        SearchResultsOnNapaUIView searchResultsOnNapaUIView;
        super.onStop();
        PreQuerySearchFragmentV3 preQuerySearchFragmentV3 = this.t;
        if (preQuerySearchFragmentV3 != null) {
            preQuerySearchFragmentV3.d(false);
        }
        if (this.p.length() <= 0 || (searchResultsOnNapaUIView = this.C) == null) {
            return;
        }
        searchResultsOnNapaUIView.D();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        NetflixActionBar netflixActionBar;
        NetflixActivity bj_ = bj_();
        if (isHidden() || bj_ == null || (netflixActionBar = bj_.getNetflixActionBar()) == null) {
            return false;
        }
        netflixActionBar.c(bj_.getActionBarStateBuilder().c(true).c());
        netflixActionBar.a(PrivateKeyType.INVALID);
        return true;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, o.bFP
    public boolean o() {
        String str;
        C6127cUw c6127cUw = this.w;
        if (c6127cUw != null) {
            str = c6127cUw != null ? c6127cUw.x() : null;
        } else {
            str = this.p;
        }
        if (str == null || str.length() == 0) {
            return super.o();
        }
        SearchResultsOnNapaUIView searchResultsOnNapaUIView = this.C;
        if (searchResultsOnNapaUIView != null) {
            searchResultsOnNapaUIView.o();
        }
        return true;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(View view) {
        C8632dsu.c((Object) view, "");
        SearchResultsOnNapaUIView searchResultsOnNapaUIView = this.C;
        if (searchResultsOnNapaUIView != null) {
            a(searchResultsOnNapaUIView.f());
            a(searchResultsOnNapaUIView.q());
            C9870yD.b((View) searchResultsOnNapaUIView.w(), 1, ((NetflixFrag) this).d);
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Disposable disposable = this.x;
        if (disposable != null) {
            disposable.dispose();
        }
        this.x = null;
        SearchResultsOnNapaUIView searchResultsOnNapaUIView = this.C;
        if (searchResultsOnNapaUIView != null) {
            searchResultsOnNapaUIView.D();
        }
        SearchResultsOnNapaUIView searchResultsOnNapaUIView2 = this.C;
        if (searchResultsOnNapaUIView2 != null) {
            searchResultsOnNapaUIView2.B();
        }
        by_().getKeyboardState().e(this.q);
        Logger.INSTANCE.cancelSession(this.y);
        this.y = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() {
        FragmentActivity activity = getActivity();
        View currentFocus = activity != null ? activity.getCurrentFocus() : null;
        if (currentFocus instanceof EditText) {
            C8150deu.b(getActivity(), (EditText) currentFocus);
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        PreQuerySearchFragmentV3 preQuerySearchFragmentV3;
        super.onHiddenChanged(z);
        if (z) {
            SearchResultsOnNapaUIView searchResultsOnNapaUIView = this.C;
            if (searchResultsOnNapaUIView != null) {
                searchResultsOnNapaUIView.D();
            }
        } else {
            SearchResultsOnNapaUIView searchResultsOnNapaUIView2 = this.C;
            if (searchResultsOnNapaUIView2 != null) {
                searchResultsOnNapaUIView2.n();
            }
        }
        if (!TextUtils.isEmpty(this.p) || (preQuerySearchFragmentV3 = this.t) == null) {
            return;
        }
        preQuerySearchFragmentV3.d(!z);
    }

    public final void K() {
        SearchResultsOnNapaUIView searchResultsOnNapaUIView;
        SearchResultsOnNapaUIView searchResultsOnNapaUIView2 = this.C;
        if (searchResultsOnNapaUIView2 != null) {
            searchResultsOnNapaUIView2.d(true);
        }
        if (!TextUtils.isEmpty(this.p) || (searchResultsOnNapaUIView = this.C) == null) {
            return;
        }
        searchResultsOnNapaUIView.o();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onResume() {
        SearchResultsOnNapaUIView searchResultsOnNapaUIView;
        super.onResume();
        S();
        if (this.n > 0) {
            if (e().c() > this.n && (searchResultsOnNapaUIView = this.C) != null) {
                searchResultsOnNapaUIView.o();
            }
            this.n = 0L;
        }
    }

    private final void S() {
        String str;
        C6127cUw c6127cUw = this.w;
        if (c6127cUw == null || (str = c6127cUw.x()) == null) {
            str = this.p;
        }
        C8632dsu.d((Object) str);
        a(C8168dfL.g(str));
    }

    private final void a(boolean z) {
        C6127cUw c6127cUw = this.w;
        if (c6127cUw != null) {
            if (z) {
                c6127cUw.d(true);
                return;
            }
            c6127cUw.u();
            Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q() {
        if (bj_() != null) {
            C8150deu.e((Activity) bj_());
        }
    }

    public final void N() {
        PreQuerySearchFragmentV3 preQuerySearchFragmentV3 = this.t;
        if (preQuerySearchFragmentV3 != null) {
            preQuerySearchFragmentV3.d(false);
        }
    }

    public final void a() {
        C8737dwr.c(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SearchResultsOnNapaFrag$clearSearchCache$1(this, null), 3, null);
    }

    private final void a(View view) {
        if (view != null) {
            int i = ((NetflixFrag) this).d;
            int i2 = this.g;
            int i3 = this.i;
            int i4 = i + i2 + i3;
            view.setPadding(view.getPaddingLeft(), i4, view.getPaddingRight(), this.h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(SearchResultsOnNapaFrag searchResultsOnNapaFrag) {
        C8632dsu.c((Object) searchResultsOnNapaFrag, "");
        b bVar = b;
        bVar.getLogTag();
        if (!C8168dfL.g(searchResultsOnNapaFrag.p)) {
            if (searchResultsOnNapaFrag.bl_() != null) {
                if (searchResultsOnNapaFrag.y == null) {
                    searchResultsOnNapaFrag.y = Logger.INSTANCE.startSession(new Search(null, searchResultsOnNapaFrag.p, searchResultsOnNapaFrag.bh_(), null, null));
                }
                searchResultsOnNapaFrag.l.b(AbstractC6078cTd.class, new AbstractC6078cTd.f(searchResultsOnNapaFrag.p, searchResultsOnNapaFrag.v));
                searchResultsOnNapaFrag.m = true;
                searchResultsOnNapaFrag.d(true);
                return;
            }
            bVar.getLogTag();
            return;
        }
        bVar.getLogTag();
    }
}
