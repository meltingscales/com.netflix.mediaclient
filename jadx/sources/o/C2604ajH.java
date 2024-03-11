package o;

import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.ajH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2604ajH {
    private static final List<AbstractC9025hm> a;
    public static final C2604ajH b = new C2604ajH();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> d() {
        return a;
    }

    private C2604ajH() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j = C8569dql.j(d, new C9018hf.a("interactivePlaybackProgressPercentage", cVar.d()).d(), new C9018hf.a("lastModified", C2873aoL.a.d()).d(), new C9018hf.a("position", C2948aph.a.d()).d());
        e = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("runtimeSec", cVar.d()).d(), new C9018hf.a("displayRuntimeSec", cVar.d()).d(), new C9018hf.a("logicalEndOffsetSec", cVar.d()).d(), new C9018hf.a("bookmark", C3380axr.e.c()).e(j).d());
        a = j2;
    }
}
