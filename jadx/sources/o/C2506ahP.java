package o;

/* renamed from: o.ahP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2506ahP implements InterfaceC9037hy {
    private final String b;
    private final a c;

    public final String a() {
        return this.b;
    }

    public final a e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2506ahP) {
            C2506ahP c2506ahP = (C2506ahP) obj;
            return C8632dsu.c((Object) this.b, (Object) c2506ahP.b) && C8632dsu.c(this.c, c2506ahP.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        a aVar = this.c;
        return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        String str = this.b;
        a aVar = this.c;
        return "PinotPrequeryEntityFragment(__typename=" + str + ", unifiedEntity=" + aVar + ")";
    }

    public C2506ahP(String str, a aVar) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.c = aVar;
    }

    /* renamed from: o.ahP$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final String d;
        private final c e;

        public final String a() {
            return this.d;
        }

        public final c b() {
            return this.e;
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
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c(this.e, aVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            int hashCode2 = this.d.hashCode();
            c cVar = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            String str2 = this.d;
            c cVar = this.e;
            return "UnifiedEntity(__typename=" + str + ", unifiedEntityId=" + str2 + ", onVideo=" + cVar + ")";
        }

        public a(String str, String str2, c cVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.a = str;
            this.d = str2;
            this.e = cVar;
        }
    }

    /* renamed from: o.ahP$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final C2514ahX b;
        private final C2590aiu e;

        public final C2590aiu b() {
            return this.e;
        }

        public final C2514ahX d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c(this.b, cVar.b) && C8632dsu.c(this.e, cVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            C2514ahX c2514ahX = this.b;
            C2590aiu c2590aiu = this.e;
            return "OnVideo(playable=" + c2514ahX + ", preQuerySearchArtworkFragment=" + c2590aiu + ")";
        }

        public c(C2514ahX c2514ahX, C2590aiu c2590aiu) {
            C8632dsu.c((Object) c2514ahX, "");
            C8632dsu.c((Object) c2590aiu, "");
            this.b = c2514ahX;
            this.e = c2590aiu;
        }
    }
}
