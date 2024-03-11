package o;

import com.netflix.mediaclient.graphql.models.type.TextEvidenceClassification;
import java.util.List;
import java.util.Map;
import o.C2954apn;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2784amc {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> c;
    public static final C2784amc e = new C2784amc();

    public final List<AbstractC9025hm> d() {
        return c;
    }

    private C2784amc() {
    }

    static {
        List<AbstractC9025hm> j;
        Map b;
        List<C9021hi> e2;
        List<AbstractC9025hm> j2;
        C2954apn.e eVar = C2954apn.c;
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a("tagline", eVar.e()).d(), new C9018hf.a("typedClassification", TextEvidenceClassification.e.d()).d());
        a = j;
        C9018hf d = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf.a aVar = new C9018hf.a("taglineMessages", C9019hg.a(C9019hg.d(C3185auF.d.c())));
        C9021hi.d dVar = new C9021hi.d("taglineRequest");
        b = dqD.b(dpD.a("typedUiContext", "ODP"));
        e2 = C8566dqi.e(dVar.b(b).b());
        j2 = C8569dql.j(d, aVar.b(e2).e(j).d());
        c = j2;
    }
}
