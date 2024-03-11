package o;

import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.alR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2720alR {
    private static final List<AbstractC9025hm> b;
    public static final C2720alR c = new C2720alR();
    private static final List<AbstractC9025hm> d;

    public final List<AbstractC9025hm> c() {
        return b;
    }

    private C2720alR() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j = C8569dql.j(d2, new C9018hf.a("interactivePlaybackProgressPercentage", cVar.d()).d(), new C9018hf.a("lastModified", C2873aoL.a.d()).d(), new C9018hf.a("position", C2948aph.a.d()).d());
        d = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("runtimeSec", cVar.d()).d(), new C9018hf.a("displayRuntimeSec", cVar.d()).d(), new C9018hf.a("logicalEndOffsetSec", cVar.d()).d(), new C9018hf.a("bookmark", C3380axr.e.c()).e(j).d());
        b = j2;
    }
}
