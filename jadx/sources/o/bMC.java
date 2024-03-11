package o;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;

/* loaded from: classes4.dex */
public class bMC extends AbstractC3839bMo {
    @Override // o.AbstractC3834bMj
    StatusCode c() {
        return StatusCode.MSL_INVALID_KEY_REQUEST;
    }

    @Override // o.InterfaceC1910aSu
    public InterfaceC1905aSp a(Context context, Throwable th) {
        C1044Mm.e(AbstractC3839bMo.d, "MSL get key created invalid key request. Device may recover on its own");
        return c(context, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(StatusCode statusCode) {
        return statusCode == StatusCode.MSL_INVALID_KEY_REQUEST;
    }
}
