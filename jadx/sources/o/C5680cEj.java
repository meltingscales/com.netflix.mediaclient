package o;

import android.annotation.SuppressLint;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.player.v2.interactive.Interactivity;
import com.netflix.model.leafs.originals.interactive.PlayerControls;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Map;
import o.C1596aHd;
import o.C5680cEj;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5703cFf;
import o.InterfaceC5706cFi;
import o.cBA;
import o.cEW;
import o.cFO;
import o.dpR;
import o.dqE;

/* renamed from: o.cEj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5680cEj extends cEF implements InterfaceC5706cFi, cEW, InterfaceC5703cFf {
    private boolean a;
    private Interactivity b;
    private boolean c;
    private boolean d;
    private final Observable<dpR> e;
    private boolean f;
    private boolean g;
    private final Observable<cBA> h;
    private boolean i;
    private boolean j;

    /* renamed from: o  reason: collision with root package name */
    private final cFO f13656o;

    @Override // o.cEW
    public void a(Interactivity interactivity) {
        this.b = interactivity;
    }

    @Override // o.cEF, o.cET
    public void a(boolean z) {
        this.a = z;
    }

    public boolean a() {
        return this.i;
    }

    @Override // o.cEF
    public boolean bJ_() {
        return this.a;
    }

    @Override // o.InterfaceC5703cFf
    public void c(boolean z) {
        this.i = z;
    }

    public boolean c() {
        return this.d;
    }

    @Override // o.InterfaceC5706cFi
    public void d(boolean z) {
        this.d = z;
    }

    public final void i(boolean z) {
        this.j = z;
    }

    @Override // o.InterfaceC5706cFi
    public void a(Observable<cBA> observable) {
        InterfaceC5706cFi.a.b(this, observable);
    }

    @Override // o.cEW
    public void e(Observable<cBA> observable) {
        cEW.d.a(this, observable);
    }

    @Override // o.InterfaceC5703cFf
    @SuppressLint({"CheckResult"})
    public void g(Observable<cBA> observable) {
        InterfaceC5703cFf.b.c(this, observable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5680cEj(o.cFO r8, io.reactivex.Observable<o.cBA> r9, io.reactivex.Observable<o.dpR> r10) {
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
            r7.f13656o = r8
            r7.h = r9
            r7.e = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5680cEj.<init>(o.cFO, io.reactivex.Observable, io.reactivex.Observable):void");
    }

    @Override // o.cEF, o.cDE, o.AbstractC9940zU
    public void onEvent(cBA cba) {
        PlayerControls.Config config;
        C8632dsu.c((Object) cba, "");
        super.onEvent(cba);
        boolean z = false;
        if (cba instanceof cBA.ai) {
            if (j() && !((cBA.ai) cba).i()) {
                bK_();
                this.f13656o.e(true);
                this.f13656o.o();
                this.f13656o.g();
                this.f13656o.d(true);
            } else if (a()) {
                d();
            } else if (this.f13656o.w()) {
                this.f13656o.e(true);
            }
            this.g = false;
        } else if (cba instanceof cBA.an) {
            i();
        } else if (cba instanceof cBA.Y) {
            d();
        } else if (cba instanceof cBA.C5537aa) {
            if (j()) {
                bK_();
            }
        } else if (cba instanceof cBA.C5544f) {
            this.f13656o.a(true);
        } else if (C8632dsu.c(cba, cBA.C5558t.d) || (cba instanceof cBA.C5556r)) {
            this.f13656o.j();
            i();
        } else if (cba instanceof cBA.X) {
        } else {
            if (C8632dsu.c(cba, cBA.M.e) || C8632dsu.c(cba, cBA.K.a) || C8632dsu.c(cba, cBA.E.e)) {
                if (this.f) {
                    return;
                }
                this.f13656o.c();
            } else if (C8632dsu.c(cba, cBA.T.b)) {
                this.f13656o.e(false);
                this.g = true;
            } else if (C8632dsu.c(cba, cBA.ao.d)) {
                this.f13656o.e(true);
                this.g = false;
            } else if (cba instanceof cBA.C5553o) {
                if (c() || bJ_()) {
                    return;
                }
                this.f13656o.d(false);
                this.f13656o.g();
            } else if (cba instanceof cBA.C5546h) {
                PlayerControls playerControls = ((cBA.C5546h) cba).e().playerControls();
                if (playerControls != null && (config = playerControls.config()) != null && config.playerControlsTenSecondsControls()) {
                    z = true;
                }
                boolean z2 = !z;
                this.c = z2;
                if (z2) {
                    this.f13656o.n();
                }
            } else if (C8632dsu.c(cba, cBA.C5548j.d)) {
                if (bJ_()) {
                    return;
                }
                if (!this.c) {
                    this.f13656o.j(true);
                    this.f13656o.j(false);
                    this.f13656o.d(true);
                }
                this.f13656o.o();
                this.f13656o.g();
            } else if (cba instanceof cBA.C5545g) {
                if (bJ_()) {
                    return;
                }
                boolean b = ((cBA.C5545g) cba).b();
                if (!this.f13656o.w()) {
                    this.f13656o.j();
                    this.f13656o.b(!b);
                    this.f13656o.l();
                    e(b);
                    this.j = true;
                }
                this.f13656o.c(b);
            } else if (cba instanceof cBA.C5543e) {
                this.f13656o.k();
            } else if (cba instanceof cBA.C5549k) {
                this.f13656o.k();
                this.f13656o.a(!((cBA.C5549k) cba).e());
            } else if (cba instanceof cBA.B) {
                this.f13656o.j();
                this.f13656o.a(true);
            } else if (cba instanceof cBA.D) {
                if (!this.f13656o.w() || bJ_() || c()) {
                    return;
                }
                this.f13656o.o();
                this.f13656o.d(true);
            } else if (cba instanceof cBA.az) {
                this.f = ((cBA.az) cba).c();
            }
        }
    }

    public void e(final boolean z) {
        Observable<dpR> take = this.f13656o.i().takeUntil(this.e).take(1L);
        C8632dsu.a(take, "");
        SubscribersKt.subscribeBy$default(take, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerPrimaryControlsPresenter$observeForSkipAnimationEndTakingOne$1
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
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b);
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
        }, (drO) null, new drM<dpR, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerPrimaryControlsPresenter$observeForSkipAnimationEndTakingOne$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(dpR dpr) {
                e(dpr);
                return dpR.c;
            }

            public final void e(dpR dpr) {
                cFO cfo;
                boolean z2;
                cFO cfo2;
                cFO cfo3;
                cFO cfo4;
                cFO cfo5;
                cFO cfo6;
                cfo = C5680cEj.this.f13656o;
                cfo.f();
                z2 = C5680cEj.this.c;
                if (!z2) {
                    cfo5 = C5680cEj.this.f13656o;
                    cfo5.j(!z);
                    cfo6 = C5680cEj.this.f13656o;
                    cfo6.d(false);
                }
                cfo2 = C5680cEj.this.f13656o;
                cfo2.o();
                cfo3 = C5680cEj.this.f13656o;
                cfo3.e(true);
                cfo4 = C5680cEj.this.f13656o;
                cfo4.g();
                C5680cEj.this.i(false);
            }
        }, 2, (Object) null);
    }

    private final void i() {
        this.f13656o.h();
        if (this.j) {
            this.f13656o.a(false);
        } else {
            this.f13656o.a(true);
        }
    }

    public boolean j() {
        return (c() || n() || a()) ? false : true;
    }
}
