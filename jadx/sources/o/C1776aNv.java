package o;

import org.json.JSONObject;

/* renamed from: o.aNv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1776aNv {
    public static final C1776aNv e = new C1776aNv();

    private C1776aNv() {
    }

    public final UY c(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        if (jSONObject.has("location")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("location");
            C8632dsu.a(jSONObject2, "");
            return new C1780aNz(jSONObject2);
        }
        return null;
    }
}
