package o;

/* renamed from: o.aie  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2574aie implements InterfaceC9037hy {
    private final C2315adt a;
    private final String b;
    private final b c;
    private final C2637ajo d;
    private final C2512ahV e;

    public final C2512ahV a() {
        return this.e;
    }

    public final C2315adt b() {
        return this.a;
    }

    public final b c() {
        return this.c;
    }

    public final C2637ajo d() {
        return this.d;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2574aie) {
            C2574aie c2574aie = (C2574aie) obj;
            return C8632dsu.c((Object) this.b, (Object) c2574aie.b) && C8632dsu.c(this.c, c2574aie.c) && C8632dsu.c(this.d, c2574aie.d) && C8632dsu.c(this.e, c2574aie.e) && C8632dsu.c(this.a, c2574aie.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        b bVar = this.c;
        int hashCode2 = bVar == null ? 0 : bVar.hashCode();
        C2637ajo c2637ajo = this.d;
        return (((((((hashCode * 31) + hashCode2) * 31) + (c2637ajo != null ? c2637ajo.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = this.b;
        b bVar = this.c;
        C2637ajo c2637ajo = this.d;
        C2512ahV c2512ahV = this.e;
        C2315adt c2315adt = this.a;
        return "PlayerPrefetch(__typename=" + str + ", onEpisode=" + bVar + ", videoTimeCodes=" + c2637ajo + ", playerAdvisories=" + c2512ahV + ", broadcastInfo=" + c2315adt + ")";
    }

    public C2574aie(String str, b bVar, C2637ajo c2637ajo, C2512ahV c2512ahV, C2315adt c2315adt) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2512ahV, "");
        C8632dsu.c((Object) c2315adt, "");
        this.b = str;
        this.c = bVar;
        this.d = c2637ajo;
        this.e = c2512ahV;
        this.a = c2315adt;
    }

    /* renamed from: o.aie$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final c b;
        private final Boolean c;
        private final d d;
        private final a e;
        private final int g;
        private final Boolean j;

        public final Boolean a() {
            return this.j;
        }

        public final c b() {
            return this.b;
        }

        public final int c() {
            return this.g;
        }

        public final d d() {
            return this.d;
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
                return C8632dsu.c(this.j, bVar.j) && C8632dsu.c(this.c, bVar.c) && C8632dsu.c(this.e, bVar.e) && this.g == bVar.g && C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c(this.b, bVar.b) && C8632dsu.c(this.d, bVar.d);
            }
            return false;
        }

        public final Boolean g() {
            return this.c;
        }

        public int hashCode() {
            Boolean bool = this.j;
            int hashCode = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.c;
            int hashCode2 = bool2 == null ? 0 : bool2.hashCode();
            a aVar = this.e;
            int hashCode3 = aVar == null ? 0 : aVar.hashCode();
            int hashCode4 = Integer.hashCode(this.g);
            int hashCode5 = this.a.hashCode();
            c cVar = this.b;
            int hashCode6 = cVar == null ? 0 : cVar.hashCode();
            d dVar = this.d;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (dVar != null ? dVar.hashCode() : 0);
        }

        public final String j() {
            return this.a;
        }

        public String toString() {
            Boolean bool = this.j;
            Boolean bool2 = this.c;
            a aVar = this.e;
            int i = this.g;
            String str = this.a;
            c cVar = this.b;
            d dVar = this.d;
            return "OnEpisode(supportsInteractiveExperiences=" + bool + ", isPlayable=" + bool2 + ", mdxBoxart=" + aVar + ", videoId=" + i + ", __typename=" + str + ", parentShow=" + cVar + ", nextEpisode=" + dVar + ")";
        }

        public b(Boolean bool, Boolean bool2, a aVar, int i, String str, c cVar, d dVar) {
            C8632dsu.c((Object) str, "");
            this.j = bool;
            this.c = bool2;
            this.e = aVar;
            this.g = i;
            this.a = str;
            this.b = cVar;
            this.d = dVar;
        }
    }

    /* renamed from: o.aie$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final String d;
        private final String e;

        public final String b() {
            return this.d;
        }

        public final String c() {
            return this.a;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c((Object) this.d, (Object) aVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.e;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.e;
            String str3 = this.d;
            return "MdxBoxart(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ")";
        }

        public a(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.e = str2;
            this.d = str3;
        }
    }

    /* renamed from: o.aie$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String b;
        private final int c;
        private final e d;

        public final e a() {
            return this.d;
        }

        public final int c() {
            return this.c;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && this.c == cVar.c && C8632dsu.c(this.d, cVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = Integer.hashCode(this.c);
            e eVar = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            int i = this.c;
            e eVar = this.d;
            return "ParentShow(__typename=" + str + ", videoId=" + i + ", currentEpisode=" + eVar + ")";
        }

        public c(String str, int i, e eVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.c = i;
            this.d = eVar;
        }
    }

    /* renamed from: o.aie$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final int d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final int c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.e, (Object) eVar.e) && this.d == eVar.d;
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + Integer.hashCode(this.d);
        }

        public String toString() {
            String str = this.e;
            int i = this.d;
            return "CurrentEpisode(__typename=" + str + ", videoId=" + i + ")";
        }

        public e(String str, int i) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = i;
        }
    }

    /* renamed from: o.aie$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final int b;
        private final String c;

        public final String a() {
            return this.c;
        }

        public final int d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.c, (Object) dVar.c) && this.b == dVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + Integer.hashCode(this.b);
        }

        public String toString() {
            String str = this.c;
            int i = this.b;
            return "NextEpisode(__typename=" + str + ", videoId=" + i + ")";
        }

        public d(String str, int i) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.b = i;
        }
    }
}
