package o;

import java.util.List;
import o.C9018hf;
import o.EK;

/* renamed from: o.Cx  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0796Cx {
    public static final int b;
    private static final List<AbstractC9025hm> c;
    public static final C0796Cx d = new C0796Cx();

    public final List<AbstractC9025hm> d() {
        return c;
    }

    private C0796Cx() {
    }

    static {
        List<AbstractC9025hm> j;
        EK.d dVar = EK.e;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("token", C9019hg.d(dVar.c())).d());
        c = j;
        b = 8;
    }
}
