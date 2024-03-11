package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2850anp {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2850anp e = new C2850anp();
    private static final List<AbstractC9025hm> i;

    public final List<AbstractC9025hm> a() {
        return i;
    }

    private C2850anp() {
    }

    static {
        List<AbstractC9025hm> j;
        List e2;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<C9021hi> j5;
        List<AbstractC9025hm> e3;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("startCursor", eVar.e()).d(), new C9018hf.a("endCursor", eVar.e()).d(), new C9018hf.a("hasNextPage", C9019hg.d(C2945ape.b.b())).d());
        a = j;
        C2949api.c cVar = C2949api.a;
        e2 = C8566dqi.e("Game");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("gameId", C9019hg.d(cVar.d())).d(), new C9017he.d("Game", e2).b(C2749alu.e.c()).a());
        c = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("node", C2942apb.d.c()).e(j2).d());
        b = j3;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.LANG_ID, C2946apf.d.a()).d(), new C9018hf.a("totalCount", cVar.d()).d(), new C9018hf.a("trackId", cVar.d()).d(), new C9018hf.a("pageInfo", C3060arn.b.e()).e(j).d(), new C9018hf.a("edges", C9019hg.a(C9019hg.d(C2985aqR.d.c()))).e(j3).d());
        d = j4;
        C9018hf.a aVar = new C9018hf.a("myListGames", C2993aqZ.d.b());
        j5 = C8569dql.j(new C9021hi.d("after").b(new C9027ho("after")).b(), new C9021hi.d("first").b(new C9027ho("first")).b(), new C9021hi.d("progress").b(new C9027ho("filter")).b());
        e3 = C8566dqi.e(aVar.b(j5).e(j4).d());
        i = e3;
    }
}
