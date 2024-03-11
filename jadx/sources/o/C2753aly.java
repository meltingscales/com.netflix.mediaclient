package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2946apf;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.aly  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2753aly {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final C2753aly c = new C2753aly();
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;
    private static final List<AbstractC9025hm> g;
    private static final List<AbstractC9025hm> h;

    public final List<AbstractC9025hm> d() {
        return g;
    }

    private C2753aly() {
    }

    static {
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List e2;
        List<C9021hi> e3;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List e4;
        List<AbstractC9025hm> j5;
        List<AbstractC9025hm> j6;
        C2954apn.e eVar = C2954apn.c;
        C9018hf d2 = new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d();
        C2946apf.a aVar = C2946apf.d;
        j = C8569dql.j(d2, new C9018hf.a(SignupConstants.Field.LANG_ID, C9019hg.d(aVar.a())).d());
        d = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d(), new C9018hf.a("type", eVar.e()).d());
        e = j2;
        e2 = C8566dqi.e("GenericContainer");
        C9018hf.a aVar2 = new C9018hf.a("artwork", C2951apk.b.b());
        e3 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForCreatorHome")).b());
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("unifiedEntityId", C9019hg.d(aVar.a())).d(), new C9017he.d("GenericContainer", e2).b(j).a(), aVar2.b(e3).e(j2).d());
        a = j3;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("creatorCollection", C3375axm.a.e()).e(j3).d());
        b = j4;
        e4 = C8566dqi.e("PinotCreatorHomeSectionTreatment");
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("PinotCreatorHomeSectionTreatment", e4).b(j4).a());
        h = j5;
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("sectionId", C9019hg.d(aVar.a())).d(), new C9018hf.a("sectionTreatment", C3178atz.d.e()).e(j5).d());
        g = j6;
    }
}
