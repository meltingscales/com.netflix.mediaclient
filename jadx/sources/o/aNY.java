package o;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes3.dex */
public final class aNY {
    @SerializedName("senderApp")
    private final String a;
    @SerializedName("payload")
    private final JsonObject b;
    @SerializedName("category")
    private final String c;
    @SerializedName("msgId")
    private final int d;
    @SerializedName("subType")
    private final String e;
    @SerializedName("type")
    private final String f;
    @SerializedName("targetEsn")
    private final String j;

    public aNY(int i, String str, JsonObject jsonObject) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) jsonObject, "");
        this.d = i;
        this.j = str;
        this.b = jsonObject;
        this.c = "deviceToDevice";
        this.f = "PlaybackAction";
        this.e = "mobileCompanion";
        this.a = "mobileCompanion";
    }

    public final String b() {
        String json = C8118deO.a().toJson(this);
        C8632dsu.a(json, "");
        return json;
    }
}
