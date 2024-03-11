package o;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class aZF extends AbstractC2103aZz<JSONObject> {
    private long e = System.currentTimeMillis();

    @Override // o.AbstractC2100aZw
    /* renamed from: h */
    public JSONObject a(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            e = e;
            jSONObject = null;
        }
        try {
            InterfaceC2092aZo b = C2090aZm.d.b(jSONObject);
            if (b != null) {
                b.d();
            }
        } catch (JSONException e2) {
            e = e2;
            C1044Mm.e("NodeQuarkRequest", "error parsing json", e);
            return jSONObject;
        }
        return jSONObject;
    }
}
