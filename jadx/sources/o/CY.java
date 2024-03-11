package o;

import com.netflix.clcs.codegen.type.CLCSToastPosition;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.EK;

/* loaded from: classes2.dex */
public final class CY {
    public static final int a;
    private static final List<AbstractC9025hm> b;
    public static final CY c = new CY();
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> f;

    public final List<AbstractC9025hm> c() {
        return d;
    }

    private CY() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        EK.d dVar = EK.e;
        e2 = C8566dqi.e("CLCSContainerStyle");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSContainerStyle", e2).b(C0791Cs.d.c()).a());
        f = j;
        j2 = C8569dql.j("CLCSClientDebugLogging", "CLCSClientLogging", "CLCSDismiss", "CLCSInAppNavigation", "CLCSLogOut", "CLCSNavigateBack", "CLCSOpenWebView", "CLCSReadPlatformProperty", "CLCSRecordRdidCtaConsent", "CLCSReloadCurrentRoute", "CLCSRequestScreenUpdate", "CLCSSendFeedback", "CLCSSequentialEffect", "CLCSSubmitAction", "CLCSTvReloadApp", "CLCSTvSwitchToLegacyMoneyball", "CLCSUpdateField");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSEffect", j2).b(C0798Cz.c.e()).a());
        b = j3;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, C9019hg.d(dVar.c())).d());
        e = j4;
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("trackingInfo", C0850Ez.a.c()).d(), new C9018hf.a("loggingViewName", dVar.c()).d(), new C9018hf.a("style", C0820Dv.b.a()).e(j).d(), new C9018hf.a("position", CLCSToastPosition.a.a()).d(), new C9018hf.a("timerMs", EL.d.a()).d(), new C9018hf.a("onTimerComplete", DG.a.c()).e(j3).d(), new C9018hf.a("content", C9019hg.d(C0823Dy.e.b())).e(j4).d());
        d = j5;
        a = 8;
    }
}
