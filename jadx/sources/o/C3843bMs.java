package o;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;

/* renamed from: o.bMs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3843bMs extends AbstractC3839bMo {
    private static StatusCode e = StatusCode.DRM_FAILURE_CDM_GENERIC_ERROR;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(StatusCode statusCode) {
        return statusCode == e;
    }

    @Override // o.AbstractC3834bMj
    StatusCode c() {
        return e;
    }

    @Override // o.InterfaceC1910aSu
    public InterfaceC1905aSp a(Context context, Throwable th) {
        C1044Mm.e(AbstractC3839bMo.d, "Generic error...");
        return c(context, th);
    }
}
