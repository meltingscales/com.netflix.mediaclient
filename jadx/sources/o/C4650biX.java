package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.C4642biP;

/* renamed from: o.biX  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4650biX implements InterfaceC4652biZ {
    private final long a;
    private final Map<Long, C4642biP.d> b;
    private final String c;
    private final C4877boF d;
    private final String e;

    public final C4877boF a() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    @Override // o.InterfaceC4652biZ
    public long d() {
        return this.a;
    }

    public final String i() {
        return this.e;
    }

    public C4650biX(long j, AbstractC4473bfF abstractC4473bfF, String str, String str2, C4877boF c4877boF) {
        Map d;
        int d2;
        int e;
        int b;
        boolean z;
        C8632dsu.c((Object) abstractC4473bfF, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c4877boF, "");
        this.a = j;
        this.e = str;
        this.c = str2;
        this.d = c4877boF;
        List<AbstractC4470bfC> b2 = abstractC4473bfF.b();
        if (b2 == null) {
            d = dqE.d();
        } else {
            d2 = C8572dqo.d(b2, 10);
            e = dqD.e(d2);
            b = C8657dts.b(e, 16);
            d = new LinkedHashMap(b);
            for (AbstractC4470bfC abstractC4470bfC : b2) {
                long b3 = abstractC4470bfC.b();
                long b4 = abstractC4470bfC.b();
                C4642biP.b bVar = C4642biP.b;
                C8632dsu.d(abstractC4470bfC);
                List<C4642biP.e> d3 = bVar.d(abstractC4470bfC);
                Map<String, AbstractC4518bfy> c = abstractC4470bfC.c();
                C8632dsu.a(c, "");
                C4813bmv c4813bmv = new C4813bmv(c, abstractC4470bfC.d(), false, 4, null);
                String e2 = abstractC4470bfC.e();
                if (e2 != null) {
                    C8632dsu.d((Object) e2);
                    if (e2.length() > 0) {
                        z = true;
                        Pair a = dpD.a(Long.valueOf(b3), new C4642biP.d(b4, d3, c4813bmv, !z, abstractC4470bfC.e(), abstractC4470bfC.f()));
                        d.put(a.d(), a.a());
                    }
                }
                z = false;
                Pair a2 = dpD.a(Long.valueOf(b3), new C4642biP.d(b4, d3, c4813bmv, !z, abstractC4470bfC.e(), abstractC4470bfC.f()));
                d.put(a2.d(), a2.a());
            }
        }
        this.b = d;
    }

    @Override // o.InterfaceC4652biZ
    public C4642biP.d b(long j) {
        return this.b.get(Long.valueOf(j));
    }

    @Override // o.InterfaceC4652biZ
    public List<C4642biP.d> e() {
        List<C4642biP.d> U;
        U = C8576dqs.U(this.b.values());
        return U;
    }

    @Override // o.InterfaceC4652biZ
    public C4816bmy a(Long l, long j) {
        List<C4642biP.e> a;
        Object obj;
        C4642biP.d dVar = this.b.get(l);
        if (dVar == null || (a = dVar.a()) == null) {
            return null;
        }
        Iterator<T> it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C4642biP.e) obj).h().e() == j) {
                break;
            }
        }
        C4642biP.e eVar = (C4642biP.e) obj;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // o.InterfaceC4652biZ
    public C4813bmv c(long j) {
        C4642biP.d dVar = this.b.get(Long.valueOf(j));
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public final List<C4642biP.d> b() {
        List<C4642biP.d> e = e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : e) {
            C4642biP.d dVar = (C4642biP.d) obj;
            if (!dVar.h() && !dVar.j() && dVar.e()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
