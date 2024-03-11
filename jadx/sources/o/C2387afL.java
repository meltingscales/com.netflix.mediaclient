package o;

import java.util.List;

/* renamed from: o.afL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2387afL implements InterfaceC9037hy {
    private final i a;
    private final C2529ahm b;
    private final String d;

    public final String a() {
        return this.d;
    }

    public final i b() {
        return this.a;
    }

    public final C2529ahm c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2387afL) {
            C2387afL c2387afL = (C2387afL) obj;
            return C8632dsu.c((Object) this.d, (Object) c2387afL.d) && C8632dsu.c(this.a, c2387afL.a) && C8632dsu.c(this.b, c2387afL.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        i iVar = this.a;
        return (((hashCode * 31) + (iVar == null ? 0 : iVar.hashCode())) * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.d;
        i iVar = this.a;
        C2529ahm c2529ahm = this.b;
        return "LolomoBehindTheScenesRow(__typename=" + str + ", tudumEntities=" + iVar + ", lolomoVideoRow=" + c2529ahm + ")";
    }

    public C2387afL(String str, i iVar, C2529ahm c2529ahm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2529ahm, "");
        this.d = str;
        this.a = iVar;
        this.b = c2529ahm;
    }

    /* renamed from: o.afL$i */
    /* loaded from: classes3.dex */
    public static final class i {
        private final List<e> c;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final List<e> e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c((Object) this.d, (Object) iVar.d) && C8632dsu.c(this.c, iVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            List<e> list = this.c;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.d;
            List<e> list = this.c;
            return "TudumEntities(__typename=" + str + ", edges=" + list + ")";
        }

        public i(String str, List<e> list) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = list;
        }
    }

    /* renamed from: o.afL$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final c d;
        private final String e;

        public final String b() {
            return this.e;
        }

        public final c c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.e, (Object) eVar.e) && C8632dsu.c(this.d, eVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            c cVar = this.d;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            c cVar = this.d;
            return "Edge(__typename=" + str + ", node=" + cVar + ")";
        }

        public e(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = cVar;
        }
    }

    /* renamed from: o.afL$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String a;
        private final a c;

        public final String b() {
            return this.a;
        }

        public final a c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.a, (Object) cVar.a) && C8632dsu.c(this.c, cVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            a aVar = this.c;
            return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            a aVar = this.c;
            return "Node(__typename=" + str + ", reference=" + aVar + ")";
        }

        public c(String str, a aVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = aVar;
        }
    }

    /* renamed from: o.afL$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final d a;
        private final b b;
        private final String e;

        public final b b() {
            return this.b;
        }

        public final d c() {
            return this.a;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c(this.b, aVar.b) && C8632dsu.c(this.a, aVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            b bVar = this.b;
            int hashCode2 = bVar == null ? 0 : bVar.hashCode();
            d dVar = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (dVar != null ? dVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            b bVar = this.b;
            d dVar = this.a;
            return "Reference(__typename=" + str + ", onMovie=" + bVar + ", onShow=" + dVar + ")";
        }

        public a(String str, b bVar, d dVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = bVar;
            this.a = dVar;
        }
    }

    /* renamed from: o.afL$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final int a;
        private final g b;

        public final int b() {
            return this.a;
        }

        public final g d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.a == bVar.a && C8632dsu.c(this.b, bVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.a);
            g gVar = this.b;
            return (hashCode * 31) + (gVar == null ? 0 : gVar.hashCode());
        }

        public String toString() {
            int i = this.a;
            g gVar = this.b;
            return "OnMovie(videoId=" + i + ", tudumTitle=" + gVar + ")";
        }

        public b(int i, g gVar) {
            this.a = i;
            this.b = gVar;
        }
    }

    /* renamed from: o.afL$g */
    /* loaded from: classes3.dex */
    public static final class g {
        private final C2563aiT d;
        private final String e;

        public final String b() {
            return this.e;
        }

        public final C2563aiT c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.e, (Object) gVar.e) && C8632dsu.c(this.d, gVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.e;
            C2563aiT c2563aiT = this.d;
            return "TudumTitle(__typename=" + str + ", tudumPromoSummary=" + c2563aiT + ")";
        }

        public g(String str, C2563aiT c2563aiT) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2563aiT, "");
            this.e = str;
            this.d = c2563aiT;
        }
    }

    /* renamed from: o.afL$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final j c;
        private final int d;

        public final j c() {
            return this.c;
        }

        public final int d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.d == dVar.d && C8632dsu.c(this.c, dVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.d);
            j jVar = this.c;
            return (hashCode * 31) + (jVar == null ? 0 : jVar.hashCode());
        }

        public String toString() {
            int i = this.d;
            j jVar = this.c;
            return "OnShow(videoId=" + i + ", tudumTitle=" + jVar + ")";
        }

        public d(int i, j jVar) {
            this.d = i;
            this.c = jVar;
        }
    }

    /* renamed from: o.afL$j */
    /* loaded from: classes3.dex */
    public static final class j {
        private final String d;
        private final C2563aiT e;

        public final C2563aiT b() {
            return this.e;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c((Object) this.d, (Object) jVar.d) && C8632dsu.c(this.e, jVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.d;
            C2563aiT c2563aiT = this.e;
            return "TudumTitle1(__typename=" + str + ", tudumPromoSummary=" + c2563aiT + ")";
        }

        public j(String str, C2563aiT c2563aiT) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2563aiT, "");
            this.d = str;
            this.e = c2563aiT;
        }
    }
}
