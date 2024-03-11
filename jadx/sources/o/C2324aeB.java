package o;

/* renamed from: o.aeB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2324aeB implements InterfaceC9037hy {
    private final Boolean a;
    private final String b;
    private final Boolean c;
    private final Boolean d;
    private final String e;
    private final C2635ajm f;
    private final String g;
    private final C2627aje h;
    private final int i;
    private final C2628ajf j;

    public final String a() {
        return this.e;
    }

    public final int b() {
        return this.i;
    }

    public final String c() {
        return this.g;
    }

    public final C2628ajf d() {
        return this.j;
    }

    public final Boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2324aeB) {
            C2324aeB c2324aeB = (C2324aeB) obj;
            return C8632dsu.c((Object) this.b, (Object) c2324aeB.b) && C8632dsu.c((Object) this.e, (Object) c2324aeB.e) && this.i == c2324aeB.i && C8632dsu.c(this.a, c2324aeB.a) && C8632dsu.c(this.d, c2324aeB.d) && C8632dsu.c((Object) this.g, (Object) c2324aeB.g) && C8632dsu.c(this.c, c2324aeB.c) && C8632dsu.c(this.h, c2324aeB.h) && C8632dsu.c(this.j, c2324aeB.j) && C8632dsu.c(this.f, c2324aeB.f);
        }
        return false;
    }

    public final String f() {
        return this.b;
    }

    public final Boolean g() {
        return this.c;
    }

    public final C2627aje h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        String str = this.e;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = Integer.hashCode(this.i);
        Boolean bool = this.a;
        int hashCode4 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.d;
        int hashCode5 = bool2 == null ? 0 : bool2.hashCode();
        int hashCode6 = this.g.hashCode();
        Boolean bool3 = this.c;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (bool3 != null ? bool3.hashCode() : 0)) * 31) + this.h.hashCode()) * 31) + this.j.hashCode()) * 31) + this.f.hashCode();
    }

    public final Boolean i() {
        return this.a;
    }

    public final C2635ajm j() {
        return this.f;
    }

    public String toString() {
        String str = this.b;
        String str2 = this.e;
        int i = this.i;
        Boolean bool = this.a;
        Boolean bool2 = this.d;
        String str3 = this.g;
        Boolean bool3 = this.c;
        C2627aje c2627aje = this.h;
        C2628ajf c2628ajf = this.j;
        C2635ajm c2635ajm = this.f;
        return "FeedVideoAncestorData(__typename=" + str + ", title=" + str2 + ", videoId=" + i + ", isPlayable=" + bool + ", hasOriginalTreatment=" + bool2 + ", unifiedEntityId=" + str3 + ", isInRemindMeList=" + bool3 + ", videoInQueue=" + c2627aje + ", videoCertificationRating=" + c2628ajf + ", videoTags=" + c2635ajm + ")";
    }

    public C2324aeB(String str, String str2, int i, Boolean bool, Boolean bool2, String str3, Boolean bool3, C2627aje c2627aje, C2628ajf c2628ajf, C2635ajm c2635ajm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) c2627aje, "");
        C8632dsu.c((Object) c2628ajf, "");
        C8632dsu.c((Object) c2635ajm, "");
        this.b = str;
        this.e = str2;
        this.i = i;
        this.a = bool;
        this.d = bool2;
        this.g = str3;
        this.c = bool3;
        this.h = c2627aje;
        this.j = c2628ajf;
        this.f = c2635ajm;
    }
}
