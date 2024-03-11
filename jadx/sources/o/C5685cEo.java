package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.player.v2.SkipCreditsType;
import com.netflix.mediaclient.ui.player.v2.presenter.PlayerSkipCreditsUIPresenter$1;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Map;
import o.C1596aHd;
import o.C5685cEo;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5706cFi;
import o.InterfaceC5710cFm;
import o.InterfaceC5725cGa;
import o.cBA;
import o.cIE;
import o.dpR;
import o.dqE;

/* renamed from: o.cEo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5685cEo extends cDE implements InterfaceC5706cFi, InterfaceC5710cFm {
    private String b;
    private boolean c;
    private final InterfaceC5725cGa d;
    private boolean e;

    @Override // o.InterfaceC5710cFm
    public void b(String str) {
        this.b = str;
    }

    public final void b(boolean z) {
        this.e = z;
    }

    public final boolean b() {
        return this.e;
    }

    @Override // o.InterfaceC5710cFm
    public String c() {
        return this.b;
    }

    @Override // o.InterfaceC5706cFi
    public void d(boolean z) {
        this.c = z;
    }

    public boolean e() {
        return this.c;
    }

    @Override // o.InterfaceC5706cFi
    public void a(Observable<cBA> observable) {
        InterfaceC5706cFi.a.b(this, observable);
    }

    public boolean a() {
        return InterfaceC5710cFm.e.e(this);
    }

    @Override // o.InterfaceC5710cFm
    public void c(Observable<cBA> observable) {
        InterfaceC5710cFm.e.c(this, observable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5685cEo(InterfaceC5725cGa interfaceC5725cGa, Observable<cBA> observable) {
        super(observable, new InterfaceC5730cGf[]{interfaceC5725cGa}, null, 4, null);
        C8632dsu.c((Object) interfaceC5725cGa, "");
        C8632dsu.c((Object) observable, "");
        this.d = interfaceC5725cGa;
        final PlayerSkipCreditsUIPresenter$1 playerSkipCreditsUIPresenter$1 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerSkipCreditsUIPresenter$1
            @Override // o.drM
            /* renamed from: a */
            public final Boolean invoke(cBA cba) {
                C8632dsu.c((Object) cba, "");
                return Boolean.valueOf(C8632dsu.c(cba, cBA.N.d));
            }
        };
        Observable<cBA> filter = observable.filter(new Predicate() { // from class: o.cEt
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean d;
                d = C5685cEo.d(drM.this, obj);
                return d;
            }
        });
        C8632dsu.a(filter, "");
        SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerSkipCreditsUIPresenter$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBA cba) {
                d(cba);
                return dpR.c;
            }

            public final void d(cBA cba) {
                InterfaceC5725cGa interfaceC5725cGa2;
                InterfaceC5725cGa interfaceC5725cGa3;
                C5685cEo.this.b(false);
                interfaceC5725cGa2 = C5685cEo.this.d;
                if (interfaceC5725cGa2.w()) {
                    interfaceC5725cGa3 = C5685cEo.this.d;
                    interfaceC5725cGa3.b(true);
                }
            }
        }, 3, (Object) null);
        final drM<cBA, Boolean> drm = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerSkipCreditsUIPresenter$3
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final Boolean invoke(cBA cba) {
                C8632dsu.c((Object) cba, "");
                return Boolean.valueOf(!C5685cEo.this.b());
            }
        };
        Observable<cBA> filter2 = observable.filter(new Predicate() { // from class: o.cEr
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean j;
                j = C5685cEo.j(drM.this, obj);
                return j;
            }
        });
        C8632dsu.a(filter2, "");
        SubscribersKt.subscribeBy$default(filter2, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerSkipCreditsUIPresenter$4
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBA cba) {
                e(cba);
                return dpR.c;
            }

            public final void e(cBA cba) {
                InterfaceC5725cGa interfaceC5725cGa2;
                InterfaceC5725cGa interfaceC5725cGa3;
                InterfaceC5725cGa interfaceC5725cGa4;
                InterfaceC5725cGa interfaceC5725cGa5;
                InterfaceC5725cGa interfaceC5725cGa6;
                InterfaceC5725cGa interfaceC5725cGa7;
                InterfaceC5725cGa interfaceC5725cGa8;
                if (C8632dsu.c(cba, cBA.P.a)) {
                    C5685cEo.this.b(true);
                    interfaceC5725cGa7 = C5685cEo.this.d;
                    interfaceC5725cGa7.b(cIE.a.r);
                    interfaceC5725cGa8 = C5685cEo.this.d;
                    interfaceC5725cGa8.a(SkipCreditsType.c);
                    C5685cEo.a(C5685cEo.this, false, 1, null);
                } else if (C8632dsu.c(cba, cBA.O.d)) {
                    C5685cEo.this.b(true);
                    interfaceC5725cGa5 = C5685cEo.this.d;
                    interfaceC5725cGa5.b(cIE.a.q);
                    interfaceC5725cGa6 = C5685cEo.this.d;
                    interfaceC5725cGa6.a(SkipCreditsType.a);
                    C5685cEo.a(C5685cEo.this, false, 1, null);
                } else if (cba instanceof cBA.Q) {
                    C5685cEo.this.b(true);
                    interfaceC5725cGa2 = C5685cEo.this.d;
                    cBA.Q q = (cBA.Q) cba;
                    interfaceC5725cGa2.b((CharSequence) q.e());
                    interfaceC5725cGa3 = C5685cEo.this.d;
                    interfaceC5725cGa3.a(SkipCreditsType.d);
                    interfaceC5725cGa4 = C5685cEo.this.d;
                    interfaceC5725cGa4.a(q.c());
                    C5685cEo.a(C5685cEo.this, false, 1, null);
                }
            }
        }, 3, (Object) null);
        final drM<cBA, Boolean> drm2 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerSkipCreditsUIPresenter$5
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final Boolean invoke(cBA cba) {
                C8632dsu.c((Object) cba, "");
                return Boolean.valueOf(C5685cEo.this.b());
            }
        };
        Observable<cBA> filter3 = observable.filter(new Predicate() { // from class: o.cEu
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean i;
                i = C5685cEo.i(drM.this, obj);
                return i;
            }
        });
        C8632dsu.a(filter3, "");
        SubscribersKt.subscribeBy$default(filter3, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerSkipCreditsUIPresenter$6
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }

            public final void a(Throwable th) {
                Map d;
                Map k;
                Throwable th2;
                C8632dsu.c((Object) th, "");
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
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
        }, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerSkipCreditsUIPresenter$7
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBA cba) {
                d(cba);
                return dpR.c;
            }

            public final void d(cBA cba) {
                InterfaceC5725cGa interfaceC5725cGa2;
                if (C8632dsu.c(cba, cBA.M.e) || C8632dsu.c(cba, cBA.K.a) || C8632dsu.c(cba, cBA.E.e) || (cba instanceof cBA.C5541c) || (cba instanceof cBA.an)) {
                    interfaceC5725cGa2 = C5685cEo.this.d;
                    interfaceC5725cGa2.b(false);
                } else if ((cba instanceof cBA.ap) || (cba instanceof cBA.C5548j)) {
                    C5685cEo.this.c(false);
                }
            }
        }, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    public static /* synthetic */ void a(C5685cEo c5685cEo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c5685cEo.c(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(boolean z) {
        if (e() || a()) {
            return;
        }
        this.d.e(z);
    }
}
