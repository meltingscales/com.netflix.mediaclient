package o;

import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.WindowInsetsCompat;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_TabletopModeDisable;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.Subject;
import java.util.Map;
import o.AbstractC5590cBa;
import o.C1596aHd;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.aQJ;
import o.cBA;
import o.cBI;
import o.dpR;
import o.dqE;

/* loaded from: classes4.dex */
public final class cBI extends AbstractC5590cBa {
    private final C5770cHs A;
    private final C5766cHo B;
    private final C5760cHi C;
    private final cHB D;
    private final ConstraintLayout G;
    private final Observable<AbstractC5594cBe> H;
    private final Observable<cBA> I;
    private final C5752cHa a;
    private final C5733cGi b;
    private final C5738cGn c;
    private final C5737cGm d;
    private C5734cGj e;
    private final C5781cIc f;
    private final C5641cCy g;
    private final C5744cGt h;
    private final C5783cIe i;
    private final C5745cGu j;
    private final C5747cGw k;
    private final C5785cIg l;
    private final C5748cGx m;
    private final C5791cIm n;

    /* renamed from: o  reason: collision with root package name */
    private final C5750cGz f13647o;
    private final cGR p;
    private final cGD q;
    private cGB r;
    private final AbstractC5765cHn s;
    private final InterfaceC9680uv t;
    private final C5758cHg u;
    private final C5759cHh v;
    private final cGK w;
    private final cGW x;
    private final C5753cHb y;
    private final C5763cHl z;

    public cBI(cBK cbk, Observable<dpR> observable, Observable<cBA> observable2, Observable<AbstractC5594cBe> observable3) {
        C8632dsu.c((Object) cbk, "");
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) observable2, "");
        C8632dsu.c((Object) observable3, "");
        this.I = observable2;
        this.H = observable3;
        C5770cHs c5770cHs = new C5770cHs(cbk.e());
        this.A = c5770cHs;
        C5748cGx c5748cGx = new C5748cGx(cbk.c());
        this.m = c5748cGx;
        ConstraintLayout d = cbk.d();
        this.G = d;
        C5750cGz c5750cGz = new C5750cGz(d);
        this.f13647o = c5750cGz;
        C5758cHg c5758cHg = new C5758cHg(d);
        this.u = c5758cHg;
        C5744cGt c5744cGt = new C5744cGt(d);
        this.h = c5744cGt;
        cHB chb = new cHB(d);
        this.D = chb;
        C5759cHh c5759cHh = new C5759cHh(d);
        this.v = c5759cHh;
        C5745cGu c5745cGu = new C5745cGu(d);
        this.j = c5745cGu;
        C5785cIg c5785cIg = new C5785cIg(d);
        this.l = c5785cIg;
        C5641cCy c5641cCy = new C5641cCy(d);
        this.g = c5641cCy;
        C5781cIc c5781cIc = new C5781cIc(d);
        this.f = c5781cIc;
        C5791cIm c5791cIm = new C5791cIm(d);
        this.n = c5791cIm;
        C5783cIe c5783cIe = new C5783cIe(d);
        this.i = c5783cIe;
        C5738cGn e = e(d);
        this.c = e;
        C5733cGi b = b(d);
        this.b = b;
        C5766cHo g = g(d);
        this.B = g;
        C5760cHi c5760cHi = new C5760cHi(d);
        this.C = c5760cHi;
        C5737cGm d2 = d(d);
        this.d = d2;
        C5763cHl j = j(d);
        this.z = j;
        AbstractC5765cHn c = c(d);
        this.s = c;
        cGR i = i(d);
        this.p = i;
        cGW f = f(d);
        this.x = f;
        C5752cHa c5752cHa = new C5752cHa(d);
        this.a = c5752cHa;
        C5753cHb c5753cHb = new C5753cHb(d);
        this.y = c5753cHb;
        cGK cgk = new cGK(d);
        this.w = cgk;
        this.q = new cGD(d);
        this.e = a();
        this.r = new cGB(d);
        this.t = a(d);
        C5747cGw c5747cGw = new C5747cGw(d);
        this.k = c5747cGw;
        new cEH(c5770cHs, observable2, observable);
        c().add(c5770cHs.v());
        new C5673cEc(c5748cGx, observable2);
        c().add(c5748cGx.v());
        new C5679cEi(c5750cGz, observable2);
        c().add(c5750cGz.v());
        c(observable2, observable);
        new C5696cEz(c5758cHg, observable2, observable);
        c().add(c5758cHg.v());
        new cDS(c5744cGt, observable2);
        c().add(c5744cGt.v());
        new cEJ(chb, observable2);
        c().add(chb.v());
        new cEA(c5759cHh, observable2);
        c().add(c5759cHh.v());
        new cDW(c5745cGu, observable2);
        c().add(c5745cGu.v());
        new cDY(c5747cGw, observable2, observable);
        c().add(c5747cGw.v());
        Context context = d.getContext();
        C8632dsu.a(context, "");
        e(observable2, new C5714cFq((NetflixActivity) C9737vz.e(context, NetflixActivity.class)));
        c().add(e.v());
        e(b, observable2);
        c().add(b.v());
        e(observable2, observable);
        c().add(g.v());
        new cEC(c5760cHi, observable2);
        c().add(c5760cHi.v());
        b(observable2);
        c().add(d2.v());
        aQJ.a aVar = aQJ.e;
        if (aVar.a().e()) {
            a(observable2);
            c().add(j.v());
        }
        if (aVar.a().e()) {
            b(observable2, observable);
        } else {
            d(observable2, observable);
        }
        c().add(c.v());
        a(observable2, observable);
        c().add(i.v());
        c(f, observable2, observable);
        c().add(f.v());
        new C5687cEq(c5752cHa, observable2);
        c().add(c5752cHa.v());
        new cEL(c5781cIc, observable2);
        c().add(c5781cIc.v());
        new cEM(c5785cIg, observable2);
        c().add(c5785cIg.v());
        new cCE(observable2, observable, c5791cIm, c5783cIe);
        c().add(c5791cIm.v());
        c().add(c5783cIe.v());
        new C5685cEo(c5753cHb, observable2);
        c().add(c5753cHb.v());
        new C5692cEv(cgk, observable2);
        c().add(cgk.v());
        new cEK(c5641cCy, observable2);
        c().add(c5641cCy.v());
        i(observable2, observable);
        C5734cGj c5734cGj = this.e;
        if (c5734cGj != null) {
            a(c5734cGj, observable2, observable);
            c().add(c5734cGj.v());
        }
        new C5678cEh(this.r, observable2, observable);
        c().add(this.r.v());
        Observable<cBA> takeUntil = observable2.takeUntil(observable);
        C8632dsu.a(takeUntil, "");
        SubscribersKt.subscribeBy$default(takeUntil, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.PlayerUIComponents$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }

            public final void a(Throwable th) {
                Map d3;
                Map k;
                Throwable th2;
                C8632dsu.c((Object) th, "");
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d3 = dqE.d();
                k = dqE.k(d3);
                C1596aHd c1596aHd = new C1596aHd(null, th, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        String c2 = errorType.c();
                        c1596aHd.a(c2 + " " + b2);
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
        }, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.PlayerUIComponents$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBA cba) {
                b(cba);
                return dpR.c;
            }

            public final void b(cBA cba) {
                cBA.aF aFVar;
                WindowInsetsCompat b2;
                DisplayCutoutCompat displayCutout;
                if (cba instanceof cBA.C5549k) {
                    AbstractC5590cBa.a(cBI.this, ((cBA.C5549k) cba).e(), null, 2, null);
                }
                if (!(cba instanceof cBA.aF) || Build.VERSION.SDK_INT < 29 || (b2 = (aFVar = (cBA.aF) cba).b()) == null || (displayCutout = b2.getDisplayCutout()) == null) {
                    return;
                }
                cBI.this.b(aFVar.a(), displayCutout);
            }
        }, 2, (Object) null);
    }

    @Override // o.AbstractC5590cBa
    public void b(boolean z, DisplayCutoutCompat displayCutoutCompat) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.G);
        a(constraintSet);
        constraintSet.applyTo(this.G);
        if (displayCutoutCompat != null) {
            a(z, displayCutoutCompat);
        }
    }

    public void a(boolean z, DisplayCutoutCompat displayCutoutCompat) {
        C8632dsu.c((Object) displayCutoutCompat, "");
        if (!z || Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.b.e(displayCutoutCompat);
        this.d.e(displayCutoutCompat);
        this.z.e(displayCutoutCompat);
        C5734cGj c5734cGj = this.e;
        if (c5734cGj != null) {
            c5734cGj.e(displayCutoutCompat);
        }
    }

    public void a(ConstraintSet constraintSet) {
        C8632dsu.c((Object) constraintSet, "");
        constraintSet.connect(this.h.bI_(), 3, 0, 3);
        constraintSet.connect(this.h.bI_(), 4, 0, 4);
        constraintSet.connect(this.D.bI_(), 3, this.b.bI_(), 4);
        constraintSet.clear(this.p.bI_(), 3);
        constraintSet.connect(this.p.bI_(), 4, 0, 4, this.G.getResources().getDimensionPixelSize(C9834xU.a.x));
        constraintSet.connect(this.x.bI_(), 4, this.p.bI_(), 3);
        constraintSet.connect(this.x.bI_(), 1, 0, 1, this.G.getResources().getDimensionPixelSize(C9834xU.a.I));
        constraintSet.connect(this.x.bI_(), 2, 0, 2, this.G.getResources().getDimensionPixelSize(C9834xU.a.I));
        constraintSet.connect(this.s.bI_(), 3, this.b.bI_(), 4);
        constraintSet.connect(this.s.bI_(), 4, this.x.bI_(), 3);
        constraintSet.connect(this.s.bI_(), 4, this.f.bI_(), 3);
        constraintSet.connect(this.s.bI_(), 4, this.f.bI_(), 3);
        constraintSet.connect(this.f.bI_(), 4, this.p.bI_(), 3);
        constraintSet.connect(this.f.bI_(), 3, this.s.bI_(), 4);
        constraintSet.connect(this.f.bI_(), 6, 0, 6);
        constraintSet.connect(this.f.bI_(), 7, 0, 7);
        constraintSet.connect(this.a.bI_(), 4, this.x.bI_(), 3);
        constraintSet.connect(this.a.bI_(), 1, 0, 1);
        constraintSet.connect(this.a.bI_(), 2, 0, 2);
        constraintSet.clear(this.y.bI_(), 3);
        constraintSet.connect(this.y.bI_(), 3, this.d.bI_(), 4, this.G.getResources().getDimensionPixelSize(C9834xU.a.f13911o));
        constraintSet.connect(this.y.bI_(), 7, 0, 7, this.G.getResources().getDimensionPixelSize(C9834xU.a.f13911o));
        constraintSet.clear(this.w.bI_(), 3);
        constraintSet.connect(this.w.bI_(), 3, this.d.bI_(), 4, this.G.getResources().getDimensionPixelSize(C9834xU.a.f13911o));
        constraintSet.connect(this.w.bI_(), 7, 0, 7, this.G.getResources().getDimensionPixelSize(C9834xU.a.f13911o));
        constraintSet.connect(this.n.bI_(), 6, 0, 6);
        constraintSet.connect(this.n.bI_(), 7, 0, 7);
        constraintSet.connect(this.i.bI_(), 6, 0, 6);
        constraintSet.connect(this.i.bI_(), 7, 0, 7);
        constraintSet.connect(this.b.bI_(), 3, 0, 3);
        constraintSet.connect(this.b.bI_(), 6, 0, 6);
        constraintSet.connect(this.d.bI_(), 3, 0, 3);
        constraintSet.connect(this.d.bI_(), 7, 0, 7);
        constraintSet.connect(this.z.bI_(), 3, 0, 3);
        constraintSet.connect(this.z.bI_(), 7, this.d.bI_(), 6);
        constraintSet.clear(this.B.bI_(), 3);
        constraintSet.clear(this.B.bI_(), 4);
        constraintSet.clear(this.B.bI_(), 6);
        constraintSet.clear(this.B.bI_(), 7);
        constraintSet.connect(this.B.bI_(), 3, 0, 3);
        constraintSet.connect(this.B.bI_(), 4, this.b.bI_(), 4);
        constraintSet.connect(this.B.bI_(), 6, this.b.bI_(), 7);
        constraintSet.connect(this.B.bI_(), 7, this.z.bI_(), 6);
        constraintSet.setGoneMargin(this.B.bI_(), 6, this.G.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.H));
        constraintSet.setGoneMargin(this.B.bI_(), 7, this.G.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.H));
        constraintSet.clear(this.C.bI_(), 3);
        constraintSet.clear(this.C.bI_(), 4);
        constraintSet.clear(this.C.bI_(), 6);
        constraintSet.clear(this.C.bI_(), 7);
        constraintSet.connect(this.C.bI_(), 3, this.B.bI_(), 4);
        constraintSet.connect(this.C.bI_(), 6, this.b.bI_(), 7);
        constraintSet.connect(this.C.bI_(), 7, this.z.bI_(), 6);
        constraintSet.setGoneMargin(this.C.bI_(), 6, this.G.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.H));
        constraintSet.setGoneMargin(this.C.bI_(), 7, this.G.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.H));
        constraintSet.connect(this.c.bI_(), 3, 0, 3);
        constraintSet.connect(this.c.bI_(), 6, 0, 6);
        C5734cGj c5734cGj = this.e;
        if (c5734cGj != null) {
            if (!Config_FastProperty_TabletopModeDisable.Companion.b()) {
                constraintSet.connect(c5734cGj.bI_(), 3, this.b.bI_(), 4);
                constraintSet.connect(c5734cGj.bI_(), 4, this.x.bI_(), 3);
            } else {
                constraintSet.connect(c5734cGj.bI_(), 3, 0, 3);
                constraintSet.connect(c5734cGj.bI_(), 4, 0, 4);
            }
            constraintSet.connect(c5734cGj.bI_(), 6, 0, 6);
        }
        cGB cgb = this.r;
        if (cgb != null) {
            constraintSet.clear(cgb.bI_(), 3);
            constraintSet.connect(cgb.bI_(), 4, 0, 4, this.G.getResources().getDimensionPixelSize(C9834xU.a.v));
            constraintSet.connect(cgb.bI_(), 6, 0, 6);
            constraintSet.connect(cgb.bI_(), 7, 0, 7);
        }
    }

    public InterfaceC9680uv a(ViewGroup viewGroup) {
        C8632dsu.c((Object) viewGroup, "");
        return new C9675uq(viewGroup);
    }

    public C5766cHo g(ViewGroup viewGroup) {
        C8632dsu.c((Object) viewGroup, "");
        return new C5766cHo(viewGroup);
    }

    public cGR i(ViewGroup viewGroup) {
        C8632dsu.c((Object) viewGroup, "");
        return new cGR(viewGroup);
    }

    public AbstractC5765cHn c(ViewGroup viewGroup) {
        C8632dsu.c((Object) viewGroup, "");
        if (aQJ.e.a().e()) {
            return new cGM(viewGroup);
        }
        return new cGJ(viewGroup);
    }

    public void c(Observable<cBA> observable, Observable<dpR> observable2) {
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) observable2, "");
        new C5682cEl(this.t, observable);
    }

    public void e(Observable<cBA> observable, Observable<dpR> observable2) {
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) observable2, "");
        new cEB(this.B, observable);
    }

    public void a(Observable<cBA> observable, Observable<dpR> observable2) {
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) observable2, "");
        new C5683cEm(this.p, observable);
    }

    public void i(Observable<cBA> observable, Observable<dpR> observable2) {
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) observable2, "");
        C5681cEk.d.e(this.q, observable);
        c().add(this.q.v());
        Observable<cBO> v = this.q.v();
        C8632dsu.d(v);
        c((Subject) v);
    }

    public cDH e(C5733cGi c5733cGi, Observable<cBA> observable) {
        C8632dsu.c((Object) c5733cGi, "");
        C8632dsu.c((Object) observable, "");
        return new cDH(c5733cGi, observable);
    }

    private final cGW f(ViewGroup viewGroup) {
        return new C5757cHf(viewGroup);
    }

    public C5684cEn c(cFV cfv, Observable<cBA> observable, Observable<dpR> observable2) {
        C8632dsu.c((Object) cfv, "");
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) observable2, "");
        return new C5684cEn(cfv, observable, observable2);
    }

    public cDK a(C5734cGj c5734cGj, Observable<cBA> observable, Observable<dpR> observable2) {
        C8632dsu.c((Object) c5734cGj, "");
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) observable2, "");
        return new cDK(c5734cGj, this.I, observable2);
    }

    public C5680cEj d(Observable<cBA> observable, Observable<dpR> observable2) {
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) observable2, "");
        AbstractC5765cHn abstractC5765cHn = this.s;
        C8632dsu.d(abstractC5765cHn);
        return new C5680cEj((cGJ) abstractC5765cHn, observable, observable2);
    }

    public C5686cEp b(Observable<cBA> observable, Observable<dpR> observable2) {
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) observable2, "");
        AbstractC5765cHn abstractC5765cHn = this.s;
        C8632dsu.d(abstractC5765cHn);
        return new C5686cEp((cGM) abstractC5765cHn, observable, observable2);
    }

    public C5737cGm d(ViewGroup viewGroup) {
        C8632dsu.c((Object) viewGroup, "");
        return new C5737cGm(viewGroup);
    }

    public cDM b(Observable<cBA> observable) {
        C8632dsu.c((Object) observable, "");
        return new cDM(this.d, observable);
    }

    public C5763cHl j(ViewGroup viewGroup) {
        C8632dsu.c((Object) viewGroup, "");
        return new C5763cHl(viewGroup);
    }

    public cEG a(Observable<cBA> observable) {
        C8632dsu.c((Object) observable, "");
        return new cEG(this.z, observable);
    }

    public C5733cGi b(ViewGroup viewGroup) {
        C8632dsu.c((Object) viewGroup, "");
        return new C5733cGi(viewGroup);
    }

    public cDL e(Observable<cBA> observable, C5714cFq c5714cFq) {
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) c5714cFq, "");
        return new cDL(this.c, observable, c5714cFq);
    }

    public C5738cGn e(ViewGroup viewGroup) {
        C8632dsu.c((Object) viewGroup, "");
        return new C5738cGn(viewGroup);
    }

    private final C5734cGj a() {
        if (C8150deu.c() || C8150deu.f()) {
            return null;
        }
        return new C5734cGj(this.G);
    }
}
