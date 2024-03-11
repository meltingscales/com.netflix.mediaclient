package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.ajO  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2611ajO {
    private static final List<AbstractC9025hm> b;
    public static final C2611ajO d = new C2611ajO();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> e() {
        return b;
    }

    private C2611ajO() {
    }

    static {
        List<AbstractC9025hm> j;
        List j2;
        List j3;
        List j4;
        List j5;
        List j6;
        List e2;
        List<AbstractC9025hm> j7;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j = C8569dql.j(d2, new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d(), new C9018hf.a("numSeasonsLabel", eVar.e()).d());
        e = j;
        j2 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j3 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j4 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j5 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j6 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        e2 = C8566dqi.e("Show");
        j7 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Video", j2).b(C2794amm.d.c()).a(), new C9017he.d("Video", j3).b(C2710alH.a.b()).a(), new C9017he.d("Video", j4).b(C2787amf.b.a()).a(), new C9017he.d("Video", j5).b(C2788amg.b.c()).a(), new C9017he.d("Video", j6).b(C2790ami.e.d()).a(), new C9018hf.a("latestYear", cVar.d()).d(), new C9018hf.a("shortSynopsis", eVar.e()).d(), new C9017he.d("Show", e2).b(j).a(), new C9018hf.a("supportsInteractiveExperiences", C2945ape.b.b()).d());
        b = j7;
    }
}
