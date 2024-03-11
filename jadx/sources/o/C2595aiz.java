package o;

/* renamed from: o.aiz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2595aiz implements InterfaceC9037hy {
    private final String d;
    private final c e;

    public final String c() {
        return this.d;
    }

    public final c d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2595aiz) {
            C2595aiz c2595aiz = (C2595aiz) obj;
            return C8632dsu.c((Object) this.d, (Object) c2595aiz.d) && C8632dsu.c(this.e, c2595aiz.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        c cVar = this.e;
        return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        String str = this.d;
        c cVar = this.e;
        return "RecommendedTrailer(__typename=" + str + ", promoVideo=" + cVar + ")";
    }

    public C2595aiz(String str, c cVar) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.e = cVar;
    }

    /* renamed from: o.aiz$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final d a;
        private final String c;

        public final String a() {
            return this.c;
        }

        public final d b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.c, (Object) cVar.c) && C8632dsu.c(this.a, cVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            d dVar = this.a;
            return (hashCode * 31) + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            String str = this.c;
            d dVar = this.a;
            return "PromoVideo(__typename=" + str + ", video=" + dVar + ")";
        }

        public c(String str, d dVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.a = dVar;
        }
    }

    /* renamed from: o.aiz$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final int b;
        private final String c;
        private final e e;

        public final String c() {
            return this.c;
        }

        public final e d() {
            return this.e;
        }

        public final int e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.c, (Object) dVar.c) && this.b == dVar.b && C8632dsu.c(this.e, dVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            int hashCode2 = Integer.hashCode(this.b);
            e eVar = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.c;
            int i = this.b;
            e eVar = this.e;
            return "Video(__typename=" + str + ", videoId=" + i + ", onViewable=" + eVar + ")";
        }

        public d(String str, int i, e eVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.b = i;
            this.e = eVar;
        }
    }

    /* renamed from: o.aiz$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final Integer d;

        public final Integer b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.d, ((e) obj).d);
        }

        public int hashCode() {
            Integer num = this.d;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public String toString() {
            Integer num = this.d;
            return "OnViewable(runtimeSec=" + num + ")";
        }

        public e(Integer num) {
            this.d = num;
        }
    }
}
