package o;

import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import com.netflix.mediaclient.service.cdx.log.MessageFailureCause;

/* loaded from: classes3.dex */
public final class aOA implements Runnable {
    private static final b e = new b(null);
    private final C1255Uq b;
    private final String c;
    private final CdxAgentImpl d;

    public aOA(CdxAgentImpl cdxAgentImpl, C1255Uq c1255Uq) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        C8632dsu.c((Object) c1255Uq, "");
        this.d = cdxAgentImpl;
        this.b = c1255Uq;
        C1777aNw k = cdxAgentImpl.k();
        this.c = k != null ? k.c() : null;
    }

    /* loaded from: classes3.dex */
    static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("nf_cdx_unpairing_timeout");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.d.n().c()) {
            this.d.n().a(true);
            C1798aOq.a.c(this.b, this.c, MessageFailureCause.b);
        }
    }

    public String toString() {
        C1255Uq c1255Uq = this.b;
        return "UnpairingTimeout(target=" + c1255Uq + ")";
    }
}
