package o;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

/* renamed from: o.aOk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1792aOk {
    @SerializedName("category")
    private final String a;
    @SerializedName("msgId")
    private final int b;
    @SerializedName("payload")
    private final JsonObject c;
    @SerializedName("senderApp")
    private final String d;
    @SerializedName("subType")
    private final String e;
    @SerializedName("targetEsn")
    private final String h;
    @SerializedName("type")
    private final String i;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1792aOk) {
            C1792aOk c1792aOk = (C1792aOk) obj;
            return this.b == c1792aOk.b && C8632dsu.c((Object) this.h, (Object) c1792aOk.h) && C8632dsu.c(this.c, c1792aOk.c);
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.b) * 31) + this.h.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        int i = this.b;
        String str = this.h;
        JsonObject jsonObject = this.c;
        return "PlayerSubscriptionRequest(msgId=" + i + ", targetEsn=" + str + ", payload=" + jsonObject + ")";
    }

    public C1792aOk(int i, String str, JsonObject jsonObject) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) jsonObject, "");
        this.b = i;
        this.h = str;
        this.c = jsonObject;
        this.a = "deviceToDevice";
        this.i = "subscribeToPlayer";
        this.e = "mobileCompanion";
        this.d = "mobileCompanion";
    }

    public final String b() {
        String json = C8118deO.a().toJson(this);
        C8632dsu.a(json, "");
        return json;
    }
}
