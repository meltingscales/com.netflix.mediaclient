package o;

import android.content.Context;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Zuul;
import com.netflix.mediaclient.util.ConnectivityUtils;

/* renamed from: o.brJ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5040brJ extends C1045Mp {
    public static final C5040brJ b = new C5040brJ();

    private C5040brJ() {
        super("nf_zuul_ws_utils");
    }

    public final InterfaceC8286dhX c() {
        return new C8287dhY(1000, 0.5d, 2.0d, 60000, 900000);
    }

    public final boolean a(Context context, InterfaceC8286dhX interfaceC8286dhX) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC8286dhX, "");
        if (ConnectivityUtils.n(context)) {
            if (!Config_FastProperty_Zuul.Companion.j()) {
                C5048brR.c.c("Reached max retry count for web socket. Not using backoff policy for network reconnection...", false);
                return false;
            }
            C5048brR.c.c("Reached max retry count for web socket, start exponential backoff to establish connection!", false);
            boolean a = interfaceC8286dhX.a();
            getLogTag();
            return a;
        }
        return false;
    }
}
