package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2757amB {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2757amB d = new C2757amB();

    public final List<AbstractC9025hm> a() {
        return c;
    }

    private C2757amB() {
    }

    static {
        List<AbstractC9025hm> j;
        Map c2;
        Map c3;
        List<C9021hi> e;
        List<AbstractC9025hm> j2;
        List e2;
        List<C9021hi> e3;
        List<AbstractC9025hm> e4;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("available", C2945ape.b.b()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        b = j;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d3 = new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d();
        C9018hf.a aVar = new C9018hf.a("artwork", C2951apk.b.b());
        C9021hi.d dVar = new C9021hi.d("params");
        Pair a2 = dpD.a("artworkType", new C9027ho("artworkType"));
        Pair a3 = dpD.a("format", "WEBP");
        Pair a4 = dpD.a("formats", new C9027ho("formats"));
        c2 = dqE.c(dpD.a(InteractiveAnimation.ANIMATION_TYPE.WIDTH, new C9027ho(InteractiveAnimation.ANIMATION_TYPE.WIDTH)), dpD.a(InteractiveAnimation.ANIMATION_TYPE.HEIGHT, new C9027ho(InteractiveAnimation.ANIMATION_TYPE.HEIGHT)), dpD.a("matchStrategy", "CLOSEST"), dpD.a("scaleStrategy", "DEFAULT"));
        c3 = dqE.c(a2, a3, a4, dpD.a("dimension", c2), dpD.a("features", new C9027ho("features")));
        e = C8566dqi.e(dVar.b(c3).b());
        j2 = C8569dql.j(d2, d3, aVar.b(e).e(j).d());
        a = j2;
        C9018hf.a aVar2 = new C9018hf.a(SignupConstants.Field.VIDEOS, C9019hg.a((AbstractC9026hn) C3378axp.e.d()));
        C9021hi.d dVar2 = new C9021hi.d("videoIds");
        e2 = C8566dqi.e(new C9027ho(SignupConstants.Field.VIDEO_ID));
        e3 = C8566dqi.e(dVar2.b(e2).b());
        e4 = C8566dqi.e(aVar2.b(e3).e(j2).d());
        c = e4;
    }
}
