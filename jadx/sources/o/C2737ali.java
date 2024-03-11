package o;

import java.util.List;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.ali  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2737ali {
    public static final C2737ali a = new C2737ali();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> c() {
        return e;
    }

    private C2737ali() {
    }

    static {
        List<AbstractC9025hm> e2;
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<C9021hi> j3;
        List<AbstractC9025hm> j4;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d());
        b = e2;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("cursor", eVar.e()).d(), new C9018hf.a("index", C2949api.a.d()).d(), new C9018hf.a("node", C2974aqG.d.c()).e(e2).d());
        d = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("edges", C9019hg.a((AbstractC9026hn) C2982aqO.e.c())).e(j).d());
        c = j2;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf.a c2 = new C9018hf.a("entitiesConnection", C3009aqp.e.e()).c("entities");
        j3 = C8569dql.j(new C9021hi.d("after").b(new C9027ho("entityCursor")).b(), new C9021hi.d("first").b(new C9027ho("columns")).b());
        j4 = C8569dql.j(d2, c2.b(j3).e(j2).d());
        e = j4;
    }
}
