package o;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

/* renamed from: o.aOe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1786aOe {
    @SerializedName("senderApp")
    private final String a;
    @SerializedName("msgId")
    private final int b;
    @SerializedName("payload")
    private final JsonObject c;
    @SerializedName("category")
    private final String d;
    @SerializedName("subType")
    private final String e;
    @SerializedName("type")
    private final String g;
    @SerializedName("targetEsn")
    private final String h;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1786aOe) {
            C1786aOe c1786aOe = (C1786aOe) obj;
            return this.b == c1786aOe.b && C8632dsu.c((Object) this.h, (Object) c1786aOe.h) && C8632dsu.c(this.c, c1786aOe.c);
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
        return "MetadataResponse(msgId=" + i + ", targetEsn=" + str + ", payload=" + jsonObject + ")";
    }

    public C1786aOe(int i, String str, JsonObject jsonObject) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) jsonObject, "");
        this.b = i;
        this.h = str;
        this.c = jsonObject;
        this.d = "deviceToDevice";
        this.g = "metaDataResponse";
        this.e = "mobileCompanion";
        this.a = "mobileCompanion";
    }

    public final String b() {
        String json = C8118deO.a().toJson(this);
        C8632dsu.a(json, "");
        return json;
    }
}
