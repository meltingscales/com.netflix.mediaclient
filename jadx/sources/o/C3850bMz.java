package o;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;

/* renamed from: o.bMz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C3850bMz extends AbstractC3839bMo {
    @Override // o.AbstractC3834bMj
    StatusCode c() {
        return StatusCode.DRM_FAILURE_MEDIADRM_GET_KEY_REQUEST;
    }

    @Override // o.InterfaceC1910aSu
    public InterfaceC1905aSp a(Context context, Throwable th) {
        C1044Mm.e(AbstractC3839bMo.d, "MSL get key request failed. Device may recover on its own");
        return c(context, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(StatusCode statusCode) {
        return statusCode == StatusCode.DRM_FAILURE_MEDIADRM_GET_KEY_REQUEST;
    }
}
