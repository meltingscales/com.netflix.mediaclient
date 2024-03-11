package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2772amQ {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2772amQ e = new C2772amQ();
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> h;

    public final List<AbstractC9025hm> e() {
        return h;
    }

    private C2772amQ() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List e3;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List e4;
        List j5;
        List j6;
        List j7;
        List<C9021hi> e5;
        List<AbstractC9025hm> j8;
        List<C9021hi> e6;
        List<AbstractC9025hm> e7;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("Season");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Season", e2).b(C2727alY.c.c()).a());
        d = j;
        e3 = C8566dqi.e("Show");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Show", e3).b(C2718alP.c.d()).a());
        c = j2;
        j3 = C8569dql.j(new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d(), new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("parentSeason", C3215auk.e.e()).e(j).d(), new C9018hf.a("parentShow", C3226auv.e.e()).e(j2).d());
        a = j3;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        b = j4;
        e4 = C8566dqi.e("Episode");
        j5 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j6 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j7 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        C9018hf.a c2 = new C9018hf.a("artwork", C2951apk.b.b()).c("interestingArtwork");
        e5 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("artworkParamsForInteresting")).b());
        j8 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Episode", e4).b(j3).a(), new C9017he.d("Video", j5).b(C2746alr.d.a()).a(), new C9017he.d("Video", j6).b(C2710alH.a.b()).a(), new C9017he.d("Video", j7).b(C2694aks.d.d()).a(), c2.b(e5).e(j4).d());
        f = j8;
        C9018hf.a aVar = new C9018hf.a(SignupConstants.Field.VIDEOS, C9019hg.a((AbstractC9026hn) C3378axp.e.d()));
        e6 = C8566dqi.e(new C9021hi.d("videoIds").b(new C9027ho("videoIds")).b());
        e7 = C8566dqi.e(aVar.b(e6).e(j8).d());
        h = e7;
    }
}
