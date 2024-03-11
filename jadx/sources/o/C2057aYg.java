package o;

import org.json.JSONObject;

/* renamed from: o.aYg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2057aYg extends AbstractC2063aYm {
    private C2061aYk d;

    public C2061aYk e() {
        return this.d;
    }

    public C2057aYg(JSONObject jSONObject) {
        super("PLAYER_CURRENT_STATE");
        this.d = new C2061aYk(jSONObject);
        this.c = jSONObject;
    }
}
