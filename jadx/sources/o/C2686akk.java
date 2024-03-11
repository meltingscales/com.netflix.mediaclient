package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C2946apf;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.akk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2686akk {
    public static final C2686akk a = new C2686akk();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> a() {
        return e;
    }

    private C2686akk() {
    }

    static {
        List<AbstractC9025hm> j;
        List e2;
        List<C9021hi> j2;
        List<AbstractC9025hm> j3;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("tagline", eVar.e()).d(), new C9018hf.a("classification", eVar.e()).d());
        b = j;
        C2946apf.a aVar = C2946apf.d;
        e2 = C8566dqi.e("GenericContainer");
        C9018hf.a aVar2 = new C9018hf.a("taglineMessage", C3185auF.d.c());
        j2 = C8569dql.j(new C9021hi.d("taglineRequest").b(), new C9021hi.d("uiContext").b("ODP").b());
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(SignupConstants.Field.LANG_ID, C9019hg.d(aVar.a())).d(), new C9018hf.a("unifiedEntityId", C9019hg.d(aVar.a())).d(), new C9017he.d("GenericContainer", e2).b(C2725alW.a.e()).a(), new C9018hf.a(SignupConstants.Field.VIDEO_TITLE, eVar.e()).d(), new C9018hf.a("shortSynopsis", eVar.e()).d(), aVar2.b(j2).e(j).d());
        e = j3;
    }
}
