package o;

/* renamed from: o.ahX  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2514ahX implements InterfaceC9037hy {
    private final c a;
    private final int b;
    private final a c;
    private final d d;
    private final String e;

    public final a a() {
        return this.c;
    }

    public final c b() {
        return this.a;
    }

    public final String c() {
        return this.e;
    }

    public final d d() {
        return this.d;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2514ahX) {
            C2514ahX c2514ahX = (C2514ahX) obj;
            return C8632dsu.c((Object) this.e, (Object) c2514ahX.e) && this.b == c2514ahX.b && C8632dsu.c(this.a, c2514ahX.a) && C8632dsu.c(this.d, c2514ahX.d) && C8632dsu.c(this.c, c2514ahX.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        int hashCode2 = Integer.hashCode(this.b);
        c cVar = this.a;
        int hashCode3 = cVar == null ? 0 : cVar.hashCode();
        d dVar = this.d;
        int hashCode4 = dVar == null ? 0 : dVar.hashCode();
        a aVar = this.c;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.e;
        int i = this.b;
        c cVar = this.a;
        d dVar = this.d;
        a aVar = this.c;
        return "Playable(__typename=" + str + ", videoId=" + i + ", onMovie=" + cVar + ", onShow=" + dVar + ", onEpisode=" + aVar + ")";
    }

    public C2514ahX(String str, int i, c cVar, d dVar, a aVar) {
        C8632dsu.c((Object) str, "");
        this.e = str;
        this.b = i;
        this.a = cVar;
        this.d = dVar;
        this.c = aVar;
    }

    /* renamed from: o.ahX$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final C2638ajp a;
        private final C2630ajh c;
        private final C2412afk d;

        public final C2630ajh a() {
            return this.c;
        }

        public final C2638ajp b() {
            return this.a;
        }

        public final C2412afk d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c(this.c, cVar.c) && C8632dsu.c(this.a, cVar.a) && C8632dsu.c(this.d, cVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            C2630ajh c2630ajh = this.c;
            C2638ajp c2638ajp = this.a;
            C2412afk c2412afk = this.d;
            return "OnMovie(videoSummary=" + c2630ajh + ", viewable=" + c2638ajp + ", interactiveVideo=" + c2412afk + ")";
        }

        public c(C2630ajh c2630ajh, C2638ajp c2638ajp, C2412afk c2412afk) {
            C8632dsu.c((Object) c2630ajh, "");
            C8632dsu.c((Object) c2638ajp, "");
            C8632dsu.c((Object) c2412afk, "");
            this.c = c2630ajh;
            this.a = c2638ajp;
            this.d = c2412afk;
        }
    }

    /* renamed from: o.ahX$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final int b;
        private final b d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final int b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final b d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && this.b == dVar.b && C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c(this.d, dVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            int hashCode2 = Integer.hashCode(this.b);
            String str = this.e;
            int hashCode3 = str == null ? 0 : str.hashCode();
            b bVar = this.d;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            int i = this.b;
            String str2 = this.e;
            b bVar = this.d;
            return "OnShow(__typename=" + str + ", videoId=" + i + ", title=" + str2 + ", currentEpisode=" + bVar + ")";
        }

        public d(String str, int i, String str2, b bVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.b = i;
            this.e = str2;
            this.d = bVar;
        }
    }

    /* renamed from: o.ahX$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final C2513ahW c;

        public final C2513ahW d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.c, ((a) obj).c);
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            C2513ahW c2513ahW = this.c;
            return "OnEpisode(playableEpisode=" + c2513ahW + ")";
        }

        public a(C2513ahW c2513ahW) {
            C8632dsu.c((Object) c2513ahW, "");
            this.c = c2513ahW;
        }
    }

    /* renamed from: o.ahX$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final C2513ahW c;
        private final String e;

        public final String c() {
            return this.e;
        }

        public final C2513ahW d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c(this.c, bVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.e;
            C2513ahW c2513ahW = this.c;
            return "CurrentEpisode(__typename=" + str + ", playableEpisode=" + c2513ahW + ")";
        }

        public b(String str, C2513ahW c2513ahW) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2513ahW, "");
            this.e = str;
            this.c = c2513ahW;
        }
    }
}
