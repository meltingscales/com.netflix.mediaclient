package o;

import java.util.List;
import java.util.Map;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2829anU {
    private static final List<AbstractC9025hm> a;
    public static final C2829anU b = new C2829anU();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> h;

    public final List<AbstractC9025hm> a() {
        return h;
    }

    private C2829anU() {
    }

    static {
        List<AbstractC9025hm> j;
        List e2;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        Map b2;
        List<C9021hi> e3;
        List<AbstractC9025hm> e4;
        j = C8569dql.j(new C9018hf.a("gameId", C9019hg.d(C2949api.a.d())).d(), new C9018hf.a("isInPlaylist", C2945ape.b.b()).d());
        e = j;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("Game");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("unifiedEntityId", C9019hg.d(C2946apf.d.a())).d(), new C9017he.d("Game", e2).b(j).a());
        a = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("message", C9019hg.d(eVar.e())).d());
        c = j3;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("entity", C3375axm.a.e()).e(j2).d(), new C9018hf.a("errors", C9019hg.a(C9019hg.d(C3149atW.c.c()))).e(j3).d());
        d = j4;
        C9018hf.a aVar = new C9018hf.a("removeEntityFromPlaylist", C3152atZ.a.c());
        C9021hi.d dVar = new C9021hi.d("input");
        b2 = dqD.b(dpD.a("entityId", new C9027ho("gameId")));
        e3 = C8566dqi.e(dVar.b(b2).b());
        e4 = C8566dqi.e(aVar.b(e3).e(j4).d());
        h = e4;
    }
}
