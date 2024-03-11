package o;

/* renamed from: o.Bk  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0755Bk implements InterfaceC9037hy {
    private final d a;
    private final a c;
    private final String d;

    public final a b() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final d e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0755Bk) {
            C0755Bk c0755Bk = (C0755Bk) obj;
            return C8632dsu.c((Object) this.d, (Object) c0755Bk.d) && C8632dsu.c(this.a, c0755Bk.a) && C8632dsu.c(this.c, c0755Bk.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        d dVar = this.a;
        int hashCode2 = dVar == null ? 0 : dVar.hashCode();
        a aVar = this.c;
        return (((hashCode * 31) + hashCode2) * 31) + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.d;
        d dVar = this.a;
        a aVar = this.c;
        return "FlowSubmitActionOutcomeFragment(__typename=" + str + ", onCLCSScreen=" + dVar + ", onCLCSFlowComplete=" + aVar + ")";
    }

    public C0755Bk(String str, d dVar, a aVar) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.a = dVar;
        this.c = aVar;
    }

    /* renamed from: o.Bk$d */
    /* loaded from: classes2.dex */
    public static final class d {
        private final BR b;

        public final BR c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.b, ((d) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            BR br = this.b;
            return "OnCLCSScreen(screenFragment=" + br + ")";
        }

        public d(BR br) {
            C8632dsu.c((Object) br, "");
            this.b = br;
        }
    }

    /* renamed from: o.Bk$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private final b a;

        public final b e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            b bVar = this.a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            b bVar = this.a;
            return "OnCLCSFlowComplete(account=" + bVar + ")";
        }

        public a(b bVar) {
            this.a = bVar;
        }
    }

    /* renamed from: o.Bk$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private final String b;
        private final String c;

        public final String c() {
            return this.b;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c((Object) this.b, (Object) bVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.c;
            String str2 = this.b;
            return "Account(__typename=" + str + ", ownerGuid=" + str2 + ")";
        }

        public b(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.b = str2;
        }
    }
}
