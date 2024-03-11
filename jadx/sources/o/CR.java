package o;

import com.netflix.clcs.codegen.type.CLCSDesignTheme;
import com.netflix.clcs.codegen.type.CLCSFieldValueProvider;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C0823Dy;
import o.C9017he;
import o.C9018hf;
import o.DG;
import o.EK;

/* loaded from: classes2.dex */
public final class CR {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final CR c = new CR();
    public static final int d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> i;
    private static final List<AbstractC9025hm> j;

    /* renamed from: o  reason: collision with root package name */
    private static final List<AbstractC9025hm> f13351o;

    public final List<AbstractC9025hm> b() {
        return h;
    }

    private CR() {
    }

    static {
        List j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        List j6;
        List<AbstractC9025hm> j7;
        List j8;
        List<AbstractC9025hm> j9;
        List j10;
        List<AbstractC9025hm> j11;
        List j12;
        List<AbstractC9025hm> j13;
        List<AbstractC9025hm> j14;
        List<AbstractC9025hm> j15;
        EK.d dVar = EK.e;
        j2 = C8569dql.j("CLCSAlert", "CLCSBanner", "CLCSButton", "CLCSButtonCountdown", "CLCSButtonLink", "CLCSCardPaymentInput", "CLCSCaret", "CLCSCheckbox", "CLCSCountdownLabel", "CLCSDivider", "CLCSFullPage", "CLCSHeadingAlignmentStack", "CLCSHorizontalDivider", "CLCSHorizontalStack", "CLCSIcon", "CLCSImageComponent", "CLCSInput", "CLCSInputCopyLink", "CLCSInterstitialLegacyUMA", "CLCSLayout", "CLCSLegalCheckbox", "CLCSLegalText", "CLCSList", "CLCSListItemAction", "CLCSListItemDisplay", "CLCSListItemSwitch", "CLCSModal", "CLCSOnScreenKeyboard", "CLCSPhoneInput", "CLCSPinEntry", "CLCSReCaptchaButton", "CLCSSelect", "CLCSSelectableCard", "CLCSSelectionGrid", "CLCSSpacer", "CLCSStaticList", "CLCSText", "CLCSTextLink", "CLCSThreatMetrixSentinel", "CLCSToast", "CLCSTvPhoneInput", "CLCSTvPlanGrid", "CLCSVerticalStack", "CLCSWebInnovationPlanSelection", "CLCSWebLegacyPlanSelection");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSComponent", j2).b(C0792Ct.d.d()).a());
        g = j3;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, C9019hg.d(dVar.c())).d());
        f13351o = j4;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(dVar.c())).d();
        C0823Dy.b bVar = C0823Dy.e;
        j5 = C8569dql.j(d2, new C9018hf.a("nodes", C9019hg.a(C9019hg.d(bVar.b()))).e(j3).d(), new C9018hf.a("root", C9019hg.d(bVar.b())).e(j4).d(), new C9018hf.a("initialFocusKey", dVar.c()).d());
        a = j5;
        j6 = C8569dql.j("CLCSClientDebugLogging", "CLCSClientLogging", "CLCSDismiss", "CLCSInAppNavigation", "CLCSLogOut", "CLCSNavigateBack", "CLCSOpenWebView", "CLCSReadPlatformProperty", "CLCSRecordRdidCtaConsent", "CLCSReloadCurrentRoute", "CLCSRequestScreenUpdate", "CLCSSendFeedback", "CLCSSequentialEffect", "CLCSSubmitAction", "CLCSTvReloadApp", "CLCSTvSwitchToLegacyMoneyball", "CLCSUpdateField");
        C9017he.d dVar2 = new C9017he.d("CLCSEffect", j6);
        C0798Cz c0798Cz = C0798Cz.c;
        j7 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), dVar2.b(c0798Cz.e()).a());
        i = j7;
        j8 = C8569dql.j("CLCSClientDebugLogging", "CLCSClientLogging", "CLCSDismiss", "CLCSInAppNavigation", "CLCSLogOut", "CLCSNavigateBack", "CLCSOpenWebView", "CLCSReadPlatformProperty", "CLCSRecordRdidCtaConsent", "CLCSReloadCurrentRoute", "CLCSRequestScreenUpdate", "CLCSSendFeedback", "CLCSSequentialEffect", "CLCSSubmitAction", "CLCSTvReloadApp", "CLCSTvSwitchToLegacyMoneyball", "CLCSUpdateField");
        j9 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSEffect", j8).b(c0798Cz.e()).a());
        j = j9;
        j10 = C8569dql.j("CLCSClientDebugLogging", "CLCSClientLogging", "CLCSDismiss", "CLCSInAppNavigation", "CLCSLogOut", "CLCSNavigateBack", "CLCSOpenWebView", "CLCSReadPlatformProperty", "CLCSRecordRdidCtaConsent", "CLCSReloadCurrentRoute", "CLCSRequestScreenUpdate", "CLCSSendFeedback", "CLCSSequentialEffect", "CLCSSubmitAction", "CLCSTvReloadApp", "CLCSTvSwitchToLegacyMoneyball", "CLCSUpdateField");
        j11 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSEffect", j10).b(c0798Cz.e()).a());
        f = j11;
        j12 = C8569dql.j("CLCSBooleanField", "CLCSCardField", "CLCSEncryptedCardField", "CLCSIntegerField", "CLCSStringField");
        j13 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSField", j12).b(C0795Cw.b.e()).a());
        e = j13;
        j14 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("field", DK.c.d()).e(j13).d(), new C9018hf.a("valueProvider", CLCSFieldValueProvider.d.c()).d());
        b = j14;
        C9018hf d3 = new C9018hf.a("__typename", C9019hg.d(dVar.c())).d();
        C9018hf d4 = new C9018hf.a("serverState", C9019hg.d(C0833Ei.e.d())).d();
        C9018hf d5 = new C9018hf.a("componentTree", C9019hg.d(C0821Dw.e.a())).e(j5).d();
        C9018hf d6 = new C9018hf.a("theme", CLCSDesignTheme.d.a()).d();
        DG.a aVar = DG.a;
        j15 = C8569dql.j(d3, d4, d5, d6, new C9018hf.a("onBackControl", aVar.c()).e(j7).d(), new C9018hf.a("onRender", aVar.c()).e(j9).d(), new C9018hf.a("onUnload", aVar.c()).e(j11).d(), new C9018hf.a("trackingInfo", C0850Ez.a.c()).d(), new C9018hf.a("loggingViewName", dVar.c()).d(), new C9018hf.a("fieldInitialization", C9019hg.a(C9019hg.d(DM.c.a()))).e(j14).d(), new C9018hf.a("navigationMarker", dVar.c()).d());
        h = j15;
        d = 8;
    }
}
