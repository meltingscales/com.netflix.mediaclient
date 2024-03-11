package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2819anK {
    private static final List<AbstractC9025hm> b;
    public static final C2819anK d = new C2819anK();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> c() {
        return e;
    }

    private C2819anK() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List e3;
        List<C9021hi> e4;
        List<AbstractC9025hm> e5;
        e2 = C8566dqi.e("Show");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("Show", e2).b(C2728alZ.c.a()).a());
        b = j;
        C9018hf.a aVar = new C9018hf.a(SignupConstants.Field.VIDEOS, C9019hg.a((AbstractC9026hn) C3378axp.e.d()));
        C9021hi.d dVar = new C9021hi.d("videoIds");
        e3 = C8566dqi.e(new C9027ho(SignupConstants.Field.VIDEO_ID));
        e4 = C8566dqi.e(dVar.b(e3).b());
        e5 = C8566dqi.e(aVar.b(e4).e(j).d());
        e = e5;
    }
}
