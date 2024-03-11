package o;

import com.netflix.clcs.codegen.type.CLCSButtonSize;
import com.netflix.clcs.codegen.type.CLCSButtonType;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.EK;

/* renamed from: o.Cu  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0793Cu {
    public static final C0793Cu a = new C0793Cu();
    private static final List<AbstractC9025hm> b;
    public static final int c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> c() {
        return j;
    }

    private C0793Cu() {
    }

    static {
        List j2;
        List<AbstractC9025hm> j3;
        List e2;
        List<AbstractC9025hm> j4;
        List j5;
        List<AbstractC9025hm> j6;
        List<AbstractC9025hm> j7;
        EK.d dVar = EK.e;
        j2 = C8569dql.j("CLCSLegacyMessagingCopy", "GrowthLocalizedString", "LocalizedLocaleString", "NGPLocalizedString", "ObelixString", "OctoberSkyCountryName", "PulseLocalString");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("LocalizedString", j2).b(CN.c.b()).a());
        d = j3;
        e2 = C8566dqi.e("CLCSDesignIcon");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSDesignIcon", e2).b(C0797Cy.a.e()).a());
        e = j4;
        j5 = C8569dql.j("CLCSClientDebugLogging", "CLCSClientLogging", "CLCSDismiss", "CLCSInAppNavigation", "CLCSLogOut", "CLCSNavigateBack", "CLCSOpenWebView", "CLCSReadPlatformProperty", "CLCSRecordRdidCtaConsent", "CLCSReloadCurrentRoute", "CLCSRequestScreenUpdate", "CLCSSendFeedback", "CLCSSequentialEffect", "CLCSSubmitAction", "CLCSTvReloadApp", "CLCSTvSwitchToLegacyMoneyball", "CLCSUpdateField");
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSEffect", j5).b(C0798Cz.c.e()).a());
        b = j6;
        j7 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("label", EI.e.e()).e(j3).d(), new C9018hf.a("size", CLCSButtonSize.d.b()).c("buttonSize").d(), new C9018hf.a("type", CLCSButtonType.c.a()).d(), new C9018hf.a("icon", DB.a.d()).e(j4).d(), new C9018hf.a("onPress", DG.a.c()).e(j6).d());
        j = j7;
        c = 8;
    }
}
