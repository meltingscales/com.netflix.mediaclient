package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestFlavor;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.bdu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4408bdu extends C4410bdw {
    private final String v;

    @Override // o.AbstractC2100aZw
    public String K() {
        return this.v;
    }

    @Override // o.C4402bdo
    protected boolean T() {
        return false;
    }

    @Override // o.aZE
    public boolean V() {
        return true;
    }

    public C4408bdu(String str, Context context, String str2, ManifestRequestFlavor manifestRequestFlavor, InterfaceC4389bdb interfaceC4389bdb) {
        super(context, str2, manifestRequestFlavor, interfaceC4389bdb);
        this.v = str;
    }

    @Override // o.C4410bdw, o.aZE, com.netflix.android.volley.Request
    public Map<String, String> j() {
        Map<String, String> map;
        try {
            map = super.j();
            try {
                C8200dfr.b(map, "manifest");
                C8200dfr.e(map);
            } catch (Throwable th) {
                th = th;
                C1044Mm.b("nf_manifest", th, "Failed to get MSL headers", new Object[0]);
                C1044Mm.a("nf_manifest", "headers: %s", map);
                return map;
            }
        } catch (Throwable th2) {
            th = th2;
            map = null;
        }
        C1044Mm.a("nf_manifest", "headers: %s", map);
        return map;
    }

    @Override // o.aZE
    public String G_() {
        C1044Mm.a("nf_manifest", "nqBody: %s", ((C4402bdo) this).e);
        return ((C4402bdo) this).e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C4410bdw, o.C4402bdo
    public void c(JSONObject jSONObject, Status status) {
        InterfaceC4389bdb interfaceC4389bdb = ((C4402bdo) this).d;
        if (interfaceC4389bdb != null) {
            interfaceC4389bdb.a(jSONObject, status);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C4410bdw, o.C4402bdo, o.aZE
    /* renamed from: d */
    public void a(JSONObject jSONObject) {
        JSONObject c = c(jSONObject.optJSONArray(VisualStateDefinition.ELEMENT_STATE.RESULT));
        Status c2 = c(c);
        if (c2.j()) {
            c = b(a(c));
        } else if (c(c2)) {
            ((aZE) this).m.a(this);
            return;
        }
        c(c, c2);
    }

    @Override // o.C4402bdo, o.aZE
    public void e(Status status) {
        c((JSONObject) null, status);
    }

    private JSONObject c(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                jSONObject.putOpt(jSONObject2.getString("movieId"), jSONObject2);
            } catch (JSONException unused) {
                C1044Mm.d("nf_manifest", "error building manifest");
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        o.C1044Mm.a("nf_manifest", "manifest for %s has errors, status: %s", r4, r1.c());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.netflix.mediaclient.android.app.Status c(org.json.JSONObject r8) {
        /*
            r7 = this;
            java.lang.String r0 = "nf_manifest"
            com.netflix.mediaclient.android.app.NetflixImmutableStatus r1 = o.InterfaceC1078Nw.ax
            if (r8 != 0) goto L7
            return r1
        L7:
            com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestFlavor r2 = r7.a
            com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestFlavor r3 = com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestFlavor.OFFLINE
            if (r2 != r3) goto L10
            com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus$PlayRequestType r2 = com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus.PlayRequestType.OfflineManifest
            goto L12
        L10:
            com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus$PlayRequestType r2 = com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus.PlayRequestType.StreamingManifest
        L12:
            java.util.Iterator r3 = r8.keys()     // Catch: org.json.JSONException -> L45
        L16:
            boolean r4 = r3.hasNext()     // Catch: org.json.JSONException -> L45
            if (r4 == 0) goto L4b
            java.lang.Object r4 = r3.next()     // Catch: org.json.JSONException -> L45
            java.lang.String r4 = (java.lang.String) r4     // Catch: org.json.JSONException -> L45
            org.json.JSONObject r5 = r8.getJSONObject(r4)     // Catch: org.json.JSONException -> L45
            android.content.Context r6 = r7.C     // Catch: org.json.JSONException -> L45
            com.netflix.mediaclient.android.app.Status r1 = o.C1959aUp.a(r6, r5, r2)     // Catch: org.json.JSONException -> L45
            boolean r5 = r1.i()     // Catch: org.json.JSONException -> L45
            if (r5 == 0) goto L16
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: org.json.JSONException -> L45
            r2 = 0
            r8[r2] = r4     // Catch: org.json.JSONException -> L45
            com.netflix.mediaclient.StatusCode r2 = r1.c()     // Catch: org.json.JSONException -> L45
            r3 = 1
            r8[r3] = r2     // Catch: org.json.JSONException -> L45
            java.lang.String r2 = "manifest for %s has errors, status: %s"
            o.C1044Mm.a(r0, r2, r8)     // Catch: org.json.JSONException -> L45
            goto L4b
        L45:
            r8 = move-exception
            java.lang.String r2 = "parsing manifest error"
            o.C1044Mm.e(r0, r2, r8)
        L4b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4408bdu.c(org.json.JSONObject):com.netflix.mediaclient.android.app.Status");
    }
}
