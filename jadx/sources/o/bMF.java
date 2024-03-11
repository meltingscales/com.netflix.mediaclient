package o;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;

/* loaded from: classes4.dex */
class bMF extends AbstractC3839bMo {
    @Override // o.AbstractC3834bMj
    StatusCode c() {
        return StatusCode.DRM_FAILURE_MEDIADRM_PROVIDE_KEY_RESPONSE;
    }

    @Override // o.InterfaceC1910aSu
    public InterfaceC1905aSp a(Context context, Throwable th) {
        C1044Mm.e(AbstractC3839bMo.d, "MediaDrm provide key update failed. Unregister device, logout user, and kill app process after error is displayed.");
        return c(context, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(StatusCode statusCode) {
        return statusCode == StatusCode.DRM_FAILURE_MEDIADRM_PROVIDE_KEY_RESPONSE;
    }
}
