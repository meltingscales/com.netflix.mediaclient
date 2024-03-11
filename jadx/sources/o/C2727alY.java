package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.alY  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2727alY {
    private static final List<AbstractC9025hm> b;
    public static final C2727alY c = new C2727alY();
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> c() {
        return e;
    }

    private C2727alY() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<C9021hi> e2;
        List<C9021hi> j3;
        List<AbstractC9025hm> j4;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j = C8569dql.j(d2, new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d());
        b = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("totalCount", cVar.d()).d());
        d = j2;
        C9018hf d3 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d4 = new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d();
        C9018hf d5 = new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d();
        C9018hf d6 = new C9018hf.a("unifiedEntityId", C9019hg.d(C2946apf.d.a())).d();
        C9018hf d7 = new C9018hf.a("number", cVar.d()).d();
        C9018hf.a c2 = new C9018hf.a("numberLabelV2", eVar.e()).c("seasonSeq");
        e2 = C8566dqi.e(new C9021hi.d("label").b("ABBR").b());
        C9018hf d8 = c2.b(e2).d();
        C9018hf d9 = new C9018hf.a("releaseYear", cVar.d()).d();
        C9018hf d10 = new C9018hf.a("parentShow", C3226auv.e.e()).e(j).d();
        C9018hf.a c3 = new C9018hf.a("episodes", C2886aoY.d.c()).c("episodesToGetCount");
        j3 = C8569dql.j(new C9021hi.d("after").b(), new C9021hi.d("first").b(10).b(), new C9021hi.d("includeUpcomingEpisodes").b());
        j4 = C8569dql.j(d3, d4, d5, d6, d7, d8, d9, d10, c3.b(j3).e(j2).d());
        e = j4;
    }
}
