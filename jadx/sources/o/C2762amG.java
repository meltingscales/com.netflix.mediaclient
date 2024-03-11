package o;

import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amG  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2762amG {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final C2762amG c = new C2762amG();
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> c() {
        return b;
    }

    private C2762amG() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<C9021hi> j4;
        List<AbstractC9025hm> e3;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("Locale");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Locale", e2).b(C2719alQ.e.b()).a());
        d = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("node", C2929apO.b.d()).e(j).d());
        e = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("edges", C9019hg.a((AbstractC9026hn) C2930apP.c.b())).e(j2).d());
        a = j3;
        C9018hf.a aVar = new C9018hf.a("availablePreferredLocales", C2936apV.c.b());
        j4 = C8569dql.j(new C9021hi.d("after").b(), new C9021hi.d("first").b(), new C9021hi.d("sortBy").b("LOCALIZED_DISPLAY_NAME").b());
        e3 = C8566dqi.e(aVar.b(j4).e(j3).d());
        b = e3;
    }
}
