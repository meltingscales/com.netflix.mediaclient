package o;

import java.util.List;

/* renamed from: o.agd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2467agd implements InterfaceC9037hy {
    private final e b;
    private final String c;
    private final b d;

    public final b a() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public final e d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2467agd) {
            C2467agd c2467agd = (C2467agd) obj;
            return C8632dsu.c((Object) this.c, (Object) c2467agd.c) && C8632dsu.c(this.b, c2467agd.b) && C8632dsu.c(this.d, c2467agd.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        e eVar = this.b;
        int hashCode2 = eVar == null ? 0 : eVar.hashCode();
        b bVar = this.d;
        return (((hashCode * 31) + hashCode2) * 31) + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.c;
        e eVar = this.b;
        b bVar = this.d;
        return "LolomoFeedRow(__typename=" + str + ", header=" + eVar + ", trailerEntities=" + bVar + ")";
    }

    public C2467agd(String str, e eVar, b bVar) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.b = eVar;
        this.d = bVar;
    }

    /* renamed from: o.agd$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final C2409afh b;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final C2409afh e() {
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
            return (this.d.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.d;
            C2409afh c2409afh = this.b;
            return "Header(__typename=" + str + ", headerData=" + c2409afh + ")";
        }

        public e(String str, C2409afh c2409afh) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2409afh, "");
            this.d = str;
            this.b = c2409afh;
        }
    }

    /* renamed from: o.agd$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String b;
        private final c e;

        public final c a() {
            return this.e;
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
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c(this.e, bVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.b;
            c cVar = this.e;
            return "TrailerEntities(__typename=" + str + ", onLolomoFeedRowEntitiesConnection=" + cVar + ")";
        }

        public b(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) cVar, "");
            this.b = str;
            this.e = cVar;
        }
    }

    /* renamed from: o.agd$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final List<a> b;

        public final List<a> b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.b, ((c) obj).b);
        }

        public int hashCode() {
            List<a> list = this.b;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<a> list = this.b;
            return "OnLolomoFeedRowEntitiesConnection(edges=" + list + ")";
        }

        public c(List<a> list) {
            this.b = list;
        }
    }

    /* renamed from: o.agd$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final C2365aeq c;

        public final String a() {
            return this.a;
        }

        public final C2365aeq d() {
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
            return (this.a.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.a;
            C2365aeq c2365aeq = this.c;
            return "Edge(__typename=" + str + ", feedEdgeData=" + c2365aeq + ")";
        }

        public a(String str, C2365aeq c2365aeq) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2365aeq, "");
            this.a = str;
            this.c = c2365aeq;
        }
    }
}
