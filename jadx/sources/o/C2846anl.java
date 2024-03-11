package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2846anl {
    public static final C2846anl a = new C2846anl();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> d() {
        return e;
    }

    private C2846anl() {
    }

    static {
        List j;
        List<AbstractC9025hm> j2;
        List<C9021hi> e2;
        List<AbstractC9025hm> e3;
        j = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("Video", j).b(C2700aky.b.e()).a());
        b = j2;
        C9018hf.a aVar = new C9018hf.a(SignupConstants.Field.VIDEOS, C9019hg.a((AbstractC9026hn) C3378axp.e.d()));
        e2 = C8566dqi.e(new C9021hi.d("videoIds").b(new C9027ho("videoIds")).b());
        e3 = C8566dqi.e(aVar.b(e2).e(j2).d());
        e = e3;
    }
}
