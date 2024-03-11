package o;

/* loaded from: classes2.dex */
public final class AF implements InterfaceC9037hy {
    private final String b;
    private final c d;
    private final a e;

    public final c a() {
        return this.d;
    }

    public final a d() {
        return this.e;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AF) {
            AF af = (AF) obj;
            return C8632dsu.c((Object) this.b, (Object) af.b) && C8632dsu.c(this.d, af.d) && C8632dsu.c(this.e, af.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        c cVar = this.d;
        return (((hashCode * 31) + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.e.hashCode();
    }

    public String toString() {
        String str = this.b;
        c cVar = this.d;
        a aVar = this.e;
        return "BannerFragment(__typename=" + str + ", style=" + cVar + ", content=" + aVar + ")";
    }

    public AF(String str, c cVar, a aVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) aVar, "");
        this.b = str;
        this.d = cVar;
        this.e = aVar;
    }

    /* loaded from: classes2.dex */
    public static final class c {
        private final AU a;
        private final String b;

        public final AU c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c(this.a, cVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.b;
            AU au = this.a;
            return "Style(__typename=" + str + ", containerStyleFragment=" + au + ")";
        }

        public c(String str, AU au) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) au, "");
            this.b = str;
            this.a = au;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
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
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.b, (Object) aVar.b) && C8632dsu.c((Object) this.e, (Object) aVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.b;
            String str2 = this.e;
            return "Content(__typename=" + str + ", key=" + str2 + ")";
        }

        public a(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.b = str;
            this.e = str2;
        }
    }
}
