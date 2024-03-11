package com.netflix.mediaclient.service.player.bladerunnerclient.volley;

import android.content.Context;
import com.netflix.android.volley.Request;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.player.bladerunnerclient.OfflineLicenseResponse;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus;
import com.netflix.mediaclient.service.player.drm.LicenseRequestFlavor;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o.AbstractC4366bdE;
import o.C1044Mm;
import o.C4405bdr;
import o.InterfaceC1078Nw;
import o.InterfaceC4389bdb;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class FetchLicenseRequest extends AbstractC4366bdE {
    public final boolean a;
    public final String d;
    public final LicenseRequestFlavor e;
    private final String v;
    public final InterfaceC4389bdb x;
    private final LicenseReqType y;

    /* loaded from: classes3.dex */
    public enum LicenseReqType {
        STREAMING,
        OFFLINE
    }

    protected boolean T() {
        return true;
    }

    @Override // o.aZE
    public Boolean ae() {
        return Boolean.TRUE;
    }

    public FetchLicenseRequest(Context context, LicenseReqType licenseReqType, String str, boolean z, LicenseRequestFlavor licenseRequestFlavor, InterfaceC4389bdb interfaceC4389bdb) {
        super(context);
        this.y = licenseReqType;
        this.d = str;
        this.x = interfaceC4389bdb;
        this.a = z;
        this.e = licenseRequestFlavor;
        this.v = "[\"license\"]";
    }

    @Override // o.AbstractC2103aZz, com.netflix.android.volley.Request
    public Request.Priority s() {
        return LicenseRequestFlavor.LIMITED == this.e ? Request.Priority.NORMAL : Request.Priority.IMMEDIATE;
    }

    @Override // o.AbstractC2103aZz, com.netflix.android.volley.Request
    public Object y() {
        return LicenseRequestFlavor.LIMITED == this.e ? NetworkRequestType.PLAY_PREFETCH_LICENSE : NetworkRequestType.PLAY_LICENSE;
    }

    @Override // o.AbstractC2103aZz, o.AbstractC2100aZw, o.aZE, com.netflix.android.volley.Request
    public Map<String, String> o() {
        Map<String, String> o2 = super.o();
        if (T()) {
            o2.put("bladerunnerParams", this.d);
        }
        return o2;
    }

    @Override // o.AbstractC2100aZw
    public List<String> J() {
        return Arrays.asList(this.v);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aZE
    /* renamed from: b */
    public void a(JSONObject jSONObject) {
        JSONObject e = C4405bdr.e("nf_license", "license", jSONObject);
        JSONObject optJSONObject = e != null ? e.optJSONObject(VisualStateDefinition.ELEMENT_STATE.RESULT) : e;
        Status b = C4405bdr.b(this.C, e, al());
        if (b.j() && !a(optJSONObject)) {
            b = InterfaceC1078Nw.b;
        }
        if (this.x != null) {
            a(optJSONObject, b);
        } else {
            C1044Mm.j("nf_license", "callback null?");
        }
    }

    @Override // o.aZE
    public void e(Status status) {
        if (this.x != null) {
            a((JSONObject) null, status);
        } else {
            C1044Mm.j("nf_license", "callback null?");
        }
    }

    public boolean X() {
        return this.y == LicenseReqType.STREAMING;
    }

    private boolean a(JSONObject jSONObject) {
        return BasePlayErrorStatus.e(jSONObject);
    }

    public void a(JSONObject jSONObject, Status status) {
        if (X()) {
            this.x.d(jSONObject, status);
            return;
        }
        OfflineLicenseResponse offlineLicenseResponse = new OfflineLicenseResponse(jSONObject, V());
        C1044Mm.a("nf_license", "onLicenseFetched type:%s, licenseResponse: %s", this.y, offlineLicenseResponse);
        this.x.a(offlineLicenseResponse, status);
    }

    private BasePlayErrorStatus.PlayRequestType al() {
        if (this.y == LicenseReqType.STREAMING) {
            return BasePlayErrorStatus.PlayRequestType.StreamingLicense;
        }
        return this.a ? BasePlayErrorStatus.PlayRequestType.OfflineLicenseRefresh : BasePlayErrorStatus.PlayRequestType.OfflineLicense;
    }
}
