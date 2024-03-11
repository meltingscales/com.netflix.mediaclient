package o;

import java.util.List;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2801amt {
    public static final C2801amt a = new C2801amt();
    private static final List<AbstractC9025hm> c;

    public final List<AbstractC9025hm> b() {
        return c;
    }

    private C2801amt() {
    }

    static {
        List<C9021hi> e;
        List<AbstractC9025hm> j;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf.a aVar = new C9018hf.a("value", eVar.e());
        e = C8566dqi.e(new C9021hi.d("locale").b());
        j = C8569dql.j(d, aVar.b(e).d());
        c = j;
    }
}
