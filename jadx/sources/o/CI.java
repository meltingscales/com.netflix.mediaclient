package o;

import com.netflix.clcs.codegen.type.CLCSInputSize;
import com.netflix.clcs.codegen.type.CLCSInputType;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.EI;
import o.EK;

/* loaded from: classes2.dex */
public final class CI {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final int c;
    public static final CI d = new CI();
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> i;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> a() {
        return g;
    }

    private CI() {
    }

    static {
        List j2;
        List<AbstractC9025hm> j3;
        List e2;
        List<AbstractC9025hm> j4;
        List e3;
        List<AbstractC9025hm> j5;
        List j6;
        List<AbstractC9025hm> j7;
        List j8;
        List<AbstractC9025hm> j9;
        List j10;
        List<AbstractC9025hm> j11;
        List<AbstractC9025hm> j12;
        EK.d dVar = EK.e;
        j2 = C8569dql.j("CLCSLegacyMessagingCopy", "GrowthLocalizedString", "LocalizedLocaleString", "NGPLocalizedString", "ObelixString", "OctoberSkyCountryName", "PulseLocalString");
        C9017he.d dVar2 = new C9017he.d("LocalizedString", j2);
        CN cn = CN.c;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), dVar2.b(cn.b()).a());
        a = j3;
        e2 = C8566dqi.e("CLCSStringField");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSStringField", e2).b(CU.d.a()).a());
        b = j4;
        e3 = C8566dqi.e("CLCSDesignIcon");
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSDesignIcon", e3).b(C0797Cy.a.e()).a());
        e = j5;
        j6 = C8569dql.j("CLCSLegacyMessagingCopy", "GrowthLocalizedString", "LocalizedLocaleString", "NGPLocalizedString", "ObelixString", "OctoberSkyCountryName", "PulseLocalString");
        j7 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("LocalizedString", j6).b(cn.b()).a());
        h = j7;
        j8 = C8569dql.j("CLCSClientDebugLogging", "CLCSClientLogging", "CLCSDismiss", "CLCSInAppNavigation", "CLCSLogOut", "CLCSNavigateBack", "CLCSOpenWebView", "CLCSReadPlatformProperty", "CLCSRecordRdidCtaConsent", "CLCSReloadCurrentRoute", "CLCSRequestScreenUpdate", "CLCSSendFeedback", "CLCSSequentialEffect", "CLCSSubmitAction", "CLCSTvReloadApp", "CLCSTvSwitchToLegacyMoneyball", "CLCSUpdateField");
        j9 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSEffect", j8).b(C0798Cz.c.e()).a());
        i = j9;
        j10 = C8569dql.j("CLCSLegacyMessagingCopy", "GrowthLocalizedString", "LocalizedLocaleString", "NGPLocalizedString", "ObelixString", "OctoberSkyCountryName", "PulseLocalString");
        j11 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("LocalizedString", j10).b(cn.b()).a());
        j = j11;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(dVar.c())).d();
        EI.d dVar3 = EI.e;
        j12 = C8569dql.j(d2, new C9018hf.a("accessibilityDescription", dVar3.e()).e(j3).d(), new C9018hf.a("trackingInfo", C0850Ez.a.c()).d(), new C9018hf.a("field", C0841Eq.a.d()).e(j4).d(), new C9018hf.a("size", CLCSInputSize.b.d()).c("inputSize").d(), new C9018hf.a("type", CLCSInputType.d.a()).c("inputType").d(), new C9018hf.a("icon", DB.a.d()).e(j5).d(), new C9018hf.a("placeholder", dVar3.e()).e(j7).d(), new C9018hf.a("onChange", DG.a.c()).e(j9).d(), new C9018hf.a("initialErrorMessage", dVar3.e()).e(j11).d());
        g = j12;
        c = 8;
    }
}
