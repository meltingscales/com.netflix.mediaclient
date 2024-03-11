package o;

/* renamed from: o.adM  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2282adM implements InterfaceC9037hy {
    private final a d;
    private final String e;

    public final String b() {
        return this.e;
    }

    public final a c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2282adM) {
            C2282adM c2282adM = (C2282adM) obj;
            return C8632dsu.c((Object) this.e, (Object) c2282adM.e) && C8632dsu.c(this.d, c2282adM.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        a aVar = this.d;
        return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        String str = this.e;
        a aVar = this.d;
        return "ContentWarning(__typename=" + str + ", contentWarning=" + aVar + ")";
    }

    public C2282adM(String str, a aVar) {
        C8632dsu.c((Object) str, "");
        this.e = str;
        this.d = aVar;
    }

    /* renamed from: o.adM$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String c;
        private final String d;
        private final String e;

        public final String a() {
            return this.c;
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
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c((Object) this.e, (Object) aVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            String str = this.c;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            String str2 = this.c;
            String str3 = this.e;
            return "ContentWarning(__typename=" + str + ", url=" + str2 + ", message=" + str3 + ")";
        }

        public a(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = str2;
            this.e = str3;
        }
    }
}
