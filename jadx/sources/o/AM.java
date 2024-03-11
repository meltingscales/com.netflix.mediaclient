package o;

/* loaded from: classes2.dex */
public final class AM implements InterfaceC9037hy {
    private final String a;
    private final String b;
    private final String c;
    private final AS d;
    private final e e;

    public final String a() {
        return this.b;
    }

    public final e b() {
        return this.e;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public final AS e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AM) {
            AM am = (AM) obj;
            return C8632dsu.c((Object) this.a, (Object) am.a) && C8632dsu.c(this.e, am.e) && C8632dsu.c((Object) this.b, (Object) am.b) && C8632dsu.c((Object) this.c, (Object) am.c) && C8632dsu.c(this.d, am.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        e eVar = this.e;
        int hashCode2 = eVar == null ? 0 : eVar.hashCode();
        String str = this.b;
        int hashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.c;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.a;
        e eVar = this.e;
        String str2 = this.b;
        String str3 = this.c;
        AS as = this.d;
        return "ButtonFragment(__typename=" + str + ", accessibilityDescription=" + eVar + ", trackingInfo=" + str2 + ", loggingViewName=" + str3 + ", buttonLikeFragment=" + as + ")";
    }

    public AM(String str, e eVar, String str2, String str3, AS as) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) as, "");
        this.a = str;
        this.e = eVar;
        this.b = str2;
        this.c = str3;
        this.d = as;
    }

    /* loaded from: classes2.dex */
    public static final class e {
        private final BG a;
        private final String c;

        public final BG a() {
            return this.a;
        }

        public final String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c(this.a, eVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.c;
            BG bg = this.a;
            return "AccessibilityDescription(__typename=" + str + ", localizedStringFragment=" + bg + ")";
        }

        public e(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.c = str;
            this.a = bg;
        }
    }
}
