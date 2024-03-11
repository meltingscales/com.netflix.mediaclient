package o;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes3.dex */
public final class aNZ {
    @SerializedName("category")
    private final String a;
    @SerializedName("msgId")
    private final int b;
    @SerializedName("subType")
    private final String c;
    @SerializedName("senderApp")
    private final String d;
    @SerializedName("payload")
    private final JsonObject e;
    @SerializedName("targetEsn")
    private final String f;
    @SerializedName("type")
    private final String j;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aNZ) {
            aNZ anz = (aNZ) obj;
            return this.b == anz.b && C8632dsu.c((Object) this.f, (Object) anz.f) && C8632dsu.c(this.e, anz.e);
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.b) * 31) + this.f.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        int i = this.b;
        String str = this.f;
        JsonObject jsonObject = this.e;
        return "MetadataRequest(msgId=" + i + ", targetEsn=" + str + ", payload=" + jsonObject + ")";
    }

    public aNZ(int i, String str, JsonObject jsonObject) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) jsonObject, "");
        this.b = i;
        this.f = str;
        this.e = jsonObject;
        this.a = "deviceToDevice";
        this.j = "metadata";
        this.c = "mobileCompanion";
        this.d = "mobileCompanion";
    }

    public final String b() {
        String json = C8118deO.a().toJson(this);
        C8632dsu.a(json, "");
        return json;
    }
}
