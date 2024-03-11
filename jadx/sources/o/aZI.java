package o;

import com.netflix.android.volley.Request;
import com.netflix.android.volley.VolleyError;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class aZI extends C9816xC implements aZL {
    public void a(Request<?> request, Map<String, String> map) {
        C8632dsu.c((Object) request, "");
        C8632dsu.c((Object) map, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aZI(InterfaceC9820xG interfaceC9820xG) {
        super(interfaceC9820xG);
        C8632dsu.c((Object) interfaceC9820xG, "");
    }

    @Override // o.C9816xC, o.InterfaceC9857xr
    public C9858xs e(Request<?> request) {
        C8632dsu.c((Object) request, "");
        return c(request);
    }

    public final C9858xs c(Request<?> request) {
        C8632dsu.c((Object) request, "");
        try {
            request.E();
            d(request);
            C9858xs e = super.e(request);
            C8632dsu.d(e);
            e(request, e);
            C8632dsu.d(e);
            return e;
        } catch (VolleyError e2) {
            d(request, e2);
            throw e2;
        }
    }

    @Override // o.C9816xC
    public void c(Request<?> request, Map<String, String> map) {
        C8632dsu.c((Object) request, "");
        C8632dsu.c((Object) map, "");
        a(request, map);
    }
}
