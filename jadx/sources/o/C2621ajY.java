package o;

import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.ajY  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2621ajY {
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2621ajY e = new C2621ajY();

    public final List<AbstractC9025hm> b() {
        return d;
    }

    private C2621ajY() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List e3;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("LolomoFeedNode");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LolomoFeedNode", e2).b(C2618ajV.a.d()).a());
        c = j;
        e3 = C8566dqi.e("LolomoFeedRowEntitiesEdge");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LolomoFeedRowEntitiesEdge", e3).b(C2620ajX.b.d()).a(), new C9018hf.a("node", C3008aqo.a.c()).e(j).d());
        d = j2;
    }
}
