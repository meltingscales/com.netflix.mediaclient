package o;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.configuration.crypto.CryptoProvider;
import com.netflix.mediaclient.service.configuration.crypto.WidevineL1ForcedFallbackReason;

/* renamed from: o.bMm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3837bMm extends AbstractC3839bMo {
    @Override // o.AbstractC3834bMj
    StatusCode c() {
        return StatusCode.WIDEVINE_L1_ALL_ZEROS_SIGNATURE_CHALLENGE;
    }

    @Override // o.InterfaceC1910aSu
    public InterfaceC1905aSp a(Context context, Throwable th) {
        CryptoProvider a = C1834aPz.a.a();
        if (a == CryptoProvider.WIDEVINE_L1) {
            C1044Mm.e(AbstractC3839bMo.d, "Device is unable to use Widevine L1 due to failure in provisioning, fail to Widevine L3.");
            c("WIDEVINE_L1_ALL_ZEROS_SIGNATURE_CHALLENGE");
            C8189dfg.a(WidevineL1ForcedFallbackReason.TO_L3_ALL_ZEROS_SIGNATURE);
        } else if (a == CryptoProvider.WIDEVINE_L3) {
            C1044Mm.d(AbstractC3839bMo.d, "Device is unable to use Widevine L3 due to failure in provisioning, this should NOT happen!");
            c("WIDEVINE_L3_ALL_ZEROS_SIGNATURE_CHALLENGE");
        } else {
            C1044Mm.d(AbstractC3839bMo.d, "Device is unable to use LEGACY crypto due to failure in provisioning, this should NOT happen!");
            c("LEGACY_ALL_ZEROS_SIGNATURE_CHALLENGE");
        }
        C8189dfg.a(WidevineL1ForcedFallbackReason.TO_L3_ALL_ZEROS_SIGNATURE);
        return c(context, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(StatusCode statusCode) {
        return statusCode == StatusCode.WIDEVINE_L1_ALL_ZEROS_SIGNATURE_CHALLENGE;
    }
}
