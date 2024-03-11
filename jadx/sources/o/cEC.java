package o;

import com.netflix.mediaclient.servicemgr.interface_.details.LiveState;
import io.reactivex.Observable;
import o.AbstractC5595cBf;
import o.InterfaceC5706cFi;
import o.cBA;
import o.cIE;

/* loaded from: classes4.dex */
public class cEC extends cEF implements InterfaceC5706cFi {
    private boolean b;
    private final cFY d;
    private boolean e;

    public boolean a() {
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
    public cEC(cFY cfy, Observable<cBA> observable) {
        super(cfy, observable, null, 4, null);
        C8632dsu.c((Object) cfy, "");
        C8632dsu.c((Object) observable, "");
        this.d = cfy;
    }

    @Override // o.cEF, o.cDE, o.AbstractC9940zU
    public void onEvent(cBA cba) {
        C8632dsu.c((Object) cba, "");
        super.onEvent(cba);
        if (cba instanceof cBA.C5556r) {
            if (((cBA.C5556r) cba).c().c == LiveState.d) {
                this.b = true;
                this.d.b(C8168dfL.d(cIE.a.B));
                return;
            }
            return;
        }
        if (cba instanceof cBA.ai) {
            cBA.ai aiVar = (cBA.ai) cba;
            C7535cxz b = aiVar.b();
            if ((b != null ? b.c : null) == LiveState.d) {
                this.d.b(C8168dfL.d(cIE.a.B));
                this.b = true;
                if (aiVar.i() || !c()) {
                    return;
                }
                this.d.a();
            }
        } else if ((cba instanceof AbstractC5595cBf.a) || (cba instanceof AbstractC5595cBf.e) || (cba instanceof AbstractC5595cBf.c) || (cba instanceof AbstractC5595cBf.d) || (cba instanceof AbstractC5595cBf.b)) {
            this.d.b((String) null);
        } else if (C8632dsu.c(cba, cBA.M.e) || C8632dsu.c(cba, cBA.K.a) || C8632dsu.c(cba, cBA.E.e)) {
            this.d.c();
        }
    }

    public boolean c() {
        return (this.d.w() || a() || n() || !this.b) ? false : true;
    }

    @Override // o.cEF
    public void bK_() {
        if (c()) {
            super.bK_();
        }
    }
}
