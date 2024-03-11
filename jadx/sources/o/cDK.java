package o;

import android.annotation.SuppressLint;
import com.netflix.mediaclient.ui.player.v2.interactive.Interactivity;
import io.reactivex.Observable;
import o.InterfaceC5701cFd;
import o.InterfaceC5703cFf;
import o.InterfaceC5704cFg;
import o.InterfaceC5706cFi;
import o.InterfaceC5717cFt;
import o.cBA;
import o.cET;
import o.cEW;
import o.cEX;

/* loaded from: classes4.dex */
public class cDK extends cDE implements InterfaceC5706cFi, cET, cEW, cEX, InterfaceC5701cFd, InterfaceC5704cFg, InterfaceC5703cFf, InterfaceC5717cFt {
    private Interactivity a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private final C5734cGj n;

    @Override // o.cEW
    public void a(Interactivity interactivity) {
        this.a = interactivity;
    }

    @Override // o.cET
    public void a(boolean z) {
        this.e = z;
    }

    public boolean a() {
        return this.j;
    }

    @Override // o.cEX
    public void b(boolean z) {
        this.c = z;
    }

    public boolean b() {
        return this.e;
    }

    @Override // o.InterfaceC5703cFf
    public void c(boolean z) {
        this.g = z;
    }

    public boolean c() {
        return this.c;
    }

    @Override // o.InterfaceC5706cFi
    public void d(boolean z) {
        this.i = z;
    }

    public boolean d() {
        return this.i;
    }

    public Interactivity e() {
        return this.a;
    }

    @Override // o.InterfaceC5704cFg
    public void e(boolean z) {
        this.j = z;
    }

    public boolean f() {
        return this.g;
    }

    @Override // o.InterfaceC5717cFt
    public void g(boolean z) {
        this.k = z;
    }

    public boolean g() {
        return this.h;
    }

    @Override // o.InterfaceC5701cFd
    public void j(boolean z) {
        this.h = z;
    }

    public boolean j() {
        return this.k;
    }

    @Override // o.InterfaceC5706cFi
    public void a(Observable<cBA> observable) {
        InterfaceC5706cFi.a.b(this, observable);
    }

    @Override // o.cET
    public void a_(Observable<cBA> observable) {
        cET.c.e(this, observable);
    }

    @Override // o.InterfaceC5701cFd
    public void b(Observable<cBA> observable) {
        InterfaceC5701cFd.d.c(this, observable);
    }

    @Override // o.cEX
    public void d(Observable<cBA> observable) {
        cEX.b.b(this, observable);
    }

    @Override // o.cEW
    public void e(Observable<cBA> observable) {
        cEW.d.a(this, observable);
    }

    @Override // o.InterfaceC5717cFt
    @SuppressLint({"CheckResult"})
    public void f(Observable<cBA> observable) {
        InterfaceC5717cFt.b.b(this, observable);
    }

    @Override // o.InterfaceC5703cFf
    @SuppressLint({"CheckResult"})
    public void g(Observable<cBA> observable) {
        InterfaceC5703cFf.b.c(this, observable);
    }

    @Override // o.InterfaceC5704cFg
    public void i(Observable<cBA> observable) {
        InterfaceC5704cFg.c.a(this, observable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cDK(o.C5734cGj r8, io.reactivex.Observable<o.cBA> r9, io.reactivex.Observable<o.dpR> r10) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r8, r0)
            o.C8632dsu.c(r9, r0)
            o.C8632dsu.c(r10, r0)
            io.reactivex.Observable r2 = r9.takeUntil(r10)
            o.C8632dsu.a(r2, r0)
            r9 = 1
            o.cGf[] r3 = new o.InterfaceC5730cGf[r9]
            r9 = 0
            r3[r9] = r8
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.n = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cDK.<init>(o.cGj, io.reactivex.Observable, io.reactivex.Observable):void");
    }

    @Override // o.cDE, o.AbstractC9940zU
    public void onEvent(cBA cba) {
        C8632dsu.c((Object) cba, "");
        if (cba instanceof cBA.ai) {
            this.b = true;
            a(false);
            this.n.d();
            cBA.ai aiVar = (cBA.ai) cba;
            this.n.e(aiVar.e());
            if (i()) {
                if (this.n.w() || aiVar.i()) {
                    return;
                }
                this.n.a();
                return;
            }
            this.n.q();
        } else if ((cba instanceof cBA.an) || C8632dsu.c(cba, cBA.C5558t.d) || (cba instanceof cBA.C5556r)) {
            this.n.b();
        } else if (C8632dsu.c(cba, cBA.M.e) || C8632dsu.c(cba, cBA.K.a) || C8632dsu.c(cba, cBA.aA.a) || C8632dsu.c(cba, cBA.E.e)) {
            this.n.c();
        } else if (cba instanceof cBA.C5548j) {
            if (i()) {
                this.n.a();
            } else {
                this.n.c();
            }
        } else if (C8632dsu.c(cba, cBA.F.a)) {
            this.n.q();
        } else if (cba instanceof cBA.ag) {
            cBA.ag agVar = (cBA.ag) cba;
            this.f = agVar.c();
            if (agVar.c()) {
                this.n.q();
            } else if (i()) {
                this.n.a();
            }
        } else if (C8632dsu.c(cba, cBA.C5541c.c)) {
            this.n.c();
        } else if (cba instanceof cBA.am) {
            if (!this.n.w() || i()) {
                return;
            }
            this.n.c();
        } else if (cba instanceof cBA.C5549k) {
            this.d = ((cBA.C5549k) cba).a();
            this.n.i();
            if (this.n.w() && !i()) {
                this.n.c();
            } else if (this.b && !this.n.w() && i()) {
                this.n.a();
            }
        } else if (cba instanceof cBA.C5543e) {
            this.n.i();
        } else if (cba instanceof cBA.C5554p) {
            this.n.e(((cBA.C5554p) cba).e());
        }
    }

    public boolean i() {
        if (b() || d() || f() || a() || this.f || e() == Interactivity.e || c() || g() || j()) {
            return false;
        }
        return !C8171dfO.b() || this.d;
    }
}
