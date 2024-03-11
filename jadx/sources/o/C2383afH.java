package o;

/* renamed from: o.afH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2383afH implements InterfaceC9037hy {
    private final h b;
    private final f c;
    private final int d;
    private final String e;

    public final h a() {
        return this.b;
    }

    public final f c() {
        return this.c;
    }

    public final String d() {
        return this.e;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2383afH) {
            C2383afH c2383afH = (C2383afH) obj;
            return C8632dsu.c((Object) this.e, (Object) c2383afH.e) && this.d == c2383afH.d && C8632dsu.c(this.c, c2383afH.c) && C8632dsu.c(this.b, c2383afH.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        int hashCode2 = Integer.hashCode(this.d);
        f fVar = this.c;
        int hashCode3 = fVar == null ? 0 : fVar.hashCode();
        h hVar = this.b;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (hVar != null ? hVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.e;
        int i = this.d;
        f fVar = this.c;
        h hVar = this.b;
        return "LiveVideoData(__typename=" + str + ", videoId=" + i + ", onShow=" + fVar + ", onLiveEventViewable=" + hVar + ")";
    }

    public C2383afH(String str, int i, f fVar, h hVar) {
        C8632dsu.c((Object) str, "");
        this.e = str;
        this.d = i;
        this.c = fVar;
        this.b = hVar;
    }

    /* renamed from: o.afH$f */
    /* loaded from: classes3.dex */
    public static final class f {
        private final Boolean c;
        private final e e;

        public final e d() {
            return this.e;
        }

        public final Boolean e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return C8632dsu.c(this.c, fVar.c) && C8632dsu.c(this.e, fVar.e);
            }
            return false;
        }

        public int hashCode() {
            Boolean bool = this.c;
            int hashCode = bool == null ? 0 : bool.hashCode();
            e eVar = this.e;
            return (hashCode * 31) + (eVar != null ? eVar.hashCode() : 0);
        }

        public String toString() {
            Boolean bool = this.c;
            e eVar = this.e;
            return "OnShow(hasLiveEvent=" + bool + ", nextLiveEvent=" + eVar + ")";
        }

        public f(Boolean bool, e eVar) {
            this.c = bool;
            this.e = eVar;
        }
    }

    /* renamed from: o.afH$h */
    /* loaded from: classes3.dex */
    public static final class h {
        private final c a;
        private final d b;

        public final d c() {
            return this.b;
        }

        public final c d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c(this.a, hVar.a) && C8632dsu.c(this.b, hVar.b);
            }
            return false;
        }

        public int hashCode() {
            c cVar = this.a;
            int hashCode = cVar == null ? 0 : cVar.hashCode();
            d dVar = this.b;
            return (hashCode * 31) + (dVar != null ? dVar.hashCode() : 0);
        }

        public String toString() {
            c cVar = this.a;
            d dVar = this.b;
            return "OnLiveEventViewable(liveEvent=" + cVar + ", onEpisode=" + dVar + ")";
        }

        public h(c cVar, d dVar) {
            this.a = cVar;
            this.b = dVar;
        }
    }

    /* renamed from: o.afH$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final C2436afz a;
        private final String c;
        private final a e;

        public final a a() {
            return this.e;
        }

        public final C2436afz b() {
            return this.a;
        }

        public final String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c(this.e, eVar.e) && C8632dsu.c(this.a, eVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            a aVar = this.e;
            return (((hashCode * 31) + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.c;
            a aVar = this.e;
            C2436afz c2436afz = this.a;
            return "NextLiveEvent(__typename=" + str + ", event=" + aVar + ", liveEventData=" + c2436afz + ")";
        }

        public e(String str, a aVar, C2436afz c2436afz) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2436afz, "");
            this.c = str;
            this.e = aVar;
            this.a = c2436afz;
        }
    }

    /* renamed from: o.afH$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final b b;

        public final b a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c(this.b, aVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            b bVar = this.b;
            return (hashCode * 31) + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            b bVar = this.b;
            return "Event(__typename=" + str + ", onEpisode=" + bVar + ")";
        }

        public a(String str, b bVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.b = bVar;
        }
    }

    /* renamed from: o.afH$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final int b;
        private final String d;
        private final Integer e;

        public final Integer b() {
            return this.e;
        }

        public final String c() {
            return this.d;
        }

        public final int e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.d, (Object) bVar.d) && this.b == bVar.b && C8632dsu.c(this.e, bVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = Integer.hashCode(this.b);
            Integer num = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            String str = this.d;
            int i = this.b;
            Integer num = this.e;
            return "OnEpisode(__typename=" + str + ", videoId=" + i + ", number=" + num + ")";
        }

        public b(String str, int i, Integer num) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.b = i;
            this.e = num;
        }
    }

    /* renamed from: o.afH$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final C2436afz a;
        private final String b;

        public final String b() {
            return this.b;
        }

        public final C2436afz c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c(this.a, cVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.b;
            C2436afz c2436afz = this.a;
            return "LiveEvent(__typename=" + str + ", liveEventData=" + c2436afz + ")";
        }

        public c(String str, C2436afz c2436afz) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2436afz, "");
            this.b = str;
            this.a = c2436afz;
        }
    }

    /* renamed from: o.afH$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final int a;
        private final String b;
        private final Integer e;

        public final Integer b() {
            return this.e;
        }

        public final String c() {
            return this.b;
        }

        public final int d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && this.a == dVar.a && C8632dsu.c(this.e, dVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = Integer.hashCode(this.a);
            Integer num = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            String str = this.b;
            int i = this.a;
            Integer num = this.e;
            return "OnEpisode1(__typename=" + str + ", videoId=" + i + ", number=" + num + ")";
        }

        public d(String str, int i, Integer num) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = i;
            this.e = num;
        }
    }
}
