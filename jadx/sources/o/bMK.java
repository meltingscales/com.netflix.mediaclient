package o;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.configuration.crypto.WidevineL1ForcedFallbackReason;

/* loaded from: classes4.dex */
public class bMK implements InterfaceC1905aSp {
    private C1907aSr c;

    @Override // o.InterfaceC1905aSp
    public C1907aSr a() {
        return this.c;
    }

    @Override // o.InterfaceC1905aSp
    public Runnable c() {
        return null;
    }

    @Override // o.InterfaceC1905aSp
    public int d() {
        return 0;
    }

    public bMK(StatusCode statusCode) {
        C1044Mm.e("ErrorManager", "::WidevineFailsAfterOsUpgradeErrorDescriptor");
        final Context d = AbstractApplicationC1040Mh.d();
        if (StatusCode.WIDEVINE_L1_FAILURE_OS_UPGRADE == statusCode) {
            InterfaceC1598aHf.a("WIDEVINE_FORCED_FALLBACK_TO_L3_AFTER_OS_UPGRADE");
            C8189dfg.a(WidevineL1ForcedFallbackReason.TO_L3_AFTER_OS_UPGRADE);
        } else if (StatusCode.WIDEVINE_L3_FAILURE_OS_UPGRADE == statusCode) {
            C8157dfA.d(d, "nf_disable_widevine_l3_v3", true);
        }
        this.c = new C1907aSr("", d.getString(com.netflix.mediaclient.ui.R.o.gQ, Integer.valueOf(statusCode.getValue())), d.getString(com.netflix.mediaclient.ui.R.o.f13253fi), new Runnable() { // from class: o.bMN
            @Override // java.lang.Runnable
            public final void run() {
                C8054ddD.e(d);
            }
        });
    }
}
