package o;

/* renamed from: o.adN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2283adN implements InterfaceC9037hy {
    private final String a;
    private final c c;

    public final c a() {
        return this.c;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2283adN) {
            C2283adN c2283adN = (C2283adN) obj;
            return C8632dsu.c((Object) this.a, (Object) c2283adN.a) && C8632dsu.c(this.c, c2283adN.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        c cVar = this.c;
        return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        String str = this.a;
        c cVar = this.c;
        return "CurrentEpisodeInfo(__typename=" + str + ", currentEpisode=" + cVar + ")";
    }

    public C2283adN(String str, c cVar) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.c = cVar;
    }

    /* renamed from: o.adN$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final b a;
        private final String b;
        private final int c;
        private final String d;
        private final Integer e;

        public final int a() {
            return this.c;
        }

        public final String b() {
            return this.d;
        }

        public final String c() {
            return this.b;
        }

        public final Integer d() {
            return this.e;
        }

        public final b e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && this.c == cVar.c && C8632dsu.c(this.e, cVar.e) && C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c(this.a, cVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = Integer.hashCode(this.c);
            Integer num = this.e;
            int hashCode3 = num == null ? 0 : num.hashCode();
            String str = this.b;
            int hashCode4 = str == null ? 0 : str.hashCode();
            b bVar = this.a;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            int i = this.c;
            Integer num = this.e;
            String str2 = this.b;
            b bVar = this.a;
            return "CurrentEpisode(__typename=" + str + ", videoId=" + i + ", number=" + num + ", title=" + str2 + ", parentSeason=" + bVar + ")";
        }

        public c(String str, int i, Integer num, String str2, b bVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = i;
            this.e = num;
            this.b = str2;
            this.a = bVar;
        }
    }

    /* renamed from: o.adN$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String b;
        private final C2547aiD c;

        public final C2547aiD d() {
            return this.c;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c(this.c, bVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.b;
            C2547aiD c2547aiD = this.c;
            return "ParentSeason(__typename=" + str + ", seasonInfo=" + c2547aiD + ")";
        }

        public b(String str, C2547aiD c2547aiD) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2547aiD, "");
            this.b = str;
            this.c = c2547aiD;
        }
    }
}
