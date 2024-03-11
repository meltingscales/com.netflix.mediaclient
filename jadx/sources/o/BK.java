package o;

/* loaded from: classes2.dex */
public final class BK implements InterfaceC9037hy {
    private final a a;
    private final String b;
    private final b c;
    private final e d;
    private final c e;

    public final c a() {
        return this.e;
    }

    public final String b() {
        return this.b;
    }

    public final e c() {
        return this.d;
    }

    public final a d() {
        return this.a;
    }

    public final b e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BK) {
            BK bk = (BK) obj;
            return C8632dsu.c((Object) this.b, (Object) bk.b) && C8632dsu.c(this.a, bk.a) && C8632dsu.c(this.c, bk.c) && C8632dsu.c(this.d, bk.d) && C8632dsu.c(this.e, bk.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        a aVar = this.a;
        int hashCode2 = aVar == null ? 0 : aVar.hashCode();
        b bVar = this.c;
        int hashCode3 = bVar == null ? 0 : bVar.hashCode();
        e eVar = this.d;
        int hashCode4 = eVar == null ? 0 : eVar.hashCode();
        c cVar = this.e;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.b;
        a aVar = this.a;
        b bVar = this.c;
        e eVar = this.d;
        c cVar = this.e;
        return "PaddingSizeFragment(__typename=" + str + ", top=" + aVar + ", bottom=" + bVar + ", start=" + eVar + ", end=" + cVar + ")";
    }

    public BK(String str, a aVar, b bVar, e eVar, c cVar) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.a = aVar;
        this.c = bVar;
        this.d = eVar;
        this.e = cVar;
    }

    /* loaded from: classes2.dex */
    public static final class a {
        private final C0747Bc b;
        private final String c;

        public final C0747Bc b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c(this.b, aVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.c;
            C0747Bc c0747Bc = this.b;
            return "Top(__typename=" + str + ", designSpaceSizeFragment=" + c0747Bc + ")";
        }

        public a(String str, C0747Bc c0747Bc) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0747Bc, "");
            this.c = str;
            this.b = c0747Bc;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        private final C0747Bc a;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final C0747Bc d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.d, (Object) bVar.d) && C8632dsu.c(this.a, bVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.d;
            C0747Bc c0747Bc = this.a;
            return "Bottom(__typename=" + str + ", designSpaceSizeFragment=" + c0747Bc + ")";
        }

        public b(String str, C0747Bc c0747Bc) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0747Bc, "");
            this.d = str;
            this.a = c0747Bc;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {
        private final C0747Bc b;
        private final String c;

        public final String a() {
            return this.c;
        }

        public final C0747Bc e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c(this.b, eVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.c;
            C0747Bc c0747Bc = this.b;
            return "Start(__typename=" + str + ", designSpaceSizeFragment=" + c0747Bc + ")";
        }

        public e(String str, C0747Bc c0747Bc) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0747Bc, "");
            this.c = str;
            this.b = c0747Bc;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        private final C0747Bc a;
        private final String c;

        public final String a() {
            return this.c;
        }

        public final C0747Bc e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.c, (Object) cVar.c) && C8632dsu.c(this.a, cVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.c;
            C0747Bc c0747Bc = this.a;
            return "End(__typename=" + str + ", designSpaceSizeFragment=" + c0747Bc + ")";
        }

        public c(String str, C0747Bc c0747Bc) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0747Bc, "");
            this.c = str;
            this.a = c0747Bc;
        }
    }
}
