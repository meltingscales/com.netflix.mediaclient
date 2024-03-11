package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Map;
import o.C1596aHd;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC9680uv;
import o.cBA;
import o.dpR;
import o.dqE;

/* renamed from: o.cEl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5682cEl {
    public C5682cEl(final InterfaceC9680uv interfaceC9680uv, Observable<cBA> observable) {
        C8632dsu.c((Object) interfaceC9680uv, "");
        C8632dsu.c((Object) observable, "");
        interfaceC9680uv.a();
        interfaceC9680uv.h();
        SubscribersKt.subscribeBy$default(observable, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerLoadingSpinnerPresenter$1
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
        }, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerLoadingSpinnerPresenter$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBA cba) {
                d(cba);
                return dpR.c;
            }

            public final void d(cBA cba) {
                C8632dsu.c((Object) cba, "");
                if ((cba instanceof cBA.ai) || (cba instanceof cBA.D)) {
                    InterfaceC9680uv.this.c();
                    InterfaceC9680uv.this.i();
                } else if (C8632dsu.c(cba, cBA.C5558t.d) || (cba instanceof cBA.C5556r) || (cba instanceof cBA.B)) {
                    InterfaceC9680uv.this.a();
                }
            }
        }, 2, (Object) null);
    }
}
