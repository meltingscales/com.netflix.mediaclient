package o;

import java.util.List;

/* renamed from: o.ahk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2527ahk implements InterfaceC9037hy {
    private final String b;
    private final C2529ahm d;
    private final a e;

    public final a b() {
        return this.e;
    }

    public final C2529ahm d() {
        return this.d;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2527ahk) {
            C2527ahk c2527ahk = (C2527ahk) obj;
            return C8632dsu.c((Object) this.b, (Object) c2527ahk.b) && C8632dsu.c(this.e, c2527ahk.e) && C8632dsu.c(this.d, c2527ahk.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        a aVar = this.e;
        return (((hashCode * 31) + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.b;
        a aVar = this.e;
        C2529ahm c2529ahm = this.d;
        return "LolomoTrendingNowRow(__typename=" + str + ", genericContainerEntities=" + aVar + ", lolomoVideoRow=" + c2529ahm + ")";
    }

    public C2527ahk(String str, a aVar, C2529ahm c2529ahm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2529ahm, "");
        this.b = str;
        this.e = aVar;
        this.d = c2529ahm;
    }

    /* renamed from: o.ahk$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String c;
        private final List<e> e;

        public final String b() {
            return this.c;
        }

        public final List<e> c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c(this.e, aVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            List<e> list = this.e;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.c;
            List<e> list = this.e;
            return "GenericContainerEntities(__typename=" + str + ", edges=" + list + ")";
        }

        public a(String str, List<e> list) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.e = list;
        }
    }

    /* renamed from: o.ahk$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final b b;
        private final String c;

        public final String b() {
            return this.c;
        }

        public final b e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c(this.b, eVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            b bVar = this.b;
            return (hashCode * 31) + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            String str = this.c;
            b bVar = this.b;
            return "Edge(__typename=" + str + ", node=" + bVar + ")";
        }

        public e(String str, b bVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.b = bVar;
        }
    }

    /* renamed from: o.ahk$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final c e;

        public final String b() {
            return this.a;
        }

        public final c e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c(this.e, bVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            c cVar = this.e;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            c cVar = this.e;
            return "Node(__typename=" + str + ", reference=" + cVar + ")";
        }

        public b(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.e = cVar;
        }
    }

    /* renamed from: o.ahk$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final C2561aiR d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final C2561aiR c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.e, (Object) cVar.e) && C8632dsu.c(this.d, cVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            C2561aiR c2561aiR = this.d;
            return (hashCode * 31) + (c2561aiR == null ? 0 : c2561aiR.hashCode());
        }

        public String toString() {
            String str = this.e;
            C2561aiR c2561aiR = this.d;
            return "Reference(__typename=" + str + ", trendingNowContainer=" + c2561aiR + ")";
        }

        public c(String str, C2561aiR c2561aiR) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = c2561aiR;
        }
    }
}
