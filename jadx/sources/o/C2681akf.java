package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.akf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2681akf {
    private static final List<AbstractC9025hm> a;
    public static final C2681akf d = new C2681akf();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> c() {
        return e;
    }

    private C2681akf() {
    }

    static {
        List<AbstractC9025hm> j;
        List<C9021hi> e2;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        a = j;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf.a c = new C9018hf.a("artwork", C2951apk.b.b()).c("artwork");
        e2 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForGamesIcon")).b());
        j2 = C8569dql.j(d2, c.b(e2).e(j).d());
        e = j2;
    }
}
