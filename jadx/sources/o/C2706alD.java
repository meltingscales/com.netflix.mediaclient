package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import o.C2946apf;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.alD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2706alD {
    private static final List<AbstractC9025hm> a;
    public static final C2706alD b = new C2706alD();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> i;

    public final List<AbstractC9025hm> d() {
        return c;
    }

    private C2706alD() {
    }

    static {
        List<AbstractC9025hm> j;
        List j2;
        List e2;
        List e3;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        List<AbstractC9025hm> j6;
        List<C9021hi> j7;
        List<AbstractC9025hm> j8;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2946apf.a aVar = C2946apf.d;
        j = C8569dql.j(d2, new C9018hf.a(Payload.PARAM_RENO_REQUEST_ID, C9019hg.d(aVar.a())).d());
        i = j;
        j2 = C8569dql.j("PinotCarouselSection", "PinotCreatorHomeSection", "PinotEntityNameListSection", "PinotGallerySection", "PinotListSection", "PinotPopularSearchesListSection", "PinotSearchHintsSection");
        e2 = C8566dqi.e("PinotPopularSearchesListSection");
        e3 = C8566dqi.e("PinotCreatorHomeSection");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("PinotEntityCollectionSection", j2).b(C2703alA.a.e()).a(), new C9017he.d("PinotPopularSearchesListSection", e2).b(C2705alC.e.a()).a(), new C9017he.d("PinotCreatorHomeSection", e3).b(C2754alz.c.b()).a());
        e = j3;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("cursor", C9019hg.d(eVar.e())).d(), new C9018hf.a("node", C3169atq.d.d()).e(j3).d());
        a = j4;
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("hasNextPage", C9019hg.d(C2945ape.b.b())).d());
        d = j5;
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("totalCount", C9019hg.d(C2949api.a.d())).d(), new C9018hf.a("edges", C9019hg.a(C9019hg.d(C3173atu.a.b()))).e(j4).d(), new C9018hf.a("pageInfo", C9019hg.d(C3060arn.b.e())).e(j5).d());
        f = j6;
        C9018hf d3 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d4 = new C9018hf.a(SignupConstants.Field.LANG_ID, C9019hg.d(aVar.a())).d();
        C9018hf d5 = new C9018hf.a("sessionId", aVar.a()).d();
        C9018hf d6 = new C9018hf.a("expires", C2873aoL.a.d()).d();
        C9018hf d7 = new C9018hf.a("trackingInfo", C3154atb.d.c()).e(j).d();
        C9018hf.a c2 = new C9018hf.a("sections", C3170atr.a.d()).c("sections");
        j7 = C8569dql.j(new C9021hi.d("after").b(new C9027ho("sectionCursor")).b(), new C9021hi.d("first").b(new C9027ho("first_sections")).b(), new C9021hi.d("pageVersion").b());
        j8 = C8569dql.j(d3, d4, d5, d6, d7, c2.b(j7).e(j6).d());
        c = j8;
    }
}
