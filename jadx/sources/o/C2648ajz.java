package o;

import java.util.List;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.ajz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2648ajz {
    public static final C2648ajz a = new C2648ajz();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> e() {
        return e;
    }

    private C2648ajz() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("distributorName", eVar.e()).d(), new C9018hf.a("releaseDate", C2873aoL.a.d()).d());
        c = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("broadcastInfo", C2863aoB.b.b()).e(j).d());
        e = j2;
    }
}
