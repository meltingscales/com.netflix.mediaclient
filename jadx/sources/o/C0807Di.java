package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.Di  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0807Di {
    private static final List<AbstractC9025hm> a;
    public static final C0807Di b = new C0807Di();
    public static final int c;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> c() {
        return a;
    }

    private C0807Di() {
    }

    static {
        List j;
        List<AbstractC9025hm> j2;
        List<C9021hi> j3;
        List<AbstractC9025hm> e2;
        j = C8569dql.j("CLCSScreen", "CLCSFlowComplete", "CLCSEffectAction");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(EK.e.c())).d(), new C9017he.d("CLCSFlowSubmitActionOutcome", j).b(CE.e.b()).a());
        e = j2;
        C9018hf.a aVar = new C9018hf.a("clcsFlowSubmitAction", DJ.c.d());
        j3 = C8569dql.j(new C9021hi.d("inputFields").b(new C9027ho("inputFields")).b(), new C9021hi.d("serverAction").b(new C9027ho("serverAction")).b(), new C9021hi.d("serverState").b(new C9027ho("serverState")).b());
        e2 = C8566dqi.e(aVar.b(j3).e(j2).d());
        a = e2;
        c = 8;
    }
}
