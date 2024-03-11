package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.graphql.models.type.PlaybackBadge;
import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.ajE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2601ajE {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final C2601ajE c = new C2601ajE();
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> b() {
        return a;
    }

    private C2601ajE() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> e2;
        List<AbstractC9025hm> j2;
        List j3;
        List j4;
        List j5;
        List j6;
        List j7;
        List e3;
        List e4;
        List<AbstractC9025hm> j8;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j = C8569dql.j(d2, new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d(), new C9018hf.a("artworkForegroundColor", eVar.e()).d());
        e = j;
        e2 = C8566dqi.e(new C9018hf.a("parentShow", C3226auv.e.e()).e(j).d());
        d = e2;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d(), new C9018hf.a("numSeasonsLabel", eVar.e()).d());
        b = j2;
        j3 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j4 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j5 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j6 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j7 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        e3 = C8566dqi.e("Episode");
        e4 = C8566dqi.e("Show");
        j8 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Video", j3).b(C2794amm.d.c()).a(), new C9017he.d("Video", j4).b(C2710alH.a.b()).a(), new C9017he.d("Video", j5).b(C2645ajw.d.b()).a(), new C9017he.d("Video", j6).b(C2788amg.b.c()).a(), new C9017he.d("Video", j7).b(C2796amo.b.a()).a(), new C9018hf.a("latestYear", cVar.d()).d(), new C9018hf.a("badges", C9019hg.a((AbstractC9026hn) eVar.e())).d(), new C9018hf.a("artworkForegroundColor", eVar.e()).d(), new C9017he.d("Episode", e3).b(e2).a(), new C9017he.d("Show", e4).b(j2).a(), new C9018hf.a("playbackBadges", C9019hg.a((AbstractC9026hn) PlaybackBadge.b.c())).d());
        a = j8;
    }
}
