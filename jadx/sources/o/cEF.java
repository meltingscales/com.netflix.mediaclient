package o;

import com.netflix.mediaclient.ui.player.v2.presenter.PlayerTouchAwarePresenter$1;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C8632dsu;
import o.InterfaceC5701cFd;
import o.InterfaceC5709cFl;
import o.cBA;
import o.cEF;
import o.cEO;
import o.cET;
import o.cEX;
import o.dpR;

/* loaded from: classes4.dex */
public class cEF extends cDE implements InterfaceC5701cFd, cEX, cET, cEO, InterfaceC5709cFl {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private final InterfaceC5730cGf j;

    @Override // o.cET
    public void a(boolean z) {
        this.d = z;
    }

    @Override // o.cEX
    public void b(boolean z) {
        this.c = z;
    }

    public boolean bJ_() {
        return this.d;
    }

    @Override // o.InterfaceC5709cFl
    public void f(boolean z) {
        this.b = z;
    }

    @Override // o.cEO
    public void h(boolean z) {
        this.a = z;
    }

    @Override // o.InterfaceC5701cFd
    public void j(boolean z) {
        this.e = z;
    }

    public boolean l() {
        return this.c;
    }

    public boolean m() {
        return this.e;
    }

    public boolean n() {
        return this.b;
    }

    public boolean o() {
        return this.a;
    }

    public /* synthetic */ cEF(InterfaceC5730cGf interfaceC5730cGf, Observable observable, Observable observable2, int i, C8627dsp c8627dsp) {
        this(interfaceC5730cGf, observable, (i & 4) != 0 ? null : observable2);
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

    @Override // o.cEO
    public void i(Observable<cBA> observable) {
        cEO.d.b(this, observable);
    }

    @Override // o.InterfaceC5709cFl
    public void j(Observable<cBA> observable) {
        InterfaceC5709cFl.a.a(this, observable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cEF(InterfaceC5730cGf interfaceC5730cGf, Observable<cBA> observable, Observable<AbstractC5594cBe> observable2) {
        super(observable, new InterfaceC5730cGf[]{interfaceC5730cGf}, observable2);
        C8632dsu.c((Object) interfaceC5730cGf, "");
        C8632dsu.c((Object) observable, "");
        this.j = interfaceC5730cGf;
        final PlayerTouchAwarePresenter$1 playerTouchAwarePresenter$1 = new drM<cBA, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerTouchAwarePresenter$1
            @Override // o.drM
            /* renamed from: a */
            public final Boolean invoke(cBA cba) {
                C8632dsu.c((Object) cba, "");
                return Boolean.valueOf(cba instanceof cBA.am);
            }
        };
        Observable<cBA> filter = observable.filter(new Predicate() { // from class: o.cEE
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean e;
                e = cEF.e(drM.this, obj);
                return e;
            }
        });
        C8632dsu.a(filter, "");
        SubscribersKt.subscribeBy$default(filter, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerTouchAwarePresenter$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBA cba) {
                e(cba);
                return dpR.c;
            }

            public final void e(cBA cba) {
                cEF.this.d();
            }
        }, 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.cDE, o.AbstractC9940zU
    public void onEvent(cBA cba) {
        C8632dsu.c((Object) cba, "");
        if (C8632dsu.c(cba, cBA.ao.d)) {
            this.f = false;
            if (l()) {
                d();
            }
        } else if (C8632dsu.c(cba, cBA.T.b)) {
            this.f = true;
        } else if (C8632dsu.c(cba, cBA.C5548j.d)) {
            if (!n()) {
                bK_();
            } else {
                d();
            }
        } else if (cba instanceof cBA.ag) {
            cBA.ag agVar = (cBA.ag) cba;
            f(agVar.c());
            if (agVar.c()) {
                d();
            } else {
                bK_();
            }
        } else if (C8632dsu.c(cba, cBA.C5555q.a) || (cba instanceof cBA.F)) {
            this.j.q();
        } else if (cba instanceof cBA.aA) {
            d();
        } else if (!C8632dsu.c(cba, cBA.C5541c.c) || o()) {
        } else {
            d();
        }
    }

    public void bK_() {
        if (m()) {
            return;
        }
        if (bJ_()) {
            this.j.x();
        } else if (!l() || (l() && this.f)) {
            this.j.a();
        }
    }

    public void d() {
        this.j.c();
    }
}
