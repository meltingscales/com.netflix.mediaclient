package o;

import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.List;
import o.C2954apn;
import o.C9017he;
import o.C9018hf;
import o.C9021hi;

/* renamed from: o.anq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2851anq {
    private static final List<AbstractC9025hm> a;
    private static final List<AbstractC9025hm> b;
    public static final C2851anq c = new C2851anq();
    private static final List<AbstractC9025hm> d;
    private static final List<AbstractC9025hm> e;

    public final List<AbstractC9025hm> e() {
        return b;
    }

    private C2851anq() {
    }

    static {
        List e2;
        List<AbstractC9025hm> j;
        List e3;
        List<C9021hi> j2;
        List<AbstractC9025hm> j3;
        List<AbstractC9025hm> j4;
        List<C9021hi> e4;
        List<AbstractC9025hm> j5;
        C2954apn.e eVar = C2954apn.c;
        e2 = C8566dqi.e("RowListConnection");
        j = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("RowListConnection", e2).b(C2736alh.d.c()).a());
        d = j;
        e3 = C8566dqi.e("Lolomo");
        C9018hf.a c2 = new C9018hf.a("rowsConnection", C3209aue.a.c()).c("rows");
        j2 = C8569dql.j(new C9021hi.d("after").b(), new C9021hi.d("first").b(new C9027ho("rows")).b());
        j3 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9017he.d("Lolomo", e3).b(C2738alj.b.d()).a(), c2.b(j2).e(j).d());
        a = j3;
        j4 = C8569dql.j(new C9018hf.a("__typename", C9019hg.d(eVar.e())).d(), new C9018hf.a(Payload.PARAM_RENO_REQUEST_ID, eVar.e()).d());
        e = j4;
        C9018hf.a aVar = new C9018hf.a("newLolomo", C2937apW.b.c());
        e4 = C8566dqi.e(new C9021hi.d("context").b(new C9027ho("context")).b());
        j5 = C8569dql.j(aVar.b(e4).e(j3).d(), new C9018hf.a("gatewayRequestDetails", C2887aoZ.b.a()).e(j4).d());
        b = j5;
    }
}
