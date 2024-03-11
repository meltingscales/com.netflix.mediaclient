package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.alL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2714alL {
    private static final List<AbstractC9025hm> a;
    public static final C2714alL d = new C2714alL();

    public final List<AbstractC9025hm> b() {
        return a;
    }

    private C2714alL() {
    }

    static {
        List j;
        List j2;
        List j3;
        List j4;
        List<AbstractC9025hm> j5;
        j = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j2 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j3 = C8569dql.j("Episode", "Movie", "Supplemental");
        j4 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("Video", j).b(C2794amm.d.c()).a(), new C9017he.d("Video", j2).b(C2717alO.e.b()).a(), new C9017he.d("Viewable", j3).b(C2795amn.b.b()).a(), new C9017he.d("Video", j4).b(C2711alI.e.d()).a());
        a = j5;
    }
}
