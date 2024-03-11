package o;

import java.util.List;

/* renamed from: o.ahf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2522ahf implements InterfaceC9037hy {
    private final String b;
    private final C2529ahm c;
    private final a d;

    public final String b() {
        return this.b;
    }

    public final C2529ahm c() {
        return this.c;
    }

    public final a d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2522ahf) {
            C2522ahf c2522ahf = (C2522ahf) obj;
            return C8632dsu.c((Object) this.b, (Object) c2522ahf.b) && C8632dsu.c(this.d, c2522ahf.d) && C8632dsu.c(this.c, c2522ahf.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        a aVar = this.d;
        return (((hashCode * 31) + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.b;
        a aVar = this.d;
        C2529ahm c2529ahm = this.c;
        return "LolomoTopTenRow(__typename=" + str + ", topTenEntities=" + aVar + ", lolomoVideoRow=" + c2529ahm + ")";
    }

    public C2522ahf(String str, a aVar, C2529ahm c2529ahm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2529ahm, "");
        this.b = str;
        this.d = aVar;
        this.c = c2529ahm;
    }

    /* renamed from: o.ahf$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final List<e> c;

        public final String b() {
            return this.a;
        }

        public final List<e> c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c(this.c, aVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            List<e> list = this.c;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.a;
            List<e> list = this.c;
            return "TopTenEntities(__typename=" + str + ", edges=" + list + ")";
        }

        public a(String str, List<e> list) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = list;
        }
    }

    /* renamed from: o.ahf$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final c b;
        private final String d;

        public final String c() {
            return this.d;
        }

        public final c d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && C8632dsu.c(this.b, eVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            c cVar = this.b;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.d;
            c cVar = this.b;
            return "Edge(__typename=" + str + ", node=" + cVar + ")";
        }

        public e(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.b = cVar;
        }
    }

    /* renamed from: o.ahf$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final d b;
        private final String c;

        public final d c() {
            return this.b;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.c, (Object) cVar.c) && C8632dsu.c(this.b, cVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            d dVar = this.b;
            return (hashCode * 31) + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            String str = this.c;
            d dVar = this.b;
            return "Node(__typename=" + str + ", reference=" + dVar + ")";
        }

        public c(String str, d dVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.b = dVar;
        }
    }

    /* renamed from: o.ahf$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final C2564aiU b;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final C2564aiU d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c(this.b, dVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            C2564aiU c2564aiU = this.b;
            return (hashCode * 31) + (c2564aiU == null ? 0 : c2564aiU.hashCode());
        }

        public String toString() {
            String str = this.d;
            C2564aiU c2564aiU = this.b;
            return "Reference(__typename=" + str + ", topTenVideoArtwork=" + c2564aiU + ")";
        }

        public d(String str, C2564aiU c2564aiU) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.b = c2564aiU;
        }
    }
}
