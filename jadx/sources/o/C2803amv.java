package o;

import com.netflix.mediaclient.service.webclient.model.leafs.UserAccountConstants;
import java.util.List;
import o.C2945ape;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.amv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2803amv {
    public static final C2803amv a = new C2803amv();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> g;

    public final List<AbstractC9025hm> a() {
        return g;
    }

    private C2803amv() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List e2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> e3;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("code", C9019hg.d(eVar.e())).d());
        b = j;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2945ape.b bVar = C2945ape.b;
        j2 = C8569dql.j(d2, new C9018hf.a("isMobileOnlyPlan", bVar.b()).d());
        c = j2;
        e2 = C8566dqi.e("Profile");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Profile", e2).b(C2800ams.b.e()).a());
        e = j3;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(UserAccountConstants.FIELD_CAN_CREATE_USER_PROFILE, bVar.b()).d(), new C9018hf.a(UserAccountConstants.FIELD_SIGNUP_COUNTRY, C2871aoJ.c.a()).e(j).d(), new C9018hf.a("isAgeVerified", bVar.b()).d(), new C9018hf.a("isNonMember", bVar.b()).d(), new C9018hf.a(UserAccountConstants.FIELD_MEMBER_SINCE, C2873aoL.a.d()).d(), new C9018hf.a("ownerGuid", C9019hg.d(C2946apf.d.a())).d(), new C9018hf.a("planInfo", C2899aol.c.c()).e(j2).d(), new C9018hf.a("profiles", C9019hg.d(C9019hg.a(C9019hg.d(C3137atK.a.d())))).e(j3).d());
        d = j4;
        e3 = C8566dqi.e(new C9018hf.a("account", C2902aoo.c.c()).e(j4).d());
        g = e3;
    }
}
