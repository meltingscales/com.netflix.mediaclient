package o;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes3.dex */
public final class aNX {
    @SerializedName("subType")
    private final String a;
    @SerializedName("payload")
    private final JsonObject b;
    @SerializedName("msgId")
    private final int c;
    @SerializedName("category")
    private final String d;
    @SerializedName("senderApp")
    private final String e;
    @SerializedName("targetEsn")
    private final String f;
    @SerializedName("type")
    private final String g;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aNX) {
            aNX anx = (aNX) obj;
            return this.c == anx.c && C8632dsu.c((Object) this.f, (Object) anx.f) && C8632dsu.c(this.b, anx.b);
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.c) * 31) + this.f.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        int i = this.c;
        String str = this.f;
        JsonObject jsonObject = this.b;
        return "DisconnectRequest(msgId=" + i + ", targetEsn=" + str + ", payload=" + jsonObject + ")";
    }

    public aNX(int i, String str, JsonObject jsonObject) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) jsonObject, "");
        this.c = i;
        this.f = str;
        this.b = jsonObject;
        this.d = "deviceToDevice";
        this.g = "unsubscribe";
        this.a = "mobileCompanion";
        this.e = "mobileCompanion";
    }

    public final String e() {
        String json = C8118deO.a().toJson(this);
        C8632dsu.a(json, "");
        return json;
    }
}
