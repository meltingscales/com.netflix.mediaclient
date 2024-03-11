package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.player.v2.presenter.PlayerContentAdvisoryUIPresenter$showAdvisories$1;
import com.netflix.mediaclient.ui.player.v2.presenter.PlayerContentAdvisoryUIPresenter$showAdvisories$2;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.advisory.ProductPlacementAdvisory;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.ObservablesKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import o.AbstractC5595cBf;
import o.C1044Mm;
import o.C1596aHd;
import o.C5714cFq;
import o.C7535cxz;
import o.C8632dsu;
import o.InterfaceC0718Aa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5706cFi;
import o.cAY;
import o.cBA;
import o.cDL;
import o.cES;
import o.dpR;
import o.dqE;

/* loaded from: classes4.dex */
public class cDL extends cDE implements InterfaceC5706cFi, cES {
    public static final a d = new a(null);
    private final CompositeDisposable a;
    private LinkedHashMap<Advisory, Boolean> b;
    private boolean c;
    private final InterfaceC0718Aa<LinkedHashMap<Advisory, Boolean>> e;
    private boolean f;
    private boolean g;
    private boolean h;
    private final Observable<cBA> i;
    private final cFJ j;

    /* renamed from: o  reason: collision with root package name */
    private String f13654o;

    public final LinkedHashMap<Advisory, Boolean> a() {
        return this.b;
    }

    public final String c() {
        return this.f13654o;
    }

    @Override // o.cES
    public void c(boolean z) {
        this.h = z;
    }

    @Override // o.InterfaceC5706cFi
    public void d(boolean z) {
        this.f = z;
    }

    public final void e(String str) {
        C8632dsu.c((Object) str, "");
        this.f13654o = str;
    }

    public final void e(LinkedHashMap<Advisory, Boolean> linkedHashMap) {
        C8632dsu.c((Object) linkedHashMap, "");
        this.b = linkedHashMap;
    }

    public boolean i() {
        return this.h;
    }

    public boolean j() {
        return this.f;
    }

    @Override // o.InterfaceC5706cFi
    public void a(Observable<cBA> observable) {
        InterfaceC5706cFi.a.b(this, observable);
    }

    @Override // o.cES
    public void c(Observable<cBA> observable) {
        cES.e.e(this, observable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cDL(cFJ cfj, Observable<cBA> observable, InterfaceC0718Aa<LinkedHashMap<Advisory, Boolean>> interfaceC0718Aa) {
        super(observable, new InterfaceC5730cGf[]{cfj}, null, 4, null);
        C8632dsu.c((Object) cfj, "");
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interfaceC0718Aa, "");
        this.j = cfj;
        this.i = observable;
        this.e = interfaceC0718Aa;
        this.c = true;
        this.b = new LinkedHashMap<>();
        this.a = new CompositeDisposable();
        this.f13654o = "INVALID_FROM_AdvisoryUIPresenter";
        final drM<cBA, Boolean> drm = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerContentAdvisoryUIPresenter$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final Boolean invoke(cBA cba) {
                boolean z;
                C7535cxz b;
                C8632dsu.c((Object) cba, "");
                if (cba instanceof cBA.ai) {
                    cBA.ai aiVar = (cBA.ai) cba;
                    C7535cxz b2 = aiVar.b();
                    if (!C8632dsu.c((Object) (b2 != null ? b2.m() : null), (Object) cDL.this.c()) && (b = aiVar.b()) != null && !b.k()) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        };
        Observable<cBA> filter = observable.filter(new Predicate() { // from class: o.cDP
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean l;
                l = cDL.l(drM.this, obj);
                return l;
            }
        });
        C8632dsu.a(filter, "");
        SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerContentAdvisoryUIPresenter$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBA cba) {
                d(cba);
                return dpR.c;
            }

            public final void d(cBA cba) {
                String m;
                InterfaceC0718Aa interfaceC0718Aa2;
                if (cba instanceof cBA.ai) {
                    cDL.this.c = true;
                    C7535cxz b = ((cBA.ai) cba).b();
                    if (b == null || (m = b.m()) == null) {
                        return;
                    }
                    cDL cdl = cDL.this;
                    C1044Mm.e("AdvisoryUIPresenter", "Fetching advisories...");
                    cdl.e(m);
                    cdl.d();
                    interfaceC0718Aa2 = cdl.e;
                    C8632dsu.d(interfaceC0718Aa2);
                    ((C5714cFq) interfaceC0718Aa2).d(m);
                }
            }
        }, 3, (Object) null);
        final drM<cBA, Boolean> drm2 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerContentAdvisoryUIPresenter$3
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final Boolean invoke(cBA cba) {
                boolean d2;
                C8632dsu.c((Object) cba, "");
                d2 = cDL.this.d(cba);
                return Boolean.valueOf(d2);
            }
        };
        Observable<cBA> filter2 = observable.filter(new Predicate() { // from class: o.cDR
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean n;
                n = cDL.n(drM.this, obj);
                return n;
            }
        });
        C8632dsu.a(filter2, "");
        SubscribersKt.subscribeBy$default(filter2, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerContentAdvisoryUIPresenter$4
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBA cba) {
                d(cba);
                return dpR.c;
            }

            public final void d(cBA cba) {
                cDL.this.b();
            }
        }, 3, (Object) null);
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    public void d() {
        Observable<cBA> observable = this.i;
        final drM<cBA, Boolean> drm = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerContentAdvisoryUIPresenter$initialObservePlayerEventsToShowAdvisories$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(cBA cba) {
                boolean z;
                boolean e;
                C8632dsu.c((Object) cba, "");
                if (cDL.this.e()) {
                    e = cDL.this.e(cba);
                    if (e) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        };
        Observable<cBA> filter = observable.filter(new Predicate() { // from class: o.cDN
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean o2;
                o2 = cDL.o(drM.this, obj);
                return o2;
            }
        });
        C8632dsu.a(filter, "");
        Observable<LinkedHashMap<Advisory, Boolean>> d2 = this.e.d();
        C8632dsu.a(d2, "");
        Observable take = ObservablesKt.zipWith(filter, d2).take(1L);
        C8632dsu.a(take, "");
        SubscribersKt.subscribeBy$default(take, (drM) null, (drO) null, new drM<Pair<? extends cBA, ? extends LinkedHashMap<Advisory, Boolean>>, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerContentAdvisoryUIPresenter$initialObservePlayerEventsToShowAdvisories$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Pair<? extends cBA, ? extends LinkedHashMap<Advisory, Boolean>> pair) {
                c(pair);
                return dpR.c;
            }

            public final void c(Pair<? extends cBA, ? extends LinkedHashMap<Advisory, Boolean>> pair) {
                C1044Mm.a("AdvisoryUIPresenter", "Showing Advisories if any. Size is %s", Integer.valueOf(pair.a().size()));
                cDL.this.e(pair.a());
                cDL.this.g();
            }
        }, 3, (Object) null);
    }

    @Override // o.cDE, o.AbstractC9940zU
    public void onEvent(cBA cba) {
        C8632dsu.c((Object) cba, "");
        if (cba instanceof cBA.C5557s) {
            this.g = false;
        } else if (cba instanceof cBA.C5548j) {
            this.g = true;
        } else if ((cba instanceof AbstractC5595cBf.d) || (cba instanceof AbstractC5595cBf.b) || (cba instanceof AbstractC5595cBf.e) || (cba instanceof AbstractC5595cBf.c)) {
            this.c = false;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    public void f() {
        CompositeDisposable compositeDisposable = this.a;
        Observable<cBA> observable = this.i;
        final drM<cBA, Boolean> drm = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerContentAdvisoryUIPresenter$observePlayerEventsToShowAdvisoriesWithData$1
            {
                super(1);
            }

            /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
                if ((!r1.e.a().isEmpty()) != false) goto L7;
             */
            @Override // o.drM
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Boolean invoke(o.cBA r2) {
                /*
                    r1 = this;
                    java.lang.String r0 = ""
                    o.C8632dsu.c(r2, r0)
                    o.cDL r0 = o.cDL.this
                    boolean r0 = r0.e()
                    if (r0 == 0) goto L24
                    o.cDL r0 = o.cDL.this
                    boolean r2 = o.cDL.a(r0, r2)
                    if (r2 == 0) goto L24
                    o.cDL r2 = o.cDL.this
                    java.util.LinkedHashMap r2 = r2.a()
                    boolean r2 = r2.isEmpty()
                    r0 = 1
                    r2 = r2 ^ r0
                    if (r2 == 0) goto L24
                    goto L25
                L24:
                    r0 = 0
                L25:
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.player.v2.presenter.PlayerContentAdvisoryUIPresenter$observePlayerEventsToShowAdvisoriesWithData$1.invoke(o.cBA):java.lang.Boolean");
            }
        };
        Observable<cBA> take = observable.filter(new Predicate() { // from class: o.cDQ
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean k;
                k = cDL.k(drM.this, obj);
                return k;
            }
        }).take(1L);
        C8632dsu.a(take, "");
        compositeDisposable.add(SubscribersKt.subscribeBy$default(take, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerContentAdvisoryUIPresenter$observePlayerEventsToShowAdvisoriesWithData$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBA cba) {
                b(cba);
                return dpR.c;
            }

            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
            public final void b(cBA cba) {
                boolean b;
                C1044Mm.a("AdvisoryUIPresenter", "Showing Advisories with data if any. Size is %s", Integer.valueOf(cDL.this.a().size()));
                cDL cdl = cDL.this;
                C8632dsu.d(cba);
                b = cdl.b(cba);
                if (b) {
                    LinkedHashMap<Advisory, Boolean> a2 = cDL.this.a();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<Advisory, Boolean> entry : a2.entrySet()) {
                        if ((entry.getKey() instanceof ProductPlacementAdvisory) || entry.getKey().getType() == Advisory.Type.PRODUCT_PLACEMENT_ADVISORY) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    cDL cdl2 = cDL.this;
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        cdl2.a().put(entry2.getKey(), Boolean.FALSE);
                    }
                }
                cDL.this.g();
            }
        }, 3, (Object) null));
    }

    public void g() {
        CompositeDisposable compositeDisposable = this.a;
        Observable fromIterable = Observable.fromIterable(this.b.entrySet());
        final PlayerContentAdvisoryUIPresenter$showAdvisories$1 playerContentAdvisoryUIPresenter$showAdvisories$1 = new drM<Map.Entry<? extends Advisory, ? extends Boolean>, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerContentAdvisoryUIPresenter$showAdvisories$1
            @Override // o.drM
            /* renamed from: a */
            public final Boolean invoke(Map.Entry<? extends Advisory, Boolean> entry) {
                C8632dsu.c((Object) entry, "");
                return Boolean.valueOf(!entry.getValue().booleanValue());
            }
        };
        Observable filter = fromIterable.filter(new Predicate() { // from class: o.cDJ
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean m;
                m = cDL.m(drM.this, obj);
                return m;
            }
        });
        final PlayerContentAdvisoryUIPresenter$showAdvisories$2 playerContentAdvisoryUIPresenter$showAdvisories$2 = new PlayerContentAdvisoryUIPresenter$showAdvisories$2(this);
        Observable concatMap = filter.concatMap(new Function() { // from class: o.cDO
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource r;
                r = cDL.r(drM.this, obj);
                return r;
            }
        });
        C8632dsu.a(concatMap, "");
        compositeDisposable.add(SubscribersKt.subscribeBy$default(concatMap, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerContentAdvisoryUIPresenter$showAdvisories$3
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                Map d2;
                Map k;
                Throwable th2;
                C8632dsu.c((Object) th, "");
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd(null, th, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    th2 = c1596aHd.i;
                    if (th2 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
            }
        }, (drO) null, (drM) null, 6, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource r(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (ObservableSource) drm.invoke(obj);
    }

    public void b() {
        C1044Mm.e("AdvisoryUIPresenter", "Cancelling Advisories...");
        this.a.clear();
        this.j.j();
        this.j.c();
        f();
    }

    public boolean e() {
        return (j() || this.g || i() || !this.c) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(cBA cba) {
        return C8632dsu.c(cba, cBA.C5541c.c) || C8632dsu.c(cba, cBA.E.e) || C8632dsu.c(cba, cBA.C5564z.e) || C8632dsu.c(cba, cBA.F.a) || C8632dsu.c(cba, cBA.C5557s.c) || C8632dsu.c(cba, cAY.a.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(cBA cba) {
        return C8632dsu.c(cba, cBA.K.a) || (cba instanceof cBA.aA) || (cba instanceof cBA.C5548j) || (cba instanceof cBA.C5559u) || (cba instanceof cBA.C5550l) || (cba instanceof cBA.C5549k) || (cba instanceof cAY.d) || (cba instanceof cBA.C5558t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b(cBA cba) {
        return C8632dsu.c(cba, cAY.a.c);
    }
}
