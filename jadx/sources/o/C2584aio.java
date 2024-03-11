package o;

import java.util.List;

/* renamed from: o.aio  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2584aio implements InterfaceC9037hy {
    private final e b;
    private final String d;
    private final a e;

    public final e a() {
        return this.b;
    }

    public final a b() {
        return this.e;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2584aio) {
            C2584aio c2584aio = (C2584aio) obj;
            return C8632dsu.c((Object) this.d, (Object) c2584aio.d) && C8632dsu.c(this.b, c2584aio.b) && C8632dsu.c(this.e, c2584aio.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        e eVar = this.b;
        int hashCode2 = eVar == null ? 0 : eVar.hashCode();
        a aVar = this.e;
        return (((hashCode * 31) + hashCode2) * 31) + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.d;
        e eVar = this.b;
        a aVar = this.e;
        return "PrePlayPageFragment(__typename=" + str + ", trackingInfo=" + eVar + ", sections=" + aVar + ")";
    }

    public C2584aio(String str, e eVar, a aVar) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.b = eVar;
        this.e = aVar;
    }

    /* renamed from: o.aio$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String b;
        private final String c;

        public final String a() {
            return this.c;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c((Object) this.b, (Object) eVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.c;
            String str2 = this.b;
            return "TrackingInfo(__typename=" + str + ", requestId=" + str2 + ")";
        }

        public e(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.b = str2;
        }
    }

    /* renamed from: o.aio$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final List<b> b;
        private final int d;

        public final List<b> a() {
            return this.b;
        }

        public final String d() {
            return this.a;
        }

        public final int e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && this.d == aVar.d && C8632dsu.c(this.b, aVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            int hashCode2 = Integer.hashCode(this.d);
            List<b> list = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.a;
            int i = this.d;
            List<b> list = this.b;
            return "Sections(__typename=" + str + ", totalCount=" + i + ", edges=" + list + ")";
        }

        public a(String str, int i, List<b> list) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.d = i;
            this.b = list;
        }
    }

    /* renamed from: o.aio$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final c a;
        private final String b;
        private final String d;

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.b;
        }

        public final c e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.d, (Object) bVar.d) && C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c(this.a, bVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = this.b.hashCode();
            c cVar = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.d;
            String str2 = this.b;
            c cVar = this.a;
            return "Edge(__typename=" + str + ", cursor=" + str2 + ", node=" + cVar + ")";
        }

        public b(String str, String str2, c cVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.d = str;
            this.b = str2;
            this.a = cVar;
        }
    }

    /* renamed from: o.aio$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final C2586aiq a;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final C2586aiq d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.e, (Object) cVar.e) && C8632dsu.c(this.a, cVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.e;
            C2586aiq c2586aiq = this.a;
            return "Node(__typename=" + str + ", prePlaySectionFragment=" + c2586aiq + ")";
        }

        public c(String str, C2586aiq c2586aiq) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2586aiq, "");
            this.e = str;
            this.a = c2586aiq;
        }
    }
}
