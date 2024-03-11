package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.ajR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2614ajR {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2614ajR d = new C2614ajR();
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> h;

    public final List<AbstractC9025hm> d() {
        return h;
    }

    private C2614ajR() {
    }

    static {
        List j;
        List j2;
        List j3;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        List<AbstractC9025hm> j6;
        List<C9021hi> j7;
        List<AbstractC9025hm> j8;
        List e2;
        List<AbstractC9025hm> j9;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j2 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j3 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Video", j).b(C2615ajS.a.a()).a(), new C9017he.d("Video", j2).b(C2616ajT.e.c()).a(), new C9017he.d("Video", j3).b(C2716alN.c.c()).a(), new C9018hf.a("availabilityStartTime", C2873aoL.a.d()).d());
        b = j4;
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("cursor", eVar.e()).d(), new C9018hf.a("node", C2879aoR.b.c()).e(j4).d());
        e = j5;
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("edges", C9019hg.a((AbstractC9026hn) C2877aoP.c.d())).e(j5).d());
        a = j6;
        C9018hf d2 = new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d();
        C9018hf d3 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf.a aVar = new C9018hf.a("episodes", C2886aoY.d.c());
        j7 = C8569dql.j(new C9021hi.d("after").b(new C9027ho("startEpisodeCursor")).b(), new C9021hi.d("first").b(new C9027ho("numOfEpisodes")).b(), new C9021hi.d("includeUpcomingEpisodes").b(Boolean.TRUE).b());
        j8 = C8569dql.j(d2, d3, aVar.b(j7).e(j6).d());
        c = j8;
        e2 = C8566dqi.e("Season");
        j9 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Season", e2).b(j8).a());
        h = j9;
    }
}
