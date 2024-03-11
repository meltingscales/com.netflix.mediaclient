package o;

import java.util.List;

/* renamed from: o.agZ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2463agZ implements InterfaceC9037hy {
    private final String a;
    private final Integer b;
    private final a c;
    private final List<d> e;

    public final a a() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final Integer d() {
        return this.b;
    }

    public final List<d> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2463agZ) {
            C2463agZ c2463agZ = (C2463agZ) obj;
            return C8632dsu.c((Object) this.a, (Object) c2463agZ.a) && C8632dsu.c(this.b, c2463agZ.b) && C8632dsu.c(this.e, c2463agZ.e) && C8632dsu.c(this.c, c2463agZ.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        List<d> list = this.e;
        int hashCode3 = list == null ? 0 : list.hashCode();
        a aVar = this.c;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.a;
        Integer num = this.b;
        List<d> list = this.e;
        a aVar = this.c;
        return "LolomoRows(__typename=" + str + ", totalCount=" + num + ", edges=" + list + ", pageInfo=" + aVar + ")";
    }

    public C2463agZ(String str, Integer num, List<d> list, a aVar) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.b = num;
        this.e = list;
        this.c = aVar;
    }

    /* renamed from: o.agZ$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final C2458agU b;

        public final String b() {
            return this.a;
        }

        public final C2458agU e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c(this.b, dVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            C2458agU c2458agU = this.b;
            return "Edge(__typename=" + str + ", lolomoRowEdge=" + c2458agU + ")";
        }

        public d(String str, C2458agU c2458agU) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2458agU, "");
            this.a = str;
            this.b = c2458agU;
        }
    }

    /* renamed from: o.agZ$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final boolean c;
        private final String d;

        public final boolean b() {
            return this.c;
        }

        public final String c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && this.c == aVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + Boolean.hashCode(this.c);
        }

        public String toString() {
            String str = this.d;
            boolean z = this.c;
            return "PageInfo(__typename=" + str + ", hasNextPage=" + z + ")";
        }

        public a(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = z;
        }
    }
}
