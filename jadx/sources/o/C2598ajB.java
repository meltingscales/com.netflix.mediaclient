package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.ajB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2598ajB {
    public static final C2598ajB b = new C2598ajB();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> b() {
        return e;
    }

    private C2598ajB() {
    }

    static {
        List j;
        List j2;
        List j3;
        List<AbstractC9025hm> j4;
        j = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j2 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j3 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("Video", j).b(C2794amm.d.c()).a(), new C9017he.d("Video", j2).b(C2710alH.a.b()).a(), new C9017he.d("Video", j3).b(C2600ajD.c.d()).a());
        e = j4;
    }
}
