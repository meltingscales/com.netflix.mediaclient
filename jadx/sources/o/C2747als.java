package o;

import java.util.List;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.als  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2747als {
    private static final List<AbstractC9025hm> b;
    public static final C2747als c = new C2747als();

    public final List<AbstractC9025hm> d() {
        return b;
    }

    private C2747als() {
    }

    static {
        List<AbstractC9025hm> j;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("maturityLevel", C2949api.a.d()).d(), new C9018hf.a("label", eVar.e()).d(), new C9018hf.a("description", eVar.e()).d());
        b = j;
    }
}
