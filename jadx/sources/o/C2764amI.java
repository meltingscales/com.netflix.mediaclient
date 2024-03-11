package o;

import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amI  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2764amI {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2764amI e = new C2764amI();

    public final List<AbstractC9025hm> b() {
        return a;
    }

    private C2764amI() {
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
        b = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("node", C2929apO.b.d()).e(j).d());
        d = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("edges", C9019hg.a((AbstractC9026hn) C2930apP.c.b())).e(j2).d());
        c = j3;
        C9018hf.a aVar = new C9018hf.a("availablePreferredSecondaryLocales", C2936apV.c.b());
        j4 = C8569dql.j(new C9021hi.d("after").b(), new C9021hi.d("first").b(), new C9021hi.d("sortBy").b("LOCALIZED_DISPLAY_NAME").b());
        e3 = C8566dqi.e(aVar.b(j4).e(j3).d());
        a = e3;
    }
}
