package o;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aOH {
    public static final aOH b = new aOH();

    private aOH() {
    }

    public final UU b(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        if (jSONObject.has("playerState")) {
            return new aOG(jSONObject);
        }
        return null;
    }
}
