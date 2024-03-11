package o;

import java.util.ArrayList;
import java.util.List;
import o.C2534ahr;
import o.C6971cnP;
import o.YN;

/* renamed from: o.cnS  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6974cnS {
    public static final C6971cnP c(YN.e eVar, String str) {
        List i;
        List list;
        C6971cnP.a aVar;
        C2534ahr e;
        C8632dsu.c((Object) eVar, "");
        C8632dsu.c((Object) str, "");
        Integer e2 = eVar.e();
        int intValue = e2 != null ? e2.intValue() : 0;
        YN.g a = eVar.a();
        String b = a != null ? a.b() : null;
        Integer b2 = eVar.b();
        int intValue2 = b2 != null ? b2.intValue() : -1;
        String c = eVar.c();
        List<YN.b> d = eVar.d();
        if (d == null) {
            i = C8569dql.i();
            list = i;
        } else {
            list = new ArrayList();
            for (YN.b bVar : d) {
                YN.d d2 = bVar.d();
                if (d2 == null || (e = d2.e()) == null) {
                    aVar = null;
                } else {
                    int a2 = e.a();
                    String i2 = e.i();
                    String g = e.g();
                    String b3 = e.b();
                    List<C2534ahr.c> d3 = e.d();
                    C2534ahr.e e3 = e.e();
                    String e4 = e3 != null ? e3.e() : null;
                    C2534ahr.e e5 = e.e();
                    Integer b4 = e5 != null ? e5.b() : null;
                    C2534ahr.e e6 = e.e();
                    Integer c2 = e6 != null ? e6.c() : null;
                    C2534ahr.e e7 = e.e();
                    Integer d4 = e7 != null ? e7.d() : null;
                    C2534ahr.d c3 = e.c();
                    String h = c3 != null ? c3.h() : null;
                    C2534ahr.d c4 = e.c();
                    aVar = new C6971cnP.a(i2, b3, a2, g, d3, e4, b4, c2, d4, h, c4 != null ? c4.a() : null);
                }
                if (aVar != null) {
                    list.add(aVar);
                }
            }
        }
        return new C6971cnP(intValue, b, list, intValue2, str, c);
    }
}
