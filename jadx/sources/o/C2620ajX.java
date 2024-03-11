package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import java.util.Map;
import o.C2945ape;
import o.C2951apk;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.ajX  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2620ajX {
    private static final List<AbstractC9025hm> a;
    public static final C2620ajX b = new C2620ajX();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> i;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> d() {
        return i;
    }

    private C2620ajX() {
    }

    static {
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        List<AbstractC9025hm> e2;
        List j6;
        List e3;
        List e4;
        List<AbstractC9025hm> j7;
        List<AbstractC9025hm> j8;
        List<AbstractC9025hm> j9;
        Map b2;
        List<C9021hi> e5;
        List<C9021hi> e6;
        List<C9021hi> e7;
        List<C9021hi> e8;
        List<AbstractC9025hm> j10;
        C2954apn.e eVar = C2954apn.c;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("actionKind", eVar.e()).d());
        c = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("text", eVar.e()).d(), new C9018hf.a("evidenceKey", eVar.e()).d());
        g = j3;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d3 = new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d();
        C9018hf d4 = new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d();
        C2945ape.b bVar = C2945ape.b;
        j4 = C8569dql.j(d2, d3, d4, new C9018hf.a("available", bVar.b()).d());
        e = j4;
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("modes", C9019hg.a(C9019hg.d(eVar.e()))).d());
        j = j5;
        e2 = C8566dqi.e(new C9018hf.a("features", C2941apa.d.a()).e(j5).d());
        f = e2;
        j6 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        e3 = C8566dqi.e("Game");
        e4 = C8566dqi.e("Game");
        j7 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Video", j6).b(C2676aka.b.a()).a(), new C9017he.d("Game", e3).b(C2617ajU.e.d()).a(), new C9017he.d("Game", e4).b(e2).a());
        h = j7;
        j8 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a("available", bVar.b()).d());
        d = j8;
        j9 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a("available", bVar.b()).d());
        a = j9;
        C9018hf d5 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d6 = new C9018hf.a("description", eVar.e()).d();
        C9018hf d7 = new C9018hf.a("videoMerchComputeId", eVar.e()).d();
        C9018hf d8 = new C9018hf.a("actions", C9019hg.a((AbstractC9026hn) C3006aqm.d.a())).e(j2).d();
        C9018hf d9 = new C9018hf.a("launchDate", C2873aoL.a.d()).d();
        C9018hf d10 = new C9018hf.a("promotedVideoId", C2949api.a.d()).d();
        C9018hf.a aVar = new C9018hf.a("contextualSynopsis", C2872aoK.d.c());
        C9021hi.d dVar = new C9021hi.d("context");
        b2 = dqD.b(dpD.a("textEvidenceUiContext", "COMING_SOON"));
        e5 = C8566dqi.e(dVar.b(b2).b());
        C9018hf d11 = aVar.b(e5).e(j3).d();
        C2951apk.b bVar2 = C2951apk.b;
        C9018hf.a c2 = new C9018hf.a("brandArtwork", bVar2.b()).c("brandAndGenreArtwork");
        e6 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForFeedBrandArtwork")).b());
        C9018hf d12 = c2.b(e6).e(j4).d();
        C9018hf d13 = new C9018hf.a("topNode", C3015aqv.a.e()).e(j7).d();
        C9018hf.a c3 = new C9018hf.a("artwork", bVar2.b()).c("horzDispImage");
        e7 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForFeedHorizontalDisplayImage")).b());
        C9018hf d14 = c3.b(e7).e(j8).d();
        C9018hf.a c4 = new C9018hf.a("artwork", bVar2.b()).c("titleTreatmentUnbranded");
        e8 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForFeedTitleTreatment")).b());
        j10 = C8569dql.j(d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, c4.b(e8).e(j9).d());
        i = j10;
    }
}
