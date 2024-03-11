package o;

/* renamed from: o.aex  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2372aex implements InterfaceC9037hy {
    private final e a;
    private final d b;
    private final String d;

    public final d a() {
        return this.b;
    }

    public final e c() {
        return this.a;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2372aex) {
            C2372aex c2372aex = (C2372aex) obj;
            return C8632dsu.c((Object) this.d, (Object) c2372aex.d) && C8632dsu.c(this.b, c2372aex.b) && C8632dsu.c(this.a, c2372aex.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        d dVar = this.b;
        int hashCode2 = dVar == null ? 0 : dVar.hashCode();
        e eVar = this.a;
        return (((hashCode * 31) + hashCode2) * 31) + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.d;
        d dVar = this.b;
        e eVar = this.a;
        return "FeedEntityData(__typename=" + str + ", onVideo=" + dVar + ", onGame=" + eVar + ")";
    }

    public C2372aex(String str, d dVar, e eVar) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.b = dVar;
        this.a = eVar;
    }

    /* renamed from: o.aex$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final C2638ajp a;
        private final C2630ajh d;

        public final C2638ajp a() {
            return this.a;
        }

        public final C2630ajh b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.d, dVar.d) && C8632dsu.c(this.a, dVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            C2638ajp c2638ajp = this.a;
            return (hashCode * 31) + (c2638ajp == null ? 0 : c2638ajp.hashCode());
        }

        public String toString() {
            C2630ajh c2630ajh = this.d;
            C2638ajp c2638ajp = this.a;
            return "OnVideo(videoSummary=" + c2630ajh + ", viewable=" + c2638ajp + ")";
        }

        public d(C2630ajh c2630ajh, C2638ajp c2638ajp) {
            C8632dsu.c((Object) c2630ajh, "");
            this.d = c2630ajh;
            this.a = c2638ajp;
        }
    }

    /* renamed from: o.aex$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final C2344aeV a;
        private final Boolean c;

        public final C2344aeV c() {
            return this.a;
        }

        public final Boolean d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c(this.c, eVar.c) && C8632dsu.c(this.a, eVar.a);
            }
            return false;
        }

        public int hashCode() {
            Boolean bool = this.c;
            return ((bool == null ? 0 : bool.hashCode()) * 31) + this.a.hashCode();
        }

        public String toString() {
            Boolean bool = this.c;
            C2344aeV c2344aeV = this.a;
            return "OnGame(isDeviceSupported=" + bool + ", gameSummary=" + c2344aeV + ")";
        }

        public e(Boolean bool, C2344aeV c2344aeV) {
            C8632dsu.c((Object) c2344aeV, "");
            this.c = bool;
            this.a = c2344aeV;
        }
    }
}
