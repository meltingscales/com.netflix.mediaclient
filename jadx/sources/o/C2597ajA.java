package o;

import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.ajA  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2597ajA {
    public static final C2597ajA b = new C2597ajA();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> e() {
        return e;
    }

    private C2597ajA() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j = C8569dql.j(d2, new C9018hf.a("iconId", cVar.d()).d(), new C9018hf.a("text", eVar.e()).d());
        d = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("boardName", eVar.e()).d(), new C9018hf.a("boardId", cVar.d()).d(), new C9018hf.a("certificationValue", eVar.e()).d(), new C9018hf.a("certificationRatingId", cVar.d()).d(), new C9018hf.a("i18nRating", eVar.e()).d(), new C9018hf.a("i18nReasonsText", eVar.e()).d(), new C9018hf.a("maturityDescription", eVar.e()).d(), new C9018hf.a("maturityLevel", cVar.d()).d(), new C9018hf.a("shortDescription", eVar.e()).d(), new C9018hf.a("reasons", C9019hg.a((AbstractC9026hn) C2867aoF.a.d())).e(j).d());
        c = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("contentAdvisory", C2868aoG.b.b()).e(j2).d());
        e = j3;
    }
}
