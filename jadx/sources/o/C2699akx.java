package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;

/* renamed from: o.akx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2699akx {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2699akx d = new C2699akx();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> b() {
        return b;
    }

    private C2699akx() {
    }

    static {
        List j;
        List<AbstractC9025hm> e2;
        List j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        j = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        e2 = C8566dqi.e(new C9017he.d("Video", j).b(C2710alH.a.b()).a());
        c = e2;
        C2954apn.e eVar = C2954apn.c;
        j2 = C8569dql.j("Episode", "Movie", "Season", "Show", "Supplemental");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("unifiedEntityId", C9019hg.d(C2946apf.d.a())).d(), new C9017he.d("Video", j2).b(e2).a());
        e = j3;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(InteractiveAnimation.ANIMATION_TYPE.WIDTH, C2949api.a.d()).d(), new C9018hf.a("type", eVar.e()).d());
        a = j4;
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("unifiedEntity", C3375axm.a.e()).e(j3).d(), new C9018hf.a("image", C2951apk.b.b()).e(j4).d(), new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d());
        b = j5;
    }
}
