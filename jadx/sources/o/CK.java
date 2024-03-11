package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.List;
import o.C9018hf;
import o.C9021hi;
import o.EL;

/* loaded from: classes2.dex */
public final class CK {
    public static final int a;
    public static final CK b = new CK();
    private static final List<AbstractC9025hm> d;

    public final List<AbstractC9025hm> d() {
        return d;
    }

    private CK() {
    }

    static {
        List<C9021hi> j;
        List<AbstractC9025hm> j2;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(EK.e.c())).d();
        EL.e eVar = EL.d;
        C9018hf d3 = new C9018hf.a(InteractiveAnimation.ANIMATION_TYPE.WIDTH, eVar.a()).d();
        C9018hf d4 = new C9018hf.a(InteractiveAnimation.ANIMATION_TYPE.HEIGHT, eVar.a()).d();
        C9018hf.a aVar = new C9018hf.a(SignupConstants.Field.URL, EM.a.a());
        j = C8569dql.j(new C9021hi.d("format").b(new C9027ho("imageFormat")).b(), new C9021hi.d("resolutionMode").b(new C9027ho("resolutionMode")).b());
        j2 = C8569dql.j(d2, d3, d4, aVar.b(j).d());
        d = j2;
        a = 8;
    }
}
