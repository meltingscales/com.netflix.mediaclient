package o;

/* renamed from: o.bwt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5341bwt {
    private final String a;
    private long b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private final String g;
    private final int h;
    private final int i;
    private final String j;

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.e;
    }

    public final long c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public final void e(long j) {
        this.b = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5341bwt) {
            C5341bwt c5341bwt = (C5341bwt) obj;
            return C8632dsu.c((Object) this.a, (Object) c5341bwt.a) && C8632dsu.c((Object) this.d, (Object) c5341bwt.d) && C8632dsu.c((Object) this.j, (Object) c5341bwt.j) && this.i == c5341bwt.i && this.f == c5341bwt.f && C8632dsu.c((Object) this.g, (Object) c5341bwt.g) && C8632dsu.c((Object) this.c, (Object) c5341bwt.c) && C8632dsu.c((Object) this.e, (Object) c5341bwt.e) && this.h == c5341bwt.h && this.b == c5341bwt.b;
        }
        return false;
    }

    public final int f() {
        return this.i;
    }

    public final int g() {
        return this.f;
    }

    public final String h() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.d.hashCode();
        int hashCode3 = this.j.hashCode();
        int hashCode4 = Integer.hashCode(this.i);
        int hashCode5 = Integer.hashCode(this.f);
        int hashCode6 = this.g.hashCode();
        String str = this.c;
        int hashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.e;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.h)) * 31) + Long.hashCode(this.b);
    }

    public final String i() {
        return this.g;
    }

    public final int j() {
        return this.h;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.d;
        String str3 = this.j;
        int i = this.i;
        int i2 = this.f;
        String str4 = this.g;
        String str5 = this.c;
        String str6 = this.e;
        int i3 = this.h;
        long j = this.b;
        return "UserMarkStoreEntity(markId=" + str + ", profileId=" + str2 + ", videoId=" + str3 + ", runtime=" + i + ", timestamp=" + i2 + ", title=" + str4 + ", parentTitle=" + str5 + ", imageUrl=" + str6 + ", videoType=" + i3 + ", position=" + j + ")";
    }

    public C5341bwt(String str, String str2, String str3, int i, int i2, String str4, String str5, String str6, int i3, long j) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        this.a = str;
        this.d = str2;
        this.j = str3;
        this.i = i;
        this.f = i2;
        this.g = str4;
        this.c = str5;
        this.e = str6;
        this.h = i3;
        this.b = j;
    }
}
