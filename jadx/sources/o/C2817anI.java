package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anI  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2817anI {
    private static final List<AbstractC9025hm> a;
    public static final C2817anI b = new C2817anI();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> i;

    public final List<AbstractC9025hm> c() {
        return i;
    }

    private C2817anI() {
    }

    static {
        List e2;
        List<AbstractC9025hm> e3;
        List j;
        List e4;
        List<AbstractC9025hm> j2;
        List j3;
        List<AbstractC9025hm> e5;
        List j4;
        List<AbstractC9025hm> e6;
        List e7;
        List e8;
        List e9;
        List e10;
        List<AbstractC9025hm> j5;
        List<C9021hi> e11;
        List<AbstractC9025hm> e12;
        e2 = C8566dqi.e("Show");
        e3 = C8566dqi.e(new C9017he.d("Show", e2).b(C2783amb.e.c()).a());
        c = e3;
        j = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        C9017he.d dVar = new C9017he.d("Video", j);
        C2714alL c2714alL = C2714alL.d;
        C9017he a2 = dVar.b(c2714alL.b()).a();
        e4 = C8566dqi.e("Episode");
        j2 = C8569dql.j(a2, new C9017he.d("Episode", e4).b(C2709alG.d.c()).a());
        d = j2;
        j3 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        e5 = C8566dqi.e(new C9017he.d("Video", j3).b(c2714alL.b()).a());
        a = e5;
        j4 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        e6 = C8566dqi.e(new C9017he.d("Video", j4).b(c2714alL.b()).a());
        e = e6;
        e7 = C8566dqi.e("Show");
        e8 = C8566dqi.e("Episode");
        e9 = C8566dqi.e("Movie");
        e10 = C8566dqi.e("Supplemental");
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9017he.d("Show", e7).b(e3).a(), new C9017he.d("Episode", e8).b(j2).a(), new C9017he.d("Movie", e9).b(e5).a(), new C9017he.d("Supplemental", e10).b(e6).a());
        g = j5;
        C9018hf.a aVar = new C9018hf.a(SignupConstants.Field.VIDEOS, C9019hg.a((AbstractC9026hn) C3378axp.e.d()));
        e11 = C8566dqi.e(new C9021hi.d("videoIds").b(new C9027ho("videoIds")).b());
        e12 = C8566dqi.e(aVar.b(e11).e(j5).d());
        i = e12;
    }
}
