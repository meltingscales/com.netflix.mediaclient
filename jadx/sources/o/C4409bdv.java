package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.FetchLicenseRequest;
import com.netflix.mediaclient.service.player.drm.LicenseRequestFlavor;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: o.bdv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4409bdv extends FetchLicenseRequest {
    private final String v;

    @Override // o.AbstractC2100aZw
    public String K() {
        return this.v;
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.volley.FetchLicenseRequest
    public boolean T() {
        return false;
    }

    @Override // o.aZE
    public boolean V() {
        return true;
    }

    public C4409bdv(Context context, String str, String str2, boolean z, LicenseRequestFlavor licenseRequestFlavor, InterfaceC4389bdb interfaceC4389bdb) {
        super(context, FetchLicenseRequest.LicenseReqType.OFFLINE, str2, z, licenseRequestFlavor, interfaceC4389bdb);
        this.v = str;
    }

    @Override // o.aZE, com.netflix.android.volley.Request
    public Map<String, String> j() {
        Map<String, String> map;
        try {
            map = super.j();
            try {
                C8200dfr.b(map, "license");
                C8200dfr.e(map);
            } catch (Throwable th) {
                th = th;
                C1044Mm.b("nf_license", th, "Failed to get MSL headers", new Object[0]);
                C1044Mm.a("nf_license", "headers: %s", map);
                return map;
            }
        } catch (Throwable th2) {
            th = th2;
            map = null;
        }
        C1044Mm.a("nf_license", "headers: %s", map);
        return map;
    }

    @Override // o.aZE
    public String G_() {
        C1044Mm.a("nf_license", "nqBody: %s", ((FetchLicenseRequest) this).d);
        return ((FetchLicenseRequest) this).d;
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.volley.FetchLicenseRequest, o.aZE
    /* renamed from: b */
    public void a(JSONObject jSONObject) {
        BasePlayErrorStatus.PlayRequestType playRequestType;
        if (jSONObject.has(VisualStateDefinition.ELEMENT_STATE.RESULT)) {
            jSONObject = jSONObject.optJSONObject(VisualStateDefinition.ELEMENT_STATE.RESULT);
        }
        if (((FetchLicenseRequest) this).a) {
            playRequestType = BasePlayErrorStatus.PlayRequestType.OfflineLicenseRefresh;
        } else {
            playRequestType = BasePlayErrorStatus.PlayRequestType.OfflineLicense;
        }
        Status a = C1959aUp.a(this.C, jSONObject, playRequestType);
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
