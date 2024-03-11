package o;

import java.util.List;

/* renamed from: o.ael  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2360ael implements InterfaceC9037hy {
    private final String a;
    private final int b;
    private final d e;

    public final d b() {
        return this.e;
    }

    public final String c() {
        return this.a;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2360ael) {
            C2360ael c2360ael = (C2360ael) obj;
            return C8632dsu.c((Object) this.a, (Object) c2360ael.a) && this.b == c2360ael.b && C8632dsu.c(this.e, c2360ael.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = Integer.hashCode(this.b);
        d dVar = this.e;
        return (((hashCode * 31) + hashCode2) * 31) + (dVar == null ? 0 : dVar.hashCode());
    }

    public String toString() {
        String str = this.a;
        int i = this.b;
        d dVar = this.e;
        return "EpisodeListInfo(__typename=" + str + ", videoId=" + i + ", episodes=" + dVar + ")";
    }

    public C2360ael(String str, int i, d dVar) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.b = i;
        this.e = dVar;
    }

    /* renamed from: o.ael$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final List<e> a;
        private final String c;
        private final Integer e;

        public final Integer b() {
            return this.e;
        }

        public final List<e> c() {
            return this.a;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.c, (Object) dVar.c) && C8632dsu.c(this.e, dVar.e) && C8632dsu.c(this.a, dVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            Integer num = this.e;
            int hashCode2 = num == null ? 0 : num.hashCode();
            List<e> list = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            Integer num = this.e;
            List<e> list = this.a;
            return "Episodes(__typename=" + str + ", totalCount=" + num + ", edges=" + list + ")";
        }

        public d(String str, Integer num, List<e> list) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.e = num;
            this.a = list;
        }
    }

    /* renamed from: o.ael$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final c d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final c d() {
            return this.d;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.e, (Object) eVar.e) && C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c(this.d, eVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.a;
            int hashCode2 = str == null ? 0 : str.hashCode();
            c cVar = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (cVar != null ? cVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            String str2 = this.a;
            c cVar = this.d;
            return "Edge(__typename=" + str + ", cursor=" + str2 + ", node=" + cVar + ")";
        }

        public e(String str, String str2, c cVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = str2;
            this.d = cVar;
        }
    }

    /* renamed from: o.ael$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String a;
        private final C2363aeo b;

        public final String b() {
            return this.a;
        }

        public final C2363aeo d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.a, (Object) cVar.a) && C8632dsu.c(this.b, cVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            C2363aeo c2363aeo = this.b;
            return "Node(__typename=" + str + ", episodeInfo=" + c2363aeo + ")";
        }

        public c(String str, C2363aeo c2363aeo) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2363aeo, "");
            this.a = str;
            this.b = c2363aeo;
        }
    }
}
