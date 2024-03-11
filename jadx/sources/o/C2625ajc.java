package o;

/* renamed from: o.ajc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2625ajc implements InterfaceC9037hy {
    private final b c;
    private final String e;

    public final String b() {
        return this.e;
    }

    public final b e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2625ajc) {
            C2625ajc c2625ajc = (C2625ajc) obj;
            return C8632dsu.c((Object) this.e, (Object) c2625ajc.e) && C8632dsu.c(this.c, c2625ajc.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        b bVar = this.c;
        return (hashCode * 31) + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        String str = this.e;
        b bVar = this.c;
        return "VideoBoxart(__typename=" + str + ", boxArt=" + bVar + ")";
    }

    public C2625ajc(String str, b bVar) {
        C8632dsu.c((Object) str, "");
        this.e = str;
        this.c = bVar;
    }

    /* renamed from: o.ajc$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String b;
        private final String c;
        private final String e;

        public final String a() {
            return this.c;
        }

        public final String d() {
            return this.b;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c((Object) this.e, (Object) bVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.c;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.c;
            String str3 = this.e;
            return "BoxArt(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public b(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.c = str2;
            this.e = str3;
        }
    }
}
