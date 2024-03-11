package o;

import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Crypto;
import o.aPV;

/* loaded from: classes3.dex */
public final class aPO implements aPV {
    private final aPY a;
    public static final d e = new d(null);
    private static String d = "nf_ReEnableWidevineL1BySystemIdHandler";

    @Override // o.aPV
    public String b() {
        return "ReEnableWidevineL1BySystemId";
    }

    public aPO(aPY apy) {
        C8632dsu.c((Object) apy, "");
        this.a = apy;
    }

    @Override // o.aPV
    public void d() {
        aPV.a.c(this);
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    @Override // o.aPV
    public boolean c() {
        boolean z = false;
        if (!Config_FastProperty_Crypto.Companion.g()) {
            C1044Mm.j(d, "Widevine L1 recovery by new System ID is disabled!");
            return false;
        }
        if (this.a.d() && this.a.e()) {
            z = true;
        }
        String str = d;
        C1044Mm.e(str, "Re-enable usage of Widevine L1 by new System ID: " + z);
        String str2 = d;
        boolean d2 = this.a.d();
        C1044Mm.e(str2, "isWidevineL1ReEnabled: " + d2);
        String str3 = d;
        boolean e2 = this.a.e();
        C1044Mm.e(str3, "isWidevineL1Enabled: " + e2);
        return z;
    }
}
