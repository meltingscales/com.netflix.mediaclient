package o;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;

/* renamed from: o.bMy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3849bMy extends AbstractC3839bMo {
    private static StatusCode e = StatusCode.DRM_FAILURE_MEDIADRM_STATE_EXCEPTION;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(StatusCode statusCode) {
        return statusCode == e;
    }

    @Override // o.AbstractC3834bMj
    StatusCode c() {
        return e;
    }

    @Override // o.InterfaceC1910aSu
    public InterfaceC1905aSp a(Context context, Throwable th) {
        C1044Mm.e(AbstractC3839bMo.d, "State exception...");
        return c(context, th);
    }
}
