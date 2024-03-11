package o;

import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.amX  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2779amX {
    public static final C2779amX b = new C2779amX();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> a() {
        return e;
    }

    private C2779amX() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<C9021hi> j3;
        List<AbstractC9025hm> j4;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("LolomoRowListEdge");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LolomoRowListEdge", e2).b(C2735alg.e.c()).a());
        c = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(Payload.PARAM_RENO_REQUEST_ID, eVar.e()).d());
        d = j2;
        C9018hf.a aVar = new C9018hf.a("lolomoRowByIndex", C2979aqL.c.b());
        j3 = C8569dql.j(new C9021hi.d("index").b(new C9027ho("index")).b(), new C9021hi.d("listId").b(), new C9021hi.d("lolomoId").b(new C9027ho("lolomoId")).b());
        j4 = C8569dql.j(aVar.b(j3).e(j).d(), new C9018hf.a("gatewayRequestDetails", C2887aoZ.b.a()).e(j2).d());
        e = j4;
    }
}
