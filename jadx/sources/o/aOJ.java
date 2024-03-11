package o;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aOJ {
    public static final aOJ e = new aOJ();

    private aOJ() {
    }

    public final UX b(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        if (jSONObject.has("inSkipWindow")) {
            return new aOO(jSONObject);
        }
        return null;
    }
}
