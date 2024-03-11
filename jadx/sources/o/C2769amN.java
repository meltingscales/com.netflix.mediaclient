package o;

import java.util.List;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2769amN {
    public static final C2769amN a = new C2769amN();
    private static final List<AbstractC9025hm> d;

    public final List<AbstractC9025hm> c() {
        return d;
    }

    private C2769amN() {
    }

    static {
        List<C9021hi> e;
        List<AbstractC9025hm> e2;
        C9018hf.a aVar = new C9018hf.a("createAutoLoginToken", C9019hg.d(C2954apn.c.e()));
        e = C8566dqi.e(new C9021hi.d("scope").b(new C9027ho("scope")).b());
        e2 = C8566dqi.e(aVar.b(e).d());
        d = e2;
    }
}
