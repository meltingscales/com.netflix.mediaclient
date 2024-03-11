package o;

/* renamed from: o.aiR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2561aiR implements InterfaceC9037hy {
    private final String b;
    private final C2403afb c;
    private final b d;

    public final b b() {
        return this.d;
    }

    public final C2403afb c() {
        return this.c;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2561aiR) {
            C2561aiR c2561aiR = (C2561aiR) obj;
            return C8632dsu.c((Object) this.b, (Object) c2561aiR.b) && C8632dsu.c(this.d, c2561aiR.d) && C8632dsu.c(this.c, c2561aiR.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        b bVar = this.d;
        return (((hashCode * 31) + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.b;
        b bVar = this.d;
        C2403afb c2403afb = this.c;
        return "TrendingNowContainer(__typename=" + str + ", artwork=" + bVar + ", genericContainerSummary=" + c2403afb + ")";
    }

    public C2561aiR(String str, b bVar, C2403afb c2403afb) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2403afb, "");
        this.b = str;
        this.d = bVar;
        this.c = c2403afb;
    }

    /* renamed from: o.aiR$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String b;
        private final String c;
        private final Boolean d;
        private final String e;

        public final String b() {
            return this.e;
        }

        public final Boolean c() {
            return this.d;
        }

        public final String d() {
            return this.c;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c(this.d, bVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.b;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.c;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            Boolean bool = this.d;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            String str2 = this.b;
            String str3 = this.c;
            Boolean bool = this.d;
            return "Artwork(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ", available=" + bool + ")";
        }

        public b(String str, String str2, String str3, Boolean bool) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = str2;
            this.c = str3;
            this.d = bool;
        }
    }
}
