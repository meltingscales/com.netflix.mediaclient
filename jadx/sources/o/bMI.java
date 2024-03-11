package o;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;

/* loaded from: classes4.dex */
class bMI extends AbstractC3839bMo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(StatusCode statusCode) {
        return false;
    }

    @Override // o.AbstractC3834bMj
    StatusCode c() {
        return StatusCode.WIDEVINE_FALLBACK_TESTING;
    }

    @Override // o.InterfaceC1910aSu
    public InterfaceC1905aSp a(Context context, Throwable th) {
        C1044Mm.d(AbstractC3839bMo.d, "TestCryptoFallbackErrorHandler:: should not be invoked in release build!");
        InterfaceC1598aHf.a("TestCryptoFallbackErrorHandler:: should not be invoked in release build!");
        return null;
    }
}
