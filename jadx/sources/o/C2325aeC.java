package o;

/* renamed from: o.aeC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2325aeC implements InterfaceC9037hy {
    private final String a;
    private final String b;
    private final b c;

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final b d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2325aeC) {
            C2325aeC c2325aeC = (C2325aeC) obj;
            return C8632dsu.c((Object) this.a, (Object) c2325aeC.a) && C8632dsu.c((Object) this.b, (Object) c2325aeC.b) && C8632dsu.c(this.c, c2325aeC.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        b bVar = this.c;
        return (((hashCode * 31) + hashCode2) * 31) + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        b bVar = this.c;
        return "FeedNodeData(__typename=" + str + ", id=" + str2 + ", reference=" + bVar + ")";
    }

    public C2325aeC(String str, String str2, b bVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.a = str;
        this.b = str2;
        this.c = bVar;
    }

    /* renamed from: o.aeC$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final C2372aex b;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final C2372aex c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.d, (Object) bVar.d) && C8632dsu.c(this.b, bVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.d;
            C2372aex c2372aex = this.b;
            return "Reference(__typename=" + str + ", feedEntityData=" + c2372aex + ")";
        }

        public b(String str, C2372aex c2372aex) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2372aex, "");
            this.d = str;
            this.b = c2372aex;
        }
    }
}
