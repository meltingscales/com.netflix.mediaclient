package o;

import com.netflix.mediaclient.cdx.api.PairingType;
import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import com.netflix.mediaclient.service.cdx.log.MessageFailureCause;

/* renamed from: o.aOy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC1806aOy implements Runnable {
    public static final c b = new c(null);
    private final String a;
    private final PairingType c;
    private final CdxAgentImpl d;
    private final C1255Uq e;

    public RunnableC1806aOy(CdxAgentImpl cdxAgentImpl, C1255Uq c1255Uq, PairingType pairingType) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        C8632dsu.c((Object) c1255Uq, "");
        C8632dsu.c((Object) pairingType, "");
        this.d = cdxAgentImpl;
        this.e = c1255Uq;
        this.c = pairingType;
        C1777aNw k = cdxAgentImpl.k();
        this.a = k != null ? k.c() : null;
    }

    /* renamed from: o.aOy$c */
    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("nf_cdx_pairing_timeout");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.d.n().a()) {
            this.d.n().e(true);
            C1798aOq.a.c(this.e, this.a, this.c, MessageFailureCause.b);
        }
    }

    public String toString() {
        C1255Uq c1255Uq = this.e;
        PairingType pairingType = this.c;
        return "PairingTimeout(target=" + c1255Uq + ", pairingType=" + pairingType + ")";
    }
}
