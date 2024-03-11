package o;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aOK {
    public static final aOK b = new aOK();

    private aOK() {
    }

    public final UW c(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        if (jSONObject.has("playerState")) {
            return new aON(jSONObject);
        }
        return null;
    }
}
