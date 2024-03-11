package o;

/* loaded from: classes2.dex */
public final class AI implements InterfaceC9037hy {
    private final String a;
    private final d b;
    private final Boolean c;
    private final Boolean d;
    private final String e;
    private final String f;

    public final String a() {
        return this.f;
    }

    public final Boolean b() {
        return this.d;
    }

    public final Boolean c() {
        return this.c;
    }

    public final d d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AI) {
            AI ai = (AI) obj;
            return C8632dsu.c((Object) this.e, (Object) ai.e) && C8632dsu.c((Object) this.a, (Object) ai.a) && C8632dsu.c((Object) this.f, (Object) ai.f) && C8632dsu.c(this.d, ai.d) && C8632dsu.c(this.c, ai.c) && C8632dsu.c(this.b, ai.b);
        }
        return false;
    }

    public final String g() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        int hashCode2 = this.a.hashCode();
        String str = this.f;
        int hashCode3 = str == null ? 0 : str.hashCode();
        Boolean bool = this.d;
        int hashCode4 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.c;
        int hashCode5 = bool2 == null ? 0 : bool2.hashCode();
        d dVar = this.b;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (dVar != null ? dVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.e;
        String str2 = this.a;
        String str3 = this.f;
        Boolean bool = this.d;
        Boolean bool2 = this.c;
        d dVar = this.b;
        return "BooleanFieldFragment(__typename=" + str + ", id=" + str2 + ", persistedCacheKey=" + str3 + ", boolInitialValue=" + bool + ", mustBeTrue=" + bool2 + ", errorMessage=" + dVar + ")";
    }

    public AI(String str, String str2, String str3, Boolean bool, Boolean bool2, d dVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.e = str;
        this.a = str2;
        this.f = str3;
        this.d = bool;
        this.c = bool2;
        this.b = dVar;
    }

    /* loaded from: classes2.dex */
    public static final class d {
        private final String a;
        private final BG c;

        public final String d() {
            return this.a;
        }

        public final BG e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c(this.c, dVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.a;
            BG bg = this.c;
            return "ErrorMessage(__typename=" + str + ", localizedStringFragment=" + bg + ")";
        }

        public d(String str, BG bg) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bg, "");
            this.a = str;
            this.c = bg;
        }
    }
}
