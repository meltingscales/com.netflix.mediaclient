package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.C2951apk;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.akw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2698akw {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2698akw d = new C2698akw();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> d() {
        return b;
    }

    private C2698akw() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<C9021hi> e2;
        Map c2;
        Map c3;
        List<C9021hi> e3;
        Map c4;
        Map c5;
        List<C9021hi> e4;
        List<AbstractC9025hm> j4;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d(), new C9018hf.a("available", C2945ape.b.b()).d());
        a = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        c = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d());
        e = j3;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2951apk.b bVar = C2951apk.b;
        C9018hf.a c6 = new C9018hf.a("artwork", bVar.b()).c("characterCompact");
        e2 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForCharacterCompact")).b());
        C9018hf d3 = c6.b(e2).e(j).d();
        C9018hf.a c7 = new C9018hf.a("artwork", bVar.b()).c("titleCard");
        C9021hi.d dVar = new C9021hi.d("params");
        Pair a2 = dpD.a("artworkType", "TCARD");
        Pair a3 = dpD.a("format", "WEBP");
        c2 = dqE.c(dpD.a(InteractiveAnimation.ANIMATION_TYPE.WIDTH, 300), dpD.a("matchStrategy", "CLOSEST"), dpD.a("scaleStrategy", "DEFAULT"));
        c3 = dqE.c(a2, a3, dpD.a("dimension", c2));
        e3 = C8566dqi.e(dVar.b(c3).b());
        C9018hf d4 = c7.b(e3).e(j2).d();
        C9018hf.a c8 = new C9018hf.a("artwork", bVar.b()).c("mysteryBox");
        C9021hi.d dVar2 = new C9021hi.d("params");
        Pair a4 = dpD.a("artworkType", "KIDS_MYSTERY_BOX");
        Pair a5 = dpD.a("format", "WEBP");
        c4 = dqE.c(dpD.a(InteractiveAnimation.ANIMATION_TYPE.WIDTH, 300), dpD.a("matchStrategy", "CLOSEST"), dpD.a("scaleStrategy", "DEFAULT"));
        c5 = dqE.c(a4, a5, dpD.a("dimension", c4));
        e4 = C8566dqi.e(dVar2.b(c5).b());
        j4 = C8569dql.j(d2, d3, d4, c8.b(e4).e(j3).d());
        b = j4;
    }
}
