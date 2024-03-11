package o;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.ui.search.SearchUtils;
import com.netflix.mediaclient.ui.search.napa.SearchResultsOnNapaPresenter$observeLiveState$1;
import com.netflix.mediaclient.ui.search.napa.SearchResultsOnNapaUIView;
import com.netflix.model.leafs.SearchSectionSummary;
import dagger.Lazy;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import o.AbstractC6078cTd;
import o.AbstractC6094cTq;
import o.C1867aRe;
import o.C6089cTl;
import o.C8553dpw;
import o.C8632dsu;
import o.InterfaceC6086cTi;
import o.cRC;
import o.cRP;
import o.dpR;

/* loaded from: classes4.dex */
public final class cRP extends AbstractC9940zU<AbstractC6078cTd, AbstractC6078cTd> {
    public static final b b = new b(null);
    private int a;
    private boolean c;
    private final aDB d;
    private final Observable<dpR> e;
    private long f;
    private C6089cTl g;
    private String h;
    private final Lazy<bZI> i;
    private String j;
    private final InterfaceC6086cTi l;
    private final SearchResultsOnNapaUIView m;
    private final LifecycleCoroutineScope n;

    /* renamed from: o  reason: collision with root package name */
    private final InterfaceC8812dzl<C6089cTl> f13695o;

    public final void c(long j) {
        this.f = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cRP(Observable<AbstractC6078cTd> observable, SearchResultsOnNapaUIView searchResultsOnNapaUIView, InterfaceC6086cTi interfaceC6086cTi, Observable<dpR> observable2, Lazy<bZI> lazy, LifecycleCoroutineScope lifecycleCoroutineScope, aDB adb) {
        super(observable, searchResultsOnNapaUIView);
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) searchResultsOnNapaUIView, "");
        C8632dsu.c((Object) interfaceC6086cTi, "");
        C8632dsu.c((Object) observable2, "");
        C8632dsu.c((Object) lazy, "");
        C8632dsu.c((Object) lifecycleCoroutineScope, "");
        C8632dsu.c((Object) adb, "");
        this.m = searchResultsOnNapaUIView;
        this.l = interfaceC6086cTi;
        this.e = observable2;
        this.i = lazy;
        this.n = lifecycleCoroutineScope;
        this.d = adb;
        this.f13695o = dzB.d(new C6089cTl(null, false, null, null, null, null, null, null, null, null, 0L, 1023, null));
        this.j = "";
        this.h = "";
        searchResultsOnNapaUIView.z();
        e();
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("SearchResultsPresenter_Ab22078");
        }
    }

    private final void e() {
        this.n.launchWhenResumed(new SearchResultsOnNapaPresenter$observeLiveState$1(this, null));
    }

    @SuppressLint({"CheckResult"})
    public final void e(String str, C6087cTj c6087cTj) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c6087cTj, "");
        InterfaceC6086cTi interfaceC6086cTi = this.l;
        Context context = this.m.r().getContext();
        C8632dsu.a(context, "");
        b(InterfaceC6086cTi.b.d(interfaceC6086cTi, str, context, c6087cTj, false, 8, null), c6087cTj);
    }

    @SuppressLint({"CheckResult"})
    private final void b(Observable<AbstractC6078cTd> observable, final C6087cTj c6087cTj) {
        Observable<AbstractC6078cTd> takeUntil = observable.observeOn(AndroidSchedulers.mainThread()).takeUntil(this.e);
        C8632dsu.a(takeUntil, "");
        SubscribersKt.subscribeBy$default(takeUntil, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.search.napa.SearchResultsOnNapaPresenter$processSearchEvent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                e(th);
                return dpR.c;
            }

            public final void e(Throwable th) {
                String b2;
                SearchResultsOnNapaUIView searchResultsOnNapaUIView;
                C8632dsu.c((Object) th, "");
                cRP crp = cRP.this;
                Long valueOf = Long.valueOf(c6087cTj.c().b());
                b2 = C8553dpw.b(th);
                crp.e("Search_rxError", valueOf, b2);
                searchResultsOnNapaUIView = cRP.this.m;
                searchResultsOnNapaUIView.b((SearchResultsOnNapaUIView) new AbstractC6078cTd.C6081c(null));
                cRP.this.d(c6087cTj.c());
            }
        }, (drO) null, new drM<AbstractC6078cTd, dpR>() { // from class: com.netflix.mediaclient.ui.search.napa.SearchResultsOnNapaPresenter$processSearchEvent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC6078cTd abstractC6078cTd) {
                b(abstractC6078cTd);
                return dpR.c;
            }

            public final void b(AbstractC6078cTd abstractC6078cTd) {
                SearchResultsOnNapaUIView searchResultsOnNapaUIView;
                SearchResultsOnNapaUIView searchResultsOnNapaUIView2;
                SearchResultsOnNapaUIView searchResultsOnNapaUIView3;
                C6089cTl c6089cTl;
                SearchResultsOnNapaUIView searchResultsOnNapaUIView4;
                C6089cTl a;
                SearchResultsOnNapaUIView searchResultsOnNapaUIView5;
                SearchResultsOnNapaUIView searchResultsOnNapaUIView6;
                SearchResultsOnNapaUIView searchResultsOnNapaUIView7;
                SearchResultsOnNapaUIView searchResultsOnNapaUIView8;
                if (abstractC6078cTd instanceof AbstractC6078cTd.C) {
                    cRP crp = cRP.this;
                    C8632dsu.d(abstractC6078cTd);
                    crp.e((AbstractC6078cTd.C) abstractC6078cTd, c6087cTj.c(), c6087cTj.a(), c6087cTj.b());
                    searchResultsOnNapaUIView8 = cRP.this.m;
                    searchResultsOnNapaUIView8.b((SearchResultsOnNapaUIView) new AbstractC6078cTd.C6081c(null));
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.B) {
                    C8632dsu.d(abstractC6078cTd);
                    AbstractC6078cTd.B b2 = (AbstractC6078cTd.B) abstractC6078cTd;
                    searchResultsOnNapaUIView3 = cRP.this.m;
                    searchResultsOnNapaUIView3.b((SearchResultsOnNapaUIView) b2);
                    int sectionIndex = b2.c().getSectionIndex();
                    c6089cTl = cRP.this.g;
                    if (c6089cTl != null) {
                        cRP crp2 = cRP.this;
                        cRC.c.e(b2.c(), c6089cTl, String.valueOf(sectionIndex));
                        searchResultsOnNapaUIView4 = crp2.m;
                        a = c6089cTl.a((r27 & 1) != 0 ? c6089cTl.i : null, (r27 & 2) != 0 ? c6089cTl.b : false, (r27 & 4) != 0 ? c6089cTl.m : null, (r27 & 8) != 0 ? c6089cTl.f : null, (r27 & 16) != 0 ? c6089cTl.g : null, (r27 & 32) != 0 ? c6089cTl.h : null, (r27 & 64) != 0 ? c6089cTl.c : null, (r27 & 128) != 0 ? c6089cTl.e : null, (r27 & JSONzip.end) != 0 ? c6089cTl.j : AbstractC6094cTq.d.a, (r27 & 512) != 0 ? c6089cTl.a : null, (r27 & 1024) != 0 ? c6089cTl.d : 0L);
                        searchResultsOnNapaUIView4.a(a);
                        searchResultsOnNapaUIView5 = crp2.m;
                        searchResultsOnNapaUIView5.b((SearchResultsOnNapaUIView) AbstractC6078cTd.u.c);
                        searchResultsOnNapaUIView6 = crp2.m;
                        searchResultsOnNapaUIView6.u();
                        searchResultsOnNapaUIView7 = crp2.m;
                        searchResultsOnNapaUIView7.b((SearchResultsOnNapaUIView) new AbstractC6078cTd.C6081c(null));
                    }
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.C6079a) {
                    cRP.this.e("Search_Error", Long.valueOf(c6087cTj.c().b()), null);
                    searchResultsOnNapaUIView2 = cRP.this.m;
                    searchResultsOnNapaUIView2.b((SearchResultsOnNapaUIView) new AbstractC6078cTd.C6081c(null));
                    cRP.this.d(c6087cTj.c());
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.h) {
                    AbstractC6078cTd.h hVar = (AbstractC6078cTd.h) abstractC6078cTd;
                    cRP.this.e("Search_ErrorWithReason", Long.valueOf(c6087cTj.c().b()), hVar.e().toString());
                    searchResultsOnNapaUIView = cRP.this.m;
                    searchResultsOnNapaUIView.b((SearchResultsOnNapaUIView) new AbstractC6078cTd.C6081c(hVar.e()));
                    cRP.this.d(c6087cTj.c());
                }
            }
        }, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(String str, Long l, String str2) {
        String str3;
        if (aQH.b.d()) {
            str3 = "Search_graphql_migration_3_" + str;
        } else if (C8153dex.Y()) {
            str3 = "Search_graphql_migration_Option_5_" + str;
        } else {
            C1867aRe.a aVar = C1867aRe.a;
            if (aVar.c().d()) {
                str3 = "Search_graphql_migration_Option_3_" + str;
            } else if (aQE.d.b()) {
                str3 = "Irma_search_" + str;
            } else if (C1872aRj.c.c()) {
                str3 = "Search_Page_Platform_" + str;
            } else if (C1873aRk.a.b()) {
                str3 = "Irma_FullSearch_" + str;
            } else if (C8632dsu.c(aVar.c(), C1867aRe.c.b.b)) {
                str3 = "Search_graphql_Control_migration_" + str;
            } else {
                str3 = null;
            }
        }
        if (str3 != null) {
            SearchUtils.a(str3, "Received an error " + l + " " + str2);
        }
    }

    @SuppressLint({"CheckResult"})
    public final void c(String str, C6087cTj c6087cTj) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c6087cTj, "");
        InterfaceC6086cTi interfaceC6086cTi = this.l;
        Context context = this.m.r().getContext();
        C8632dsu.a(context, "");
        b(interfaceC6086cTi.d(str, context, c6087cTj), c6087cTj);
    }

    public final void a(C6087cTj c6087cTj) {
        C8632dsu.c((Object) c6087cTj, "");
        InterfaceC6086cTi interfaceC6086cTi = this.l;
        Context context = this.m.r().getContext();
        C8632dsu.a(context, "");
        b(interfaceC6086cTi.d(context, c6087cTj), c6087cTj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(C6089cTl c6089cTl) {
        C6089cTl a;
        NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ad;
        C8632dsu.a(netflixImmutableStatus, "");
        a = c6089cTl.a((r27 & 1) != 0 ? c6089cTl.i : null, (r27 & 2) != 0 ? c6089cTl.b : false, (r27 & 4) != 0 ? c6089cTl.m : null, (r27 & 8) != 0 ? c6089cTl.f : null, (r27 & 16) != 0 ? c6089cTl.g : null, (r27 & 32) != 0 ? c6089cTl.h : null, (r27 & 64) != 0 ? c6089cTl.c : null, (r27 & 128) != 0 ? c6089cTl.e : null, (r27 & JSONzip.end) != 0 ? c6089cTl.j : new AbstractC6094cTq.c(netflixImmutableStatus), (r27 & 512) != 0 ? c6089cTl.a : null, (r27 & 1024) != 0 ? c6089cTl.d : 0L);
        if (a.h().size() == 0) {
            this.m.k();
            this.m.b((SearchResultsOnNapaUIView) AbstractC6078cTd.u.c);
            return;
        }
        String requestId = a.h().get(0).getRequestId();
        SearchUtils.a("NAPASearchMigration", "Error in sequent section request " + requestId);
        this.m.a(a);
    }

    private final void e(C6089cTl c6089cTl) {
        C6089cTl a;
        NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ad;
        C8632dsu.a(netflixImmutableStatus, "");
        a = c6089cTl.a((r27 & 1) != 0 ? c6089cTl.i : null, (r27 & 2) != 0 ? c6089cTl.b : false, (r27 & 4) != 0 ? c6089cTl.m : null, (r27 & 8) != 0 ? c6089cTl.f : null, (r27 & 16) != 0 ? c6089cTl.g : null, (r27 & 32) != 0 ? c6089cTl.h : null, (r27 & 64) != 0 ? c6089cTl.c : null, (r27 & 128) != 0 ? c6089cTl.e : null, (r27 & JSONzip.end) != 0 ? c6089cTl.j : new AbstractC6094cTq.c(netflixImmutableStatus), (r27 & 512) != 0 ? c6089cTl.a : null, (r27 & 1024) != 0 ? c6089cTl.d : 0L);
        if (a.h().size() == 0) {
            this.m.i();
            this.m.b((SearchResultsOnNapaUIView) AbstractC6078cTd.u.c);
            this.m.b((SearchResultsOnNapaUIView) new AbstractC6078cTd.C6081c(null));
            return;
        }
        String requestId = a.h().get(0).getRequestId();
        SearchUtils.a("NAPASearchMigration", "Empty response in sequent section request " + requestId);
        this.m.a(a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(AbstractC6078cTd.C c, C6089cTl c6089cTl, int i, int i2) {
        C6089cTl a;
        C6089cTl a2;
        List<InterfaceC5272bvd> searchSections = c.d().getSearchSections();
        if (c.d().getRequestId() != this.f) {
            this.m.u();
            this.m.c();
            return;
        }
        this.m.b((SearchResultsOnNapaUIView) c);
        if (aQH.b.c() || C1867aRe.a.a() || C8153dex.Y() || C1873aRk.a.b()) {
            this.h = c.d().getGraphqlPageId();
        }
        cRC.b bVar = cRC.c;
        List<SearchSectionSummary> c2 = bVar.c(searchSections);
        if (c2 == null) {
            this.m.b((SearchResultsOnNapaUIView) AbstractC6078cTd.g.e);
        } else if (c2.isEmpty() && c6089cTl.h().isEmpty()) {
            e(c6089cTl);
        } else {
            bVar.b(searchSections, c2, c6089cTl);
            if (c2.get(0).getTotalSections() == c2.size() + i) {
                this.c = true;
            }
            a = c6089cTl.a((r27 & 1) != 0 ? c6089cTl.i : null, (r27 & 2) != 0 ? c6089cTl.b : false, (r27 & 4) != 0 ? c6089cTl.m : null, (r27 & 8) != 0 ? c6089cTl.f : null, (r27 & 16) != 0 ? c6089cTl.g : null, (r27 & 32) != 0 ? c6089cTl.h : null, (r27 & 64) != 0 ? c6089cTl.c : null, (r27 & 128) != 0 ? c6089cTl.e : null, (r27 & JSONzip.end) != 0 ? c6089cTl.j : null, (r27 & 512) != 0 ? c6089cTl.a : null, (r27 & 1024) != 0 ? c6089cTl.d : 0L);
            this.g = a;
            if (i != i2) {
                this.a = i + 6;
            }
            a2 = c6089cTl.a((r27 & 1) != 0 ? c6089cTl.i : null, (r27 & 2) != 0 ? c6089cTl.b : false, (r27 & 4) != 0 ? c6089cTl.m : null, (r27 & 8) != 0 ? c6089cTl.f : null, (r27 & 16) != 0 ? c6089cTl.g : null, (r27 & 32) != 0 ? c6089cTl.h : null, (r27 & 64) != 0 ? c6089cTl.c : null, (r27 & 128) != 0 ? c6089cTl.e : null, (r27 & JSONzip.end) != 0 ? c6089cTl.j : AbstractC6094cTq.d.a, (r27 & 512) != 0 ? c6089cTl.a : null, (r27 & 1024) != 0 ? c6089cTl.d : 0L);
            this.f13695o.d(a2);
            this.m.a(a2);
            this.m.b((SearchResultsOnNapaUIView) AbstractC6078cTd.u.c);
            this.m.u();
        }
    }

    @Override // o.AbstractC9940zU
    public void onEvent(AbstractC6078cTd abstractC6078cTd) {
        C6089cTl c6089cTl;
        C6089cTl c6089cTl2;
        C8632dsu.c((Object) abstractC6078cTd, "");
        if (abstractC6078cTd instanceof AbstractC6078cTd.f) {
            AbstractC6078cTd.f fVar = (AbstractC6078cTd.f) abstractC6078cTd;
            this.j = fVar.e();
            e(fVar.e(), new C6087cTj(fVar.b(), 0, 5, 0, d(this, 0, false, 2, null), new C6089cTl(new ArrayList(), false, new LinkedHashMap(), new LinkedHashMap(), null, new LinkedHashMap(), null, fVar.e(), AbstractC6094cTq.a.e, null, fVar.b(), 528, null)));
            this.c = false;
        } else if (abstractC6078cTd instanceof AbstractC6078cTd.r) {
            if (this.c || (c6089cTl2 = this.g) == null) {
                return;
            }
            if (aQH.b.c() || C1867aRe.a.a() || C8153dex.Y() || C1873aRk.a.b()) {
                String str = this.h;
                long j = this.f;
                int i = this.a;
                c(str, new C6087cTj(j, i, i + 5, 0, d(this, 0, false, 2, null), c6089cTl2));
                return;
            }
            String str2 = this.j;
            long j2 = this.f;
            int i2 = this.a;
            e(str2, new C6087cTj(j2, i2, i2 + 5, 0, d(this, 0, false, 2, null), c6089cTl2));
        } else if (abstractC6078cTd instanceof AbstractC6078cTd.t) {
            C6089cTl c6089cTl3 = this.g;
            if (c6089cTl3 != null) {
                AbstractC6078cTd.t tVar = (AbstractC6078cTd.t) abstractC6078cTd;
                List<InterfaceC5278bvj> list = c6089cTl3.i().get(c6089cTl3.h().get(tVar.a()).getSectionId());
                if (list != null) {
                    int size = list.size();
                    if (aQH.b.c() || C1867aRe.a.c().d()) {
                        c(this.h, new C6087cTj(this.f, tVar.a(), tVar.a(), size, d(this, size, false, 2, null), c6089cTl3));
                    } else if (C8153dex.Y() || C1873aRk.a.b()) {
                        a(new C6087cTj(this.f, tVar.a(), tVar.a(), size, d(this, size, false, 2, null), c6089cTl3));
                    } else {
                        e(this.j, new C6087cTj(this.f, tVar.a(), tVar.a(), size, d(this, size, false, 2, null), c6089cTl3));
                    }
                }
            }
        } else if (abstractC6078cTd instanceof AbstractC6078cTd.m) {
            C6089cTl c6089cTl4 = this.g;
            if (c6089cTl4 != null) {
                AbstractC6078cTd.m mVar = (AbstractC6078cTd.m) abstractC6078cTd;
                List<InterfaceC5185btw> list2 = c6089cTl4.j().get(c6089cTl4.h().get(mVar.b()).getSectionId());
                if (list2 != null) {
                    int size2 = list2.size();
                    if (aQH.b.c() || C1867aRe.a.c().d()) {
                        c(this.h, new C6087cTj(this.f, mVar.b(), mVar.b(), size2, d(this, size2, false, 2, null), c6089cTl4));
                    } else if (C8153dex.Y() || C1873aRk.a.b()) {
                        a(new C6087cTj(this.f, mVar.b(), mVar.b(), size2, d(this, size2, false, 2, null), c6089cTl4));
                    } else {
                        e(this.j, new C6087cTj(this.f, mVar.b(), mVar.b(), size2, d(this, size2, false, 2, null), c6089cTl4));
                    }
                }
            }
        } else if (abstractC6078cTd instanceof AbstractC6078cTd.y) {
            this.m.o();
        } else if (abstractC6078cTd instanceof AbstractC6078cTd.x) {
            e(this.j, new C6087cTj(this.f, 0, 5, 0, d(this, 0, false, 2, null), new C6089cTl(new ArrayList(), false, new LinkedHashMap(), new LinkedHashMap(), null, new LinkedHashMap(), null, this.j, AbstractC6094cTq.a.e, null, this.f, 528, null)));
            this.c = false;
        } else if (!(abstractC6078cTd instanceof AbstractC6078cTd.i) || (c6089cTl = this.g) == null) {
        } else {
            AbstractC6078cTd.i iVar = (AbstractC6078cTd.i) abstractC6078cTd;
            List<InterfaceC5278bvj> list3 = c6089cTl.i().get(c6089cTl.h().get(iVar.c()).getSectionId());
            int size3 = list3 != null ? list3.size() : 0;
            if (size3 < 50) {
                if (aQH.b.c() || C1867aRe.a.a() || C8153dex.Y() || C1873aRk.a.b()) {
                    c(this.h, new C6087cTj(this.f, iVar.c(), iVar.c(), size3, a(size3, false), c6089cTl));
                } else {
                    e(this.j, new C6087cTj(this.f, iVar.c(), iVar.c(), size3, a(size3, false), c6089cTl));
                }
            }
        }
    }

    static /* synthetic */ int d(cRP crp, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return crp.a(i, z);
    }

    private final int a(int i, boolean z) {
        C1332Xp c1332Xp = C1332Xp.b;
        return Math.min((i + C4000bSn.b((Context) C1332Xp.b(Context.class), LoMoType.STANDARD)) - 1, C6062cSo.c.a(z));
    }
}
