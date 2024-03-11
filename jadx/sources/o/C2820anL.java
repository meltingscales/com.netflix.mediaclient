package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2820anL {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final C2820anL c = new C2820anL();
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> e() {
        return d;
    }

    private C2820anL() {
    }

    static {
        List j;
        List e2;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List e3;
        List<AbstractC9025hm> j4;
        List e4;
        List<C9021hi> e5;
        List<AbstractC9025hm> e6;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        e2 = C8566dqi.e("Episode");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Video", j).b(C2714alL.d.b()).a(), new C9017he.d("Episode", e2).b(C2709alG.d.c()).a());
        a = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d(), new C9018hf.a("nextEpisode", C2879aoR.b.c()).e(j2).d());
        e = j3;
        e3 = C8566dqi.e("Episode");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Episode", e3).b(j3).a());
        b = j4;
        C9018hf.a aVar = new C9018hf.a(SignupConstants.Field.VIDEOS, C9019hg.a((AbstractC9026hn) C3378axp.e.d()));
        C9021hi.d dVar = new C9021hi.d("videoIds");
        e4 = C8566dqi.e(new C9027ho(SignupConstants.Field.VIDEO_ID));
        e5 = C8566dqi.e(dVar.b(e4).b());
        e6 = C8566dqi.e(aVar.b(e5).e(j4).d());
        d = e6;
    }
}
