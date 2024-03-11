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
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.bdp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4403bdp extends AbstractC4366bdE {
    private final String a;
    protected final InterfaceC4389bdb d;
    protected final String e;
    private final String v;

    @Override // o.aZE
    public boolean V() {
        return true;
    }

    public C4403bdp(Context context, String str, String str2, InterfaceC4389bdb interfaceC4389bdb) {
        super(context);
        this.v = str;
        this.d = interfaceC4389bdb;
        this.a = "[\"link\"]";
        this.e = str2;
        C1044Mm.a("nf_nq", "%s - %s", str2, str);
    }

    @Override // o.AbstractC2103aZz, com.netflix.android.volley.Request
    public Request.Priority s() {
        return Request.Priority.HIGH;
    }

    @Override // o.AbstractC2103aZz, com.netflix.android.volley.Request
    public Object y() {
        return NetworkRequestType.PLAY_OTHER;
    }

    @Override // o.AbstractC2103aZz, o.AbstractC2100aZw, o.aZE, com.netflix.android.volley.Request
    public Map<String, String> o() {
        return super.o();
    }

    @Override // o.AbstractC2100aZw
    public List<String> J() {
        return Arrays.asList(this.a);
    }

    @Override // o.aZF, o.AbstractC2100aZw
    /* renamed from: h */
    public JSONObject a(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            C1044Mm.e("nf_bladerunner", "error parsing json", e);
            return null;
        }
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
            C8200dfr.b(map, this.e);
        } catch (Throwable th2) {
            th = th2;
            C1044Mm.b("nf_bladerunner", th, "Failed to get MSL headers", new Object[0]);
            return map;
        }
        return map;
    }

    @Override // o.aZE
    public String G_() {
        C1044Mm.a("nf_nq", "getBodyForNq: %s", this.v);
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.netflix.mediaclient.android.app.Status] */
    @Override // o.aZE
    /* renamed from: e */
    public void a(JSONObject jSONObject) {
        NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aC;
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject(VisualStateDefinition.ELEMENT_STATE.RESULT);
            ?? a = C1959aUp.a(this.C, jSONObject, BasePlayErrorStatus.PlayRequestType.Link);
            r1 = optJSONObject != null ? optJSONObject.optJSONObject("links") : null;
            netflixImmutableStatus = a;
        }
        C1044Mm.a("nf_bladerunner", "onSuccess %s status: %s jLinks %s", this.e, netflixImmutableStatus, r1);
        InterfaceC4389bdb interfaceC4389bdb = this.d;
        if (interfaceC4389bdb != null) {
            interfaceC4389bdb.b(r1, netflixImmutableStatus);
        } else {
            C1044Mm.e("nf_bladerunner", "no callback for link");
        }
    }

    @Override // o.aZE
    public void e(Status status) {
        InterfaceC4389bdb interfaceC4389bdb = this.d;
        if (interfaceC4389bdb != null) {
            interfaceC4389bdb.b((JSONObject) null, status);
        } else {
            C1044Mm.e("nf_bladerunner", "no callback for link");
        }
    }
}
