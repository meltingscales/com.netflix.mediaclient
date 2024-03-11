package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.alH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2710alH {
    public static final C2710alH a = new C2710alH();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> g;

    public final List<AbstractC9025hm> b() {
        return g;
    }

    private C2710alH() {
    }

    static {
        List j;
        List j2;
        List j3;
        List<AbstractC9025hm> j4;
        List e2;
        List<AbstractC9025hm> j5;
        List<AbstractC9025hm> j6;
        List e3;
        List<AbstractC9025hm> e4;
        List e5;
        List e6;
        List e7;
        List<AbstractC9025hm> j7;
        j = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        C9017he a2 = new C9017he.d("Video", j).b(C2794amm.d.c()).a();
        j2 = C8569dql.j("Episode", "Movie", "Supplemental");
        C9017he a3 = new C9017he.d("Viewable", j2).b(C2792amk.a.d()).a();
        j3 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j4 = C8569dql.j(a2, a3, new C9017he.d("Video", j3).b(C2691akp.a.b()).a());
        c = j4;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("Episode");
        C9017he.d dVar = new C9017he.d("Episode", e2);
        C2713alK c2713alK = C2713alK.d;
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), dVar.b(c2713alK.a()).a());
        e = j5;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j6 = C8569dql.j(d2, new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d(), new C9018hf.a("currentEpisode", C2879aoR.b.c()).e(j5).d());
        b = j6;
        e3 = C8566dqi.e("Episode");
        e4 = C8566dqi.e(new C9017he.d("Episode", e3).b(c2713alK.a()).a());
        d = e4;
        e5 = C8566dqi.e("Movie");
        e6 = C8566dqi.e("Show");
        e7 = C8566dqi.e("Episode");
        j7 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d(), new C9017he.d("Movie", e5).b(j4).a(), new C9017he.d("Show", e6).b(j6).a(), new C9017he.d("Episode", e7).b(e4).a());
        g = j7;
    }
}
