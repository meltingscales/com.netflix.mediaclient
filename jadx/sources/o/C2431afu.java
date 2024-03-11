package o;

/* renamed from: o.afu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2431afu implements InterfaceC9037hy {
    private final b a;
    private final String b;
    private final String c;
    private final a d;

    public final String a() {
        return this.c;
    }

    public final b b() {
        return this.a;
    }

    public final a c() {
        return this.d;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2431afu) {
            C2431afu c2431afu = (C2431afu) obj;
            return C8632dsu.c((Object) this.b, (Object) c2431afu.b) && C8632dsu.c(this.d, c2431afu.d) && C8632dsu.c(this.a, c2431afu.a) && C8632dsu.c((Object) this.c, (Object) c2431afu.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        a aVar = this.d;
        int hashCode2 = aVar == null ? 0 : aVar.hashCode();
        b bVar = this.a;
        int hashCode3 = bVar == null ? 0 : bVar.hashCode();
        String str = this.c;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.b;
        a aVar = this.d;
        b bVar = this.a;
        String str2 = this.c;
        return "IrmaPreQueryEntityFragment(__typename=" + str + ", unifiedEntity=" + aVar + ", image=" + bVar + ", title=" + str2 + ")";
    }

    public C2431afu(String str, a aVar, b bVar, String str2) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.d = aVar;
        this.a = bVar;
        this.c = str2;
    }

    /* renamed from: o.afu$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final e b;
        private final String e;

        public final e a() {
            return this.b;
        }

        public final String b() {
            return this.e;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c(this.b, aVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            int hashCode2 = this.e.hashCode();
            e eVar = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            String str2 = this.e;
            e eVar = this.b;
            return "UnifiedEntity(__typename=" + str + ", unifiedEntityId=" + str2 + ", onVideo=" + eVar + ")";
        }

        public a(String str, String str2, e eVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.a = str;
            this.e = str2;
            this.b = eVar;
        }
    }

    /* renamed from: o.afu$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final String b;
        private final String c;
        private final Integer d;
        private final String e;

        public final Integer a() {
            return this.d;
        }

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.e;
        }

        public final String d() {
            return this.b;
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
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c(this.d, bVar.d) && C8632dsu.c((Object) this.a, (Object) bVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.b;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            Integer num = this.d;
            int hashCode4 = num == null ? 0 : num.hashCode();
            String str3 = this.a;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            String str2 = this.b;
            String str3 = this.e;
            Integer num = this.d;
            String str4 = this.a;
            return "Image(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ", width=" + num + ", type=" + str4 + ")";
        }

        public b(String str, String str2, String str3, Integer num, String str4) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.b = str2;
            this.e = str3;
            this.d = num;
            this.a = str4;
        }
    }

    /* renamed from: o.afu$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final C2514ahX c;

        public final C2514ahX e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.c, ((e) obj).c);
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            C2514ahX c2514ahX = this.c;
            return "OnVideo(playable=" + c2514ahX + ")";
        }

        public e(C2514ahX c2514ahX) {
            C8632dsu.c((Object) c2514ahX, "");
            this.c = c2514ahX;
        }
    }
}
