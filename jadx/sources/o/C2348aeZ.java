package o;

/* renamed from: o.aeZ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2348aeZ implements InterfaceC9037hy {
    private final String b;
    private final C2403afb c;
    private final d e;

    public final String b() {
        return this.b;
    }

    public final C2403afb c() {
        return this.c;
    }

    public final d e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2348aeZ) {
            C2348aeZ c2348aeZ = (C2348aeZ) obj;
            return C8632dsu.c((Object) this.b, (Object) c2348aeZ.b) && C8632dsu.c(this.e, c2348aeZ.e) && C8632dsu.c(this.c, c2348aeZ.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        d dVar = this.e;
        return (((hashCode * 31) + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.b;
        d dVar = this.e;
        C2403afb c2403afb = this.c;
        return "GenericContainer(__typename=" + str + ", horizontalBackgroundAsset=" + dVar + ", genericContainerSummary=" + c2403afb + ")";
    }

    public C2348aeZ(String str, d dVar, C2403afb c2403afb) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2403afb, "");
        this.b = str;
        this.e = dVar;
        this.c = c2403afb;
    }

    /* renamed from: o.aeZ$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final String b;
        private final String c;
        private final Boolean d;

        public final String a() {
            return this.a;
        }

        public final Boolean b() {
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
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c((Object) this.c, (Object) dVar.c) && C8632dsu.c(this.d, dVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.a;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.c;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            Boolean bool = this.d;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.a;
            String str3 = this.c;
            Boolean bool = this.d;
            return "HorizontalBackgroundAsset(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ", available=" + bool + ")";
        }

        public d(String str, String str2, String str3, Boolean bool) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = str2;
            this.c = str3;
            this.d = bool;
        }
    }
}
