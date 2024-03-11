package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.ano  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2849ano {
    public static final C2849ano a = new C2849ano();
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> a() {
        return e;
    }

    private C2849ano() {
    }

    static {
        List j;
        List j2;
        List j3;
        List j4;
        List<AbstractC9025hm> j5;
        List<C9021hi> e2;
        List<AbstractC9025hm> e3;
        j = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j2 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j3 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j4 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("Video", j).b(C2714alL.d.b()).a(), new C9017he.d("Video", j2).b(C2694aks.d.d()).a(), new C9017he.d("Video", j3).b(C2746alr.d.a()).a(), new C9017he.d("Video", j4).b(C2710alH.a.b()).a());
        d = j5;
        C9018hf.a aVar = new C9018hf.a(SignupConstants.Field.VIDEOS, C9019hg.a((AbstractC9026hn) C3378axp.e.d()));
        e2 = C8566dqi.e(new C9021hi.d("videoIds").b(new C9027ho("videoIds")).b());
        e3 = C8566dqi.e(aVar.b(e2).e(j5).d());
        e = e3;
    }
}
