package o;

/* loaded from: classes2.dex */
public final class AR implements InterfaceC9037hy {
    private final String a;
    private final c b;
    private final String c;
    private final e d;
    private final d e;
    private final String h;
    private final a i;

    public final String a() {
        return this.c;
    }

    public final a b() {
        return this.i;
    }

    public final e c() {
        return this.d;
    }

    public final d d() {
        return this.e;
    }

    public final c e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AR) {
            AR ar = (AR) obj;
            return C8632dsu.c((Object) this.a, (Object) ar.a) && C8632dsu.c(this.b, ar.b) && C8632dsu.c((Object) this.h, (Object) ar.h) && C8632dsu.c((Object) this.c, (Object) ar.c) && C8632dsu.c(this.e, ar.e) && C8632dsu.c(this.d, ar.d) && C8632dsu.c(this.i, ar.i);
        }
        return false;
    }

    public final String g() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        c cVar = this.b;
        int hashCode2 = cVar == null ? 0 : cVar.hashCode();
        String str = this.h;
        int hashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.c;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        d dVar = this.e;
        int hashCode5 = dVar == null ? 0 : dVar.hashCode();
        e eVar = this.d;
        int hashCode6 = eVar == null ? 0 : eVar.hashCode();
        a aVar = this.i;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String j() {
        return this.h;
    }

    public String toString() {
        String str = this.a;
        c cVar = this.b;
        String str2 = this.h;
        String str3 = this.c;
        d dVar = this.e;
        e eVar = this.d;
        a aVar = this.i;
        return "CheckboxFragment(__typename=" + str + ", accessibilityDescription=" + cVar + ", trackingInfo=" + str2 + ", loggingViewName=" + str3 + ", label=" + dVar + ", field=" + eVar + ", onChange=" + aVar + ")";
    }

    public AR(String str, c cVar, String str2, String str3, d dVar, e eVar, a aVar) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.b = cVar;
        this.h = str2;
        this.c = str3;
        this.e = dVar;
        this.d = eVar;
        this.i = aVar;
    }

    /* loaded from: classes2.dex */
    public static final class c {
        private final String b;
        private final BG c;

        public final String a() {
            return this.b;
        }

        public final BG d() {
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
            BG bg = this.c;
            return "AccessibilityDescription(__typename=" + str + ", localizedStringFragment=" + bg + ")";
        }

        public c(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.b = str;
            this.c = bg;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
        private final BG c;
        private final String d;

        public final BG a() {
            return this.c;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c(this.c, dVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.d;
            BG bg = this.c;
            return "Label(__typename=" + str + ", localizedStringFragment=" + bg + ")";
        }

        public d(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.d = str;
            this.c = bg;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {
        private final AI d;
        private final String e;

        public final AI c() {
            return this.d;
        }

        public final String d() {
            return this.e;
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
            return (this.e.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.e;
            AI ai = this.d;
            return "Field(__typename=" + str + ", booleanFieldFragment=" + ai + ")";
        }

        public e(String str, AI ai) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) ai, "");
            this.e = str;
            this.d = ai;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        private final C0753Bi b;
        private final String e;

        public final String d() {
            return this.e;
        }

        public final C0753Bi e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c(this.b, aVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.e;
            C0753Bi c0753Bi = this.b;
            return "OnChange(__typename=" + str + ", effectRecursion=" + c0753Bi + ")";
        }

        public a(String str, C0753Bi c0753Bi) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0753Bi, "");
            this.e = str;
            this.b = c0753Bi;
        }
    }
}
