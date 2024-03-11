package o;

import com.netflix.clcs.codegen.type.CLCSInputSize;

/* renamed from: o.Bt  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0764Bt implements InterfaceC9037hy {
    private final CLCSInputSize a;
    private final String b;
    private final e c;
    private final b d;
    private final String e;
    private final String f;
    private final d g;
    private final String j;

    public final e a() {
        return this.c;
    }

    public final String b() {
        return this.j;
    }

    public final CLCSInputSize c() {
        return this.a;
    }

    public final String d() {
        return this.e;
    }

    public final b e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0764Bt) {
            C0764Bt c0764Bt = (C0764Bt) obj;
            return C8632dsu.c((Object) this.b, (Object) c0764Bt.b) && C8632dsu.c((Object) this.f, (Object) c0764Bt.f) && C8632dsu.c(this.c, c0764Bt.c) && C8632dsu.c(this.d, c0764Bt.d) && C8632dsu.c((Object) this.j, (Object) c0764Bt.j) && this.a == c0764Bt.a && C8632dsu.c(this.g, c0764Bt.g) && C8632dsu.c((Object) this.e, (Object) c0764Bt.e);
        }
        return false;
    }

    public final String g() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        String str = this.f;
        int hashCode2 = str == null ? 0 : str.hashCode();
        e eVar = this.c;
        int hashCode3 = eVar == null ? 0 : eVar.hashCode();
        b bVar = this.d;
        int hashCode4 = bVar == null ? 0 : bVar.hashCode();
        String str2 = this.j;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        CLCSInputSize cLCSInputSize = this.a;
        int hashCode6 = cLCSInputSize == null ? 0 : cLCSInputSize.hashCode();
        d dVar = this.g;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.e.hashCode();
    }

    public final d i() {
        return this.g;
    }

    public final String j() {
        return this.b;
    }

    public String toString() {
        String str = this.b;
        String str2 = this.f;
        e eVar = this.c;
        b bVar = this.d;
        String str3 = this.j;
        CLCSInputSize cLCSInputSize = this.a;
        d dVar = this.g;
        String str4 = this.e;
        return "InputCopyLinkFragment(__typename=" + str + ", trackingInfo=" + str2 + ", button=" + eVar + ", accessibilityDescription=" + bVar + ", loggingViewName=" + str3 + ", inputSize=" + cLCSInputSize + ", text=" + dVar + ", copyText=" + str4 + ")";
    }

    public C0764Bt(String str, String str2, e eVar, b bVar, String str3, CLCSInputSize cLCSInputSize, d dVar, String str4) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str4, "");
        this.b = str;
        this.f = str2;
        this.c = eVar;
        this.d = bVar;
        this.j = str3;
        this.a = cLCSInputSize;
        this.g = dVar;
        this.e = str4;
    }

    /* renamed from: o.Bt$e */
    /* loaded from: classes2.dex */
    public static final class e {
        private final String b;
        private final AS c;

        public final String a() {
            return this.b;
        }

        public final AS e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && C8632dsu.c(this.c, eVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.b;
            AS as = this.c;
            return "Button(__typename=" + str + ", buttonLikeFragment=" + as + ")";
        }

        public e(String str, AS as) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) as, "");
            this.b = str;
            this.c = as;
        }
    }

    /* renamed from: o.Bt$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private final BG d;
        private final String e;

        public final BG c() {
            return this.d;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c(this.d, bVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.e;
            BG bg = this.d;
            return "AccessibilityDescription(__typename=" + str + ", localizedStringFragment=" + bg + ")";
        }

        public b(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.e = str;
            this.d = bg;
        }
    }

    /* renamed from: o.Bt$d */
    /* loaded from: classes2.dex */
    public static final class d {
        private final String c;
        private final BG d;

        public final BG d() {
            return this.d;
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
                return C8632dsu.c((Object) this.c, (Object) dVar.c) && C8632dsu.c(this.d, dVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.c;
            BG bg = this.d;
            return "Text(__typename=" + str + ", localizedStringFragment=" + bg + ")";
        }

        public d(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.c = str;
            this.d = bg;
        }
    }
}
