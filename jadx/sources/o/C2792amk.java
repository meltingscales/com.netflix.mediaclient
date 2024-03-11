package o;

import java.util.List;
import o.C2945ape;
import o.C2949api;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.amk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2792amk {
    public static final C2792amk a = new C2792amk();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> d() {
        return c;
    }

    private C2792amk() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("position", C2948aph.a.d()).d(), new C9018hf.a("lastModified", C2873aoL.a.d()).d());
        e = j;
        C9018hf d = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2945ape.b bVar = C2945ape.b;
        j2 = C8569dql.j(d, new C9018hf.a("isPinProtected", bVar.b()).d(), new C9018hf.a("isAgeVerificationProtected", bVar.b()).d(), new C9018hf.a("isPreReleasePinProtected", bVar.b()).d());
        b = j2;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d3 = new C9018hf.a("bookmark", C3380axr.e.c()).e(j).d();
        C2949api.c cVar = C2949api.a;
        j3 = C8569dql.j(d2, d3, new C9018hf.a("displayRuntimeSec", cVar.d()).c("displayRuntime").d(), new C9018hf.a("runtimeSec", cVar.d()).c("runtime").d(), new C9018hf.a("logicalEndOffsetSec", cVar.d()).c("logicalEndOffset").d(), new C9018hf.a("protected", C3382axt.a.c()).e(j2).d());
        c = j3;
    }
}
