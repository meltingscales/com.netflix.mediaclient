package o;

import j$.time.Instant;
import java.util.List;

/* renamed from: o.aes  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2367aes implements InterfaceC9037hy {
    private final e a;
    private final String b;
    private final String c;
    private final List<c> d;
    private final d e;
    private final g f;
    private final Instant g;
    private final Integer h;
    private final h i;
    private final b j;
    private final String n;

    public final List<c> a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final d c() {
        return this.e;
    }

    public final b d() {
        return this.j;
    }

    public final e e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2367aes) {
            C2367aes c2367aes = (C2367aes) obj;
            return C8632dsu.c((Object) this.b, (Object) c2367aes.b) && C8632dsu.c((Object) this.c, (Object) c2367aes.c) && C8632dsu.c((Object) this.n, (Object) c2367aes.n) && C8632dsu.c(this.d, c2367aes.d) && C8632dsu.c(this.g, c2367aes.g) && C8632dsu.c(this.h, c2367aes.h) && C8632dsu.c(this.e, c2367aes.e) && C8632dsu.c(this.a, c2367aes.a) && C8632dsu.c(this.f, c2367aes.f) && C8632dsu.c(this.j, c2367aes.j) && C8632dsu.c(this.i, c2367aes.i);
        }
        return false;
    }

    public final g f() {
        return this.f;
    }

    public final String g() {
        return this.n;
    }

    public final Instant h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.n;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        List<c> list = this.d;
        int hashCode4 = list == null ? 0 : list.hashCode();
        Instant instant = this.g;
        int hashCode5 = instant == null ? 0 : instant.hashCode();
        Integer num = this.h;
        int hashCode6 = num == null ? 0 : num.hashCode();
        d dVar = this.e;
        int hashCode7 = dVar == null ? 0 : dVar.hashCode();
        e eVar = this.a;
        int hashCode8 = eVar == null ? 0 : eVar.hashCode();
        g gVar = this.f;
        int hashCode9 = gVar == null ? 0 : gVar.hashCode();
        b bVar = this.j;
        int hashCode10 = bVar == null ? 0 : bVar.hashCode();
        h hVar = this.i;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (hVar != null ? hVar.hashCode() : 0);
    }

    public final h i() {
        return this.i;
    }

    public final Integer j() {
        return this.h;
    }

    public final String l() {
        return this.b;
    }

    public String toString() {
        String str = this.b;
        String str2 = this.c;
        String str3 = this.n;
        List<c> list = this.d;
        Instant instant = this.g;
        Integer num = this.h;
        d dVar = this.e;
        e eVar = this.a;
        g gVar = this.f;
        b bVar = this.j;
        h hVar = this.i;
        return "FeedEdge(__typename=" + str + ", description=" + str2 + ", videoMerchComputeId=" + str3 + ", actions=" + list + ", launchDate=" + instant + ", promotedVideoId=" + num + ", contextualSynopsis=" + dVar + ", brandAndGenreArtwork=" + eVar + ", topNode=" + gVar + ", horzDispImage=" + bVar + ", titleTreatmentUnbranded=" + hVar + ")";
    }

    public C2367aes(String str, String str2, String str3, List<c> list, Instant instant, Integer num, d dVar, e eVar, g gVar, b bVar, h hVar) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.c = str2;
        this.n = str3;
        this.d = list;
        this.g = instant;
        this.h = num;
        this.e = dVar;
        this.a = eVar;
        this.f = gVar;
        this.j = bVar;
        this.i = hVar;
    }

    /* renamed from: o.aes$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String b;
        private final String d;

        public final String a() {
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
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c((Object) this.b, (Object) cVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            String str = this.b;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.d;
            String str2 = this.b;
            return "Action(__typename=" + str + ", actionKind=" + str2 + ")";
        }

        public c(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.b = str2;
        }
    }

    /* renamed from: o.aes$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String b;
        private final String c;
        private final String e;

        public final String a() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c((Object) this.c, (Object) dVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.e;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.e;
            String str3 = this.c;
            return "ContextualSynopsis(__typename=" + str + ", text=" + str2 + ", evidenceKey=" + str3 + ")";
        }

        public d(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = str2;
            this.c = str3;
        }
    }

    /* renamed from: o.aes$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final String b;
        private final String c;
        private final Boolean d;

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final Boolean e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c(this.d, eVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.c;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.a;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            Boolean bool = this.d;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.c;
            String str3 = this.a;
            Boolean bool = this.d;
            return "BrandAndGenreArtwork(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ", available=" + bool + ")";
        }

        public e(String str, String str2, String str3, Boolean bool) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.c = str2;
            this.a = str3;
            this.d = bool;
        }
    }

    /* renamed from: o.aes$g */
    /* loaded from: classes3.dex */
    public static final class g {
        private final String a;
        private final C2371aew b;
        private final i c;
        private final C2324aeB e;

        public final i b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public final C2324aeB d() {
            return this.e;
        }

        public final C2371aew e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.a, (Object) gVar.a) && C8632dsu.c(this.c, gVar.c) && C8632dsu.c(this.e, gVar.e) && C8632dsu.c(this.b, gVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            i iVar = this.c;
            int hashCode2 = iVar == null ? 0 : iVar.hashCode();
            C2324aeB c2324aeB = this.e;
            int hashCode3 = c2324aeB == null ? 0 : c2324aeB.hashCode();
            C2371aew c2371aew = this.b;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (c2371aew != null ? c2371aew.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            i iVar = this.c;
            C2324aeB c2324aeB = this.e;
            C2371aew c2371aew = this.b;
            return "TopNode(__typename=" + str + ", onGame=" + iVar + ", feedVideoAncestorData=" + c2324aeB + ", feedGameAncestorData=" + c2371aew + ")";
        }

        public g(String str, i iVar, C2324aeB c2324aeB, C2371aew c2371aew) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = iVar;
            this.e = c2324aeB;
            this.b = c2371aew;
        }
    }

    /* renamed from: o.aes$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final Boolean c;
        private final String d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final Boolean b() {
            return this.c;
        }

        public final String d() {
            return this.d;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c((Object) this.d, (Object) bVar.d) && C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c(this.c, bVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.d;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.a;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            Boolean bool = this.c;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            String str2 = this.d;
            String str3 = this.a;
            Boolean bool = this.c;
            return "HorzDispImage(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ", available=" + bool + ")";
        }

        public b(String str, String str2, String str3, Boolean bool) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = str2;
            this.a = str3;
            this.c = bool;
        }
    }

    /* renamed from: o.aes$h */
    /* loaded from: classes3.dex */
    public static final class h {
        private final String b;
        private final String c;
        private final Boolean d;
        private final String e;

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final Boolean c() {
            return this.d;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c((Object) this.c, (Object) hVar.c) && C8632dsu.c((Object) this.e, (Object) hVar.e) && C8632dsu.c((Object) this.b, (Object) hVar.b) && C8632dsu.c(this.d, hVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.e;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            Boolean bool = this.d;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            String str2 = this.e;
            String str3 = this.b;
            Boolean bool = this.d;
            return "TitleTreatmentUnbranded(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ", available=" + bool + ")";
        }

        public h(String str, String str2, String str3, Boolean bool) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.e = str2;
            this.b = str3;
            this.d = bool;
        }
    }

    /* renamed from: o.aes$i */
    /* loaded from: classes3.dex */
    public static final class i {
        private final a c;

        public final a b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && C8632dsu.c(this.c, ((i) obj).c);
        }

        public int hashCode() {
            a aVar = this.c;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            a aVar = this.c;
            return "OnGame(features=" + aVar + ")";
        }

        public i(a aVar) {
            this.c = aVar;
        }
    }

    /* renamed from: o.aes$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final List<String> d;

        public final List<String> c() {
            return this.d;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c(this.d, aVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            List<String> list = this.d;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.a;
            List<String> list = this.d;
            return "Features(__typename=" + str + ", modes=" + list + ")";
        }

        public a(String str, List<String> list) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.d = list;
        }
    }
}
