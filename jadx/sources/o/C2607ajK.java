package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.List;
import o.C2949api;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.ajK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2607ajK {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> c;
    public static final C2607ajK d = new C2607ajK();

    public final List<AbstractC9025hm> e() {
        return c;
    }

    private C2607ajK() {
    }

    static {
        List<AbstractC9025hm> j;
        List<C9021hi> e;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d3 = new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d();
        C9018hf d4 = new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d();
        C2949api.c cVar = C2949api.a;
        j = C8569dql.j(d2, d3, d4, new C9018hf.a(InteractiveAnimation.ANIMATION_TYPE.HEIGHT, cVar.d()).d(), new C9018hf.a(InteractiveAnimation.ANIMATION_TYPE.WIDTH, cVar.d()).d(), new C9018hf.a("type", eVar.e()).d());
        a = j;
        C9018hf d5 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf.a c2 = new C9018hf.a("artwork", C2951apk.b.b()).c("horizontalBackgroundAsset");
        e = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForBillboardHorizontalBackgroundAsset")).b());
        j2 = C8569dql.j(d5, c2.b(e).e(j).d());
        c = j2;
    }
}
