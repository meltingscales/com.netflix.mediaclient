package o;

import com.netflix.mediaclient.graphql.models.type.RemoveProfileErrorCode;
import com.netflix.mediaclient.service.webclient.model.leafs.UserAccountConstants;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anY  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2833anY {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2833anY d = new C2833anY();
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> b() {
        return j;
    }

    private C2833anY() {
    }

    static {
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> e2;
        List e3;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<C9021hi> e4;
        List<AbstractC9025hm> e5;
        C2954apn.e eVar = C2954apn.c;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(UserAccountConstants.FIELD_CAN_CREATE_USER_PROFILE, C2945ape.b.b()).d());
        e = j2;
        e2 = C8566dqi.e(new C9018hf.a("code", C9019hg.d(RemoveProfileErrorCode.e.d())).d());
        b = e2;
        e3 = C8566dqi.e("RemoveProfileError");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("RemoveProfileError", e3).b(e2).a());
        c = j3;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("account", C2902aoo.c.c()).e(j2).d(), new C9018hf.a("errors", C9019hg.a(C9019hg.d(C2882aoU.a.a()))).e(j3).d());
        a = j4;
        C9018hf.a aVar = new C9018hf.a("removeProfile", C3206aub.d.d());
        e4 = C8566dqi.e(new C9021hi.d("input").b(new C9027ho("input")).b());
        e5 = C8566dqi.e(aVar.b(e4).e(j4).d());
        j = e5;
    }
}
