package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.Dd  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0802Dd {
    public static final C0802Dd a = new C0802Dd();
    public static final int b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> c() {
        return c;
    }

    private C0802Dd() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<C9021hi> j2;
        List<AbstractC9025hm> e3;
        e2 = C8566dqi.e("CLCSScreen");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(EK.e.c())).d(), new C9017he.d("CLCSScreen", e2).b(CR.c.b()).a());
        e = j;
        C9018hf.a aVar = new C9018hf.a("clcsHook", C0829Ee.b.c());
        j2 = C8569dql.j(new C9021hi.d("flowName").b(new C9027ho("flowName")).b(), new C9021hi.d("parameters").b(new C9027ho("parameters")).b());
        e3 = C8566dqi.e(aVar.b(j2).e(j).d());
        c = e3;
        b = 8;
    }
}
