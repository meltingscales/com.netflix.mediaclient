package o;

import org.json.JSONObject;

/* renamed from: o.aYl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2062aYl extends AbstractC2063aYm {
    private C2061aYk d;

    public C2061aYk e() {
        return this.d;
    }

    public C2062aYl(JSONObject jSONObject) {
        super("PLAYER_STATE_CHANGED");
        this.d = new C2061aYk(jSONObject);
        this.c = jSONObject;
    }
}
