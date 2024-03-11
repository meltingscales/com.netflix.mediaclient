package o;

/* renamed from: o.ahH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2498ahH implements InterfaceC9037hy {
    private final String a;
    private final e c;
    private final String d;

    public final e a() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2498ahH) {
            C2498ahH c2498ahH = (C2498ahH) obj;
            return C8632dsu.c((Object) this.d, (Object) c2498ahH.d) && C8632dsu.c((Object) this.a, (Object) c2498ahH.a) && C8632dsu.c(this.c, c2498ahH.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        int hashCode2 = this.a.hashCode();
        e eVar = this.c;
        return (((hashCode * 31) + hashCode2) * 31) + (eVar == null ? 0 : eVar.hashCode());
    }

    public String toString() {
        String str = this.d;
        String str2 = this.a;
        e eVar = this.c;
        return "PinotOption5CreatorHomeFragment(__typename=" + str + ", sectionId=" + str2 + ", sectionTreatment=" + eVar + ")";
    }

    public C2498ahH(String str, String str2, e eVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.d = str;
        this.a = str2;
        this.c = eVar;
    }

    /* renamed from: o.ahH$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final b d;

        public final String b() {
            return this.a;
        }

        public final b d() {
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
            b bVar = this.d;
            return (hashCode * 31) + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            b bVar = this.d;
            return "SectionTreatment(__typename=" + str + ", onPinotCreatorHomeSectionTreatment=" + bVar + ")";
        }

        public e(String str, b bVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.d = bVar;
        }
    }

    /* renamed from: o.ahH$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final a a;
        private final String c;

        public final String c() {
            return this.c;
        }

        public final a e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c(this.a, bVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            a aVar = this.a;
            return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.c;
            a aVar = this.a;
            return "OnPinotCreatorHomeSectionTreatment(__typename=" + str + ", creatorCollection=" + aVar + ")";
        }

        public b(String str, a aVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.a = aVar;
        }
    }

    /* renamed from: o.ahH$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final c a;
        private final d b;
        private final String c;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final d b() {
            return this.b;
        }

        public final c c() {
            return this.a;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c(this.a, aVar.a) && C8632dsu.c(this.b, aVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            int hashCode2 = this.e.hashCode();
            c cVar = this.a;
            int hashCode3 = cVar == null ? 0 : cVar.hashCode();
            d dVar = this.b;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (dVar != null ? dVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            String str2 = this.e;
            c cVar = this.a;
            d dVar = this.b;
            return "CreatorCollection(__typename=" + str + ", unifiedEntityId=" + str2 + ", artwork=" + cVar + ", onGenericContainer=" + dVar + ")";
        }

        public a(String str, String str2, c cVar, d dVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.e = str2;
            this.a = cVar;
            this.b = dVar;
        }
    }

    /* renamed from: o.ahH$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String a;
        private final String b;
        private final String d;
        private final String e;

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final String d() {
            return this.d;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.a, (Object) cVar.a) && C8632dsu.c((Object) this.e, (Object) cVar.e) && C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c((Object) this.d, (Object) cVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.e;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.d;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.e;
            String str3 = this.b;
            String str4 = this.d;
            return "Artwork(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ", type=" + str4 + ")";
        }

        public c(String str, String str2, String str3, String str4) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.e = str2;
            this.b = str3;
            this.d = str4;
        }
    }

    /* renamed from: o.ahH$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String b;
        private final String c;

        public final String b() {
            return this.c;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c((Object) this.c, (Object) dVar.c);
            }
            return false;
        }

        public int hashCode() {
            String str = this.b;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.b;
            String str2 = this.c;
            return "OnGenericContainer(title=" + str + ", id=" + str2 + ")";
        }

        public d(String str, String str2) {
            C8632dsu.c((Object) str2, "");
            this.b = str;
            this.c = str2;
        }
    }
}
