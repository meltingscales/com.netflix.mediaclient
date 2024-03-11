package o;

import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.player.v2.interactive.Interactivity;
import io.reactivex.Observable;
import o.InterfaceC5706cFi;
import o.aQJ;
import o.cBA;
import o.cEW;

/* loaded from: classes4.dex */
public class cEG extends cEF implements InterfaceC5706cFi, cEW {
    private final boolean a;
    private boolean b;
    private boolean c;
    private Interactivity d;
    private final boolean e;
    private boolean g;
    private final InterfaceC5729cGe h;
    private boolean i;

    public Interactivity a() {
        return this.d;
    }

    @Override // o.cEW
    public void a(Interactivity interactivity) {
        this.d = interactivity;
    }

    public boolean c() {
        return this.b;
    }

    @Override // o.InterfaceC5706cFi
    public void d(boolean z) {
        this.b = z;
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
    public cEG(InterfaceC5729cGe interfaceC5729cGe, Observable<cBA> observable) {
        super(interfaceC5729cGe, observable, null, 4, null);
        C8632dsu.c((Object) interfaceC5729cGe, "");
        C8632dsu.c((Object) observable, "");
        this.h = interfaceC5729cGe;
        aQJ.a aVar = aQJ.e;
        this.e = aVar.a().e();
        this.a = aVar.a().a() && !BrowseExperience.a();
    }

    @Override // o.cEF, o.cDE, o.AbstractC9940zU
    public void onEvent(cBA cba) {
        InterfaceC5198buI g;
        C8632dsu.c((Object) cba, "");
        super.onEvent(cba);
        if (cba instanceof cBA.ah) {
            this.g = ((cBA.ah) cba).d() == IPlayer.PlaybackType.OfflinePlayback;
        } else if (cba instanceof cBA.ai) {
            cBA.ai aiVar = (cBA.ai) cba;
            C7535cxz b = aiVar.b();
            if (b != null && (g = b.g()) != null) {
                if (!this.e || g.M() || (g.getType() != VideoType.MOVIE && g.getType() != VideoType.EPISODE)) {
                    r1 = false;
                }
                this.c = r1;
            }
            if (a() == null) {
                this.h.d();
                if (i() && !aiVar.i()) {
                    bK_();
                }
            } else {
                d();
            }
            if (this.c && aQJ.e.a().c()) {
                this.h.i();
            }
        } else if ((cba instanceof cBA.an) || C8632dsu.c(cba, cBA.C5558t.d) || (cba instanceof cBA.C5556r)) {
            this.h.b();
        } else if (C8632dsu.c(cba, cBA.M.e) || C8632dsu.c(cba, cBA.K.a) || C8632dsu.c(cba, cBA.E.e)) {
            if (this.i) {
                return;
            }
            d();
        } else if (cba instanceof cBA.az) {
            this.i = ((cBA.az) cba).c();
        } else if (C8632dsu.c(cba, cBA.at.e)) {
            this.h.c(false);
        } else if (C8632dsu.c(cba, cBA.av.e)) {
            this.h.c(true);
        }
    }

    public boolean i() {
        return (!this.c || this.h.w() || c() || n() || a() == Interactivity.e || m() || this.g) ? false : true;
    }

    @Override // o.cEF
    public void bK_() {
        if (i()) {
            super.bK_();
            if (this.a) {
                this.h.g();
            } else {
                this.h.j();
            }
        }
    }

    @Override // o.cEF
    public void d() {
        super.d();
    }
}
