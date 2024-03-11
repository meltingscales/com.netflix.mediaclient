package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C0816Dr;
import o.C0820Dv;
import o.C9017he;
import o.C9018hf;
import o.EK;

/* loaded from: classes2.dex */
public final class CS {
    public static final CS a = new CS();
    private static final List<AbstractC9025hm> b;
    public static final int c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> i;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> e() {
        return g;
    }

    private CS() {
    }

    static {
        List<AbstractC9025hm> j2;
        List e2;
        List<AbstractC9025hm> j3;
        List j4;
        List<AbstractC9025hm> j5;
        List j6;
        List<AbstractC9025hm> j7;
        List e3;
        List<AbstractC9025hm> j8;
        List e4;
        List<AbstractC9025hm> j9;
        List<AbstractC9025hm> j10;
        EK.d dVar = EK.e;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, C9019hg.d(dVar.c())).d());
        e = j2;
        e2 = C8566dqi.e("CLCSStringField");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSStringField", e2).b(CU.d.a()).a());
        j = j3;
        j4 = C8569dql.j("CLCSButton", "CLCSButtonCountdown", "CLCSButtonProperties");
        C9017he.d dVar2 = new C9017he.d("CLCSButtonLike", j4);
        C0793Cu c0793Cu = C0793Cu.a;
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), dVar2.b(c0793Cu.c()).a());
        b = j5;
        j6 = C8569dql.j("CLCSButton", "CLCSButtonCountdown", "CLCSButtonProperties");
        j7 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSButtonLike", j6).b(c0793Cu.c()).a());
        d = j7;
        e3 = C8566dqi.e("CLCSContainerStyle");
        C9017he.d dVar3 = new C9017he.d("CLCSContainerStyle", e3);
        C0791Cs c0791Cs = C0791Cs.d;
        j8 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), dVar3.b(c0791Cs.c()).a());
        i = j8;
        e4 = C8566dqi.e("CLCSContainerStyle");
        j9 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSContainerStyle", e4).b(c0791Cs.c()).a());
        f = j9;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(dVar.c())).d();
        C9018hf d3 = new C9018hf.a("content", C9019hg.d(C0823Dy.e.b())).e(j2).d();
        C9018hf d4 = new C9018hf.a("field", C0841Eq.a.d()).e(j3).d();
        C9018hf d5 = new C9018hf.a("value", dVar.c()).d();
        C0816Dr.c cVar = C0816Dr.b;
        C9018hf d6 = new C9018hf.a("button", cVar.a()).e(j5).d();
        C9018hf d7 = new C9018hf.a("buttonSelected", cVar.a()).e(j7).d();
        C0820Dv.e eVar = C0820Dv.b;
        j10 = C8569dql.j(d2, d3, d4, d5, d6, d7, new C9018hf.a("style", eVar.a()).e(j8).d(), new C9018hf.a("styleSelected", eVar.a()).e(j9).d());
        g = j10;
        c = 8;
    }
}
