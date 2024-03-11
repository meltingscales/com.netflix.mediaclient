package com.netflix.mediaclient.ui.search.napa;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.search.v2.SearchEpoxyController;
import com.netflix.mediaclient.util.AccessibilityUtils;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.AbstractC6078cTd;
import o.C1045Mp;
import o.C2755am;
import o.C6035cRo;
import o.C6089cTl;
import o.C8153dex;
import o.C8627dsp;
import o.C8632dsu;
import o.C9935zP;
import o.InterfaceC4255bb;
import o.InterfaceC8639dta;
import o.cRJ;
import o.dsA;
import o.dsS;
import o.dsW;
import o.dtC;

/* loaded from: classes4.dex */
public final class SearchResultsOnNapaUIView extends SearchUIViewOnNapa {
    private boolean d;
    private final ViewGroup g;
    private final InterfaceC8639dta j;
    static final /* synthetic */ dtC<Object>[] b = {dsA.b(new MutablePropertyReference1Impl(SearchResultsOnNapaUIView.class, "query", "getQuery()Ljava/lang/String;", 0))};
    public static final e a = new e(null);

    private final boolean A() {
        return !this.d;
    }

    public final void d(boolean z) {
        this.d = z;
    }

    public final ViewGroup f() {
        return this.g;
    }

    @Override // com.netflix.mediaclient.ui.search.napa.SearchUIViewOnNapa
    public int g() {
        return C6035cRo.e.r;
    }

    public /* synthetic */ SearchResultsOnNapaUIView(ViewGroup viewGroup, AppView appView, C9935zP c9935zP, cRJ crj, Fragment fragment, SearchEpoxyController.b bVar, int i, C8627dsp c8627dsp) {
        this(viewGroup, (i & 2) != 0 ? AppView.searchTitleResults : appView, c9935zP, crj, fragment, bVar);
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("SearchResultsUIView_Ab22078");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultsOnNapaUIView(ViewGroup viewGroup, AppView appView, C9935zP c9935zP, cRJ crj, Fragment fragment, SearchEpoxyController.b bVar) {
        super(viewGroup, appView, c9935zP, crj, fragment, bVar);
        C8632dsu.c((Object) viewGroup, "");
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) crj, "");
        C8632dsu.c((Object) fragment, "");
        C8632dsu.c((Object) bVar, "");
        View findViewById = r().findViewById(C6035cRo.d.k);
        C8632dsu.a(findViewById, "");
        this.g = (ViewGroup) findViewById;
        dsW dsw = dsW.a;
        this.j = new a("", this);
    }

    /* loaded from: classes4.dex */
    public static final class a extends dsS<String> {
        final /* synthetic */ SearchResultsOnNapaUIView d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, SearchResultsOnNapaUIView searchResultsOnNapaUIView) {
            super(obj);
            this.d = searchResultsOnNapaUIView;
        }

        @Override // o.dsS
        public void afterChange(dtC<?> dtc, String str, String str2) {
            C8632dsu.c((Object) dtc, "");
            String str3 = str2;
            if (C8632dsu.c((Object) str, (Object) str3) || C8632dsu.c((Object) str3, (Object) "")) {
                return;
            }
            this.d.m().resetLoadedSectionMap$netflix_modules_ui_search_impl_release();
            this.d.m().addModelBuildListener(new c());
        }
    }

    public final void c(String str) {
        C8632dsu.c((Object) str, "");
        this.j.setValue(this, b[0], str);
    }

    public final String h() {
        return (String) this.j.getValue(this, b[0]);
    }

    /* loaded from: classes4.dex */
    static final class c implements InterfaceC4255bb {
        c() {
        }

        @Override // o.InterfaceC4255bb
        public final void b(C2755am c2755am) {
            C8632dsu.c((Object) c2755am, "");
            if (C8632dsu.c((Object) SearchResultsOnNapaUIView.this.m().getQuery(), (Object) SearchResultsOnNapaUIView.this.h())) {
                return;
            }
            SearchResultsOnNapaUIView.this.q().scrollToPosition(0);
            SearchResultsOnNapaUIView.this.m().setQuery(SearchResultsOnNapaUIView.this.h());
        }
    }

    @Override // com.netflix.mediaclient.ui.search.napa.SearchUIViewOnNapa
    public void j() {
        super.j();
        m().setShowHeader(true);
        if (q() instanceof EpoxyRecyclerView) {
            RecyclerView q = q();
            C8632dsu.d(q);
            ((EpoxyRecyclerView) q).addOnScrollListener(new d());
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends RecyclerView.OnScrollListener {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C8632dsu.c((Object) recyclerView, "");
            if (SearchResultsOnNapaUIView.this.t() && i == 1) {
                SearchResultsOnNapaUIView.a.getLogTag();
                SearchResultsOnNapaUIView.this.b((SearchResultsOnNapaUIView) AbstractC6078cTd.o.e);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C8632dsu.c((Object) recyclerView, "");
            if (C8153dex.l()) {
                SearchResultsOnNapaUIView.this.b((SearchResultsOnNapaUIView) new AbstractC6078cTd.s(i2));
            }
        }
    }

    @Override // com.netflix.mediaclient.ui.search.napa.SearchUIViewOnNapa
    public void a(C6089cTl c6089cTl) {
        m().setSearchCLHelper(x());
        if (h().length() == 0) {
            o();
            return;
        }
        if (c6089cTl != null && (!c6089cTl.h().isEmpty())) {
            Context context = e().getContext();
            C8632dsu.a(context, "");
            AccessibilityUtils.b(context, e().getContext().getResources().getString(R.o.f13252J));
            e(false);
        }
        super.a(c6089cTl);
    }

    @Override // com.netflix.mediaclient.ui.search.napa.SearchUIViewOnNapa
    public void i() {
        super.i();
        Context context = e().getContext();
        C8632dsu.a(context, "");
        AccessibilityUtils.b(context, e().getContext().getResources().getString(R.o.F));
        e(false);
        w().setVisibility(0);
    }

    @Override // com.netflix.mediaclient.ui.search.napa.SearchUIViewOnNapa
    public void o() {
        super.o();
        w().setVisibility(A() ^ true ? 0 : 8);
        e(A());
        p().b(false);
        b((SearchResultsOnNapaUIView) AbstractC6078cTd.u.c);
        b((SearchResultsOnNapaUIView) AbstractC6078cTd.e.d);
    }

    @Override // com.netflix.mediaclient.ui.search.napa.SearchUIViewOnNapa
    public void k() {
        super.k();
        w().setVisibility(8);
        e(false);
    }

    public final void e(long j) {
        m().setRequstId(Long.valueOf(j));
    }

    private final void e(boolean z) {
        this.g.setVisibility(z ? 0 : 8);
    }
}
