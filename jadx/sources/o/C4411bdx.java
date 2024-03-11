package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.player.bladerunnerclient.BladeRunnerPrefetchResponseHandler;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.FetchLicenseRequest;
import com.netflix.mediaclient.service.player.drm.LicenseRequestFlavor;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: o.bdx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4411bdx extends FetchLicenseRequest {
    protected final Long v;
    protected final BladeRunnerPrefetchResponseHandler y;

    public boolean ak() {
        return true;
    }

    public C4411bdx(Context context, String str, boolean z, LicenseRequestFlavor licenseRequestFlavor, InterfaceC4389bdb interfaceC4389bdb, BladeRunnerPrefetchResponseHandler bladeRunnerPrefetchResponseHandler, Long l) {
        super(context, FetchLicenseRequest.LicenseReqType.STREAMING, str, z, licenseRequestFlavor, interfaceC4389bdb);
        this.y = bladeRunnerPrefetchResponseHandler;
        this.v = l;
    }

    @Override // o.aZE, com.netflix.android.volley.Request
    public Map<String, String> j() {
        Map<String, String> map;
        try {
            map = super.j();
        } catch (Throwable th) {
            C1044Mm.b("nf_license", th, "Failed to get MSL headers", new Object[0]);
            map = null;
        }
        C1044Mm.a("nf_license", "headers: %s", map);
        return map;
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.volley.FetchLicenseRequest
    public void a(JSONObject jSONObject, Status status) {
        if (X() && LicenseRequestFlavor.LIMITED == ((FetchLicenseRequest) this).e) {
            this.y.a(this.v);
        }
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.volley.FetchLicenseRequest, o.aZE
    /* renamed from: b */
    public void a(JSONObject jSONObject) {
        a(jSONObject, InterfaceC1078Nw.aJ);
    }
}
