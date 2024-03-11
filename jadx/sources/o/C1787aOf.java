package o;

import com.google.gson.annotations.SerializedName;
import org.json.JSONObject;

/* renamed from: o.aOf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1787aOf {
    @SerializedName("category")
    private final String a;
    @SerializedName("subType")
    private final String b;
    @SerializedName("targetEsn")
    private final String c;
    @SerializedName("msgId")
    private final int d;
    @SerializedName("senderApp")
    private final String e;
    @SerializedName("type")
    private final String h;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1787aOf) {
            C1787aOf c1787aOf = (C1787aOf) obj;
            return this.d == c1787aOf.d && C8632dsu.c((Object) this.c, (Object) c1787aOf.c);
        }
        return false;
    }

    public int hashCode() {
        return (Integer.hashCode(this.d) * 31) + this.c.hashCode();
    }

    public String toString() {
        int i = this.d;
        String str = this.c;
        return "PingRequest(msgId=" + i + ", targetEsn=" + str + ")";
    }

    public C1787aOf(int i, String str) {
        C8632dsu.c((Object) str, "");
        this.d = i;
        this.c = str;
        this.h = "ping";
        this.b = "mobileCompanion";
        this.a = "deviceToDevice";
        this.e = "mobileCompanion";
    }

    public final String e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msgId", this.d);
        jSONObject.put("targetEsn", this.c);
        jSONObject.put("type", this.h);
        jSONObject.put("subType", this.b);
        jSONObject.put("senderApp", this.e);
        jSONObject.put("category", this.a);
        String jSONObject2 = jSONObject.toString();
        C8632dsu.a(jSONObject2, "");
        return jSONObject2;
    }
}
