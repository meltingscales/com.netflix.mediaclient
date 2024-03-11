package o;

import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.alJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2712alJ {
    private static final List<AbstractC9025hm> a;
    public static final C2712alJ c = new C2712alJ();
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> a() {
        return d;
    }

    private C2712alJ() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List e2;
        List<AbstractC9025hm> j3;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j = C8569dql.j(d2, new C9018hf.a("iconId", cVar.d()).d(), new C9018hf.a("text", eVar.e()).d());
        e = j;
        j2 = C8569dql.j(new C9018hf.a("boardName", eVar.e()).d(), new C9018hf.a("boardId", cVar.d()).d(), new C9018hf.a("certificationValue", eVar.e()).d(), new C9018hf.a("certificationRatingId", cVar.d()).d(), new C9018hf.a("i18nRating", eVar.e()).d(), new C9018hf.a("i18nReasonsText", eVar.e()).d(), new C9018hf.a("maturityDescription", eVar.e()).d(), new C9018hf.a("maturityLevel", cVar.d()).d(), new C9018hf.a("shortDescription", eVar.e()).d(), new C9018hf.a("reasons", C9019hg.a((AbstractC9026hn) C2867aoF.a.d())).e(j).d(), new C9018hf.a("certSystemConfirmationId", C2946apf.d.a()).d());
        a = j2;
        e2 = C8566dqi.e("ContentAdvisory");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("displayDurationMillis", cVar.d()).d(), new C9018hf.a("displayDelayMillis", cVar.d()).d(), new C9018hf.a("text", eVar.e()).d(), new C9017he.d("ContentAdvisory", e2).b(j2).a());
        d = j3;
    }
}
