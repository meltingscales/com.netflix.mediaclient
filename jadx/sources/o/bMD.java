package o;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.ui.error.CryptoErrorManagerImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class bMD extends AbstractC3839bMo {
    @Override // o.AbstractC3834bMj
    StatusCode c() {
        return StatusCode.DRM_FAILURE_MEDIADRM_WIDEVINE_PLUGIN_CHANGED;
    }

    @Override // o.InterfaceC1910aSu
    public InterfaceC1905aSp a(Context context, Throwable th) {
        C1044Mm.e(AbstractC3839bMo.d, "MediaDrm Widevine plugin changed, unregister device and logout user");
        c(CryptoErrorManagerImpl.c(c(), th));
        return aMH.c().a().b(context, c(), c(context), com.netflix.mediaclient.ui.R.o.dh);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(StatusCode statusCode) {
        return statusCode == StatusCode.DRM_FAILURE_MEDIADRM_WIDEVINE_PLUGIN_CHANGED;
    }
}
