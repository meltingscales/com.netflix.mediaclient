package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2946apf;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.alx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2752alx {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2752alx d = new C2752alx();
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> i;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> b() {
        return g;
    }

    private C2752alx() {
    }

    static {
        List j2;
        List<AbstractC9025hm> e2;
        List e3;
        List e4;
        List<AbstractC9025hm> j3;
        List j4;
        List e5;
        List<AbstractC9025hm> j5;
        List<AbstractC9025hm> e6;
        List<AbstractC9025hm> j6;
        List<C9021hi> e7;
        List<AbstractC9025hm> j7;
        List<AbstractC9025hm> e8;
        List<AbstractC9025hm> j8;
        List j9;
        List e9;
        List e10;
        List e11;
        List<AbstractC9025hm> j10;
        j2 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        e2 = C8566dqi.e(new C9017he.d("Video", j2).b(C2794amm.d.c()).a());
        i = e2;
        e3 = C8566dqi.e("Game");
        C9017he a2 = new C9017he.d("Game", e3).b(C2683akh.e.a()).a();
        e4 = C8566dqi.e("Game");
        j3 = C8569dql.j(a2, new C9017he.d("Game", e4).b(C2622ajZ.a.c()).a());
        a = j3;
        C2954apn.e eVar = C2954apn.c;
        C2946apf.a aVar = C2946apf.d;
        j4 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        e5 = C8566dqi.e("Game");
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("unifiedEntityId", C9019hg.d(aVar.a())).d(), new C9017he.d("Video", j4).b(e2).a(), new C9017he.d("Game", e5).b(j3).a());
        h = j5;
        e6 = C8566dqi.e(new C9018hf.a("unifiedEntity", C3375axm.a.e()).e(j5).d());
        j = e6;
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        c = j6;
        C9018hf d2 = new C9018hf.a("displayString", eVar.e()).d();
        C9018hf.a aVar2 = new C9018hf.a("artwork", C3094asU.a.e());
        e7 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForLocalizedBoxart")).b());
        j7 = C8569dql.j(d2, aVar2.b(e7).e(j6).d());
        b = j7;
        e8 = C8566dqi.e(new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d());
        e = e8;
        j8 = C8569dql.j(new C9018hf.a("displayString", eVar.e()).d(), new C9018hf.a("unifiedEntityId", C9019hg.d(aVar.a())).d());
        f = j8;
        j9 = C8569dql.j("PinotAppIconBillboardEntityTreatment", "PinotAppIconEntityTreatment", "PinotAwardsBillboardEntityTreatment", "PinotBannerWithTrailerEntityTreatment", "PinotBasicSearchEntity", "PinotBoxShotEntityTreatment", "PinotBoxShotWithRankEntityTreatment", "PinotBoxshotWithReminderEntityTreatment", "PinotCharacterCircleEntityTreatment", "PinotContinueWatchingEntityTreatment", "PinotCreatorHomeEntityTreatment", "PinotDoubleWideBoxshotEntityTreatment", "PinotEpisodicBillboardEntityTreatment", "PinotHorizontalArtworkWithPlaybackEntityTreatment", "PinotStandardBillboardEntityTreatment", "PinotTallPanelEntityTreatment", "PinotTitleCardWithCharacterEntityTreatment", "PinotTrailerWithAppIconEntityTreatment", "PinotTripleWideBoxshotEntityTreatment");
        e9 = C8566dqi.e("PinotBasicSearchEntity");
        e10 = C8566dqi.e("IrmaAndroidPreQuerySearchEntityTreatment");
        e11 = C8566dqi.e("PinotTextEntity");
        j10 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("PinotUnifiedEntityContainer", j9).b(e6).a(), new C9017he.d("PinotBasicSearchEntity", e9).b(j7).a(), new C9017he.d("IrmaAndroidPreQuerySearchEntityTreatment", e10).b(e8).a(), new C9017he.d("PinotTextEntity", e11).b(j8).a());
        g = j10;
    }
}
