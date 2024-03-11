package o;

import java.util.List;
import o.C2873aoL;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.akC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2652akC {
    private static final List<AbstractC9025hm> b;
    public static final C2652akC d = new C2652akC();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> a() {
        return b;
    }

    private C2652akC() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2873aoL.b bVar = C2873aoL.a;
        j = C8569dql.j(d2, new C9018hf.a("endTime", bVar.d()).d());
        e = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("availabilityStartTime", bVar.d()).d(), new C9018hf.a("timeWindow", C3187auH.a.a()).e(j).d());
        b = j2;
    }
}
