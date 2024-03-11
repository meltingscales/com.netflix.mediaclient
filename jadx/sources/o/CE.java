package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.EK;

/* loaded from: classes2.dex */
public final class CE {
    private static final List<AbstractC9025hm> a;
    public static final int b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final CE e = new CE();
    private static final List<AbstractC9025hm> f;

    public final List<AbstractC9025hm> b() {
        return f;
    }

    private CE() {
    }

    static {
        List e2;
        List<AbstractC9025hm> e3;
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> e4;
        List e5;
        List e6;
        List<AbstractC9025hm> j2;
        e2 = C8566dqi.e("CLCSScreen");
        e3 = C8566dqi.e(new C9017he.d("CLCSScreen", e2).b(CR.c.b()).a());
        a = e3;
        EK.d dVar = EK.e;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("ownerGuid", C9019hg.d(ED.d.a())).d());
        d = j;
        e4 = C8566dqi.e(new C9018hf.a("account", C0804Df.c.d()).e(j).d());
        c = e4;
        e5 = C8566dqi.e("CLCSScreen");
        e6 = C8566dqi.e("CLCSFlowComplete");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSScreen", e5).b(e3).a(), new C9017he.d("CLCSFlowComplete", e6).b(e4).a());
        f = j2;
        b = 8;
    }
}
