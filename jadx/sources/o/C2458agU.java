package o;

/* renamed from: o.agU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2458agU implements InterfaceC9037hy {
    private final String a;
    private final c b;
    private final String c;
    private final Integer d;
    private final String e;

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.e;
    }

    public final c c() {
        return this.b;
    }

    public final Integer d() {
        return this.d;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2458agU) {
            C2458agU c2458agU = (C2458agU) obj;
            return C8632dsu.c((Object) this.c, (Object) c2458agU.c) && C8632dsu.c((Object) this.a, (Object) c2458agU.a) && C8632dsu.c(this.d, c2458agU.d) && C8632dsu.c((Object) this.e, (Object) c2458agU.e) && C8632dsu.c(this.b, c2458agU.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        String str = this.a;
        int hashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.d;
        int hashCode3 = num == null ? 0 : num.hashCode();
        String str2 = this.e;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        c cVar = this.b;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.c;
        String str2 = this.a;
        Integer num = this.d;
        String str3 = this.e;
        c cVar = this.b;
        return "LolomoRowEdge(__typename=" + str + ", lolomoId=" + str2 + ", index=" + num + ", cursor=" + str3 + ", node=" + cVar + ")";
    }

    public C2458agU(String str, String str2, Integer num, String str3, c cVar) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.a = str2;
        this.d = num;
        this.e = str3;
        this.b = cVar;
    }

    /* renamed from: o.agU$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final C2461agX a;
        private final C2457agT b;
        private final String d;

        public final C2457agT a() {
            return this.b;
        }

        public final C2461agX b() {
            return this.a;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c(this.a, cVar.a) && C8632dsu.c(this.b, cVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (((this.d.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.d;
            C2461agX c2461agX = this.a;
            C2457agT c2457agT = this.b;
            return "Node(__typename=" + str + ", lolomoRowSummary=" + c2461agX + ", lolomoRowData=" + c2457agT + ")";
        }

        public c(String str, C2461agX c2461agX, C2457agT c2457agT) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2461agX, "");
            C8632dsu.c((Object) c2457agT, "");
            this.d = str;
            this.a = c2461agX;
            this.b = c2457agT;
        }
    }
}
