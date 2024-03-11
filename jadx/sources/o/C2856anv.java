package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2856anv {
    public static final C2856anv a = new C2856anv();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> a() {
        return e;
    }

    private C2856anv() {
    }

    static {
        List j;
        List<AbstractC9025hm> e2;
        List j2;
        List<AbstractC9025hm> j3;
        Map b2;
        List e3;
        Map c2;
        List e4;
        Map c3;
        List e5;
        Map c4;
        List j4;
        Map b3;
        Map b4;
        Map c5;
        List<C9021hi> j5;
        List<AbstractC9025hm> e6;
        j = C8569dql.j("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage");
        e2 = C8566dqi.e(new C9017he.d("PinotSectionListPage", j).b(C2706alD.b.d()).a());
        b = e2;
        j2 = C8569dql.j("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("PinotSectionListPage", j2).b(e2).a());
        c = j3;
        C9018hf.a aVar = new C9018hf.a("pinotEntitySearchPage", C3088asO.b.d());
        C9021hi.d dVar = new C9021hi.d("input");
        b2 = dqD.b(dpD.a("entityId", new C9027ho("entityId")));
        C9021hi b5 = dVar.b(b2).b();
        C9021hi.d dVar2 = new C9021hi.d("options");
        Pair a2 = dpD.a("sectionKind", "List");
        e3 = C8566dqi.e("Video");
        c2 = dqE.c(a2, dpD.a("supportedEntityKinds", e3));
        Pair a3 = dpD.a("sectionKind", "Gallery");
        e4 = C8566dqi.e("Video");
        c3 = dqE.c(a3, dpD.a("supportedEntityKinds", e4));
        Pair a4 = dpD.a("sectionKind", "Carousel");
        e5 = C8566dqi.e("Video");
        c4 = dqE.c(a4, dpD.a("supportedEntityKinds", e5));
        j4 = C8569dql.j(c2, c3, c4);
        b3 = dqD.b(dpD.a("supportedSectionKinds", j4));
        Pair a5 = dpD.a("clientCapabilities", b3);
        b4 = dqD.b(dpD.a(SignupConstants.Field.LANG_ID, new C9027ho("sessionId")));
        c5 = dqE.c(a5, dpD.a("session", b4));
        j5 = C8569dql.j(b5, dVar2.b(c5).b());
        e6 = C8566dqi.e(aVar.b(j5).e(j3).d());
        e = e6;
    }
}
