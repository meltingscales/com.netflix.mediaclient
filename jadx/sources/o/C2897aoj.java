package o;

import java.util.List;
import o.C2910aow;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.aoj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2897aoj {
    private static final List<AbstractC9025hm> a;
    public static final C2897aoj b = new C2897aoj();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> i;
    private static final List<AbstractC9025hm> j;
    private static final List<AbstractC9025hm> n;

    public final List<AbstractC9025hm> d() {
        return j;
    }

    private C2897aoj() {
    }

    static {
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> e2;
        List e3;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List e4;
        List<AbstractC9025hm> j5;
        List<AbstractC9025hm> j6;
        List e5;
        List<AbstractC9025hm> j7;
        List<AbstractC9025hm> j8;
        List e6;
        List e7;
        List e8;
        List e9;
        List<AbstractC9025hm> j9;
        List<C9021hi> j10;
        List<AbstractC9025hm> e10;
        C2954apn.e eVar = C2954apn.c;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("fullHandle", eVar.e()).d());
        e = j2;
        e2 = C8566dqi.e(new C9018hf.a("handle", C3193auN.c.d()).e(j2).d());
        i = e2;
        e3 = C8566dqi.e("AlertDialog");
        C9017he.d dVar = new C9017he.d("AlertDialog", e3);
        C2797amp c2797amp = C2797amp.d;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), dVar.b(c2797amp.a()).a());
        c = j3;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2910aow.d dVar2 = C2910aow.b;
        j4 = C8569dql.j(d2, new C9018hf.a("alert", dVar2.b()).e(j3).d());
        h = j4;
        e4 = C8566dqi.e("AlertDialog");
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("AlertDialog", e4).b(c2797amp.a()).a());
        a = j5;
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("alert", dVar2.b()).e(j5).d());
        f = j6;
        e5 = C8566dqi.e("AlertDialog");
        j7 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("AlertDialog", e5).b(c2797amp.a()).a());
        d = j7;
        j8 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("alert", dVar2.b()).e(j7).d());
        g = j8;
        e6 = C8566dqi.e("UPISetHandleSuccess");
        e7 = C8566dqi.e("UPIHandleValidationError");
        e8 = C8566dqi.e("UPIHandleModerationError");
        e9 = C8566dqi.e("UPIHandleUnavailableError");
        j9 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("UPISetHandleSuccess", e6).b(e2).a(), new C9017he.d("UPIHandleValidationError", e7).b(j4).a(), new C9017he.d("UPIHandleModerationError", e8).b(j6).a(), new C9017he.d("UPIHandleUnavailableError", e9).b(j8).a());
        n = j9;
        C9018hf.a aVar = new C9018hf.a("upiSetHandle", C3199auT.d.c());
        j10 = C8569dql.j(new C9021hi.d("handle").b(new C9027ho("handle")).b(), new C9021hi.d("profileGuid").b());
        e10 = C8566dqi.e(aVar.b(j10).e(j9).d());
        j = e10;
    }
}
