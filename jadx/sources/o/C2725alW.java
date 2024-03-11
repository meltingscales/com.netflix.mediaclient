package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import java.util.Map;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.alW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2725alW {
    public static final C2725alW a = new C2725alW();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> e() {
        return d;
    }

    private C2725alW() {
    }

    static {
        List<AbstractC9025hm> e2;
        List j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        Map b2;
        List<C9021hi> e3;
        List<AbstractC9025hm> j4;
        C2949api.c cVar = C2949api.a;
        e2 = C8566dqi.e(new C9018hf.a("runtimeSec", cVar.d()).d());
        e = e2;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j("Episode", "Movie", "Supplemental");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d(), new C9017he.d("Viewable", j).b(e2).a());
        c = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("video", C3378axp.e.d()).e(j2).d());
        b = j3;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf.a aVar = new C9018hf.a("promoVideo", C3146atT.c.e());
        C9021hi.d dVar = new C9021hi.d("context");
        b2 = dqD.b(dpD.a("uiContext", "BROWSE"));
        e3 = C8566dqi.e(dVar.b(b2).b());
        j4 = C8569dql.j(d2, aVar.b(e3).e(j3).d());
        d = j4;
    }
}
