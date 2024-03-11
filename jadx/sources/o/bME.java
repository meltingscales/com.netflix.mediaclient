package o;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class bME extends AbstractC3839bMo {
    private StatusCode b;

    @Override // o.AbstractC3834bMj
    StatusCode c() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bME(StatusCode statusCode) {
        this.b = statusCode;
    }

    @Override // o.InterfaceC1910aSu
    public InterfaceC1905aSp a(Context context, Throwable th) {
        StatusCode statusCode = this.b;
        if (statusCode == StatusCode.DRM_FAILURE_MEDIADRM_DECRYPT || statusCode == StatusCode.DRM_FAILURE_MEDIADRM_ENCRYPT || statusCode == StatusCode.DRM_FAILURE_MEDIADRM_RESET) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(aPB.e().l().name());
        sb.append(": ");
        sb.append(this.b.toString());
        if (th != null) {
            sb.append(C1044Mm.d(th));
        }
        c(sb.toString());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(StatusCode statusCode) {
        return statusCode == StatusCode.DRM_FAILURE_MEDIADRM_DECRYPT || statusCode == StatusCode.DRM_FAILURE_MEDIADRM_ENCRYPT || statusCode == StatusCode.DRM_FAILURE_MEDIADRM_SIGN || statusCode == StatusCode.DRM_FAILURE_MEDIADRM_VERIFY || statusCode == StatusCode.DRM_FAILURE_MEDIADRM_RESET;
    }
}
