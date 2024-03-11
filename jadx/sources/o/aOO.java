package o;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aOO implements UX {
    private final JSONObject e;

    public aOO(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        this.e = jSONObject;
    }

    @Override // o.UX
    public boolean e() {
        return this.e.optBoolean("inSkipWindow");
    }

    @Override // o.UX
    public String d() {
        String optString = this.e.optString("text");
        C8632dsu.a(optString, "");
        return optString;
    }
}
