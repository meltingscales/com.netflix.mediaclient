package o;

import com.netflix.android.org.json.zip.JSONzip;

/* loaded from: classes3.dex */
public final class VN {
    private final String a;
    private final String b;
    private final boolean c;
    private final String d;
    private final String e;
    private final String g;
    private final String h;
    private final String i;
    private final String j;

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.i;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VN) {
            VN vn = (VN) obj;
            return C8632dsu.c((Object) this.h, (Object) vn.h) && C8632dsu.c((Object) this.e, (Object) vn.e) && C8632dsu.c((Object) this.d, (Object) vn.d) && C8632dsu.c((Object) this.j, (Object) vn.j) && C8632dsu.c((Object) this.i, (Object) vn.i) && this.c == vn.c && C8632dsu.c((Object) this.b, (Object) vn.b) && C8632dsu.c((Object) this.g, (Object) vn.g) && C8632dsu.c((Object) this.a, (Object) vn.a);
        }
        return false;
    }

    public final String f() {
        return this.h;
    }

    public final boolean g() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = this.h.hashCode();
        int hashCode2 = this.e.hashCode();
        String str = this.d;
        int hashCode3 = str == null ? 0 : str.hashCode();
        int hashCode4 = this.j.hashCode();
        String str2 = this.i;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        int hashCode6 = Boolean.hashCode(this.c);
        int hashCode7 = this.b.hashCode();
        String str3 = this.g;
        int hashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.a;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final String i() {
        return this.g;
    }

    public final String j() {
        return this.j;
    }

    public String toString() {
        String str = this.h;
        String str2 = this.e;
        String str3 = this.d;
        String str4 = this.j;
        String str5 = this.i;
        boolean z = this.c;
        String str6 = this.b;
        String str7 = this.g;
        String str8 = this.a;
        return "CurrentProfileData(profileName=" + str + ", deviceId=" + str2 + ", deviceName=" + str3 + ", profileGuid=" + str4 + ", profileAvatarUrl=" + str5 + ", isMobile=" + z + ", networkId=" + str6 + ", vuiToken=" + str7 + ", address=" + str8 + ")";
    }

    public VN(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str4, "");
        C8632dsu.c((Object) str6, "");
        this.h = str;
        this.e = str2;
        this.d = str3;
        this.j = str4;
        this.i = str5;
        this.c = z;
        this.b = str6;
        this.g = str7;
        this.a = str8;
    }

    public /* synthetic */ VN(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, int i, C8627dsp c8627dsp) {
        this(str, str2, (i & 4) != 0 ? null : str3, str4, str5, z, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? null : str7, (i & JSONzip.end) != 0 ? null : str8);
    }
}
