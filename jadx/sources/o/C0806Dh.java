package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.Dh  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0806Dh {
    public static final C0806Dh a = new C0806Dh();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final int e;

    public final List<AbstractC9025hm> d() {
        return d;
    }

    private C0806Dh() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<C9021hi> e3;
        List<AbstractC9025hm> e4;
        e2 = C8566dqi.e("CLCSScreen");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(EK.e.c())).d(), new C9017he.d("CLCSScreen", e2).b(CR.c.b()).a());
        c = j;
        C9018hf.a aVar = new C9018hf.a("clcsRestoreScreen", C0829Ee.b.c());
        e3 = C8566dqi.e(new C9021hi.d("serverState").b(new C9027ho("serverState")).b());
        e4 = C8566dqi.e(aVar.b(e3).e(j).d());
        d = e4;
        e = 8;
    }
}
