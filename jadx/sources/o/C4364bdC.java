package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import org.json.JSONObject;

/* renamed from: o.bdC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4364bdC extends C4403bdp {
    public C4364bdC(Context context, String str, String str2, InterfaceC4389bdb interfaceC4389bdb) {
        super(context, str, str2, interfaceC4389bdb);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C4403bdp, o.aZE
    /* renamed from: e */
    public void a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        Status a = C1959aUp.a(this.C, jSONObject, BasePlayErrorStatus.PlayRequestType.OfflineLicenseDelete);
        String optString = (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(VisualStateDefinition.ELEMENT_STATE.RESULT)) == null) ? null : optJSONObject.optString("secureStopResponseBase64");
        C1044Mm.a("nf_bladerunner", "onSuccess %s status: %s responseActions %s", ((C4403bdp) this).e, a, optString);
        InterfaceC4389bdb interfaceC4389bdb = ((C4403bdp) this).d;
        if (interfaceC4389bdb != null) {
            interfaceC4389bdb.b(a, optString);
        } else {
            C1044Mm.e("nf_bladerunner", "no callback for licenseDeactivate");
        }
    }

    @Override // o.C4403bdp, o.aZE
    public void e(Status status) {
        InterfaceC4389bdb interfaceC4389bdb = ((C4403bdp) this).d;
        if (interfaceC4389bdb != null) {
            interfaceC4389bdb.b(status, (String) null);
        } else {
            C1044Mm.e("nf_bladerunner", "no callback for link");
        }
    }
}
