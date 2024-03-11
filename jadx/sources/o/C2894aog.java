package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.aog  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2894aog {
    public static final C2894aog a = new C2894aog();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> d;

    public final List<AbstractC9025hm> a() {
        return d;
    }

    private C2894aog() {
    }

    static {
        List<AbstractC9025hm> j;
        List<C9021hi> e;
        List<AbstractC9025hm> e2;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9018hf.a("verified", C2945ape.b.b()).d());
        b = j;
        C9018hf.a aVar = new C9018hf.a("verifyPassword", C3376axn.d.d());
        e = C8566dqi.e(new C9021hi.d(SignupConstants.Field.PASSWORD).b(new C9027ho(SignupConstants.Field.PASSWORD)).b());
        e2 = C8566dqi.e(aVar.b(e).e(j).d());
        d = e2;
    }
}
