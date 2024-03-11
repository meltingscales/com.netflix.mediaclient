package o;

import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.alh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2736alh {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final C2736alh d = new C2736alh();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> c() {
        return e;
    }

    private C2736alh() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("LolomoRowListEdge");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LolomoRowListEdge", e2).b(C2735alg.e.c()).a());
        a = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("hasNextPage", C9019hg.d(C2945ape.b.b())).d());
        b = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("totalCount", C2949api.a.d()).d(), new C9018hf.a("edges", C9019hg.a((AbstractC9026hn) C2979aqL.c.b())).e(j).d(), new C9018hf.a("pageInfo", C3060arn.b.e()).e(j2).d());
        e = j3;
    }
}
