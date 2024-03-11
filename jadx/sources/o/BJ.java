package o;

import com.netflix.clcs.codegen.type.CLCSInputSize;
import com.netflix.clcs.codegen.type.CLCSInputStyle;
import java.util.List;

/* loaded from: classes2.dex */
public final class BJ implements InterfaceC9037hy {
    private final String a;
    private final List<d> b;
    private final e c;
    private final a d;
    private final b e;
    private final String f;
    private final i g;
    private final CLCSInputSize h;
    private final g i;
    private final CLCSInputStyle j;
    private final f l;
    private final String n;

    /* renamed from: o  reason: collision with root package name */
    private final h f13348o;

    public final b a() {
        return this.e;
    }

    public final List<d> b() {
        return this.b;
    }

    public final a c() {
        return this.d;
    }

    public final CLCSInputSize d() {
        return this.h;
    }

    public final e e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BJ) {
            BJ bj = (BJ) obj;
            return C8632dsu.c((Object) this.a, (Object) bj.a) && C8632dsu.c(this.e, bj.e) && C8632dsu.c((Object) this.n, (Object) bj.n) && C8632dsu.c((Object) this.f, (Object) bj.f) && C8632dsu.c(this.b, bj.b) && C8632dsu.c(this.c, bj.c) && C8632dsu.c(this.f13348o, bj.f13348o) && this.h == bj.h && this.j == bj.j && C8632dsu.c(this.l, bj.l) && C8632dsu.c(this.i, bj.i) && C8632dsu.c(this.g, bj.g) && C8632dsu.c(this.d, bj.d);
        }
        return false;
    }

    public final i f() {
        return this.g;
    }

    public final String g() {
        return this.f;
    }

    public final h h() {
        return this.f13348o;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        b bVar = this.e;
        int hashCode2 = bVar == null ? 0 : bVar.hashCode();
        String str = this.n;
        int hashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.f;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        List<d> list = this.b;
        int hashCode5 = list == null ? 0 : list.hashCode();
        e eVar = this.c;
        int hashCode6 = eVar == null ? 0 : eVar.hashCode();
        h hVar = this.f13348o;
        int hashCode7 = hVar == null ? 0 : hVar.hashCode();
        CLCSInputSize cLCSInputSize = this.h;
        int hashCode8 = cLCSInputSize == null ? 0 : cLCSInputSize.hashCode();
        CLCSInputStyle cLCSInputStyle = this.j;
        int hashCode9 = cLCSInputStyle == null ? 0 : cLCSInputStyle.hashCode();
        f fVar = this.l;
        int hashCode10 = fVar == null ? 0 : fVar.hashCode();
        g gVar = this.i;
        int hashCode11 = gVar == null ? 0 : gVar.hashCode();
        i iVar = this.g;
        int hashCode12 = iVar == null ? 0 : iVar.hashCode();
        a aVar = this.d;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (aVar != null ? aVar.hashCode() : 0);
    }

    public final CLCSInputStyle i() {
        return this.j;
    }

    public final g j() {
        return this.i;
    }

    public final String k() {
        return this.n;
    }

    public final String l() {
        return this.a;
    }

    public final f n() {
        return this.l;
    }

    public String toString() {
        String str = this.a;
        b bVar = this.e;
        String str2 = this.n;
        String str3 = this.f;
        List<d> list = this.b;
        e eVar = this.c;
        h hVar = this.f13348o;
        CLCSInputSize cLCSInputSize = this.h;
        CLCSInputStyle cLCSInputStyle = this.j;
        f fVar = this.l;
        g gVar = this.i;
        i iVar = this.g;
        a aVar = this.d;
        return "PhoneInputFragment(__typename=" + str + ", accessibilityDescription=" + bVar + ", trackingInfo=" + str2 + ", loggingViewName=" + str3 + ", countries=" + list + ", countryCodeField=" + eVar + ", phoneNumberField=" + hVar + ", inputSize=" + cLCSInputSize + ", inputStyle=" + cLCSInputStyle + ", phoneNumberPlaceholder=" + fVar + ", onChange=" + gVar + ", onFocus=" + iVar + ", initialErrorMessage=" + aVar + ")";
    }

    public BJ(String str, b bVar, String str2, String str3, List<d> list, e eVar, h hVar, CLCSInputSize cLCSInputSize, CLCSInputStyle cLCSInputStyle, f fVar, g gVar, i iVar, a aVar) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.e = bVar;
        this.n = str2;
        this.f = str3;
        this.b = list;
        this.c = eVar;
        this.f13348o = hVar;
        this.h = cLCSInputSize;
        this.j = cLCSInputStyle;
        this.l = fVar;
        this.i = gVar;
        this.g = iVar;
        this.d = aVar;
    }

    /* loaded from: classes2.dex */
    public static final class b {
        private final String c;
        private final BG e;

        public final String c() {
            return this.c;
        }

        public final BG e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c(this.e, bVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.c;
            BG bg = this.e;
            return "AccessibilityDescription(__typename=" + str + ", localizedStringFragment=" + bg + ")";
        }

        public b(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.c = str;
            this.e = bg;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
        private final String b;
        private final c c;
        private final String d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.d;
        }

        public final c e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c(this.c, dVar.c) && C8632dsu.c((Object) this.e, (Object) dVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = this.d.hashCode();
            c cVar = this.c;
            int hashCode3 = cVar == null ? 0 : cVar.hashCode();
            String str = this.e;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.d;
            c cVar = this.c;
            String str3 = this.e;
            return "Country(__typename=" + str + ", code=" + str2 + ", name=" + cVar + ", phoneCodePrefix=" + str3 + ")";
        }

        public d(String str, String str2, c cVar, String str3) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.b = str;
            this.d = str2;
            this.c = cVar;
            this.e = str3;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {
        private final String b;
        private final BU d;

        public final String a() {
            return this.b;
        }

        public final BU b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && C8632dsu.c(this.d, eVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.b;
            BU bu = this.d;
            return "CountryCodeField(__typename=" + str + ", stringFieldFragment=" + bu + ")";
        }

        public e(String str, BU bu) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bu, "");
            this.b = str;
            this.d = bu;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h {
        private final String c;
        private final BU e;

        public final String a() {
            return this.c;
        }

        public final BU c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c((Object) this.c, (Object) hVar.c) && C8632dsu.c(this.e, hVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.c;
            BU bu = this.e;
            return "PhoneNumberField(__typename=" + str + ", stringFieldFragment=" + bu + ")";
        }

        public h(String str, BU bu) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bu, "");
            this.c = str;
            this.e = bu;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f {
        private final BG b;
        private final String c;

        public final BG b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return C8632dsu.c((Object) this.c, (Object) fVar.c) && C8632dsu.c(this.b, fVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.c;
            BG bg = this.b;
            return "PhoneNumberPlaceholder(__typename=" + str + ", localizedStringFragment=" + bg + ")";
        }

        public f(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.c = str;
            this.b = bg;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g {
        private final C0753Bi c;
        private final String e;

        public final C0753Bi a() {
            return this.c;
        }

        public final String c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.e, (Object) gVar.e) && C8632dsu.c(this.c, gVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.e;
            C0753Bi c0753Bi = this.c;
            return "OnChange(__typename=" + str + ", effectRecursion=" + c0753Bi + ")";
        }

        public g(String str, C0753Bi c0753Bi) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0753Bi, "");
            this.e = str;
            this.c = c0753Bi;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i {
        private final C0753Bi a;
        private final String e;

        public final C0753Bi a() {
            return this.a;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c((Object) this.e, (Object) iVar.e) && C8632dsu.c(this.a, iVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.e;
            C0753Bi c0753Bi = this.a;
            return "OnFocus(__typename=" + str + ", effectRecursion=" + c0753Bi + ")";
        }

        public i(String str, C0753Bi c0753Bi) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0753Bi, "");
            this.e = str;
            this.a = c0753Bi;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        private final String a;
        private final BG c;

        public final BG c() {
            return this.c;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c(this.c, aVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.a;
            BG bg = this.c;
            return "InitialErrorMessage(__typename=" + str + ", localizedStringFragment=" + bg + ")";
        }

        public a(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.a = str;
            this.c = bg;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        private final String d;
        private final BG e;

        public final BG a() {
            return this.e;
        }

        public final String c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c(this.e, cVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.d;
            BG bg = this.e;
            return "Name(__typename=" + str + ", localizedStringFragment=" + bg + ")";
        }

        public c(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.d = str;
            this.e = bg;
        }
    }
}
