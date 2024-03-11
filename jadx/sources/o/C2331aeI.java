package o;

/* renamed from: o.aeI  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2331aeI implements InterfaceC9037hy {
    private final String a;
    private final a c;

    public final a a() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2331aeI) {
            C2331aeI c2331aeI = (C2331aeI) obj;
            return C8632dsu.c((Object) this.a, (Object) c2331aeI.a) && C8632dsu.c(this.c, c2331aeI.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        a aVar = this.c;
        return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        String str = this.a;
        a aVar = this.c;
        return "GameArtwork(__typename=" + str + ", artwork=" + aVar + ")";
    }

    public C2331aeI(String str, a aVar) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.c = aVar;
    }

    /* renamed from: o.aeI$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final String b;
        private final String d;

        public final String b() {
            return this.a;
        }

        public final String d() {
            return this.b;
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
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c((Object) this.b, (Object) aVar.b) && C8632dsu.c((Object) this.a, (Object) aVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            String str = this.b;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            String str2 = this.b;
            String str3 = this.a;
            return "Artwork(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public a(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.b = str2;
            this.a = str3;
        }
    }
}
