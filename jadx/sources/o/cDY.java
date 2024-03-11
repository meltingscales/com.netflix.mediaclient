package o;

import android.annotation.SuppressLint;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.player.v2.presenter.PlayerInterrupterUIPresenter$1;
import com.netflix.mediaclient.ui.player.v2.presenter.PlayerInterrupterUIPresenter$onEvent$1;
import com.netflix.mediaclient.ui.player.v2.presenter.PlayerInterrupterUIPresenter$onEvent$6;
import com.netflix.mediaclient.ui.player.v2.presenter.PlayerInterrupterUIPresenter$timeToShowInterrupterAfterAdBreak$1;
import com.netflix.mediaclient.ui.player.v2.presenter.PlayerInterrupterUIPresenter$timeToShowInterrupterAfterBufferingCheck$2;
import com.netflix.mediaclient.ui.player.v2.presenter.PlayerInterrupterUIPresenter$userInteractionEventObservable$1;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.C1596aHd;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.cAY;
import o.cBA;
import o.cBO;
import o.cBQ;
import o.cDY;
import o.cFP;
import o.dpR;
import o.dqE;

@SuppressLint({"CheckResult"})
/* loaded from: classes4.dex */
public class cDY extends AbstractC9940zU<cBA, cBO> {
    public static final c e = new c(null);
    private boolean a;
    private final Observable<dpR> b;
    private boolean c;
    private final Observable<cBA> d;
    private final Observable<cBA> f;
    private final cFP h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cDY(cFP cfp, Observable<cBA> observable, Observable<dpR> observable2) {
        super(observable, cfp);
        C8632dsu.c((Object) cfp, "");
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) observable2, "");
        this.h = cfp;
        this.d = observable;
        this.b = observable2;
        final PlayerInterrupterUIPresenter$userInteractionEventObservable$1 playerInterrupterUIPresenter$userInteractionEventObservable$1 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerInterrupterUIPresenter$userInteractionEventObservable$1
            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(cBA cba) {
                C8632dsu.c((Object) cba, "");
                return Boolean.valueOf(C8632dsu.c(cba, cBA.aw.c));
            }
        };
        this.f = observable.filter(new Predicate() { // from class: o.cEe
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean q;
                q = cDY.q(drM.this, obj);
                return q;
            }
        });
        Observable<cBO> takeUntil = cfp.v().takeUntil(observable2);
        final PlayerInterrupterUIPresenter$1 playerInterrupterUIPresenter$1 = new drM<cBO, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerInterrupterUIPresenter$1
            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(cBO cbo) {
                C8632dsu.c((Object) cbo, "");
                return Boolean.valueOf(C8632dsu.c(cbo, cBO.C5571g.e) || C8632dsu.c(cbo, cBO.C5570f.b) || C8632dsu.c(cbo, cBO.C5574j.e));
            }
        };
        Observable<cBO> filter = takeUntil.filter(new Predicate() { // from class: o.cEg
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean h;
                h = cDY.h(drM.this, obj);
                return h;
            }
        });
        C8632dsu.a(filter, "");
        SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<cBO, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerInterrupterUIPresenter$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBO cbo) {
                a(cbo);
                return dpR.c;
            }

            public final void a(cBO cbo) {
                cFP cfp2;
                cfp2 = cDY.this.h;
                cfp2.c();
            }
        }, 3, (Object) null);
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("PlayerInterrupterUIPresenter");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    public void e() {
        Observable<cBA> takeUntil = this.d.takeUntil(Observable.merge(this.b, this.f));
        final PlayerInterrupterUIPresenter$timeToShowInterrupterAfterAdBreak$1 playerInterrupterUIPresenter$timeToShowInterrupterAfterAdBreak$1 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerInterrupterUIPresenter$timeToShowInterrupterAfterAdBreak$1
            @Override // o.drM
            /* renamed from: e */
            public final Boolean invoke(cBA cba) {
                C8632dsu.c((Object) cba, "");
                return Boolean.valueOf(cba instanceof cAY.a);
            }
        };
        Observable<cBA> take = takeUntil.filter(new Predicate() { // from class: o.cEf
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean o2;
                o2 = cDY.o(drM.this, obj);
                return o2;
            }
        }).take(1L);
        C8632dsu.a(take, "");
        SubscribersKt.subscribeBy$default(take, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerInterrupterUIPresenter$timeToShowInterrupterAfterAdBreak$2
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
                        String c2 = errorType.c();
                        c1596aHd.a(c2 + " " + b);
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
        }, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerInterrupterUIPresenter$timeToShowInterrupterAfterAdBreak$3
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBA cba) {
                d(cba);
                return dpR.c;
            }

            public final void d(cBA cba) {
                cDY.e.getLogTag();
                cDY.this.d();
            }
        }, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    @Override // o.AbstractC9940zU
    public void onEvent(cBA cba) {
        C8632dsu.c((Object) cba, "");
        if (cba instanceof cBA.ae) {
            Observable take = Observable.just(dpR.c).take(1L);
            final PlayerInterrupterUIPresenter$onEvent$1 playerInterrupterUIPresenter$onEvent$1 = new drM<dpR, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerInterrupterUIPresenter$onEvent$1
                @Override // o.drM
                public /* synthetic */ dpR invoke(dpR dpr) {
                    d(dpr);
                    return dpR.c;
                }

                public final void d(dpR dpr) {
                    cDY.e.getLogTag();
                }
            };
            Observable takeUntil = take.doOnNext(new Consumer() { // from class: o.cDZ
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    cDY.l(drM.this, obj);
                }
            }).delay(120000L, TimeUnit.MILLISECONDS, AndroidSchedulers.mainThread()).takeUntil(Observable.merge(this.b, this.f));
            C8632dsu.a(takeUntil, "");
            SubscribersKt.subscribeBy(takeUntil, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerInterrupterUIPresenter$onEvent$2
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    b(th);
                    return dpR.c;
                }

                public final void b(Throwable th) {
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
                            String c2 = errorType.c();
                            c1596aHd.a(c2 + " " + b);
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
            }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerInterrupterUIPresenter$onEvent$3
                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    a();
                    return dpR.c;
                }

                public final void a() {
                    cDY.e.getLogTag();
                }
            }, new drM<dpR, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerInterrupterUIPresenter$onEvent$4
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(dpR dpr) {
                    b(dpr);
                    return dpR.c;
                }

                public final void b(dpR dpr) {
                    cDY.e.getLogTag();
                    cDY.this.a();
                }
            });
        } else if (cba instanceof cBA.M) {
            Observable take2 = Observable.just(dpR.c).take(1L);
            final drM<dpR, dpR> drm = new drM<dpR, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerInterrupterUIPresenter$onEvent$5
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(dpR dpr) {
                    d(dpr);
                    return dpR.c;
                }

                public final void d(dpR dpr) {
                    cFP cfp;
                    cDY.e.getLogTag();
                    cfp = cDY.this.h;
                    cfp.a();
                }
            };
            Observable takeUntil2 = take2.doOnNext(new Consumer() { // from class: o.cEa
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    cDY.n(drM.this, obj);
                }
            }).delay(3600000L, TimeUnit.MILLISECONDS, AndroidSchedulers.mainThread()).takeUntil(this.b);
            Observable<cBO> v = this.h.v();
            final PlayerInterrupterUIPresenter$onEvent$6 playerInterrupterUIPresenter$onEvent$6 = new drM<cBO, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerInterrupterUIPresenter$onEvent$6
                @Override // o.drM
                /* renamed from: d */
                public final Boolean invoke(cBO cbo) {
                    C8632dsu.c((Object) cbo, "");
                    return Boolean.valueOf(!C8632dsu.c(cbo, cBQ.f.a));
                }
            };
            Observable takeUntil3 = takeUntil2.takeUntil(v.filter(new Predicate() { // from class: o.cEd
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean k;
                    k = cDY.k(drM.this, obj);
                    return k;
                }
            }));
            C8632dsu.a(takeUntil3, "");
            SubscribersKt.subscribeBy$default(takeUntil3, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerInterrupterUIPresenter$onEvent$7
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    d(th);
                    return dpR.c;
                }

                public final void d(Throwable th) {
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
                        String b2 = c1596aHd.b();
                        if (b2 != null) {
                            String c2 = errorType.c();
                            c1596aHd.a(c2 + " " + b2);
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
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th2);
                    } else {
                        dVar.e().b(c1596aHd, th2);
                    }
                }
            }, (drO) null, new drM<dpR, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerInterrupterUIPresenter$onEvent$8
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(dpR dpr) {
                    a(dpr);
                    return dpR.c;
                }

                public final void a(dpR dpr) {
                    cFP cfp;
                    cDY.e.getLogTag();
                    cfp = cDY.this.h;
                    cfp.i();
                }
            }, 2, (Object) null);
        } else if (!(cba instanceof cBA.ai)) {
            if (C8632dsu.c(cba, cBA.C5558t.d)) {
                this.a = true;
            } else if (cba instanceof cAY.d) {
                this.c = true;
            } else if (cba instanceof cAY.a) {
                this.c = false;
            }
        } else {
            e.getLogTag();
            this.h.c();
            this.a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    public void a() {
        if (!this.c) {
            d();
            return;
        }
        e.getLogTag();
        e();
    }

    public void d() {
        if (this.a) {
            e.getLogTag();
            Observable<cBA> takeUntil = this.d.takeUntil(Observable.merge(this.b, this.f));
            final PlayerInterrupterUIPresenter$timeToShowInterrupterAfterBufferingCheck$2 playerInterrupterUIPresenter$timeToShowInterrupterAfterBufferingCheck$2 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerInterrupterUIPresenter$timeToShowInterrupterAfterBufferingCheck$2
                @Override // o.drM
                /* renamed from: b */
                public final Boolean invoke(cBA cba) {
                    C8632dsu.c((Object) cba, "");
                    return Boolean.valueOf(cba instanceof cBA.ai);
                }
            };
            Observable<cBA> take = takeUntil.filter(new Predicate() { // from class: o.cDX
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean m;
                    m = cDY.m(drM.this, obj);
                    return m;
                }
            }).take(1L);
            C8632dsu.a(take, "");
            SubscribersKt.subscribeBy$default(take, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerInterrupterUIPresenter$timeToShowInterrupterAfterBufferingCheck$3
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    c(th);
                    return dpR.c;
                }

                public final void c(Throwable th) {
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
                            String c2 = errorType.c();
                            c1596aHd.a(c2 + " " + b);
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
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th2);
                    } else {
                        dVar.e().b(c1596aHd, th2);
                    }
                }
            }, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerInterrupterUIPresenter$timeToShowInterrupterAfterBufferingCheck$4
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(cBA cba) {
                    b(cba);
                    return dpR.c;
                }

                public final void b(cBA cba) {
                    cFP cfp;
                    cfp = cDY.this.h;
                    cfp.g();
                }
            }, 2, (Object) null);
            return;
        }
        e.getLogTag();
        this.h.g();
    }
}
