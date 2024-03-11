package o;

import java.util.List;
import o.C9018hf;
import o.C9021hi;
import o.EK;

/* loaded from: classes2.dex */
public final class CN {
    public static final CN c = new CN();
    public static final int d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> b() {
        return e;
    }

    private CN() {
    }

    static {
        List<C9021hi> e2;
        List<AbstractC9025hm> j;
        EK.d dVar = EK.e;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(dVar.c())).d();
        C9018hf.a aVar = new C9018hf.a("value", dVar.c());
        e2 = C8566dqi.e(new C9021hi.d("locale").b(new C9027ho("locale")).b());
        j = C8569dql.j(d2, aVar.b(e2).d());
        e = j;
        d = 8;
    }
}
