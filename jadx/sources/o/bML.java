package o;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;

/* loaded from: classes4.dex */
public class bML extends AbstractC3839bMo {
    private StatusCode c;

    @Override // o.AbstractC3834bMj
    StatusCode c() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bML(StatusCode statusCode) {
        this.c = statusCode;
    }

    @Override // o.InterfaceC1910aSu
    public InterfaceC1905aSp a(Context context, Throwable th) {
        C1044Mm.e(AbstractC3839bMo.d, "Device is unable to download offline content using Widevine after OS upgrade, report an error");
        return c(context, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(StatusCode statusCode) {
        return statusCode == StatusCode.WIDEVINE_L1_FAILURE_OS_UPGRADE || statusCode == StatusCode.WIDEVINE_L3_FAILURE_OS_UPGRADE;
    }
}