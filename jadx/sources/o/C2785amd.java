package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2785amd {
    private static final List<AbstractC9025hm> a;
    public static final C2785amd b = new C2785amd();
    private static final List<AbstractC9025hm> c;

    public final List<AbstractC9025hm> c() {
        return a;
    }

    private C2785amd() {
    }

    static {
        List<AbstractC9025hm> j;
        List<C9021hi> e;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d());
        c = j;
        C9018hf d = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d2 = new C9018hf.a(SignupConstants.Field.VIDEO_ID, C9019hg.d(C2949api.a.d())).d();
        C9018hf.a c2 = new C9018hf.a("artwork", C2951apk.b.b()).c("tallPanelImage");
        e = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForTallPanelArt")).b());
        j2 = C8569dql.j(d, d2, c2.b(e).e(j).d());
        a = j2;
    }
}
