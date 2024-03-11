package o;

import com.netflix.clcs.codegen.type.CLCSDesignTheme;
import com.netflix.clcs.codegen.type.CLCSFieldValueProvider;
import java.util.List;

/* loaded from: classes2.dex */
public final class BR implements InterfaceC9037hy {
    private final String a;
    private final String b;
    private final a c;
    private final List<d> d;
    private final String e;
    private final f f;
    private final String g;
    private final e h;
    private final CLCSDesignTheme i;
    private final j j;
    private final String l;

    public final List<d> a() {
        return this.d;
    }

    public final e b() {
        return this.h;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.b;
    }

    public final a e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BR) {
            BR br = (BR) obj;
            return C8632dsu.c((Object) this.a, (Object) br.a) && C8632dsu.c((Object) this.g, (Object) br.g) && C8632dsu.c(this.c, br.c) && this.i == br.i && C8632dsu.c(this.h, br.h) && C8632dsu.c(this.j, br.j) && C8632dsu.c(this.f, br.f) && C8632dsu.c((Object) this.l, (Object) br.l) && C8632dsu.c((Object) this.e, (Object) br.e) && C8632dsu.c(this.d, br.d) && C8632dsu.c((Object) this.b, (Object) br.b);
        }
        return false;
    }

    public final String f() {
        return this.l;
    }

    public final j g() {
        return this.j;
    }

    public final String h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.g.hashCode();
        int hashCode3 = this.c.hashCode();
        CLCSDesignTheme cLCSDesignTheme = this.i;
        int hashCode4 = cLCSDesignTheme == null ? 0 : cLCSDesignTheme.hashCode();
        e eVar = this.h;
        int hashCode5 = eVar == null ? 0 : eVar.hashCode();
        j jVar = this.j;
        int hashCode6 = jVar == null ? 0 : jVar.hashCode();
        f fVar = this.f;
        int hashCode7 = fVar == null ? 0 : fVar.hashCode();
        String str = this.l;
        int hashCode8 = str == null ? 0 : str.hashCode();
        String str2 = this.e;
        int hashCode9 = str2 == null ? 0 : str2.hashCode();
        List<d> list = this.d;
        int hashCode10 = list == null ? 0 : list.hashCode();
        String str3 = this.b;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final CLCSDesignTheme i() {
        return this.i;
    }

    public final f j() {
        return this.f;
    }

    public final String l() {
        return this.a;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.g;
        a aVar = this.c;
        CLCSDesignTheme cLCSDesignTheme = this.i;
        e eVar = this.h;
        j jVar = this.j;
        f fVar = this.f;
        String str3 = this.l;
        String str4 = this.e;
        List<d> list = this.d;
        String str5 = this.b;
        return "ScreenFragment(__typename=" + str + ", serverState=" + str2 + ", componentTree=" + aVar + ", theme=" + cLCSDesignTheme + ", onBackControl=" + eVar + ", onRender=" + jVar + ", onUnload=" + fVar + ", trackingInfo=" + str3 + ", loggingViewName=" + str4 + ", fieldInitialization=" + list + ", navigationMarker=" + str5 + ")";
    }

    public BR(String str, String str2, a aVar, CLCSDesignTheme cLCSDesignTheme, e eVar, j jVar, f fVar, String str3, String str4, List<d> list, String str5) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) aVar, "");
        this.a = str;
        this.g = str2;
        this.c = aVar;
        this.i = cLCSDesignTheme;
        this.h = eVar;
        this.j = jVar;
        this.f = fVar;
        this.l = str3;
        this.e = str4;
        this.d = list;
        this.b = str5;
    }

    /* loaded from: classes2.dex */
    public static final class a {
        private final String b;
        private final i c;
        private final String d;
        private final List<b> e;

        public final i a() {
            return this.c;
        }

        public final String c() {
            return this.d;
        }

        public final List<b> d() {
            return this.e;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c(this.e, aVar.e) && C8632dsu.c(this.c, aVar.c) && C8632dsu.c((Object) this.b, (Object) aVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            List<b> list = this.e;
            int hashCode2 = list == null ? 0 : list.hashCode();
            int hashCode3 = this.c.hashCode();
            String str = this.b;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            List<b> list = this.e;
            i iVar = this.c;
            String str2 = this.b;
            return "ComponentTree(__typename=" + str + ", nodes=" + list + ", root=" + iVar + ", initialFocusKey=" + str2 + ")";
        }

        public a(String str, List<b> list, i iVar, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) iVar, "");
            this.d = str;
            this.e = list;
            this.c = iVar;
            this.b = str2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {
        private final C0753Bi b;
        private final String d;

        public final C0753Bi b() {
            return this.b;
        }

        public final String c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && C8632dsu.c(this.b, eVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.d;
            C0753Bi c0753Bi = this.b;
            return "OnBackControl(__typename=" + str + ", effectRecursion=" + c0753Bi + ")";
        }

        public e(String str, C0753Bi c0753Bi) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0753Bi, "");
            this.d = str;
            this.b = c0753Bi;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j {
        private final C0753Bi d;
        private final String e;

        public final C0753Bi a() {
            return this.d;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c((Object) this.e, (Object) jVar.e) && C8632dsu.c(this.d, jVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.e;
            C0753Bi c0753Bi = this.d;
            return "OnRender(__typename=" + str + ", effectRecursion=" + c0753Bi + ")";
        }

        public j(String str, C0753Bi c0753Bi) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0753Bi, "");
            this.e = str;
            this.d = c0753Bi;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f {
        private final String d;
        private final C0753Bi e;

        public final C0753Bi b() {
            return this.e;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return C8632dsu.c((Object) this.d, (Object) fVar.d) && C8632dsu.c(this.e, fVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.d;
            C0753Bi c0753Bi = this.e;
            return "OnUnload(__typename=" + str + ", effectRecursion=" + c0753Bi + ")";
        }

        public f(String str, C0753Bi c0753Bi) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0753Bi, "");
            this.d = str;
            this.e = c0753Bi;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
        private final c b;
        private final CLCSFieldValueProvider c;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final CLCSFieldValueProvider b() {
            return this.c;
        }

        public final c c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c(this.b, dVar.b) && this.c == dVar.c;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            c cVar = this.b;
            int hashCode2 = cVar == null ? 0 : cVar.hashCode();
            CLCSFieldValueProvider cLCSFieldValueProvider = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (cLCSFieldValueProvider != null ? cLCSFieldValueProvider.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            c cVar = this.b;
            CLCSFieldValueProvider cLCSFieldValueProvider = this.c;
            return "FieldInitialization(__typename=" + str + ", field=" + cVar + ", valueProvider=" + cLCSFieldValueProvider + ")";
        }

        public d(String str, c cVar, CLCSFieldValueProvider cLCSFieldValueProvider) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.b = cVar;
            this.c = cLCSFieldValueProvider;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        private final AV a;
        private final String b;

        public final AV a() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c(this.a, bVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.b;
            AV av = this.a;
            return "Node(__typename=" + str + ", componentFragment=" + av + ")";
        }

        public b(String str, AV av) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) av, "");
            this.b = str;
            this.a = av;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i {
        private final String d;
        private final String e;

        public final String b() {
            return this.d;
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
                return C8632dsu.c((Object) this.e, (Object) iVar.e) && C8632dsu.c((Object) this.d, (Object) iVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.e;
            String str2 = this.d;
            return "Root(__typename=" + str + ", key=" + str2 + ")";
        }

        public i(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.e = str;
            this.d = str2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        private final String a;
        private final C0751Bg e;

        public final C0751Bg b() {
            return this.e;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.a, (Object) cVar.a) && C8632dsu.c(this.e, cVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.a;
            C0751Bg c0751Bg = this.e;
            return "Field(__typename=" + str + ", fieldFragment=" + c0751Bg + ")";
        }

        public c(String str, C0751Bg c0751Bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0751Bg, "");
            this.a = str;
            this.e = c0751Bg;
        }
    }
}
