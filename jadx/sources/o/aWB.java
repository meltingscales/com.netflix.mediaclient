package o;

import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.ZuulAgent;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aWB {
    public static final aWB d = new aWB();
    private static final aWC a = new b();

    /* loaded from: classes3.dex */
    public static final class b implements aWC {
        @Override // o.aWC
        public boolean c(JSONObject jSONObject) {
            C8632dsu.c((Object) jSONObject, "");
            return false;
        }

        b() {
        }
    }

    private aWB() {
    }

    public final aWC d(ZuulAgent zuulAgent, UserAgent userAgent, aWA awa, boolean z) {
        C8632dsu.c((Object) zuulAgent, "");
        C8632dsu.c((Object) userAgent, "");
        C8632dsu.c((Object) awa, "");
        return (C8153dex.t() && z) ? new aWF(zuulAgent, userAgent, awa) : a;
    }
}
