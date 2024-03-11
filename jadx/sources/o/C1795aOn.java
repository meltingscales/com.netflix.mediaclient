package o;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

/* renamed from: o.aOn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1795aOn {
    @SerializedName("senderApp")
    private final String a;
    @SerializedName("payload")
    private final JsonObject b;
    @SerializedName("msgId")
    private final int c;
    @SerializedName("subType")
    private final String d;
    @SerializedName("category")
    private final String e;
    @SerializedName("type")
    private final String g;
    @SerializedName("targetEsn")
    private final String j;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1795aOn) {
            C1795aOn c1795aOn = (C1795aOn) obj;
            return this.c == c1795aOn.c && C8632dsu.c((Object) this.j, (Object) c1795aOn.j) && C8632dsu.c(this.b, c1795aOn.b);
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
        return "ToggleTimedTextTrackRequest(msgId=" + i + ", targetEsn=" + str + ", payload=" + jsonObject + ")";
    }

    public C1795aOn(int i, String str, JsonObject jsonObject) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) jsonObject, "");
        this.c = i;
        this.j = str;
        this.b = jsonObject;
        this.e = "deviceToDevice";
        this.g = "toggleTimedTextTrack";
        this.d = "mobileCompanion";
        this.a = "mobileCompanion";
    }

    public final String a() {
        String json = C8118deO.a().toJson(this);
        C8632dsu.a(json, "");
        return json;
    }
}
