package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2945ape;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.ajP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2612ajP {
    public static final C2612ajP b = new C2612ajP();
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> a() {
        return d;
    }

    private C2612ajP() {
    }

    static {
        List<AbstractC9025hm> j;
        List<C9021hi> e2;
        List j2;
        List<C9021hi> e3;
        List j3;
        List<AbstractC9025hm> j4;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        e = j;
        C2949api.c cVar = C2949api.a;
        C2945ape.b bVar = C2945ape.b;
        C9018hf.a aVar = new C9018hf.a("hasTitleBehavior", bVar.b());
        e2 = C8566dqi.e(new C9021hi.d("behavior").b("hiddenEpisodeNumbers").b());
        j2 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        C9018hf.a c = new C9018hf.a("artwork", C2951apk.b.b()).c("interestingArtworkSmall");
        e3 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("artworkParamsForInterestingSmall")).b());
        j3 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d(), new C9018hf.a("number", cVar.d()).d(), aVar.b(e2).d(), new C9017he.d("Video", j2).b(C2603ajG.c.b()).a(), new C9018hf.a("displayNewBadge", bVar.b()).d(), new C9018hf.a("availabilityDateMessaging", eVar.e()).d(), c.b(e3).e(j).d(), new C9017he.d("Video", j3).b(C2714alL.d.b()).a());
        d = j4;
    }
}
