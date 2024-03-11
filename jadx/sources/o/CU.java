package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.EK;

/* loaded from: classes2.dex */
public final class CU {
    public static final int a;
    private static final List<AbstractC9025hm> c;
    public static final CU d = new CU();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> a() {
        return c;
    }

    private CU() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        EK.d dVar = EK.e;
        e2 = C8566dqi.e("CLCSStringValidation");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSStringValidation", e2).b(CX.e.a()).a());
        e = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a(SignupConstants.Field.LANG_ID, C9019hg.d(dVar.c())).d(), new C9018hf.a("persistedCacheKey", dVar.c()).d(), new C9018hf.a("initialValue", dVar.c()).d(), new C9018hf.a("validations", C9019hg.a(C9019hg.d(C0840Ep.d.b()))).e(j).d());
        c = j2;
        a = 8;
    }
}
