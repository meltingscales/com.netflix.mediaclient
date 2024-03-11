package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2858anx {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final C2858anx c = new C2858anx();
    private static final List<AbstractC9025hm> d;

    public final List<AbstractC9025hm> d() {
        return a;
    }

    private C2858anx() {
    }

    static {
        List j;
        List<AbstractC9025hm> e;
        List j2;
        List<AbstractC9025hm> j3;
        List j4;
        Map c2;
        List j5;
        Map c3;
        List j6;
        Map c4;
        List j7;
        Map c5;
        Map b2;
        Map c6;
        List<C9021hi> j8;
        List<AbstractC9025hm> e2;
        j = C8569dql.j("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage");
        e = C8566dqi.e(new C9017he.d("PinotSectionListPage", j).b(C2706alD.b.d()).a());
        b = e;
        j2 = C8569dql.j("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("PinotSectionListPage", j2).b(e).a());
        d = j3;
        C9018hf.a aVar = new C9018hf.a("pinotPreQuerySearchPage", C3162atj.e.c());
        C9021hi b3 = new C9021hi.d("input").b();
        C9021hi.d dVar = new C9021hi.d("options");
        Pair a2 = dpD.a("sectionKind", "List");
        j4 = C8569dql.j("Video", "Game");
        c2 = dqE.c(a2, dpD.a("supportedEntityKinds", j4));
        Pair a3 = dpD.a("sectionKind", "Gallery");
        j5 = C8569dql.j("Video", "Game");
        c3 = dqE.c(a3, dpD.a("supportedEntityKinds", j5));
        Pair a4 = dpD.a("sectionKind", "Carousel");
        j6 = C8569dql.j("Video", "Game");
        c4 = dqE.c(a4, dpD.a("supportedEntityKinds", j6));
        j7 = C8569dql.j(c2, c3, c4);
        c5 = dqE.c(dpD.a("supportedSectionKinds", j7), dpD.a("supportIrmaEntity", new C9027ho("supportIrmaEntity")));
        Pair a5 = dpD.a("clientCapabilities", c5);
        b2 = dqD.b(dpD.a(SignupConstants.Field.LANG_ID, new C9027ho("sessionId")));
        c6 = dqE.c(a5, dpD.a("session", b2));
        j8 = C8569dql.j(b3, dVar.b(c6).b());
        e2 = C8566dqi.e(aVar.b(j8).e(j3).d());
        a = e2;
    }
}
