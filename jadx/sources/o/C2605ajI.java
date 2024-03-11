package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.ajI  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2605ajI {
    public static final C2605ajI b = new C2605ajI();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> e() {
        return c;
    }

    private C2605ajI() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("Season");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Season", e2).b(C2727alY.c.c()).a());
        e = j;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j2 = C8569dql.j(d2, new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d(), new C9018hf.a("number", cVar.d()).d(), new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d(), new C9018hf.a("parentSeason", C3215auk.e.e()).e(j).d());
        d = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("currentEpisode", C2879aoR.b.c()).e(j2).d());
        c = j3;
    }
}
