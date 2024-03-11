package o;

import android.content.Context;
import com.netflix.android.volley.Request;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o.C1964aUu;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class aVG extends AbstractC2103aZz<JSONObject> {
    private String a;
    private final C1964aUu.c d;
    private Context e;

    @Override // o.aZE
    public String G_() {
        return this.a;
    }

    @Override // o.aZE
    public boolean V() {
        return true;
    }

    public aVG(Context context, String str, C1964aUu.c cVar) {
        this.e = context;
        this.a = str;
        this.d = cVar;
    }

    @Override // o.AbstractC2103aZz, com.netflix.android.volley.Request
    public Request.Priority s() {
        return Request.Priority.HIGH;
    }

    @Override // o.AbstractC2103aZz, com.netflix.android.volley.Request
    public Object y() {
        return NetworkRequestType.RELEASE_LICENSE;
    }

    @Override // o.AbstractC2103aZz, o.AbstractC2100aZw, o.aZE, com.netflix.android.volley.Request
    public Map<String, String> o() {
        return super.o();
    }

    @Override // o.aZE, com.netflix.android.volley.Request
    public Map<String, String> j() {
        Map<String, String> map;
        try {
            map = super.j();
        } catch (Throwable th) {
            th = th;
            map = null;
        }
        try {
            C8200dfr.b(map, "releaseLicense");
        } catch (Throwable th2) {
            th = th2;
            C1044Mm.b("nf_msl_volley_SendReleaseLicense", th, "Failed to get MSL headers", new Object[0]);
            return map;
        }
        return map;
    }

    @Override // o.AbstractC2100aZw
    public List<String> J() {
        return Arrays.asList("[\"link\"]");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC2100aZw
    /* renamed from: g */
    public JSONObject a(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.netflix.mediaclient.android.app.Status] */
    @Override // o.aZE
    /* renamed from: d */
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aC;
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject(VisualStateDefinition.ELEMENT_STATE.RESULT);
            jSONObject2 = optJSONObject;
            netflixImmutableStatus = C1959aUp.a(this.e, jSONObject, BasePlayErrorStatus.PlayRequestType.Link);
        } else {
            jSONObject2 = null;
        }
        if (netflixImmutableStatus.i()) {
            C1044Mm.e("nf_nq", "Delivery was ok but releaseLicense  not accepted by server. do not retry to prevent retry flood: %s", jSONObject);
        }
        C1964aUu.c cVar = this.d;
        if (cVar != null) {
            cVar.e(jSONObject2, InterfaceC1078Nw.aJ);
        } else {
            C1044Mm.j("nf_msl_volley_SendReleaseLicense", "callback null?");
        }
    }

    @Override // o.aZE
    public void e(Status status) {
        C1964aUu.c cVar = this.d;
        if (cVar != null) {
            cVar.e(null, status);
        } else {
            C1044Mm.j("nf_msl_volley_SendReleaseLicense", "callback null?");
        }
    }
}
