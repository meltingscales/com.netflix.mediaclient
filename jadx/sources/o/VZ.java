package o;

/* loaded from: classes3.dex */
public final class VZ {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String g;

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VZ) {
            VZ vz = (VZ) obj;
            return C8632dsu.c((Object) this.e, (Object) vz.e) && C8632dsu.c((Object) this.a, (Object) vz.a) && C8632dsu.c((Object) this.g, (Object) vz.g) && C8632dsu.c((Object) this.c, (Object) vz.c) && C8632dsu.c((Object) this.d, (Object) vz.d) && C8632dsu.c((Object) this.b, (Object) vz.b);
        }
        return false;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        String str = this.a;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.g;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.c;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.b.hashCode();
    }

    public final String j() {
        return this.b;
    }

    public String toString() {
        String str = this.e;
        String str2 = this.a;
        String str3 = this.g;
        String str4 = this.c;
        String str5 = this.d;
        String str6 = this.b;
        return "TargetDeviceData(id=" + str + ", friendlyName=" + str2 + ", vuiToken=" + str3 + ", address=" + str4 + ", profileGuid=" + str5 + ", networkId=" + str6 + ")";
    }

    public VZ(String str, String str2, String str3, String str4, String str5, String str6) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str5, "");
        C8632dsu.c((Object) str6, "");
        this.e = str;
        this.a = str2;
        this.g = str3;
        this.c = str4;
        this.d = str5;
        this.b = str6;
    }

    public /* synthetic */ VZ(String str, String str2, String str3, String str4, String str5, String str6, int i, C8627dsp c8627dsp) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
