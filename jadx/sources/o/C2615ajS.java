package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2945ape;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.ajS  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2615ajS {
    public static final C2615ajS a = new C2615ajS();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> a() {
        return d;
    }

    private C2615ajS() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List e2;
        List<C9021hi> e3;
        List<C9021hi> e4;
        List j3;
        List j4;
        List j5;
        List j6;
        List j7;
        List<AbstractC9025hm> j8;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("availabilityDateMessaging", eVar.e()).d();
        C9018hf d3 = new C9018hf.a("number", C2949api.a.d()).d();
        C2945ape.b bVar = C2945ape.b;
        j = C8569dql.j(d2, d3, new C9018hf.a("displayNewBadge", bVar.b()).d());
        e = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        b = j2;
        e2 = C8566dqi.e("Episode");
        C9018hf.a c = new C9018hf.a("artwork", C2951apk.b.b()).c("interestingSmallArtwork");
        e3 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("artworkParamsForInterestingSmall")).b());
        C9018hf.a c2 = new C9018hf.a("hasTitleBehavior", bVar.b()).c("isEpisodeNumberHidden");
        e4 = C8566dqi.e(new C9021hi.d("behavior").b("hiddenEpisodeNumbers").b());
        j3 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j4 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j5 = C8569dql.j("Episode", "Movie", "Supplemental");
        j6 = C8569dql.j("Episode", "Movie", "Supplemental");
        j7 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j8 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Episode", e2).b(j).a(), new C9018hf.a("isAvailable", bVar.b()).d(), new C9018hf.a("synopsis", eVar.e()).d(), c.b(e3).e(j2).d(), c2.b(e4).d(), new C9017he.d("Video", j3).b(C2794amm.d.c()).a(), new C9017he.d("Video", j4).b(C2603ajG.c.b()).a(), new C9017he.d("Viewable", j5).b(C2604ajH.b.d()).a(), new C9017he.d("Viewable", j6).b(C2606ajJ.c.d()).a(), new C9017he.d("Video", j7).b(C2691akp.a.b()).a());
        d = j8;
    }
}
