package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.C2945ape;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.akc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2678akc {
    private static final List<AbstractC9025hm> a;
    public static final C2678akc b = new C2678akc();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> h;

    public final List<AbstractC9025hm> c() {
        return h;
    }

    private C2678akc() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List j3;
        Map c2;
        Map c3;
        List<C9021hi> e2;
        List<C9021hi> e3;
        List j4;
        List j5;
        List j6;
        List j7;
        List j8;
        List<AbstractC9025hm> j9;
        List<AbstractC9025hm> j10;
        List<AbstractC9025hm> j11;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2945ape.b bVar = C2945ape.b;
        j = C8569dql.j(d2, new C9018hf.a("hasNextPage", C9019hg.d(bVar.b())).d(), new C9018hf.a("endCursor", eVar.e()).d());
        c = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        d = j2;
        C2949api.c cVar = C2949api.a;
        C9018hf.a c4 = new C9018hf.a("artwork", C2951apk.b.b()).c("interestingArtworkSmall");
        C9021hi.d dVar = new C9021hi.d("params");
        Pair a2 = dpD.a("artworkType", "MERCH_STILL");
        Pair a3 = dpD.a("format", "WEBP");
        j3 = C8569dql.j("WEBP", "JPG");
        Pair a4 = dpD.a("formats", j3);
        c2 = dqE.c(dpD.a(InteractiveAnimation.ANIMATION_TYPE.WIDTH, new C9027ho("widthForEpisode")), dpD.a("matchStrategy", "CLOSEST"), dpD.a("scaleStrategy", "DEFAULT"));
        c3 = dqE.c(a2, a3, a4, dpD.a("dimension", c2));
        e2 = C8566dqi.e(dVar.b(c3).b());
        C9018hf.a c5 = new C9018hf.a("hasTitleBehavior", bVar.b()).c("isEpisodeNumberHidden");
        e3 = C8566dqi.e(new C9021hi.d("behavior").b("hiddenEpisodeNumbers").b());
        j4 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j5 = C8569dql.j("Episode", "Movie", "Supplemental");
        j6 = C8569dql.j("Episode", "Movie", "Supplemental");
        j7 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j8 = C8569dql.j("Episode", "Movie");
        j9 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d(), new C9018hf.a("unifiedEntityId", C9019hg.d(C2946apf.d.a())).d(), new C9018hf.a("isAvailable", bVar.b()).d(), new C9018hf.a("isPlayable", bVar.b()).d(), new C9018hf.a("isAvailableForDownload", bVar.b()).d(), new C9018hf.a("availabilityDateMessaging", eVar.e()).d(), new C9018hf.a("synopsis", eVar.e()).d(), c4.b(e2).e(j2).d(), c5.b(e3).d(), new C9018hf.a("number", cVar.d()).d(), new C9018hf.a("displayNewBadge", bVar.b()).d(), new C9018hf.a("isInRemindMeList", bVar.b()).d(), new C9017he.d("Video", j4).b(C2603ajG.c.b()).a(), new C9017he.d("Viewable", j5).b(C2604ajH.b.d()).a(), new C9017he.d("Viewable", j6).b(C2606ajJ.c.d()).a(), new C9017he.d("Video", j7).b(C2691akp.a.b()).a(), new C9017he.d("LiveEventViewable", j8).b(C2679akd.e.e()).a());
        e = j9;
        j10 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("node", C2879aoR.b.c()).e(j9).d());
        a = j10;
        j11 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("totalCount", cVar.d()).d(), new C9018hf.a("pageInfo", C3060arn.b.e()).e(j).d(), new C9018hf.a("edges", C9019hg.a((AbstractC9026hn) C2877aoP.c.d())).e(j10).d());
        h = j11;
    }
}
