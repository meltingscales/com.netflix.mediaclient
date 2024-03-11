package o;

/* renamed from: o.afw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2433afw implements InterfaceC9037hy {
    private final String b;
    private final c c;

    public final c c() {
        return this.c;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2433afw) {
            C2433afw c2433afw = (C2433afw) obj;
            return C8632dsu.c((Object) this.b, (Object) c2433afw.b) && C8632dsu.c(this.c, c2433afw.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        c cVar = this.c;
        return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        String str = this.b;
        c cVar = this.c;
        return "ListItemBoxart(__typename=" + str + ", boxArt=" + cVar + ")";
    }

    public C2433afw(String str, c cVar) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.c = cVar;
    }

    /* renamed from: o.afw$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String a;
        private final String c;
        private final String d;

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.c, (Object) cVar.c) && C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c((Object) this.a, (Object) cVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.d;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            String str2 = this.d;
            String str3 = this.a;
            return "BoxArt(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ")";
        }

        public c(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.d = str2;
            this.a = str3;
        }
    }
}
