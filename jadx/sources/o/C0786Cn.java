package o;

import java.util.List;
import o.C9018hf;
import o.EK;

/* renamed from: o.Cn  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0786Cn {
    public static final int a;
    private static final List<AbstractC9025hm> c;
    public static final C0786Cn d = new C0786Cn();

    public final List<AbstractC9025hm> b() {
        return c;
    }

    private C0786Cn() {
    }

    static {
        List<AbstractC9025hm> j;
        EK.d dVar = EK.e;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("token", C9019hg.d(dVar.c())).d());
        c = j;
        a = 8;
    }
}
