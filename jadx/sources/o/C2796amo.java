package o;

import java.util.List;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2796amo {
    public static final C2796amo b = new C2796amo();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;

    public final List<AbstractC9025hm> a() {
        return c;
    }

    private C2796amo() {
    }

    static {
        List<AbstractC9025hm> j;
        List<C9021hi> e;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("displayName", eVar.e()).d(), new C9018hf.a("isDisplayable", C2945ape.b.b()).d());
        d = j;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf.a aVar = new C9018hf.a("tags", C9019hg.a((AbstractC9026hn) C2881aoT.b.c()));
        e = C8566dqi.e(new C9021hi.d("tagsCriteria").b());
        j2 = C8569dql.j(d2, aVar.b(e).e(j).d());
        c = j2;
    }
}
