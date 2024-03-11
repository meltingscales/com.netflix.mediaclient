package o;

/* renamed from: o.aiI  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2552aiI implements InterfaceC9037hy {
    private final String a;
    private final d b;
    private final C2576aig d;

    public final C2576aig a() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final d d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2552aiI) {
            C2552aiI c2552aiI = (C2552aiI) obj;
            return C8632dsu.c((Object) this.a, (Object) c2552aiI.a) && C8632dsu.c(this.b, c2552aiI.b) && C8632dsu.c(this.d, c2552aiI.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        d dVar = this.b;
        return (((hashCode * 31) + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.a;
        d dVar = this.b;
        C2576aig c2576aig = this.d;
        return "ShowInfo(__typename=" + str + ", currentEpisode=" + dVar + ", playerShowBasic=" + c2576aig + ")";
    }

    public C2552aiI(String str, d dVar, C2576aig c2576aig) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2576aig, "");
        this.a = str;
        this.b = dVar;
        this.d = c2576aig;
    }

    /* renamed from: o.aiI$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final C2579aij b;
        private final String c;
        private final C2572aic d;

        public final C2579aij b() {
            return this.b;
        }

        public final C2572aic c() {
            return this.d;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.c, (Object) dVar.c) && C8632dsu.c(this.b, dVar.b) && C8632dsu.c(this.d, dVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (((this.c.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.c;
            C2579aij c2579aij = this.b;
            C2572aic c2572aic = this.d;
            return "CurrentEpisode(__typename=" + str + ", playerUIBasicInfo=" + c2579aij + ", playerEpisodeDetails=" + c2572aic + ")";
        }

        public d(String str, C2579aij c2579aij, C2572aic c2572aic) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2579aij, "");
            C8632dsu.c((Object) c2572aic, "");
            this.c = str;
            this.b = c2579aij;
            this.d = c2572aic;
        }
    }
}
