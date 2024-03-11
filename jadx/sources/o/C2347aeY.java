package o;

/* renamed from: o.aeY  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2347aeY implements InterfaceC9037hy {
    private final int a;
    private final String b;
    private final e d;

    public final e a() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2347aeY) {
            C2347aeY c2347aeY = (C2347aeY) obj;
            return C8632dsu.c((Object) this.b, (Object) c2347aeY.b) && this.a == c2347aeY.a && C8632dsu.c(this.d, c2347aeY.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = Integer.hashCode(this.a);
        e eVar = this.d;
        return (((hashCode * 31) + hashCode2) * 31) + (eVar == null ? 0 : eVar.hashCode());
    }

    public String toString() {
        String str = this.b;
        int i = this.a;
        e eVar = this.d;
        return "GameTrailer(__typename=" + str + ", gameId=" + i + ", recommendedTrailer=" + eVar + ")";
    }

    public C2347aeY(String str, int i, e eVar) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.a = i;
        this.d = eVar;
    }

    /* renamed from: o.aeY$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final c a;
        private final String c;

        public final String c() {
            return this.c;
        }

        public final c d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c(this.a, eVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            c cVar = this.a;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.c;
            c cVar = this.a;
            return "RecommendedTrailer(__typename=" + str + ", video=" + cVar + ")";
        }

        public e(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.a = cVar;
        }
    }

    /* renamed from: o.aeY$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final a a;
        private final String b;
        private final d d;
        private final int e;

        public final int a() {
            return this.e;
        }

        public final String b() {
            return this.b;
        }

        public final a d() {
            return this.a;
        }

        public final d e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && this.e == cVar.e && C8632dsu.c(this.a, cVar.a) && C8632dsu.c(this.d, cVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = Integer.hashCode(this.e);
            a aVar = this.a;
            int hashCode3 = aVar == null ? 0 : aVar.hashCode();
            d dVar = this.d;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (dVar != null ? dVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            int i = this.e;
            a aVar = this.a;
            d dVar = this.d;
            return "Video(__typename=" + str + ", videoId=" + i + ", artwork=" + aVar + ", onViewable=" + dVar + ")";
        }

        public c(String str, int i, a aVar, d dVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = i;
            this.a = aVar;
            this.d = dVar;
        }
    }

    /* renamed from: o.aeY$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final String b;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c((Object) this.b, (Object) aVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.e;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.e;
            String str3 = this.b;
            return "Artwork(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ")";
        }

        public a(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.e = str2;
            this.b = str3;
        }
    }

    /* renamed from: o.aeY$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final Integer c;

        public final Integer e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.c, ((d) obj).c);
        }

        public int hashCode() {
            Integer num = this.c;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public String toString() {
            Integer num = this.c;
            return "OnViewable(runtimeSec=" + num + ")";
        }

        public d(Integer num) {
            this.c = num;
        }
    }
}
