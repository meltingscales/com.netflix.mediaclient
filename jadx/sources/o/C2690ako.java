package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2946apf;
import o.C2951apk;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.ako  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2690ako {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    public static final C2690ako e = new C2690ako();
    private static final List<AbstractC9025hm> f;
    private static final List<AbstractC9025hm> h;
    private static final List<AbstractC9025hm> i;
    private static final List<AbstractC9025hm> j;

    public final List<AbstractC9025hm> d() {
        return i;
    }

    private C2690ako() {
    }

    static {
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<AbstractC9025hm> j5;
        List e2;
        List<C9021hi> e3;
        List<AbstractC9025hm> j6;
        List<AbstractC9025hm> j7;
        List e4;
        List e5;
        List<AbstractC9025hm> j8;
        List<AbstractC9025hm> j9;
        C2954apn.e eVar = C2954apn.c;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d());
        c = j2;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2951apk.b bVar = C2951apk.b;
        C9018hf d3 = new C9018hf.a("image", bVar.b()).e(j2).d();
        C2946apf.a aVar = C2946apf.d;
        j3 = C8569dql.j(d2, d3, new C9018hf.a("unifiedEntityId", C9019hg.d(aVar.a())).d(), new C9018hf.a("creatorCollectionId", C9019hg.d(aVar.a())).d(), new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d());
        h = j3;
        j4 = C8569dql.j(new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.LANG_ID, C9019hg.d(aVar.a())).d());
        d = j4;
        j5 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d(), new C9018hf.a("type", eVar.e()).d());
        b = j5;
        e2 = C8566dqi.e("GenericContainer");
        C9018hf.a aVar2 = new C9018hf.a("artwork", bVar.b());
        e3 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForCreatorHome")).b());
        j6 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("unifiedEntityId", C9019hg.d(aVar.a())).d(), new C9017he.d("GenericContainer", e2).b(j4).a(), aVar2.b(e3).e(j5).d());
        a = j6;
        j7 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("creatorCollection", C3375axm.a.e()).e(j6).d());
        j = j7;
        e4 = C8566dqi.e("IrmaCreatorHomeSectionTreatment");
        e5 = C8566dqi.e("PinotCreatorHomeSectionTreatment");
        j8 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("IrmaCreatorHomeSectionTreatment", e4).b(j3).a(), new C9017he.d("PinotCreatorHomeSectionTreatment", e5).b(j7).a());
        f = j8;
        j9 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("sectionId", C9019hg.d(aVar.a())).d(), new C9018hf.a("sectionTreatment", C3178atz.d.e()).e(j8).d());
        i = j9;
    }
}
