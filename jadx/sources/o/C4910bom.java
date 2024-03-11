package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.context.Xid;

/* renamed from: o.bom  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4910bom {
    private final InterfaceC4968bpr a;
    private long b;
    private long c;
    private final long d;

    public C4910bom(InterfaceC4968bpr interfaceC4968bpr, long j) {
        this.a = interfaceC4968bpr;
        this.d = j;
    }

    public void e(long j) {
        if (j == this.b) {
            return;
        }
        d();
        String c = this.a.c(j);
        this.c = Logger.INSTANCE.addContext(new Xid(c, Long.valueOf(this.d), null));
        aHH ahh = (aHH) C1332Xp.b(aHH.class);
        if (ahh != null) {
            ahh.d(c);
        }
        this.b = j;
        C1044Mm.a("nf_play_cl", "adding CL context %s for XID %s", Long.valueOf(this.c), c);
    }

    public void e() {
        d();
    }

    private void d() {
        long j = this.c;
        if (j != 0) {
            C1044Mm.a("nf_play_cl", "removing CL context %s", Long.valueOf(j));
            Logger.INSTANCE.removeContext(Long.valueOf(this.c));
            this.c = 0L;
        }
    }
}
