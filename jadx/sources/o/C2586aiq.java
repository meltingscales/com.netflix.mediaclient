package o;

/* renamed from: o.aiq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2586aiq implements InterfaceC9037hy {
    private final String b;
    private final b d;
    private final c e;

    public final String a() {
        return this.b;
    }

    public final b b() {
        return this.d;
    }

    public final c c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2586aiq) {
            C2586aiq c2586aiq = (C2586aiq) obj;
            return C8632dsu.c((Object) this.b, (Object) c2586aiq.b) && C8632dsu.c(this.d, c2586aiq.d) && C8632dsu.c(this.e, c2586aiq.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        b bVar = this.d;
        int hashCode2 = bVar == null ? 0 : bVar.hashCode();
        c cVar = this.e;
        return (((hashCode * 31) + hashCode2) * 31) + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.b;
        b bVar = this.d;
        c cVar = this.e;
        return "PrePlaySectionFragment(__typename=" + str + ", onPinotPrePostPlayBaseSection=" + bVar + ", onPinotPrePlayRecapSection=" + cVar + ")";
    }

    public C2586aiq(String str, b bVar, c cVar) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.d = bVar;
        this.e = cVar;
    }

    /* renamed from: o.aiq$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final String c;
        private final a e;

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final a e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c(this.e, bVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            int hashCode2 = this.c.hashCode();
            a aVar = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            String str2 = this.c;
            a aVar = this.e;
            return "OnPinotPrePostPlayBaseSection(__typename=" + str + ", sectionId=" + str2 + ", loggingData=" + aVar + ")";
        }

        public b(String str, String str2, a aVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.a = str;
            this.c = str2;
            this.e = aVar;
        }
    }

    /* renamed from: o.aiq$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final h a;
        private final Boolean b;
        private final String d;

        public final h a() {
            return this.a;
        }

        public final Boolean d() {
            return this.b;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c(this.a, cVar.a) && C8632dsu.c(this.b, cVar.b) && C8632dsu.c((Object) this.d, (Object) cVar.d);
            }
            return false;
        }

        public int hashCode() {
            h hVar = this.a;
            int hashCode = hVar == null ? 0 : hVar.hashCode();
            Boolean bool = this.b;
            int hashCode2 = bool == null ? 0 : bool.hashCode();
            String str = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            h hVar = this.a;
            Boolean bool = this.b;
            String str = this.d;
            return "OnPinotPrePlayRecapSection(recapEntity=" + hVar + ", autoPlay=" + bool + ", impressionToken=" + str + ")";
        }

        public c(h hVar, Boolean bool, String str) {
            this.a = hVar;
            this.b = bool;
            this.d = str;
        }
    }

    /* renamed from: o.aiq$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String c;
        private final Integer d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final Integer d() {
            return this.d;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c(this.d, aVar.d) && C8632dsu.c((Object) this.e, (Object) aVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            Integer num = this.d;
            int hashCode2 = num == null ? 0 : num.hashCode();
            String str = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            Integer num = this.d;
            String str2 = this.e;
            return "LoggingData(__typename=" + str + ", trackId=" + num + ", feature=" + str2 + ")";
        }

        public a(String str, Integer num, String str2) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.d = num;
            this.e = str2;
        }
    }

    /* renamed from: o.aiq$h */
    /* loaded from: classes3.dex */
    public static final class h {
        private final String b;
        private final String d;
        private final e e;

        public final String a() {
            return this.b;
        }

        public final e b() {
            return this.e;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c((Object) this.b, (Object) hVar.b) && C8632dsu.c((Object) this.d, (Object) hVar.d) && C8632dsu.c(this.e, hVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = this.d.hashCode();
            e eVar = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            String str2 = this.d;
            e eVar = this.e;
            return "RecapEntity(__typename=" + str + ", unifiedEntityId=" + str2 + ", onVideo=" + eVar + ")";
        }

        public h(String str, String str2, e eVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.b = str;
            this.d = str2;
            this.e = eVar;
        }
    }

    /* renamed from: o.aiq$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final int b;
        private final d c;
        private final C2579aij e;

        public final C2579aij b() {
            return this.e;
        }

        public final d c() {
            return this.c;
        }

        public final int d() {
            return this.b;
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
                return this.b == eVar.b && C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c(this.c, eVar.c) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.b);
            int hashCode2 = this.a.hashCode();
            d dVar = this.c;
            return (((((hashCode * 31) + hashCode2) * 31) + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.e.hashCode();
        }

        public String toString() {
            int i = this.b;
            String str = this.a;
            d dVar = this.c;
            C2579aij c2579aij = this.e;
            return "OnVideo(videoId=" + i + ", __typename=" + str + ", onEpisode=" + dVar + ", playerUIBasicInfo=" + c2579aij + ")";
        }

        public e(int i, String str, d dVar, C2579aij c2579aij) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2579aij, "");
            this.b = i;
            this.a = str;
            this.c = dVar;
            this.e = c2579aij;
        }
    }

    /* renamed from: o.aiq$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final C2533ahq a;
        private final C2572aic c;
        private final j e;

        public final j a() {
            return this.e;
        }

        public final C2572aic b() {
            return this.c;
        }

        public final C2533ahq c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.e, dVar.e) && C8632dsu.c(this.a, dVar.a) && C8632dsu.c(this.c, dVar.c);
            }
            return false;
        }

        public int hashCode() {
            j jVar = this.e;
            return ((((jVar == null ? 0 : jVar.hashCode()) * 31) + this.a.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            j jVar = this.e;
            C2533ahq c2533ahq = this.a;
            C2572aic c2572aic = this.c;
            return "OnEpisode(parentShow=" + jVar + ", nextEpisodeInfo=" + c2533ahq + ", playerEpisodeDetails=" + c2572aic + ")";
        }

        public d(j jVar, C2533ahq c2533ahq, C2572aic c2572aic) {
            C8632dsu.c((Object) c2533ahq, "");
            C8632dsu.c((Object) c2572aic, "");
            this.e = jVar;
            this.a = c2533ahq;
            this.c = c2572aic;
        }
    }

    /* renamed from: o.aiq$j */
    /* loaded from: classes3.dex */
    public static final class j {
        private final String b;
        private final C2576aig c;

        public final String d() {
            return this.b;
        }

        public final C2576aig e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c((Object) this.b, (Object) jVar.b) && C8632dsu.c(this.c, jVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.b;
            C2576aig c2576aig = this.c;
            return "ParentShow(__typename=" + str + ", playerShowBasic=" + c2576aig + ")";
        }

        public j(String str, C2576aig c2576aig) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2576aig, "");
            this.b = str;
            this.c = c2576aig;
        }
    }
}
