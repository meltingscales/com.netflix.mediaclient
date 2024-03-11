package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o.InterfaceC5129bst;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class aZJ extends AbstractC2103aZz<JSONObject> {
    private InterfaceC5129bst.d a;
    private final String d = "[\"getProxyEsn\"]";

    @Override // o.aZE
    public boolean V() {
        return true;
    }

    public aZJ(InterfaceC5129bst.d dVar) {
        this.a = dVar;
    }

    @Override // o.AbstractC2103aZz, com.netflix.android.volley.Request
    public Object y() {
        return NetworkRequestType.PROXY_ESN;
    }

    @Override // o.aZE, com.netflix.android.volley.Request
    public Map<String, String> j() {
        Map<String, String> map;
        try {
            map = super.j();
            try {
                C8200dfr.b(map, "getProxyEsn");
                C8200dfr.e(map);
            } catch (Throwable th) {
                th = th;
                C1044Mm.b("nf_proxy_esn_request", th, "Failed to get MSL headers", new Object[0]);
                C1044Mm.a("nf_proxy_esn_request", "headers: %s", map);
                return map;
            }
        } catch (Throwable th2) {
            th = th2;
            map = null;
        }
        C1044Mm.a("nf_proxy_esn_request", "headers: %s", map);
        return map;
    }

    @Override // o.aZE
    protected String G_() {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(SignupConstants.Field.URL, "/getProxyEsn");
            str = jSONObject.toString();
        } catch (JSONException unused) {
            str = null;
        }
        C1044Mm.a("nf_proxy_esn_request", "nqBody: %s", str);
        return str;
    }

    @Override // o.AbstractC2100aZw
    protected List<String> J() {
        return Arrays.asList("[\"getProxyEsn\"]");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC2100aZw
    /* renamed from: f */
    public JSONObject a(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            C1044Mm.e("nf_proxy_esn_request", "error parsing json", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aZE
    /* renamed from: c */
    public void a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(VisualStateDefinition.ELEMENT_STATE.RESULT);
        if (optJSONObject == null) {
            C1044Mm.d("nf_proxy_esn_request", "results not found!");
            this.a.a(null, aa().d());
            return;
        }
        this.a.a(optJSONObject.optString("esn"), aa().d());
    }

    @Override // o.aZE
    protected void e(Status status) {
        this.a.a(null, aa().d());
    }
}
