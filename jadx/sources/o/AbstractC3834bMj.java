package o;

import android.content.Context;
import android.media.ResourceBusyException;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.error.crypto.ErrorSource;
import com.netflix.mediaclient.ui.error.CryptoErrorManagerImpl;

/* renamed from: o.bMj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC3834bMj implements InterfaceC1910aSu {
    protected static String a = "nf_crypto_error_handler";

    abstract ErrorSource a();

    abstract StatusCode c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Runnable c(final Context context) {
        return new Runnable() { // from class: o.bMk
            @Override // java.lang.Runnable
            public final void run() {
                C8054ddD.e(context);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(String str) {
        InterfaceC1598aHf.a(new C1596aHd(str).b(false));
    }

    protected int b(Throwable th) {
        return CryptoErrorManagerImpl.INSTANCE.d(a(), c(), th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public InterfaceC1905aSp c(Context context, Throwable th) {
        if (th instanceof ResourceBusyException) {
            c(CryptoErrorManagerImpl.b(c(), th, C8157dfA.d(context, "max_msl_drm_session_count", 0)));
        } else {
            c(CryptoErrorManagerImpl.c(c(), th));
        }
        return aMH.c().a().b(context, c(), c(context), b(th));
    }
}
