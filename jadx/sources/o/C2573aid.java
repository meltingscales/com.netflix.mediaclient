package o;

/* renamed from: o.aid  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2573aid implements InterfaceC9037hy {
    private final a b;
    private final String c;

    public final String c() {
        return this.c;
    }

    public final a e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2573aid) {
            C2573aid c2573aid = (C2573aid) obj;
            return C8632dsu.c((Object) this.c, (Object) c2573aid.c) && C8632dsu.c(this.b, c2573aid.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        a aVar = this.b;
        return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        String str = this.c;
        a aVar = this.b;
        return "PlayerProtected(__typename=" + str + ", protected=" + aVar + ")";
    }

    public C2573aid(String str, a aVar) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.b = aVar;
    }

    /* renamed from: o.aid$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final Boolean a;
        private final Boolean b;
        private final Boolean c;
        private final String e;

        public final Boolean a() {
            return this.b;
        }

        public final Boolean c() {
            return this.c;
        }

        public final Boolean d() {
            return this.a;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c(this.c, aVar.c) && C8632dsu.c(this.a, aVar.a) && C8632dsu.c(this.b, aVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            Boolean bool = this.c;
            int hashCode2 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.a;
            int hashCode3 = bool2 == null ? 0 : bool2.hashCode();
            Boolean bool3 = this.b;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool3 != null ? bool3.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            Boolean bool = this.c;
            Boolean bool2 = this.a;
            Boolean bool3 = this.b;
            return "Protected(__typename=" + str + ", isPinProtected=" + bool + ", isAgeVerificationProtected=" + bool2 + ", isPreReleasePinProtected=" + bool3 + ")";
        }

        public a(String str, Boolean bool, Boolean bool2, Boolean bool3) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.c = bool;
            this.a = bool2;
            this.b = bool3;
        }
    }
}
