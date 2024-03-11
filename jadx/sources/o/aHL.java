package o;

import android.content.Context;
import com.netflix.android.volley.Request;
import java.util.concurrent.BlockingQueue;
import org.chromium.net.ExperimentalCronetEngine;

/* loaded from: classes3.dex */
public class aHL extends C9860xu {
    private final ExperimentalCronetEngine a;
    private final boolean b;
    private final Context d;

    public aHL(Context context, ExperimentalCronetEngine experimentalCronetEngine, boolean z) {
        this.d = context;
        this.a = experimentalCronetEngine;
        this.b = z;
    }

    @Override // o.C9860xu
    public InterfaceC9859xt d(BlockingQueue<Request> blockingQueue, InterfaceC9857xr interfaceC9857xr, InterfaceC9854xo interfaceC9854xo, InterfaceC9863xx interfaceC9863xx, String str) {
        if (!e()) {
            C1044Mm.d("nf_network", "creating NetworkDispatcher thread for %s", str);
            return new C9861xv(blockingQueue, interfaceC9857xr, interfaceC9854xo, interfaceC9863xx, str);
        }
        C1044Mm.d("nf_network", "creating AsynchronousNetworkDispatcher thread for %s", str);
        return new C1614aHv(this.d, this.a, blockingQueue, interfaceC9857xr, interfaceC9854xo, interfaceC9863xx, str);
    }

    public boolean e() {
        if (this.a == null) {
            return false;
        }
        if (!C9816xC.d() || C9815xB.b() == -1) {
            return this.b;
        }
        return false;
    }
}
