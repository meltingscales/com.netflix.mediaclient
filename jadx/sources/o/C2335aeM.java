package o;

/* renamed from: o.aeM  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2335aeM implements InterfaceC9037hy {
    private final String a;
    private final d b;
    private final int d;
    private final b e;

    public final int b() {
        return this.d;
    }

    public final b c() {
        return this.e;
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
        if (obj instanceof C2335aeM) {
            C2335aeM c2335aeM = (C2335aeM) obj;
            return C8632dsu.c((Object) this.a, (Object) c2335aeM.a) && this.d == c2335aeM.d && C8632dsu.c(this.e, c2335aeM.e) && C8632dsu.c(this.b, c2335aeM.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = Integer.hashCode(this.d);
        b bVar = this.e;
        int hashCode3 = bVar == null ? 0 : bVar.hashCode();
        d dVar = this.b;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (dVar != null ? dVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.a;
        int i = this.d;
        b bVar = this.e;
        d dVar = this.b;
        return "GameBillboard(__typename=" + str + ", gameId=" + i + ", promoVideo=" + bVar + ", heroImageAsset=" + dVar + ")";
    }

    public C2335aeM(String str, int i, b bVar, d dVar) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.d = i;
        this.e = bVar;
        this.b = dVar;
    }

    /* renamed from: o.aeM$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final c d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final c e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c(this.d, bVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            c cVar = this.d;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            c cVar = this.d;
            return "PromoVideo(__typename=" + str + ", video=" + cVar + ")";
        }

        public b(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = cVar;
        }
    }

    /* renamed from: o.aeM$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String b;
        private final String c;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final String b() {
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
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c((Object) this.c, (Object) dVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.e;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.e;
            String str3 = this.c;
            return "HeroImageAsset(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ")";
        }

        public d(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = str2;
            this.c = str3;
        }
    }

    /* renamed from: o.aeM$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String b;
        private final int d;

        public final int d() {
            return this.d;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && this.d == cVar.d;
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + Integer.hashCode(this.d);
        }

        public String toString() {
            String str = this.b;
            int i = this.d;
            return "Video(__typename=" + str + ", videoId=" + i + ")";
        }

        public c(String str, int i) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = i;
        }
    }
}
