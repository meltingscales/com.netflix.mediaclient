package o;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aOL implements InterfaceC1265Va {
    private final JSONObject d;

    public aOL(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        this.d = jSONObject;
    }

    @Override // o.InterfaceC1265Va
    public boolean d() {
        return this.d.optBoolean("autoReconnect");
    }
}
