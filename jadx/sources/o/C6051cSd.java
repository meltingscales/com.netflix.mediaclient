package o;

import android.annotation.SuppressLint;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.ui.search.SearchUtils;
import com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchPresenterV3$getVideoInfo$4;
import com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchPresenterV3$getVideoInfo$5;
import com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchPresenterV3$updateLiveEventState$1$1;
import com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchPresenterV3$updateLiveEventState$2;
import com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchPresenterV3$updateLiveEventState$3;
import com.netflix.model.leafs.SearchPageEntity;
import com.netflix.model.leafs.SearchSectionSummary;
import dagger.Lazy;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import o.AbstractC6078cTd;
import o.AbstractC6094cTq;
import o.C1867aRe;
import o.C6051cSd;
import o.C6063cSp;
import o.C6089cTl;
import o.C8632dsu;
import o.InterfaceC1078Nw;
import o.bZI;
import o.dpR;
import o.dxD;

/* renamed from: o.cSd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6051cSd extends AbstractC9940zU<AbstractC6078cTd, AbstractC6078cTd> {
    public static final c a = new c(null);
    private final Lazy<bZI> b;
    private final Observable<dpR> c;
    private final aDB d;
    private dxD e;
    private C6089cTl f;
    private final C6063cSp g;
    private final InterfaceC6086cTi h;
    private final dwU j;

    @Override // o.AbstractC9940zU
    public void onEvent(AbstractC6078cTd abstractC6078cTd) {
        C8632dsu.c((Object) abstractC6078cTd, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6051cSd(Observable<AbstractC6078cTd> observable, C6063cSp c6063cSp, InterfaceC6086cTi interfaceC6086cTi, Observable<dpR> observable2, Lazy<bZI> lazy, dwU dwu, aDB adb) {
        super(observable, c6063cSp);
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) c6063cSp, "");
        C8632dsu.c((Object) interfaceC6086cTi, "");
        C8632dsu.c((Object) observable2, "");
        C8632dsu.c((Object) lazy, "");
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) adb, "");
        this.g = c6063cSp;
        this.h = interfaceC6086cTi;
        this.c = observable2;
        this.b = lazy;
        this.j = dwu;
        this.d = adb;
        c();
    }

    /* renamed from: o.cSd$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("PreQuerySearchPresenterV3");
        }
    }

    private final void c() {
        this.g.o();
        Observable<AbstractC6078cTd> observeOn = this.h.d().takeUntil(this.c).observeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(observeOn, "");
        SubscribersKt.subscribeBy$default(observeOn, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchPresenterV3$fetchSearchResults$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                d(th);
                return dpR.c;
            }

            public final void d(Throwable th) {
                C6063cSp c6063cSp;
                C6063cSp c6063cSp2;
                C6089cTl c6089cTl;
                C6089cTl c6089cTl2;
                C8632dsu.c((Object) th, "");
                c6063cSp = C6051cSd.this.g;
                c6063cSp.f();
                c6063cSp2 = C6051cSd.this.g;
                c6063cSp2.c();
                C6051cSd.this.e("PreQuery_rxError");
                C6051cSd c6051cSd = C6051cSd.this;
                c6089cTl = c6051cSd.f;
                if (c6089cTl != null) {
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ad;
                    C8632dsu.a(netflixImmutableStatus, "");
                    c6089cTl2 = c6089cTl.a((r27 & 1) != 0 ? c6089cTl.i : null, (r27 & 2) != 0 ? c6089cTl.b : false, (r27 & 4) != 0 ? c6089cTl.m : null, (r27 & 8) != 0 ? c6089cTl.f : null, (r27 & 16) != 0 ? c6089cTl.g : null, (r27 & 32) != 0 ? c6089cTl.h : null, (r27 & 64) != 0 ? c6089cTl.c : null, (r27 & 128) != 0 ? c6089cTl.e : null, (r27 & JSONzip.end) != 0 ? c6089cTl.j : new AbstractC6094cTq.c(netflixImmutableStatus), (r27 & 512) != 0 ? c6089cTl.a : null, (r27 & 1024) != 0 ? c6089cTl.d : 0L);
                } else {
                    c6089cTl2 = null;
                }
                c6051cSd.f = c6089cTl2;
            }
        }, (drO) null, new drM<AbstractC6078cTd, dpR>() { // from class: com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchPresenterV3$fetchSearchResults$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC6078cTd abstractC6078cTd) {
                c(abstractC6078cTd);
                return dpR.c;
            }

            public final void c(AbstractC6078cTd abstractC6078cTd) {
                C6089cTl c6089cTl;
                C6089cTl c6089cTl2;
                C6063cSp c6063cSp;
                C6063cSp c6063cSp2;
                C6063cSp c6063cSp3;
                C6063cSp c6063cSp4;
                C6063cSp c6063cSp5;
                C6063cSp c6063cSp6;
                C6089cTl c6089cTl3;
                if (abstractC6078cTd instanceof AbstractC6078cTd.A) {
                    AbstractC6078cTd.A a2 = (AbstractC6078cTd.A) abstractC6078cTd;
                    List<SearchSectionSummary> e = a2.e();
                    C6051cSd.this.f = new C6089cTl(new ArrayList(), false, new LinkedHashMap(), new LinkedHashMap(), null, new LinkedHashMap(), null, null, AbstractC6094cTq.a.e, null, 0L, 528, null);
                    if (e == null || !(!e.isEmpty())) {
                        c6063cSp4 = C6051cSd.this.g;
                        c6063cSp4.f();
                        c6063cSp5 = C6051cSd.this.g;
                        c6063cSp5.c();
                    } else {
                        c6089cTl3 = C6051cSd.this.f;
                        if (c6089cTl3 != null) {
                            C6051cSd c6051cSd = C6051cSd.this;
                            c6089cTl3.h().clear();
                            c6089cTl3.h().addAll(e);
                            c6051cSd.b(a2.a(), a2.e());
                        }
                    }
                    c6063cSp6 = C6051cSd.this.g;
                    C8632dsu.d(abstractC6078cTd);
                    c6063cSp6.b((C6063cSp) abstractC6078cTd);
                } else if (abstractC6078cTd instanceof AbstractC6078cTd.C6079a) {
                    C6051cSd.this.e("PreQuery_Error");
                    C6051cSd c6051cSd2 = C6051cSd.this;
                    c6089cTl = c6051cSd2.f;
                    if (c6089cTl != null) {
                        NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ad;
                        C8632dsu.a(netflixImmutableStatus, "");
                        c6089cTl2 = c6089cTl.a((r27 & 1) != 0 ? c6089cTl.i : null, (r27 & 2) != 0 ? c6089cTl.b : false, (r27 & 4) != 0 ? c6089cTl.m : null, (r27 & 8) != 0 ? c6089cTl.f : null, (r27 & 16) != 0 ? c6089cTl.g : null, (r27 & 32) != 0 ? c6089cTl.h : null, (r27 & 64) != 0 ? c6089cTl.c : null, (r27 & 128) != 0 ? c6089cTl.e : null, (r27 & JSONzip.end) != 0 ? c6089cTl.j : new AbstractC6094cTq.c(netflixImmutableStatus), (r27 & 512) != 0 ? c6089cTl.a : null, (r27 & 1024) != 0 ? c6089cTl.d : 0L);
                    } else {
                        c6089cTl2 = null;
                    }
                    c6051cSd2.f = c6089cTl2;
                    c6063cSp = C6051cSd.this.g;
                    c6063cSp.f();
                    c6063cSp2 = C6051cSd.this.g;
                    c6063cSp2.c();
                    c6063cSp3 = C6051cSd.this.g;
                    C8632dsu.d(abstractC6078cTd);
                    c6063cSp3.b((C6063cSp) abstractC6078cTd);
                }
            }
        }, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(InterfaceC5280bvl interfaceC5280bvl, List<? extends SearchSectionSummary> list) {
        Observable<AbstractC6078cTd> a2 = this.h.a(interfaceC5280bvl, list);
        final drM<AbstractC6078cTd, dpR> drm = new drM<AbstractC6078cTd, dpR>() { // from class: com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchPresenterV3$getVideoInfo$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC6078cTd abstractC6078cTd) {
                b(abstractC6078cTd);
                return dpR.c;
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
                r7 = r19.e.f;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void b(o.AbstractC6078cTd r20) {
                /*
                    Method dump skipped, instructions count: 278
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchPresenterV3$getVideoInfo$1.b(o.cTd):void");
            }
        };
        Observable<AbstractC6078cTd> doOnNext = a2.doOnNext(new Consumer() { // from class: o.cSk
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6051cSd.i(drM.this, obj);
            }
        });
        final drM<Throwable, dpR> drm2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchPresenterV3$getVideoInfo$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                C6063cSp c6063cSp;
                C6063cSp c6063cSp2;
                C6089cTl c6089cTl;
                C6089cTl c6089cTl2;
                C6051cSd.c cVar = C6051cSd.a;
                C6051cSd.this.e("PreQuery_getVideoInfo_rxError");
                c6063cSp = C6051cSd.this.g;
                c6063cSp.f();
                c6063cSp2 = C6051cSd.this.g;
                c6063cSp2.c();
                C6051cSd c6051cSd = C6051cSd.this;
                c6089cTl = c6051cSd.f;
                if (c6089cTl != null) {
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ad;
                    C8632dsu.a(netflixImmutableStatus, "");
                    c6089cTl2 = c6089cTl.a((r27 & 1) != 0 ? c6089cTl.i : null, (r27 & 2) != 0 ? c6089cTl.b : false, (r27 & 4) != 0 ? c6089cTl.m : null, (r27 & 8) != 0 ? c6089cTl.f : null, (r27 & 16) != 0 ? c6089cTl.g : null, (r27 & 32) != 0 ? c6089cTl.h : null, (r27 & 64) != 0 ? c6089cTl.c : null, (r27 & 128) != 0 ? c6089cTl.e : null, (r27 & JSONzip.end) != 0 ? c6089cTl.j : new AbstractC6094cTq.c(netflixImmutableStatus), (r27 & 512) != 0 ? c6089cTl.a : null, (r27 & 1024) != 0 ? c6089cTl.d : 0L);
                } else {
                    c6089cTl2 = null;
                }
                c6051cSd.f = c6089cTl2;
            }
        };
        Observable<AbstractC6078cTd> takeUntil = doOnNext.doOnError(new Consumer() { // from class: o.cSi
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6051cSd.j(drM.this, obj);
            }
        }).doOnComplete(new Action() { // from class: o.cSg
            @Override // io.reactivex.functions.Action
            public final void run() {
                C6051cSd.this.a();
            }
        }).takeUntil(this.c);
        final PreQuerySearchPresenterV3$getVideoInfo$4 preQuerySearchPresenterV3$getVideoInfo$4 = new drM<AbstractC6078cTd, dpR>() { // from class: com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchPresenterV3$getVideoInfo$4
            public final void c(AbstractC6078cTd abstractC6078cTd) {
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC6078cTd abstractC6078cTd) {
                c(abstractC6078cTd);
                return dpR.c;
            }
        };
        Consumer<? super AbstractC6078cTd> consumer = new Consumer() { // from class: o.cSj
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6051cSd.l(drM.this, obj);
            }
        };
        final PreQuerySearchPresenterV3$getVideoInfo$5 preQuerySearchPresenterV3$getVideoInfo$5 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchPresenterV3$getVideoInfo$5
            public final void d(Throwable th) {
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                d(th);
                return dpR.c;
            }
        };
        takeUntil.subscribe(consumer, new Consumer() { // from class: o.cSh
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6051cSd.m(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(String str) {
        String str2;
        if (aQH.b.d()) {
            str2 = "PreQuerySearch_graphql_migration_3_" + str;
        } else if (C8153dex.Y()) {
            str2 = "PreQuerySearch_graphql_migration_Option_5_" + str;
        } else {
            C1867aRe.a aVar = C1867aRe.a;
            if (aVar.c().d()) {
                str2 = "PreQuerySearch_graphql_migration_Option_3_" + str;
            } else if (C1872aRj.c.c()) {
                str2 = "PreQuerySearch_Page_Platform_" + str;
            } else if (C1873aRk.a.b()) {
                str2 = "PreQuery_Irma_FullSearch_" + str;
            } else if (C8632dsu.c(aVar.c(), C1867aRe.c.b.b)) {
                str2 = "PreQuerySearch_graphql_Control_migration_" + str;
            } else {
                str2 = null;
            }
        }
        if (str2 != null) {
            SearchUtils.a(str2, "Received an error ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public final void a() {
        Map<String, SearchPageEntity> o2;
        final Set W;
        C6089cTl c6089cTl = this.f;
        if (c6089cTl == null || (o2 = c6089cTl.o()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, SearchPageEntity> entry : o2.entrySet()) {
            Integer valueOf = C8632dsu.c((Object) entry.getValue().getEntityType(), (Object) C3378axp.e.d().b()) ? Integer.valueOf(Integer.parseInt(entry.getKey())) : null;
            if (valueOf != null) {
                arrayList.add(valueOf);
            }
        }
        W = C8576dqs.W(arrayList);
        Observable takeUntil = Observable.fromCallable(new Callable() { // from class: o.cSb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dpR c2;
                c2 = C6051cSd.c(C6051cSd.this, W);
                return c2;
            }
        }).takeUntil(this.c);
        final PreQuerySearchPresenterV3$updateLiveEventState$2 preQuerySearchPresenterV3$updateLiveEventState$2 = new drM<dpR, dpR>() { // from class: com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchPresenterV3$updateLiveEventState$2
            public final void b(dpR dpr) {
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(dpR dpr) {
                b(dpr);
                return dpR.c;
            }
        };
        Consumer consumer = new Consumer() { // from class: o.cSe
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6051cSd.n(drM.this, obj);
            }
        };
        final PreQuerySearchPresenterV3$updateLiveEventState$3 preQuerySearchPresenterV3$updateLiveEventState$3 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.search.prequery.v3.PreQuerySearchPresenterV3$updateLiveEventState$3
            public final void c(Throwable th) {
                C6051cSd.c cVar = C6051cSd.a;
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }
        };
        takeUntil.subscribe(consumer, new Consumer() { // from class: o.cSf
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6051cSd.k(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dpR c(C6051cSd c6051cSd, Set set) {
        C8632dsu.c((Object) c6051cSd, "");
        C8632dsu.c((Object) set, "");
        dxD dxd = c6051cSd.e;
        if (dxd != null) {
            dxD.b.b(dxd, null, 1, null);
        }
        bZI bzi = c6051cSd.b.get();
        C8632dsu.a(bzi, "");
        aDB adb = c6051cSd.d;
        c6051cSd.e = dyR.e(dyR.a(dyR.a(bZI.d.e(bzi, set, adb.c(adb.a()), false, 4, null), (drX) new PreQuerySearchPresenterV3$updateLiveEventState$1$1(c6051cSd, null)), GF.d()), c6051cSd.j);
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }
}
