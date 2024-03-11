package o;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.aYi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2059aYi extends AbstractC2063aYm {
    private String a;
    private int d;
    private boolean e;

    public boolean b() {
        return this.e;
    }

    public String c() {
        return this.a;
    }

    public int d() {
        return this.d;
    }

    public C2059aYi(JSONObject jSONObject) {
        super("startSessionResponse");
        this.d = 0;
        try {
            this.d = jSONObject.getInt("sessionId");
            this.e = true;
        } catch (JSONException e) {
            this.e = false;
            this.a = C1044Mm.d(e);
        }
    }
}
