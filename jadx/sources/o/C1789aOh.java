package o;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

/* renamed from: o.aOh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1789aOh {
    @SerializedName("msgId")
    private final int a;
    @SerializedName("payload")
    private final JsonObject b;
    @SerializedName("category")
    private final String c;
    @SerializedName("subType")
    private final String d;
    @SerializedName("senderApp")
    private final String e;
    @SerializedName("targetEsn")
    private final String g;
    @SerializedName("type")
    private final String i;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1789aOh) {
            C1789aOh c1789aOh = (C1789aOh) obj;
            return this.a == c1789aOh.a && C8632dsu.c((Object) this.g, (Object) c1789aOh.g) && C8632dsu.c(this.b, c1789aOh.b);
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.a) * 31) + this.g.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        int i = this.a;
        String str = this.g;
        JsonObject jsonObject = this.b;
        return "SwitchProfileRequest(msgId=" + i + ", targetEsn=" + str + ", payload=" + jsonObject + ")";
    }

    public C1789aOh(int i, String str, JsonObject jsonObject) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) jsonObject, "");
        this.a = i;
        this.g = str;
        this.b = jsonObject;
        this.c = "deviceToDevice";
        this.i = "SwitchProfile";
        this.d = "mobileCompanion";
        this.e = "mobileCompanion";
    }

    public final String b() {
        String json = C8118deO.a().toJson(this);
        C8632dsu.a(json, "");
        return json;
    }
}
