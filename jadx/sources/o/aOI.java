package o;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aOI implements UV {
    private final String c;
    private final String e;

    public aOI(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        this.e = d(jSONObject);
        String optString = jSONObject.optString("uiState", "");
        C8632dsu.a(optString, "");
        this.c = optString;
    }

    private final String d(JSONObject jSONObject) {
        if (jSONObject.has("viewableId")) {
            return jSONObject.optString("viewableId");
        }
        return null;
    }
}
