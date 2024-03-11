package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import java.util.Map;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.ajy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2647ajy {
    private static final List<AbstractC9025hm> b;
    public static final C2647ajy c = new C2647ajy();
    private static final List<AbstractC9025hm> d;

    public final List<AbstractC9025hm> a() {
        return b;
    }

    private C2647ajy() {
    }

    static {
        List<AbstractC9025hm> j;
        Map c2;
        List<C9021hi> e;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        d = j;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf.a c3 = new C9018hf.a("artwork", C2951apk.b.b()).c("logoArt");
        C9021hi.d dVar = new C9021hi.d("params");
        c2 = dqE.c(dpD.a("artworkType", "LOGO_BRANDED_STACKED"), dpD.a("format", "WEBP"));
        e = C8566dqi.e(dVar.b(c2).b());
        j2 = C8569dql.j(d2, c3.b(e).e(j).d());
        b = j2;
    }
}
