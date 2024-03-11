package o;

/* renamed from: o.aep  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2364aep implements InterfaceC9037hy {
    private final String b;
    private final d c;
    private final Boolean e;

    public final String b() {
        return this.b;
    }

    public final Boolean c() {
        return this.e;
    }

    public final d d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2364aep) {
            C2364aep c2364aep = (C2364aep) obj;
            return C8632dsu.c((Object) this.b, (Object) c2364aep.b) && C8632dsu.c(this.e, c2364aep.e) && C8632dsu.c(this.c, c2364aep.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        Boolean bool = this.e;
        int hashCode2 = bool == null ? 0 : bool.hashCode();
        d dVar = this.c;
        return (((hashCode * 31) + hashCode2) * 31) + (dVar != null ? dVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.b;
        Boolean bool = this.e;
        d dVar = this.c;
        return "EpisodeListUIInfo(__typename=" + str + ", isInRemindMeList=" + bool + ", onEpisode=" + dVar + ")";
    }

    public C2364aep(String str, Boolean bool, d dVar) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.e = bool;
        this.c = dVar;
    }

    /* renamed from: o.aep$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final b e;

        public final b c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.e, ((d) obj).e);
        }

        public int hashCode() {
            b bVar = this.e;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            b bVar = this.e;
            return "OnEpisode(parentSeason=" + bVar + ")";
        }

        public d(b bVar) {
            this.e = bVar;
        }
    }

    /* renamed from: o.aep$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final e b;
        private final int c;
        private final String e;

        public final int a() {
            return this.c;
        }

        public final String b() {
            return this.e;
        }

        public final e d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && this.c == bVar.c && C8632dsu.c(this.b, bVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (((this.e.hashCode() * 31) + Integer.hashCode(this.c)) * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.e;
            int i = this.c;
            e eVar = this.b;
            return "ParentSeason(__typename=" + str + ", videoId=" + i + ", onSeason=" + eVar + ")";
        }

        public b(String str, int i, e eVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) eVar, "");
            this.e = str;
            this.c = i;
            this.b = eVar;
        }
    }

    /* renamed from: o.aep$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String d;

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c((Object) this.d, (Object) ((e) obj).d);
        }

        public int hashCode() {
            String str = this.d;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.d;
            return "OnSeason(longNumberLabel=" + str + ")";
        }

        public e(String str) {
            this.d = str;
        }
    }
}
