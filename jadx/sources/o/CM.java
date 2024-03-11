package o;

import com.netflix.clcs.codegen.type.CLCSButtonType;
import com.netflix.clcs.codegen.type.CLCSModalPresentation;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.EK;

/* loaded from: classes2.dex */
public final class CM {
    public static final int a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final CM d = new CM();
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> i;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> e() {
        return j;
    }

    private CM() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j2;
        List e3;
        List<AbstractC9025hm> j3;
        List j4;
        List<AbstractC9025hm> j5;
        List<AbstractC9025hm> j6;
        List<AbstractC9025hm> j7;
        EK.d dVar = EK.e;
        e2 = C8566dqi.e("CLCSImage");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSImage", e2).b(CK.b.d()).a());
        e = j2;
        e3 = C8566dqi.e("CLCSContainerStyle");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSContainerStyle", e3).b(C0791Cs.d.c()).a());
        i = j3;
        j4 = C8569dql.j("CLCSClientDebugLogging", "CLCSClientLogging", "CLCSDismiss", "CLCSInAppNavigation", "CLCSLogOut", "CLCSNavigateBack", "CLCSOpenWebView", "CLCSReadPlatformProperty", "CLCSRecordRdidCtaConsent", "CLCSReloadCurrentRoute", "CLCSRequestScreenUpdate", "CLCSSendFeedback", "CLCSSequentialEffect", "CLCSSubmitAction", "CLCSTvReloadApp", "CLCSTvSwitchToLegacyMoneyball", "CLCSUpdateField");
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSEffect", j4).b(C0798Cz.c.e()).a());
        b = j5;
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, C9019hg.d(dVar.c())).d());
        c = j6;
        j7 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("presentation", CLCSModalPresentation.d.e()).d(), new C9018hf.a("backgroundImage", DO.a.a()).e(j2).d(), new C9018hf.a("style", C0820Dv.b.a()).e(j3).d(), new C9018hf.a("closeButtonType", CLCSButtonType.c.a()).d(), new C9018hf.a("onClose", DG.a.c()).e(j5).d(), new C9018hf.a("content", C9019hg.d(C0823Dy.e.b())).e(j6).d());
        j = j7;
        a = 8;
    }
}
