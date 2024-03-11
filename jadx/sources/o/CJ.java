package o;

import com.netflix.clcs.codegen.type.CLCSInputSize;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.EI;
import o.EK;

/* loaded from: classes2.dex */
public final class CJ {
    public static final int a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final CJ e = new CJ();
    private static final List<AbstractC9025hm> f;

    public final List<AbstractC9025hm> c() {
        return b;
    }

    private CJ() {
    }

    static {
        List j;
        List<AbstractC9025hm> j2;
        List j3;
        List<AbstractC9025hm> j4;
        List j5;
        List<AbstractC9025hm> j6;
        List<AbstractC9025hm> j7;
        EK.d dVar = EK.e;
        j = C8569dql.j("CLCSButton", "CLCSButtonCountdown", "CLCSButtonProperties");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSButtonLike", j).b(C0793Cu.a.c()).a());
        c = j2;
        j3 = C8569dql.j("CLCSLegacyMessagingCopy", "GrowthLocalizedString", "LocalizedLocaleString", "NGPLocalizedString", "ObelixString", "OctoberSkyCountryName", "PulseLocalString");
        C9017he.d dVar2 = new C9017he.d("LocalizedString", j3);
        CN cn = CN.c;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), dVar2.b(cn.b()).a());
        d = j4;
        j5 = C8569dql.j("CLCSLegacyMessagingCopy", "GrowthLocalizedString", "LocalizedLocaleString", "NGPLocalizedString", "ObelixString", "OctoberSkyCountryName", "PulseLocalString");
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("LocalizedString", j5).b(cn.b()).a());
        f = j6;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(dVar.c())).d();
        C9018hf d3 = new C9018hf.a("trackingInfo", C0850Ez.a.c()).d();
        C9018hf d4 = new C9018hf.a("button", C0816Dr.b.a()).e(j2).d();
        EI.d dVar3 = EI.e;
        j7 = C8569dql.j(d2, d3, d4, new C9018hf.a("accessibilityDescription", dVar3.e()).e(j4).d(), new C9018hf.a("loggingViewName", dVar.c()).d(), new C9018hf.a("size", CLCSInputSize.b.d()).c("inputSize").d(), new C9018hf.a("text", dVar3.e()).e(j6).d(), new C9018hf.a("copyText", C9019hg.d(dVar.c())).d());
        b = j7;
        a = 8;
    }
}
