package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.discrete.Presented;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.ui.player.v2.interactive.Interactivity;
import io.reactivex.Observable;
import java.util.Collections;
import o.InterfaceC5698cFa;
import o.InterfaceC5706cFi;
import o.cEW;

/* renamed from: o.cEm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5683cEm extends cEF implements InterfaceC5706cFi, cEW, InterfaceC5698cFa {
    private boolean a;
    private boolean b;
    private Interactivity c;
    private boolean d;
    private boolean e;
    private final cFU j;

    @Override // o.cEW
    public void a(Interactivity interactivity) {
        this.c = interactivity;
    }

    public boolean a() {
        return this.e;
    }

    public Interactivity c() {
        return this.c;
    }

    @Override // o.InterfaceC5698cFa
    public void c(boolean z) {
        this.b = z;
    }

    @Override // o.InterfaceC5706cFi
    public void d(boolean z) {
        this.e = z;
    }

    public boolean i() {
        return this.b;
    }

    @Override // o.InterfaceC5706cFi
    public void a(Observable<cBA> observable) {
        InterfaceC5706cFi.a.b(this, observable);
    }

    @Override // o.cEW
    public void e(Observable<cBA> observable) {
        cEW.d.a(this, observable);
    }

    @Override // o.InterfaceC5698cFa
    public void h(Observable<cBA> observable) {
        InterfaceC5698cFa.a.a(this, observable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5683cEm(cFU cfu, Observable<cBA> observable) {
        super(cfu, observable, null, 4, null);
        C8632dsu.c((Object) cfu, "");
        C8632dsu.c((Object) observable, "");
        this.j = cfu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r5.hideSubtitlesMenuDuringPlayback() == true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
        if ((r0 != null ? r0.l() : null) != com.netflix.mediaclient.servicemgr.interface_.VideoType.SHOW) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0117  */
    @Override // o.cEF, o.cDE, o.AbstractC9940zU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onEvent(o.cBA r5) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5683cEm.onEvent(o.cBA):void");
    }

    public boolean g() {
        return (this.j.w() || a() || n()) ? false : true;
    }

    @Override // o.cEF
    public void bK_() {
        if (g()) {
            super.bK_();
            if (this.j.m()) {
                j();
            }
        }
    }

    public void j() {
        Logger.INSTANCE.logEvent(new Presented(AppView.nextEpisodeButton, Boolean.FALSE, CLv2Utils.a(Collections.singletonMap("trackId", Integer.valueOf(PlayContextImp.i)))));
    }

    public void a(InterfaceC5198buI interfaceC5198buI) {
        if (!i() && c() != Interactivity.e && aSC.c(interfaceC5198buI) != null) {
            this.j.l();
        } else {
            this.j.i();
        }
    }

    private final void c(InterfaceC5198buI interfaceC5198buI) {
        if (!i() && c() != Interactivity.e && interfaceC5198buI != null) {
            this.j.l();
        } else {
            this.j.i();
        }
    }

    private final boolean k() {
        return c() == null;
    }

    private final boolean f() {
        return (c() == Interactivity.e || C8150deu.f()) ? false : true;
    }
}
