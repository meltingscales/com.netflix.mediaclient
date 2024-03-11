package o;

import java.util.List;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2806amy {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final C2806amy d = new C2806amy();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> a() {
        return e;
    }

    private C2806amy() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<C9021hi> e2;
        List<AbstractC9025hm> e3;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("message", C9019hg.d(eVar.e())).d());
        b = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("success", C9019hg.d(C2945ape.b.b())).d(), new C9018hf.a("errors", C9019hg.a(C9019hg.d(C2905aor.d.d()))).e(j).d());
        a = j2;
        C9018hf.a aVar = new C9018hf.a("addTitleProtection", C2909aov.e.d());
        e2 = C8566dqi.e(new C9021hi.d("input").b(new C9027ho("input")).b());
        e3 = C8566dqi.e(aVar.b(e2).e(j2).d());
        e = e3;
    }
}
