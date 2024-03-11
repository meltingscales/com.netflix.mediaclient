package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2787amf {
    public static final C2787amf b = new C2787amf();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;

    public final List<AbstractC9025hm> a() {
        return c;
    }

    private C2787amf() {
    }

    static {
        List<AbstractC9025hm> j;
        List<C9021hi> e;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d());
        d = j;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf.a c2 = new C9018hf.a("artwork", C2951apk.b.b()).c("boxArt");
        e = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForBoxart")).b());
        j2 = C8569dql.j(d2, c2.b(e).e(j).d());
        c = j2;
    }
}
