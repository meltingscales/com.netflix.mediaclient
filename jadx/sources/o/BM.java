package o;

import com.netflix.clcs.codegen.type.CLCSPinEntrySize;

/* loaded from: classes2.dex */
public final class BM implements InterfaceC9037hy {
    private final String a;
    private final Integer b;
    private final String c;
    private final c d;
    private final e e;
    private final a f;
    private final d g;
    private final CLCSPinEntrySize h;
    private final b i;
    private final String j;

    public final c a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final d c() {
        return this.g;
    }

    public final Integer d() {
        return this.b;
    }

    public final e e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BM) {
            BM bm = (BM) obj;
            return C8632dsu.c((Object) this.a, (Object) bm.a) && C8632dsu.c(this.e, bm.e) && C8632dsu.c((Object) this.j, (Object) bm.j) && C8632dsu.c((Object) this.c, (Object) bm.c) && C8632dsu.c(this.i, bm.i) && C8632dsu.c(this.f, bm.f) && C8632dsu.c(this.b, bm.b) && this.h == bm.h && C8632dsu.c(this.d, bm.d) && C8632dsu.c(this.g, bm.g);
        }
        return false;
    }

    public final String f() {
        return this.a;
    }

    public final CLCSPinEntrySize g() {
        return this.h;
    }

    public final String h() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        e eVar = this.e;
        int hashCode2 = eVar == null ? 0 : eVar.hashCode();
        String str = this.j;
        int hashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.c;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        b bVar = this.i;
        int hashCode5 = bVar == null ? 0 : bVar.hashCode();
        a aVar = this.f;
        int hashCode6 = aVar == null ? 0 : aVar.hashCode();
        Integer num = this.b;
        int hashCode7 = num == null ? 0 : num.hashCode();
        CLCSPinEntrySize cLCSPinEntrySize = this.h;
        int hashCode8 = cLCSPinEntrySize == null ? 0 : cLCSPinEntrySize.hashCode();
        c cVar = this.d;
        int hashCode9 = cVar == null ? 0 : cVar.hashCode();
        d dVar = this.g;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (dVar != null ? dVar.hashCode() : 0);
    }

    public final a i() {
        return this.f;
    }

    public final b j() {
        return this.i;
    }

    public String toString() {
        String str = this.a;
        e eVar = this.e;
        String str2 = this.j;
        String str3 = this.c;
        b bVar = this.i;
        a aVar = this.f;
        Integer num = this.b;
        CLCSPinEntrySize cLCSPinEntrySize = this.h;
        c cVar = this.d;
        d dVar = this.g;
        return "PinEntryFragment(__typename=" + str + ", accessibilityDescription=" + eVar + ", trackingInfo=" + str2 + ", loggingViewName=" + str3 + ", typography=" + bVar + ", textColor=" + aVar + ", length=" + num + ", pinEntrySize=" + cLCSPinEntrySize + ", field=" + cVar + ", onChange=" + dVar + ")";
    }

    public BM(String str, e eVar, String str2, String str3, b bVar, a aVar, Integer num, CLCSPinEntrySize cLCSPinEntrySize, c cVar, d dVar) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.e = eVar;
        this.j = str2;
        this.c = str3;
        this.i = bVar;
        this.f = aVar;
        this.b = num;
        this.h = cLCSPinEntrySize;
        this.d = cVar;
        this.g = dVar;
    }

    /* loaded from: classes2.dex */
    public static final class e {
        private final BG b;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final BG d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.e, (Object) eVar.e) && C8632dsu.c(this.b, eVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.e;
            BG bg = this.b;
            return "AccessibilityDescription(__typename=" + str + ", localizedStringFragment=" + bg + ")";
        }

        public e(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.e = str;
            this.b = bg;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        private final String a;
        private final C0779Cg b;

        public final String c() {
            return this.a;
        }

        public final C0779Cg e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c(this.b, bVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            C0779Cg c0779Cg = this.b;
            return "Typography(__typename=" + str + ", typographyFragment=" + c0779Cg + ")";
        }

        public b(String str, C0779Cg c0779Cg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0779Cg, "");
            this.a = str;
            this.b = c0779Cg;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        private final AW b;
        private final String c;

        public final String a() {
            return this.c;
        }

        public final AW d() {
            return this.b;
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
            AW aw = this.b;
            return "TextColor(__typename=" + str + ", colorFragment=" + aw + ")";
        }

        public a(String str, AW aw) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) aw, "");
            this.c = str;
            this.b = aw;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        private final String a;
        private final BU c;

        public final BU a() {
            return this.c;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.a, (Object) cVar.a) && C8632dsu.c(this.c, cVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.a;
            BU bu = this.c;
            return "Field(__typename=" + str + ", stringFieldFragment=" + bu + ")";
        }

        public c(String str, BU bu) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bu, "");
            this.a = str;
            this.c = bu;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
        private final C0753Bi b;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final C0753Bi d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c(this.b, dVar.b);
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

        public d(String str, C0753Bi c0753Bi) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0753Bi, "");
            this.e = str;
            this.b = c0753Bi;
        }
    }
}
