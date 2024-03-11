package o;

/* renamed from: o.afj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2411afj implements InterfaceC9037hy {
    private final g a;
    private final String b;
    private final String c;

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final g c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2411afj) {
            C2411afj c2411afj = (C2411afj) obj;
            return C8632dsu.c((Object) this.b, (Object) c2411afj.b) && C8632dsu.c((Object) this.c, (Object) c2411afj.c) && C8632dsu.c(this.a, c2411afj.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        g gVar = this.a;
        return (((hashCode * 31) + hashCode2) * 31) + (gVar == null ? 0 : gVar.hashCode());
    }

    public String toString() {
        String str = this.b;
        String str2 = this.c;
        g gVar = this.a;
        return "IrmaCreatorHomeFragment(__typename=" + str + ", sectionId=" + str2 + ", sectionTreatment=" + gVar + ")";
    }

    public C2411afj(String str, String str2, g gVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.b = str;
        this.c = str2;
        this.a = gVar;
    }

    /* renamed from: o.afj$g */
    /* loaded from: classes3.dex */
    public static final class g {
        private final h a;
        private final String d;
        private final a e;

        public final a a() {
            return this.e;
        }

        public final String b() {
            return this.d;
        }

        public final h e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.d, (Object) gVar.d) && C8632dsu.c(this.e, gVar.e) && C8632dsu.c(this.a, gVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            a aVar = this.e;
            int hashCode2 = aVar == null ? 0 : aVar.hashCode();
            h hVar = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (hVar != null ? hVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            a aVar = this.e;
            h hVar = this.a;
            return "SectionTreatment(__typename=" + str + ", onIrmaCreatorHomeSectionTreatment=" + aVar + ", onPinotCreatorHomeSectionTreatment=" + hVar + ")";
        }

        public g(String str, a aVar, h hVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = aVar;
            this.a = hVar;
        }
    }

    /* renamed from: o.afj$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final String b;
        private final b c;
        private final String d;
        private final String e;

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.d;
        }

        public final b c() {
            return this.c;
        }

        public final String d() {
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
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c(this.c, aVar.c) && C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c((Object) this.b, (Object) aVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            b bVar = this.c;
            int hashCode2 = bVar == null ? 0 : bVar.hashCode();
            int hashCode3 = this.d.hashCode();
            int hashCode4 = this.e.hashCode();
            String str = this.b;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            b bVar = this.c;
            String str2 = this.d;
            String str3 = this.e;
            String str4 = this.b;
            return "OnIrmaCreatorHomeSectionTreatment(__typename=" + str + ", image=" + bVar + ", unifiedEntityId=" + str2 + ", creatorCollectionId=" + str3 + ", title=" + str4 + ")";
        }

        public a(String str, b bVar, String str2, String str3, String str4) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) str3, "");
            this.a = str;
            this.c = bVar;
            this.d = str2;
            this.e = str3;
            this.b = str4;
        }
    }

    /* renamed from: o.afj$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final String c;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final String d() {
            return this.c;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c((Object) this.d, (Object) bVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.a;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            String str2 = this.a;
            String str3 = this.d;
            return "Image(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ")";
        }

        public b(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.a = str2;
            this.d = str3;
        }
    }

    /* renamed from: o.afj$h */
    /* loaded from: classes3.dex */
    public static final class h {
        private final String a;
        private final d e;

        public final String b() {
            return this.a;
        }

        public final d d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c((Object) this.a, (Object) hVar.a) && C8632dsu.c(this.e, hVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            d dVar = this.e;
            return (hashCode * 31) + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            d dVar = this.e;
            return "OnPinotCreatorHomeSectionTreatment(__typename=" + str + ", creatorCollection=" + dVar + ")";
        }

        public h(String str, d dVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.e = dVar;
        }
    }

    /* renamed from: o.afj$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final e a;
        private final String b;
        private final String c;
        private final c d;

        public final String b() {
            return this.c;
        }

        public final c c() {
            return this.d;
        }

        public final String d() {
            return this.b;
        }

        public final e e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c((Object) this.c, (Object) dVar.c) && C8632dsu.c(this.a, dVar.a) && C8632dsu.c(this.d, dVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = this.c.hashCode();
            e eVar = this.a;
            int hashCode3 = eVar == null ? 0 : eVar.hashCode();
            c cVar = this.d;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (cVar != null ? cVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.c;
            e eVar = this.a;
            c cVar = this.d;
            return "CreatorCollection(__typename=" + str + ", unifiedEntityId=" + str2 + ", artwork=" + eVar + ", onGenericContainer=" + cVar + ")";
        }

        public d(String str, String str2, e eVar, c cVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.b = str;
            this.c = str2;
            this.a = eVar;
            this.d = cVar;
        }
    }

    /* renamed from: o.afj$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String b;
        private final String c;
        private final String d;
        private final String e;

        public final String a() {
            return this.d;
        }

        public final String c() {
            return this.e;
        }

        public final String d() {
            return this.b;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && C8632dsu.c((Object) this.e, (Object) eVar.e) && C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c((Object) this.d, (Object) eVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.e;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.c;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.d;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.e;
            String str3 = this.c;
            String str4 = this.d;
            return "Artwork(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ", type=" + str4 + ")";
        }

        public e(String str, String str2, String str3, String str4) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = str2;
            this.c = str3;
            this.d = str4;
        }
    }

    /* renamed from: o.afj$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String b;
        private final String d;

        public final String a() {
            return this.d;
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
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c((Object) this.b, (Object) cVar.b);
            }
            return false;
        }

        public int hashCode() {
            String str = this.d;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.d;
            String str2 = this.b;
            return "OnGenericContainer(title=" + str + ", id=" + str2 + ")";
        }

        public c(String str, String str2) {
            C8632dsu.c((Object) str2, "");
            this.d = str;
            this.b = str2;
        }
    }
}
