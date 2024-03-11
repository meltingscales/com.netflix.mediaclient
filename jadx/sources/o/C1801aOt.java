package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* renamed from: o.aOt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1801aOt {
    @SerializedName(SignupConstants.Field.LANG_ID)
    private final String a;
    @SerializedName("networkId")
    private String b;
    @SerializedName("profileGuid")
    private String c;
    @SerializedName("controllerNetworkId")
    private String d;
    @SerializedName("timestamp")
    private long e;

    public final void a(String str) {
        C8632dsu.c((Object) str, "");
        this.b = str;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final void c(String str) {
        C8632dsu.c((Object) str, "");
        this.c = str;
    }

    public final void d(long j) {
        this.e = j;
    }

    public final String e() {
        return this.c;
    }

    public final void e(String str) {
        C8632dsu.c((Object) str, "");
        this.d = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1801aOt) {
            C1801aOt c1801aOt = (C1801aOt) obj;
            return C8632dsu.c((Object) this.a, (Object) c1801aOt.a) && C8632dsu.c((Object) this.c, (Object) c1801aOt.c) && C8632dsu.c((Object) this.b, (Object) c1801aOt.b) && this.e == c1801aOt.e && C8632dsu.c((Object) this.d, (Object) c1801aOt.d);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.b.hashCode()) * 31) + Long.hashCode(this.e)) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.c;
        String str3 = this.b;
        long j = this.e;
        String str4 = this.d;
        return "PairingHistorySession(id=" + str + ", profileGuid=" + str2 + ", networkId=" + str3 + ", timestamp=" + j + ", controllerNetworkId=" + str4 + ")";
    }

    public C1801aOt(String str, String str2, String str3, long j, String str4) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        this.a = str;
        this.c = str2;
        this.b = str3;
        this.e = j;
        this.d = str4;
    }
}
