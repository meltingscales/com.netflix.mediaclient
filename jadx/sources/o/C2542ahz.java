package o;

/* renamed from: o.ahz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2542ahz implements InterfaceC9037hy {
    private final d a;
    private final String c;

    public final String a() {
        return this.c;
    }

    public final d e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2542ahz) {
            C2542ahz c2542ahz = (C2542ahz) obj;
            return C8632dsu.c((Object) this.c, (Object) c2542ahz.c) && C8632dsu.c(this.a, c2542ahz.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        d dVar = this.a;
        return (hashCode * 31) + (dVar == null ? 0 : dVar.hashCode());
    }

    public String toString() {
        String str = this.c;
        d dVar = this.a;
        return "PinotCreatorHomeFragment(__typename=" + str + ", creatorCollection=" + dVar + ")";
    }

    public C2542ahz(String str, d dVar) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.a = dVar;
    }

    /* renamed from: o.ahz$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final a a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;

        public final String a() {
            return this.d;
        }

        public final a b() {
            return this.a;
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
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c((Object) this.c, (Object) dVar.c) && C8632dsu.c(this.a, dVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = this.b.hashCode();
            String str = this.e;
            int hashCode3 = str == null ? 0 : str.hashCode();
            int hashCode4 = this.c.hashCode();
            a aVar = this.a;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (aVar != null ? aVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            String str2 = this.b;
            String str3 = this.e;
            String str4 = this.c;
            a aVar = this.a;
            return "CreatorCollection(__typename=" + str + ", id=" + str2 + ", title=" + str3 + ", unifiedEntityId=" + str4 + ", artwork=" + aVar + ")";
        }

        public d(String str, String str2, String str3, String str4, a aVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) str4, "");
            this.d = str;
            this.b = str2;
            this.e = str3;
            this.c = str4;
            this.a = aVar;
        }
    }

    /* renamed from: o.ahz$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final String b;
        private final String d;
        private final String e;

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.e;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.b, (Object) aVar.b) && C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c((Object) this.d, (Object) aVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.a;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.d;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.a;
            String str3 = this.e;
            String str4 = this.d;
            return "Artwork(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ", type=" + str4 + ")";
        }

        public a(String str, String str2, String str3, String str4) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = str2;
            this.e = str3;
            this.d = str4;
        }
    }
}
