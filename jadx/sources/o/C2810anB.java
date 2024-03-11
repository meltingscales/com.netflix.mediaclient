package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2810anB {
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2810anB e = new C2810anB();

    public final List<AbstractC9025hm> a() {
        return c;
    }

    private C2810anB() {
    }

    static {
        List j;
        List<AbstractC9025hm> e2;
        List j2;
        List<AbstractC9025hm> j3;
        Map b2;
        Map c2;
        List<C9021hi> j4;
        List<AbstractC9025hm> e3;
        j = C8569dql.j("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage");
        e2 = C8566dqi.e(new C9017he.d("PinotSectionListPage", j).b(C2708alF.d.e()).a());
        d = e2;
        j2 = C8569dql.j("PinotDefaultBrowsePage", "PinotDefaultEntitySearchPage", "PinotDefaultGamesSdkPage", "PinotDefaultHomePage", "PinotDefaultPostPlayPage", "PinotDefaultPrePlayPage", "PinotDefaultPreQuerySearchPage", "PinotDefaultQuerySearchPage");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("PinotSectionListPage", j2).b(e2).a());
        b = j3;
        C9018hf.a aVar = new C9018hf.a("pinotPreQuerySearchPage", C3162atj.e.c());
        C9021hi b3 = new C9021hi.d("input").b();
        C9021hi.d dVar = new C9021hi.d("options");
        Pair a = dpD.a("clientCapabilities", new C9027ho("clientCapabilities"));
        b2 = dqD.b(dpD.a(SignupConstants.Field.LANG_ID, new C9027ho("sessionId")));
        c2 = dqE.c(a, dpD.a("session", b2), dpD.a("pageCapabilities", new C9027ho("pageCapabilities")));
        j4 = C8569dql.j(b3, dVar.b(c2).b());
        e3 = C8566dqi.e(aVar.b(j4).e(j3).d());
        c = e3;
    }
}
