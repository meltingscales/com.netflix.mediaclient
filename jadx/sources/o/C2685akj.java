package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import java.util.Map;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.akj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2685akj {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2685akj d = new C2685akj();
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> i;

    public final List<AbstractC9025hm> b() {
        return c;
    }

    private C2685akj() {
    }

    static {
        List<AbstractC9025hm> e2;
        List<AbstractC9025hm> j;
        List j2;
        List<C9021hi> e3;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        Map b2;
        List<C9021hi> e4;
        List<AbstractC9025hm> j5;
        C2949api.c cVar = C2949api.a;
        e2 = C8566dqi.e(new C9018hf.a("runtimeSec", cVar.d()).d());
        e = e2;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d());
        b = j;
        j2 = C8569dql.j("Episode", "Movie", "Supplemental");
        C9018hf.a aVar = new C9018hf.a("artwork", C2951apk.b.b());
        e3 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForGamesTrailerStillImage")).b());
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d(), new C9017he.d("Viewable", j2).b(e2).a(), aVar.b(e3).e(j).d());
        i = j3;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("video", C3378axp.e.d()).e(j3).d());
        a = j4;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d3 = new C9018hf.a("gameId", C9019hg.d(cVar.d())).d();
        C9018hf.a c2 = new C9018hf.a("promoVideo", C3146atT.c.e()).c("recommendedTrailer");
        C9021hi.d dVar = new C9021hi.d("context");
        b2 = dqD.b(dpD.a("uiContext", "BROWSE"));
        e4 = C8566dqi.e(dVar.b(b2).b());
        j5 = C8569dql.j(d2, d3, c2.b(e4).e(j4).d());
        c = j5;
    }
}
