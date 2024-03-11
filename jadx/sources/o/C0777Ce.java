package o;

import com.netflix.clcs.codegen.type.CLCSTextAlignment;

/* renamed from: o.Ce  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0777Ce implements InterfaceC9037hy {
    private final String a;
    private final CLCSTextAlignment b;
    private final b c;
    private final e d;
    private final c e;
    private final j f;
    private final g h;
    private final h i;
    private final f j;

    public final b a() {
        return this.c;
    }

    public final e b() {
        return this.d;
    }

    public final h c() {
        return this.i;
    }

    public final CLCSTextAlignment d() {
        return this.b;
    }

    public final c e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0777Ce) {
            C0777Ce c0777Ce = (C0777Ce) obj;
            return C8632dsu.c((Object) this.a, (Object) c0777Ce.a) && C8632dsu.c(this.e, c0777Ce.e) && C8632dsu.c(this.h, c0777Ce.h) && C8632dsu.c(this.f, c0777Ce.f) && C8632dsu.c(this.c, c0777Ce.c) && this.b == c0777Ce.b && C8632dsu.c(this.d, c0777Ce.d) && C8632dsu.c(this.i, c0777Ce.i) && C8632dsu.c(this.j, c0777Ce.j);
        }
        return false;
    }

    public final f f() {
        return this.j;
    }

    public final String g() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        c cVar = this.e;
        int hashCode2 = cVar == null ? 0 : cVar.hashCode();
        g gVar = this.h;
        int hashCode3 = gVar == null ? 0 : gVar.hashCode();
        j jVar = this.f;
        int hashCode4 = jVar == null ? 0 : jVar.hashCode();
        b bVar = this.c;
        int hashCode5 = bVar == null ? 0 : bVar.hashCode();
        CLCSTextAlignment cLCSTextAlignment = this.b;
        int hashCode6 = cLCSTextAlignment == null ? 0 : cLCSTextAlignment.hashCode();
        e eVar = this.d;
        int hashCode7 = eVar == null ? 0 : eVar.hashCode();
        h hVar = this.i;
        int hashCode8 = hVar == null ? 0 : hVar.hashCode();
        f fVar = this.j;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (fVar != null ? fVar.hashCode() : 0);
    }

    public final g i() {
        return this.h;
    }

    public final j j() {
        return this.f;
    }

    public String toString() {
        String str = this.a;
        c cVar = this.e;
        g gVar = this.h;
        j jVar = this.f;
        b bVar = this.c;
        CLCSTextAlignment cLCSTextAlignment = this.b;
        e eVar = this.d;
        h hVar = this.i;
        f fVar = this.j;
        return "TextFragment(__typename=" + str + ", accessibilityDescription=" + cVar + ", typography=" + gVar + ", typographyResponsive=" + jVar + ", color=" + bVar + ", alignment=" + cLCSTextAlignment + ", alignmentResponsive=" + eVar + ", plainContent=" + hVar + ", richContent=" + fVar + ")";
    }

    public C0777Ce(String str, c cVar, g gVar, j jVar, b bVar, CLCSTextAlignment cLCSTextAlignment, e eVar, h hVar, f fVar) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.e = cVar;
        this.h = gVar;
        this.f = jVar;
        this.c = bVar;
        this.b = cLCSTextAlignment;
        this.d = eVar;
        this.i = hVar;
        this.j = fVar;
    }

    /* renamed from: o.Ce$c */
    /* loaded from: classes2.dex */
    public static final class c {
        private final BG a;
        private final String b;

        public final BG b() {
            return this.a;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c(this.a, cVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.b;
            BG bg = this.a;
            return "AccessibilityDescription(__typename=" + str + ", localizedStringFragment=" + bg + ")";
        }

        public c(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.b = str;
            this.a = bg;
        }
    }

    /* renamed from: o.Ce$g */
    /* loaded from: classes2.dex */
    public static final class g {
        private final String a;
        private final C0779Cg d;

        public final String b() {
            return this.a;
        }

        public final C0779Cg e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.a, (Object) gVar.a) && C8632dsu.c(this.d, gVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.a;
            C0779Cg c0779Cg = this.d;
            return "Typography(__typename=" + str + ", typographyFragment=" + c0779Cg + ")";
        }

        public g(String str, C0779Cg c0779Cg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0779Cg, "");
            this.a = str;
            this.d = c0779Cg;
        }
    }

    /* renamed from: o.Ce$j */
    /* loaded from: classes2.dex */
    public static final class j {
        private final String a;
        private final i b;
        private final d c;
        private final a d;
        private final k e;
        private final o i;

        public final o a() {
            return this.i;
        }

        public final d b() {
            return this.c;
        }

        public final i c() {
            return this.b;
        }

        public final k d() {
            return this.e;
        }

        public final a e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c((Object) this.a, (Object) jVar.a) && C8632dsu.c(this.i, jVar.i) && C8632dsu.c(this.b, jVar.b) && C8632dsu.c(this.c, jVar.c) && C8632dsu.c(this.d, jVar.d) && C8632dsu.c(this.e, jVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            o oVar = this.i;
            int hashCode2 = oVar == null ? 0 : oVar.hashCode();
            i iVar = this.b;
            int hashCode3 = iVar == null ? 0 : iVar.hashCode();
            d dVar = this.c;
            int hashCode4 = dVar == null ? 0 : dVar.hashCode();
            a aVar = this.d;
            int hashCode5 = aVar == null ? 0 : aVar.hashCode();
            k kVar = this.e;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (kVar != null ? kVar.hashCode() : 0);
        }

        public final String j() {
            return this.a;
        }

        public String toString() {
            String str = this.a;
            o oVar = this.i;
            i iVar = this.b;
            d dVar = this.c;
            a aVar = this.d;
            k kVar = this.e;
            return "TypographyResponsive(__typename=" + str + ", xs=" + oVar + ", s=" + iVar + ", m=" + dVar + ", l=" + aVar + ", xl=" + kVar + ")";
        }

        public j(String str, o oVar, i iVar, d dVar, a aVar, k kVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.i = oVar;
            this.b = iVar;
            this.c = dVar;
            this.d = aVar;
            this.e = kVar;
        }
    }

    /* renamed from: o.Ce$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private final AW b;
        private final String c;

        public final String b() {
            return this.c;
        }

        public final AW e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c(this.b, bVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.c;
            AW aw = this.b;
            return "Color(__typename=" + str + ", colorFragment=" + aw + ")";
        }

        public b(String str, AW aw) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) aw, "");
            this.c = str;
            this.b = aw;
        }
    }

    /* renamed from: o.Ce$e */
    /* loaded from: classes2.dex */
    public static final class e {
        private final CLCSTextAlignment a;
        private final String b;
        private final CLCSTextAlignment c;
        private final CLCSTextAlignment d;
        private final CLCSTextAlignment e;
        private final CLCSTextAlignment i;

        public final CLCSTextAlignment a() {
            return this.e;
        }

        public final CLCSTextAlignment b() {
            return this.c;
        }

        public final CLCSTextAlignment c() {
            return this.a;
        }

        public final CLCSTextAlignment d() {
            return this.d;
        }

        public final CLCSTextAlignment e() {
            return this.i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && this.i == eVar.i && this.d == eVar.d && this.c == eVar.c && this.a == eVar.a && this.e == eVar.e;
            }
            return false;
        }

        public final String g() {
            return this.b;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            CLCSTextAlignment cLCSTextAlignment = this.i;
            int hashCode2 = cLCSTextAlignment == null ? 0 : cLCSTextAlignment.hashCode();
            CLCSTextAlignment cLCSTextAlignment2 = this.d;
            int hashCode3 = cLCSTextAlignment2 == null ? 0 : cLCSTextAlignment2.hashCode();
            CLCSTextAlignment cLCSTextAlignment3 = this.c;
            int hashCode4 = cLCSTextAlignment3 == null ? 0 : cLCSTextAlignment3.hashCode();
            CLCSTextAlignment cLCSTextAlignment4 = this.a;
            int hashCode5 = cLCSTextAlignment4 == null ? 0 : cLCSTextAlignment4.hashCode();
            CLCSTextAlignment cLCSTextAlignment5 = this.e;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (cLCSTextAlignment5 != null ? cLCSTextAlignment5.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            CLCSTextAlignment cLCSTextAlignment = this.i;
            CLCSTextAlignment cLCSTextAlignment2 = this.d;
            CLCSTextAlignment cLCSTextAlignment3 = this.c;
            CLCSTextAlignment cLCSTextAlignment4 = this.a;
            CLCSTextAlignment cLCSTextAlignment5 = this.e;
            return "AlignmentResponsive(__typename=" + str + ", xs=" + cLCSTextAlignment + ", s=" + cLCSTextAlignment2 + ", m=" + cLCSTextAlignment3 + ", l=" + cLCSTextAlignment4 + ", xl=" + cLCSTextAlignment5 + ")";
        }

        public e(String str, CLCSTextAlignment cLCSTextAlignment, CLCSTextAlignment cLCSTextAlignment2, CLCSTextAlignment cLCSTextAlignment3, CLCSTextAlignment cLCSTextAlignment4, CLCSTextAlignment cLCSTextAlignment5) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.i = cLCSTextAlignment;
            this.d = cLCSTextAlignment2;
            this.c = cLCSTextAlignment3;
            this.a = cLCSTextAlignment4;
            this.e = cLCSTextAlignment5;
        }
    }

    /* renamed from: o.Ce$h */
    /* loaded from: classes2.dex */
    public static final class h {
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
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c((Object) this.e, (Object) hVar.e) && C8632dsu.c(this.b, hVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.e;
            BG bg = this.b;
            return "PlainContent(__typename=" + str + ", localizedStringFragment=" + bg + ")";
        }

        public h(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.e = str;
            this.b = bg;
        }
    }

    /* renamed from: o.Ce$f */
    /* loaded from: classes2.dex */
    public static final class f {
        private final String c;
        private final BB d;

        public final String b() {
            return this.c;
        }

        public final BB c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return C8632dsu.c((Object) this.c, (Object) fVar.c) && C8632dsu.c(this.d, fVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.c;
            BB bb = this.d;
            return "RichContent(__typename=" + str + ", localizedFormattedStringFragment=" + bb + ")";
        }

        public f(String str, BB bb) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bb, "");
            this.c = str;
            this.d = bb;
        }
    }

    /* renamed from: o.Ce$o */
    /* loaded from: classes2.dex */
    public static final class o {
        private final String b;
        private final C0779Cg d;

        public final C0779Cg c() {
            return this.d;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o) {
                o oVar = (o) obj;
                return C8632dsu.c((Object) this.b, (Object) oVar.b) && C8632dsu.c(this.d, oVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.b;
            C0779Cg c0779Cg = this.d;
            return "Xs(__typename=" + str + ", typographyFragment=" + c0779Cg + ")";
        }

        public o(String str, C0779Cg c0779Cg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0779Cg, "");
            this.b = str;
            this.d = c0779Cg;
        }
    }

    /* renamed from: o.Ce$i */
    /* loaded from: classes2.dex */
    public static final class i {
        private final String c;
        private final C0779Cg d;

        public final C0779Cg a() {
            return this.d;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c((Object) this.c, (Object) iVar.c) && C8632dsu.c(this.d, iVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.c;
            C0779Cg c0779Cg = this.d;
            return "S(__typename=" + str + ", typographyFragment=" + c0779Cg + ")";
        }

        public i(String str, C0779Cg c0779Cg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0779Cg, "");
            this.c = str;
            this.d = c0779Cg;
        }
    }

    /* renamed from: o.Ce$d */
    /* loaded from: classes2.dex */
    public static final class d {
        private final C0779Cg b;
        private final String c;

        public final C0779Cg b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.c, (Object) dVar.c) && C8632dsu.c(this.b, dVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.c;
            C0779Cg c0779Cg = this.b;
            return "M(__typename=" + str + ", typographyFragment=" + c0779Cg + ")";
        }

        public d(String str, C0779Cg c0779Cg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0779Cg, "");
            this.c = str;
            this.b = c0779Cg;
        }
    }

    /* renamed from: o.Ce$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private final String b;
        private final C0779Cg c;

        public final C0779Cg d() {
            return this.c;
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
                return C8632dsu.c((Object) this.b, (Object) aVar.b) && C8632dsu.c(this.c, aVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.b;
            C0779Cg c0779Cg = this.c;
            return "L(__typename=" + str + ", typographyFragment=" + c0779Cg + ")";
        }

        public a(String str, C0779Cg c0779Cg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0779Cg, "");
            this.b = str;
            this.c = c0779Cg;
        }
    }

    /* renamed from: o.Ce$k */
    /* loaded from: classes2.dex */
    public static final class k {
        private final C0779Cg b;
        private final String d;

        public final C0779Cg a() {
            return this.b;
        }

        public final String b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return C8632dsu.c((Object) this.d, (Object) kVar.d) && C8632dsu.c(this.b, kVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.d;
            C0779Cg c0779Cg = this.b;
            return "Xl(__typename=" + str + ", typographyFragment=" + c0779Cg + ")";
        }

        public k(String str, C0779Cg c0779Cg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0779Cg, "");
            this.d = str;
            this.b = c0779Cg;
        }
    }
}
