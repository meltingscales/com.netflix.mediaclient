package o;

import com.netflix.mediaclient.ui.player.v2.presenter.PlayerTappablePresenter$1;
import com.netflix.mediaclient.ui.player.v2.presenter.PlayerTappablePresenter$observeCreditMarksTakingOne$1;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import o.AbstractC5595cBf;
import o.C5696cEz;
import o.C8632dsu;
import o.InterfaceC5709cFl;
import o.cBA;
import o.cBO;
import o.cFZ;
import o.dpR;

/* renamed from: o.cEz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5696cEz extends AbstractC9940zU<cBA, cBO> {
    private boolean a;
    private boolean b;
    private final Observable<dpR> c;
    private boolean d;
    private boolean e;
    private final Observable<cBA> f;
    private boolean g;
    private final cFZ i;
    private boolean j;

    public final void a(boolean z) {
        this.e = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final void b(boolean z) {
        this.g = z;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.g;
    }

    public final void d(boolean z) {
        this.a = z;
    }

    public final boolean d() {
        return this.j;
    }

    public final void e(boolean z) {
        this.j = z;
    }

    public final boolean e() {
        return this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5696cEz(cFZ cfz, Observable<cBA> observable, Observable<dpR> observable2) {
        super(observable, cfz);
        C8632dsu.c((Object) cfz, "");
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) observable2, "");
        this.i = cfz;
        this.f = observable;
        this.c = observable2;
        this.a = true;
        this.b = true;
        final PlayerTappablePresenter$1 playerTappablePresenter$1 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerTappablePresenter$1
            @Override // o.drM
            /* renamed from: d */
            public final Boolean invoke(cBA cba) {
                C8632dsu.c((Object) cba, "");
                return Boolean.valueOf((cba instanceof cBA.ai) || (cba instanceof InterfaceC5709cFl));
            }
        };
        Observable<cBA> take = observable.filter(new Predicate() { // from class: o.cEy
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean d;
                d = C5696cEz.d(drM.this, obj);
                return d;
            }
        }).take(1L);
        C8632dsu.a(take, "");
        SubscribersKt.subscribeBy$default(take, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerTappablePresenter$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBA cba) {
                c(cba);
                return dpR.c;
            }

            public final void c(cBA cba) {
                C5696cEz.this.d(false);
            }
        }, 3, (Object) null);
        Observable<cBO> takeUntil = cfz.v().takeUntil(observable2);
        final drM<cBO, Boolean> drm = new drM<cBO, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerTappablePresenter$3
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final Boolean invoke(cBO cbo) {
                C8632dsu.c((Object) cbo, "");
                return Boolean.valueOf(C5696cEz.this.a());
            }
        };
        Observable<cBO> skipWhile = takeUntil.skipWhile(new Predicate() { // from class: o.cEw
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean j;
                j = C5696cEz.j(drM.this, obj);
                return j;
            }
        });
        C8632dsu.a(skipWhile, "");
        SubscribersKt.subscribeBy$default(skipWhile, (drM) null, (drO) null, new drM<cBO, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerTappablePresenter$4
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBO cbo) {
                e(cbo);
                return dpR.c;
            }

            public final void e(cBO cbo) {
                cFZ cfz2;
                cFZ cfz3;
                cFZ cfz4;
                cFZ cfz5;
                if (C8632dsu.c(cbo, cBO.O.c)) {
                    if (C5696cEz.this.b()) {
                        if (C5696cEz.this.e() || C5696cEz.this.d()) {
                            cfz3 = C5696cEz.this.i;
                            cfz3.f();
                            C5696cEz.this.a(false);
                            C5696cEz.this.e(false);
                        } else if (!C5696cEz.this.c()) {
                            cfz5 = C5696cEz.this.i;
                            cfz5.j();
                            C5696cEz.this.a(true);
                        } else {
                            cfz4 = C5696cEz.this.i;
                            cfz4.f();
                            C5696cEz.this.b(false);
                        }
                    }
                } else if (cbo instanceof cBO.P) {
                    cfz2 = C5696cEz.this.i;
                    cfz2.b(((cBO.P) cbo).c(), C5696cEz.this.e());
                }
            }
        }, 3, (Object) null);
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

    @Override // o.AbstractC9940zU
    public void onEvent(cBA cba) {
        C8632dsu.c((Object) cba, "");
        if (cba instanceof cBA.ai) {
            if (!((cBA.ai) cba).i()) {
                this.e = true;
            }
            if (this.d) {
                this.i.b();
            } else {
                this.i.d();
            }
            this.b = true;
            j();
        } else if (cba instanceof cBA.C5556r) {
            this.b = true;
        } else if (C8632dsu.c(cba, cBA.E.e)) {
            this.e = false;
            this.g = false;
        } else if (C8632dsu.c(cba, cBA.N.d)) {
            this.g = false;
        } else if (cba instanceof cBA.am) {
            this.j = true;
        } else if (C8632dsu.c(cba, cBA.C5559u.b)) {
            if (this.j) {
                this.i.b();
            }
        } else if ((cba instanceof cBA.an) || C8632dsu.c(cba, cBA.C5558t.d) || C8632dsu.c(cba, cBA.M.e)) {
            this.i.b();
        } else if (cba instanceof cBA.C5555q) {
            this.e = false;
        } else if (cba instanceof cBA.ag) {
            cBA.ag agVar = (cBA.ag) cba;
            if (agVar.c()) {
                this.e = true;
                this.i.b();
            } else {
                this.e = false;
                this.i.d();
            }
            this.d = agVar.c();
        } else if (cba instanceof cBA.C5551m) {
            this.e = false;
        } else if (cba instanceof cBA.F) {
            this.e = false;
        } else if (cba instanceof AbstractC5595cBf.c) {
            this.b = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    public final void j() {
        Observable<cBA> observable = this.f;
        final PlayerTappablePresenter$observeCreditMarksTakingOne$1 playerTappablePresenter$observeCreditMarksTakingOne$1 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerTappablePresenter$observeCreditMarksTakingOne$1
            @Override // o.drM
            /* renamed from: a */
            public final Boolean invoke(cBA cba) {
                C8632dsu.c((Object) cba, "");
                return Boolean.valueOf(C8632dsu.c(cba, cBA.P.a) || C8632dsu.c(cba, cBA.O.d));
            }
        };
        Observable<cBA> take = observable.filter(new Predicate() { // from class: o.cED
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean i;
                i = C5696cEz.i(drM.this, obj);
                return i;
            }
        }).take(1L);
        C8632dsu.a(take, "");
        SubscribersKt.subscribeBy$default(take, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerTappablePresenter$observeCreditMarksTakingOne$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBA cba) {
                b(cba);
                return dpR.c;
            }

            public final void b(cBA cba) {
                C5696cEz c5696cEz = C5696cEz.this;
                c5696cEz.b(!c5696cEz.e());
            }
        }, 3, (Object) null);
    }
}
