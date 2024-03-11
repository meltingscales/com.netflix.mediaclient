package o;

import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.amb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2783amb {
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2783amb e = new C2783amb();

    public final List<AbstractC9025hm> c() {
        return c;
    }

    private C2783amb() {
    }

    static {
        List j;
        List e2;
        List<AbstractC9025hm> j2;
        List e3;
        List<AbstractC9025hm> j3;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        e2 = C8566dqi.e("Episode");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Video", j).b(C2714alL.d.b()).a(), new C9017he.d("Episode", e2).b(C2709alG.d.c()).a());
        d = j2;
        e3 = C8566dqi.e("Show");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Show", e3).b(C2718alP.c.d()).a(), new C9018hf.a("currentEpisode", C2879aoR.b.c()).e(j2).d());
        c = j3;
    }
}
