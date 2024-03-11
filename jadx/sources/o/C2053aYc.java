package o;

import org.json.JSONObject;

/* renamed from: o.aYc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2053aYc extends AbstractC2063aYm {
    private boolean a;
    private boolean d;
    private int e;
    private int i;

    public boolean e() {
        return this.d;
    }

    public C2053aYc(JSONObject jSONObject) {
        super("HANDSHAKE_ACCEPTED");
        this.a = false;
        this.i = 0;
        this.e = jSONObject.optInt("contractVersion");
        this.d = jSONObject.getBoolean("accepted");
        if (jSONObject.has("volumeControl")) {
            this.a = jSONObject.optBoolean("volumeControl");
        }
        if (jSONObject.has("volumeStep")) {
            this.i = jSONObject.optInt("volumeStep");
        }
    }
}
