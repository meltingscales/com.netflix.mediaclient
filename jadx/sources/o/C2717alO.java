package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2945ape;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.alO  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2717alO {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2717alO e = new C2717alO();

    public final List<AbstractC9025hm> b() {
        return d;
    }

    private C2717alO() {
    }

    static {
        List j;
        List<AbstractC9025hm> e2;
        List<AbstractC9025hm> j2;
        List j3;
        List j4;
        List j5;
        List<C9021hi> e3;
        List<AbstractC9025hm> j6;
        j = C8569dql.j("Episode", "Movie", "Supplemental");
        e2 = C8566dqi.e(new C9017he.d("Viewable", j).b(C2720alR.c.c()).a());
        c = e2;
        C2954apn.e eVar = C2954apn.c;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d());
        a = j2;
        j3 = C8569dql.j("Episode", "Movie", "Supplemental");
        j4 = C8569dql.j("Episode", "Movie", "Supplemental");
        j5 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        C2945ape.b bVar = C2945ape.b;
        C9018hf.a c2 = new C9018hf.a("artwork", C2951apk.b.b()).c("mdxBoxart");
        e3 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("artworkParamsForMdx")).b());
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Viewable", j3).b(e2).a(), new C9017he.d("Viewable", j4).b(C2715alM.c.e()).a(), new C9017he.d("Video", j5).b(C2691akp.a.b()).a(), new C9018hf.a("isPlayable", bVar.b()).d(), new C9018hf.a("isAvailable", bVar.b()).d(), new C9018hf.a("supportsInteractiveExperiences", bVar.b()).d(), c2.b(e3).e(j2).d());
        d = j6;
    }
}
