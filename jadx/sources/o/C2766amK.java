package o;

import java.util.List;
import o.C2954apn;
import o.C9018hf;

/* renamed from: o.amK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2766amK {
    public static final C2766amK a = new C2766amK();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;

    public final List<AbstractC9025hm> e() {
        return c;
    }

    private C2766amK() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> e;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("code", C9019hg.d(eVar.e())).d());
        b = j;
        e = C8566dqi.e(new C9018hf.a("currentCountry", C2871aoJ.c.a()).e(j).d());
        c = e;
    }
}
