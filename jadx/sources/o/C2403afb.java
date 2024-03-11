package o;

/* renamed from: o.afb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2403afb implements InterfaceC9037hy {
    private final d a;
    private final String b;
    private final String c;
    private final C2595aiz d;
    private final String e;
    private final String f;
    private final String h;

    public final C2595aiz a() {
        return this.d;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.f;
    }

    public final d d() {
        return this.a;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2403afb) {
            C2403afb c2403afb = (C2403afb) obj;
            return C8632dsu.c((Object) this.b, (Object) c2403afb.b) && C8632dsu.c((Object) this.c, (Object) c2403afb.c) && C8632dsu.c((Object) this.h, (Object) c2403afb.h) && C8632dsu.c((Object) this.f, (Object) c2403afb.f) && C8632dsu.c((Object) this.e, (Object) c2403afb.e) && C8632dsu.c(this.a, c2403afb.a) && C8632dsu.c(this.d, c2403afb.d);
        }
        return false;
    }

    public final String g() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.h.hashCode();
        String str = this.f;
        int hashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.e;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        d dVar = this.a;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final String j() {
        return this.b;
    }

    public String toString() {
        String str = this.b;
        String str2 = this.c;
        String str3 = this.h;
        String str4 = this.f;
        String str5 = this.e;
        d dVar = this.a;
        C2595aiz c2595aiz = this.d;
        return "GenericContainerSummary(__typename=" + str + ", id=" + str2 + ", unifiedEntityId=" + str3 + ", title=" + str4 + ", shortSynopsis=" + str5 + ", taglineMessage=" + dVar + ", recommendedTrailer=" + c2595aiz + ")";
    }

    public C2403afb(String str, String str2, String str3, String str4, String str5, d dVar, C2595aiz c2595aiz) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) c2595aiz, "");
        this.b = str;
        this.c = str2;
        this.h = str3;
        this.f = str4;
        this.e = str5;
        this.a = dVar;
        this.d = c2595aiz;
    }

    /* renamed from: o.afb$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String b;
        private final String c;
        private final String d;

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c((Object) this.c, (Object) dVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.d;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.d;
            String str3 = this.c;
            return "TaglineMessage(__typename=" + str + ", tagline=" + str2 + ", classification=" + str3 + ")";
        }

        public d(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = str2;
            this.c = str3;
        }
    }
}
