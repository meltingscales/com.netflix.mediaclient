package o;

import com.netflix.mediaclient.graphqlrepo.transformers.GraphQLLoMo;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.C1371Yv;
import o.C1387Zl;
import o.C2458agU;
import o.C2463agZ;
import o.YH;
import o.YK;
import o.YQ;

/* renamed from: o.bXp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4137bXp {
    private final C4136bXo c;

    @Inject
    public C4137bXp(C4136bXo c4136bXo) {
        C8632dsu.c((Object) c4136bXo, "");
        this.c = c4136bXo;
    }

    public final List<C4003bSq> c(YQ.e eVar) {
        YQ.b d;
        C8632dsu.c((Object) eVar, "");
        YQ.d e = eVar.e();
        C2463agZ b = (e == null || (d = e.d()) == null) ? null : d.b();
        YQ.c b2 = eVar.b();
        return a(b, b2 != null ? b2.d() : null);
    }

    public final List<C4003bSq> e(YK.b bVar) {
        YK.c d;
        C8632dsu.c((Object) bVar, "");
        YK.d b = bVar.b();
        C2463agZ d2 = (b == null || (d = b.d()) == null) ? null : d.d();
        YK.a e = bVar.e();
        return a(d2, e != null ? e.a() : null);
    }

    public final List<C4003bSq> b(YH.d dVar) {
        YH.c c;
        C8632dsu.c((Object) dVar, "");
        YH.b b = dVar.b();
        C2463agZ a = (b == null || (c = b.c()) == null) ? null : c.a();
        YH.e a2 = dVar.a();
        return a(a, a2 != null ? a2.e() : null);
    }

    public final C4003bSq c(C1371Yv.e eVar) {
        C2458agU a;
        C8632dsu.c((Object) eVar, "");
        C1371Yv.d b = eVar.b();
        if (b == null || (a = b.a()) == null) {
            throw null;
        }
        C1371Yv.a c = eVar.c();
        String c2 = c != null ? c.c() : null;
        return new C4003bSq(new GraphQLLoMo(a, c2 == null ? "" : c2, a.b(), 0L, 0, 24, null), this.c.c(eVar));
    }

    public final C4003bSq e(C1387Zl.c cVar) {
        C2458agU e;
        C8632dsu.c((Object) cVar, "");
        C1387Zl.b e2 = cVar.e();
        if (e2 == null || (e = e2.e()) == null) {
            return null;
        }
        C1387Zl.d d = cVar.d();
        String e3 = d != null ? d.e() : null;
        return new C4003bSq(new GraphQLLoMo(e, e3 == null ? "" : e3, e.b(), 0L, 0, 24, null), this.c.d(cVar));
    }

    private final List<C4003bSq> a(C2463agZ c2463agZ, String str) {
        List<C4003bSq> i;
        List G;
        int d;
        Integer d2 = c2463agZ != null ? c2463agZ.d() : null;
        List<C2463agZ.d> e = c2463agZ != null ? c2463agZ.e() : null;
        if (d2 == null || e == null || e.isEmpty()) {
            i = C8569dql.i();
            return i;
        }
        G = C8576dqs.G(e);
        ArrayList<C2463agZ.d> arrayList = new ArrayList();
        for (Object obj : G) {
            C2458agU.c c = ((C2463agZ.d) obj).e().c();
            if ((c != null ? c.b() : null) != null) {
                arrayList.add(obj);
            }
        }
        d = C8572dqo.d(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(d);
        for (C2463agZ.d dVar : arrayList) {
            arrayList2.add(new C4003bSq(new GraphQLLoMo(dVar.e(), str, dVar.e().b(), 0L, 0, 24, null), this.c.c(dVar)));
        }
        return arrayList2;
    }
}
