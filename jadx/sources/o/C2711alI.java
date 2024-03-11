package o;

import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.alI  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2711alI {
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2711alI e = new C2711alI();

    public final List<AbstractC9025hm> d() {
        return c;
    }

    private C2711alI() {
    }

    static {
        List j;
        List<AbstractC9025hm> j2;
        List j3;
        List<AbstractC9025hm> j4;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j("ContentAdvisory", "DubbingDelayAdvisory", "ExpiryAdvisory", "LiveRatingAdvisory", "PhotosensitiveEpilepsyAdvisory", "ProductPlacementAdvisory", "SmokingAdvisory");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Advisory", j).b(C2712alJ.c.a()).a());
        d = j2;
        j3 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("advisories", C9019hg.a(C9019hg.d(C2912aoy.a.a()))).e(j2).d(), new C9017he.d("Video", j3).b(C2648ajz.a.e()).a());
        c = j4;
    }
}
