package com.netflix.mediaclient.ui.mdx2;

import android.content.Intent;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.mdx2.NetflixMdxController$2$9$1;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.AbstractC7431cwA;
import o.AbstractC7475cws;
import o.AbstractC9766wb;
import o.C1596aHd;
import o.C6575cfr;
import o.C7477cwu;
import o.C8632dsu;
import o.InterfaceC1078Nw;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.dpR;
import o.dqE;
import o.drM;

/* loaded from: classes4.dex */
public final class NetflixMdxController$2$9$1 extends Lambda implements drM<ServiceManager, dpR> {
    final /* synthetic */ AbstractC9766wb.C9784r a;
    final /* synthetic */ NetflixMdxController c;
    final /* synthetic */ NetflixActivity d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetflixMdxController$2$9$1(NetflixMdxController netflixMdxController, AbstractC9766wb.C9784r c9784r, NetflixActivity netflixActivity) {
        super(1);
        this.c = netflixMdxController;
        this.a = c9784r;
        this.d = netflixActivity;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
        d(serviceManager);
        return dpR.c;
    }

    public final void d(ServiceManager serviceManager) {
        Observable<AbstractC7431cwA> e;
        ObservableSubscribeProxy observableSubscribeProxy;
        Observable<AbstractC7475cws> a;
        ObservableSubscribeProxy observableSubscribeProxy2;
        C8632dsu.c((Object) serviceManager, "");
        NetflixMdxController netflixMdxController = this.c;
        C7477cwu b = C7477cwu.e.b(((AbstractC9766wb.G) this.a).c());
        b.onManagerReady(serviceManager, InterfaceC1078Nw.aJ);
        b.setCancelable(true);
        netflixMdxController.k = b;
        Observable d = this.c.n().d(AbstractC7431cwA.class);
        final NetflixMdxController netflixMdxController2 = this.c;
        final drM<AbstractC7431cwA, dpR> drm = new drM<AbstractC7431cwA, dpR>() { // from class: com.netflix.mediaclient.ui.mdx2.NetflixMdxController$2$9$1.2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC7431cwA abstractC7431cwA) {
                a(abstractC7431cwA);
                return dpR.c;
            }

            public final void a(AbstractC7431cwA abstractC7431cwA) {
                C7477cwu c7477cwu = NetflixMdxController.this.k;
                if (c7477cwu != null) {
                    C8632dsu.d(abstractC7431cwA);
                    c7477cwu.e(abstractC7431cwA);
                }
                if ((abstractC7431cwA instanceof AbstractC7431cwA.c) || ((abstractC7431cwA instanceof AbstractC7431cwA.a) && !((AbstractC7431cwA.a) abstractC7431cwA).b())) {
                    C7477cwu c7477cwu2 = NetflixMdxController.this.k;
                    if (c7477cwu2 != null) {
                        c7477cwu2.dismiss();
                    }
                    NetflixMdxController.this.k = null;
                }
            }
        };
        Consumer consumer = new Consumer() { // from class: o.cgr
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NetflixMdxController$2$9$1.j(drM.this, obj);
            }
        };
        final AnonymousClass3 anonymousClass3 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.mdx2.NetflixMdxController$2$9$1.3
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                c(th);
                return dpR.c;
            }

            public final void c(Throwable th) {
                Map d2;
                Map k;
                Throwable th2;
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd("Error from mdx regpair pin dialog", th, null, true, k, false, false, 96, null);
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
        };
        d.subscribe(consumer, new Consumer() { // from class: o.cgp
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NetflixMdxController$2$9$1.f(drM.this, obj);
            }
        });
        C7477cwu c7477cwu = this.c.k;
        if (c7477cwu != null && (a = c7477cwu.a()) != null && (observableSubscribeProxy2 = (ObservableSubscribeProxy) a.as(AutoDispose.b(AndroidLifecycleScopeProvider.d(this.d.getLifecycle())))) != null) {
            final NetflixActivity netflixActivity = this.d;
            final AbstractC9766wb.C9784r c9784r = this.a;
            final drM<AbstractC7475cws, dpR> drm2 = new drM<AbstractC7475cws, dpR>() { // from class: com.netflix.mediaclient.ui.mdx2.NetflixMdxController$2$9$1.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(AbstractC7475cws abstractC7475cws) {
                    a(abstractC7475cws);
                    return dpR.c;
                }

                public final void a(AbstractC7475cws abstractC7475cws) {
                    if (abstractC7475cws instanceof AbstractC7475cws.e) {
                        Intent a2 = C6575cfr.a(NetflixActivity.this, "com.netflix.mediaclient.intent.action.MDX_ACTION_REGPAIR_PIN_CONFIRMATION", ((AbstractC9766wb.G) c9784r).d());
                        a2.putExtra("regPairPin", ((AbstractC7475cws.e) abstractC7475cws).b());
                        a2.putExtra("isRegPairPinSubmitted", true);
                        NetflixActivity.this.sendIntentToNetflixService(a2);
                    }
                }
            };
            Consumer consumer2 = new Consumer() { // from class: o.cgn
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    NetflixMdxController$2$9$1.i(drM.this, obj);
                }
            };
            final AnonymousClass5 anonymousClass5 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.mdx2.NetflixMdxController$2$9$1.5
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    a(th);
                    return dpR.c;
                }

                public final void a(Throwable th) {
                    Map d2;
                    Map k;
                    Throwable th2;
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d2 = dqE.d();
                    k = dqE.k(d2);
                    C1596aHd c1596aHd = new C1596aHd("Error from mdx regpair pin dialog", th, null, true, k, false, false, 96, null);
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
                    InterfaceC1598aHf a2 = dVar.a();
                    if (a2 != null) {
                        a2.e(c1596aHd, th2);
                    } else {
                        dVar.e().b(c1596aHd, th2);
                    }
                }
            };
            observableSubscribeProxy2.b(consumer2, new Consumer() { // from class: o.cgo
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    NetflixMdxController$2$9$1.g(drM.this, obj);
                }
            });
        }
        C7477cwu c7477cwu2 = this.c.k;
        if (c7477cwu2 != null && (e = c7477cwu2.e()) != null && (observableSubscribeProxy = (ObservableSubscribeProxy) e.as(AutoDispose.b(AndroidLifecycleScopeProvider.d(this.d.getLifecycle())))) != null) {
            final NetflixActivity netflixActivity2 = this.d;
            final AbstractC9766wb.C9784r c9784r2 = this.a;
            final NetflixMdxController netflixMdxController3 = this.c;
            final drM<AbstractC7431cwA, dpR> drm3 = new drM<AbstractC7431cwA, dpR>() { // from class: com.netflix.mediaclient.ui.mdx2.NetflixMdxController$2$9$1.6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(AbstractC7431cwA abstractC7431cwA) {
                    b(abstractC7431cwA);
                    return dpR.c;
                }

                public final void b(AbstractC7431cwA abstractC7431cwA) {
                    if (abstractC7431cwA instanceof AbstractC7431cwA.b) {
                        Intent a2 = C6575cfr.a(NetflixActivity.this, "com.netflix.mediaclient.intent.action.MDX_ACTION_REGPAIR_PIN_CONFIRMATION", ((AbstractC9766wb.G) c9784r2).d());
                        a2.putExtra("isRegPairPinSubmitted", false);
                        NetflixActivity.this.sendIntentToNetflixService(a2);
                        NetflixActivity.this.setConnectingToTarget(false);
                        C7477cwu c7477cwu3 = netflixMdxController3.k;
                        if (c7477cwu3 != null) {
                            c7477cwu3.dismiss();
                        }
                        netflixMdxController3.k = null;
                    }
                }
            };
            Consumer consumer3 = new Consumer() { // from class: o.cgq
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    NetflixMdxController$2$9$1.m(drM.this, obj);
                }
            };
            final AnonymousClass7 anonymousClass7 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.mdx2.NetflixMdxController$2$9$1.7
                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    c(th);
                    return dpR.c;
                }

                public final void c(Throwable th) {
                    Map d2;
                    Map k;
                    Throwable th2;
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d2 = dqE.d();
                    k = dqE.k(d2);
                    C1596aHd c1596aHd = new C1596aHd("Error from mdx regpair pin dialog", th, null, true, k, false, false, 96, null);
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
            };
            observableSubscribeProxy.b(consumer3, new Consumer() { // from class: o.cgu
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    NetflixMdxController$2$9$1.l(drM.this, obj);
                }
            });
        }
        C7477cwu c7477cwu3 = this.c.k;
        if (c7477cwu3 != null) {
            c7477cwu3.show(this.d.getSupportFragmentManager(), NetflixActivity.FRAG_DIALOG_TAG);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }
}
