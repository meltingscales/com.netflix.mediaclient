package o;

import com.netflix.clcs.codegen.type.CLCSLoggableSessionType;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C0811Dm;
import o.C9017he;
import o.C9018hf;
import o.DK;
import o.EE;
import o.EK;

/* loaded from: classes2.dex */
public final class CA {
    public static final CA a = new CA();
    public static final int b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> i;
    private static final List<AbstractC9025hm> j;
    private static final List<AbstractC9025hm> k;
    private static final List<AbstractC9025hm> l;
    private static final List<AbstractC9025hm> m;
    private static final List<AbstractC9025hm> n;

    /* renamed from: o  reason: collision with root package name */
    private static final List<AbstractC9025hm> f13349o;
    private static final List<AbstractC9025hm> p;
    private static final List<AbstractC9025hm> q;
    private static final List<AbstractC9025hm> r;
    private static final List<AbstractC9025hm> s;
    private static final List<AbstractC9025hm> t;
    private static final List<AbstractC9025hm> u;
    private static final List<AbstractC9025hm> v;
    private static final List<AbstractC9025hm> w;
    private static final List<AbstractC9025hm> x;
    private static final List<AbstractC9025hm> y;

    public final List<AbstractC9025hm> b() {
        return y;
    }

    private CA() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> e3;
        List e4;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> e5;
        List j4;
        List<AbstractC9025hm> j5;
        List<AbstractC9025hm> j6;
        List<AbstractC9025hm> j7;
        List j8;
        List<AbstractC9025hm> j9;
        List<AbstractC9025hm> j10;
        List<AbstractC9025hm> j11;
        List<AbstractC9025hm> j12;
        List<AbstractC9025hm> e6;
        List<AbstractC9025hm> j13;
        List<AbstractC9025hm> j14;
        List<AbstractC9025hm> e7;
        List<AbstractC9025hm> j15;
        List<AbstractC9025hm> e8;
        List j16;
        List<AbstractC9025hm> j17;
        List<AbstractC9025hm> j18;
        List<AbstractC9025hm> j19;
        List<AbstractC9025hm> j20;
        List<AbstractC9025hm> e9;
        List e10;
        List e11;
        List e12;
        List e13;
        List e14;
        List e15;
        List e16;
        List e17;
        List e18;
        List e19;
        List e20;
        List<AbstractC9025hm> j21;
        EK.d dVar = EK.e;
        e2 = C8566dqi.e("AlertDialog");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("AlertDialog", e2).b(C0781Ci.d.e()).a());
        d = j2;
        e3 = C8566dqi.e(new C9018hf.a("alert", C0810Dl.e.c()).e(j2).d());
        f13349o = e3;
        e4 = C8566dqi.e("CLCSEffectErrorHandlingAlert");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSEffectErrorHandlingAlert", e4).b(e3).a());
        c = j3;
        e5 = C8566dqi.e(new C9018hf.a("loggingCommand", dVar.c()).d());
        k = e5;
        j4 = C8569dql.j("CLCSBooleanField", "CLCSCardField", "CLCSEncryptedCardField", "CLCSIntegerField", "CLCSStringField");
        C9017he.d dVar2 = new C9017he.d("CLCSField", j4);
        C0795Cw c0795Cw = C0795Cw.b;
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), dVar2.b(c0795Cw.e()).a());
        g = j5;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(dVar.c())).d();
        DK.d dVar3 = DK.c;
        C9018hf d3 = new C9018hf.a("field", C9019hg.d(dVar3.d())).e(j5).d();
        EE.e eVar = EE.e;
        j6 = C8569dql.j(d2, d3, new C9018hf.a("required", C9019hg.d(eVar.a())).d());
        h = j6;
        C9018hf d4 = new C9018hf.a("loggingCommand", dVar.c()).d();
        C9018hf d5 = new C9018hf.a("serverAction", C9019hg.d(C0828Ed.c.e())).d();
        C0811Dm.c cVar = C0811Dm.a;
        j7 = C8569dql.j(d4, d5, new C9018hf.a("inputFieldRequirements", C9019hg.a(C9019hg.d(cVar.c()))).e(j6).d());
        u = j7;
        j8 = C8569dql.j("CLCSBooleanField", "CLCSCardField", "CLCSEncryptedCardField", "CLCSIntegerField", "CLCSStringField");
        j9 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSField", j8).b(c0795Cw.e()).a());
        j = j9;
        j10 = C8569dql.j(new C9018hf.a("serverFeedback", C0837Em.d.b()).d(), new C9018hf.a("inputFields", C9019hg.a(C9019hg.d(dVar3.d()))).e(j9).d());
        x = j10;
        j11 = C8569dql.j(new C9018hf.a("uri", C9019hg.d(EM.a.a())).d(), new C9018hf.a("useAutoLogin", eVar.a()).d(), new C9018hf.a("useEmbeddedWebView", eVar.a()).d());
        s = j11;
        j12 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("consentId", dVar.c()).d(), new C9018hf.a("displayedAt", EG.d.a()).d(), new C9018hf.a("isDenied", eVar.a()).d());
        w = j12;
        e6 = C8566dqi.e(new C9018hf.a("rdidCtaConsentState", C0826Eb.b.c()).e(j12).d());
        p = e6;
        j13 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("viewName", dVar.c()).d(), new C9018hf.a("contextName", dVar.c()).d(), new C9018hf.a("trackingInfo", C0850Ez.a.c()).d());
        e = j13;
        j14 = C8569dql.j(new C9018hf.a("type", C9019hg.d(CLCSLoggableSessionType.a.e())).d(), new C9018hf.a(NotificationFactory.DATA, C0819Du.a.c()).e(j13).d());
        m = j14;
        e7 = C8566dqi.e(new C9018hf.a("debugData", C9019hg.d(C0822Dx.c.e())).d());
        n = e7;
        j15 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("universal", dVar.c()).d());
        l = j15;
        e8 = C8566dqi.e(new C9018hf.a("location", C9019hg.d(C0812Dn.b.e())).e(j15).d());
        q = e8;
        j16 = C8569dql.j("CLCSBooleanField", "CLCSCardField", "CLCSEncryptedCardField", "CLCSIntegerField", "CLCSStringField");
        j17 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9017he.d("CLCSField", j16).b(c0795Cw.e()).a());
        i = j17;
        j18 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("field", C9019hg.d(dVar3.d())).e(j17).d(), new C9018hf.a("required", C9019hg.d(eVar.a())).d());
        f = j18;
        j19 = C8569dql.j(new C9018hf.a("serverScreenUpdate", C9019hg.d(C0836El.e.c())).d(), new C9018hf.a("inputFieldRequirements", C9019hg.a(C9019hg.d(cVar.c()))).e(j18).d(), new C9018hf.a("loggingCommand", dVar.c()).d(), new C9018hf.a("loggingAction", dVar.c()).d());
        v = j19;
        j20 = C8569dql.j(new C9018hf.a("loggingCommand", dVar.c()).d(), new C9018hf.a("loggingAction", dVar.c()).d(), new C9018hf.a("navigationMarker", dVar.c()).d());
        t = j20;
        e9 = C8566dqi.e(new C9018hf.a("loggingCommand", dVar.c()).d());
        r = e9;
        e10 = C8566dqi.e("CLCSDismiss");
        e11 = C8566dqi.e("CLCSSubmitAction");
        e12 = C8566dqi.e("CLCSSendFeedback");
        e13 = C8566dqi.e("CLCSOpenWebView");
        e14 = C8566dqi.e("CLCSRecordRdidCtaConsent");
        e15 = C8566dqi.e("CLCSClientLogging");
        e16 = C8566dqi.e("CLCSClientDebugLogging");
        e17 = C8566dqi.e("CLCSInAppNavigation");
        e18 = C8566dqi.e("CLCSRequestScreenUpdate");
        e19 = C8566dqi.e("CLCSNavigateBack");
        e20 = C8566dqi.e("CLCSLogOut");
        j21 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(dVar.c())).d(), new C9018hf.a("errorHandling", DE.c.a()).e(j3).d(), new C9017he.d("CLCSDismiss", e10).b(e5).a(), new C9017he.d("CLCSSubmitAction", e11).b(j7).a(), new C9017he.d("CLCSSendFeedback", e12).b(j10).a(), new C9017he.d("CLCSOpenWebView", e13).b(j11).a(), new C9017he.d("CLCSRecordRdidCtaConsent", e14).b(e6).a(), new C9017he.d("CLCSClientLogging", e15).b(j14).a(), new C9017he.d("CLCSClientDebugLogging", e16).b(e7).a(), new C9017he.d("CLCSInAppNavigation", e17).b(e8).a(), new C9017he.d("CLCSRequestScreenUpdate", e18).b(j19).a(), new C9017he.d("CLCSNavigateBack", e19).b(j20).a(), new C9017he.d("CLCSLogOut", e20).b(e9).a());
        y = j21;
        b = 8;
    }
}
