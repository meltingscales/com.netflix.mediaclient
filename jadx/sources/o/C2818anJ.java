package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2818anJ {
    public static final C2818anJ b = new C2818anJ();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> e() {
        return c;
    }

    private C2818anJ() {
    }

    static {
        List e2;
        List<AbstractC9025hm> e3;
        List e4;
        List<AbstractC9025hm> j;
        List e5;
        List<C9021hi> e6;
        List<AbstractC9025hm> e7;
        e2 = C8566dqi.e("Show");
        e3 = C8566dqi.e(new C9017he.d("Show", e2).b(C2724alV.a.e()).a());
        d = e3;
        e4 = C8566dqi.e("Show");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("Show", e4).b(e3).a());
        e = j;
        C9018hf.a aVar = new C9018hf.a(SignupConstants.Field.VIDEOS, C9019hg.a((AbstractC9026hn) C3378axp.e.d()));
        C9021hi.d dVar = new C9021hi.d("videoIds");
        e5 = C8566dqi.e(new C9027ho(SignupConstants.Field.VIDEO_ID));
        e6 = C8566dqi.e(dVar.b(e5).b());
        e7 = C8566dqi.e(aVar.b(e6).e(j).d());
        c = e7;
    }
}
