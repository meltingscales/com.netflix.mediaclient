package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.akm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2688akm {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final C2688akm d = new C2688akm();

    public final List<AbstractC9025hm> b() {
        return b;
    }

    private C2688akm() {
    }

    static {
        List<AbstractC9025hm> j;
        List e;
        List<C9021hi> e2;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d(), new C9018hf.a("available", C2945ape.b.b()).d());
        a = j;
        e = C8566dqi.e("GenericContainer");
        C9018hf.a c = new C9018hf.a("artwork", C2951apk.b.b()).c("horizontalBackgroundAsset");
        e2 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForBillboardHorizontalBackgroundAsset")).b());
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("GenericContainer", e).b(C2686akk.a.a()).a(), c.b(e2).e(j).d());
        b = j2;
    }
}
