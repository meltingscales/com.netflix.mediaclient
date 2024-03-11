package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.player.v2.interactive.MomentState;
import com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerInteractiveChoicePointAwarePresenter$initializeInteractiveChoicePointAwarePresenter$1;
import com.netflix.model.leafs.originals.interactive.Moment;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Map;
import o.C1596aHd;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.cBA;
import o.cEX;
import o.dpR;
import o.dqE;

/* loaded from: classes4.dex */
public interface cEX {
    void b(boolean z);

    void d(Observable<cBA> observable);

    /* loaded from: classes4.dex */
    public static final class b {
        public static void b(final cEX cex, Observable<cBA> observable) {
            C8632dsu.c((Object) observable, "");
            final PlayerInteractiveChoicePointAwarePresenter$initializeInteractiveChoicePointAwarePresenter$1 playerInteractiveChoicePointAwarePresenter$initializeInteractiveChoicePointAwarePresenter$1 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerInteractiveChoicePointAwarePresenter$initializeInteractiveChoicePointAwarePresenter$1
                @Override // o.drM
                /* renamed from: a */
                public final Boolean invoke(cBA cba) {
                    C8632dsu.c((Object) cba, "");
                    return Boolean.valueOf((cba instanceof cBA.C5547i) || (cba instanceof cBA.C5553o) || (cba instanceof cBA.C5556r));
                }
            };
            Observable<cBA> filter = observable.filter(new Predicate() { // from class: o.cEZ
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    boolean e;
                    e = cEX.b.e(drM.this, obj);
                    return e;
                }
            });
            C8632dsu.a(filter, "");
            SubscribersKt.subscribeBy$default(filter, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerInteractiveChoicePointAwarePresenter$initializeInteractiveChoicePointAwarePresenter$2
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
                    C1596aHd c1596aHd = new C1596aHd("onError for initializeChoicePointAwarePresenter", null, null, true, k, false, false, 96, null);
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
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th2);
                    } else {
                        dVar.e().b(c1596aHd, th2);
                    }
                }
            }, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.mixins.PlayerInteractiveChoicePointAwarePresenter$initializeInteractiveChoicePointAwarePresenter$3
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(cBA cba) {
                    d(cba);
                    return dpR.c;
                }

                public final void d(cBA cba) {
                    boolean z = false;
                    if (cba instanceof cBA.C5547i) {
                        cBA.C5547i c5547i = (cBA.C5547i) cba;
                        if (C8632dsu.c((Object) c5547i.a().type(), (Object) Moment.TYPE.SCENE)) {
                            cEX cex2 = cEX.this;
                            if (c5547i.b() != MomentState.b && c5547i.b() != MomentState.e) {
                                z = true;
                            }
                            cex2.b(z);
                        }
                    } else if ((cba instanceof cBA.C5553o) || (cba instanceof cBA.C5556r)) {
                        cEX.this.b(false);
                    }
                }
            }, 2, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean e(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            C8632dsu.c(obj, "");
            return ((Boolean) drm.invoke(obj)).booleanValue();
        }
    }
}
