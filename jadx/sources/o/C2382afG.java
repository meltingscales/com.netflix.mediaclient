package o;

/* renamed from: o.afG  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2382afG implements InterfaceC9037hy {
    private final c a;
    private final int b;
    private final String d;
    private final e e;

    public final c a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final e d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2382afG) {
            C2382afG c2382afG = (C2382afG) obj;
            return C8632dsu.c((Object) this.d, (Object) c2382afG.d) && this.b == c2382afG.b && C8632dsu.c(this.e, c2382afG.e) && C8632dsu.c(this.a, c2382afG.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        int hashCode2 = Integer.hashCode(this.b);
        e eVar = this.e;
        int hashCode3 = eVar == null ? 0 : eVar.hashCode();
        c cVar = this.a;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.d;
        int i = this.b;
        e eVar = this.e;
        c cVar = this.a;
        return "LiveVideoArtworkData(__typename=" + str + ", videoId=" + i + ", onShow=" + eVar + ", onLiveEventViewable=" + cVar + ")";
    }

    public C2382afG(String str, int i, e eVar, c cVar) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.b = i;
        this.e = eVar;
        this.a = cVar;
    }

    /* renamed from: o.afG$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final d a;

        public final d c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.a, ((e) obj).a);
        }

        public int hashCode() {
            d dVar = this.a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            d dVar = this.a;
            return "OnShow(nextLiveEvent=" + dVar + ")";
        }

        public e(d dVar) {
            this.a = dVar;
        }
    }

    /* renamed from: o.afG$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final b c;

        public final b a() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.c, ((c) obj).c);
        }

        public int hashCode() {
            b bVar = this.c;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            b bVar = this.c;
            return "OnLiveEventViewable(liveEvent=" + bVar + ")";
        }

        public c(b bVar) {
            this.c = bVar;
        }
    }

    /* renamed from: o.afG$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final C2376afA b;

        public final String d() {
            return this.a;
        }

        public final C2376afA e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c(this.b, dVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            C2376afA c2376afA = this.b;
            return "NextLiveEvent(__typename=" + str + ", liveEventArtwork=" + c2376afA + ")";
        }

        public d(String str, C2376afA c2376afA) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2376afA, "");
            this.a = str;
            this.b = c2376afA;
        }
    }

    /* renamed from: o.afG$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final C2376afA c;

        public final C2376afA d() {
            return this.c;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c(this.c, bVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.a;
            C2376afA c2376afA = this.c;
            return "LiveEvent(__typename=" + str + ", liveEventArtwork=" + c2376afA + ")";
        }

        public b(String str, C2376afA c2376afA) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2376afA, "");
            this.a = str;
            this.c = c2376afA;
        }
    }
}
