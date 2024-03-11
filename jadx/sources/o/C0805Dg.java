package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;
import o.EK;

/* renamed from: o.Dg  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0805Dg {
    private static final List<AbstractC9025hm> a;
    public static final C0805Dg b = new C0805Dg();
    public static final int c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> a() {
        return h;
    }

    private C0805Dg() {
    }

    static {
        List j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> e2;
        List e3;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        List e4;
        List e5;
        List<AbstractC9025hm> j6;
        List<C9021hi> j7;
        List<AbstractC9025hm> e6;
        EK.d dVar = EK.e;
        j2 = C8569dql.j("CLCSClientDebugLogging", "CLCSClientLogging", "CLCSDismiss", "CLCSInAppNavigation", "CLCSLogOut", "CLCSNavigateBack", "CLCSOpenWebView", "CLCSReadPlatformProperty", "CLCSRecordRdidCtaConsent", "CLCSReloadCurrentRoute", "CLCSRequestScreenUpdate", "CLCSSendFeedback", "CLCSSequentialEffect", "CLCSSubmitAction", "CLCSTvReloadApp", "CLCSTvSwitchToLegacyMoneyball", "CLCSUpdateField");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSEffect", j2).b(C0798Cz.c.e()).a());
        d = j3;
        e2 = C8566dqi.e(new C9018hf.a("effect", C9019hg.d(DG.a.c())).e(j3).d());
        e = e2;
        e3 = C8566dqi.e("CLCSScreen");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSScreen", e3).b(CR.c.b()).a());
        j = j4;
        j5 = C8569dql.j(new C9018hf.a("screen", C9019hg.d(C0829Ee.b.c())).e(j4).d(), new C9018hf.a("replaceCurrentScreen", EE.e.a()).d());
        f = j5;
        e4 = C8566dqi.e("CLCSScreenUpdateEffect");
        e5 = C8566dqi.e("CLCSScreenUpdateTransition");
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSScreenUpdateEffect", e4).b(e2).a(), new C9017he.d("CLCSScreenUpdateTransition", e5).b(j5).a());
        a = j6;
        C9018hf.a aVar = new C9018hf.a("clcsScreenUpdate", C0832Eh.e.d());
        j7 = C8569dql.j(new C9021hi.d("inputFields").b(new C9027ho("inputFields")).b(), new C9021hi.d("serverScreenUpdate").b(new C9027ho("serverScreenUpdate")).b(), new C9021hi.d("serverState").b(new C9027ho("serverState")).b());
        e6 = C8566dqi.e(aVar.b(j7).e(j6).d());
        h = e6;
        c = 8;
    }
}
