package o;

import j$.time.Instant;

/* renamed from: o.aiL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2555aiL implements InterfaceC9037hy {
    private final Boolean a;
    private final Instant b;
    private final Boolean c;
    private final String d;
    private final Boolean e;
    private final Boolean f;
    private final String h;
    private final String i;
    private final int j;

    public final Boolean a() {
        return this.e;
    }

    public final int b() {
        return this.j;
    }

    public final String c() {
        return this.h;
    }

    public final Instant d() {
        return this.b;
    }

    public final String e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2555aiL) {
            C2555aiL c2555aiL = (C2555aiL) obj;
            return C8632dsu.c((Object) this.d, (Object) c2555aiL.d) && this.j == c2555aiL.j && C8632dsu.c((Object) this.i, (Object) c2555aiL.i) && C8632dsu.c((Object) this.h, (Object) c2555aiL.h) && C8632dsu.c(this.e, c2555aiL.e) && C8632dsu.c(this.a, c2555aiL.a) && C8632dsu.c(this.c, c2555aiL.c) && C8632dsu.c(this.b, c2555aiL.b) && C8632dsu.c(this.f, c2555aiL.f);
        }
        return false;
    }

    public final Boolean f() {
        return this.c;
    }

    public final Boolean g() {
        return this.f;
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        int hashCode2 = Integer.hashCode(this.j);
        int hashCode3 = this.i.hashCode();
        String str = this.h;
        int hashCode4 = str == null ? 0 : str.hashCode();
        Boolean bool = this.e;
        int hashCode5 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.a;
        int hashCode6 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.c;
        int hashCode7 = bool3 == null ? 0 : bool3.hashCode();
        Instant instant = this.b;
        int hashCode8 = instant == null ? 0 : instant.hashCode();
        Boolean bool4 = this.f;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final Boolean i() {
        return this.a;
    }

    public String toString() {
        String str = this.d;
        int i = this.j;
        String str2 = this.i;
        String str3 = this.h;
        Boolean bool = this.e;
        Boolean bool2 = this.a;
        Boolean bool3 = this.c;
        Instant instant = this.b;
        Boolean bool4 = this.f;
        return "ShowSummary(__typename=" + str + ", videoId=" + i + ", unifiedEntityId=" + str2 + ", title=" + str3 + ", hasOriginalTreatment=" + bool + ", isAvailable=" + bool2 + ", isAvailableForDownload=" + bool3 + ", availabilityStartTime=" + instant + ", isPlayable=" + bool4 + ")";
    }

    public C2555aiL(String str, int i, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, Instant instant, Boolean bool4) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.d = str;
        this.j = i;
        this.i = str2;
        this.h = str3;
        this.e = bool;
        this.a = bool2;
        this.c = bool3;
        this.b = instant;
        this.f = bool4;
    }
}
