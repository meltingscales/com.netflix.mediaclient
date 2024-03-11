package o;

import com.netflix.mediaclient.ui.player.v2.interactive.Interactivity;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import io.reactivex.Observable;
import o.cBA;
import o.cEW;
import o.cEX;

/* loaded from: classes4.dex */
public final class cEM extends cDE implements cEW, cEX {
    private boolean a;
    private Interactivity b;
    private boolean c;
    private boolean d;
    private final cHP e;
    private aJY f;

    private final boolean b() {
        return this.a && !this.c;
    }

    @Override // o.cEW
    public void a(Interactivity interactivity) {
        this.b = interactivity;
    }

    @Override // o.cEX
    public void b(boolean z) {
        this.d = z;
    }

    public boolean e() {
        return this.d;
    }

    @Override // o.cEX
    public void d(Observable<cBA> observable) {
        cEX.b.b(this, observable);
    }

    @Override // o.cEW
    public void e(Observable<cBA> observable) {
        cEW.d.a(this, observable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cEM(cHP chp, Observable<cBA> observable) {
        super(observable, new InterfaceC5730cGf[]{chp}, null, 4, null);
        C8632dsu.c((Object) chp, "");
        C8632dsu.c((Object) observable, "");
        this.e = chp;
        chp.i();
    }

    @Override // o.cDE, o.AbstractC9940zU
    public void onEvent(cBA cba) {
        aJY ajy;
        InteractiveSummary.Features features;
        C8632dsu.c((Object) cba, "");
        super.onEvent(cba);
        boolean z = true;
        if (cba instanceof cBA.al) {
            this.c = true;
            if (this.a) {
                this.e.c();
            }
        } else if (cba instanceof cBA.H) {
            this.c = false;
            if (b()) {
                this.e.a();
            }
        } else if (cba instanceof cBA.C5542d) {
            InteractiveSummary az_ = ((cBA.C5542d) cba).e().g().az_();
            if (az_ == null || (features = az_.features()) == null || !features.playerControlsPersistPlayPause()) {
                z = false;
            }
            this.a = z;
        } else if (cba instanceof cBA.au) {
            this.f = ((cBA.au) cba).b();
        } else if (cba instanceof cBA.ai) {
            if (!this.a || (ajy = this.f) == null) {
                return;
            }
            this.e.a(ajy);
            this.e.d();
        } else if (cba instanceof cBA.C5553o) {
        } else {
            if (cba instanceof cBA.C5556r) {
                this.e.b();
                this.e.i();
            } else if (C8632dsu.c(cba, cBA.C5558t.d)) {
                this.e.c();
            } else if (C8632dsu.c(cba, cBA.aA.a) || C8632dsu.c(cba, cBA.K.a)) {
                this.e.c();
            } else if (cba instanceof cBA.C5547i) {
            } else {
                if (cba instanceof cBA.T) {
                    if (this.a) {
                        this.e.c();
                    }
                } else if (cba instanceof cBA.C5548j) {
                    if (!this.a || e()) {
                        return;
                    }
                    this.e.c();
                } else if (((cba instanceof cBA.E) || (cba instanceof cBA.C5541c)) && b()) {
                    this.e.a();
                }
            }
        }
    }
}
