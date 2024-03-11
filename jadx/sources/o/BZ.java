package o;

/* loaded from: classes2.dex */
public final class BZ implements InterfaceC9037hy {
    private final a b;
    private final d d;
    private final String e;

    public final d c() {
        return this.d;
    }

    public final a d() {
        return this.b;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BZ) {
            BZ bz = (BZ) obj;
            return C8632dsu.c((Object) this.e, (Object) bz.e) && C8632dsu.c(this.b, bz.b) && C8632dsu.c(this.d, bz.d);
        }
        return false;
    }

    public int hashCode() {
        return (((this.e.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.e;
        a aVar = this.b;
        d dVar = this.d;
        return "StringValidationFragment(__typename=" + str + ", check=" + aVar + ", errorMessage=" + dVar + ")";
    }

    public BZ(String str, a aVar, d dVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) aVar, "");
        C8632dsu.c((Object) dVar, "");
        this.e = str;
        this.b = aVar;
        this.d = dVar;
    }

    /* loaded from: classes2.dex */
    public static final class a {
        private final String c;
        private final e d;
        private final b e;

        public final String a() {
            return this.c;
        }

        public final b b() {
            return this.e;
        }

        public final e c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c(this.e, aVar.e) && C8632dsu.c(this.d, aVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            b bVar = this.e;
            int hashCode2 = bVar == null ? 0 : bVar.hashCode();
            e eVar = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (eVar != null ? eVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            b bVar = this.e;
            e eVar = this.d;
            return "Check(__typename=" + str + ", onCLCSStringValueCheckLength=" + bVar + ", onCLCSStringValueCheckPattern=" + eVar + ")";
        }

        public a(String str, b bVar, e eVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.e = bVar;
            this.d = eVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
        private final String a;
        private final BG e;

        public final String a() {
            return this.a;
        }

        public final BG e() {
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
            BG bg = this.e;
            return "ErrorMessage(__typename=" + str + ", localizedStringFragment=" + bg + ")";
        }

        public d(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.a = str;
            this.e = bg;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        private final Integer a;
        private final Integer d;

        public final Integer c() {
            return this.a;
        }

        public final Integer e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c(this.d, bVar.d) && C8632dsu.c(this.a, bVar.a);
            }
            return false;
        }

        public int hashCode() {
            Integer num = this.d;
            int hashCode = num == null ? 0 : num.hashCode();
            Integer num2 = this.a;
            return (hashCode * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            Integer num = this.d;
            Integer num2 = this.a;
            return "OnCLCSStringValueCheckLength(minLength=" + num + ", maxLength=" + num2 + ")";
        }

        public b(Integer num, Integer num2) {
            this.d = num;
            this.a = num2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {
        private final String b;

        public final String a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c((Object) this.b, (Object) ((e) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            String str = this.b;
            return "OnCLCSStringValueCheckPattern(pattern=" + str + ")";
        }

        public e(String str) {
            C8632dsu.c((Object) str, "");
            this.b = str;
        }
    }
}
