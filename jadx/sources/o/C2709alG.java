package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2945ape;
import o.C2949api;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.alG  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2709alG {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2709alG d = new C2709alG();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> c() {
        return a;
    }

    private C2709alG() {
    }

    static {
        List<C9021hi> e2;
        List<C9021hi> e3;
        List<AbstractC9025hm> j;
        List e4;
        List<AbstractC9025hm> j2;
        List e5;
        List<AbstractC9025hm> j3;
        List<C9021hi> e6;
        List<AbstractC9025hm> j4;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        C9018hf d3 = new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d();
        C9018hf d4 = new C9018hf.a("number", cVar.d()).d();
        C9018hf.a aVar = new C9018hf.a("numberLabel", eVar.e());
        e2 = C8566dqi.e(new C9021hi.d("label").b("ABBR").b());
        C9018hf d5 = aVar.b(e2).d();
        C9018hf.a c2 = new C9018hf.a("numberLabel", eVar.e()).c("longNumberLabelForPlayer");
        e3 = C8566dqi.e(new C9021hi.d("label").b("LONG").b());
        j = C8569dql.j(d2, d3, d4, d5, c2.b(e3).d(), new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d());
        e = j;
        e4 = C8566dqi.e("Season");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Season", e4).b(j).a());
        c = j2;
        e5 = C8566dqi.e("Show");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Show", e5).b(C2718alP.c.d()).a());
        b = j3;
        C9018hf d6 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2945ape.b bVar = C2945ape.b;
        C9018hf.a c3 = new C9018hf.a("hasTitleBehavior", bVar.b()).c("hiddenEpisodeNumbers");
        e6 = C8566dqi.e(new C9021hi.d("behavior").b("hiddenEpisodeNumbers").b());
        j4 = C8569dql.j(d6, c3.b(e6).d(), new C9018hf.a("number", cVar.d()).d(), new C9018hf.a("parentSeason", C3215auk.e.e()).e(j2).d(), new C9018hf.a("parentShow", C3226auv.e.e()).e(j3).d(), new C9018hf.a("hasOriginalTreatment", bVar.b()).d());
        a = j4;
    }
}
