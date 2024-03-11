package o;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes3.dex */
public final class aNU {
    @SerializedName("subType")
    private final String a;
    @SerializedName("payload")
    private final JsonObject b;
    @SerializedName("category")
    private final String c;
    @SerializedName("senderApp")
    private final String d;
    @SerializedName("msgId")
    private final int e;
    @SerializedName("type")
    private final String f;
    @SerializedName("targetEsn")
    private final String g;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aNU) {
            aNU anu = (aNU) obj;
            return this.e == anu.e && C8632dsu.c((Object) this.g, (Object) anu.g) && C8632dsu.c(this.b, anu.b);
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.e) * 31) + this.g.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        int i = this.e;
        String str = this.g;
        JsonObject jsonObject = this.b;
        return "AckResponse(msgId=" + i + ", targetEsn=" + str + ", payload=" + jsonObject + ")";
    }

    public aNU(int i, String str, JsonObject jsonObject) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) jsonObject, "");
        this.e = i;
        this.g = str;
        this.b = jsonObject;
        this.c = "deviceToDevice";
        this.f = "ack";
        this.a = "mobileCompanion";
        this.d = "mobileCompanion";
    }

    public final String e() {
        String json = C8118deO.a().toJson(this);
        C8632dsu.a(json, "");
        return json;
    }
}
