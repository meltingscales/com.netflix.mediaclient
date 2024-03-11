package o;

import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.amn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2795amn {
    private static final List<AbstractC9025hm> a;
    public static final C2795amn b = new C2795amn();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> b() {
        return e;
    }

    private C2795amn() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d2 = new C9018hf.a("label", eVar.e()).d();
        C2949api.c cVar = C2949api.a;
        j = C8569dql.j(d, d2, new C9018hf.a("startSec", cVar.d()).d(), new C9018hf.a("endSec", cVar.d()).d());
        a = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("startCreditOffsetSec", cVar.d()).d(), new C9018hf.a("startRecapOffsetSec", cVar.d()).d(), new C9018hf.a("endCreditOffsetSec", cVar.d()).d(), new C9018hf.a("endRecapOffsetSec", cVar.d()).d(), new C9018hf.a("skipContentTimeCodes", C9019hg.a(C9019hg.d(C3228auy.b.e()))).e(j).d());
        e = j2;
    }
}
