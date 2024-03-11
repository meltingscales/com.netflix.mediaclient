package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2813anE {
    public static final C2813anE b = new C2813anE();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> e() {
        return e;
    }

    private C2813anE() {
    }

    static {
        List j;
        List<AbstractC9025hm> e2;
        List j2;
        List<AbstractC9025hm> j3;
        Map b2;
        Map c2;
        Map c3;
        Map c4;
        Map c5;
        Map c6;
        List j4;
        Map b3;
        Map b4;
        Map c7;
        List<C9021hi> j5;
        List<AbstractC9025hm> e3;
        j = C8569dql.j("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage");
        e2 = C8566dqi.e(new C9017he.d("PinotSectionListPage", j).b(C2706alD.b.d()).a());
        c = e2;
        j2 = C8569dql.j("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("PinotSectionListPage", j2).b(e2).a());
        d = j3;
        C9018hf.a aVar = new C9018hf.a("pinotQuerySearchPage", C3160ath.d.b());
        C9021hi.d dVar = new C9021hi.d("input");
        b2 = dqD.b(dpD.a("query", new C9027ho("query")));
        C9021hi b5 = dVar.b(b2).b();
        C9021hi.d dVar2 = new C9021hi.d("options");
        c2 = dqE.c(dpD.a("sectionKind", "List"), dpD.a("supportedEntityKinds", new C9027ho("supportedEntityKind")));
        c3 = dqE.c(dpD.a("sectionKind", "Gallery"), dpD.a("supportedEntityKinds", new C9027ho("supportedEntityKind")));
        c4 = dqE.c(dpD.a("sectionKind", "Carousel"), dpD.a("supportedEntityKinds", new C9027ho("supportedEntityKind")));
        c5 = dqE.c(dpD.a("sectionKind", "EntityNameList"), dpD.a("supportedEntityKinds", new C9027ho("supportedEntityKind")));
        c6 = dqE.c(dpD.a("sectionKind", "CreatorHome"), dpD.a("supportedEntityKinds", new C9027ho("supportedEntityKind")));
        j4 = C8569dql.j(c2, c3, c4, c5, c6);
        b3 = dqD.b(dpD.a("supportedSectionKinds", j4));
        Pair a = dpD.a("clientCapabilities", b3);
        b4 = dqD.b(dpD.a(SignupConstants.Field.LANG_ID, new C9027ho("sessionId")));
        c7 = dqE.c(a, dpD.a("session", b4));
        j5 = C8569dql.j(b5, dVar2.b(c7).b());
        e3 = C8566dqi.e(aVar.b(j5).e(j3).d());
        e = e3;
    }
}
