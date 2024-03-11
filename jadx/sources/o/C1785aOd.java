package o;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

/* renamed from: o.aOd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1785aOd {
    @SerializedName("msgId")
    private final int a;
    @SerializedName("subType")
    private final String b;
    @SerializedName("category")
    private final String c;
    @SerializedName("payload")
    private final JsonObject d;
    @SerializedName("senderApp")
    private final String e;
    @SerializedName("type")
    private final String f;
    @SerializedName("targetEsn")
    private final String h;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1785aOd) {
            C1785aOd c1785aOd = (C1785aOd) obj;
            return this.a == c1785aOd.a && C8632dsu.c((Object) this.h, (Object) c1785aOd.h) && C8632dsu.c(this.d, c1785aOd.d);
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.a) * 31) + this.h.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        int i = this.a;
        String str = this.h;
        JsonObject jsonObject = this.d;
        return "Navigation(msgId=" + i + ", targetEsn=" + str + ", command=" + jsonObject + ")";
    }

    public C1785aOd(int i, String str, JsonObject jsonObject) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) jsonObject, "");
        this.a = i;
        this.h = str;
        this.d = jsonObject;
        this.f = "navigation";
        this.b = "mobileCompanion";
        this.c = "deviceToDevice";
        this.e = "mobileCompanion";
    }

    public final String a() {
        String json = C8118deO.a().toJson(this);
        C8632dsu.a(json, "");
        return json;
    }
}
