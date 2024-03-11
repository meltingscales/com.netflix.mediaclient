package o;

import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2852anr {
    public static final C2852anr a = new C2852anr();
    private static final List<AbstractC9025hm> b;
    private static final List<AbstractC9025hm> c;
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> b() {
        return e;
    }

    private C2852anr() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List<C9021hi> j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<C9021hi> e3;
        List<AbstractC9025hm> j5;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("RowListConnection");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("RowListConnection", e2).b(C2736alh.d.c()).a());
        d = j;
        C9018hf d2 = new C9018hf.a("__typename", C9019hg.d(eVar.e())).d();
        C9018hf d3 = new C9018hf.a("lolomoId", C9019hg.d(eVar.e())).d();
        C9018hf.a c2 = new C9018hf.a("rowsConnection", C3209aue.a.c()).c("rows");
        j2 = C8569dql.j(new C9021hi.d("after").b(new C9027ho("rowCursor")).b(), new C9021hi.d("first").b(new C9027ho("rows")).b());
        j3 = C8569dql.j(d2, d3, c2.b(j2).e(j).d());
        c = j3;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(Payload.PARAM_RENO_REQUEST_ID, eVar.e()).d());
        b = j4;
        C9018hf.a aVar = new C9018hf.a("lolomoById", C2937apW.b.c());
        e3 = C8566dqi.e(new C9021hi.d("lolomoId").b(new C9027ho("lolomoId")).b());
        j5 = C8569dql.j(aVar.b(e3).e(j3).d(), new C9018hf.a("gatewayRequestDetails", C2887aoZ.b.a()).e(j4).d());
        e = j5;
    }
}
