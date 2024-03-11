package o;

import java.util.List;

/* renamed from: o.adj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2305adj implements InterfaceC9037hy {
    private final C2529ahm a;
    private final String b;
    private final b d;

    public final C2529ahm a() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final b d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2305adj) {
            C2305adj c2305adj = (C2305adj) obj;
            return C8632dsu.c((Object) this.b, (Object) c2305adj.b) && C8632dsu.c(this.d, c2305adj.d) && C8632dsu.c(this.a, c2305adj.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        b bVar = this.d;
        return (((hashCode * 31) + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = this.b;
        b bVar = this.d;
        C2529ahm c2529ahm = this.a;
        return "ABBulkRaterRecommendationRow(__typename=" + str + ", recommendationRowEntities=" + bVar + ", lolomoVideoRow=" + c2529ahm + ")";
    }

    public C2305adj(String str, b bVar, C2529ahm c2529ahm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2529ahm, "");
        this.b = str;
        this.d = bVar;
        this.a = c2529ahm;
    }

    /* renamed from: o.adj$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String b;
        private final List<e> c;

        public final List<e> c() {
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
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c(this.c, bVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            List<e> list = this.c;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.b;
            List<e> list = this.c;
            return "RecommendationRowEntities(__typename=" + str + ", edges=" + list + ")";
        }

        public b(String str, List<e> list) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.c = list;
        }
    }

    /* renamed from: o.adj$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final a d;
        private final String e;

        public final String b() {
            return this.e;
        }

        public final a c() {
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
            a aVar = this.d;
            return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            a aVar = this.d;
            return "Edge(__typename=" + str + ", ratedNode=" + aVar + ")";
        }

        public e(String str, a aVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = aVar;
        }
    }

    /* renamed from: o.adj$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String c;
        private final d e;

        public final String a() {
            return this.c;
        }

        public final d b() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c(this.e, aVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            d dVar = this.e;
            return (hashCode * 31) + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            String str = this.c;
            d dVar = this.e;
            return "RatedNode(__typename=" + str + ", reference=" + dVar + ")";
        }

        public a(String str, d dVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.e = dVar;
        }
    }

    /* renamed from: o.adj$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final C2271adB b;
        private final String d;

        public final C2271adB d() {
            return this.b;
        }

        public final String e() {
            return this.d;
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
            C2271adB c2271adB = this.b;
            return (hashCode * 31) + (c2271adB == null ? 0 : c2271adB.hashCode());
        }

        public String toString() {
            String str = this.d;
            C2271adB c2271adB = this.b;
            return "Reference(__typename=" + str + ", collectTasteRatedTitleData=" + c2271adB + ")";
        }

        public d(String str, C2271adB c2271adB) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.b = c2271adB;
        }
    }
}
