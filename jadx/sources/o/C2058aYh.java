package o;

import org.json.JSONObject;

/* renamed from: o.aYh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2058aYh extends AbstractC2063aYm {
    private static String a = "ancestorVideoId";
    private static String d = "ancestorVideoType";
    private static String e = "title";
    private static String h = "videoId";
    private String f;
    private int g;
    private int i;
    private String j;

    public String b() {
        return this.j;
    }

    public int c() {
        return this.g;
    }

    public String d() {
        return this.f;
    }

    public int e() {
        return this.i;
    }

    public C2058aYh(JSONObject jSONObject) {
        super("PIN_VERIFICATION_SHOW");
        this.j = jSONObject.optString(e);
        this.g = jSONObject.optInt(h, -1);
        this.i = jSONObject.optInt(a, -1);
        this.f = jSONObject.optString(d);
        this.c = jSONObject;
    }
}
