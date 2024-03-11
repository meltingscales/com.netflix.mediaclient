package o;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;

/* loaded from: classes4.dex */
class bMB extends AbstractC3839bMo {
    @Override // o.AbstractC3834bMj
    StatusCode c() {
        return StatusCode.MSL_BAD_CHALLENGE;
    }

    @Override // o.InterfaceC1910aSu
    public InterfaceC1905aSp a(Context context, Throwable th) {
        C1044Mm.d(AbstractC3839bMo.d, "Appboot had a bad challenge.");
        return c(context, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(StatusCode statusCode) {
        return statusCode == StatusCode.MSL_BAD_CHALLENGE;
    }
}
