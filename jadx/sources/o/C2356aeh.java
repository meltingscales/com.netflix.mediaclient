package o;

/* renamed from: o.aeh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2356aeh implements InterfaceC9037hy {
    private final String a;
    private final C2412afk b;
    private final C2295adZ c;
    private final C2287adR d;
    private final C2289adT e;
    private final String f;
    private final c g;
    private final Boolean h;
    private final e i;
    private final Boolean j;
    private final C2630ajh m;

    public final C2287adR a() {
        return this.d;
    }

    public final C2295adZ b() {
        return this.c;
    }

    public final e c() {
        return this.i;
    }

    public final C2412afk d() {
        return this.b;
    }

    public final C2289adT e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2356aeh) {
            C2356aeh c2356aeh = (C2356aeh) obj;
            return C8632dsu.c((Object) this.a, (Object) c2356aeh.a) && C8632dsu.c(this.j, c2356aeh.j) && C8632dsu.c((Object) this.f, (Object) c2356aeh.f) && C8632dsu.c(this.i, c2356aeh.i) && C8632dsu.c(this.h, c2356aeh.h) && C8632dsu.c(this.g, c2356aeh.g) && C8632dsu.c(this.m, c2356aeh.m) && C8632dsu.c(this.d, c2356aeh.d) && C8632dsu.c(this.c, c2356aeh.c) && C8632dsu.c(this.e, c2356aeh.e) && C8632dsu.c(this.b, c2356aeh.b);
        }
        return false;
    }

    public final String f() {
        return this.a;
    }

    public final C2630ajh g() {
        return this.m;
    }

    public final String h() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        Boolean bool = this.j;
        int hashCode2 = bool == null ? 0 : bool.hashCode();
        String str = this.f;
        int hashCode3 = str == null ? 0 : str.hashCode();
        e eVar = this.i;
        int hashCode4 = eVar == null ? 0 : eVar.hashCode();
        Boolean bool2 = this.h;
        int hashCode5 = bool2 == null ? 0 : bool2.hashCode();
        c cVar = this.g;
        int hashCode6 = cVar == null ? 0 : cVar.hashCode();
        int hashCode7 = this.m.hashCode();
        int hashCode8 = this.d.hashCode();
        C2295adZ c2295adZ = this.c;
        int hashCode9 = c2295adZ == null ? 0 : c2295adZ.hashCode();
        C2289adT c2289adT = this.e;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (c2289adT != null ? c2289adT.hashCode() : 0)) * 31) + this.b.hashCode();
    }

    public final c i() {
        return this.g;
    }

    public final Boolean j() {
        return this.j;
    }

    public final Boolean l() {
        return this.h;
    }

    public String toString() {
        String str = this.a;
        Boolean bool = this.j;
        String str2 = this.f;
        e eVar = this.i;
        Boolean bool2 = this.h;
        c cVar = this.g;
        C2630ajh c2630ajh = this.m;
        C2287adR c2287adR = this.d;
        C2295adZ c2295adZ = this.c;
        C2289adT c2289adT = this.e;
        C2412afk c2412afk = this.b;
        return "EpisodeBasicInfo(__typename=" + str + ", isAvailable=" + bool + ", synopsis=" + str2 + ", interestingSmallArtwork=" + eVar + ", isEpisodeNumberHidden=" + bool2 + ", onEpisode=" + cVar + ", videoSummary=" + c2630ajh + ", detailsContextualSynopsis=" + c2287adR + ", detailsViewable=" + c2295adZ + ", detailsProtected=" + c2289adT + ", interactiveVideo=" + c2412afk + ")";
    }

    public C2356aeh(String str, Boolean bool, String str2, e eVar, Boolean bool2, c cVar, C2630ajh c2630ajh, C2287adR c2287adR, C2295adZ c2295adZ, C2289adT c2289adT, C2412afk c2412afk) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2630ajh, "");
        C8632dsu.c((Object) c2287adR, "");
        C8632dsu.c((Object) c2412afk, "");
        this.a = str;
        this.j = bool;
        this.f = str2;
        this.i = eVar;
        this.h = bool2;
        this.g = cVar;
        this.m = c2630ajh;
        this.d = c2287adR;
        this.c = c2295adZ;
        this.e = c2289adT;
        this.b = c2412afk;
    }

    /* renamed from: o.aeh$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String b;
        private final String c;

        public final String a() {
            return this.c;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c((Object) this.b, (Object) eVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.b;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.c;
            String str2 = this.b;
            return "InterestingSmallArtwork(__typename=" + str + ", url=" + str2 + ")";
        }

        public e(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.b = str2;
        }
    }

    /* renamed from: o.aeh$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final Boolean a;
        private final String b;
        private final Integer d;

        public final Boolean a() {
            return this.a;
        }

        public final Integer c() {
            return this.d;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c(this.d, cVar.d) && C8632dsu.c(this.a, cVar.a);
            }
            return false;
        }

        public int hashCode() {
            String str = this.b;
            int hashCode = str == null ? 0 : str.hashCode();
            Integer num = this.d;
            int hashCode2 = num == null ? 0 : num.hashCode();
            Boolean bool = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            Integer num = this.d;
            Boolean bool = this.a;
            return "OnEpisode(availabilityDateMessaging=" + str + ", number=" + num + ", displayNewBadge=" + bool + ")";
        }

        public c(String str, Integer num, Boolean bool) {
            this.b = str;
            this.d = num;
            this.a = bool;
        }
    }
}
