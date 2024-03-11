package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2814anF {
    public static final C2814anF b = new C2814anF();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> c() {
        return c;
    }

    private C2814anF() {
    }

    static {
        List j;
        List<AbstractC9025hm> e2;
        List j2;
        List<AbstractC9025hm> j3;
        List<C9021hi> e3;
        List<AbstractC9025hm> e4;
        j = C8569dql.j("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage");
        e2 = C8566dqi.e(new C9017he.d("PinotSectionListPage", j).b(C2706alD.b.d()).a());
        d = e2;
        j2 = C8569dql.j("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("PinotSectionListPage", j2).b(e2).a());
        e = j3;
        C9018hf.a aVar = new C9018hf.a("fetchPinotSearchPage", C3167ato.a.d());
        e3 = C8566dqi.e(new C9021hi.d("pageId").b(new C9027ho("pageId")).b());
        e4 = C8566dqi.e(aVar.b(e3).e(j3).d());
        c = e4;
    }
}
