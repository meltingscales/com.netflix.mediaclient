package o;

import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anV  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2830anV {
    public static final C2830anV a = new C2830anV();
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> b() {
        return c;
    }

    private C2830anV() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<AbstractC9025hm> j2;
        List<C9021hi> e3;
        List<AbstractC9025hm> j3;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("LolomoRowListEdge");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("LolomoRowListEdge", e2).b(C2735alg.e.c()).a());
        e = j;
        j2 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(Payload.PARAM_RENO_REQUEST_ID, eVar.e()).d());
        d = j2;
        C9018hf.a aVar = new C9018hf.a("refreshLolomoRow", C2979aqL.c.b());
        e3 = C8566dqi.e(new C9021hi.d("rowRefreshInput").b(new C9027ho("rowRefreshInput")).b());
        j3 = C8569dql.j(aVar.b(e3).e(j).d(), new C9018hf.a("gatewayRequestDetails", C2887aoZ.b.a()).e(j2).d());
        c = j3;
    }
}
