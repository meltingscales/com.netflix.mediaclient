package o;

import com.netflix.clcs.codegen.type.CLCSButtonType;
import com.netflix.clcs.codegen.type.CLCSModalPresentation;

/* loaded from: classes2.dex */
public final class BD implements InterfaceC9037hy {
    private final c a;
    private final CLCSButtonType b;
    private final d c;
    private final String d;
    private final e e;
    private final a g;
    private final CLCSModalPresentation j;

    public final e a() {
        return this.e;
    }

    public final CLCSModalPresentation b() {
        return this.j;
    }

    public final d c() {
        return this.c;
    }

    public final c d() {
        return this.a;
    }

    public final CLCSButtonType e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BD) {
            BD bd = (BD) obj;
            return C8632dsu.c((Object) this.d, (Object) bd.d) && this.j == bd.j && C8632dsu.c(this.e, bd.e) && C8632dsu.c(this.g, bd.g) && this.b == bd.b && C8632dsu.c(this.c, bd.c) && C8632dsu.c(this.a, bd.a);
        }
        return false;
    }

    public final a f() {
        return this.g;
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        CLCSModalPresentation cLCSModalPresentation = this.j;
        int hashCode2 = cLCSModalPresentation == null ? 0 : cLCSModalPresentation.hashCode();
        e eVar = this.e;
        int hashCode3 = eVar == null ? 0 : eVar.hashCode();
        a aVar = this.g;
        int hashCode4 = aVar == null ? 0 : aVar.hashCode();
        CLCSButtonType cLCSButtonType = this.b;
        int hashCode5 = cLCSButtonType == null ? 0 : cLCSButtonType.hashCode();
        d dVar = this.c;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = this.d;
        CLCSModalPresentation cLCSModalPresentation = this.j;
        e eVar = this.e;
        a aVar = this.g;
        CLCSButtonType cLCSButtonType = this.b;
        d dVar = this.c;
        c cVar = this.a;
        return "ModalFragment(__typename=" + str + ", presentation=" + cLCSModalPresentation + ", backgroundImage=" + eVar + ", style=" + aVar + ", closeButtonType=" + cLCSButtonType + ", onClose=" + dVar + ", content=" + cVar + ")";
    }

    public BD(String str, CLCSModalPresentation cLCSModalPresentation, e eVar, a aVar, CLCSButtonType cLCSButtonType, d dVar, c cVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) cVar, "");
        this.d = str;
        this.j = cLCSModalPresentation;
        this.e = eVar;
        this.g = aVar;
        this.b = cLCSButtonType;
        this.c = dVar;
        this.a = cVar;
    }

    /* loaded from: classes2.dex */
    public static final class e {
        private final String b;
        private final C0767Bw e;

        public final String a() {
            return this.b;
        }

        public final C0767Bw d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.b;
            C0767Bw c0767Bw = this.e;
            return "BackgroundImage(__typename=" + str + ", imageFragment=" + c0767Bw + ")";
        }

        public e(String str, C0767Bw c0767Bw) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0767Bw, "");
            this.b = str;
            this.e = c0767Bw;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        private final String c;
        private final AU d;

        public final AU a() {
            return this.d;
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
                return C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c(this.d, aVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.c;
            AU au = this.d;
            return "Style(__typename=" + str + ", containerStyleFragment=" + au + ")";
        }

        public a(String str, AU au) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) au, "");
            this.c = str;
            this.d = au;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
        private final C0753Bi a;
        private final String d;

        public final String b() {
            return this.d;
        }

        public final C0753Bi d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c(this.a, dVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.d;
            C0753Bi c0753Bi = this.a;
            return "OnClose(__typename=" + str + ", effectRecursion=" + c0753Bi + ")";
        }

        public d(String str, C0753Bi c0753Bi) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0753Bi, "");
            this.d = str;
            this.a = c0753Bi;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        private final String a;
        private final String c;

        public final String b() {
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
                return C8632dsu.c((Object) this.a, (Object) cVar.a) && C8632dsu.c((Object) this.c, (Object) cVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.c;
            return "Content(__typename=" + str + ", key=" + str2 + ")";
        }

        public c(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.a = str;
            this.c = str2;
        }
    }
}
