package o;

import io.reactivex.Observable;
import o.InterfaceC5706cFi;
import o.cBA;

/* loaded from: classes4.dex */
public final class cDS extends cEF implements InterfaceC5706cFi {
    private boolean a;
    private final cFM c;

    public boolean a() {
        return this.a;
    }

    @Override // o.InterfaceC5706cFi
    public void d(boolean z) {
        this.a = z;
    }

    @Override // o.InterfaceC5706cFi
    public void a(Observable<cBA> observable) {
        InterfaceC5706cFi.a.b(this, observable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cDS(cFM cfm, Observable<cBA> observable) {
        super(cfm, observable, null, 4, null);
        C8632dsu.c((Object) cfm, "");
        C8632dsu.c((Object) observable, "");
        this.c = cfm;
    }

    @Override // o.cEF, o.cDE, o.AbstractC9940zU
    public void onEvent(cBA cba) {
        C8632dsu.c((Object) cba, "");
        super.onEvent(cba);
        if (cba instanceof cBA.ai) {
            if (a() || ((cBA.ai) cba).i()) {
                return;
            }
            bK_();
        } else if (C8632dsu.c(cba, cBA.C5564z.e)) {
            this.c.c();
        } else if (C8632dsu.c(cba, cBA.M.e) || C8632dsu.c(cba, cBA.K.a) || C8632dsu.c(cba, cBA.E.e)) {
            this.c.c();
        }
    }
}
