package o;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;
import o.C2500ahJ;

/* loaded from: classes4.dex */
public final class cTH implements InterfaceC5280bvl {
    private final C2500ahJ a;
    private final long b;
    private final String d;

    @Override // o.InterfaceC5280bvl
    public long getRequestId() {
        return this.b;
    }

    public cTH(C2500ahJ c2500ahJ, String str, long j) {
        C8632dsu.c((Object) c2500ahJ, "");
        C8632dsu.c((Object) str, "");
        this.a = c2500ahJ;
        this.d = str;
        this.b = j;
    }

    public /* synthetic */ cTH(C2500ahJ c2500ahJ, String str, long j, int i, C8627dsp c8627dsp) {
        this(c2500ahJ, str, (i & 4) != 0 ? 0L : j);
    }

    @Override // o.InterfaceC5280bvl
    public List<InterfaceC5272bvd> getSearchSections() {
        List<InterfaceC5272bvd> i;
        List<C2500ahJ.b> c;
        int d;
        InterfaceC5272bvd ctd;
        C2500ahJ.c b = this.a.b();
        String d2 = b != null ? b.d() : null;
        if (d2 == null) {
            d2 = "";
        }
        C2500ahJ.a d3 = this.a.d();
        if (d3 == null || (c = d3.c()) == null) {
            i = C8569dql.i();
            return i;
        }
        d = C8572dqo.d(c, 10);
        ArrayList arrayList = new ArrayList(d);
        int i2 = 0;
        for (Object obj : c) {
            if (i2 < 0) {
                C8569dql.h();
            }
            C2500ahJ.b bVar = (C2500ahJ.b) obj;
            C2500ahJ.d c2 = bVar.c();
            if (C8632dsu.c((Object) (c2 != null ? c2.d() : null), (Object) C3158atf.a.a().b())) {
                C2500ahJ.d c3 = bVar.c();
                C2494ahD a = c3 != null ? c3.a() : null;
                if (a == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                C2500ahJ.d c4 = bVar.c();
                C2504ahN c5 = c4 != null ? c4.c() : null;
                String str = this.d;
                C2500ahJ.a d4 = this.a.d();
                int a2 = d4 != null ? d4.a() : 0;
                long d5 = d();
                C2500ahJ.d c6 = bVar.c();
                String d6 = c6 != null ? c6.d() : null;
                ctd = new C6103cTz(a, c5, i2, str, d2, a2, d5, d6 == null ? "" : d6, bVar.e());
            } else {
                C2500ahJ.d c7 = bVar.c();
                C2494ahD a3 = c7 != null ? c7.a() : null;
                if (a3 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                C2500ahJ.d c8 = bVar.c();
                C2542ahz b2 = c8 != null ? c8.b() : null;
                String str2 = this.d;
                C2500ahJ.a d7 = this.a.d();
                int a4 = d7 != null ? d7.a() : 0;
                long d8 = d();
                C2500ahJ.d c9 = bVar.c();
                String d9 = c9 != null ? c9.d() : null;
                ctd = new cTD(a3, b2, i2, str2, d2, a4, d8, d9 == null ? "" : d9, bVar.e());
            }
            arrayList.add(ctd);
            i2++;
        }
        return arrayList;
    }

    @Override // o.InterfaceC5280bvl
    public String getGraphqlPageId() {
        return this.a.c();
    }

    public final long d() {
        Instant e = this.a.e();
        if (e != null) {
            return e.b();
        }
        return 0L;
    }
}
