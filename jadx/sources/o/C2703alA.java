package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.alA  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2703alA {
    public static final C2703alA a = new C2703alA();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> e() {
        return d;
    }

    private C2703alA() {
    }

    static {
        List j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<C9021hi> j5;
        List<AbstractC9025hm> j6;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j("PinotBasicSearchEntity", "PinotTextEntity", "PinotCreatorHomeEntityTreatment", "PinotAppIconBillboardEntityTreatment", "PinotAppIconEntityTreatment", "PinotAwardsBillboardEntityTreatment", "PinotBannerWithTrailerEntityTreatment", "PinotBoxShotEntityTreatment", "PinotBoxShotWithRankEntityTreatment", "PinotBoxshotWithReminderEntityTreatment", "PinotCharacterCircleEntityTreatment", "PinotContinueWatchingEntityTreatment", "PinotDoubleWideBoxshotEntityTreatment", "PinotEpisodicBillboardEntityTreatment", "PinotHorizontalArtworkWithPlaybackEntityTreatment", "PinotSuggestionEntityTreatment", "PinotTitleSuggestionEntityTreatment", "PinotTripleWideBoxshotEntityTreatment", "PinotStandardBillboardEntityTreatment", "PinotTallPanelEntityTreatment", "PinotTitleCardWithCharacterEntityTreatment", "PinotTrailerWithAppIconEntityTreatment", "IrmaAndroidPreQuerySearchEntityTreatment", "IrmaAppIconBillboardEntityTreatment", "IrmaAppIconEntityTreatment", "IrmaAwardsBillboardEntityTreatment", "IrmaBannerWithTrailerEntityTreatment", "IrmaBoxShotEntityTreatment", "IrmaBoxShotWithRankEntityTreatment", "IrmaBoxshotWithReminderEntityTreatment", "IrmaCharacterCircleEntityTreatment", "IrmaContinueWatchingEntityTreatment", "IrmaEpisodicBillboardEntityTreatment", "IrmaHorizontalArtworkWithPlaybackEntityTreatment", "IrmaStandardBillboardEntityTreatment", "IrmaTallPanelEntityTreatment", "IrmaTitleCardWithCharacterEntityTreatment", "IrmaTrailerWithAppIconEntityTreatment", "IrmaSuggestionEntityTreatment");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("PinotUIEntity", j).b(C2752alx.d.b()).a());
        c = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("cursor", C9019hg.d(eVar.e())).d(), new C9018hf.a("node", C3139atM.c.e()).e(j2).d());
        b = j3;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j4 = C8569dql.j(d2, new C9018hf.a("totalCount", C9019hg.d(cVar.d())).d(), new C9018hf.a("edges", C9019hg.a(C9019hg.d(C3089asP.a.a()))).e(j3).d());
        e = j4;
        C9018hf d3 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d4 = new C9018hf.a("trackId", cVar.d()).d();
        C9018hf d5 = new C9018hf.a("feature", eVar.e()).d();
        C9018hf d6 = new C9018hf.a(SignupConstants.Field.LANG_ID, C9019hg.d(C2946apf.d.a())).d();
        C9018hf d7 = new C9018hf.a("displayString", eVar.e()).d();
        C9018hf.a aVar = new C9018hf.a("entities", C3086asM.b.d());
        j5 = C8569dql.j(new C9021hi.d("after").b(new C9027ho("entityCursor")).b(), new C9021hi.d("first").b(new C9027ho("first_entities")).b(), new C9021hi.d("sectionVersion").b());
        j6 = C8569dql.j(d3, d4, d5, d6, d7, aVar.b(j5).e(j4).d());
        d = j6;
    }
}
