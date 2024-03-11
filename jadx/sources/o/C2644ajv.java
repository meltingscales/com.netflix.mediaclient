package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.ajv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2644ajv {
    private static final List<AbstractC9025hm> a;
    public static final C2644ajv b = new C2644ajv();
    private static final List<AbstractC9025hm> c;

    public final List<AbstractC9025hm> a() {
        return c;
    }

    private C2644ajv() {
    }

    static {
        List<AbstractC9025hm> j;
        Map c2;
        Map c3;
        List<C9021hi> e;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        a = j;
        C9018hf d = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d2 = new C9018hf.a("characterId", C9019hg.d(C2949api.a.d())).d();
        C9018hf d3 = new C9018hf.a("unifiedEntityId", C9019hg.d(C2946apf.d.a())).d();
        C9018hf d4 = new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d();
        C9018hf.a aVar = new C9018hf.a("artwork", C2951apk.b.b());
        C9021hi.d dVar = new C9021hi.d("params");
        Pair a2 = dpD.a("artworkType", "CHARACTER_CIRCLE_HALF");
        Pair a3 = dpD.a("format", "WEBP");
        c2 = dqE.c(dpD.a(InteractiveAnimation.ANIMATION_TYPE.WIDTH, 300), dpD.a("matchStrategy", "CLOSEST"), dpD.a("scaleStrategy", "DEFAULT"));
        c3 = dqE.c(a2, a3, dpD.a("dimension", c2));
        e = C8566dqi.e(dVar.b(c3).b());
        j2 = C8569dql.j(d, d2, d3, d4, aVar.b(e).e(j).d());
        c = j2;
    }
}
