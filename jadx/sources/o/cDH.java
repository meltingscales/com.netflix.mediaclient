package o;

import io.reactivex.Observable;
import o.InterfaceC5706cFi;
import o.cBA;

/* loaded from: classes4.dex */
public class cDH extends cEF implements InterfaceC5706cFi {
    private boolean c;
    private final C5733cGi d;
    private boolean e;

    public boolean b() {
        return this.e;
    }

    @Override // o.InterfaceC5706cFi
    public void d(boolean z) {
        this.e = z;
    }

    @Override // o.InterfaceC5706cFi
    public void a(Observable<cBA> observable) {
        InterfaceC5706cFi.a.b(this, observable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cDH(C5733cGi c5733cGi, Observable<cBA> observable) {
        super(c5733cGi, observable, null, 4, null);
        C8632dsu.c((Object) c5733cGi, "");
        C8632dsu.c((Object) observable, "");
        this.d = c5733cGi;
    }

    @Override // o.cEF, o.cDE, o.AbstractC9940zU
    public void onEvent(cBA cba) {
        C8632dsu.c((Object) cba, "");
        super.onEvent(cba);
        if (cba instanceof cBA.ai) {
            if (!e() || ((cBA.ai) cba).i()) {
                return;
            }
            bK_();
        } else if (C8632dsu.c(cba, cBA.M.e) || C8632dsu.c(cba, cBA.K.a) || C8632dsu.c(cba, cBA.E.e)) {
            if (this.c) {
                return;
            }
            this.d.c();
        } else if (cba instanceof cBA.az) {
            this.c = ((cBA.az) cba).c();
        }
    }

    public boolean e() {
        return (this.d.w() || b() || n()) ? false : true;
    }
}
