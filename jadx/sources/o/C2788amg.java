package o;

import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.amg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2788amg {
    public static final C2788amg b = new C2788amg();
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> c() {
        return e;
    }

    private C2788amg() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d3 = new C9018hf.a("value", eVar.e()).d();
        C2949api.c cVar = C2949api.a;
        j = C8569dql.j(d2, d3, new C9018hf.a("maturityLevel", cVar.d()).d(), new C9018hf.a("maturityDescription", eVar.e()).d(), new C9018hf.a("shortDescription", eVar.e()).d(), new C9018hf.a("ratingId", cVar.d()).d(), new C9018hf.a("boardId", cVar.d()).d(), new C9018hf.a("boardName", eVar.e()).d());
        d = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("certificationRating", C2870aoI.a.c()).e(j).d());
        e = j2;
    }
}
