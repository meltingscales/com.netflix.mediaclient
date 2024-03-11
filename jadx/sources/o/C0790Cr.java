package o;

import java.util.List;
import o.C9018hf;
import o.EK;

/* renamed from: o.Cr  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0790Cr {
    public static final C0790Cr c = new C0790Cr();
    private static final List<AbstractC9025hm> d;
    public static final int e;

    public final List<AbstractC9025hm> a() {
        return d;
    }

    private C0790Cr() {
    }

    static {
        List<AbstractC9025hm> j;
        EK.d dVar = EK.e;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("token", C9019hg.d(dVar.c())).d());
        d = j;
        e = 8;
    }
}
