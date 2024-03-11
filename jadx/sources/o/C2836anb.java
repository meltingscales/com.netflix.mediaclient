package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.List;
import java.util.Map;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2836anb {
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2836anb e = new C2836anb();

    public final List<AbstractC9025hm> a() {
        return c;
    }

    private C2836anb() {
    }

    static {
        List<AbstractC9025hm> j;
        Map c2;
        List<C9021hi> e2;
        List<AbstractC9025hm> e3;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(C2954apn.c.e())).d(), new C9018hf.a(VisualStateDefinition.ELEMENT_STATE.RESULT, C9019hg.d(C2945ape.b.b())).d());
        d = j;
        C9018hf.a aVar = new C9018hf.a("hideTitleViewing", C2950apj.b.b());
        C9021hi.d dVar = new C9021hi.d("input");
        c2 = dqE.c(dpD.a(SignupConstants.Field.VIDEO_ID, new C9027ho(SignupConstants.Field.VIDEO_ID)), dpD.a("hideAllEpisodes", Boolean.FALSE));
        e2 = C8566dqi.e(dVar.b(c2).b());
        e3 = C8566dqi.e(aVar.b(e2).e(j).d());
        c = e3;
    }
}
