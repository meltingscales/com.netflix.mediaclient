package o;

import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.alS  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2721alS {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final C2721alS c = new C2721alS();
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> i;

    public final List<AbstractC9025hm> e() {
        return e;
    }

    private C2721alS() {
    }

    static {
        List<AbstractC9025hm> j;
        List j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        List<C9021hi> j6;
        List<AbstractC9025hm> j7;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(Payload.PARAM_RENO_REQUEST_ID, C9019hg.d(C2946apf.d.a())).d());
        i = j;
        j2 = C8569dql.j("PinotSingleItemSection", "PinotCarouselSection", "PinotCreatorHomeSection", "PinotGallerySection", "PinotListSection", "PinotEntityNameListSection", "PinotPopularSearchesListSection", "PinotPrePlayRecapSection", "PinotSearchHintsSection");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("PinotSection", j2).b(C2722alT.a.d()).a());
        a = j3;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("cursor", C9019hg.d(eVar.e())).d(), new C9018hf.a("node", C3169atq.d.d()).e(j3).d());
        d = j4;
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("totalCount", C9019hg.d(C2949api.a.d())).d(), new C9018hf.a("edges", C9019hg.a(C9019hg.d(C3173atu.a.b()))).e(j4).d());
        b = j5;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d3 = new C9018hf.a("trackingInfo", C3085asL.b.b()).e(j).d();
        C9018hf.a aVar = new C9018hf.a("sections", C3170atr.a.d());
        j6 = C8569dql.j(new C9021hi.d("after").b(), new C9021hi.d("first").b(new C9027ho("sectionCount")).b(), new C9021hi.d("pageVersion").b());
        j7 = C8569dql.j(d2, d3, aVar.b(j6).e(j5).d());
        e = j7;
    }
}
