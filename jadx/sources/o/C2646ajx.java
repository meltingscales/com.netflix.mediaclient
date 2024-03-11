package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.ajx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2646ajx {
    private static final List<AbstractC9025hm> b;
    public static final C2646ajx d = new C2646ajx();

    public final List<AbstractC9025hm> c() {
        return b;
    }

    private C2646ajx() {
    }

    static {
        List j;
        List j2;
        List<AbstractC9025hm> j3;
        j = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j2 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("Video", j).b(C2794amm.d.c()).a(), new C9017he.d("Video", j2).b(C2647ajy.c.a()).a());
        b = j3;
    }
}
