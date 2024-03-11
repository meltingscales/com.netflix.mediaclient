package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import o.C2946apf;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.alF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2708alF {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2708alF d = new C2708alF();
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> e() {
        return e;
    }

    private C2708alF() {
    }

    static {
        List<AbstractC9025hm> j2;
        List j3;
        List j4;
        List<AbstractC9025hm> j5;
        List<AbstractC9025hm> j6;
        List<AbstractC9025hm> j7;
        List<AbstractC9025hm> j8;
        List<C9021hi> j9;
        List<AbstractC9025hm> j10;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2946apf.a aVar = C2946apf.d;
        j2 = C8569dql.j(d2, new C9018hf.a(Payload.PARAM_RENO_REQUEST_ID, C9019hg.d(aVar.a())).d());
        g = j2;
        j3 = C8569dql.j("PinotCarouselSection", "PinotCreatorHomeSection", "PinotEntityNameListSection", "PinotGallerySection", "PinotListSection", "PinotPopularSearchesListSection", "PinotSearchHintsSection");
        j4 = C8569dql.j("PinotCarouselSection", "PinotGallerySection", "PinotListSection", "PinotSingleItemSection");
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("PinotEntityCollectionSection", j3).b(C2751alw.d.d()).a(), new C9017he.d("PinotBaseSection", j4).b(C2753aly.c.d()).a());
        c = j5;
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("cursor", C9019hg.d(eVar.e())).d(), new C9018hf.a("node", C3169atq.d.d()).e(j5).d());
        b = j6;
        j7 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("hasNextPage", C9019hg.d(C2945ape.b.b())).d());
        a = j7;
        j8 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("totalCount", C9019hg.d(C2949api.a.d())).d(), new C9018hf.a("edges", C9019hg.a(C9019hg.d(C3173atu.a.b()))).e(j6).d(), new C9018hf.a("pageInfo", C9019hg.d(C3060arn.b.e())).e(j7).d());
        j = j8;
        C9018hf d3 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d4 = new C9018hf.a(SignupConstants.Field.LANG_ID, C9019hg.d(aVar.a())).d();
        C9018hf d5 = new C9018hf.a("sessionId", aVar.a()).d();
        C9018hf d6 = new C9018hf.a("expires", C2873aoL.a.d()).d();
        C9018hf d7 = new C9018hf.a("trackingInfo", C3154atb.d.c()).e(j2).d();
        C9018hf.a c2 = new C9018hf.a("sections", C3170atr.a.d()).c("sections");
        j9 = C8569dql.j(new C9021hi.d("after").b(new C9027ho("sectionCursor")).b(), new C9021hi.d("first").b(new C9027ho("first_sections")).b(), new C9021hi.d("pageVersion").b());
        j10 = C8569dql.j(d3, d4, d5, d6, d7, c2.b(j9).e(j8).d());
        e = j10;
    }
}
