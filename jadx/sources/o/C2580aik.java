package o;

/* renamed from: o.aik  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2580aik implements InterfaceC9037hy {
    private final C2412afk a;
    private final Boolean b;
    private final Boolean c;
    private final String d;
    private final a e;
    private final C2573aid f;
    private final d h;
    private final Boolean j;

    public final C2573aid a() {
        return this.f;
    }

    public final C2412afk b() {
        return this.a;
    }

    public final d c() {
        return this.h;
    }

    public final a d() {
        return this.e;
    }

    public final Boolean e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2580aik) {
            C2580aik c2580aik = (C2580aik) obj;
            return C8632dsu.c((Object) this.d, (Object) c2580aik.d) && C8632dsu.c(this.c, c2580aik.c) && C8632dsu.c(this.b, c2580aik.b) && C8632dsu.c(this.j, c2580aik.j) && C8632dsu.c(this.e, c2580aik.e) && C8632dsu.c(this.h, c2580aik.h) && C8632dsu.c(this.f, c2580aik.f) && C8632dsu.c(this.a, c2580aik.a);
        }
        return false;
    }

    public final String g() {
        return this.d;
    }

    public final Boolean h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        Boolean bool = this.c;
        int hashCode2 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.b;
        int hashCode3 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.j;
        int hashCode4 = bool3 == null ? 0 : bool3.hashCode();
        a aVar = this.e;
        int hashCode5 = aVar == null ? 0 : aVar.hashCode();
        d dVar = this.h;
        int hashCode6 = dVar == null ? 0 : dVar.hashCode();
        C2573aid c2573aid = this.f;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (c2573aid != null ? c2573aid.hashCode() : 0)) * 31) + this.a.hashCode();
    }

    public final Boolean i() {
        return this.b;
    }

    public String toString() {
        String str = this.d;
        Boolean bool = this.c;
        Boolean bool2 = this.b;
        Boolean bool3 = this.j;
        a aVar = this.e;
        d dVar = this.h;
        C2573aid c2573aid = this.f;
        C2412afk c2412afk = this.a;
        return "PlayerVideoDetails(__typename=" + str + ", isPlayable=" + bool + ", isAvailable=" + bool2 + ", supportsInteractiveExperiences=" + bool3 + ", mdxBoxart=" + aVar + ", onViewable=" + dVar + ", playerProtected=" + c2573aid + ", interactiveVideo=" + c2412afk + ")";
    }

    public C2580aik(String str, Boolean bool, Boolean bool2, Boolean bool3, a aVar, d dVar, C2573aid c2573aid, C2412afk c2412afk) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2412afk, "");
        this.d = str;
        this.c = bool;
        this.b = bool2;
        this.j = bool3;
        this.e = aVar;
        this.h = dVar;
        this.f = c2573aid;
        this.a = c2412afk;
    }

    /* renamed from: o.aik$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final String b;
        private final String c;

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c((Object) this.b, (Object) aVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.a;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            String str2 = this.a;
            String str3 = this.b;
            return "MdxBoxart(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ")";
        }

        public a(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.a = str2;
            this.b = str3;
        }
    }

    /* renamed from: o.aik$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final C2587air a;

        public final C2587air b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.a, ((d) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            C2587air c2587air = this.a;
            return "OnViewable(playerViewable=" + c2587air + ")";
        }

        public d(C2587air c2587air) {
            C8632dsu.c((Object) c2587air, "");
            this.a = c2587air;
        }
    }
}
