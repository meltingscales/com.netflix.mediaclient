package o;

import com.netflix.mediaclient.graphql.models.type.ThumbRating;
import java.util.List;
import java.util.Map;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.aob  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2889aob {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2889aob e = new C2889aob();
    private static final List<AbstractC9025hm> i;

    public final List<AbstractC9025hm> c() {
        return a;
    }

    private C2889aob() {
    }

    static {
        List<AbstractC9025hm> j;
        List e2;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        Map c2;
        List<C9021hi> e3;
        List<AbstractC9025hm> e4;
        j = C8569dql.j(new C9018hf.a("gameId", C9019hg.d(C2949api.a.d())).d(), new C9018hf.a("thumbRating", ThumbRating.a.d()).d());
        d = j;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("Game");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("unifiedEntityId", C9019hg.d(C2946apf.d.a())).d(), new C9017he.d("Game", e2).b(j).a());
        b = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("message", C9019hg.d(eVar.e())).d());
        c = j3;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("entity", C3375axm.a.e()).e(j2).d(), new C9018hf.a("errors", C9019hg.a(C9019hg.d(C3221auq.e.e()))).e(j3).d());
        i = j4;
        C9018hf.a aVar = new C9018hf.a("setEntityThumbRating", C3219auo.e.e());
        C9021hi.d dVar = new C9021hi.d("input");
        c2 = dqE.c(dpD.a("entityId", new C9027ho("entityId")), dpD.a("rating", new C9027ho("rating")), dpD.a("trackId", new C9027ho("trackId")));
        e3 = C8566dqi.e(dVar.b(c2).b());
        e4 = C8566dqi.e(aVar.b(e3).e(j4).d());
        a = e4;
    }
}
