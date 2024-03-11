package o;

import org.json.JSONObject;

/* renamed from: o.aYe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2055aYe extends AbstractC2063aYm {
    private String a;
    private String d;
    private String e;

    public C2055aYe(JSONObject jSONObject) {
        super("META_DATA_CHANGED");
        this.a = jSONObject.getString("catalogId");
        this.e = jSONObject.optString("episodeId", null);
        this.d = jSONObject.getString("type");
        this.c = jSONObject;
    }
}
