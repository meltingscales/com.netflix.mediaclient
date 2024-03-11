package o;

import com.netflix.mediaclient.servicemgr.IPlayer;
import io.reactivex.Observable;
import o.AbstractC5597cBh;
import o.AbstractC5599cBj;
import o.cAY;
import o.cBA;

/* renamed from: o.cEi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5679cEi extends cDE {
    private final cFQ d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5679cEi(cFQ cfq, Observable<cBA> observable) {
        super(observable, new InterfaceC5730cGf[]{cfq}, null, 4, null);
        C8632dsu.c((Object) cfq, "");
        C8632dsu.c((Object) observable, "");
        this.d = cfq;
    }

    @Override // o.cDE, o.AbstractC9940zU
    public void onEvent(cBA cba) {
        C8632dsu.c((Object) cba, "");
        super.onEvent(cba);
        if (cba instanceof cAY.d) {
            this.d.j();
        } else if (cba instanceof cAY.a) {
            this.d.g();
        } else if (cba instanceof cBA.ah) {
            if (((cBA.ah) cba).d() == IPlayer.PlaybackType.LivePlayback) {
                this.d.j();
            }
        } else if (cba instanceof cBA.am) {
            this.d.g();
        } else if (cba instanceof cBA.C5556r) {
            this.d.g();
        } else if (cba instanceof cBA.aj) {
            this.d.g();
        } else if (cba instanceof AbstractC5599cBj.b) {
            this.d.j();
        } else if (cba instanceof AbstractC5599cBj.a) {
            this.d.g();
        } else if (cba instanceof AbstractC5597cBh.a) {
            this.d.j();
        } else if (cba instanceof AbstractC5597cBh.d) {
            this.d.g();
        }
    }
}
