package o;

import j$.time.Instant;

/* renamed from: o.ahd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2520ahd implements InterfaceC9037hy {
    private final String a;
    private final String b;
    private final Instant c;
    private final Instant d;
    private final int e;
    private final String h;

    public final int a() {
        return this.e;
    }

    public final String b() {
        return this.h;
    }

    public final Instant c() {
        return this.c;
    }

    public final Instant d() {
        return this.d;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2520ahd) {
            C2520ahd c2520ahd = (C2520ahd) obj;
            return C8632dsu.c((Object) this.a, (Object) c2520ahd.a) && C8632dsu.c(this.c, c2520ahd.c) && C8632dsu.c(this.d, c2520ahd.d) && this.e == c2520ahd.e && C8632dsu.c((Object) this.b, (Object) c2520ahd.b) && C8632dsu.c((Object) this.h, (Object) c2520ahd.h);
        }
        return false;
    }

    public final String f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        Instant instant = this.c;
        int hashCode2 = instant == null ? 0 : instant.hashCode();
        Instant instant2 = this.d;
        int hashCode3 = instant2 == null ? 0 : instant2.hashCode();
        int hashCode4 = Integer.hashCode(this.e);
        int hashCode5 = this.b.hashCode();
        String str = this.h;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.a;
        Instant instant = this.c;
        Instant instant2 = this.d;
        int i = this.e;
        String str2 = this.b;
        String str3 = this.h;
        return "LolomoSummary(__typename=" + str + ", expires=" + instant + ", createTime=" + instant2 + ", size=" + i + ", lolomoId=" + str2 + ", title=" + str3 + ")";
    }

    public C2520ahd(String str, Instant instant, Instant instant2, int i, String str2, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.a = str;
        this.c = instant;
        this.d = instant2;
        this.e = i;
        this.b = str2;
        this.h = str3;
    }
}
