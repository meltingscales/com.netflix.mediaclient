package o;

import com.netflix.mediaclient.graphql.models.type.EditProfileErrorCode;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2771amP {
    public static final C2771amP a = new C2771amP();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> e() {
        return h;
    }

    private C2771amP() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> e3;
        List e4;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        List<C9021hi> e5;
        List<AbstractC9025hm> e6;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("Profile");
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Profile", e2).b(C2800ams.b.e()).a());
        j = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("profiles", C9019hg.d(C9019hg.a(C9019hg.d(C3137atK.a.d())))).e(j2).d());
        b = j3;
        e3 = C8566dqi.e(new C9018hf.a("code", C9019hg.d(EditProfileErrorCode.c.b())).d());
        c = e3;
        e4 = C8566dqi.e("EditProfileError");
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("EditProfileError", e4).b(e3).a());
        d = j4;
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("account", C2902aoo.c.c()).e(j3).d(), new C9018hf.a("errors", C9019hg.a(C9019hg.d(C2882aoU.a.a()))).e(j4).d());
        e = j5;
        C9018hf.a aVar = new C9018hf.a("editProfile", C2878aoQ.e.c());
        e5 = C8566dqi.e(new C9021hi.d("input").b(new C9027ho("input")).b());
        e6 = C8566dqi.e(aVar.b(e5).e(j5).d());
        h = e6;
    }
}
