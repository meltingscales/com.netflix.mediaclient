package o;

import java.util.List;
import java.util.Map;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.ajG  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2603ajG {
    private static final List<AbstractC9025hm> b;
    public static final C2603ajG c = new C2603ajG();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> b() {
        return b;
    }

    private C2603ajG() {
    }

    static {
        List<AbstractC9025hm> j;
        Map b2;
        List<C9021hi> e2;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("text", eVar.e()).d(), new C9018hf.a("evidenceKey", eVar.e()).d());
        e = j;
        C9018hf d = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf.a aVar = new C9018hf.a("contextualSynopsis", C2872aoK.d.c());
        C9021hi.d dVar = new C9021hi.d("context");
        b2 = dqD.b(dpD.a("uiContext", "ODP"));
        e2 = C8566dqi.e(dVar.b(b2).b());
        j2 = C8569dql.j(d, aVar.b(e2).e(j).d());
        b = j2;
    }
}
