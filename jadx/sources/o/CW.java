package o;

import java.util.List;
import o.C9018hf;
import o.EK;

/* loaded from: classes2.dex */
public final class CW {
    private static final List<AbstractC9025hm> b;
    public static final int d;
    public static final CW e = new CW();

    public final List<AbstractC9025hm> c() {
        return b;
    }

    private CW() {
    }

    static {
        List<AbstractC9025hm> j;
        EK.d dVar = EK.e;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("token", C9019hg.d(dVar.c())).d());
        b = j;
        d = 8;
    }
}
