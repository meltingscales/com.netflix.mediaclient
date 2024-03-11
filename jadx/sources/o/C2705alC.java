package o;

import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.alC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2705alC {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2705alC e = new C2705alC();

    public final List<AbstractC9025hm> a() {
        return c;
    }

    private C2705alC() {
    }

    static {
        List e2;
        List e3;
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<C9021hi> j4;
        List<AbstractC9025hm> j5;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("PinotBasicSearchEntity");
        e3 = C8566dqi.e("IrmaAndroidPreQuerySearchEntityTreatment");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("PinotBasicSearchEntity", e2).b(C2704alB.b.a()).a(), new C9017he.d("IrmaAndroidPreQuerySearchEntityTreatment", e3).b(C2699akx.d.b()).a());
        b = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("cursor", C9019hg.d(eVar.e())).d(), new C9018hf.a("node", C3139atM.c.e()).e(j).d());
        a = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("totalCount", C9019hg.d(C2949api.a.d())).d(), new C9018hf.a("edges", C9019hg.a(C9019hg.d(C3089asP.a.a()))).e(j2).d());
        d = j3;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf.a aVar = new C9018hf.a("entities", C3086asM.b.d());
        j4 = C8569dql.j(new C9021hi.d("after").b(new C9027ho("entityCursor")).b(), new C9021hi.d("first").b(new C9027ho("first_entities")).b(), new C9021hi.d("sectionVersion").b());
        j5 = C8569dql.j(d2, aVar.b(j4).e(j3).d());
        c = j5;
    }
}
