package o;

import com.netflix.mediaclient.cdx.api.PairingType;
import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Cdx;

/* renamed from: o.aNu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1775aNu {
    private static final a b = new a(null);
    private aOA a;
    private final CdxAgentImpl c;
    private RunnableC1806aOy d;

    public C1775aNu(CdxAgentImpl cdxAgentImpl) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        this.c = cdxAgentImpl;
    }

    /* renamed from: o.aNu$a */
    /* loaded from: classes3.dex */
    static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("nf_cdx_timeout_manager");
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this) {
            z = this.d != null;
        }
        return z;
    }

    public final void e(C1255Uq c1255Uq, PairingType pairingType) {
        synchronized (this) {
            C8632dsu.c((Object) c1255Uq, "");
            C8632dsu.c((Object) pairingType, "");
            RunnableC1806aOy runnableC1806aOy = this.d;
            if (runnableC1806aOy != null) {
                this.c.getMainHandler().removeCallbacks(runnableC1806aOy);
            }
            RunnableC1806aOy runnableC1806aOy2 = new RunnableC1806aOy(this.c, c1255Uq, pairingType);
            this.c.getMainHandler().postDelayed(runnableC1806aOy2, Config_FastProperty_Cdx.Companion.b());
            this.d = runnableC1806aOy2;
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this) {
            z = this.a != null;
        }
        return z;
    }

    public final void d(C1255Uq c1255Uq) {
        synchronized (this) {
            C8632dsu.c((Object) c1255Uq, "");
            aOA aoa = this.a;
            if (aoa != null) {
                this.c.getMainHandler().removeCallbacks(aoa);
            }
            aOA aoa2 = new aOA(this.c, c1255Uq);
            this.c.getMainHandler().postDelayed(aoa2, Config_FastProperty_Cdx.Companion.b());
            this.a = aoa2;
        }
    }

    public final void e(boolean z) {
        synchronized (this) {
            RunnableC1806aOy runnableC1806aOy = this.d;
            if (runnableC1806aOy != null) {
                b.getLogTag();
                if (!z) {
                    this.c.getMainHandler().removeCallbacks(runnableC1806aOy);
                }
            }
            this.d = null;
        }
    }

    public final void a(boolean z) {
        synchronized (this) {
            aOA aoa = this.a;
            if (aoa != null) {
                b.getLogTag();
                if (!z) {
                    this.c.getMainHandler().removeCallbacks(aoa);
                }
            }
            this.a = null;
        }
    }
}
