package o;

import java.util.List;

/* renamed from: o.aiC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2546aiC implements InterfaceC9037hy {
    private final String a;
    private final int c;
    private final e e;

    public final e a() {
        return this.e;
    }

    public final int b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2546aiC) {
            C2546aiC c2546aiC = (C2546aiC) obj;
            return C8632dsu.c((Object) this.a, (Object) c2546aiC.a) && this.c == c2546aiC.c && C8632dsu.c(this.e, c2546aiC.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = Integer.hashCode(this.c);
        e eVar = this.e;
        return (((hashCode * 31) + hashCode2) * 31) + (eVar == null ? 0 : eVar.hashCode());
    }

    public String toString() {
        String str = this.a;
        int i = this.c;
        e eVar = this.e;
        return "SeasonListInfo(__typename=" + str + ", videoId=" + i + ", seasons=" + eVar + ")";
    }

    public C2546aiC(String str, int i, e eVar) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.c = i;
        this.e = eVar;
    }

    /* renamed from: o.aiC$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final Integer a;
        private final String b;
        private final List<d> e;

        public final Integer b() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final List<d> e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && C8632dsu.c(this.a, eVar.a) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            Integer num = this.a;
            int hashCode2 = num == null ? 0 : num.hashCode();
            List<d> list = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            Integer num = this.a;
            List<d> list = this.e;
            return "Seasons(__typename=" + str + ", totalCount=" + num + ", edges=" + list + ")";
        }

        public e(String str, Integer num, List<d> list) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = num;
            this.e = list;
        }
    }

    /* renamed from: o.aiC$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String b;
        private final c d;

        public final c d() {
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
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c(this.d, dVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            c cVar = this.d;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            c cVar = this.d;
            return "Edge(__typename=" + str + ", node=" + cVar + ")";
        }

        public d(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = cVar;
        }
    }

    /* renamed from: o.aiC$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String a;
        private final C2547aiD d;

        public final String d() {
            return this.a;
        }

        public final C2547aiD e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.a, (Object) cVar.a) && C8632dsu.c(this.d, cVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.a;
            C2547aiD c2547aiD = this.d;
            return "Node(__typename=" + str + ", seasonInfo=" + c2547aiD + ")";
        }

        public c(String str, C2547aiD c2547aiD) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2547aiD, "");
            this.a = str;
            this.d = c2547aiD;
        }
    }
}
