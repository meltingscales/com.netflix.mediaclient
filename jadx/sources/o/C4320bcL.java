package o;

import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.PlayContext;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.bcL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4320bcL {
    private PlayContext a;
    private ConnectivityUtils.NetType e;

    public C4320bcL(PlayContext playContext, ConnectivityUtils.NetType netType) {
        if (playContext == null) {
            throw new IllegalArgumentException("Play context can not be null!");
        }
        this.a = playContext;
        this.e = netType;
    }

    public int b() {
        return this.a.getTrackId();
    }

    public String a() {
        return this.a.getSectionUid();
    }

    public JSONObject d() {
        JSONException e;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e2) {
            e = e2;
            jSONObject = null;
        }
        try {
            ConnectivityUtils.c(jSONObject, this.e);
            if (this.a != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("request_id", this.a.getRequestId());
                jSONObject2.put("row", this.a.getListPos());
                jSONObject2.put("rank", this.a.i());
                if (!C8168dfL.g(this.a.a())) {
                    jSONObject2.put("lolomoId", this.a.a());
                }
                if (!C8168dfL.g(this.a.getListId())) {
                    jSONObject2.put("listId", this.a.getListId());
                }
                if (!C8168dfL.g(this.a.d())) {
                    jSONObject2.put("imageKey", this.a.d());
                }
                if (!C8168dfL.g(this.a.g())) {
                    jSONObject2.put("uiPlayContextTag", this.a.g());
                }
                if (!C8168dfL.g(this.a.h())) {
                    jSONObject2.put("videoMerchComputeId", this.a.h());
                }
                jSONObject.put("uiplaycontext", jSONObject2);
                jSONObject.put("isUIAutoPlay", "" + this.a.b());
            }
        } catch (JSONException e3) {
            e = e3;
            C1044Mm.e("nf_invoke", "Failed to create JSON object", e);
            return jSONObject;
        }
        return jSONObject;
    }
}
