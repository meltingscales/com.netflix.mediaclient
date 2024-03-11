package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amM  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2768amM {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final C2768amM e = new C2768amM();

    public final List<AbstractC9025hm> d() {
        return a;
    }

    private C2768amM() {
    }

    static {
        List j;
        List<AbstractC9025hm> j2;
        List e2;
        List<C9021hi> e3;
        List<AbstractC9025hm> e4;
        j = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("Video", j).b(C2598ajB.b.b()).a());
        b = j2;
        C9018hf.a aVar = new C9018hf.a(SignupConstants.Field.VIDEOS, C9019hg.a((AbstractC9026hn) C3378axp.e.d()));
        C9021hi.d dVar = new C9021hi.d("videoIds");
        e2 = C8566dqi.e(new C9027ho(SignupConstants.Field.VIDEO_ID));
        e3 = C8566dqi.e(dVar.b(e2).b());
        e4 = C8566dqi.e(aVar.b(e3).e(j2).d());
        a = e4;
    }
}
