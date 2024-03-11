package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.DisplayCutoutCompat;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.Subject;
import o.AbstractC5590cBa;
import o.C8632dsu;
import o.cBA;
import o.cBJ;
import o.dpR;

/* loaded from: classes4.dex */
public final class cBJ extends AbstractC5590cBa {
    private final cGD a;
    private final C5759cHh b;
    private final C5733cGi c;
    private final C5758cHg d;
    private final C9682ux e;
    private final C5770cHs f;
    private final ConstraintLayout j;

    public cBJ(cBK cbk, Observable<cBA> observable, Observable<dpR> observable2) {
        C8632dsu.c((Object) cbk, "");
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) observable2, "");
        ConstraintLayout d = cbk.d();
        this.j = d;
        C5770cHs c5770cHs = new C5770cHs(d);
        this.f = c5770cHs;
        C9682ux c9682ux = new C9682ux(d);
        this.e = c9682ux;
        C5759cHh c5759cHh = new C5759cHh(d);
        this.b = c5759cHh;
        C5733cGi c5733cGi = new C5733cGi(d);
        this.c = c5733cGi;
        C5758cHg c5758cHg = new C5758cHg(d);
        this.d = c5758cHg;
        this.a = new cGD(d);
        new cEH(c5770cHs, observable, observable2);
        c().add(c5770cHs.v());
        new C5682cEl(c9682ux, observable);
        new C5696cEz(c5758cHg, observable, observable2);
        c().add(c5758cHg.v());
        new cEA(c5759cHh, observable);
        c().add(c5759cHh.v());
        new cDI(c5733cGi, observable);
        c().add(c5733cGi.v());
        d(observable);
        SubscribersKt.subscribeBy$default(observable, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.PlayerUIControlsPostPlayEverywhere$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBA cba) {
                d(cba);
                return dpR.c;
            }

            public final void d(cBA cba) {
                C8632dsu.c((Object) cba, "");
                if (cba instanceof cBA.C5549k) {
                    AbstractC5590cBa.a(cBJ.this, ((cBA.C5549k) cba).e(), null, 2, null);
                }
            }
        }, 3, (Object) null);
    }

    @Override // o.AbstractC5590cBa
    public void b(boolean z, DisplayCutoutCompat displayCutoutCompat) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.j);
        b(constraintSet);
        constraintSet.applyTo(this.j);
    }

    private final void b(ConstraintSet constraintSet) {
        constraintSet.connect(this.b.bI_(), 3, this.c.bI_(), 4);
        constraintSet.connect(this.b.bI_(), 4, this.a.bI_(), 3);
        constraintSet.connect(this.c.bI_(), 3, 0, 3);
        constraintSet.connect(this.c.bI_(), 6, 0, 6);
        constraintSet.connect(this.d.bI_(), 3, this.c.bI_(), 4);
    }

    private final void d(Observable<cBA> observable) {
        C5681cEk.d.e(this.a, observable);
        c().add(this.a.v());
        Observable<cBO> v = this.a.v();
        C8632dsu.d(v);
        c((Subject) v);
    }
}
