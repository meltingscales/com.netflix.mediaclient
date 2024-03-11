package o;

import java.util.List;

/* renamed from: o.ahj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2526ahj implements InterfaceC9037hy {
    private final c a;
    private final String b;
    private final d d;

    public final String a() {
        return this.b;
    }

    public final c b() {
        return this.a;
    }

    public final d c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2526ahj) {
            C2526ahj c2526ahj = (C2526ahj) obj;
            return C8632dsu.c((Object) this.b, (Object) c2526ahj.b) && C8632dsu.c(this.d, c2526ahj.d) && C8632dsu.c(this.a, c2526ahj.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        d dVar = this.d;
        int hashCode2 = dVar == null ? 0 : dVar.hashCode();
        c cVar = this.a;
        return (((hashCode * 31) + hashCode2) * 31) + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.b;
        d dVar = this.d;
        c cVar = this.a;
        return "LolomoTopTenFeedRow(__typename=" + str + ", header=" + dVar + ", trailerEntities=" + cVar + ")";
    }

    public C2526ahj(String str, d dVar, c cVar) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.d = dVar;
        this.a = cVar;
    }

    /* renamed from: o.ahj$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final C2409afh e;

        public final String a() {
            return this.a;
        }

        public final C2409afh e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c(this.e, dVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.a;
            C2409afh c2409afh = this.e;
            return "Header(__typename=" + str + ", headerData=" + c2409afh + ")";
        }

        public d(String str, C2409afh c2409afh) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2409afh, "");
            this.a = str;
            this.e = c2409afh;
        }
    }

    /* renamed from: o.ahj$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String b;
        private final e c;

        public final String c() {
            return this.b;
        }

        public final e d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c(this.c, cVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.b;
            e eVar = this.c;
            return "TrailerEntities(__typename=" + str + ", onLolomoFeedRowEntitiesConnection=" + eVar + ")";
        }

        public c(String str, e eVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) eVar, "");
            this.b = str;
            this.c = eVar;
        }
    }

    /* renamed from: o.ahj$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final List<a> d;

        public final List<a> a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.d, ((e) obj).d);
        }

        public int hashCode() {
            List<a> list = this.d;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<a> list = this.d;
            return "OnLolomoFeedRowEntitiesConnection(edges=" + list + ")";
        }

        public e(List<a> list) {
            this.d = list;
        }
    }

    /* renamed from: o.ahj$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String b;
        private final C2365aeq d;

        public final C2365aeq c() {
            return this.d;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.b, (Object) aVar.b) && C8632dsu.c(this.d, aVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.b;
            C2365aeq c2365aeq = this.d;
            return "Edge(__typename=" + str + ", feedEdgeData=" + c2365aeq + ")";
        }

        public a(String str, C2365aeq c2365aeq) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2365aeq, "");
            this.b = str;
            this.d = c2365aeq;
        }
    }
}
