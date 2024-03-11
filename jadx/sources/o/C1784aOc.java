package o;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

/* renamed from: o.aOc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1784aOc {
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
    @SerializedName("type")
    private final String i;
    @SerializedName("targetEsn")
    private final String j;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1784aOc) {
            C1784aOc c1784aOc = (C1784aOc) obj;
            return this.c == c1784aOc.c && C8632dsu.c((Object) this.j, (Object) c1784aOc.j) && C8632dsu.c(this.b, c1784aOc.b);
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.c) * 31) + this.j.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        int i = this.c;
        String str = this.j;
        JsonObject jsonObject = this.b;
        return "PauseRequest(msgId=" + i + ", targetEsn=" + str + ", payload=" + jsonObject + ")";
    }

    public C1784aOc(int i, String str, JsonObject jsonObject) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) jsonObject, "");
        this.c = i;
        this.j = str;
        this.b = jsonObject;
        this.d = "deviceToDevice";
        this.i = "pause";
        this.a = "mobileCompanion";
        this.e = "mobileCompanion";
    }

    public final String c() {
        String json = C8118deO.a().toJson(this);
        C8632dsu.a(json, "");
        return json;
    }
}
