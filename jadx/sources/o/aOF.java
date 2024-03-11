package o;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aOF {
    public static final aOF c = new aOF();

    private aOF() {
    }

    public final UV d(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        if (jSONObject.has("uiState")) {
            return new aOI(jSONObject);
        }
        return null;
    }
}
