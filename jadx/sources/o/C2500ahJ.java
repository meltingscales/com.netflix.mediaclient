package o;

import j$.time.Instant;
import java.util.List;

/* renamed from: o.ahJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2500ahJ implements InterfaceC9037hy {
    private final a a;
    private final String b;
    private final String c;
    private final Instant d;
    private final String e;
    private final c i;

    public final String a() {
        return this.b;
    }

    public final c b() {
        return this.i;
    }

    public final String c() {
        return this.e;
    }

    public final a d() {
        return this.a;
    }

    public final Instant e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2500ahJ) {
            C2500ahJ c2500ahJ = (C2500ahJ) obj;
            return C8632dsu.c((Object) this.c, (Object) c2500ahJ.c) && C8632dsu.c((Object) this.e, (Object) c2500ahJ.e) && C8632dsu.c((Object) this.b, (Object) c2500ahJ.b) && C8632dsu.c(this.d, c2500ahJ.d) && C8632dsu.c(this.i, c2500ahJ.i) && C8632dsu.c(this.a, c2500ahJ.a);
        }
        return false;
    }

    public final String f() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        int hashCode2 = this.e.hashCode();
        String str = this.b;
        int hashCode3 = str == null ? 0 : str.hashCode();
        Instant instant = this.d;
        int hashCode4 = instant == null ? 0 : instant.hashCode();
        c cVar = this.i;
        int hashCode5 = cVar == null ? 0 : cVar.hashCode();
        a aVar = this.a;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.c;
        String str2 = this.e;
        String str3 = this.b;
        Instant instant = this.d;
        c cVar = this.i;
        a aVar = this.a;
        return "PinotPageFragment(__typename=" + str + ", id=" + str2 + ", sessionId=" + str3 + ", expires=" + instant + ", trackingInfo=" + cVar + ", sections=" + aVar + ")";
    }

    public C2500ahJ(String str, String str2, String str3, Instant instant, c cVar, a aVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.c = str;
        this.e = str2;
        this.b = str3;
        this.d = instant;
        this.i = cVar;
        this.a = aVar;
    }

    /* renamed from: o.ahJ$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String b;
        private final String e;

        public final String a() {
            return this.b;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c((Object) this.e, (Object) cVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.b;
            String str2 = this.e;
            return "TrackingInfo(__typename=" + str + ", requestId=" + str2 + ")";
        }

        public c(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.b = str;
            this.e = str2;
        }
    }

    /* renamed from: o.ahJ$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final List<b> b;
        private final e c;
        private final int e;

        public final int a() {
            return this.e;
        }

        public final String b() {
            return this.a;
        }

        public final List<b> c() {
            return this.b;
        }

        public final e e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && this.e == aVar.e && C8632dsu.c(this.b, aVar.b) && C8632dsu.c(this.c, aVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            int hashCode2 = Integer.hashCode(this.e);
            List<b> list = this.b;
            return (((((hashCode * 31) + hashCode2) * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.a;
            int i = this.e;
            List<b> list = this.b;
            e eVar = this.c;
            return "Sections(__typename=" + str + ", totalCount=" + i + ", edges=" + list + ", pageInfo=" + eVar + ")";
        }

        public a(String str, int i, List<b> list, e eVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) eVar, "");
            this.a = str;
            this.e = i;
            this.b = list;
            this.c = eVar;
        }
    }

    /* renamed from: o.ahJ$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String b;
        private final d c;
        private final String e;

        public final String b() {
            return this.e;
        }

        public final d c() {
            return this.c;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c(this.c, bVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            int hashCode2 = this.b.hashCode();
            d dVar = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            String str2 = this.b;
            d dVar = this.c;
            return "Edge(__typename=" + str + ", cursor=" + str2 + ", node=" + dVar + ")";
        }

        public b(String str, String str2, d dVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.e = str;
            this.b = str2;
            this.c = dVar;
        }
    }

    /* renamed from: o.ahJ$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final C2494ahD a;
        private final String b;
        private final C2504ahN c;
        private final C2542ahz d;

        public final C2494ahD a() {
            return this.a;
        }

        public final C2542ahz b() {
            return this.d;
        }

        public final C2504ahN c() {
            return this.c;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c(this.a, dVar.a) && C8632dsu.c(this.c, dVar.c) && C8632dsu.c(this.d, dVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            C2494ahD c2494ahD = this.a;
            int hashCode2 = c2494ahD == null ? 0 : c2494ahD.hashCode();
            C2504ahN c2504ahN = this.c;
            int hashCode3 = c2504ahN == null ? 0 : c2504ahN.hashCode();
            C2542ahz c2542ahz = this.d;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (c2542ahz != null ? c2542ahz.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            C2494ahD c2494ahD = this.a;
            C2504ahN c2504ahN = this.c;
            C2542ahz c2542ahz = this.d;
            return "Node(__typename=" + str + ", pinotEntityCollectionSectionFragment=" + c2494ahD + ", pinotPQSListSectionFragment=" + c2504ahN + ", pinotCreatorHomeFragment=" + c2542ahz + ")";
        }

        public d(String str, C2494ahD c2494ahD, C2504ahN c2504ahN, C2542ahz c2542ahz) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = c2494ahD;
            this.c = c2504ahN;
            this.d = c2542ahz;
        }
    }

    /* renamed from: o.ahJ$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String c;
        private final boolean e;

        public final String b() {
            return this.c;
        }

        public final boolean c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && this.e == eVar.e;
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + Boolean.hashCode(this.e);
        }

        public String toString() {
            String str = this.c;
            boolean z = this.e;
            return "PageInfo(__typename=" + str + ", hasNextPage=" + z + ")";
        }

        public e(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.e = z;
        }
    }
}
