package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2847anm {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> d;
    public static final C2847anm e = new C2847anm();

    public final List<AbstractC9025hm> b() {
        return d;
    }

    private C2847anm() {
    }

    static {
        List j;
        List j2;
        List<AbstractC9025hm> j3;
        List<C9021hi> e2;
        List<AbstractC9025hm> e3;
        j = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j2 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("Video", j).b(C2700aky.b.e()).a(), new C9017he.d("Video", j2).b(C2701akz.e.b()).a());
        a = j3;
        C9018hf.a aVar = new C9018hf.a(SignupConstants.Field.VIDEOS, C9019hg.a((AbstractC9026hn) C3378axp.e.d()));
        e2 = C8566dqi.e(new C9021hi.d("videoIds").b(new C9027ho("videoIds")).b());
        e3 = C8566dqi.e(aVar.b(e2).e(j3).d());
        d = e3;
    }
}
