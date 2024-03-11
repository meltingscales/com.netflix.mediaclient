package o;

import org.json.JSONObject;

/* renamed from: o.aYf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2056aYf extends AbstractC2063aYm {
    private static String a = "isPinVerified";
    private boolean e;

    public boolean e() {
        return this.e;
    }

    public C2056aYf(JSONObject jSONObject) {
        super("MDX_ACTION_PIN_VERIFICATION_NOT_REQUIRED");
        this.e = jSONObject.optBoolean(a);
        this.c = jSONObject;
    }
}
