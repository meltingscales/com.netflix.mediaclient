package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.graphql.models.type.ThumbRating;
import java.util.List;
import java.util.Map;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.aoc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2890aoc {
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2890aoc e = new C2890aoc();

    public final List<AbstractC9025hm> b() {
        return b;
    }

    private C2890aoc() {
    }

    static {
        List<AbstractC9025hm> j;
        Map c2;
        List<C9021hi> e2;
        List<AbstractC9025hm> e3;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d(), new C9018hf.a("thumbRatingV2", ThumbRating.a.d()).d());
        c = j;
        C9018hf.a aVar = new C9018hf.a("setThumbRating", C3378axp.e.d());
        C9021hi.d dVar = new C9021hi.d("input");
        c2 = dqE.c(dpD.a(SignupConstants.Field.VIDEO_ID, new C9027ho(SignupConstants.Field.VIDEO_ID)), dpD.a("rating", new C9027ho("rating")), dpD.a("trackId", new C9027ho("trackId")));
        e2 = C8566dqi.e(dVar.b(c2).b());
        e3 = C8566dqi.e(aVar.b(e2).e(j).d());
        b = e3;
    }
}
