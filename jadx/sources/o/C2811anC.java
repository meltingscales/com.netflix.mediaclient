package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2811anC {
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> d;
    public static final C2811anC e = new C2811anC();

    public final List<AbstractC9025hm> b() {
        return b;
    }

    private C2811anC() {
    }

    static {
        List j;
        List j2;
        List<AbstractC9025hm> j3;
        List e2;
        List<C9021hi> e3;
        List<AbstractC9025hm> e4;
        j = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j2 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d(), new C9017he.d("Video", j).b(C2711alI.e.d()).a(), new C9017he.d("Video", j2).b(C2648ajz.a.e()).a());
        d = j3;
        C9018hf.a aVar = new C9018hf.a(SignupConstants.Field.VIDEOS, C9019hg.a((AbstractC9026hn) C3378axp.e.d()));
        C9021hi.d dVar = new C9021hi.d("videoIds");
        e2 = C8566dqi.e(new C9027ho(SignupConstants.Field.VIDEO_ID));
        e3 = C8566dqi.e(dVar.b(e2).b());
        e4 = C8566dqi.e(aVar.b(e3).e(j3).d());
        b = e4;
    }
}
