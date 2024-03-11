package o;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

/* renamed from: o.aOj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1791aOj {
    @SerializedName("category")
    private final String a;
    @SerializedName("payload")
    private final JsonObject b;
    @SerializedName("subType")
    private final String c;
    @SerializedName("msgId")
    private final int d;
    @SerializedName("senderApp")
    private final String e;
    @SerializedName("type")
    private final String f;
    @SerializedName("targetEsn")
    private final String i;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1791aOj) {
            C1791aOj c1791aOj = (C1791aOj) obj;
            return this.d == c1791aOj.d && C8632dsu.c((Object) this.i, (Object) c1791aOj.i) && C8632dsu.c(this.b, c1791aOj.b);
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.d) * 31) + this.i.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        int i = this.d;
        String str = this.i;
        JsonObject jsonObject = this.b;
        return "SearchRequest(msgId=" + i + ", targetEsn=" + str + ", payload=" + jsonObject + ")";
    }

    public C1791aOj(int i, String str, JsonObject jsonObject) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) jsonObject, "");
        this.d = i;
        this.i = str;
        this.b = jsonObject;
        this.a = "deviceToDevice";
        this.f = "Route";
        this.c = "mobileCompanion";
        this.e = "mobileCompanion";
    }

    public final String d() {
        String json = C8118deO.a().toJson(this);
        C8632dsu.a(json, "");
        return json;
    }
}
