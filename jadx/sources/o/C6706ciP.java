package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.NetflixTraceCategory;
import com.netflix.cl.model.NetflixTraceStatus;
import o.cNW;

/* renamed from: o.ciP  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6706ciP {
    private final String a;
    private final C1665aJs e;

    public C6706ciP(String str) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.e = new C1665aJs(0L, null, false, null, 15, null);
    }

    public final void c() {
        this.e.d();
        this.e.d(this.a);
    }

    public final void e(cNW.b bVar) {
        NetflixTraceStatus netflixTraceStatus;
        Integer valueOf = bVar != null ? Integer.valueOf(bVar.a()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            netflixTraceStatus = NetflixTraceStatus.success;
        } else {
            netflixTraceStatus = ((valueOf != null && valueOf.intValue() == 3) || (valueOf != null && valueOf.intValue() == 2)) ? NetflixTraceStatus.cancel : NetflixTraceStatus.fail;
        }
        this.e.e(this.a, (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : netflixTraceStatus, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? null : null);
        Logger.INSTANCE.logEvent(this.e.c());
    }
}
