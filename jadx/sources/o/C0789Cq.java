package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.EK;

/* renamed from: o.Cq  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0789Cq {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C0789Cq d = new C0789Cq();
    public static final int e;

    public final List<AbstractC9025hm> c() {
        return a;
    }

    private C0789Cq() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        EK.d dVar = EK.e;
        e2 = C8566dqi.e("CLCSContainerStyle");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSContainerStyle", e2).b(C0791Cs.d.c()).a());
        b = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, C9019hg.d(dVar.c())).d());
        c = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("style", C0820Dv.b.a()).e(j).d(), new C9018hf.a("content", C9019hg.d(C0823Dy.e.b())).e(j2).d());
        a = j3;
        e = 8;
    }
}
