package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import java.util.Map;
import o.C2949api;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.akb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2677akb {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2677akb d = new C2677akb();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> e() {
        return e;
    }

    private C2677akb() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        Map b2;
        List<C9021hi> e2;
        List<C9021hi> e3;
        List<AbstractC9025hm> j4;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j = C8569dql.j(d2, new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(cVar.d())).d());
        b = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("video", C3378axp.e.d()).e(j).d());
        a = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d());
        c = j3;
        C9018hf d3 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d4 = new C9018hf.a("gameId", C9019hg.d(cVar.d())).d();
        C9018hf.a aVar = new C9018hf.a("promoVideo", C3146atT.c.e());
        C9021hi.d dVar = new C9021hi.d("context");
        b2 = dqD.b(dpD.a("uiContext", "GAME_BILLBOARD"));
        e2 = C8566dqi.e(dVar.b(b2).b());
        C9018hf d5 = aVar.b(e2).e(j2).d();
        C9018hf.a c2 = new C9018hf.a("artwork", C2951apk.b.b()).c("heroImageAsset");
        e3 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForGamesBillboardBackground")).b());
        j4 = C8569dql.j(d3, d4, d5, c2.b(e3).e(j3).d());
        e = j4;
    }
}
