package o;

import io.reactivex.Observable;
import o.InterfaceC5706cFi;
import o.cBA;

/* loaded from: classes4.dex */
public class cEB extends cEF implements InterfaceC5706cFi {
    private boolean b;
    private boolean c;
    private final InterfaceC5727cGc d;

    public boolean c() {
        return this.c;
    }

    @Override // o.InterfaceC5706cFi
    public void d(boolean z) {
        this.c = z;
    }

    @Override // o.InterfaceC5706cFi
    public void a(Observable<cBA> observable) {
        InterfaceC5706cFi.a.b(this, observable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cEB(InterfaceC5727cGc interfaceC5727cGc, Observable<cBA> observable) {
        super(interfaceC5727cGc, observable, null, 4, null);
        C8632dsu.c((Object) interfaceC5727cGc, "");
        C8632dsu.c((Object) observable, "");
        this.d = interfaceC5727cGc;
    }

    @Override // o.cEF, o.cDE, o.AbstractC9940zU
    public void onEvent(cBA cba) {
        C8632dsu.c((Object) cba, "");
        super.onEvent(cba);
        if (cba instanceof cBA.C5556r) {
            this.d.e(cBN.a.d(((cBA.C5556r) cba).c().h()));
        } else if (cba instanceof cBA.ai) {
            InterfaceC5727cGc interfaceC5727cGc = this.d;
            cBN cbn = cBN.a;
            cBA.ai aiVar = (cBA.ai) cba;
            C7535cxz b = aiVar.b();
            interfaceC5727cGc.e(cbn.d(b != null ? b.h() : null));
            if (aiVar.i() || !a()) {
                return;
            }
            bK_();
        } else if (C8632dsu.c(cba, cBA.M.e) || C8632dsu.c(cba, cBA.K.a) || C8632dsu.c(cba, cBA.E.e)) {
            if (this.b) {
                return;
            }
            this.d.c();
        } else if (cba instanceof cBA.az) {
            this.b = ((cBA.az) cba).c();
        }
    }

    public boolean a() {
        return (this.d.w() || c() || n()) ? false : true;
    }
}
