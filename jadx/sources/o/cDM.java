package o;

import com.netflix.mediaclient.ui.player.v2.interactive.Interactivity;
import io.reactivex.Observable;
import o.InterfaceC5706cFi;
import o.cBA;
import o.cEW;

/* loaded from: classes4.dex */
public class cDM extends cEF implements InterfaceC5706cFi, cEW {
    private Interactivity a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private final InterfaceC5730cGf f;

    @Override // o.cEW
    public void a(Interactivity interactivity) {
        this.a = interactivity;
    }

    public boolean a() {
        return this.b;
    }

    @Override // o.InterfaceC5706cFi
    public void d(boolean z) {
        this.b = z;
    }

    public Interactivity e() {
        return this.a;
    }

    @Override // o.InterfaceC5706cFi
    public void a(Observable<cBA> observable) {
        InterfaceC5706cFi.a.b(this, observable);
    }

    @Override // o.cEW
    public void e(Observable<cBA> observable) {
        cEW.d.a(this, observable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cDM(InterfaceC5730cGf interfaceC5730cGf, Observable<cBA> observable) {
        super(interfaceC5730cGf, observable, null, 4, null);
        C8632dsu.c((Object) interfaceC5730cGf, "");
        C8632dsu.c((Object) observable, "");
        this.f = interfaceC5730cGf;
    }

    @Override // o.cEF, o.cDE, o.AbstractC9940zU
    public void onEvent(cBA cba) {
        C8632dsu.c((Object) cba, "");
        super.onEvent(cba);
        if (cba instanceof cBA.ai) {
            if (e() == null) {
                this.f.d();
                if (!c() || ((cBA.ai) cba).i()) {
                    return;
                }
                bK_();
            }
        } else if ((cba instanceof cBA.an) || C8632dsu.c(cba, cBA.C5558t.d) || (cba instanceof cBA.C5556r)) {
            this.f.b();
        } else if (C8632dsu.c(cba, cBA.M.e) || C8632dsu.c(cba, cBA.K.a) || C8632dsu.c(cba, cBA.E.e)) {
            if (this.e) {
                return;
            }
            d();
        } else if (cba instanceof cBA.U) {
            this.d = ((cBA.U) cba).a();
            if (!this.c || e() == Interactivity.e) {
                return;
            }
            bK_();
        } else if (cba instanceof cBA.az) {
            this.e = ((cBA.az) cba).c();
        }
    }

    public boolean c() {
        return (!this.d || this.f.w() || a() || n()) ? false : true;
    }

    @Override // o.cEF
    public void bK_() {
        this.c = true;
        if (!this.d || e() == Interactivity.e) {
            return;
        }
        super.bK_();
    }

    @Override // o.cEF
    public void d() {
        this.c = false;
        super.d();
    }
}
