package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2842anh {
    public static final C2842anh b = new C2842anh();
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> e() {
        return e;
    }

    private C2842anh() {
    }

    static {
        List j;
        List j2;
        List<AbstractC9025hm> j3;
        List<C9021hi> e2;
        List<AbstractC9025hm> e3;
        j = C8569dql.j("PinotCarouselSection", "PinotCreatorHomeSection", "PinotEntityNameListSection", "PinotGallerySection", "PinotListSection", "PinotPopularSearchesListSection", "PinotSearchHintsSection");
        j2 = C8569dql.j("PinotCarouselSection", "PinotGallerySection", "PinotListSection", "PinotSingleItemSection");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("PinotEntityCollectionSection", j).b(C2693akr.a.d()).a(), new C9017he.d("PinotBaseSection", j2).b(C2690ako.e.d()).a());
        d = j3;
        C9018hf.a aVar = new C9018hf.a("pinotSectionByCursor", C3169atq.d.d());
        e2 = C8566dqi.e(new C9021hi.d("sectionCursor").b(new C9027ho("sectionCursor")).b());
        e3 = C8566dqi.e(aVar.b(e2).e(j3).d());
        e = e3;
    }
}
