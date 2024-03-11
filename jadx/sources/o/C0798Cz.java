package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.EK;

/* renamed from: o.Cz  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0798Cz {
    private static final List<AbstractC9025hm> a;
    public static final int b;
    public static final C0798Cz c = new C0798Cz();
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> e() {
        return d;
    }

    private C0798Cz() {
    }

    static {
        List j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> e2;
        List j3;
        List e3;
        List<AbstractC9025hm> j4;
        EK.d dVar = EK.e;
        j = C8569dql.j("CLCSClientDebugLogging", "CLCSClientLogging", "CLCSDismiss", "CLCSInAppNavigation", "CLCSLogOut", "CLCSNavigateBack", "CLCSOpenWebView", "CLCSReadPlatformProperty", "CLCSRecordRdidCtaConsent", "CLCSReloadCurrentRoute", "CLCSRequestScreenUpdate", "CLCSSendFeedback", "CLCSSequentialEffect", "CLCSSubmitAction", "CLCSTvReloadApp", "CLCSTvSwitchToLegacyMoneyball", "CLCSUpdateField");
        C9017he.d dVar2 = new C9017he.d("CLCSEffect", j);
        CA ca = CA.a;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), dVar2.b(ca.b()).a());
        e = j2;
        e2 = C8566dqi.e(new C9018hf.a("effects", C9019hg.a(C9019hg.d(DG.a.c()))).e(j2).d());
        a = e2;
        j3 = C8569dql.j("CLCSClientDebugLogging", "CLCSClientLogging", "CLCSDismiss", "CLCSInAppNavigation", "CLCSLogOut", "CLCSNavigateBack", "CLCSOpenWebView", "CLCSReadPlatformProperty", "CLCSRecordRdidCtaConsent", "CLCSReloadCurrentRoute", "CLCSRequestScreenUpdate", "CLCSSendFeedback", "CLCSSequentialEffect", "CLCSSubmitAction", "CLCSTvReloadApp", "CLCSTvSwitchToLegacyMoneyball", "CLCSUpdateField");
        e3 = C8566dqi.e("CLCSSequentialEffect");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSEffect", j3).b(ca.b()).a(), new C9017he.d("CLCSCompositeEffect", e3).b(e2).a());
        d = j4;
        b = 8;
    }
}
