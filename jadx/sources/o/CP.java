package o;

import com.netflix.clcs.codegen.type.CLCSPinEntrySize;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.EK;

/* loaded from: classes2.dex */
public final class CP {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final CP c = new CP();
    public static final int d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> i;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> c() {
        return f;
    }

    private CP() {
    }

    static {
        List j2;
        List<AbstractC9025hm> j3;
        List e2;
        List<AbstractC9025hm> j4;
        List e3;
        List<AbstractC9025hm> j5;
        List e4;
        List<AbstractC9025hm> j6;
        List j7;
        List<AbstractC9025hm> j8;
        List<AbstractC9025hm> j9;
        EK.d dVar = EK.e;
        j2 = C8569dql.j("CLCSLegacyMessagingCopy", "GrowthLocalizedString", "LocalizedLocaleString", "NGPLocalizedString", "ObelixString", "OctoberSkyCountryName", "PulseLocalString");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("LocalizedString", j2).b(CN.c.b()).a());
        e = j3;
        e2 = C8566dqi.e("CLCSDesignTypography");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSDesignTypography", e2).b(CW.e.c()).a());
        i = j4;
        e3 = C8566dqi.e("CLCSDesignColor");
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSDesignColor", e3).b(C0790Cr.c.a()).a());
        j = j5;
        e4 = C8566dqi.e("CLCSStringField");
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSStringField", e4).b(CU.d.a()).a());
        a = j6;
        j7 = C8569dql.j("CLCSClientDebugLogging", "CLCSClientLogging", "CLCSDismiss", "CLCSInAppNavigation", "CLCSLogOut", "CLCSNavigateBack", "CLCSOpenWebView", "CLCSReadPlatformProperty", "CLCSRecordRdidCtaConsent", "CLCSReloadCurrentRoute", "CLCSRequestScreenUpdate", "CLCSSendFeedback", "CLCSSequentialEffect", "CLCSSubmitAction", "CLCSTvReloadApp", "CLCSTvSwitchToLegacyMoneyball", "CLCSUpdateField");
        j8 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSEffect", j7).b(C0798Cz.c.e()).a());
        b = j8;
        j9 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("accessibilityDescription", EI.e.e()).e(j3).d(), new C9018hf.a("trackingInfo", C0850Ez.a.c()).d(), new C9018hf.a("loggingViewName", dVar.c()).d(), new C9018hf.a("typography", DF.b.b()).e(j4).d(), new C9018hf.a("textColor", DC.d.d()).e(j5).d(), new C9018hf.a("length", EL.d.a()).d(), new C9018hf.a("size", CLCSPinEntrySize.b.c()).c("pinEntrySize").d(), new C9018hf.a("field", C0841Eq.a.d()).e(j6).d(), new C9018hf.a("onChange", DG.a.c()).e(j8).d());
        f = j9;
        d = 8;
    }
}
