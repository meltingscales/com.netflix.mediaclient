package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.DA;
import o.EK;

/* loaded from: classes2.dex */
public final class CO {
    public static final int a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final CO d = new CO();
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> i;

    public final List<AbstractC9025hm> a() {
        return b;
    }

    private CO() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List e3;
        List<AbstractC9025hm> j2;
        List e4;
        List<AbstractC9025hm> j3;
        List e5;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        EK.d dVar = EK.e;
        e2 = C8566dqi.e("CLCSDesignSpaceSize");
        C9017he.d dVar2 = new C9017he.d("CLCSDesignSpaceSize", e2);
        C0796Cx c0796Cx = C0796Cx.d;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), dVar2.b(c0796Cx.d()).a());
        i = j;
        e3 = C8566dqi.e("CLCSDesignSpaceSize");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSDesignSpaceSize", e3).b(c0796Cx.d()).a());
        e = j2;
        e4 = C8566dqi.e("CLCSDesignSpaceSize");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSDesignSpaceSize", e4).b(c0796Cx.d()).a());
        f = j3;
        e5 = C8566dqi.e("CLCSDesignSpaceSize");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSDesignSpaceSize", e5).b(c0796Cx.d()).a());
        c = j4;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(dVar.c())).d();
        DA.d dVar3 = DA.e;
        j5 = C8569dql.j(d2, new C9018hf.a("top", dVar3.c()).e(j).d(), new C9018hf.a("bottom", dVar3.c()).e(j2).d(), new C9018hf.a("start", dVar3.c()).e(j3).d(), new C9018hf.a("end", dVar3.c()).e(j4).d());
        b = j5;
        a = 8;
    }
}
