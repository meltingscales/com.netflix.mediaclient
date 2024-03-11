package o;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

/* renamed from: o.aOi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1790aOi {
    @SerializedName("subType")
    private final String a;
    @SerializedName("category")
    private final String b;
    @SerializedName("payload")
    private final JsonObject c;
    @SerializedName("msgId")
    private final int d;
    @SerializedName("senderApp")
    private final String e;
    @SerializedName("type")
    private final String g;
    @SerializedName("targetEsn")
    private final String i;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1790aOi) {
            C1790aOi c1790aOi = (C1790aOi) obj;
            return this.d == c1790aOi.d && C8632dsu.c((Object) this.i, (Object) c1790aOi.i) && C8632dsu.c(this.c, c1790aOi.c);
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.d) * 31) + this.i.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        int i = this.d;
        String str = this.i;
        JsonObject jsonObject = this.c;
        return "RouteRequest(msgId=" + i + ", targetEsn=" + str + ", payload=" + jsonObject + ")";
    }

    public C1790aOi(int i, String str, JsonObject jsonObject) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) jsonObject, "");
        this.d = i;
        this.i = str;
        this.c = jsonObject;
        this.b = "deviceToDevice";
        this.g = "Route";
        this.a = "mobileCompanion";
        this.e = "mobileCompanion";
    }

    public final String a() {
        String json = C8118deO.a().toJson(this);
        C8632dsu.a(json, "");
        return json;
    }
}
