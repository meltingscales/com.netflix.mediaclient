package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2879aoR;
import o.C2945ape;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.alN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2716alN {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final C2716alN c = new C2716alN();
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> i;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> c() {
        return j;
    }

    private C2716alN() {
    }

    static {
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        List<C9021hi> e2;
        List<AbstractC9025hm> j6;
        List e3;
        List j7;
        List j8;
        List j9;
        List<AbstractC9025hm> j10;
        C2954apn.e eVar = C2954apn.c;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d());
        d = j2;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j3 = C8569dql.j(d2, new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d());
        a = j3;
        C9018hf d3 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d4 = new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d();
        C2879aoR.c cVar2 = C2879aoR.b;
        j4 = C8569dql.j(d3, d4, new C9018hf.a("currentEpisode", cVar2.c()).e(j3).d());
        i = j4;
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d());
        e = j5;
        C2945ape.b bVar = C2945ape.b;
        C9018hf d5 = new C9018hf.a("supportsInteractiveExperiences", bVar.b()).d();
        C9018hf d6 = new C9018hf.a("isPlayable", bVar.b()).d();
        C9018hf.a c2 = new C9018hf.a("artwork", C2951apk.b.b()).c("mdxBoxart");
        e2 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("artworkParamsForMdx")).b());
        j6 = C8569dql.j(d5, d6, c2.b(e2).e(j2).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d(), new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("parentShow", C3226auv.e.e()).e(j4).d(), new C9018hf.a("nextEpisode", cVar2.c()).e(j5).d());
        b = j6;
        e3 = C8566dqi.e("Episode");
        j7 = C8569dql.j("Episode", "Movie", "Supplemental");
        j8 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j9 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j10 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Episode", e3).b(j6).a(), new C9017he.d("Viewable", j7).b(C2795amn.b.b()).a(), new C9017he.d("Video", j8).b(C2711alI.e.d()).a(), new C9017he.d("Video", j9).b(C2648ajz.a.e()).a());
        j = j10;
    }
}
