package o;

import j$.time.Instant;
import java.util.List;

/* renamed from: o.aiZ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2569aiZ implements InterfaceC9037hy {
    private final Boolean a;
    private final Instant b;
    private final e c;
    private final String d;
    private final String e;
    private final Boolean f;
    private final Boolean g;
    private final Boolean h;
    private final Boolean i;
    private final Boolean j;
    private final String k;
    private final String l;
    private final String m;
    private final d n;

    /* renamed from: o  reason: collision with root package name */
    private final Boolean f13471o;
    private final List<String> s;
    private final a t;

    public final e a() {
        return this.c;
    }

    public final String b() {
        return this.k;
    }

    public final d c() {
        return this.n;
    }

    public final String d() {
        return this.e;
    }

    public final Instant e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2569aiZ) {
            C2569aiZ c2569aiZ = (C2569aiZ) obj;
            return C8632dsu.c((Object) this.d, (Object) c2569aiZ.d) && C8632dsu.c(this.c, c2569aiZ.c) && C8632dsu.c(this.b, c2569aiZ.b) && C8632dsu.c((Object) this.e, (Object) c2569aiZ.e) && C8632dsu.c(this.a, c2569aiZ.a) && C8632dsu.c(this.i, c2569aiZ.i) && C8632dsu.c(this.g, c2569aiZ.g) && C8632dsu.c(this.h, c2569aiZ.h) && C8632dsu.c(this.f, c2569aiZ.f) && C8632dsu.c(this.j, c2569aiZ.j) && C8632dsu.c(this.f13471o, c2569aiZ.f13471o) && C8632dsu.c((Object) this.k, (Object) c2569aiZ.k) && C8632dsu.c(this.n, c2569aiZ.n) && C8632dsu.c((Object) this.m, (Object) c2569aiZ.m) && C8632dsu.c((Object) this.l, (Object) c2569aiZ.l) && C8632dsu.c(this.s, c2569aiZ.s) && C8632dsu.c(this.t, c2569aiZ.t);
        }
        return false;
    }

    public final String f() {
        return this.l;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.m;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        e eVar = this.c;
        int hashCode2 = eVar == null ? 0 : eVar.hashCode();
        Instant instant = this.b;
        int hashCode3 = instant == null ? 0 : instant.hashCode();
        int hashCode4 = this.e.hashCode();
        Boolean bool = this.a;
        int hashCode5 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.i;
        int hashCode6 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.g;
        int hashCode7 = bool3 == null ? 0 : bool3.hashCode();
        Boolean bool4 = this.h;
        int hashCode8 = bool4 == null ? 0 : bool4.hashCode();
        Boolean bool5 = this.f;
        int hashCode9 = bool5 == null ? 0 : bool5.hashCode();
        Boolean bool6 = this.j;
        int hashCode10 = bool6 == null ? 0 : bool6.hashCode();
        Boolean bool7 = this.f13471o;
        int hashCode11 = bool7 == null ? 0 : bool7.hashCode();
        String str = this.k;
        int hashCode12 = str == null ? 0 : str.hashCode();
        d dVar = this.n;
        int hashCode13 = dVar == null ? 0 : dVar.hashCode();
        String str2 = this.m;
        int hashCode14 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.l;
        int hashCode15 = str3 == null ? 0 : str3.hashCode();
        List<String> list = this.s;
        int hashCode16 = list == null ? 0 : list.hashCode();
        a aVar = this.t;
        return (((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + (aVar == null ? 0 : aVar.hashCode());
    }

    public final List<String> i() {
        return this.s;
    }

    public final a j() {
        return this.t;
    }

    public final Boolean k() {
        return this.a;
    }

    public final Boolean l() {
        return this.g;
    }

    public final Boolean m() {
        return this.h;
    }

    public final Boolean n() {
        return this.f;
    }

    public final Boolean o() {
        return this.i;
    }

    public final Boolean p() {
        return this.j;
    }

    public final Boolean r() {
        return this.f13471o;
    }

    public String toString() {
        String str = this.d;
        e eVar = this.c;
        Instant instant = this.b;
        String str2 = this.e;
        Boolean bool = this.a;
        Boolean bool2 = this.i;
        Boolean bool3 = this.g;
        Boolean bool4 = this.h;
        Boolean bool5 = this.f;
        Boolean bool6 = this.j;
        Boolean bool7 = this.f13471o;
        String str3 = this.k;
        d dVar = this.n;
        String str4 = this.m;
        String str5 = this.l;
        List<String> list = this.s;
        a aVar = this.t;
        return "UserBlockedTitles(__typename=" + str + ", avatar=" + eVar + ", createdAt=" + instant + ", guid=" + str2 + ", isAccountOwner=" + bool + ", isAutoStartEnabled=" + bool2 + ", isKids=" + bool3 + ", isPinLocked=" + bool4 + ", isProfileCreationLocked=" + bool5 + ", isRecentlyCreated=" + bool6 + ", isVideoMerchEnabled=" + bool7 + ", lockPin=" + str3 + ", maturityRating=" + dVar + ", name=" + str4 + ", primaryLanguage=" + str5 + ", secondaryLanguages=" + list + ", titleProtectedVideos=" + aVar + ")";
    }

    public C2569aiZ(String str, e eVar, Instant instant, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str3, d dVar, String str4, String str5, List<String> list, a aVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.d = str;
        this.c = eVar;
        this.b = instant;
        this.e = str2;
        this.a = bool;
        this.i = bool2;
        this.g = bool3;
        this.h = bool4;
        this.f = bool5;
        this.j = bool6;
        this.f13471o = bool7;
        this.k = str3;
        this.n = dVar;
        this.m = str4;
        this.l = str5;
        this.s = list;
        this.t = aVar;
    }

    /* renamed from: o.aiZ$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final String c;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final String c() {
            return this.c;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c((Object) this.a, (Object) eVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            String str = this.c;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            String str2 = this.c;
            String str3 = this.a;
            return "Avatar(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public e(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = str2;
            this.a = str3;
        }
    }

    /* renamed from: o.aiZ$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final Boolean a;
        private final List<String> b;
        private final Integer c;
        private final Boolean d;
        private final String e;
        private final Integer j;

        public final String a() {
            return this.e;
        }

        public final Integer b() {
            return this.j;
        }

        public final Boolean c() {
            return this.a;
        }

        public final List<String> d() {
            return this.b;
        }

        public final Integer e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c(this.a, dVar.a) && C8632dsu.c(this.d, dVar.d) && C8632dsu.c(this.b, dVar.b) && C8632dsu.c(this.c, dVar.c) && C8632dsu.c(this.j, dVar.j);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            Boolean bool = this.a;
            int hashCode2 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.d;
            int hashCode3 = bool2 == null ? 0 : bool2.hashCode();
            List<String> list = this.b;
            int hashCode4 = list == null ? 0 : list.hashCode();
            Integer num = this.c;
            int hashCode5 = num == null ? 0 : num.hashCode();
            Integer num2 = this.j;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        public final Boolean i() {
            return this.d;
        }

        public String toString() {
            String str = this.e;
            Boolean bool = this.a;
            Boolean bool2 = this.d;
            List<String> list = this.b;
            Integer num = this.c;
            Integer num2 = this.j;
            return "MaturityRating(__typename=" + str + ", isHighest=" + bool + ", isLowest=" + bool2 + ", labels=" + list + ", level=" + num + ", value=" + num2 + ")";
        }

        public d(String str, Boolean bool, Boolean bool2, List<String> list, Integer num, Integer num2) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = bool;
            this.d = bool2;
            this.b = list;
            this.c = num;
            this.j = num2;
        }
    }

    /* renamed from: o.aiZ$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final List<b> a;
        private final String c;

        public final List<b> a() {
            return this.a;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c(this.a, aVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            List<b> list = this.a;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.c;
            List<b> list = this.a;
            return "TitleProtectedVideos(__typename=" + str + ", edges=" + list + ")";
        }

        public a(String str, List<b> list) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.a = list;
        }
    }

    /* renamed from: o.aiZ$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final c a;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final c c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c(this.a, bVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            c cVar = this.a;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            c cVar = this.a;
            return "Edge(__typename=" + str + ", node=" + cVar + ")";
        }

        public b(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = cVar;
        }
    }

    /* renamed from: o.aiZ$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final C2316adu b;
        private final String d;

        public final C2316adu b() {
            return this.b;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c(this.b, cVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.d;
            C2316adu c2316adu = this.b;
            return "Node(__typename=" + str + ", blockedTitleSummary=" + c2316adu + ")";
        }

        public c(String str, C2316adu c2316adu) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2316adu, "");
            this.d = str;
            this.b = c2316adu;
        }
    }
}
