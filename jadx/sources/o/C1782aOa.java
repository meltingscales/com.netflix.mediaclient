package o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.aOa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1782aOa {
    @SerializedName("msgId")
    private final int a;
    @SerializedName("type")
    private final String e = "deviceListSubscribe";
    @SerializedName("category")
    private final String c = "zuulDDRMsg";

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1782aOa) && this.a == ((C1782aOa) obj).a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        int i = this.a;
        return "DeviceListSubscribe(msgId=" + i + ")";
    }

    public C1782aOa(int i) {
        this.a = i;
    }

    public final String a() {
        String json = C8118deO.a().toJson(this);
        C8632dsu.a(json, "");
        return json;
    }
}
