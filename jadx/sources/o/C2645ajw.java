package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.ajw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2645ajw {
    private static final List<AbstractC9025hm> c;
    public static final C2645ajw d = new C2645ajw();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> b() {
        return c;
    }

    private C2645ajw() {
    }

    static {
        List<AbstractC9025hm> j;
        Map c2;
        Map c3;
        List<C9021hi> e2;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        e = j;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf.a c4 = new C9018hf.a("artwork", C2951apk.b.b()).c("boxArt");
        C9021hi.d dVar = new C9021hi.d("params");
        Pair a = dpD.a("artworkType", "BOXSHOT");
        Pair a2 = dpD.a("format", "WEBP");
        c2 = dqE.c(dpD.a(InteractiveAnimation.ANIMATION_TYPE.WIDTH, new C9027ho("imageWidth")), dpD.a("matchStrategy", "CLOSEST"), dpD.a("scaleStrategy", "DEFAULT"));
        c3 = dqE.c(a, a2, dpD.a("dimension", c2));
        e2 = C8566dqi.e(dVar.b(c3).b());
        j2 = C8569dql.j(d2, c4.b(e2).e(j).d());
        c = j2;
    }
}
