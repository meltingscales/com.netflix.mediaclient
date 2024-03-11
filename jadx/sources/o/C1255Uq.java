package o;

import com.netflix.mediaclient.cdx.api.DeviceType;

/* renamed from: o.Uq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1255Uq {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String g;
    private final boolean h;
    private final DeviceType j;

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1255Uq) {
            C1255Uq c1255Uq = (C1255Uq) obj;
            return C8632dsu.c((Object) this.a, (Object) c1255Uq.a) && C8632dsu.c((Object) this.d, (Object) c1255Uq.d) && C8632dsu.c((Object) this.g, (Object) c1255Uq.g) && C8632dsu.c((Object) this.c, (Object) c1255Uq.c) && this.j == c1255Uq.j && C8632dsu.c((Object) this.b, (Object) c1255Uq.b) && C8632dsu.c((Object) this.e, (Object) c1255Uq.e) && this.h == c1255Uq.h;
        }
        return false;
    }

    public final boolean g() {
        return this.h;
    }

    public final String h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        String str = this.d;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.g;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.c;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.j.hashCode()) * 31) + this.b.hashCode()) * 31) + this.e.hashCode()) * 31) + Boolean.hashCode(this.h);
    }

    public final DeviceType j() {
        return this.j;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.d;
        String str3 = this.g;
        String str4 = this.c;
        DeviceType deviceType = this.j;
        String str5 = this.b;
        String str6 = this.e;
        boolean z = this.h;
        return "Device(id=" + str + ", friendlyName=" + str2 + ", vuiToken=" + str3 + ", address=" + str4 + ", type=" + deviceType + ", profileGuid=" + str5 + ", networkId=" + str6 + ", supportsCompanionMode=" + z + ")";
    }

    public C1255Uq(String str, String str2, String str3, String str4, DeviceType deviceType, String str5, String str6, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) deviceType, "");
        C8632dsu.c((Object) str5, "");
        C8632dsu.c((Object) str6, "");
        this.a = str;
        this.d = str2;
        this.g = str3;
        this.c = str4;
        this.j = deviceType;
        this.b = str5;
        this.e = str6;
        this.h = z;
    }

    public /* synthetic */ C1255Uq(String str, String str2, String str3, String str4, DeviceType deviceType, String str5, String str6, boolean z, int i, C8627dsp c8627dsp) {
        this(str, str2, str3, str4, deviceType, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? true : z);
    }
}
