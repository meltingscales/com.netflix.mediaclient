package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.EI;
import o.EK;

/* renamed from: o.Cv  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0794Cv {
    public static final int a;
    public static final C0794Cv b = new C0794Cv();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> d() {
        return h;
    }

    private C0794Cv() {
    }

    static {
        List j2;
        List<AbstractC9025hm> j3;
        List j4;
        List<AbstractC9025hm> j5;
        List e2;
        List<AbstractC9025hm> j6;
        List j7;
        List<AbstractC9025hm> j8;
        List<AbstractC9025hm> j9;
        EK.d dVar = EK.e;
        j2 = C8569dql.j("CLCSLegacyMessagingCopy", "GrowthLocalizedString", "LocalizedLocaleString", "NGPLocalizedString", "ObelixString", "OctoberSkyCountryName", "PulseLocalString");
        C9017he.d dVar2 = new C9017he.d("LocalizedString", j2);
        CN cn = CN.c;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), dVar2.b(cn.b()).a());
        c = j3;
        j4 = C8569dql.j("CLCSLegacyMessagingCopy", "GrowthLocalizedString", "LocalizedLocaleString", "NGPLocalizedString", "ObelixString", "OctoberSkyCountryName", "PulseLocalString");
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("LocalizedString", j4).b(cn.b()).a());
        d = j5;
        e2 = C8566dqi.e("CLCSBooleanField");
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSBooleanField", e2).b(C0787Co.b.c()).a());
        e = j6;
        j7 = C8569dql.j("CLCSClientDebugLogging", "CLCSClientLogging", "CLCSDismiss", "CLCSInAppNavigation", "CLCSLogOut", "CLCSNavigateBack", "CLCSOpenWebView", "CLCSReadPlatformProperty", "CLCSRecordRdidCtaConsent", "CLCSReloadCurrentRoute", "CLCSRequestScreenUpdate", "CLCSSendFeedback", "CLCSSequentialEffect", "CLCSSubmitAction", "CLCSTvReloadApp", "CLCSTvSwitchToLegacyMoneyball", "CLCSUpdateField");
        j8 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSEffect", j7).b(C0798Cz.c.e()).a());
        j = j8;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(dVar.c())).d();
        EI.d dVar3 = EI.e;
        j9 = C8569dql.j(d2, new C9018hf.a("accessibilityDescription", dVar3.e()).e(j3).d(), new C9018hf.a("trackingInfo", C0850Ez.a.c()).d(), new C9018hf.a("loggingViewName", dVar.c()).d(), new C9018hf.a("label", dVar3.e()).e(j5).d(), new C9018hf.a("field", C0818Dt.b.e()).e(j6).d(), new C9018hf.a("onChange", DG.a.c()).e(j8).d());
        h = j9;
        a = 8;
    }
}
