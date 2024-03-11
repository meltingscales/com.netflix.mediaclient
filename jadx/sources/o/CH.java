package o;

import java.util.List;
import o.C9018hf;
import o.C9021hi;
import o.EK;

/* loaded from: classes2.dex */
public final class CH {
    public static final int a;
    private static final List<AbstractC9025hm> c;
    public static final CH e = new CH();

    public final List<AbstractC9025hm> a() {
        return c;
    }

    private CH() {
    }

    static {
        List<C9021hi> j;
        List<AbstractC9025hm> j2;
        EK.d dVar = EK.e;
        C9018hf d = new C9018hf.a("__typename", C9019hg.d(dVar.c())).d();
        C9018hf.a aVar = new C9018hf.a("value", dVar.c());
        j = C8569dql.j(new C9021hi.d("format").b(new C9027ho("format")).b(), new C9021hi.d("locale").b(new C9027ho("locale")).b());
        j2 = C8569dql.j(d, aVar.b(j).d());
        c = j2;
        a = 8;
    }
}
