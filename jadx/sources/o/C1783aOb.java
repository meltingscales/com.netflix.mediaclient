package o;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

/* renamed from: o.aOb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1783aOb {
    @SerializedName("subType")
    private final String a;
    @SerializedName("msgId")
    private final int b;
    @SerializedName("senderApp")
    private final String c;
    @SerializedName("payload")
    private final JsonObject d;
    @SerializedName("category")
    private final String e;
    @SerializedName("targetEsn")
    private final String h;
    @SerializedName("type")
    private final String j;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1783aOb) {
            C1783aOb c1783aOb = (C1783aOb) obj;
            return this.b == c1783aOb.b && C8632dsu.c((Object) this.h, (Object) c1783aOb.h) && C8632dsu.c(this.d, c1783aOb.d);
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.b) * 31) + this.h.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        int i = this.b;
        String str = this.h;
        JsonObject jsonObject = this.d;
        return "PlayRequest(msgId=" + i + ", targetEsn=" + str + ", payload=" + jsonObject + ")";
    }

    public C1783aOb(int i, String str, JsonObject jsonObject) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) jsonObject, "");
        this.b = i;
        this.h = str;
        this.d = jsonObject;
        this.e = "deviceToDevice";
        this.j = "playback";
        this.a = "mobileCompanion";
        this.c = "mobileCompanion";
    }

    public final String d() {
        String json = C8118deO.a().toJson(this);
        C8632dsu.a(json, "");
        return json;
    }
}
