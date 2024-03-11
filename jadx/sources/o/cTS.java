package o;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;
import o.C2428afr;

/* loaded from: classes4.dex */
public final class cTS implements InterfaceC5280bvl {
    private final long a;
    private final C2428afr d;
    private final String e;

    @Override // o.InterfaceC5280bvl
    public long getRequestId() {
        return this.a;
    }

    public cTS(C2428afr c2428afr, String str, long j) {
        C8632dsu.c((Object) c2428afr, "");
        C8632dsu.c((Object) str, "");
        this.d = c2428afr;
        this.e = str;
        this.a = j;
    }

    public /* synthetic */ cTS(C2428afr c2428afr, String str, long j, int i, C8627dsp c8627dsp) {
        this(c2428afr, str, (i & 4) != 0 ? 0L : j);
    }

    @Override // o.InterfaceC5280bvl
    public List<InterfaceC5272bvd> getSearchSections() {
        List<InterfaceC5272bvd> i;
        List<C2428afr.c> e;
        int d;
        C2428afr.e b = this.d.b();
        String b2 = b != null ? b.b() : null;
        if (b2 == null) {
            b2 = "";
        }
        C2428afr.d d2 = this.d.d();
        if (d2 == null || (e = d2.e()) == null) {
            i = C8569dql.i();
            return i;
        }
        d = C8572dqo.d(e, 10);
        ArrayList arrayList = new ArrayList(d);
        int i2 = 0;
        for (Object obj : e) {
            if (i2 < 0) {
                C8569dql.h();
            }
            C2428afr.c cVar = (C2428afr.c) obj;
            C2428afr.a e2 = cVar.e();
            C2415afn a = e2 != null ? e2.a() : null;
            if (a == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            C2428afr.a e3 = cVar.e();
            C2411afj d3 = e3 != null ? e3.d() : null;
            String str = this.e;
            C2428afr.d d4 = this.d.d();
            int d5 = d4 != null ? d4.d() : 0;
            long a2 = a();
            C2428afr.a e4 = cVar.e();
            String c = e4 != null ? e4.c() : null;
            arrayList.add(new cTT(a, d3, i2, str, b2, d5, a2, c == null ? "" : c, cVar.b()));
            i2++;
        }
        return arrayList;
    }

    @Override // o.InterfaceC5280bvl
    public String getGraphqlPageId() {
        return this.d.c();
    }

    public final long a() {
        Instant a = this.d.a();
        if (a != null) {
            return a.b();
        }
        return 0L;
    }
}
