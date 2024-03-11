package o;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

/* renamed from: o.aOm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1794aOm {
    @SerializedName("payload")
    private final JsonObject a;
    @SerializedName("msgId")
    private final int b;
    @SerializedName("subType")
    private final String c;
    @SerializedName("category")
    private final String d;
    @SerializedName("senderApp")
    private final String e;
    @SerializedName("type")
    private final String f;
    @SerializedName("targetEsn")
    private final String g;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1794aOm) {
            C1794aOm c1794aOm = (C1794aOm) obj;
            return this.b == c1794aOm.b && C8632dsu.c((Object) this.g, (Object) c1794aOm.g) && C8632dsu.c(this.a, c1794aOm.a);
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.b) * 31) + this.g.hashCode()) * 31) + this.a.hashCode();
    }

    public String toString() {
        int i = this.b;
        String str = this.g;
        JsonObject jsonObject = this.a;
        return "UnpauseRequest(msgId=" + i + ", targetEsn=" + str + ", payload=" + jsonObject + ")";
    }

    public C1794aOm(int i, String str, JsonObject jsonObject) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) jsonObject, "");
        this.b = i;
        this.g = str;
        this.a = jsonObject;
        this.d = "deviceToDevice";
        this.f = "unpause";
        this.c = "mobileCompanion";
        this.e = "mobileCompanion";
    }

    public final String b() {
        String json = C8118deO.a().toJson(this);
        C8632dsu.a(json, "");
        return json;
    }
}
