package o;

import com.netflix.mediaclient.servicemgr.IPlayer;
import io.reactivex.Observable;
import o.AbstractC5597cBh;
import o.AbstractC5599cBj;
import o.cAY;
import o.cBA;

/* renamed from: o.cEc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5673cEc extends cDE {
    private final cFR e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5673cEc(cFR cfr, Observable<cBA> observable) {
        super(observable, new InterfaceC5730cGf[]{cfr}, null, 4, null);
        C8632dsu.c((Object) cfr, "");
        C8632dsu.c((Object) observable, "");
        this.e = cfr;
        cfr.g();
    }

    @Override // o.cDE, o.AbstractC9940zU
    public void onEvent(cBA cba) {
        C8632dsu.c((Object) cba, "");
        super.onEvent(cba);
        if (cba instanceof cAY.d) {
            this.e.f();
        } else if (cba instanceof cAY.a) {
            this.e.j();
        } else if (cba instanceof cBA.ah) {
            if (((cBA.ah) cba).d() == IPlayer.PlaybackType.LivePlayback) {
                this.e.f();
            }
        } else if (cba instanceof cBA.am) {
            this.e.j();
        } else if (cba instanceof cBA.C5556r) {
            this.e.j();
        } else if (cba instanceof cBA.aj) {
            this.e.j();
        } else if (cba instanceof AbstractC5599cBj.b) {
            this.e.f();
        } else if (cba instanceof AbstractC5599cBj.a) {
            this.e.j();
        } else if (cba instanceof AbstractC5597cBh.a) {
            this.e.f();
        } else if (cba instanceof AbstractC5597cBh.d) {
            this.e.j();
        }
        this.e.d(cba);
    }
}
