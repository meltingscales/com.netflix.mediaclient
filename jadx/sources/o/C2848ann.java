package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import java.util.Map;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.ann  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2848ann {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2848ann e = new C2848ann();
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> i;

    public final List<AbstractC9025hm> d() {
        return h;
    }

    private C2848ann() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List j3;
        List j4;
        List j5;
        List<C9020hh> e2;
        List j6;
        List<C9020hh> e3;
        List<C9021hi> e4;
        List<AbstractC9025hm> j7;
        List<AbstractC9025hm> j8;
        List<AbstractC9025hm> j9;
        List<AbstractC9025hm> j10;
        List<C9021hi> e5;
        Map c2;
        List<C9021hi> e6;
        List<AbstractC9025hm> j11;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("startCursor", eVar.e()).d(), new C9018hf.a("endCursor", eVar.e()).d(), new C9018hf.a("hasNextPage", C9019hg.d(C2945ape.b.b())).d());
        i = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        c = j2;
        j3 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j4 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j5 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        C9017he.d dVar = new C9017he.d("Video", j5);
        e2 = C8566dqi.e(new C9020hh("includeLiveData", false));
        j6 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        C9017he.d dVar2 = new C9017he.d("Video", j6);
        e3 = C8566dqi.e(new C9020hh("includeLiveData", false));
        C9018hf.a aVar = new C9018hf.a("artwork", C2951apk.b.b());
        e4 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForBoxart")).b());
        j7 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d(), new C9017he.d("Video", j3).b(C2794amm.d.c()).a(), new C9017he.d("Video", j4).b(C2710alH.a.b()).a(), dVar.d(e2).b(C2700aky.b.e()).a(), dVar2.d(e3).b(C2701akz.e.b()).a(), aVar.b(e4).e(j2).d());
        g = j7;
        j8 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("cursor", eVar.e()).d(), new C9018hf.a("node", C3375axm.a.e()).e(j7).d());
        d = j8;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j9 = C8569dql.j(d2, new C9018hf.a("totalCount", cVar.d()).d(), new C9018hf.a("pageInfo", C3060arn.b.e()).e(j).d(), new C9018hf.a("edges", C9019hg.a((AbstractC9026hn) C2984aqQ.c.d())).e(j8).d());
        a = j9;
        j10 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(Payload.PARAM_RENO_REQUEST_ID, eVar.e()).d());
        b = j10;
        C9018hf.a aVar2 = new C9018hf.a("myList", C2986aqS.e.b());
        e5 = C8566dqi.e(new C9021hi.d("myListInput").b(new C9027ho("myListInput")).b());
        C9018hf d3 = aVar2.b(e5).e(j9).d();
        C9018hf d4 = new C9018hf.a("gatewayRequestDetails", C2887aoZ.b.a()).e(j10).d();
        C9018hf.a aVar3 = new C9018hf.a("trackId", C9019hg.d(cVar.d()));
        C9021hi.d dVar3 = new C9021hi.d("params");
        c2 = dqE.c(dpD.a("page", "LOLOMO"), dpD.a("row", "MyList"));
        e6 = C8566dqi.e(dVar3.b(c2).b());
        j11 = C8569dql.j(d3, d4, aVar3.b(e6).d());
        h = j11;
    }
}
