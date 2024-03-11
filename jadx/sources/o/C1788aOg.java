package o;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

/* renamed from: o.aOg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1788aOg {
    @SerializedName("subType")
    private final String a;
    @SerializedName("payload")
    private final JsonObject b;
    @SerializedName("senderApp")
    private final String c;
    @SerializedName("category")
    private final String d;
    @SerializedName("msgId")
    private final int e;
    @SerializedName("type")
    private final String g;
    @SerializedName("targetEsn")
    private final String h;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1788aOg) {
            C1788aOg c1788aOg = (C1788aOg) obj;
            return this.e == c1788aOg.e && C8632dsu.c((Object) this.h, (Object) c1788aOg.h) && C8632dsu.c(this.b, c1788aOg.b);
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.e) * 31) + this.h.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        int i = this.e;
        String str = this.h;
        JsonObject jsonObject = this.b;
        return "SetTracksRequest(msgId=" + i + ", targetEsn=" + str + ", payload=" + jsonObject + ")";
    }

    public C1788aOg(int i, String str, JsonObject jsonObject) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) jsonObject, "");
        this.e = i;
        this.h = str;
        this.b = jsonObject;
        this.d = "deviceToDevice";
        this.g = "setTracks";
        this.a = "mobileCompanion";
        this.c = "mobileCompanion";
    }

    public final String b() {
        String json = C8118deO.a().toJson(this);
        C8632dsu.a(json, "");
        return json;
    }
}
