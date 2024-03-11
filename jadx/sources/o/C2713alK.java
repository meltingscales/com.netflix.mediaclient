package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.alK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2713alK {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> c;
    public static final C2713alK d = new C2713alK();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> a() {
        return c;
    }

    private C2713alK() {
    }

    static {
        List<AbstractC9025hm> j;
        List<C9021hi> e2;
        List<C9021hi> e3;
        List<AbstractC9025hm> j2;
        List j3;
        List j4;
        List j5;
        List<C9021hi> e4;
        List<AbstractC9025hm> j6;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j = C8569dql.j(d2, new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d());
        e = j;
        C9018hf d3 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d4 = new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d();
        C9018hf d5 = new C9018hf.a("number", cVar.d()).d();
        C9018hf.a aVar = new C9018hf.a("numberLabelV2", eVar.e());
        e2 = C8566dqi.e(new C9021hi.d("label").b("ABBR").b());
        C9018hf d6 = aVar.b(e2).d();
        C9018hf.a c2 = new C9018hf.a("numberLabelV2", eVar.e()).c("longNumberLabel");
        e3 = C8566dqi.e(new C9021hi.d("label").b("LONG").b());
        j2 = C8569dql.j(d3, d4, d5, d6, c2.b(e3).d(), new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d());
        a = j2;
        j3 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j4 = C8569dql.j("Episode", "Movie", "Supplemental");
        j5 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        C9018hf.a c3 = new C9018hf.a("hasTitleBehavior", C2945ape.b.b()).c("hiddenEpisodeNumbers");
        e4 = C8566dqi.e(new C9021hi.d("behavior").b("hiddenEpisodeNumbers").b());
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Video", j3).b(C2794amm.d.c()).a(), new C9017he.d("Viewable", j4).b(C2792amk.a.d()).a(), new C9017he.d("Video", j5).b(C2691akp.a.b()).a(), c3.b(e4).d(), new C9018hf.a("number", cVar.d()).d(), new C9018hf.a("parentShow", C3226auv.e.e()).e(j).d(), new C9018hf.a("parentSeason", C3215auk.e.e()).e(j2).d());
        c = j6;
    }
}
