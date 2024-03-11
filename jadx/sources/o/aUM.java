package o;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aUM extends C1973aVd {
    private final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aUM(String str, String str2, boolean z) {
        super(str, "search", z);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.a = str2;
    }

    @Override // o.C1973aVd
    public JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("term", this.a);
        return jSONObject;
    }
}
