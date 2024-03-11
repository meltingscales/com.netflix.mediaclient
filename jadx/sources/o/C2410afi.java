package o;

/* renamed from: o.afi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2410afi implements InterfaceC9037hy {
    private final String c;
    private final c d;

    public final c a() {
        return this.d;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2410afi) {
            C2410afi c2410afi = (C2410afi) obj;
            return C8632dsu.c((Object) this.c, (Object) c2410afi.c) && C8632dsu.c(this.d, c2410afi.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        c cVar = this.d;
        return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        String str = this.c;
        c cVar = this.d;
        return "HorzArtwork(__typename=" + str + ", horzDispArtwork=" + cVar + ")";
    }

    public C2410afi(String str, c cVar) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.d = cVar;
    }

    /* renamed from: o.afi$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String c;
        private final String d;
        private final String e;

        public final String b() {
            return this.c;
        }

        public final String d() {
            return this.d;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.c, (Object) cVar.c) && C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c((Object) this.e, (Object) cVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.d;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            String str2 = this.d;
            String str3 = this.e;
            return "HorzDispArtwork(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ")";
        }

        public c(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.d = str2;
            this.e = str3;
        }
    }
}
