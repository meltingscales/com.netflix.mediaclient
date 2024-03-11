package com.netflix.mediaclient.ui.search.napa;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.search.SearchUtils;
import com.netflix.mediaclient.ui.search.napa.SearchSuggestionOnNapaFragment;
import com.netflix.mediaclient.ui.search.v2.SearchEpoxyController;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractC6078cTd;
import o.C1045Mp;
import o.C1596aHd;
import o.C6038cRr;
import o.C8627dsp;
import o.C8632dsu;
import o.C9726vo;
import o.C9935zP;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC3645bFn;
import o.InterfaceC6083cTf;
import o.InterfaceC6086cTi;
import o.bNN;
import o.cRG;
import o.cRO;
import o.cRT;
import o.dpR;
import o.dqE;
import o.drM;
import o.drX;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class SearchSuggestionOnNapaFragment extends cRG {
    public static final d b = new d(null);
    @Inject
    public InterfaceC3645bFn detailsPagePrefetcher;
    @Inject
    public Lazy<bNN> gameModels;
    private String l;

    /* renamed from: o  reason: collision with root package name */
    private String f13321o;
    private SearchUIViewOnNapa p;
    private String q;
    private InterfaceC6086cTi r;
    @Inject
    public InterfaceC6083cTf searchRepositoryFactory;
    private cRT t;
    private boolean k = true;
    private AppView e = AppView.searchSuggestionTitleResults;
    private final C9935zP n = C9935zP.b.d(this);
    private final b j = new b();
    private final boolean m = true;

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public AppView bh_() {
        return this.e;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bo_() {
        return this.m;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return this.k;
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("SearchSuggestionFragment_Ab22078");
        }

        public final SearchSuggestionOnNapaFragment a(Intent intent) {
            C8632dsu.c((Object) intent, "");
            Bundle extras = intent.getExtras();
            Bundle bundle = new Bundle();
            if (extras != null) {
                bundle.putString("SuggestionType", extras.getString("SuggestionType"));
                bundle.putString("EntityId", extras.getString("EntityId"));
                bundle.putString("SearchResultType", extras.getString("SearchResultType"));
                bundle.putString("Title", extras.getString("Title"));
                bundle.putString("query", extras.getString("query"));
                bundle.putString("ParentRefId", extras.getString("ParentRefId"));
            }
            SearchSuggestionOnNapaFragment searchSuggestionOnNapaFragment = new SearchSuggestionOnNapaFragment();
            searchSuggestionOnNapaFragment.setArguments(bundle);
            return searchSuggestionOnNapaFragment;
        }
    }

    public final InterfaceC3645bFn e() {
        InterfaceC3645bFn interfaceC3645bFn = this.detailsPagePrefetcher;
        if (interfaceC3645bFn != null) {
            return interfaceC3645bFn;
        }
        C8632dsu.d("");
        return null;
    }

    public final Lazy<bNN> a() {
        Lazy<bNN> lazy = this.gameModels;
        if (lazy != null) {
            return lazy;
        }
        C8632dsu.d("");
        return null;
    }

    public final InterfaceC6083cTf G() {
        InterfaceC6083cTf interfaceC6083cTf = this.searchRepositoryFactory;
        if (interfaceC6083cTf != null) {
            return interfaceC6083cTf;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class b implements SearchEpoxyController.b {
        b() {
        }

        @Override // com.netflix.mediaclient.ui.search.v2.SearchEpoxyController.b
        public bNN d() {
            bNN bnn = SearchSuggestionOnNapaFragment.this.a().get();
            C8632dsu.a(bnn, "");
            return bnn;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) layoutInflater, "");
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("EntityId") : null;
        String string2 = arguments != null ? arguments.getString("SuggestionType") : null;
        this.q = arguments != null ? arguments.getString("Title") : null;
        this.f13321o = arguments != null ? arguments.getString("query") : null;
        String string3 = arguments != null ? arguments.getString("ParentRefId") : null;
        this.l = string3;
        if (viewGroup == null || string == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("onCreateView container is null in SearchSuggestionOnNapaFragment", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b2);
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
        final SearchUIViewOnNapa searchUIViewOnNapa = new SearchUIViewOnNapa(viewGroup, this.e, this.n, new cRO(this.f13321o, string3, string, this.e), this, this.j);
        this.p = searchUIViewOnNapa;
        Observable<AbstractC6078cTd> takeUntil = searchUIViewOnNapa.v().takeUntil(this.n.d());
        final drM<AbstractC6078cTd, dpR> drm = new drM<AbstractC6078cTd, dpR>() { // from class: com.netflix.mediaclient.ui.search.napa.SearchSuggestionOnNapaFragment$onCreateView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC6078cTd abstractC6078cTd) {
                c(abstractC6078cTd);
                return dpR.c;
            }

            public final void c(AbstractC6078cTd abstractC6078cTd) {
                C9935zP c9935zP;
                C9935zP c9935zP2;
                if (abstractC6078cTd instanceof AbstractC6078cTd.C) {
                    SearchSuggestionOnNapaFragment.this.d(((AbstractC6078cTd.C) abstractC6078cTd).e());
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.B) {
                    SearchSuggestionOnNapaFragment.this.d(((AbstractC6078cTd.B) abstractC6078cTd).b());
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.z) {
                    C6038cRr.e eVar = C6038cRr.e;
                    C8632dsu.d(abstractC6078cTd);
                    C6038cRr.e.b(eVar, (AbstractC6078cTd.z) abstractC6078cTd, SearchSuggestionOnNapaFragment.this.bj_(), "searchSuggestions", null, 8, null);
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.u) {
                    SearchSuggestionOnNapaFragment.this.k = false;
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.x) {
                    c9935zP2 = SearchSuggestionOnNapaFragment.this.n;
                    c9935zP2.b(AbstractC6078cTd.class, AbstractC6078cTd.x.a);
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.g) {
                    SearchUtils.e(SearchSuggestionOnNapaFragment.this.requireContext());
                    c9935zP = SearchSuggestionOnNapaFragment.this.n;
                    c9935zP.b(AbstractC6078cTd.class, AbstractC6078cTd.x.a);
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.q) {
                    SearchSuggestionOnNapaFragment.this.e().e(SearchSuggestionOnNapaFragment.this.bl_(), ((AbstractC6078cTd.q) abstractC6078cTd).e());
                }
            }
        };
        takeUntil.subscribe(new Consumer() { // from class: o.cRV
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SearchSuggestionOnNapaFragment.e(drM.this, obj);
            }
        });
        this.r = G().d(this.n.d());
        C9726vo.d(string, string2, new drX<String, String, dpR>() { // from class: com.netflix.mediaclient.ui.search.napa.SearchSuggestionOnNapaFragment$onCreateView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(String str, String str2) {
                e(str, str2);
                return dpR.c;
            }

            public final void e(String str, String str2) {
                C9935zP c9935zP;
                InterfaceC6086cTi interfaceC6086cTi;
                InterfaceC6086cTi interfaceC6086cTi2;
                C9935zP c9935zP2;
                C8632dsu.c((Object) str, "");
                C8632dsu.c((Object) str2, "");
                SearchSuggestionOnNapaFragment searchSuggestionOnNapaFragment = SearchSuggestionOnNapaFragment.this;
                c9935zP = searchSuggestionOnNapaFragment.n;
                Observable d3 = c9935zP.d(AbstractC6078cTd.class);
                SearchUIViewOnNapa searchUIViewOnNapa2 = searchUIViewOnNapa;
                interfaceC6086cTi = SearchSuggestionOnNapaFragment.this.r;
                if (interfaceC6086cTi == null) {
                    C8632dsu.d("");
                    interfaceC6086cTi2 = null;
                } else {
                    interfaceC6086cTi2 = interfaceC6086cTi;
                }
                c9935zP2 = SearchSuggestionOnNapaFragment.this.n;
                searchSuggestionOnNapaFragment.t = new cRT(d3, searchUIViewOnNapa2, interfaceC6086cTi2, c9935zP2.d(), str, str2);
                searchUIViewOnNapa.o();
            }
        });
        if (string2 == null) {
            searchUIViewOnNapa.i();
        }
        return searchUIViewOnNapa.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        NetflixActionBar.b.C0051b actionBarStateBuilder;
        NetflixActivity bj_ = bj_();
        NetflixActionBar netflixActionBar = bj_ != null ? bj_.getNetflixActionBar() : null;
        if (netflixActionBar != null) {
            NetflixActivity bj_2 = bj_();
            if (bj_2 == null || (actionBarStateBuilder = bj_2.getActionBarStateBuilder()) == null) {
                return true;
            }
            netflixActionBar.c(actionBarStateBuilder.b(false).e((CharSequence) this.q).c());
            return true;
        }
        return false;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void bt_() {
        SearchUIViewOnNapa searchUIViewOnNapa = this.p;
        if (searchUIViewOnNapa != null) {
            searchUIViewOnNapa.a(false);
        }
        SearchUIViewOnNapa searchUIViewOnNapa2 = this.p;
        if (searchUIViewOnNapa2 != null) {
            searchUIViewOnNapa2.D();
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        SearchUIViewOnNapa searchUIViewOnNapa = this.p;
        if (searchUIViewOnNapa != null) {
            searchUIViewOnNapa.D();
        }
        SearchUIViewOnNapa searchUIViewOnNapa2 = this.p;
        if (searchUIViewOnNapa2 != null) {
            searchUIViewOnNapa2.B();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        SearchUIViewOnNapa searchUIViewOnNapa = this.p;
        if (searchUIViewOnNapa != null) {
            searchUIViewOnNapa.D();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        SearchUIViewOnNapa searchUIViewOnNapa = this.p;
        if (searchUIViewOnNapa != null) {
            searchUIViewOnNapa.n();
        }
    }
}
