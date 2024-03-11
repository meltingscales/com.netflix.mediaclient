package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.aoi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2896aoi {
    public static final C2896aoi b = new C2896aoi();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;

    public final List<AbstractC9025hm> e() {
        return d;
    }

    private C2896aoi() {
    }

    static {
        List j;
        List<AbstractC9025hm> j2;
        List<C9021hi> e;
        List<AbstractC9025hm> e2;
        j = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("Video", j).b(C2790ami.e.d()).a());
        c = j2;
        C9018hf.a aVar = new C9018hf.a(SignupConstants.Field.VIDEOS, C9019hg.a((AbstractC9026hn) C3378axp.e.d()));
        e = C8566dqi.e(new C9021hi.d("videoIds").b(new C9027ho("videoIds")).b());
        e2 = C8566dqi.e(aVar.b(e).e(j2).d());
        d = e2;
    }
}
