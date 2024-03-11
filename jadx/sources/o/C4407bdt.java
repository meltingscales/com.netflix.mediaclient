package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.player.bladerunnerclient.BladeRunnerPrefetchResponseHandler;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.FetchLicenseRequest;
import com.netflix.mediaclient.service.player.drm.LicenseRequestFlavor;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: o.bdt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4407bdt extends C4411bdx {
    private final boolean D;

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.volley.FetchLicenseRequest
    public boolean T() {
        return false;
    }

    @Override // o.aZE
    public boolean V() {
        return true;
    }

    @Override // o.C4411bdx
    public boolean ak() {
        return false;
    }

    public C4407bdt(Context context, String str, boolean z, LicenseRequestFlavor licenseRequestFlavor, InterfaceC4389bdb interfaceC4389bdb, BladeRunnerPrefetchResponseHandler bladeRunnerPrefetchResponseHandler, Long l, boolean z2) {
        super(context, str, z, licenseRequestFlavor, interfaceC4389bdb, bladeRunnerPrefetchResponseHandler, l);
        this.D = z2;
    }

    @Override // o.C4411bdx, o.aZE, com.netflix.android.volley.Request
    public Map<String, String> j() {
        Map<String, String> map;
        try {
            map = super.j();
        } catch (Throwable th) {
            th = th;
            map = null;
        }
        try {
            String str = ((FetchLicenseRequest) this).e == LicenseRequestFlavor.LIMITED ? "prefetch/license" : "license";
            if (this.D) {
                str = str + "/live";
            }
            C8200dfr.b(map, str);
        } catch (Throwable th2) {
            th = th2;
            C1044Mm.b("nf_license", th, "Failed to get MSL headers", new Object[0]);
            C1044Mm.a("nf_license", "headers: %s", map);
            return map;
        }
        C1044Mm.a("nf_license", "headers: %s", map);
        return map;
    }

    @Override // o.aZE
    public String G_() {
        C1044Mm.a("nf_license", "nqBody: %s", ((FetchLicenseRequest) this).d);
        return ((FetchLicenseRequest) this).d;
    }

    @Override // o.C4411bdx, com.netflix.mediaclient.service.player.bladerunnerclient.volley.FetchLicenseRequest
    public void a(JSONObject jSONObject, Status status) {
        if (X() && LicenseRequestFlavor.LIMITED == ((FetchLicenseRequest) this).e) {
            ((C4411bdx) this).y.a(((C4411bdx) this).v);
        }
        InterfaceC4389bdb interfaceC4389bdb = ((FetchLicenseRequest) this).x;
        if (interfaceC4389bdb != null) {
            interfaceC4389bdb.d(jSONObject, status);
        }
    }

    @Override // o.C4411bdx, com.netflix.mediaclient.service.player.bladerunnerclient.volley.FetchLicenseRequest, o.aZE
    /* renamed from: b */
    public void a(JSONObject jSONObject) {
        if (jSONObject.has(VisualStateDefinition.ELEMENT_STATE.RESULT)) {
            jSONObject = jSONObject.optJSONObject(VisualStateDefinition.ELEMENT_STATE.RESULT);
        }
        Status a = C1959aUp.a(this.C, jSONObject, BasePlayErrorStatus.PlayRequestType.StreamingLicense);
        if (c(a)) {
            ((aZE) this).m.a(this);
        } else {
            a(jSONObject, a);
        }
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.volley.FetchLicenseRequest, o.aZE
    public void e(Status status) {
        a((JSONObject) null, status);
    }
}
