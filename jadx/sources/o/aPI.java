package o;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes3.dex */
public final class aPI {
    @SerializedName("sampleTime")
    private final long b;
    @SerializedName("base64KeyRequest")
    private final String c;
    @SerializedName("oxid")
    private final String d;
    @SerializedName("playableId")
    private final String e;

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aPI) {
            aPI api = (aPI) obj;
            return C8632dsu.c((Object) this.e, (Object) api.e) && C8632dsu.c((Object) this.d, (Object) api.d) && this.b == api.b && C8632dsu.c((Object) this.c, (Object) api.c);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.e.hashCode() * 31) + this.d.hashCode()) * 31) + Long.hashCode(this.b)) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.e;
        String str2 = this.d;
        long j = this.b;
        String str3 = this.c;
        return "KeyRequestDataHolder(playableId=" + str + ", oxid=" + str2 + ", sampleTime=" + j + ", base64KeyRequest=" + str3 + ")";
    }

    public aPI(String str, String str2, long j, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        this.e = str;
        this.d = str2;
        this.b = j;
        this.c = str3;
    }

    public final boolean b() {
        return C8175dfS.b(7, this.b);
    }
}
