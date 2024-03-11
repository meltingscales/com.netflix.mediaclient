package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.EK;

/* loaded from: classes2.dex */
public final class CD {
    public static final int b;
    private static final List<AbstractC9025hm> c;
    public static final CD d = new CD();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> a() {
        return e;
    }

    private CD() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        EK.d dVar = EK.e;
        e2 = C8566dqi.e("CLCSDesignColor");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSDesignColor", e2).b(C0790Cr.c.a()).a());
        c = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("color", DC.d.d()).e(j).d());
        e = j2;
        b = 8;
    }
}
