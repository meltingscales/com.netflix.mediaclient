package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2946apf;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.alz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2754alz {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final C2754alz c = new C2754alz();
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> b() {
        return e;
    }

    private C2754alz() {
    }

    static {
        List<AbstractC9025hm> j;
        List<C9021hi> e2;
        List<AbstractC9025hm> j2;
        List<AbstractC9025hm> j3;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Error.DEBUG_FIELD_KEY, eVar.e()).d(), new C9018hf.a(SignupConstants.Field.URL, eVar.e()).d(), new C9018hf.a("type", eVar.e()).d());
        b = j;
        C9018hf d = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C2946apf.a aVar = C2946apf.d;
        C9018hf d2 = new C9018hf.a(SignupConstants.Field.LANG_ID, C9019hg.d(aVar.a())).d();
        C9018hf d3 = new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d();
        C9018hf d4 = new C9018hf.a("unifiedEntityId", C9019hg.d(aVar.a())).d();
        C9018hf.a aVar2 = new C9018hf.a("artwork", C2951apk.b.b());
        e2 = C8566dqi.e(new C9021hi.d("params").b(new C9027ho("imageParamsForCreatorHome")).b());
        j2 = C8569dql.j(d, d2, d3, d4, aVar2.b(e2).e(j).d());
        a = j2;
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("creatorCollection", C2943apc.e.b()).e(j2).d());
        e = j3;
    }
}
