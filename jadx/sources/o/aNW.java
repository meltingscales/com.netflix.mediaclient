package o;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes3.dex */
public final class aNW {
    @SerializedName("msgId")
    private final int a;
    @SerializedName("type")
    private final String d = "deviceListRequest";
    @SerializedName("category")
    private final String e = "zuulDDRMsg";

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aNW) && this.a == ((aNW) obj).a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        int i = this.a;
        return "DeviceListRequest(msgId=" + i + ")";
    }

    public aNW(int i) {
        this.a = i;
    }

    public final String a() {
        String json = C8118deO.a().toJson(this);
        C8632dsu.a(json, "");
        return json;
    }
}
