package o;

/* renamed from: o.aeo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2363aeo implements InterfaceC9037hy {
    private final String a;
    private final C2287adR b;
    private final String c;
    private final Boolean d;
    private final Boolean e;
    private final Integer f;
    private final e g;
    private final C2579aij h;
    private final int j;

    public final e a() {
        return this.g;
    }

    public final String b() {
        return this.c;
    }

    public final Boolean c() {
        return this.d;
    }

    public final C2287adR d() {
        return this.b;
    }

    public final Boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2363aeo) {
            C2363aeo c2363aeo = (C2363aeo) obj;
            return C8632dsu.c((Object) this.a, (Object) c2363aeo.a) && this.j == c2363aeo.j && C8632dsu.c(this.f, c2363aeo.f) && C8632dsu.c(this.d, c2363aeo.d) && C8632dsu.c(this.e, c2363aeo.e) && C8632dsu.c((Object) this.c, (Object) c2363aeo.c) && C8632dsu.c(this.g, c2363aeo.g) && C8632dsu.c(this.b, c2363aeo.b) && C8632dsu.c(this.h, c2363aeo.h);
        }
        return false;
    }

    public final Integer f() {
        return this.f;
    }

    public final C2579aij h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = Integer.hashCode(this.j);
        Integer num = this.f;
        int hashCode3 = num == null ? 0 : num.hashCode();
        Boolean bool = this.d;
        int hashCode4 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.e;
        int hashCode5 = bool2 == null ? 0 : bool2.hashCode();
        String str = this.c;
        int hashCode6 = str == null ? 0 : str.hashCode();
        e eVar = this.g;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.b.hashCode()) * 31) + this.h.hashCode();
    }

    public final String i() {
        return this.a;
    }

    public final int j() {
        return this.j;
    }

    public String toString() {
        String str = this.a;
        int i = this.j;
        Integer num = this.f;
        Boolean bool = this.d;
        Boolean bool2 = this.e;
        String str2 = this.c;
        e eVar = this.g;
        C2287adR c2287adR = this.b;
        C2579aij c2579aij = this.h;
        return "EpisodeInfo(__typename=" + str + ", videoId=" + i + ", number=" + num + ", hasTitleBehavior=" + bool + ", displayNewBadge=" + bool2 + ", availabilityDateMessaging=" + str2 + ", interestingArtworkSmall=" + eVar + ", detailsContextualSynopsis=" + c2287adR + ", playerUIBasicInfo=" + c2579aij + ")";
    }

    public C2363aeo(String str, int i, Integer num, Boolean bool, Boolean bool2, String str2, e eVar, C2287adR c2287adR, C2579aij c2579aij) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2287adR, "");
        C8632dsu.c((Object) c2579aij, "");
        this.a = str;
        this.j = i;
        this.f = num;
        this.d = bool;
        this.e = bool2;
        this.c = str2;
        this.g = eVar;
        this.b = c2287adR;
        this.h = c2579aij;
    }

    /* renamed from: o.aeo$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String b;
        private final String e;

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && C8632dsu.c((Object) this.e, (Object) eVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.e;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.b;
            String str2 = this.e;
            return "InterestingArtworkSmall(__typename=" + str + ", url=" + str2 + ")";
        }

        public e(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = str2;
        }
    }
}
