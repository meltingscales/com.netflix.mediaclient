package o;

import java.util.List;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2855anu {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> c;
    public static final C2855anu d = new C2855anu();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> c() {
        return a;
    }

    private C2855anu() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<C9021hi> j3;
        List<AbstractC9025hm> e2;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("ownerGuid", C9019hg.d(C2946apf.d.a())).d());
        c = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("account", C9019hg.d(C2902aoo.c.c())).e(j).d());
        e = j2;
        C9018hf.a aVar = new C9018hf.a("oAuth2Login", C9019hg.d(C3050ard.d.e()));
        j3 = C8569dql.j(new C9021hi.d("authorizationCode").b(new C9027ho("authorizationCode")).b(), new C9021hi.d("grantType").b("AUTHORIZATION_CODE").b(), new C9021hi.d("state").b(new C9027ho("state")).b());
        e2 = C8566dqi.e(aVar.b(j3).e(j2).d());
        a = e2;
    }
}
