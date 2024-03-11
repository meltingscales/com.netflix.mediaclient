package o;

import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.Dc  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0801Dc {
    public static final int a;
    private static final List<AbstractC9025hm> b;
    public static final C0801Dc c = new C0801Dc();
    private static final List<AbstractC9025hm> d;

    public final List<AbstractC9025hm> a() {
        return b;
    }

    private C0801Dc() {
    }

    static {
        List e;
        List<AbstractC9025hm> j;
        List<C9021hi> j2;
        List<AbstractC9025hm> e2;
        e = C8566dqi.e("CLCSScreen");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(EK.e.c())).d(), new C9017he.d("CLCSScreen", e).b(CR.c.b()).a());
        d = j;
        C9018hf.a aVar = new C9018hf.a("clcsInterstitialUnspecifiedLocation", C0829Ee.b.c());
        j2 = C8569dql.j(new C9021hi.d("commonParameters").b(new C9027ho("commonParameters")).b(), new C9021hi.d("hasGooglePlayService").b(), new C9021hi.d("ignoreSnoozing").b(), new C9021hi.d("isConsumptionOnly").b(), new C9021hi.d("supportedVideoFormat").b());
        e2 = C8566dqi.e(aVar.b(j2).e(j).d());
        b = e2;
        a = 8;
    }
}
