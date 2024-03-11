package o;

import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.ake  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2680ake {
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2680ake d = new C2680ake();

    public final List<AbstractC9025hm> c() {
        return b;
    }

    private C2680ake() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j = C8569dql.j(d2, new C9018hf.a("minMemoryGb", cVar.d()).d(), new C9018hf.a("minSdkVersion", cVar.d()).d(), new C9018hf.a("packageSizeInMb", cVar.d()).d(), new C9018hf.a("numProcessors", cVar.d()).d(), new C9018hf.a("packageName", C9019hg.d(eVar.e())).d(), new C9018hf.a("appStoreUrl", eVar.e()).d());
        c = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("gameId", C9019hg.d(cVar.d())).d(), new C9018hf.a("androidInstallation", C2866aoE.e.c()).e(j).d());
        b = j2;
    }
}
