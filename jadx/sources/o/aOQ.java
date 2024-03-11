package o;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aOQ {
    public static final aOQ d = new aOQ();

    private aOQ() {
    }

    public final InterfaceC1268Vd a(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        if (jSONObject.has("type") && C8632dsu.c((Object) jSONObject.optString("type"), (Object) "trackChanged")) {
            return new aOS(jSONObject);
        }
        return null;
    }
}
