package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.EK;
import o.EL;

/* loaded from: classes2.dex */
public final class CX {
    private static final List<AbstractC9025hm> a;
    public static final int b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final CX e = new CX();
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> i;

    public final List<AbstractC9025hm> a() {
        return i;
    }

    private CX() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> e2;
        List e3;
        List e4;
        List<AbstractC9025hm> j2;
        List j3;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        EL.e eVar = EL.d;
        j = C8569dql.j(new C9018hf.a("minLength", eVar.a()).d(), new C9018hf.a("maxLength", eVar.a()).d());
        c = j;
        EK.d dVar = EK.e;
        e2 = C8566dqi.e(new C9018hf.a("pattern", C9019hg.d(dVar.c())).d());
        f = e2;
        e3 = C8566dqi.e("CLCSStringValueCheckLength");
        e4 = C8566dqi.e("CLCSStringValueCheckPattern");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSStringValueCheckLength", e3).b(j).a(), new C9017he.d("CLCSStringValueCheckPattern", e4).b(e2).a());
        a = j2;
        j3 = C8569dql.j("CLCSLegacyMessagingCopy", "GrowthLocalizedString", "LocalizedLocaleString", "NGPLocalizedString", "ObelixString", "OctoberSkyCountryName", "PulseLocalString");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("LocalizedString", j3).b(CN.c.b()).a());
        d = j4;
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("check", C9019hg.d(C0842Er.d.e())).e(j2).d(), new C9018hf.a("errorMessage", C9019hg.d(EI.e.e())).e(j4).d());
        i = j5;
        b = 8;
    }
}
