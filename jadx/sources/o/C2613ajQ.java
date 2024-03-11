package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.ajQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2613ajQ {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2613ajQ e = new C2613ajQ();

    public final List<AbstractC9025hm> a() {
        return d;
    }

    private C2613ajQ() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<C9021hi> j4;
        List<AbstractC9025hm> j5;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("Episode");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Episode", e2).b(C2612ajP.b.a()).a());
        c = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("cursor", eVar.e()).d(), new C9018hf.a("node", C2879aoR.b.c()).e(j).d());
        a = j2;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j3 = C8569dql.j(d2, new C9018hf.a("totalCount", cVar.d()).d(), new C9018hf.a("edges", C9019hg.a((AbstractC9026hn) C2877aoP.c.d())).e(j2).d());
        b = j3;
        C9018hf d3 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d4 = new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d();
        C9018hf.a aVar = new C9018hf.a("episodes", C2886aoY.d.c());
        j4 = C8569dql.j(new C9021hi.d("after").b(new C9027ho("episodeFromCursor")).b(), new C9021hi.d("first").b(new C9027ho("episodeCount")).b(), new C9021hi.d("includeUpcomingEpisodes").b());
        j5 = C8569dql.j(d3, d4, aVar.b(j4).e(j3).d());
        d = j5;
    }
}
