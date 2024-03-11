package o;

import java.util.List;
import javax.inject.Inject;
import o.C2463agZ;
import o.YQ;

/* renamed from: o.bXk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4132bXk {
    private final C4137bXp d;

    @Inject
    public C4132bXk(C4137bXp c4137bXp) {
        C8632dsu.c((Object) c4137bXp, "");
        this.d = c4137bXp;
    }

    public final C4001bSo e(YQ.e eVar, boolean z) {
        C2520ahd c;
        YQ.b d;
        C2463agZ b;
        C2463agZ.a a;
        C8632dsu.c((Object) eVar, "");
        YQ.d e = eVar.e();
        if (e == null || (c = e.c()) == null) {
            return new C4001bSo(null, null, false, false, null, 16, null);
        }
        C1532aEu c1532aEu = new C1532aEu(c, z);
        List<C4003bSq> c2 = this.d.c(eVar);
        YQ.d e2 = eVar.e();
        return new C4001bSo(c1532aEu, c2, (e2 == null || (d = e2.d()) == null || (b = d.b()) == null || (a = b.a()) == null || !a.b()) ? false : true, z, null, 16, null);
    }
}
