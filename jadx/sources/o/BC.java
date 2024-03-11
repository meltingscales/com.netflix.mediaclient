package o;

import com.netflix.clcs.codegen.type.CLCSInputSize;
import com.netflix.clcs.codegen.type.CLCSInputType;

/* loaded from: classes2.dex */
public final class BC implements InterfaceC9037hy {
    private final c a;
    private final b b;
    private final String c;
    private final a d;
    private final e e;
    private final CLCSInputSize f;
    private final i g;
    private final CLCSInputType h;
    private final d i;
    private final String j;

    public final b a() {
        return this.b;
    }

    public final e b() {
        return this.e;
    }

    public final c c() {
        return this.a;
    }

    public final a d() {
        return this.d;
    }

    public final CLCSInputSize e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BC) {
            BC bc = (BC) obj;
            return C8632dsu.c((Object) this.c, (Object) bc.c) && C8632dsu.c(this.a, bc.a) && C8632dsu.c((Object) this.j, (Object) bc.j) && C8632dsu.c(this.e, bc.e) && this.f == bc.f && this.h == bc.h && C8632dsu.c(this.d, bc.d) && C8632dsu.c(this.g, bc.g) && C8632dsu.c(this.i, bc.i) && C8632dsu.c(this.b, bc.b);
        }
        return false;
    }

    public final i f() {
        return this.g;
    }

    public final String g() {
        return this.c;
    }

    public final String h() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        c cVar = this.a;
        int hashCode2 = cVar == null ? 0 : cVar.hashCode();
        String str = this.j;
        int hashCode3 = str == null ? 0 : str.hashCode();
        e eVar = this.e;
        int hashCode4 = eVar == null ? 0 : eVar.hashCode();
        CLCSInputSize cLCSInputSize = this.f;
        int hashCode5 = cLCSInputSize == null ? 0 : cLCSInputSize.hashCode();
        CLCSInputType cLCSInputType = this.h;
        int hashCode6 = cLCSInputType == null ? 0 : cLCSInputType.hashCode();
        a aVar = this.d;
        int hashCode7 = aVar == null ? 0 : aVar.hashCode();
        i iVar = this.g;
        int hashCode8 = iVar == null ? 0 : iVar.hashCode();
        d dVar = this.i;
        int hashCode9 = dVar == null ? 0 : dVar.hashCode();
        b bVar = this.b;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (bVar != null ? bVar.hashCode() : 0);
    }

    public final d i() {
        return this.i;
    }

    public final CLCSInputType j() {
        return this.h;
    }

    public String toString() {
        String str = this.c;
        c cVar = this.a;
        String str2 = this.j;
        e eVar = this.e;
        CLCSInputSize cLCSInputSize = this.f;
        CLCSInputType cLCSInputType = this.h;
        a aVar = this.d;
        i iVar = this.g;
        d dVar = this.i;
        b bVar = this.b;
        return "InputFragment(__typename=" + str + ", accessibilityDescription=" + cVar + ", trackingInfo=" + str2 + ", field=" + eVar + ", inputSize=" + cLCSInputSize + ", inputType=" + cLCSInputType + ", icon=" + aVar + ", placeholder=" + iVar + ", onChange=" + dVar + ", initialErrorMessage=" + bVar + ")";
    }

    public BC(String str, c cVar, String str2, e eVar, CLCSInputSize cLCSInputSize, CLCSInputType cLCSInputType, a aVar, i iVar, d dVar, b bVar) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.a = cVar;
        this.j = str2;
        this.e = eVar;
        this.f = cLCSInputSize;
        this.h = cLCSInputType;
        this.d = aVar;
        this.g = iVar;
        this.i = dVar;
        this.b = bVar;
    }

    /* loaded from: classes2.dex */
    public static final class c {
        private final String b;
        private final BG e;

        public final String d() {
            return this.b;
        }

        public final BG e() {
            return this.e;
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
            BG bg = this.e;
            return "AccessibilityDescription(__typename=" + str + ", localizedStringFragment=" + bg + ")";
        }

        public c(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.b = str;
            this.e = bg;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {
        private final BU c;
        private final String d;

        public final BU a() {
            return this.c;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && C8632dsu.c(this.c, eVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.d;
            BU bu = this.c;
            return "Field(__typename=" + str + ", stringFieldFragment=" + bu + ")";
        }

        public e(String str, BU bu) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bu, "");
            this.d = str;
            this.c = bu;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        private final String a;
        private final C0746Bb e;

        public final C0746Bb c() {
            return this.e;
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
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c(this.e, aVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.a;
            C0746Bb c0746Bb = this.e;
            return "Icon(__typename=" + str + ", designIconFragment=" + c0746Bb + ")";
        }

        public a(String str, C0746Bb c0746Bb) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0746Bb, "");
            this.a = str;
            this.e = c0746Bb;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i {
        private final String a;
        private final BG c;

        public final String b() {
            return this.a;
        }

        public final BG e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c((Object) this.a, (Object) iVar.a) && C8632dsu.c(this.c, iVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.a;
            BG bg = this.c;
            return "Placeholder(__typename=" + str + ", localizedStringFragment=" + bg + ")";
        }

        public i(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.a = str;
            this.c = bg;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
        private final C0753Bi c;
        private final String e;

        public final String c() {
            return this.e;
        }

        public final C0753Bi d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c(this.c, dVar.c);
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

        public d(String str, C0753Bi c0753Bi) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0753Bi, "");
            this.e = str;
            this.c = c0753Bi;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        private final BG b;
        private final String d;

        public final BG a() {
            return this.b;
        }

        public final String b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.d, (Object) bVar.d) && C8632dsu.c(this.b, bVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.d;
            BG bg = this.b;
            return "InitialErrorMessage(__typename=" + str + ", localizedStringFragment=" + bg + ")";
        }

        public b(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.d = str;
            this.b = bg;
        }
    }
}
