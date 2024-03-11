package o;

import android.annotation.SuppressLint;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.player.v2.interactive.Interactivity;
import com.netflix.model.leafs.originals.interactive.PlayerControls;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Map;
import o.C1596aHd;
import o.C5686cEp;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5706cFi;
import o.InterfaceC5717cFt;
import o.cBA;
import o.cEW;
import o.cFT;
import o.dpR;
import o.dqE;

/* renamed from: o.cEp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5686cEp extends cEF implements InterfaceC5706cFi, cEW, InterfaceC5717cFt {
    private boolean a;
    private boolean b;
    private final Observable<dpR> c;
    private Interactivity d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean l;
    private final cFT m;
    private final Observable<cBA> n;

    @Override // o.cEW
    public void a(Interactivity interactivity) {
        this.d = interactivity;
    }

    @Override // o.cEF, o.cET
    public void a(boolean z) {
        this.a = z;
    }

    public boolean a() {
        return this.j;
    }

    @Override // o.cEF
    public boolean bJ_() {
        return this.a;
    }

    public boolean c() {
        return this.h;
    }

    @Override // o.InterfaceC5706cFi
    public void d(boolean z) {
        this.j = z;
    }

    public final void e(boolean z) {
        this.i = z;
    }

    @Override // o.InterfaceC5717cFt
    public void g(boolean z) {
        this.h = z;
    }

    @Override // o.InterfaceC5706cFi
    public void a(Observable<cBA> observable) {
        InterfaceC5706cFi.a.b(this, observable);
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5686cEp(o.cFT r8, io.reactivex.Observable<o.cBA> r9, io.reactivex.Observable<o.dpR> r10) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r8, r0)
            o.C8632dsu.c(r9, r0)
            o.C8632dsu.c(r10, r0)
            io.reactivex.Observable r3 = r9.takeUntil(r10)
            o.C8632dsu.a(r3, r0)
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r7.m = r8
            r7.n = r9
            r7.c = r10
            r8 = 1
            r7.b = r8
            r7.f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5686cEp.<init>(o.cFT, io.reactivex.Observable, io.reactivex.Observable):void");
    }

    @Override // o.cEF, o.cDE, o.AbstractC9940zU
    public void onEvent(cBA cba) {
        PlayerControls.Config config;
        C8632dsu.c((Object) cba, "");
        super.onEvent(cba);
        boolean z = true;
        boolean z2 = false;
        if (cba instanceof cBA.ai) {
            if (j() && !((cBA.ai) cba).i()) {
                bK_();
                this.m.e(true);
                this.m.t();
                this.m.h();
                this.m.a(true);
                this.m.f();
                if (c()) {
                    this.m.r();
                    this.m.i(false);
                    if (this.b) {
                        this.m.k();
                    }
                    if (this.f) {
                        this.m.m();
                    }
                } else {
                    this.m.i(false);
                    this.m.s();
                }
            } else if (this.m.w()) {
                this.m.e(true);
            }
            this.g = false;
        } else if (cba instanceof cBA.an) {
            g();
        } else if (cba instanceof cBA.C5544f) {
            this.m.d(true);
        } else if (C8632dsu.c(cba, cBA.C5558t.d) || (cba instanceof cBA.C5556r)) {
            this.m.o();
            g();
        } else if (cba instanceof cBA.X) {
        } else {
            if (C8632dsu.c(cba, cBA.M.e) || C8632dsu.c(cba, cBA.K.a) || C8632dsu.c(cba, cBA.E.e)) {
                if (this.l) {
                    return;
                }
                this.m.c();
            } else if (C8632dsu.c(cba, cBA.T.b)) {
                this.m.e(false);
                this.g = true;
            } else if (C8632dsu.c(cba, cBA.ao.d)) {
                this.m.e(true);
                this.g = false;
            } else if (cba instanceof cBA.C5553o) {
                if (a() || bJ_()) {
                    return;
                }
                this.m.a(false);
                this.m.h();
            } else if (cba instanceof cBA.C5546h) {
                PlayerControls playerControls = ((cBA.C5546h) cba).e().playerControls();
                if (playerControls != null && (config = playerControls.config()) != null && config.playerControlsTenSecondsControls()) {
                    z2 = true;
                }
                boolean z3 = !z2;
                this.e = z3;
                if (z3) {
                    this.m.n();
                }
            } else if (C8632dsu.c(cba, cBA.C5548j.d)) {
                if (bJ_()) {
                    return;
                }
                if (!this.e) {
                    this.m.i(true);
                    this.m.i(false);
                    this.m.a(true);
                }
                if (c()) {
                    this.m.r();
                }
                this.m.t();
                this.m.h();
                this.m.f();
                if (this.b) {
                    this.m.k();
                }
                if (this.f) {
                    this.m.m();
                }
            } else if (cba instanceof cBA.C5545g) {
                if (bJ_()) {
                    return;
                }
                boolean b = ((cBA.C5545g) cba).b();
                if (!this.m.w()) {
                    this.m.o();
                    this.m.c(!b);
                    this.m.s();
                    this.m.p();
                    c(b);
                    this.i = true;
                }
                this.m.b(b);
            } else if (cba instanceof cBA.C5549k) {
                this.m.c(!((cBA.C5549k) cba).e());
            } else if (cba instanceof cBA.B) {
                this.m.o();
                this.m.d(true);
            } else if (cba instanceof cBA.D) {
                if (!this.m.w() || bJ_() || a()) {
                    return;
                }
                this.m.t();
                this.m.a(true);
            } else if (cba instanceof cBA.az) {
                this.l = ((cBA.az) cba).c();
            } else if (cba instanceof cBA.S) {
                C7593czD b2 = ((cBA.S) cba).b();
                if (b2.c()) {
                    int b3 = b2.b();
                    this.b = b3 == 0;
                    if (!b2.e().isEmpty() && b2.e().size() - 1 != b3) {
                        z = false;
                    }
                    this.f = z;
                }
            }
        }
    }

    @SuppressLint({"CheckResult"})
    public void c(final boolean z) {
        Observable<dpR> take = this.m.j().takeUntil(this.c).take(1L);
        C8632dsu.a(take, "");
        SubscribersKt.subscribeBy$default(take, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerPrimaryControlsPresenter_Ab49548$observeForSkipAnimationEndTakingOne$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                e(th);
                return dpR.c;
            }

            public final void e(Throwable th) {
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
        }, (drO) null, new drM<dpR, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerPrimaryControlsPresenter_Ab49548$observeForSkipAnimationEndTakingOne$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(dpR dpr) {
                d(dpr);
                return dpR.c;
            }

            public final void d(dpR dpr) {
                cFT cft;
                boolean z2;
                cFT cft2;
                cFT cft3;
                cFT cft4;
                cFT cft5;
                cFT cft6;
                cft = C5686cEp.this.m;
                cft.l();
                z2 = C5686cEp.this.e;
                if (!z2) {
                    cft5 = C5686cEp.this.m;
                    cft5.i(!z);
                    cft6 = C5686cEp.this.m;
                    cft6.a(false);
                }
                cft2 = C5686cEp.this.m;
                cft2.t();
                cft3 = C5686cEp.this.m;
                cft3.e(true);
                cft4 = C5686cEp.this.m;
                cft4.h();
                C5686cEp.this.e(false);
            }
        }, 2, (Object) null);
    }

    private final void g() {
        this.m.g();
        if (this.i) {
            this.m.d(false);
        } else {
            this.m.d(true);
        }
        this.m.i();
    }

    public boolean j() {
        return (a() || n()) ? false : true;
    }
}
