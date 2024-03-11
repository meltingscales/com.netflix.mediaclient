package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2758amC {
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2758amC e = new C2758amC();

    public final List<AbstractC9025hm> e() {
        return d;
    }

    private C2758amC() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<C9021hi> e3;
        List<AbstractC9025hm> e4;
        e2 = C8566dqi.e("ParentalControlMaturityRating");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("ParentalControlMaturityRating", e2).b(C2747als.c.d()).a());
        c = j;
        C9018hf.a aVar = new C9018hf.a("parentalControlMaturityRatings", C9019hg.a((AbstractC9026hn) C3065ars.a.d()));
        e3 = C8566dqi.e(new C9021hi.d(SignupConstants.Field.COUNTRY_CODE).b(new C9027ho(SignupConstants.Field.COUNTRY_CODE)).b());
        e4 = C8566dqi.e(aVar.b(e3).e(j).d());
        d = e4;
    }
}
