package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.aof  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2893aof {
    private static final List<AbstractC9025hm> a;
    public static final C2893aof b = new C2893aof();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> c() {
        return a;
    }

    private C2893aof() {
    }

    static {
        List j;
        List j2;
        List j3;
        List<AbstractC9025hm> j4;
        List e2;
        List j5;
        List j6;
        List<AbstractC9025hm> j7;
        List<C9021hi> e3;
        List<AbstractC9025hm> e4;
        j = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        C9017he a2 = new C9017he.d("Video", j).b(C2710alH.a.b()).a();
        j2 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        C9017he a3 = new C9017he.d("Video", j2).b(C2746alr.d.a()).a();
        j3 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j4 = C8569dql.j(a2, a3, new C9017he.d("Video", j3).b(C2748alt.a.a()).a());
        c = j4;
        e2 = C8566dqi.e("Show");
        j5 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j6 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j7 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("Show", e2).b(C2724alV.a.e()).a(), new C9017he.d("Video", j5).b(C2694aks.d.d()).a(), new C9017he.d("Video", j6).b(j4).a());
        e = j7;
        C9018hf.a aVar = new C9018hf.a(SignupConstants.Field.VIDEOS, C9019hg.a((AbstractC9026hn) C3378axp.e.d()));
        e3 = C8566dqi.e(new C9021hi.d("videoIds").b(new C9027ho("videoIds")).b());
        e4 = C8566dqi.e(aVar.b(e3).e(j7).d());
        a = e4;
    }
}
