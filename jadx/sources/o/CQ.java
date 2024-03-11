package o;

import com.netflix.clcs.codegen.type.CLCSSpaceSize;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.EK;

/* loaded from: classes2.dex */
public final class CQ {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final int c;
    public static final CQ d = new CQ();

    public final List<AbstractC9025hm> c() {
        return a;
    }

    private CQ() {
    }

    static {
        List e;
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        EK.d dVar = EK.e;
        e = C8566dqi.e("CLCSDesignSpaceSize");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSDesignSpaceSize", e).b(C0796Cx.d.d()).a());
        b = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("size", CLCSSpaceSize.c.d()).d(), new C9018hf.a("designSize", DA.e.c()).e(j).d());
        a = j2;
        c = 8;
    }
}
