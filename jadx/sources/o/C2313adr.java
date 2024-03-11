package o;

/* renamed from: o.adr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2313adr implements InterfaceC9037hy {
    private final b a;
    private final e b;
    private final String c;
    private final a d;
    private final String e;
    private final f f;

    public final e a() {
        return this.b;
    }

    public final b b() {
        return this.a;
    }

    public final a c() {
        return this.d;
    }

    public final f d() {
        return this.f;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2313adr) {
            C2313adr c2313adr = (C2313adr) obj;
            return C8632dsu.c((Object) this.e, (Object) c2313adr.e) && C8632dsu.c(this.f, c2313adr.f) && C8632dsu.c(this.a, c2313adr.a) && C8632dsu.c((Object) this.c, (Object) c2313adr.c) && C8632dsu.c(this.b, c2313adr.b) && C8632dsu.c(this.d, c2313adr.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        f fVar = this.f;
        int hashCode2 = fVar == null ? 0 : fVar.hashCode();
        b bVar = this.a;
        int hashCode3 = bVar == null ? 0 : bVar.hashCode();
        String str = this.c;
        int hashCode4 = str == null ? 0 : str.hashCode();
        e eVar = this.b;
        int hashCode5 = eVar == null ? 0 : eVar.hashCode();
        a aVar = this.d;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String i() {
        return this.e;
    }

    public String toString() {
        String str = this.e;
        f fVar = this.f;
        b bVar = this.a;
        String str2 = this.c;
        e eVar = this.b;
        a aVar = this.d;
        return "AlertFields(__typename=" + str + ", title=" + fVar + ", message=" + bVar + ", errorCode=" + str2 + ", dismissAction=" + eVar + ", secondaryAction=" + aVar + ")";
    }

    public C2313adr(String str, f fVar, b bVar, String str2, e eVar, a aVar) {
        C8632dsu.c((Object) str, "");
        this.e = str;
        this.f = fVar;
        this.a = bVar;
        this.c = str2;
        this.b = eVar;
        this.d = aVar;
    }

    /* renamed from: o.adr$f */
    /* loaded from: classes3.dex */
    public static final class f {
        private final C2381afF d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final C2381afF b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return C8632dsu.c((Object) this.e, (Object) fVar.e) && C8632dsu.c(this.d, fVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.e;
            C2381afF c2381afF = this.d;
            return "Title(__typename=" + str + ", localizedStringFields=" + c2381afF + ")";
        }

        public f(String str, C2381afF c2381afF) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2381afF, "");
            this.e = str;
            this.d = c2381afF;
        }
    }

    /* renamed from: o.adr$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String b;
        private final C2381afF e;

        public final C2381afF b() {
            return this.e;
        }

        public final String c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c(this.e, bVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.b;
            C2381afF c2381afF = this.e;
            return "Message(__typename=" + str + ", localizedStringFields=" + c2381afF + ")";
        }

        public b(String str, C2381afF c2381afF) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2381afF, "");
            this.b = str;
            this.e = c2381afF;
        }
    }

    /* renamed from: o.adr$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final c d;

        public final String b() {
            return this.a;
        }

        public final c e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c(this.d, eVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            c cVar = this.d;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            c cVar = this.d;
            return "DismissAction(__typename=" + str + ", label=" + cVar + ")";
        }

        public e(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.d = cVar;
        }
    }

    /* renamed from: o.adr$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String d;
        private final d e;

        public final d a() {
            return this.e;
        }

        public final String b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c(this.e, aVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            d dVar = this.e;
            return (hashCode * 31) + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            String str = this.d;
            d dVar = this.e;
            return "SecondaryAction(__typename=" + str + ", label=" + dVar + ")";
        }

        public a(String str, d dVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = dVar;
        }
    }

    /* renamed from: o.adr$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final C2381afF a;
        private final String c;

        public final C2381afF b() {
            return this.a;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.c, (Object) cVar.c) && C8632dsu.c(this.a, cVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.c;
            C2381afF c2381afF = this.a;
            return "Label(__typename=" + str + ", localizedStringFields=" + c2381afF + ")";
        }

        public c(String str, C2381afF c2381afF) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2381afF, "");
            this.c = str;
            this.a = c2381afF;
        }
    }

    /* renamed from: o.adr$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final C2381afF a;
        private final String b;

        public final String a() {
            return this.b;
        }

        public final C2381afF b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c(this.a, dVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.b;
            C2381afF c2381afF = this.a;
            return "Label1(__typename=" + str + ", localizedStringFields=" + c2381afF + ")";
        }

        public d(String str, C2381afF c2381afF) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2381afF, "");
            this.b = str;
            this.a = c2381afF;
        }
    }
}
