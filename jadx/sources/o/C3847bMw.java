package o;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.ui.error.CryptoErrorManagerImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bMw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3847bMw extends AbstractC3839bMo {
    @Override // o.AbstractC3834bMj
    StatusCode c() {
        return StatusCode.MSL_LEGACY_CRYPTO_BUT_USED_WIDEVINE_BEFORE;
    }

    @Override // o.InterfaceC1910aSu
    public InterfaceC1905aSp a(Context context, Throwable th) {
        C1044Mm.e(AbstractC3839bMo.d, "Device is unable to used Widevine, but we detected that Widevine was used in past.");
        c(CryptoErrorManagerImpl.c(c(), th));
        return c(context, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(StatusCode statusCode) {
        return statusCode == StatusCode.MSL_LEGACY_CRYPTO_BUT_USED_WIDEVINE_BEFORE;
    }
}
