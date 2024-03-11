package o;

import com.netflix.android.org.json.zip.JSONzip;

/* renamed from: o.We  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1295We {
    private final boolean a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final Boolean g;
    private final String h;
    private final boolean i;
    private final String j;

    public final boolean a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.j;
    }

    public final String d() {
        return this.h;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1295We) {
            C1295We c1295We = (C1295We) obj;
            return C8632dsu.c((Object) this.d, (Object) c1295We.d) && C8632dsu.c((Object) this.h, (Object) c1295We.h) && C8632dsu.c((Object) this.c, (Object) c1295We.c) && C8632dsu.c(this.g, c1295We.g) && C8632dsu.c((Object) this.e, (Object) c1295We.e) && C8632dsu.c((Object) this.b, (Object) c1295We.b) && C8632dsu.c((Object) this.j, (Object) c1295We.j) && this.i == c1295We.i && this.a == c1295We.a;
        }
        return false;
    }

    public final boolean g() {
        return this.i;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        int hashCode2 = this.h.hashCode();
        int hashCode3 = this.c.hashCode();
        Boolean bool = this.g;
        int hashCode4 = bool == null ? 0 : bool.hashCode();
        String str = this.e;
        int hashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int hashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.j;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.i)) * 31) + Boolean.hashCode(this.a);
    }

    public final Boolean j() {
        return this.g;
    }

    public String toString() {
        String str = this.d;
        String str2 = this.h;
        String str3 = this.c;
        Boolean bool = this.g;
        String str4 = this.e;
        String str5 = this.b;
        String str6 = this.j;
        boolean z = this.i;
        boolean z2 = this.a;
        return "VideoMetadata(id=" + str + ", title=" + str2 + ", horizontalArtUrl=" + str3 + ", isStandAlone=" + bool + ", bifUrl=" + str4 + ", childTitle=" + str5 + ", parentTitle=" + str6 + ", isLive=" + z + ", isInteractive=" + z2 + ")";
    }

    public C1295We(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, boolean z, boolean z2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        this.d = str;
        this.h = str2;
        this.c = str3;
        this.g = bool;
        this.e = str4;
        this.b = str5;
        this.j = str6;
        this.i = z;
        this.a = z2;
    }

    public /* synthetic */ C1295We(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, boolean z, boolean z2, int i, C8627dsp c8627dsp) {
        this(str, str2, str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? false : z, (i & JSONzip.end) != 0 ? false : z2);
    }
}
