package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amZ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2781amZ {
    public static final C2781amZ a = new C2781amZ();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> d() {
        return c;
    }

    private C2781amZ() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<C9021hi> e3;
        List<AbstractC9025hm> e4;
        e2 = C8566dqi.e("Game");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("Game", e2).b(C2682akg.e.b()).a());
        e = j;
        C9018hf.a aVar = new C9018hf.a("games", C9019hg.a((AbstractC9026hn) C2942apb.d.c()));
        e3 = C8566dqi.e(new C9021hi.d("gameIds").b(new C9027ho("gameIds")).b());
        e4 = C8566dqi.e(aVar.b(e3).e(j).d());
        c = e4;
    }
}
