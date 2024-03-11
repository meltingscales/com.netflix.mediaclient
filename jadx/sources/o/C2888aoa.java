package o;

import java.util.List;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.aoa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2888aoa {
    public static final C2888aoa a = new C2888aoa();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;

    public final List<AbstractC9025hm> e() {
        return d;
    }

    private C2888aoa() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<C9021hi> e;
        List<AbstractC9025hm> e2;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("message", C9019hg.d(eVar.e())).d());
        c = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("success", C9019hg.d(C2945ape.b.b())).d(), new C9018hf.a("errors", C9019hg.a(C9019hg.d(C3210auf.d.d()))).e(j).d());
        b = j2;
        C9018hf.a aVar = new C9018hf.a("removeTitleProtection", C3213aui.d.b());
        e = C8566dqi.e(new C9021hi.d("input").b(new C9027ho("input")).b());
        e2 = C8566dqi.e(aVar.b(e).e(j2).d());
        d = e2;
    }
}
