package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.ajL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2608ajL {
    private static final List<AbstractC9025hm> d;
    public static final C2608ajL e = new C2608ajL();

    public final List<AbstractC9025hm> d() {
        return d;
    }

    private C2608ajL() {
    }

    static {
        List j;
        List e2;
        List<AbstractC9025hm> j2;
        j = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        e2 = C8566dqi.e("Show");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("Video", j).b(C2609ajM.a.e()).a(), new C9017he.d("Show", e2).b(C2610ajN.c.b()).a());
        d = j2;
    }
}
