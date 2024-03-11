package o;

import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.alB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2704alB {
    private static final List<AbstractC9025hm> a;
    public static final C2704alB b = new C2704alB();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;

    public final List<AbstractC9025hm> a() {
        return a;
    }

    private C2704alB() {
    }

    static {
        List j;
        List j2;
        List<AbstractC9025hm> j3;
        List j4;
        List<AbstractC9025hm> j5;
        List<AbstractC9025hm> j6;
        j = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        C9017he a2 = new C9017he.d("Video", j).b(C2710alH.a.b()).a();
        j2 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j3 = C8569dql.j(a2, new C9017he.d("Video", j2).b(C2723alU.e.a()).a());
        c = j3;
        C2954apn.e eVar = C2954apn.c;
        j4 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("unifiedEntityId", C9019hg.d(C2946apf.d.a())).d(), new C9017he.d("Video", j4).b(j3).a());
        d = j5;
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("unifiedEntity", C3375axm.a.e()).e(j5).d());
        a = j6;
    }
}
