package o;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.bdF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4367bdF extends C4410bdw {
    private final AbstractC4564bgr x;

    private static void a(JSONObject jSONObject, AbstractC4564bgr abstractC4564bgr) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("links");
            AbstractC4561bgo a = abstractC4564bgr.a();
            if (a != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("href", a.d());
                jSONObject2.put("rel", a.a());
                optJSONObject.put("license", jSONObject2);
            }
            jSONObject.putOpt("links", optJSONObject);
        } catch (JSONException e) {
            C1044Mm.e("nf_manifest", "error injecting old links into manifest", e);
        }
    }

    public static JSONObject c(JSONObject jSONObject, AbstractC4564bgr abstractC4564bgr) {
        if (jSONObject != null) {
            try {
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject((String) keys.next());
                    if (abstractC4564bgr != null) {
                        a(jSONObject2, abstractC4564bgr);
                    }
                }
            } catch (JSONException e) {
                C1044Mm.e("nf_manifest", "parsing manifest error", e);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C4402bdo
    public JSONObject b(JSONObject jSONObject) {
        return c(jSONObject, this.x);
    }
}
