package o;

/* renamed from: o.ahB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2492ahB implements InterfaceC9037hy {
    private final String a;
    private final i b;
    private final d c;
    private final b d;
    private final e e;

    public final b a() {
        return this.d;
    }

    public final i b() {
        return this.b;
    }

    public final d c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final e e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2492ahB) {
            C2492ahB c2492ahB = (C2492ahB) obj;
            return C8632dsu.c((Object) this.a, (Object) c2492ahB.a) && C8632dsu.c(this.b, c2492ahB.b) && C8632dsu.c(this.d, c2492ahB.d) && C8632dsu.c(this.c, c2492ahB.c) && C8632dsu.c(this.e, c2492ahB.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        i iVar = this.b;
        int hashCode2 = iVar == null ? 0 : iVar.hashCode();
        b bVar = this.d;
        int hashCode3 = bVar == null ? 0 : bVar.hashCode();
        d dVar = this.c;
        int hashCode4 = dVar == null ? 0 : dVar.hashCode();
        e eVar = this.e;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.a;
        i iVar = this.b;
        b bVar = this.d;
        d dVar = this.c;
        e eVar = this.e;
        return "PinotEntityFragment(__typename=" + str + ", onPinotUnifiedEntityContainer=" + iVar + ", onPinotBasicSearchEntity=" + bVar + ", onIrmaAndroidPreQuerySearchEntityTreatment=" + dVar + ", onPinotTextEntity=" + eVar + ")";
    }

    public C2492ahB(String str, i iVar, b bVar, d dVar, e eVar) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.b = iVar;
        this.d = bVar;
        this.c = dVar;
        this.e = eVar;
    }

    /* renamed from: o.ahB$i */
    /* loaded from: classes3.dex */
    public static final class i {
        private final j d;

        public final j a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && C8632dsu.c(this.d, ((i) obj).d);
        }

        public int hashCode() {
            j jVar = this.d;
            if (jVar == null) {
                return 0;
            }
            return jVar.hashCode();
        }

        public String toString() {
            j jVar = this.d;
            return "OnPinotUnifiedEntityContainer(unifiedEntity=" + jVar + ")";
        }

        public i(j jVar) {
            this.d = jVar;
        }
    }

    /* renamed from: o.ahB$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String d;
        private final c e;

        public final String d() {
            return this.d;
        }

        public final c e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.d, (Object) bVar.d) && C8632dsu.c(this.e, bVar.e);
            }
            return false;
        }

        public int hashCode() {
            String str = this.d;
            int hashCode = str == null ? 0 : str.hashCode();
            c cVar = this.e;
            return (hashCode * 31) + (cVar != null ? cVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            c cVar = this.e;
            return "OnPinotBasicSearchEntity(displayString=" + str + ", artwork=" + cVar + ")";
        }

        public b(String str, c cVar) {
            this.d = str;
            this.e = cVar;
        }
    }

    /* renamed from: o.ahB$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c((Object) this.a, (Object) ((d) obj).a);
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.a;
            return "OnIrmaAndroidPreQuerySearchEntityTreatment(title=" + str + ")";
        }

        public d(String str) {
            this.a = str;
        }
    }

    /* renamed from: o.ahB$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String c;
        private final String d;

        public final String b() {
            return this.d;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c((Object) this.d, (Object) eVar.d);
            }
            return false;
        }

        public int hashCode() {
            String str = this.c;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.c;
            String str2 = this.d;
            return "OnPinotTextEntity(displayString=" + str + ", unifiedEntityId=" + str2 + ")";
        }

        public e(String str, String str2) {
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.d = str2;
        }
    }

    /* renamed from: o.ahB$j */
    /* loaded from: classes3.dex */
    public static final class j {
        private final h a;
        private final a b;
        private final String c;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final a c() {
            return this.b;
        }

        public final String d() {
            return this.c;
        }

        public final h e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c((Object) this.e, (Object) jVar.e) && C8632dsu.c((Object) this.c, (Object) jVar.c) && C8632dsu.c(this.a, jVar.a) && C8632dsu.c(this.b, jVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            int hashCode2 = this.c.hashCode();
            h hVar = this.a;
            int hashCode3 = hVar == null ? 0 : hVar.hashCode();
            a aVar = this.b;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (aVar != null ? aVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            String str2 = this.c;
            h hVar = this.a;
            a aVar = this.b;
            return "UnifiedEntity(__typename=" + str + ", unifiedEntityId=" + str2 + ", onVideo=" + hVar + ", onGame=" + aVar + ")";
        }

        public j(String str, String str2, h hVar, a aVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.e = str;
            this.c = str2;
            this.a = hVar;
            this.b = aVar;
        }
    }

    /* renamed from: o.ahB$h */
    /* loaded from: classes3.dex */
    public static final class h {
        private final C2630ajh d;

        public final C2630ajh d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && C8632dsu.c(this.d, ((h) obj).d);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            C2630ajh c2630ajh = this.d;
            return "OnVideo(videoSummary=" + c2630ajh + ")";
        }

        public h(C2630ajh c2630ajh) {
            C8632dsu.c((Object) c2630ajh, "");
            this.d = c2630ajh;
        }
    }

    /* renamed from: o.ahB$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final C2331aeI a;
        private final C2344aeV c;

        public final C2331aeI c() {
            return this.a;
        }

        public final C2344aeV d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c(this.c, aVar.c) && C8632dsu.c(this.a, aVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            C2344aeV c2344aeV = this.c;
            C2331aeI c2331aeI = this.a;
            return "OnGame(gameSummary=" + c2344aeV + ", gameArtwork=" + c2331aeI + ")";
        }

        public a(C2344aeV c2344aeV, C2331aeI c2331aeI) {
            C8632dsu.c((Object) c2344aeV, "");
            C8632dsu.c((Object) c2331aeI, "");
            this.c = c2344aeV;
            this.a = c2331aeI;
        }
    }

    /* renamed from: o.ahB$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String b;
        private final String d;
        private final String e;

        public final String a() {
            return this.d;
        }

        public final String c() {
            return this.b;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.e, (Object) cVar.e) && C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c((Object) this.b, (Object) cVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.d;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            String str2 = this.d;
            String str3 = this.b;
            return "Artwork(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public c(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = str2;
            this.b = str3;
        }
    }
}
