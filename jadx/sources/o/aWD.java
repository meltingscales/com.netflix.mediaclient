package o;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes3.dex */
public final class aWD {
    @SerializedName("category")
    private final String a;
    @SerializedName("targetAddr")
    private final String b;
    @SerializedName("ts")
    private final String c;
    @SerializedName("msgId")
    private final int d;
    @SerializedName("challengeResp")
    private final String e;
    @SerializedName("type")
    private final String i;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aWD) {
            aWD awd = (aWD) obj;
            return this.d == awd.d && C8632dsu.c((Object) this.e, (Object) awd.e) && C8632dsu.c((Object) this.c, (Object) awd.c) && C8632dsu.c((Object) this.b, (Object) awd.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.d);
        String str = this.e;
        return (((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        int i = this.d;
        String str = this.e;
        String str2 = this.c;
        String str3 = this.b;
        return "DdrZuulChallengeResponse(msgId=" + i + ", challengeResp=" + str + ", ts=" + str2 + ", targetAddr=" + str3 + ")";
    }

    public aWD(int i, String str, String str2, String str3) {
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        this.d = i;
        this.e = str;
        this.c = str2;
        this.b = str3;
        this.i = "challengeResp";
        this.a = "zuulDDRMsg";
    }

    public final String e() {
        String json = C8118deO.a().toJson(this);
        C8632dsu.a(json, "");
        return json;
    }
}
