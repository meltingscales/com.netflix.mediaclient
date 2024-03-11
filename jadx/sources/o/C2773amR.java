package o;

import com.netflix.mediaclient.graphql.models.type.UpdateSubtitleAppearanceErrorCode;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2773amR {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    public static final C2773amR d = new C2773amR();
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> i;

    public final List<AbstractC9025hm> a() {
        return i;
    }

    private C2773amR() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> e3;
        List e4;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<C9021hi> e5;
        List<AbstractC9025hm> e6;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("Profile");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Profile", e2).b(C2800ams.b.e()).a());
        b = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("profiles", C9019hg.d(C9019hg.a(C9019hg.d(C3137atK.a.d())))).e(j).d());
        c = j2;
        e3 = C8566dqi.e(new C9018hf.a("code", C9019hg.d(UpdateSubtitleAppearanceErrorCode.d.b())).d());
        a = e3;
        e4 = C8566dqi.e("UpdateSubtitleAppearanceError");
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("UpdateSubtitleAppearanceError", e4).b(e3).a());
        e = j3;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("account", C2902aoo.c.c()).e(j2).d(), new C9018hf.a("errors", C9019hg.a(C9019hg.d(C2882aoU.a.a()))).e(j3).d());
        h = j4;
        C9018hf.a aVar = new C9018hf.a("updateSubtitleAppearance", C3377axo.a.a());
        e5 = C8566dqi.e(new C9021hi.d("input").b(new C9027ho("input")).b());
        e6 = C8566dqi.e(aVar.b(e5).e(j4).d());
        i = e6;
    }
}
