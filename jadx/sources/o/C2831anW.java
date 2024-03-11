package o;

import com.netflix.mediaclient.graphql.models.type.SSOTokenNotRenewedReason;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2831anW {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2831anW d = new C2831anW();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> d() {
        return e;
    }

    private C2831anW() {
    }

    static {
        List<AbstractC9025hm> e2;
        List<AbstractC9025hm> e3;
        List e4;
        List e5;
        List<AbstractC9025hm> j;
        List<C9021hi> e6;
        List<AbstractC9025hm> e7;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e(new C9018hf.a("ssoToken", C9019hg.d(eVar.e())).d());
        b = e2;
        e3 = C8566dqi.e(new C9018hf.a("reason", SSOTokenNotRenewedReason.c.b()).d());
        c = e3;
        e4 = C8566dqi.e("SSOTokenRenewed");
        e5 = C8566dqi.e("SSOTokenNotRenewed");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("SSOTokenRenewed", e4).b(e2).a(), new C9017he.d("SSOTokenNotRenewed", e5).b(e3).a());
        a = j;
        C9018hf.a aVar = new C9018hf.a("renewSSOToken", C3217aum.a.c());
        e6 = C8566dqi.e(new C9021hi.d("ssoToken").b(new C9027ho("ssoToken")).b());
        e7 = C8566dqi.e(aVar.b(e6).e(j).d());
        e = e7;
    }
}
