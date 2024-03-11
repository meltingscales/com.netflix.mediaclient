package o;

import j$.time.Instant;

/* renamed from: o.ajh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2630ajh implements InterfaceC9037hy {
    private final Boolean a;
    private final String b;
    private final Boolean c;
    private final Instant d;
    private final Boolean e;
    private final int f;
    private final Boolean g;
    private final String h;
    private final String i;

    public final Instant a() {
        return this.d;
    }

    public final String b() {
        return this.h;
    }

    public final String c() {
        return this.i;
    }

    public final Boolean d() {
        return this.a;
    }

    public final int e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2630ajh) {
            C2630ajh c2630ajh = (C2630ajh) obj;
            return C8632dsu.c((Object) this.b, (Object) c2630ajh.b) && this.f == c2630ajh.f && C8632dsu.c((Object) this.h, (Object) c2630ajh.h) && C8632dsu.c((Object) this.i, (Object) c2630ajh.i) && C8632dsu.c(this.a, c2630ajh.a) && C8632dsu.c(this.e, c2630ajh.e) && C8632dsu.c(this.c, c2630ajh.c) && C8632dsu.c(this.d, c2630ajh.d) && C8632dsu.c(this.g, c2630ajh.g);
        }
        return false;
    }

    public final Boolean f() {
        return this.c;
    }

    public final Boolean g() {
        return this.g;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = Integer.hashCode(this.f);
        int hashCode3 = this.h.hashCode();
        String str = this.i;
        int hashCode4 = str == null ? 0 : str.hashCode();
        Boolean bool = this.a;
        int hashCode5 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.e;
        int hashCode6 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.c;
        int hashCode7 = bool3 == null ? 0 : bool3.hashCode();
        Instant instant = this.d;
        int hashCode8 = instant == null ? 0 : instant.hashCode();
        Boolean bool4 = this.g;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final Boolean i() {
        return this.e;
    }

    public String toString() {
        String str = this.b;
        int i = this.f;
        String str2 = this.h;
        String str3 = this.i;
        Boolean bool = this.a;
        Boolean bool2 = this.e;
        Boolean bool3 = this.c;
        Instant instant = this.d;
        Boolean bool4 = this.g;
        return "VideoSummary(__typename=" + str + ", videoId=" + i + ", unifiedEntityId=" + str2 + ", title=" + str3 + ", hasOriginalTreatment=" + bool + ", isAvailable=" + bool2 + ", isAvailableForDownload=" + bool3 + ", availabilityStartTime=" + instant + ", isPlayable=" + bool4 + ")";
    }

    public C2630ajh(String str, int i, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, Instant instant, Boolean bool4) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.b = str;
        this.f = i;
        this.h = str2;
        this.i = str3;
        this.a = bool;
        this.e = bool2;
        this.c = bool3;
        this.d = instant;
        this.g = bool4;
    }
}
