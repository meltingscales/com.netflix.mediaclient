package o;

import java.util.List;

/* renamed from: o.aeF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2328aeF implements InterfaceC9037hy {
    private final d b;
    private final Integer c;
    private final List<b> d;
    private final String e;

    public final List<b> a() {
        return this.d;
    }

    public final Integer b() {
        return this.c;
    }

    public final d c() {
        return this.b;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2328aeF) {
            C2328aeF c2328aeF = (C2328aeF) obj;
            return C8632dsu.c((Object) this.e, (Object) c2328aeF.e) && C8632dsu.c(this.c, c2328aeF.c) && C8632dsu.c(this.b, c2328aeF.b) && C8632dsu.c(this.d, c2328aeF.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        Integer num = this.c;
        int hashCode2 = num == null ? 0 : num.hashCode();
        d dVar = this.b;
        int hashCode3 = dVar == null ? 0 : dVar.hashCode();
        List<b> list = this.d;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.e;
        Integer num = this.c;
        d dVar = this.b;
        List<b> list = this.d;
        return "FullDpEpisodesPage(__typename=" + str + ", totalCount=" + num + ", pageInfo=" + dVar + ", edges=" + list + ")";
    }

    public C2328aeF(String str, Integer num, d dVar, List<b> list) {
        C8632dsu.c((Object) str, "");
        this.e = str;
        this.c = num;
        this.b = dVar;
        this.d = list;
    }

    /* renamed from: o.aeF$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String b;
        private final String c;
        private final boolean d;

        public final String a() {
            return this.b;
        }

        public final boolean c() {
            return this.d;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.c, (Object) dVar.c) && this.d == dVar.d && C8632dsu.c((Object) this.b, (Object) dVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            int hashCode2 = Boolean.hashCode(this.d);
            String str = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.c;
            boolean z = this.d;
            String str2 = this.b;
            return "PageInfo(__typename=" + str + ", hasNextPage=" + z + ", endCursor=" + str2 + ")";
        }

        public d(String str, boolean z, String str2) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.d = z;
            this.b = str2;
        }
    }

    /* renamed from: o.aeF$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final e d;
        private final String e;

        public final String c() {
            return this.e;
        }

        public final e e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c(this.d, bVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            e eVar = this.d;
            return (hashCode * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            e eVar = this.d;
            return "Edge(__typename=" + str + ", node=" + eVar + ")";
        }

        public b(String str, e eVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = eVar;
        }
    }

    /* renamed from: o.aeF$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final C2289adT a;
        private final C2287adR b;
        private final String c;
        private final String d;
        private final C2295adZ e;
        private final C2412afk f;
        private final Boolean g;
        private final C2329aeG h;
        private final a i;
        private final Boolean j;
        private final Boolean k;
        private final Boolean l;
        private final Boolean m;
        private final Integer n;

        /* renamed from: o  reason: collision with root package name */
        private final Boolean f13466o;
        private final String p;
        private final String q;
        private final int r;
        private final String t;

        public final Boolean a() {
            return this.g;
        }

        public final C2289adT b() {
            return this.a;
        }

        public final String c() {
            return this.d;
        }

        public final C2287adR d() {
            return this.b;
        }

        public final C2295adZ e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && this.r == eVar.r && C8632dsu.c((Object) this.q, (Object) eVar.q) && C8632dsu.c((Object) this.p, (Object) eVar.p) && C8632dsu.c(this.j, eVar.j) && C8632dsu.c(this.l, eVar.l) && C8632dsu.c(this.k, eVar.k) && C8632dsu.c((Object) this.d, (Object) eVar.d) && C8632dsu.c((Object) this.t, (Object) eVar.t) && C8632dsu.c(this.i, eVar.i) && C8632dsu.c(this.m, eVar.m) && C8632dsu.c(this.n, eVar.n) && C8632dsu.c(this.g, eVar.g) && C8632dsu.c(this.f13466o, eVar.f13466o) && C8632dsu.c(this.b, eVar.b) && C8632dsu.c(this.e, eVar.e) && C8632dsu.c(this.a, eVar.a) && C8632dsu.c(this.f, eVar.f) && C8632dsu.c(this.h, eVar.h);
            }
            return false;
        }

        public final C2329aeG f() {
            return this.h;
        }

        public final Integer g() {
            return this.n;
        }

        public final a h() {
            return this.i;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            int hashCode2 = Integer.hashCode(this.r);
            String str = this.q;
            int hashCode3 = str == null ? 0 : str.hashCode();
            int hashCode4 = this.p.hashCode();
            Boolean bool = this.j;
            int hashCode5 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.l;
            int hashCode6 = bool2 == null ? 0 : bool2.hashCode();
            Boolean bool3 = this.k;
            int hashCode7 = bool3 == null ? 0 : bool3.hashCode();
            String str2 = this.d;
            int hashCode8 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.t;
            int hashCode9 = str3 == null ? 0 : str3.hashCode();
            a aVar = this.i;
            int hashCode10 = aVar == null ? 0 : aVar.hashCode();
            Boolean bool4 = this.m;
            int hashCode11 = bool4 == null ? 0 : bool4.hashCode();
            Integer num = this.n;
            int hashCode12 = num == null ? 0 : num.hashCode();
            Boolean bool5 = this.g;
            int hashCode13 = bool5 == null ? 0 : bool5.hashCode();
            Boolean bool6 = this.f13466o;
            return (((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + (bool6 != null ? bool6.hashCode() : 0)) * 31) + this.b.hashCode()) * 31) + this.e.hashCode()) * 31) + this.a.hashCode()) * 31) + this.f.hashCode()) * 31) + this.h.hashCode();
        }

        public final String i() {
            return this.t;
        }

        public final C2412afk j() {
            return this.f;
        }

        public final int k() {
            return this.r;
        }

        public final String l() {
            return this.p;
        }

        public final String m() {
            return this.q;
        }

        public final String n() {
            return this.c;
        }

        public final Boolean o() {
            return this.j;
        }

        public final Boolean p() {
            return this.f13466o;
        }

        public final Boolean q() {
            return this.l;
        }

        public final Boolean r() {
            return this.k;
        }

        public final Boolean t() {
            return this.m;
        }

        public String toString() {
            String str = this.c;
            int i = this.r;
            String str2 = this.q;
            String str3 = this.p;
            Boolean bool = this.j;
            Boolean bool2 = this.l;
            Boolean bool3 = this.k;
            String str4 = this.d;
            String str5 = this.t;
            a aVar = this.i;
            Boolean bool4 = this.m;
            Integer num = this.n;
            Boolean bool5 = this.g;
            Boolean bool6 = this.f13466o;
            C2287adR c2287adR = this.b;
            C2295adZ c2295adZ = this.e;
            C2289adT c2289adT = this.a;
            C2412afk c2412afk = this.f;
            C2329aeG c2329aeG = this.h;
            return "Node(__typename=" + str + ", videoId=" + i + ", title=" + str2 + ", unifiedEntityId=" + str3 + ", isAvailable=" + bool + ", isPlayable=" + bool2 + ", isAvailableForDownload=" + bool3 + ", availabilityDateMessaging=" + str4 + ", synopsis=" + str5 + ", interestingArtworkSmall=" + aVar + ", isEpisodeNumberHidden=" + bool4 + ", number=" + num + ", displayNewBadge=" + bool5 + ", isInRemindMeList=" + bool6 + ", detailsContextualSynopsis=" + c2287adR + ", detailsViewable=" + c2295adZ + ", detailsProtected=" + c2289adT + ", interactiveVideo=" + c2412afk + ", fullDpLiveEventViewable=" + c2329aeG + ")";
        }

        public e(String str, int i, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, String str5, a aVar, Boolean bool4, Integer num, Boolean bool5, Boolean bool6, C2287adR c2287adR, C2295adZ c2295adZ, C2289adT c2289adT, C2412afk c2412afk, C2329aeG c2329aeG) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str3, "");
            C8632dsu.c((Object) c2287adR, "");
            C8632dsu.c((Object) c2295adZ, "");
            C8632dsu.c((Object) c2289adT, "");
            C8632dsu.c((Object) c2412afk, "");
            C8632dsu.c((Object) c2329aeG, "");
            this.c = str;
            this.r = i;
            this.q = str2;
            this.p = str3;
            this.j = bool;
            this.l = bool2;
            this.k = bool3;
            this.d = str4;
            this.t = str5;
            this.i = aVar;
            this.m = bool4;
            this.n = num;
            this.g = bool5;
            this.f13466o = bool6;
            this.b = c2287adR;
            this.e = c2295adZ;
            this.a = c2289adT;
            this.f = c2412afk;
            this.h = c2329aeG;
        }
    }

    /* renamed from: o.aeF$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final String d;

        public final String c() {
            return this.a;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c((Object) this.d, (Object) aVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.d;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.a;
            String str2 = this.d;
            return "InterestingArtworkSmall(__typename=" + str + ", url=" + str2 + ")";
        }

        public a(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.d = str2;
        }
    }
}
