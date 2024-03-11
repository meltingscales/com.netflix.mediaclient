package o;

import android.content.Intent;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;

/* renamed from: o.cmC  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6905cmC {
    Intent e(boolean z);

    void e(AppView appView, TrackingInfo trackingInfo);

    /* renamed from: o.cmC$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public static /* synthetic */ Intent b(InterfaceC6905cmC interfaceC6905cmC, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return interfaceC6905cmC.e(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createMyListIntent");
        }
    }
}
