package o;

import android.content.Context;
import com.netflix.mediaclient.net.NetworkSpeedType;

/* loaded from: classes.dex */
public class aHR {
    public void c(Context context) {
        C8632dsu.c((Object) context, "");
        if (C9816xC.d()) {
            long b = NetworkSpeedType.d(C8157dfA.d(context, "debug_network_speed_Key", NetworkSpeedType.NoLimit.c())).b();
            C1044Mm.b("NetworkSpeedControl", "selected speedInBitsPerSecond=%s", Long.valueOf(b));
            C9815xB.a(b);
        }
    }
}
