package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.ui.search.SearchUtils;
import com.netflix.mediaclient.ui.search.v2.SearchEpoxyController;
import com.netflix.model.leafs.SearchSectionSummary;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.AbstractC6078cTd;
import o.C1180Rt;
import o.C6035cRo;
import o.C8632dsu;

/* renamed from: o.cSp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6063cSp extends AbstractC9944zY<AbstractC6078cTd> implements cRE {
    private final SearchEpoxyController.b b;
    private final int d;
    public SearchEpoxyController e;
    private final RG f;
    private final List<Long> g;
    private final C9935zP h;
    private final HashMap<String, Long> i;
    private boolean j;
    private final View k;
    private RecyclerView l;
    private final View m;
    private C6089cTl n;

    /* renamed from: o  reason: collision with root package name */
    private final List<TrackingInfoHolder> f13699o;
    private final InterfaceC8639dta s;
    static final /* synthetic */ dtC<Object>[] c = {dsA.b(new MutablePropertyReference1Impl(C6063cSp.class, "visibility", "getVisibility()Z", 0))};
    public static final e a = new e(null);

    private final int l() {
        return C6035cRo.e.f;
    }

    private final int r() {
        return C6035cRo.d.j;
    }

    public final void a(SearchEpoxyController searchEpoxyController) {
        C8632dsu.c((Object) searchEpoxyController, "");
        this.e = searchEpoxyController;
    }

    @Override // o.AbstractC9944zY
    public View e() {
        return this.k;
    }

    public final View h() {
        return this.m;
    }

    @Override // o.cRE
    public /* synthetic */ void a(AbstractC6078cTd abstractC6078cTd) {
        b((C6063cSp) abstractC6078cTd);
    }

    /* renamed from: o.cSp$a */
    /* loaded from: classes4.dex */
    public static final class a extends dsS<Boolean> {
        final /* synthetic */ C6063cSp a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, C6063cSp c6063cSp) {
            super(obj);
            this.a = c6063cSp;
        }

        @Override // o.dsS
        public void afterChange(dtC<?> dtc, Boolean bool, Boolean bool2) {
            C8632dsu.c((Object) dtc, "");
            boolean booleanValue = bool2.booleanValue();
            if (bool.booleanValue() != booleanValue) {
                this.a.a(booleanValue);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6063cSp(ViewGroup viewGroup, AppView appView, C9935zP c9935zP, SearchEpoxyController.b bVar) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) bVar, "");
        this.h = c9935zP;
        this.b = bVar;
        this.f13699o = new ArrayList();
        this.g = new ArrayList();
        this.i = new HashMap<>();
        this.j = true;
        View a2 = a(viewGroup);
        this.m = a2;
        View findViewById = a2.findViewById(r());
        C8632dsu.a(findViewById, "");
        this.k = findViewById;
        this.d = e().getId();
        View findViewById2 = a2.findViewById(r());
        C8632dsu.a(findViewById2, "");
        this.l = (RecyclerView) findViewById2;
        this.f = new RG(a2, new C1180Rt.d() { // from class: o.cSn
            @Override // o.C1180Rt.d
            public final void e() {
                C6063cSp.e(C6063cSp.this);
            }
        });
        dsW dsw = dsW.a;
        this.s = new a(Boolean.TRUE, this);
        p();
        InterfaceC1659aJm.b.e().c(this.l, appView, "search_prequery_scroll");
    }

    public final SearchEpoxyController g() {
        SearchEpoxyController searchEpoxyController = this.e;
        if (searchEpoxyController != null) {
            return searchEpoxyController;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C6063cSp c6063cSp) {
        C8632dsu.c((Object) c6063cSp, "");
        c6063cSp.b((C6063cSp) AbstractC6078cTd.v.e);
    }

    public final void d(boolean z) {
        this.s.setValue(this, c[0], Boolean.valueOf(z));
    }

    public final boolean j() {
        return ((Boolean) this.s.getValue(this, c[0])).booleanValue();
    }

    /* renamed from: o.cSp$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("PreQuerySearchUIViewV3");
        }
    }

    private final View a(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l(), viewGroup, false);
        C8632dsu.a(inflate, "");
        return inflate;
    }

    public final void d(C6089cTl c6089cTl) {
        if (c6089cTl == null || c6089cTl.h().isEmpty()) {
            if (C8153dex.i()) {
                SearchUtils.a("Adaptive_pre_query_empty_results", "Show empty pre query ui");
            }
            c();
            return;
        }
        this.n = c6089cTl;
        k();
        RecyclerView recyclerView = this.l;
        recyclerView.setPadding(0, 0, 0, recyclerView.getPaddingBottom());
        if (c6089cTl.g().size() == c6089cTl.h().size()) {
            c(c6089cTl);
            n();
            if (j() && this.g.isEmpty()) {
                t();
            }
        }
    }

    private final void k() {
        List<SearchSectionSummary> h;
        this.f13699o.clear();
        TrackingInfoHolder trackingInfoHolder = new TrackingInfoHolder(PlayLocationType.SEARCH);
        C6089cTl c6089cTl = this.n;
        if (c6089cTl == null || (h = c6089cTl.h()) == null) {
            return;
        }
        int i = 0;
        for (Object obj : h) {
            if (i < 0) {
                C8569dql.h();
            }
            SearchSectionSummary searchSectionSummary = (SearchSectionSummary) obj;
            if (!C8632dsu.c((Object) searchSectionSummary.getListType(), (Object) "SearchHints")) {
                this.f13699o.add(trackingInfoHolder.e(searchSectionSummary, i));
            }
            i++;
        }
    }

    private final void p() {
        SearchEpoxyController.b bVar = this.b;
        C9935zP c9935zP = this.h;
        Context context = this.l.getContext();
        C8632dsu.a(context, "");
        a(new SearchEpoxyController(bVar, this, c9935zP, context));
        RecyclerView recyclerView = this.l;
        if (recyclerView instanceof EpoxyRecyclerView) {
            C8632dsu.d(recyclerView);
            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) recyclerView;
            epoxyRecyclerView.setController(g());
            final Context context2 = epoxyRecyclerView.getContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(context2) { // from class: com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchUIViewV3$setupForRecyclerView$1$1
                @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
                    C8632dsu.c((Object) recycler, "");
                    C8632dsu.c((Object) state, "");
                    return 1;
                }
            };
            gridLayoutManager.setSpanSizeLookup(g().getSpanSizeLookup());
            epoxyRecyclerView.setLayoutManager(gridLayoutManager);
            int itemDecorationCount = epoxyRecyclerView.getItemDecorationCount();
            for (int i = 0; i < itemDecorationCount; i++) {
                epoxyRecyclerView.removeItemDecoration(epoxyRecyclerView.getItemDecorationAt(i));
            }
            epoxyRecyclerView.addOnScrollListener(new d());
            C1619aI c1619aI = new C1619aI();
            c1619aI.b((Integer) 50);
            c1619aI.d(this.l);
        }
    }

    /* renamed from: o.cSp$d */
    /* loaded from: classes4.dex */
    public static final class d extends RecyclerView.OnScrollListener {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C8632dsu.c((Object) recyclerView, "");
            if (C6063cSp.this.j && i == 1) {
                C6063cSp.a.getLogTag();
                C6063cSp.this.b((C6063cSp) AbstractC6078cTd.o.e);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C8632dsu.c((Object) recyclerView, "");
            if (C8153dex.l()) {
                C6063cSp.this.b((C6063cSp) new AbstractC6078cTd.s(i2));
            }
        }
    }

    private final void c(C6089cTl c6089cTl) {
        g().setData(c6089cTl);
    }

    private final void t() {
        if (!this.g.isEmpty()) {
            m();
        }
        C6089cTl c6089cTl = this.n;
        if (c6089cTl != null) {
            if ((c6089cTl != null ? c6089cTl.h() : null) != null) {
                C6089cTl c6089cTl2 = this.n;
                if ((c6089cTl2 != null ? c6089cTl2.h() : null) != null) {
                    int i = 0;
                    if (this.f13699o.size() == 1) {
                        List<Long> list = this.g;
                        Long a2 = C6043cRw.a(AppView.searchResults, this.f13699o.get(0));
                        C8632dsu.a(a2, "");
                        list.add(a2);
                        return;
                    }
                    for (Object obj : this.f13699o) {
                        if (i < 0) {
                            C8569dql.h();
                        }
                        List<Long> list2 = this.g;
                        Long a3 = C6043cRw.a(AppView.searchResults, (TrackingInfoHolder) obj);
                        C8632dsu.a(a3, "");
                        list2.add(a3);
                        i++;
                    }
                }
            }
        }
    }

    private final void n() {
        C6089cTl c6089cTl = this.n;
        if (c6089cTl != null) {
            if ((c6089cTl != null ? c6089cTl.h() : null) != null) {
                C6089cTl c6089cTl2 = this.n;
                List<SearchSectionSummary> h = c6089cTl2 != null ? c6089cTl2.h() : null;
                if (h == null || !(!h.isEmpty())) {
                    return;
                }
                int i = 0;
                if (this.f13699o.size() == 1) {
                    String referenceId = h.get(0).getReferenceId();
                    String feature = h.get(0).getFeature();
                    C6043cRw.a(referenceId, feature != null ? feature : "");
                    return;
                }
                for (Object obj : this.f13699o) {
                    if (i < 0) {
                        C8569dql.h();
                    }
                    TrackingInfoHolder trackingInfoHolder = (TrackingInfoHolder) obj;
                    SearchSectionSummary searchSectionSummary = h.get(i);
                    if (!this.i.containsKey(searchSectionSummary.getReferenceId())) {
                        String referenceId2 = searchSectionSummary.getReferenceId();
                        String feature2 = searchSectionSummary.getFeature();
                        if (feature2 == null) {
                            feature2 = "";
                        }
                        long c2 = C6043cRw.c(referenceId2, feature2);
                        HashMap<String, Long> hashMap = this.i;
                        String referenceId3 = searchSectionSummary.getReferenceId();
                        C8632dsu.a(referenceId3, "");
                        hashMap.put(referenceId3, Long.valueOf(c2));
                    }
                    i++;
                }
            }
        }
    }

    public final void i() {
        if (!this.i.isEmpty()) {
            for (Map.Entry<String, Long> entry : this.i.entrySet()) {
                Logger.INSTANCE.removeContext(entry.getValue());
            }
            this.i.clear();
        }
        if (this.f13699o.size() == 1) {
            C6043cRw.a();
        }
    }

    public final void o() {
        this.f.a(true);
    }

    public final void f() {
        this.f.b(true);
    }

    public final void a(boolean z) {
        if (z) {
            t();
        } else {
            m();
        }
    }

    private final void m() {
        for (Number number : this.g) {
            Logger.INSTANCE.endSession(Long.valueOf(number.longValue()));
        }
        this.g.clear();
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        a.getLogTag();
        b((C6063cSp) AbstractC6078cTd.k.a);
    }

    public final void e(boolean z) {
        a.getLogTag();
        this.j = z;
    }
}
