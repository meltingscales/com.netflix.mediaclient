package o;

/* renamed from: o.aiT  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2563aiT implements InterfaceC9037hy {
    private final a a;
    private final String b;
    private final b c;
    private final String d;

    public final a a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final b e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2563aiT) {
            C2563aiT c2563aiT = (C2563aiT) obj;
            return C8632dsu.c((Object) this.d, (Object) c2563aiT.d) && C8632dsu.c(this.c, c2563aiT.c) && C8632dsu.c(this.a, c2563aiT.a) && C8632dsu.c((Object) this.b, (Object) c2563aiT.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        b bVar = this.c;
        int hashCode2 = bVar == null ? 0 : bVar.hashCode();
        a aVar = this.a;
        int hashCode3 = aVar == null ? 0 : aVar.hashCode();
        String str = this.b;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.d;
        b bVar = this.c;
        a aVar = this.a;
        String str2 = this.b;
        return "TudumPromoSummary(__typename=" + str + ", boxshotImage=" + bVar + ", theme=" + aVar + ", slug=" + str2 + ")";
    }

    public C2563aiT(String str, b bVar, a aVar, String str2) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.c = bVar;
        this.a = aVar;
        this.b = str2;
    }

    /* renamed from: o.aiT$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String b;
        private final String e;

        public final String b() {
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
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c((Object) this.b, (Object) bVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.b;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.e;
            String str2 = this.b;
            return "BoxshotImage(__typename=" + str + ", url=" + str2 + ")";
        }

        public b(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = str2;
        }
    }

    /* renamed from: o.aiT$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final c a;
        private final String b;
        private final e c;

        public final e c() {
            return this.c;
        }

        public final c d() {
            return this.a;
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
                return C8632dsu.c((Object) this.b, (Object) aVar.b) && C8632dsu.c(this.a, aVar.a) && C8632dsu.c(this.c, aVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            c cVar = this.a;
            int hashCode2 = cVar == null ? 0 : cVar.hashCode();
            e eVar = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (eVar != null ? eVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            c cVar = this.a;
            e eVar = this.c;
            return "Theme(__typename=" + str + ", accentColor=" + cVar + ", backgroundColor=" + eVar + ")";
        }

        public a(String str, c cVar, e eVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = cVar;
            this.c = eVar;
        }
    }

    /* renamed from: o.aiT$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String a;
        private final String b;

        public final String c() {
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
                return C8632dsu.c((Object) this.a, (Object) cVar.a) && C8632dsu.c((Object) this.b, (Object) cVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.b;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            return "AccentColor(__typename=" + str + ", hexString=" + str2 + ")";
        }

        public c(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.b = str2;
        }
    }

    /* renamed from: o.aiT$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String b;
        private final String e;

        public final String c() {
            return this.b;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.e, (Object) eVar.e) && C8632dsu.c((Object) this.b, (Object) eVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.b;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.e;
            String str2 = this.b;
            return "BackgroundColor(__typename=" + str + ", hexString=" + str2 + ")";
        }

        public e(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = str2;
        }
    }
}
