package o;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;
import o.C2508ahR;

/* loaded from: classes4.dex */
public final class cTG implements InterfaceC5280bvl {
    private final long a;
    private final C2508ahR b;
    private final String e;

    @Override // o.InterfaceC5280bvl
    public long getRequestId() {
        return this.a;
    }

    public cTG(C2508ahR c2508ahR, String str, long j) {
        C8632dsu.c((Object) c2508ahR, "");
        C8632dsu.c((Object) str, "");
        this.b = c2508ahR;
        this.e = str;
        this.a = j;
    }

    public /* synthetic */ cTG(C2508ahR c2508ahR, String str, long j, int i, C8627dsp c8627dsp) {
        this(c2508ahR, str, (i & 4) != 0 ? 0L : j);
    }

    @Override // o.InterfaceC5280bvl
    public List<InterfaceC5272bvd> getSearchSections() {
        List<InterfaceC5272bvd> i;
        List<C2508ahR.c> d;
        int d2;
        C2508ahR.d a = this.b.a();
        String b = a != null ? a.b() : null;
        if (b == null) {
            b = "";
        }
        C2508ahR.b b2 = this.b.b();
        if (b2 == null || (d = b2.d()) == null) {
            i = C8569dql.i();
            return i;
        }
        d2 = C8572dqo.d(d, 10);
        ArrayList arrayList = new ArrayList(d2);
        int i2 = 0;
        for (Object obj : d) {
            if (i2 < 0) {
                C8569dql.h();
            }
            C2508ahR.c cVar = (C2508ahR.c) obj;
            C2508ahR.a b3 = cVar.b();
            C2499ahI e = b3 != null ? b3.e() : null;
            if (e == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            C2508ahR.a b4 = cVar.b();
            C2498ahH c = b4 != null ? b4.c() : null;
            String str = this.e;
            C2508ahR.b b5 = this.b.b();
            int a2 = b5 != null ? b5.a() : 0;
            long e2 = e();
            C2508ahR.a b6 = cVar.b();
            String b7 = b6 != null ? b6.b() : null;
            arrayList.add(new cTE(e, c, i2, str, b, a2, e2, b7 == null ? "" : b7, cVar.c()));
            i2++;
        }
        return arrayList;
    }

    @Override // o.InterfaceC5280bvl
    public String getGraphqlPageId() {
        return this.b.d();
    }

    public final long e() {
        Instant c = this.b.c();
        if (c != null) {
            return c.b();
        }
        return 0L;
    }
}
