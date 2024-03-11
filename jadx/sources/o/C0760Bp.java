package o;

/* renamed from: o.Bp  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0760Bp implements InterfaceC9037hy {
    private final c a;
    private final d c;
    private final String d;
    private final e e;

    public final String b() {
        return this.d;
    }

    public final e c() {
        return this.e;
    }

    public final d d() {
        return this.c;
    }

    public final c e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0760Bp) {
            C0760Bp c0760Bp = (C0760Bp) obj;
            return C8632dsu.c((Object) this.d, (Object) c0760Bp.d) && C8632dsu.c(this.c, c0760Bp.c) && C8632dsu.c(this.a, c0760Bp.a) && C8632dsu.c(this.e, c0760Bp.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        d dVar = this.c;
        int hashCode2 = dVar == null ? 0 : dVar.hashCode();
        c cVar = this.a;
        int hashCode3 = cVar == null ? 0 : cVar.hashCode();
        e eVar = this.e;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.d;
        d dVar = this.c;
        c cVar = this.a;
        e eVar = this.e;
        return "ImageComponentFragment(__typename=" + str + ", accessibilityDescription=" + dVar + ", image=" + cVar + ", imageResponsive=" + eVar + ")";
    }

    public C0760Bp(String str, d dVar, c cVar, e eVar) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.c = dVar;
        this.a = cVar;
        this.e = eVar;
    }

    /* renamed from: o.Bp$d */
    /* loaded from: classes2.dex */
    public static final class d {
        private final BG a;
        private final String c;

        public final String a() {
            return this.c;
        }

        public final BG b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.c, (Object) dVar.c) && C8632dsu.c(this.a, dVar.a);
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

        public d(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.c = str;
            this.a = bg;
        }
    }

    /* renamed from: o.Bp$c */
    /* loaded from: classes2.dex */
    public static final class c {
        private final C0767Bw c;
        private final String e;

        public final C0767Bw a() {
            return this.c;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.e, (Object) cVar.e) && C8632dsu.c(this.c, cVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.e;
            C0767Bw c0767Bw = this.c;
            return "Image(__typename=" + str + ", imageFragment=" + c0767Bw + ")";
        }

        public c(String str, C0767Bw c0767Bw) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0767Bw, "");
            this.e = str;
            this.c = c0767Bw;
        }
    }

    /* renamed from: o.Bp$e */
    /* loaded from: classes2.dex */
    public static final class e {
        private final i a;
        private final g b;
        private final String c;
        private final a d;
        private final b e;
        private final f i;

        public final g a() {
            return this.b;
        }

        public final i b() {
            return this.a;
        }

        public final b c() {
            return this.e;
        }

        public final a d() {
            return this.d;
        }

        public final f e() {
            return this.i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c(this.i, eVar.i) && C8632dsu.c(this.b, eVar.b) && C8632dsu.c(this.e, eVar.e) && C8632dsu.c(this.d, eVar.d) && C8632dsu.c(this.a, eVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            f fVar = this.i;
            int hashCode2 = fVar == null ? 0 : fVar.hashCode();
            g gVar = this.b;
            int hashCode3 = gVar == null ? 0 : gVar.hashCode();
            b bVar = this.e;
            int hashCode4 = bVar == null ? 0 : bVar.hashCode();
            a aVar = this.d;
            int hashCode5 = aVar == null ? 0 : aVar.hashCode();
            i iVar = this.a;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (iVar != null ? iVar.hashCode() : 0);
        }

        public final String j() {
            return this.c;
        }

        public String toString() {
            String str = this.c;
            f fVar = this.i;
            g gVar = this.b;
            b bVar = this.e;
            a aVar = this.d;
            i iVar = this.a;
            return "ImageResponsive(__typename=" + str + ", xs=" + fVar + ", s=" + gVar + ", m=" + bVar + ", l=" + aVar + ", xl=" + iVar + ")";
        }

        public e(String str, f fVar, g gVar, b bVar, a aVar, i iVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.i = fVar;
            this.b = gVar;
            this.e = bVar;
            this.d = aVar;
            this.a = iVar;
        }
    }

    /* renamed from: o.Bp$f */
    /* loaded from: classes2.dex */
    public static final class f {
        private final C0767Bw b;
        private final String c;

        public final C0767Bw b() {
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
            C0767Bw c0767Bw = this.b;
            return "Xs(__typename=" + str + ", imageFragment=" + c0767Bw + ")";
        }

        public f(String str, C0767Bw c0767Bw) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0767Bw, "");
            this.c = str;
            this.b = c0767Bw;
        }
    }

    /* renamed from: o.Bp$g */
    /* loaded from: classes2.dex */
    public static final class g {
        private final String b;
        private final C0767Bw c;

        public final C0767Bw b() {
            return this.c;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.b, (Object) gVar.b) && C8632dsu.c(this.c, gVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.b;
            C0767Bw c0767Bw = this.c;
            return "S(__typename=" + str + ", imageFragment=" + c0767Bw + ")";
        }

        public g(String str, C0767Bw c0767Bw) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0767Bw, "");
            this.b = str;
            this.c = c0767Bw;
        }
    }

    /* renamed from: o.Bp$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private final String d;
        private final C0767Bw e;

        public final C0767Bw b() {
            return this.e;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.d, (Object) bVar.d) && C8632dsu.c(this.e, bVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.d;
            C0767Bw c0767Bw = this.e;
            return "M(__typename=" + str + ", imageFragment=" + c0767Bw + ")";
        }

        public b(String str, C0767Bw c0767Bw) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0767Bw, "");
            this.d = str;
            this.e = c0767Bw;
        }
    }

    /* renamed from: o.Bp$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private final String a;
        private final C0767Bw c;

        public final String b() {
            return this.a;
        }

        public final C0767Bw e() {
            return this.c;
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
            C0767Bw c0767Bw = this.c;
            return "L(__typename=" + str + ", imageFragment=" + c0767Bw + ")";
        }

        public a(String str, C0767Bw c0767Bw) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0767Bw, "");
            this.a = str;
            this.c = c0767Bw;
        }
    }

    /* renamed from: o.Bp$i */
    /* loaded from: classes2.dex */
    public static final class i {
        private final String a;
        private final C0767Bw b;

        public final String a() {
            return this.a;
        }

        public final C0767Bw d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c((Object) this.a, (Object) iVar.a) && C8632dsu.c(this.b, iVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            C0767Bw c0767Bw = this.b;
            return "Xl(__typename=" + str + ", imageFragment=" + c0767Bw + ")";
        }

        public i(String str, C0767Bw c0767Bw) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0767Bw, "");
            this.a = str;
            this.b = c0767Bw;
        }
    }
}
