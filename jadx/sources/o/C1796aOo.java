package o;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

/* renamed from: o.aOo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1796aOo {
    @SerializedName("payload")
    private final JsonObject a;
    @SerializedName("senderApp")
    private final String b;
    @SerializedName("msgId")
    private final int c;
    @SerializedName("subType")
    private final String d;
    @SerializedName("category")
    private final String e;
    @SerializedName("targetEsn")
    private final String i;
    @SerializedName("type")
    private final String j;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1796aOo) {
            C1796aOo c1796aOo = (C1796aOo) obj;
            return this.c == c1796aOo.c && C8632dsu.c((Object) this.i, (Object) c1796aOo.i) && C8632dsu.c(this.a, c1796aOo.a);
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.c) * 31) + this.i.hashCode()) * 31) + this.a.hashCode();
    }

    public String toString() {
        int i = this.c;
        String str = this.i;
        JsonObject jsonObject = this.a;
        return "TrackListRequest(msgId=" + i + ", targetEsn=" + str + ", payload=" + jsonObject + ")";
    }

    public C1796aOo(int i, String str, JsonObject jsonObject) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) jsonObject, "");
        this.c = i;
        this.i = str;
        this.a = jsonObject;
        this.e = "deviceToDevice";
        this.j = "getTrackList";
        this.d = "mobileCompanion";
        this.b = "mobileCompanion";
    }

    public final String a() {
        String json = C8118deO.a().toJson(this);
        C8632dsu.a(json, "");
        return json;
    }
}
