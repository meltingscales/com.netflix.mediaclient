package o;

/* renamed from: o.adA  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2270adA implements InterfaceC9037hy {
    private final String a;
    private final a b;
    private final String c;
    private final String d;
    private final int e;

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.d;
    }

    public final a c() {
        return this.b;
    }

    public final int d() {
        return this.e;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2270adA) {
            C2270adA c2270adA = (C2270adA) obj;
            return C8632dsu.c((Object) this.d, (Object) c2270adA.d) && this.e == c2270adA.e && C8632dsu.c((Object) this.a, (Object) c2270adA.a) && C8632dsu.c((Object) this.c, (Object) c2270adA.c) && C8632dsu.c(this.b, c2270adA.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        int hashCode2 = Integer.hashCode(this.e);
        int hashCode3 = this.a.hashCode();
        String str = this.c;
        int hashCode4 = str == null ? 0 : str.hashCode();
        a aVar = this.b;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.d;
        int i = this.e;
        String str2 = this.a;
        String str3 = this.c;
        a aVar = this.b;
        return "CharacterData(__typename=" + str + ", characterId=" + i + ", unifiedEntityId=" + str2 + ", title=" + str3 + ", artwork=" + aVar + ")";
    }

    public C2270adA(String str, int i, String str2, String str3, a aVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.d = str;
        this.e = i;
        this.a = str2;
        this.c = str3;
        this.b = aVar;
    }

    /* renamed from: o.adA$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final String c;
        private final String e;

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c((Object) this.e, (Object) aVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.a;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            String str2 = this.a;
            String str3 = this.e;
            return "Artwork(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public a(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.a = str2;
            this.e = str3;
        }
    }
}
