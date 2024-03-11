package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.Da  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0799Da {
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final int d;
    public static final C0799Da e = new C0799Da();

    public final List<AbstractC9025hm> e() {
        return c;
    }

    private C0799Da() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<C9021hi> e3;
        List<AbstractC9025hm> e4;
        e2 = C8566dqi.e("CLCSScreen");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(EK.e.c())).d(), new C9017he.d("CLCSScreen", e2).b(CR.c.b()).a());
        b = j;
        C9018hf.a aVar = new C9018hf.a("clcsDemo", C0829Ee.b.c());
        e3 = C8566dqi.e(new C9021hi.d("demoName").b(new C9027ho("demoName")).b());
        e4 = C8566dqi.e(aVar.b(e3).e(j).d());
        c = e4;
        d = 8;
    }
}
