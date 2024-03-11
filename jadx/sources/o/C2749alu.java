package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.alu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2749alu {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2749alu e = new C2749alu();

    public final List<AbstractC9025hm> c() {
        return a;
    }

    private C2749alu() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<C9021hi> e2;
        List<C9021hi> e3;
        List<AbstractC9025hm> j4;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2949api.c cVar = C2949api.a;
        j = C8569dql.j(d2, new C9018hf.a(SignupConstants.Field.LANG_ID, cVar.d()).d(), new C9018hf.a("displayName", eVar.e()).d());
        c = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("minMemoryGb", cVar.d()).d(), new C9018hf.a("minSdkVersion", cVar.d()).d(), new C9018hf.a("packageSizeInMb", cVar.d()).d(), new C9018hf.a("numProcessors", cVar.d()).d(), new C9018hf.a("packageName", C9019hg.d(eVar.e())).d(), new C9018hf.a("appStoreUrl", eVar.e()).d());
        d = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d(), new C9018hf.a(InteractiveAnimation.ANIMATION_TYPE.WIDTH, cVar.d()).d(), new C9018hf.a(InteractiveAnimation.ANIMATION_TYPE.HEIGHT, cVar.d()).d(), new C9018hf.a("type", eVar.e()).d(), new C9018hf.a("available", C2945ape.b.b()).d(), new C9018hf.a(InteractiveAnimation.ANIMATION_TYPE.SCALE, C2948aph.a.d()).d());
        b = j3;
        C9018hf d3 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d4 = new C9018hf.a("gameId", C9019hg.d(cVar.d())).d();
        C9018hf d5 = new C9018hf.a("unifiedEntityId", C9019hg.d(C2946apf.d.a())).d();
        C9018hf d6 = new C9018hf.a("urlScheme", eVar.e()).d();
        C9018hf d7 = new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d();
        C9018hf.a aVar = new C9018hf.a("tags", C9019hg.a((AbstractC9026hn) C2881aoT.b.c()));
        e2 = C8566dqi.e(new C9021hi.d("tagsCriteria").b());
        C9018hf d8 = aVar.b(e2).e(j).d();
        C9018hf d9 = new C9018hf.a("androidInstallation", C2866aoE.e.c()).e(j2).d();
        C9018hf.a c2 = new C9018hf.a("artwork", C2951apk.b.b()).c("artwork");
        e3 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForGamesIcon")).b());
        j4 = C8569dql.j(d3, d4, d5, d6, d7, d8, d9, c2.b(e3).e(j3).d());
        a = j4;
    }
}
