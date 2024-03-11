package o;

import io.reactivex.Observable;
import javax.inject.Inject;

/* renamed from: o.cTm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6090cTm implements InterfaceC6083cTf {
    private final aCG a;
    private final aCN b;
    private final InterfaceC1469aCl c;
    private final aLN d;
    private final aDB e;
    private final C1567aGb h;

    @Inject
    public C6090cTm(aLN aln, aCG acg, C1567aGb c1567aGb, aCN acn, aDB adb, InterfaceC1469aCl interfaceC1469aCl) {
        C8632dsu.c((Object) aln, "");
        C8632dsu.c((Object) acg, "");
        C8632dsu.c((Object) c1567aGb, "");
        C8632dsu.c((Object) acn, "");
        C8632dsu.c((Object) adb, "");
        C8632dsu.c((Object) interfaceC1469aCl, "");
        this.d = aln;
        this.a = acg;
        this.h = c1567aGb;
        this.b = acn;
        this.e = adb;
        this.c = interfaceC1469aCl;
    }

    @Override // o.InterfaceC6083cTf
    /* renamed from: a */
    public C6062cSo d(Observable<dpR> observable) {
        C8632dsu.c((Object) observable, "");
        aLP e = this.d.e(observable);
        if (aQO.c.a() || aQE.d.b()) {
            return new C6095cTr(e, this.a, this.e);
        }
        if (C1872aRj.c.c()) {
            return new C6096cTs(e, this.a, this.e);
        }
        if (aQH.b.c() || C1867aRe.a.c().d()) {
            return new C6099cTv(e, this.a, this.h, this.b, this.e);
        }
        if (C1873aRk.a.b()) {
            return new C6100cTw(e, this.a, this.h, this.b, this.e, this.c);
        }
        if (C8153dex.Y()) {
            return new C6098cTu(e, this.a, this.h, this.b, this.e);
        }
        return new C6062cSo(e);
    }

    @Override // o.InterfaceC6083cTf
    /* renamed from: e */
    public C6062cSo b(Observable<dpR> observable) {
        C8632dsu.c((Object) observable, "");
        return new C6062cSo(this.d.e(observable));
    }
}
