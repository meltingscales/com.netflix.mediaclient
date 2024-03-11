package o;

import io.reactivex.Observable;
import o.InterfaceC5706cFi;
import o.InterfaceC5726cGb;
import o.cBA;
import o.cER;

/* loaded from: classes4.dex */
public final class cEA extends cDE implements InterfaceC5706cFi, cER {
    private final InterfaceC5726cGb b;
    private boolean c;
    private boolean d;

    public boolean a() {
        return this.c;
    }

    @Override // o.InterfaceC5706cFi
    public void d(boolean z) {
        this.d = z;
    }

    @Override // o.cER
    public void e(boolean z) {
        this.c = z;
    }

    public boolean e() {
        return this.d;
    }

    @Override // o.InterfaceC5706cFi
    public void a(Observable<cBA> observable) {
        InterfaceC5706cFi.a.b(this, observable);
    }

    @Override // o.cER
    public void d(Observable<cBA> observable) {
        cER.a.c(this, observable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cEA(InterfaceC5726cGb interfaceC5726cGb, Observable<cBA> observable) {
        super(observable, new InterfaceC5730cGf[]{interfaceC5726cGb}, null, 4, null);
        C8632dsu.c((Object) interfaceC5726cGb, "");
        C8632dsu.c((Object) observable, "");
        this.b = interfaceC5726cGb;
    }

    private final boolean c() {
        return !C8054ddD.j() && e();
    }

    @Override // o.cDE, o.AbstractC9940zU
    public void onEvent(cBA cba) {
        C8632dsu.c((Object) cba, "");
        if (cba instanceof cBA.ai) {
            if (c() || a()) {
                return;
            }
            this.b.a();
        } else if (C8632dsu.c(cba, cBA.ao.d) || (cba instanceof cBA.ap)) {
            if (c() || a()) {
                return;
            }
            this.b.a();
        } else if (cba instanceof cBA.C5556r) {
            this.b.c();
        } else if (C8632dsu.c(cba, cBA.E.e) || C8632dsu.c(cba, cBA.C5541c.c)) {
            if (c() || a()) {
                return;
            }
            this.b.f();
        } else if (C8632dsu.c(cba, cBA.K.a)) {
            if (C8054ddD.j()) {
                return;
            }
            this.b.c();
        } else if (C8632dsu.c(cba, cBA.C5561w.a)) {
            this.b.c();
        } else if (C8632dsu.c(cba, cBA.C5564z.e)) {
            if (a() || C8054ddD.j()) {
                return;
            }
            this.b.a();
        } else if (C8632dsu.c(cba, cBA.D.e)) {
            if (c()) {
                return;
            }
            this.b.a();
        } else if (cba instanceof cBA.ar) {
            cBA.ar arVar = (cBA.ar) cba;
            this.b.e(arVar.e(), arVar.d(), arVar.a(), arVar.b());
        } else if (cba instanceof cBA.C5553o) {
            InterfaceC5726cGb.a.e(this.b, 0, 0, 0, 0, 15, null);
        }
    }
}
