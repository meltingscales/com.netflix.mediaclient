package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import java.util.Map;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.ajD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2600ajD {
    private static final List<AbstractC9025hm> a;
    public static final C2600ajD c = new C2600ajD();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> d() {
        return e;
    }

    private C2600ajD() {
    }

    static {
        List<AbstractC9025hm> j;
        Map c2;
        List<C9021hi> e2;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        a = j;
        C9018hf d = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf.a c3 = new C9018hf.a("artwork", C2951apk.b.b()).c("horizontalArt");
        C9021hi.d dVar = new C9021hi.d("params");
        c2 = dqE.c(dpD.a("artworkType", "SDP"), dpD.a("format", "WEBP"), dpD.a("features", new C9027ho("horizontalArtFeatures")));
        e2 = C8566dqi.e(dVar.b(c2).b());
        j2 = C8569dql.j(d, c3.b(e2).e(j).d());
        e = j2;
    }
}
