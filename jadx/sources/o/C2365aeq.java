package o;

/* renamed from: o.aeq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2365aeq implements InterfaceC9037hy {
    private final C2367aes b;
    private final a c;
    private final String e;

    public final C2367aes b() {
        return this.b;
    }

    public final String c() {
        return this.e;
    }

    public final a e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2365aeq) {
            C2365aeq c2365aeq = (C2365aeq) obj;
            return C8632dsu.c((Object) this.e, (Object) c2365aeq.e) && C8632dsu.c(this.c, c2365aeq.c) && C8632dsu.c(this.b, c2365aeq.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        a aVar = this.c;
        return (((hashCode * 31) + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.e;
        a aVar = this.c;
        C2367aes c2367aes = this.b;
        return "FeedEdgeData(__typename=" + str + ", node=" + aVar + ", feedEdge=" + c2367aes + ")";
    }

    public C2365aeq(String str, a aVar, C2367aes c2367aes) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2367aes, "");
        this.e = str;
        this.c = aVar;
        this.b = c2367aes;
    }

    /* renamed from: o.aeq$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String c;
        private final C2325aeC d;

        public final String a() {
            return this.c;
        }

        public final C2325aeC b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c(this.d, aVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.c;
            C2325aeC c2325aeC = this.d;
            return "Node(__typename=" + str + ", feedNodeData=" + c2325aeC + ")";
        }

        public a(String str, C2325aeC c2325aeC) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2325aeC, "");
            this.c = str;
            this.d = c2325aeC;
        }
    }
}
