package o;

import io.reactivex.Observable;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C8632dsu;
import o.InterfaceC5706cFi;
import o.InterfaceC5730cGf;
import o.cBA;
import o.cDI;
import o.dpR;

/* loaded from: classes4.dex */
public final class cDI implements InterfaceC5706cFi {
    private final InterfaceC5730cGf a;
    private boolean b;

    @Override // o.InterfaceC5706cFi
    public void d(boolean z) {
        this.b = z;
    }

    public boolean e() {
        return this.b;
    }

    public cDI(InterfaceC5730cGf interfaceC5730cGf, Observable<cBA> observable) {
        C8632dsu.c((Object) interfaceC5730cGf, "");
        C8632dsu.c((Object) observable, "");
        this.a = interfaceC5730cGf;
        SubscribersKt.subscribeBy$default(observable, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerBackPresenter_Ab12348$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBA cba) {
                c(cba);
                return dpR.c;
            }

            public final void c(cBA cba) {
                InterfaceC5730cGf interfaceC5730cGf2;
                InterfaceC5730cGf interfaceC5730cGf3;
                C8632dsu.c((Object) cba, "");
                if ((cba instanceof cBA.ai) || C8632dsu.c(cba, cBA.C5548j.d) || C8632dsu.c(cba, cBA.C5541c.c) || C8632dsu.c(cba, cBA.E.e)) {
                    if (cDI.this.e()) {
                        return;
                    }
                    interfaceC5730cGf2 = cDI.this.a;
                    interfaceC5730cGf2.a();
                } else if (C8632dsu.c(cba, cBA.K.a)) {
                    interfaceC5730cGf3 = cDI.this.a;
                    interfaceC5730cGf3.c();
                }
            }
        }, 3, (Object) null);
    }

    @Override // o.InterfaceC5706cFi
    public void a(Observable<cBA> observable) {
        InterfaceC5706cFi.a.b(this, observable);
    }
}
