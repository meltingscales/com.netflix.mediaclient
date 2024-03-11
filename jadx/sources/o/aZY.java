package o;

import android.content.Context;
import android.net.Uri;
import com.netflix.android.volley.Request;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.net.probe.ProbeConfigResponse;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;

/* loaded from: classes3.dex */
class aZY extends AbstractC5042brL<ProbeConfigResponse> {
    private final Context a;
    private String d;
    protected ApiEndpointRegistry e;
    private d i;
    private int j;

    /* loaded from: classes3.dex */
    public interface d {
        void c(ProbeConfigResponse probeConfigResponse);

        void d();
    }

    @Override // com.netflix.android.volley.Request
    public boolean C() {
        return true;
    }

    @Override // o.AbstractC5042brL
    public String K() {
        return null;
    }

    public aZY(Context context, int i, String str, d dVar) {
        super(0);
        this.a = context;
        this.j = i;
        this.d = str;
        this.i = dVar;
        c(NetworkRequestType.FTL_PROBE);
    }

    @Override // o.AbstractC5042brL
    public void a(ApiEndpointRegistry apiEndpointRegistry) {
        this.e = apiEndpointRegistry;
        g(apiEndpointRegistry.a((String) null).toExternalForm());
    }

    @Override // o.AbstractC5042brL, com.netflix.android.volley.Request
    public Request.Priority s() {
        return Request.Priority.LOW;
    }

    @Override // o.AbstractC5042brL
    public String a(String str) {
        Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().clearQuery().path("/ftl/probe").appendQueryParameter("monotonic", "true").appendQueryParameter("device", "android").appendQueryParameter("methods", "https,udp,tcp").appendQueryParameter("iter", Integer.toString(this.j));
        String str2 = this.d;
        if (str2 != null) {
            appendQueryParameter.appendQueryParameter("force", str2);
        }
        return appendQueryParameter.build().toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5042brL
    /* renamed from: c */
    public ProbeConfigResponse a_(String str, String str2) {
        C1044Mm.b("nf_probe", str);
        ProbeConfigResponse probeConfigResponse = (ProbeConfigResponse) C8118deO.a().fromJson(str, (Class<Object>) ProbeConfigResponse.class);
        if (probeConfigResponse != null) {
            probeConfigResponse.c(u());
        }
        return probeConfigResponse;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5042brL
    public void a(ProbeConfigResponse probeConfigResponse) {
        d dVar = this.i;
        if (dVar != null) {
            dVar.c(probeConfigResponse);
        }
        this.i = null;
    }

    @Override // o.AbstractC5042brL
    public void d(Status status) {
        d dVar = this.i;
        if (dVar != null) {
            dVar.d();
        }
        this.i = null;
    }

    @Override // com.netflix.android.volley.Request
    public InterfaceC9814xA t() {
        return new C9852xm(2500, 0, 1.0f);
    }
}
