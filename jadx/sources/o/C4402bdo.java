package o;

import android.content.Context;
import com.netflix.android.volley.Request;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestFlavor;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.bdo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4402bdo extends AbstractC4366bdE {
    protected final ManifestRequestFlavor a;
    protected final InterfaceC4389bdb d;
    protected final String e;
    private final String v;

    protected boolean T() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONObject b(JSONObject jSONObject) {
        return jSONObject;
    }

    public C4402bdo(Context context, String str, ManifestRequestFlavor manifestRequestFlavor, InterfaceC4389bdb interfaceC4389bdb) {
        super(context);
        this.e = str;
        this.d = interfaceC4389bdb;
        this.a = manifestRequestFlavor;
        this.v = "[\"manifests\"]";
    }

    @Override // o.AbstractC2103aZz, com.netflix.android.volley.Request
    public Request.Priority s() {
        return ManifestRequestFlavor.PREFETCH == this.a ? Request.Priority.NORMAL : Request.Priority.IMMEDIATE;
    }

    @Override // o.AbstractC2103aZz, com.netflix.android.volley.Request
    public Object y() {
        return ManifestRequestFlavor.PREFETCH == this.a ? NetworkRequestType.PLAY_PREFETCH_MANIFEST : NetworkRequestType.PLAY_MANIFEST;
    }

    @Override // o.AbstractC2103aZz, o.AbstractC2100aZw, o.aZE, com.netflix.android.volley.Request
    public Map<String, String> o() {
        Map<String, String> o2 = super.o();
        if (T()) {
            o2.put("bladerunnerParams", this.e);
        }
        return o2;
    }

    @Override // o.AbstractC2100aZw
    public List<String> J() {
        return Arrays.asList(this.v);
    }

    protected JSONObject e(JSONObject jSONObject) {
        JSONObject e = C4405bdr.e("nf_manifest", "manifests", jSONObject);
        if (e != null) {
            return e.optJSONObject(VisualStateDefinition.ELEMENT_STATE.RESULT);
        }
        return null;
    }

    private Status c(JSONObject jSONObject) {
        Status status = InterfaceC1078Nw.b;
        BasePlayErrorStatus.PlayRequestType playRequestType = this.a == ManifestRequestFlavor.OFFLINE ? BasePlayErrorStatus.PlayRequestType.OfflineManifest : BasePlayErrorStatus.PlayRequestType.StreamingManifest;
        if (jSONObject == null) {
            return status;
        }
        try {
            status = C4405bdr.b(this.C, jSONObject, playRequestType);
        } catch (JSONException e) {
            C1044Mm.e("nf_manifest", "parsing manifest error", e);
        }
        if (status.i()) {
            C1044Mm.a("nf_manifest", "manifests has errors, status: %s", status.c());
            return status;
        }
        Iterator keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            String str = (String) keys.next();
            status = C4405bdr.b(this.C, jSONObject.getJSONObject(str), playRequestType);
            if (status.i()) {
                C1044Mm.a("nf_manifest", "manifest for %s has errors, status: %s", str, status.c());
                break;
            }
        }
        return status;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            try {
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    JSONObject jSONObject3 = jSONObject.getJSONObject(str);
                    if (jSONObject3 != null) {
                        jSONObject3.put("timestamp", System.currentTimeMillis());
                        long optLong = jSONObject3.optLong("expiration", 0L);
                        if (optLong < System.currentTimeMillis() + 3600000) {
                            C1044Mm.d("nf_manifest", "server manifest expiring...  " + optLong);
                            jSONObject3.put("expiration", System.currentTimeMillis() + 3600000);
                        }
                        jSONObject2.put(str, jSONObject3);
                    }
                }
            } catch (JSONException e) {
                C1044Mm.e("nf_manifest", "parsing manifest error", e);
            }
        }
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aZE
    /* renamed from: d */
    public void a(JSONObject jSONObject) {
        JSONObject e = e(jSONObject);
        Status c = c(e);
        if (c.j()) {
            e = b(a(e));
        }
        c(e, c);
    }

    @Override // o.aZE
    public void e(Status status) {
        c((JSONObject) null, status);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(JSONObject jSONObject, Status status) {
        InterfaceC4389bdb interfaceC4389bdb = this.d;
        if (interfaceC4389bdb != null) {
            interfaceC4389bdb.a(jSONObject, status);
        } else {
            C1044Mm.j("nf_manifest", "callback null?");
        }
    }
}
