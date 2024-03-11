package o;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;

/* loaded from: classes4.dex */
public class bMM extends AbstractC3839bMo {
    @Override // o.AbstractC3834bMj
    StatusCode c() {
        return StatusCode.WIDEVINE_PLUGIN_IN_BAD_STATE;
    }

    @Override // o.InterfaceC1910aSu
    public InterfaceC1905aSp a(Context context, Throwable th) {
        C1044Mm.e(AbstractC3839bMo.d, "MediaDrm Widevine Plugin is in bad stateKill app...");
        return c(context, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(StatusCode statusCode) {
        return statusCode == StatusCode.WIDEVINE_PLUGIN_IN_BAD_STATE;
    }
}
