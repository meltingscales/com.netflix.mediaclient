package o;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aOM {
    public static final aOM b = new aOM();

    private aOM() {
    }

    public final InterfaceC1265Va c(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        if (jSONObject.has("companionSessionId")) {
            return new aOL(jSONObject);
        }
        return null;
    }
}
