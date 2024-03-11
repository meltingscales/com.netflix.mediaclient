package o;

import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.amr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2799amr {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2799amr d = new C2799amr();
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> i;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> a() {
        return i;
    }

    private C2799amr() {
    }

    static {
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> e2;
        List e3;
        List e4;
        List<AbstractC9025hm> j5;
        List<AbstractC9025hm> e5;
        List<AbstractC9025hm> e6;
        List e7;
        List e8;
        List<AbstractC9025hm> j6;
        List<AbstractC9025hm> j7;
        C2954apn.e eVar = C2954apn.c;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("fullHandle", eVar.e()).d());
        b = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("handle", C3193auN.c.d()).e(j2).d());
        j = j3;
        C2949api.c cVar = C2949api.a;
        j4 = C8569dql.j(new C9018hf.a("handleMinLength", cVar.d()).d(), new C9018hf.a("handleMaxLength", cVar.d()).d(), new C9018hf.a("handlePattern", eVar.e()).d());
        g = j4;
        e2 = C8566dqi.e(new C9018hf.a("reason", eVar.e()).d());
        a = e2;
        e3 = C8566dqi.e("UPIHandleConfiguration");
        e4 = C8566dqi.e("FeatureConfigurationUnavailable");
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("UPIHandleConfiguration", e3).b(j4).a(), new C9017he.d("FeatureConfigurationUnavailable", e4).b(e2).a());
        e = j5;
        e5 = C8566dqi.e(new C9018hf.a("handleConfiguration", C3195auP.d.d()).e(j5).d());
        h = e5;
        e6 = C8566dqi.e(new C9018hf.a("reason", eVar.e()).d());
        c = e6;
        e7 = C8566dqi.e("UPIConfiguration");
        e8 = C8566dqi.e("FeatureUnavailable");
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("UPIConfiguration", e7).b(e5).a(), new C9017he.d("FeatureUnavailable", e8).b(e6).a());
        f = j6;
        j7 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("publicIdentity", C3144atR.a.e()).e(j3).d(), new C9018hf.a("publicIdentityConfiguration", C3190auK.b.a()).e(j6).d());
        i = j7;
    }
}
