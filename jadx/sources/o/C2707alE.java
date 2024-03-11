package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2946apf;
import o.C2951apk;
import o.C2954apn;
import o.C3074asA;
import o.C3375axm;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.alE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2707alE {
    public static final C2707alE a = new C2707alE();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> i;
    private static final List<AbstractC9025hm> j;
    private static final List<AbstractC9025hm> k;
    private static final List<AbstractC9025hm> l;
    private static final List<AbstractC9025hm> m;
    private static final List<AbstractC9025hm> n;

    /* renamed from: o  reason: collision with root package name */
    private static final List<AbstractC9025hm> f13474o;
    private static final List<AbstractC9025hm> p;
    private static final List<AbstractC9025hm> q;
    private static final List<AbstractC9025hm> s;
    private static final List<AbstractC9025hm> t;

    public final List<AbstractC9025hm> d() {
        return s;
    }

    private C2707alE() {
    }

    static {
        List<AbstractC9025hm> j2;
        List<C9021hi> e2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        List<C9021hi> e3;
        List<AbstractC9025hm> j6;
        List j7;
        List<AbstractC9025hm> e4;
        List j8;
        List<AbstractC9025hm> j9;
        List<AbstractC9025hm> j10;
        List<AbstractC9025hm> j11;
        List<C9021hi> e5;
        List<AbstractC9025hm> j12;
        List<AbstractC9025hm> j13;
        List<AbstractC9025hm> j14;
        List j15;
        List<AbstractC9025hm> e6;
        List e7;
        List<AbstractC9025hm> e8;
        List j16;
        List e9;
        List<AbstractC9025hm> j17;
        List<AbstractC9025hm> j18;
        List<AbstractC9025hm> j19;
        List e10;
        List e11;
        List e12;
        List e13;
        List j20;
        List e14;
        List<AbstractC9025hm> j21;
        C2954apn.e eVar = C2954apn.c;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        c = j2;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2951apk.b bVar = C2951apk.b;
        C9018hf.a aVar = new C9018hf.a("artwork", bVar.b());
        e2 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForLocalizedBoxart")).b());
        j3 = C8569dql.j(d2, aVar.b(e2).e(j2).d());
        d = j3;
        C9018hf d3 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C3074asA.c cVar = C3074asA.a;
        j4 = C8569dql.j(d3, new C9018hf.a("contextualArtwork", cVar.e()).e(j3).d());
        g = j4;
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        e = j5;
        C9018hf d4 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf.a aVar2 = new C9018hf.a("artwork", bVar.b());
        e3 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForPQS")).b());
        j6 = C8569dql.j(d4, aVar2.b(e3).e(j5).d());
        j = j6;
        j7 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        e4 = C8566dqi.e(new C9017he.d("Video", j7).b(C2710alH.a.b()).a());
        l = e4;
        C2946apf.a aVar3 = C2946apf.d;
        j8 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j9 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("unifiedEntityId", C9019hg.d(aVar3.a())).d(), new C9017he.d("Video", j8).b(e4).a());
        q = j9;
        C9018hf d5 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d6 = new C9018hf.a("contextualArtwork", cVar.e()).e(j6).d();
        C3375axm.b bVar2 = C3375axm.a;
        j10 = C8569dql.j(d5, d6, new C9018hf.a("unifiedEntity", bVar2.e()).e(j9).d());
        f13474o = j10;
        j11 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        b = j11;
        C9018hf d7 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf.a aVar4 = new C9018hf.a("artwork", bVar.b());
        e5 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForGamesIcon")).b());
        j12 = C8569dql.j(d7, aVar4.b(e5).e(j11).d());
        h = j12;
        j13 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("contextualArtwork", cVar.e()).e(j12).d());
        i = j13;
        j14 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("displayString", eVar.e()).d(), new C9018hf.a("showCollectionIcon", C2945ape.b.b()).d(), new C9018hf.a("suggestionEntityId", C9019hg.d(aVar3.a())).d());
        n = j14;
        j15 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        e6 = C8566dqi.e(new C9017he.d("Video", j15).b(C2794amm.d.c()).a());
        p = e6;
        e7 = C8566dqi.e("Game");
        e8 = C8566dqi.e(new C9017he.d("Game", e7).b(C2683akh.e.a()).a());
        f = e8;
        j16 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        e9 = C8566dqi.e("Game");
        j17 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("unifiedEntityId", C9019hg.d(aVar3.a())).d(), new C9017he.d("Video", j16).b(e6).a(), new C9017he.d("Game", e9).b(e8).a());
        t = j17;
        j18 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("unifiedEntity", bVar2.e()).e(j17).d(), new C9018hf.a("displayString", eVar.e()).d());
        k = j18;
        j19 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("displayString", eVar.e()).d(), new C9018hf.a("unifiedEntityId", C9019hg.d(aVar3.a())).d());
        m = j19;
        e10 = C8566dqi.e("PinotBoxShotEntityTreatment");
        e11 = C8566dqi.e("PinotHorizontalArtworkWithPlaybackEntityTreatment");
        e12 = C8566dqi.e("PinotAppIconEntityTreatment");
        e13 = C8566dqi.e("PinotSuggestionEntityTreatment");
        j20 = C8569dql.j("PinotAppIconBillboardEntityTreatment", "PinotAppIconEntityTreatment", "PinotAwardsBillboardEntityTreatment", "PinotBannerWithTrailerEntityTreatment", "PinotBasicSearchEntity", "PinotBoxShotEntityTreatment", "PinotBoxShotWithRankEntityTreatment", "PinotBoxshotWithReminderEntityTreatment", "PinotCharacterCircleEntityTreatment", "PinotContinueWatchingEntityTreatment", "PinotCreatorHomeEntityTreatment", "PinotDoubleWideBoxshotEntityTreatment", "PinotEpisodicBillboardEntityTreatment", "PinotHorizontalArtworkWithPlaybackEntityTreatment", "PinotStandardBillboardEntityTreatment", "PinotTallPanelEntityTreatment", "PinotTitleCardWithCharacterEntityTreatment", "PinotTrailerWithAppIconEntityTreatment", "PinotTripleWideBoxshotEntityTreatment");
        e14 = C8566dqi.e("PinotTextEntity");
        j21 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("PinotBoxShotEntityTreatment", e10).b(j4).a(), new C9017he.d("PinotHorizontalArtworkWithPlaybackEntityTreatment", e11).b(j10).a(), new C9017he.d("PinotAppIconEntityTreatment", e12).b(j13).a(), new C9017he.d("PinotSuggestionEntityTreatment", e13).b(j14).a(), new C9017he.d("PinotUnifiedEntityContainer", j20).b(j18).a(), new C9017he.d("PinotTextEntity", e14).b(j19).a());
        s = j21;
    }
}
