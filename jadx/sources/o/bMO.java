package o;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.configuration.crypto.WidevineL1ForcedFallbackReason;

/* loaded from: classes4.dex */
public class bMO extends AbstractC3839bMo {
    @Override // o.AbstractC3834bMj
    StatusCode c() {
        return StatusCode.WIDEVINE_L1_FAILURE_OS_UPGRADE;
    }

    @Override // o.InterfaceC1910aSu
    public InterfaceC1905aSp a(Context context, Throwable th) {
        C1044Mm.e(AbstractC3839bMo.d, "Device is unable to used Widevine L1 after OS upgrade, fail to Widevine L3.");
        c("WIDEVINE_FORCED_FALLBACK_TO_L3_AFTER_OS_UPGRADE");
        C8189dfg.a(WidevineL1ForcedFallbackReason.TO_L3_AFTER_OS_UPGRADE);
        return aMH.c().a().e(context, c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(StatusCode statusCode) {
        return statusCode == StatusCode.WIDEVINE_L1_FAILURE_OS_UPGRADE;
    }
}
