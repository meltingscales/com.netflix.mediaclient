package o;

/* renamed from: o.adx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2319adx implements InterfaceC9037hy {
    private final String c;
    private final b d;

    public final String b() {
        return this.c;
    }

    public final b d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2319adx) {
            C2319adx c2319adx = (C2319adx) obj;
            return C8632dsu.c((Object) this.c, (Object) c2319adx.c) && C8632dsu.c(this.d, c2319adx.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        b bVar = this.d;
        return (hashCode * 31) + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        String str = this.c;
        b bVar = this.d;
        return "CollectTasteRatedTitleLogoArt(__typename=" + str + ", logoArt=" + bVar + ")";
    }

    public C2319adx(String str, b bVar) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.d = bVar;
    }

    /* renamed from: o.adx$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final String c;
        private final String e;

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.e;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c((Object) this.e, (Object) bVar.e);
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
            return "LogoArt(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public b(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.a = str2;
            this.e = str3;
        }
    }
}
