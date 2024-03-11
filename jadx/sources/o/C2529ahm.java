package o;

import java.util.List;

/* renamed from: o.ahm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2529ahm implements InterfaceC9037hy {
    private final C2454agQ a;
    private final String c;
    private final n d;

    public final C2454agQ b() {
        return this.a;
    }

    public final n c() {
        return this.d;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2529ahm) {
            C2529ahm c2529ahm = (C2529ahm) obj;
            return C8632dsu.c((Object) this.c, (Object) c2529ahm.c) && C8632dsu.c(this.d, c2529ahm.d) && C8632dsu.c(this.a, c2529ahm.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        n nVar = this.d;
        return (((hashCode * 31) + (nVar == null ? 0 : nVar.hashCode())) * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = this.c;
        n nVar = this.d;
        C2454agQ c2454agQ = this.a;
        return "LolomoVideoRow(__typename=" + str + ", videoEntities=" + nVar + ", lolomoRow=" + c2454agQ + ")";
    }

    public C2529ahm(String str, n nVar, C2454agQ c2454agQ) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2454agQ, "");
        this.c = str;
        this.d = nVar;
        this.a = c2454agQ;
    }

    /* renamed from: o.ahm$n */
    /* loaded from: classes3.dex */
    public static final class n {
        private final List<e> b;
        private final Integer c;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final Integer c() {
            return this.c;
        }

        public final List<e> d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                return C8632dsu.c((Object) this.d, (Object) nVar.d) && C8632dsu.c(this.c, nVar.c) && C8632dsu.c(this.b, nVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            Integer num = this.c;
            int hashCode2 = num == null ? 0 : num.hashCode();
            List<e> list = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            Integer num = this.c;
            List<e> list = this.b;
            return "VideoEntities(__typename=" + str + ", totalCount=" + num + ", edges=" + list + ")";
        }

        public n(String str, Integer num, List<e> list) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = num;
            this.b = list;
        }
    }

    /* renamed from: o.ahm$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final String b;
        private final String c;
        private final Integer d;
        private final C2433afw e;
        private final c i;

        public final C2433afw a() {
            return this.e;
        }

        public final String b() {
            return this.c;
        }

        public final c c() {
            return this.i;
        }

        public final Integer d() {
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
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c(this.d, eVar.d) && C8632dsu.c(this.i, eVar.i) && C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public final String h() {
            return this.b;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.c;
            int hashCode2 = str == null ? 0 : str.hashCode();
            Integer num = this.d;
            int hashCode3 = num == null ? 0 : num.hashCode();
            c cVar = this.i;
            int hashCode4 = cVar == null ? 0 : cVar.hashCode();
            String str2 = this.a;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.b;
            String str2 = this.c;
            Integer num = this.d;
            c cVar = this.i;
            String str3 = this.a;
            C2433afw c2433afw = this.e;
            return "Edge(__typename=" + str + ", cursor=" + str2 + ", index=" + num + ", node=" + cVar + ", impressionToken=" + str3 + ", listItemBoxart=" + c2433afw + ")";
        }

        public e(String str, String str2, Integer num, c cVar, String str3, C2433afw c2433afw) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2433afw, "");
            this.b = str;
            this.c = str2;
            this.d = num;
            this.i = cVar;
            this.a = str3;
            this.e = c2433afw;
        }
    }

    /* renamed from: o.ahm$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final b a;
        private final String b;
        private final h c;
        private final a e;

        public final String a() {
            return this.b;
        }

        public final b b() {
            return this.a;
        }

        public final h d() {
            return this.c;
        }

        public final a e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c(this.e, cVar.e) && C8632dsu.c(this.a, cVar.a) && C8632dsu.c(this.c, cVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            a aVar = this.e;
            int hashCode2 = aVar == null ? 0 : aVar.hashCode();
            b bVar = this.a;
            int hashCode3 = bVar == null ? 0 : bVar.hashCode();
            h hVar = this.c;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (hVar != null ? hVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            a aVar = this.e;
            b bVar = this.a;
            h hVar = this.c;
            return "Node(__typename=" + str + ", onLolomoDefaultNode=" + aVar + ", onLolomoBillboardNode=" + bVar + ", onLolomoRecentlyWatchedNode=" + hVar + ")";
        }

        public c(String str, a aVar, b bVar, h hVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = aVar;
            this.a = bVar;
            this.c = hVar;
        }
    }

    /* renamed from: o.ahm$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final g c;

        public final g a() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.c, ((a) obj).c);
        }

        public int hashCode() {
            g gVar = this.c;
            if (gVar == null) {
                return 0;
            }
            return gVar.hashCode();
        }

        public String toString() {
            g gVar = this.c;
            return "OnLolomoDefaultNode(reference=" + gVar + ")";
        }

        public a(g gVar) {
            this.c = gVar;
        }
    }

    /* renamed from: o.ahm$g */
    /* loaded from: classes3.dex */
    public static final class g {
        private final String a;
        private final j c;
        private final d e;

        public final j b() {
            return this.c;
        }

        public final d c() {
            return this.e;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.a, (Object) gVar.a) && C8632dsu.c(this.c, gVar.c) && C8632dsu.c(this.e, gVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            j jVar = this.c;
            int hashCode2 = jVar == null ? 0 : jVar.hashCode();
            d dVar = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (dVar != null ? dVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            j jVar = this.c;
            d dVar = this.e;
            return "Reference(__typename=" + str + ", onVideo=" + jVar + ", onGenericContainer=" + dVar + ")";
        }

        public g(String str, j jVar, d dVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = jVar;
            this.e = dVar;
        }
    }

    /* renamed from: o.ahm$j */
    /* loaded from: classes3.dex */
    public static final class j {
        private final C2383afH a;
        private final C2382afG b;
        private final C2630ajh d;

        public final C2383afH a() {
            return this.a;
        }

        public final C2382afG c() {
            return this.b;
        }

        public final C2630ajh e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c(this.d, jVar.d) && C8632dsu.c(this.a, jVar.a) && C8632dsu.c(this.b, jVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            C2383afH c2383afH = this.a;
            int hashCode2 = c2383afH == null ? 0 : c2383afH.hashCode();
            C2382afG c2382afG = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (c2382afG != null ? c2382afG.hashCode() : 0);
        }

        public String toString() {
            C2630ajh c2630ajh = this.d;
            C2383afH c2383afH = this.a;
            C2382afG c2382afG = this.b;
            return "OnVideo(videoSummary=" + c2630ajh + ", liveVideoData=" + c2383afH + ", liveVideoArtworkData=" + c2382afG + ")";
        }

        public j(C2630ajh c2630ajh, C2383afH c2383afH, C2382afG c2382afG) {
            C8632dsu.c((Object) c2630ajh, "");
            this.d = c2630ajh;
            this.a = c2383afH;
            this.b = c2382afG;
        }
    }

    /* renamed from: o.ahm$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String b;

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c((Object) this.b, (Object) ((d) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            String str = this.b;
            return "OnGenericContainer(id=" + str + ")";
        }

        public d(String str) {
            C8632dsu.c((Object) str, "");
            this.b = str;
        }
    }

    /* renamed from: o.ahm$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final k b;

        public final k e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.b, ((b) obj).b);
        }

        public int hashCode() {
            k kVar = this.b;
            if (kVar == null) {
                return 0;
            }
            return kVar.hashCode();
        }

        public String toString() {
            k kVar = this.b;
            return "OnLolomoBillboardNode(reference=" + kVar + ")";
        }

        public b(k kVar) {
            this.b = kVar;
        }
    }

    /* renamed from: o.ahm$k */
    /* loaded from: classes3.dex */
    public static final class k {
        private final f a;
        private final String b;

        public final f c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return C8632dsu.c((Object) this.b, (Object) kVar.b) && C8632dsu.c(this.a, kVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            f fVar = this.a;
            return (hashCode * 31) + (fVar == null ? 0 : fVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            f fVar = this.a;
            return "Reference1(__typename=" + str + ", onVideo=" + fVar + ")";
        }

        public k(String str, f fVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = fVar;
        }
    }

    /* renamed from: o.ahm$f */
    /* loaded from: classes3.dex */
    public static final class f {
        private final C2383afH b;
        private final C2630ajh e;

        public final C2630ajh a() {
            return this.e;
        }

        public final C2383afH d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return C8632dsu.c(this.e, fVar.e) && C8632dsu.c(this.b, fVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            C2383afH c2383afH = this.b;
            return (hashCode * 31) + (c2383afH == null ? 0 : c2383afH.hashCode());
        }

        public String toString() {
            C2630ajh c2630ajh = this.e;
            C2383afH c2383afH = this.b;
            return "OnVideo1(videoSummary=" + c2630ajh + ", liveVideoData=" + c2383afH + ")";
        }

        public f(C2630ajh c2630ajh, C2383afH c2383afH) {
            C8632dsu.c((Object) c2630ajh, "");
            this.e = c2630ajh;
            this.b = c2383afH;
        }
    }

    /* renamed from: o.ahm$h */
    /* loaded from: classes3.dex */
    public static final class h {
        private final m d;

        public final m a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && C8632dsu.c(this.d, ((h) obj).d);
        }

        public int hashCode() {
            m mVar = this.d;
            if (mVar == null) {
                return 0;
            }
            return mVar.hashCode();
        }

        public String toString() {
            m mVar = this.d;
            return "OnLolomoRecentlyWatchedNode(reference=" + mVar + ")";
        }

        public h(m mVar) {
            this.d = mVar;
        }
    }

    /* renamed from: o.ahm$m */
    /* loaded from: classes3.dex */
    public static final class m {
        private final i c;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final i e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof m) {
                m mVar = (m) obj;
                return C8632dsu.c((Object) this.d, (Object) mVar.d) && C8632dsu.c(this.c, mVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            i iVar = this.c;
            return (hashCode * 31) + (iVar == null ? 0 : iVar.hashCode());
        }

        public String toString() {
            String str = this.d;
            i iVar = this.c;
            return "Reference2(__typename=" + str + ", onVideo=" + iVar + ")";
        }

        public m(String str, i iVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = iVar;
        }
    }

    /* renamed from: o.ahm$i */
    /* loaded from: classes3.dex */
    public static final class i {
        private final C2383afH a;
        private final C2382afG c;
        private final C2630ajh d;

        public final C2630ajh a() {
            return this.d;
        }

        public final C2383afH b() {
            return this.a;
        }

        public final C2382afG e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c(this.d, iVar.d) && C8632dsu.c(this.a, iVar.a) && C8632dsu.c(this.c, iVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            C2383afH c2383afH = this.a;
            int hashCode2 = c2383afH == null ? 0 : c2383afH.hashCode();
            C2382afG c2382afG = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (c2382afG != null ? c2382afG.hashCode() : 0);
        }

        public String toString() {
            C2630ajh c2630ajh = this.d;
            C2383afH c2383afH = this.a;
            C2382afG c2382afG = this.c;
            return "OnVideo2(videoSummary=" + c2630ajh + ", liveVideoData=" + c2383afH + ", liveVideoArtworkData=" + c2382afG + ")";
        }

        public i(C2630ajh c2630ajh, C2383afH c2383afH, C2382afG c2382afG) {
            C8632dsu.c((Object) c2630ajh, "");
            this.d = c2630ajh;
            this.a = c2383afH;
            this.c = c2382afG;
        }
    }
}
