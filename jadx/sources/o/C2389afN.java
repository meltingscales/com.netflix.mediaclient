package o;

import java.util.List;

/* renamed from: o.afN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2389afN implements InterfaceC9037hy {
    private final C2454agQ a;
    private final c d;
    private final String e;

    public final String a() {
        return this.e;
    }

    public final C2454agQ c() {
        return this.a;
    }

    public final c d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2389afN) {
            C2389afN c2389afN = (C2389afN) obj;
            return C8632dsu.c((Object) this.e, (Object) c2389afN.e) && C8632dsu.c(this.d, c2389afN.d) && C8632dsu.c(this.a, c2389afN.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        c cVar = this.d;
        return (((hashCode * 31) + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = this.e;
        c cVar = this.d;
        C2454agQ c2454agQ = this.a;
        return "LolomoCategoryCraversRow(__typename=" + str + ", categoryEntities=" + cVar + ", lolomoRow=" + c2454agQ + ")";
    }

    public C2389afN(String str, c cVar, C2454agQ c2454agQ) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2454agQ, "");
        this.e = str;
        this.d = cVar;
        this.a = c2454agQ;
    }

    /* renamed from: o.afN$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String b;
        private final List<d> d;

        public final List<d> a() {
            return this.d;
        }

        public final String c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c(this.d, cVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            List<d> list = this.d;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.b;
            List<d> list = this.d;
            return "CategoryEntities(__typename=" + str + ", edges=" + list + ")";
        }

        public c(String str, List<d> list) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = list;
        }
    }

    /* renamed from: o.afN$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String c;
        private final a e;

        public final String c() {
            return this.c;
        }

        public final a d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.c, (Object) dVar.c) && C8632dsu.c(this.e, dVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            a aVar = this.e;
            return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.c;
            a aVar = this.e;
            return "Edge(__typename=" + str + ", node=" + aVar + ")";
        }

        public d(String str, a aVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.e = aVar;
        }
    }

    /* renamed from: o.afN$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final b e;

        public final String a() {
            return this.a;
        }

        public final b e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c(this.e, aVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            b bVar = this.e;
            return (hashCode * 31) + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            b bVar = this.e;
            return "Node(__typename=" + str + ", reference=" + bVar + ")";
        }

        public a(String str, b bVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.e = bVar;
        }
    }

    /* renamed from: o.afN$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final C2405afd d;

        public final String d() {
            return this.a;
        }

        public final C2405afd e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c(this.d, bVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            C2405afd c2405afd = this.d;
            return (hashCode * 31) + (c2405afd == null ? 0 : c2405afd.hashCode());
        }

        public String toString() {
            String str = this.a;
            C2405afd c2405afd = this.d;
            return "Reference(__typename=" + str + ", genreData=" + c2405afd + ")";
        }

        public b(String str, C2405afd c2405afd) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.d = c2405afd;
        }
    }
}
