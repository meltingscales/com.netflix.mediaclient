package o;

import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.aod  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2891aod {
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2891aod e = new C2891aod();

    public final List<AbstractC9025hm> d() {
        return b;
    }

    private C2891aod() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<C9021hi> e3;
        List<AbstractC9025hm> e4;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("Profile");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Profile", e2).b(C2800ams.b.e()).a());
        d = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("profile", C3137atK.a.d()).e(j).d());
        c = j2;
        C9018hf.a aVar = new C9018hf.a("setProfileAccessPin", C3220aup.a.e());
        e3 = C8566dqi.e(new C9021hi.d("input").b(new C9027ho("input")).b());
        e4 = C8566dqi.e(aVar.b(e3).e(j2).d());
        b = e4;
    }
}
