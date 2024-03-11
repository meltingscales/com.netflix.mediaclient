package o;

/* renamed from: o.adT  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2289adT implements InterfaceC9037hy {
    private final String b;
    private final d e;

    public final String c() {
        return this.b;
    }

    public final d d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2289adT) {
            C2289adT c2289adT = (C2289adT) obj;
            return C8632dsu.c((Object) this.b, (Object) c2289adT.b) && C8632dsu.c(this.e, c2289adT.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        d dVar = this.e;
        return (hashCode * 31) + (dVar == null ? 0 : dVar.hashCode());
    }

    public String toString() {
        String str = this.b;
        d dVar = this.e;
        return "DetailsProtected(__typename=" + str + ", protected=" + dVar + ")";
    }

    public C2289adT(String str, d dVar) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.e = dVar;
    }

    /* renamed from: o.adT$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final Boolean a;
        private final String b;
        private final Boolean c;
        private final Boolean d;

        public final Boolean a() {
            return this.a;
        }

        public final Boolean b() {
            return this.c;
        }

        public final Boolean c() {
            return this.d;
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
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c(this.d, dVar.d) && C8632dsu.c(this.c, dVar.c) && C8632dsu.c(this.a, dVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            Boolean bool = this.d;
            int hashCode2 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.c;
            int hashCode3 = bool2 == null ? 0 : bool2.hashCode();
            Boolean bool3 = this.a;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool3 != null ? bool3.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            Boolean bool = this.d;
            Boolean bool2 = this.c;
            Boolean bool3 = this.a;
            return "Protected(__typename=" + str + ", isPinProtected=" + bool + ", isAgeVerificationProtected=" + bool2 + ", isPreReleasePinProtected=" + bool3 + ")";
        }

        public d(String str, Boolean bool, Boolean bool2, Boolean bool3) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = bool;
            this.c = bool2;
            this.a = bool3;
        }
    }
}
