package o;

import io.reactivex.Observable;
import javax.inject.Inject;
import javax.inject.Provider;

/* renamed from: o.cBs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5608cBs implements InterfaceC5603cBn {
    private final aLN a;
    private final aDB b;
    private final Provider<Boolean> c;
    private final aCG d;
    private final C1567aGb e;

    @Inject
    public C5608cBs(aLN aln, aCG acg, aDB adb, C1567aGb c1567aGb, Provider<Boolean> provider) {
        C8632dsu.c((Object) aln, "");
        C8632dsu.c((Object) acg, "");
        C8632dsu.c((Object) adb, "");
        C8632dsu.c((Object) c1567aGb, "");
        C8632dsu.c((Object) provider, "");
        this.a = aln;
        this.d = acg;
        this.b = adb;
        this.e = c1567aGb;
        this.c = provider;
    }

    @Override // o.InterfaceC5603cBn
    /* renamed from: d */
    public C5611cBv e(Observable<dpR> observable) {
        C8632dsu.c((Object) observable, "");
        aLP e = this.a.e(observable);
        if (C8153dex.H()) {
            return new cBB(this.d, e, this.b, this.e);
        }
        if (aQR.e.b()) {
            return new C5613cBx(this.d, e, this.b);
        }
        return new C5611cBv(e);
    }

    @Override // o.InterfaceC5603cBn
    public cBP d() {
        return new cBM(this.c);
    }
}
