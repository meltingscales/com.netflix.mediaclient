package o;

import android.content.Context;
import com.netflix.android.volley.Request;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.player.bladerunnerclient.BladeRunnerPrefetchResponseHandler;
import com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestFlavor;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.bds  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4406bds extends AbstractC5039brI<JSONObject> implements InterfaceC4362bdA {
    protected final String a;
    protected final InterfaceC4389bdb d;
    protected final ManifestRequestFlavor e;
    private final BladeRunnerPrefetchResponseHandler m;

    /* renamed from: o  reason: collision with root package name */
    private final Long[] f13573o;

    private boolean af() {
        return true;
    }

    @Override // o.InterfaceC4362bdA
    public Long[] P() {
        return this.f13573o;
    }

    @Override // o.InterfaceC4362bdA
    public boolean T() {
        return false;
    }

    @Override // o.InterfaceC4362bdA
    public boolean W() {
        return true;
    }

    public C4406bds(Context context, String str, ManifestRequestFlavor manifestRequestFlavor, InterfaceC4389bdb interfaceC4389bdb, BladeRunnerPrefetchResponseHandler bladeRunnerPrefetchResponseHandler, Long[] lArr) {
        super(context, 1);
        this.a = str;
        this.e = manifestRequestFlavor;
        this.m = bladeRunnerPrefetchResponseHandler;
        this.f13573o = lArr;
        this.d = interfaceC4389bdb;
    }

    @Override // o.AbstractC5039brI
    public List<String> L() {
        return Arrays.asList("[\"manifests\"]");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5039brI
    /* renamed from: c */
    public JSONObject e(String str, String str2) {
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            C1044Mm.e("nf_nq_manifest", "error parsing json", e);
            return null;
        }
    }

    @Override // o.AbstractC5039brI, o.AbstractC5042brL, com.netflix.android.volley.Request
    public Map<String, String> j() {
        Map<String, String> map;
        try {
            map = super.j();
        } catch (Throwable th) {
            th = th;
            map = null;
        }
        try {
            C8200dfr.d(map, "router", this.e == ManifestRequestFlavor.PREFETCH ? "prefetch/licensedManifest" : "licensedManifest", false, af());
        } catch (Throwable th2) {
            th = th2;
            C1044Mm.b("nf_nq_manifest", th, "Failed to get MSL headers", new Object[0]);
            C1044Mm.a("nf_nq_manifest", "headers: %s", map);
            return map;
        }
        C1044Mm.a("nf_nq_manifest", "headers: %s", map);
        return map;
    }

    @Override // com.netflix.android.volley.Request
    public byte[] Q_() {
        C1044Mm.a("nf_nq_manifest", "nqBody: %s", this.a);
        return this.a.getBytes();
    }

    protected void c(JSONObject jSONObject, Status status) {
        if (ManifestRequestFlavor.PREFETCH == this.e) {
            this.m.e(this.f13573o);
        }
        InterfaceC4389bdb interfaceC4389bdb = this.d;
        if (interfaceC4389bdb != null) {
            interfaceC4389bdb.a(jSONObject, status);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5042brL
    /* renamed from: b */
    public void a(JSONObject jSONObject) {
        JSONObject d = d(jSONObject.optJSONArray(VisualStateDefinition.ELEMENT_STATE.RESULT));
        c(d, c(d));
    }

    @Override // o.AbstractC5042brL
    public void d(Status status) {
        c((JSONObject) null, status);
    }

    private JSONObject d(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                jSONObject.putOpt(jSONObject2.getString("movieId"), jSONObject2);
            } catch (JSONException unused) {
                C1044Mm.d("nf_nq_manifest", "error building manifest");
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        o.C1044Mm.a("nf_nq_manifest", "manifest for %s has errors, status: %s", r4, r1.c());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.netflix.mediaclient.android.app.Status c(org.json.JSONObject r8) {
        /*
            r7 = this;
            java.lang.String r0 = "nf_nq_manifest"
            com.netflix.mediaclient.android.app.NetflixImmutableStatus r1 = o.InterfaceC1078Nw.ax
            if (r8 != 0) goto L7
            return r1
        L7:
            com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestFlavor r2 = r7.e
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
            android.content.Context r6 = r7.g     // Catch: org.json.JSONException -> L45
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
        throw new UnsupportedOperationException("Method not decompiled: o.C4406bds.c(org.json.JSONObject):com.netflix.mediaclient.android.app.Status");
    }

    @Override // o.InterfaceC4362bdA
    public void U() {
        c((JSONObject) null, InterfaceC1078Nw.ao);
    }

    @Override // o.AbstractC5042brL, com.netflix.android.volley.Request
    public Request.Priority s() {
        return ManifestRequestFlavor.PREFETCH == this.e ? Request.Priority.NORMAL : Request.Priority.IMMEDIATE;
    }

    @Override // com.netflix.android.volley.Request
    public Object y() {
        return ManifestRequestFlavor.PREFETCH == this.e ? NetworkRequestType.PLAY_PREFETCH_MANIFEST : NetworkRequestType.PLAY_MANIFEST;
    }
}
