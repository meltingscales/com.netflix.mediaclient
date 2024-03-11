package o;

/* renamed from: o.aiu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2590aiu implements InterfaceC9037hy {
    private final String d;
    private final a e;

    public final String a() {
        return this.d;
    }

    public final a c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2590aiu) {
            C2590aiu c2590aiu = (C2590aiu) obj;
            return C8632dsu.c((Object) this.d, (Object) c2590aiu.d) && C8632dsu.c(this.e, c2590aiu.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        a aVar = this.e;
        return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        String str = this.d;
        a aVar = this.e;
        return "PreQuerySearchArtworkFragment(__typename=" + str + ", preQueryArt=" + aVar + ")";
    }

    public C2590aiu(String str, a aVar) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.e = aVar;
    }

    /* renamed from: o.aiu$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final String c;
        private final String e;

        public final String b() {
            return this.e;
        }

        public final String c() {
            return this.a;
        }

        public final String e() {
            return this.c;
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
            return "PreQueryArt(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ")";
        }

        public a(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.a = str2;
            this.e = str3;
        }
    }
}
