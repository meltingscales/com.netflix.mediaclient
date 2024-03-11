package o;

/* loaded from: classes2.dex */
public final class BO implements InterfaceC9037hy {
    private final e a;
    private final a b;
    private final d c;
    private final String d;
    private final c e;
    private final i f;
    private final b g;
    private final String j;

    public final d a() {
        return this.c;
    }

    public final e b() {
        return this.a;
    }

    public final a c() {
        return this.b;
    }

    public final c d() {
        return this.e;
    }

    public final b e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BO) {
            BO bo = (BO) obj;
            return C8632dsu.c((Object) this.d, (Object) bo.d) && C8632dsu.c(this.c, bo.c) && C8632dsu.c(this.b, bo.b) && C8632dsu.c((Object) this.j, (Object) bo.j) && C8632dsu.c(this.a, bo.a) && C8632dsu.c(this.e, bo.e) && C8632dsu.c(this.g, bo.g) && C8632dsu.c(this.f, bo.f);
        }
        return false;
    }

    public final String g() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        int hashCode2 = this.c.hashCode();
        a aVar = this.b;
        int hashCode3 = aVar == null ? 0 : aVar.hashCode();
        String str = this.j;
        int hashCode4 = str == null ? 0 : str.hashCode();
        e eVar = this.a;
        int hashCode5 = eVar == null ? 0 : eVar.hashCode();
        c cVar = this.e;
        int hashCode6 = cVar == null ? 0 : cVar.hashCode();
        b bVar = this.g;
        int hashCode7 = bVar == null ? 0 : bVar.hashCode();
        i iVar = this.f;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (iVar != null ? iVar.hashCode() : 0);
    }

    public final i i() {
        return this.f;
    }

    public final String j() {
        return this.d;
    }

    public String toString() {
        String str = this.d;
        d dVar = this.c;
        a aVar = this.b;
        String str2 = this.j;
        e eVar = this.a;
        c cVar = this.e;
        b bVar = this.g;
        i iVar = this.f;
        return "SelectableCardFragment(__typename=" + str + ", content=" + dVar + ", field=" + aVar + ", value=" + str2 + ", button=" + eVar + ", buttonSelected=" + cVar + ", style=" + bVar + ", styleSelected=" + iVar + ")";
    }

    public BO(String str, d dVar, a aVar, String str2, e eVar, c cVar, b bVar, i iVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) dVar, "");
        this.d = str;
        this.c = dVar;
        this.b = aVar;
        this.j = str2;
        this.a = eVar;
        this.e = cVar;
        this.g = bVar;
        this.f = iVar;
    }

    /* loaded from: classes2.dex */
    public static final class d {
        private final String c;
        private final String e;

        public final String c() {
            return this.e;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.c, (Object) dVar.c) && C8632dsu.c((Object) this.e, (Object) dVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.c;
            String str2 = this.e;
            return "Content(__typename=" + str + ", key=" + str2 + ")";
        }

        public d(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.e = str2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        private final BU a;
        private final String d;

        public final BU a() {
            return this.a;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c(this.a, aVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.d;
            BU bu = this.a;
            return "Field(__typename=" + str + ", stringFieldFragment=" + bu + ")";
        }

        public a(String str, BU bu) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bu, "");
            this.d = str;
            this.a = bu;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {
        private final String d;
        private final AS e;

        public final String d() {
            return this.d;
        }

        public final AS e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.d;
            AS as = this.e;
            return "Button(__typename=" + str + ", buttonLikeFragment=" + as + ")";
        }

        public e(String str, AS as) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) as, "");
            this.d = str;
            this.e = as;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        private final String b;
        private final AS e;

        public final AS c() {
            return this.e;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c(this.e, cVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.b;
            AS as = this.e;
            return "ButtonSelected(__typename=" + str + ", buttonLikeFragment=" + as + ")";
        }

        public c(String str, AS as) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) as, "");
            this.b = str;
            this.e = as;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        private final String a;
        private final AU c;

        public final AU a() {
            return this.c;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c(this.c, bVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.a;
            AU au = this.c;
            return "Style(__typename=" + str + ", containerStyleFragment=" + au + ")";
        }

        public b(String str, AU au) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) au, "");
            this.a = str;
            this.c = au;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i {
        private final AU d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final AU e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c((Object) this.e, (Object) iVar.e) && C8632dsu.c(this.d, iVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.e;
            AU au = this.d;
            return "StyleSelected(__typename=" + str + ", containerStyleFragment=" + au + ")";
        }

        public i(String str, AU au) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) au, "");
            this.e = str;
            this.d = au;
        }
    }
}
