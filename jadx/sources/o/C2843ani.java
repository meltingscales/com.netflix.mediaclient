package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.ani  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2843ani {
    private static final List<AbstractC9025hm> a;
    public static final C2843ani b = new C2843ani();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> c() {
        return e;
    }

    private C2843ani() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<C9021hi> j2;
        List<AbstractC9025hm> e3;
        e2 = C8566dqi.e("LolomoRowListEdge");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("LolomoRowListEdge", e2).b(C2735alg.e.c()).a());
        a = j;
        C9018hf.a aVar = new C9018hf.a("lolomoRowByIndex", C2979aqL.c.b());
        j2 = C8569dql.j(new C9021hi.d("index").b(new C9027ho("index")).b(), new C9021hi.d("listId").b(), new C9021hi.d("lolomoId").b(new C9027ho("lolomoId")).b());
        e3 = C8566dqi.e(aVar.b(j2).e(j).d());
        e = e3;
    }
}
