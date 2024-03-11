package o;

/* renamed from: o.ahL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2502ahL implements InterfaceC9037hy {
    private final h a;
    private final String b;
    private final i c;
    private final g d;
    private final k e;
    private final o h;
    private final n j;

    public final g a() {
        return this.d;
    }

    public final h b() {
        return this.a;
    }

    public final i c() {
        return this.c;
    }

    public final k d() {
        return this.e;
    }

    public final o e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2502ahL) {
            C2502ahL c2502ahL = (C2502ahL) obj;
            return C8632dsu.c((Object) this.b, (Object) c2502ahL.b) && C8632dsu.c(this.d, c2502ahL.d) && C8632dsu.c(this.a, c2502ahL.a) && C8632dsu.c(this.c, c2502ahL.c) && C8632dsu.c(this.e, c2502ahL.e) && C8632dsu.c(this.j, c2502ahL.j) && C8632dsu.c(this.h, c2502ahL.h);
        }
        return false;
    }

    public final n h() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        g gVar = this.d;
        int hashCode2 = gVar == null ? 0 : gVar.hashCode();
        h hVar = this.a;
        int hashCode3 = hVar == null ? 0 : hVar.hashCode();
        i iVar = this.c;
        int hashCode4 = iVar == null ? 0 : iVar.hashCode();
        k kVar = this.e;
        int hashCode5 = kVar == null ? 0 : kVar.hashCode();
        n nVar = this.j;
        int hashCode6 = nVar == null ? 0 : nVar.hashCode();
        o oVar = this.h;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (oVar != null ? oVar.hashCode() : 0);
    }

    public final String j() {
        return this.b;
    }

    public String toString() {
        String str = this.b;
        g gVar = this.d;
        h hVar = this.a;
        i iVar = this.c;
        k kVar = this.e;
        n nVar = this.j;
        o oVar = this.h;
        return "PinotOption5EntityFragment(__typename=" + str + ", onPinotBoxShotEntityTreatment=" + gVar + ", onPinotHorizontalArtworkWithPlaybackEntityTreatment=" + hVar + ", onPinotAppIconEntityTreatment=" + iVar + ", onPinotSuggestionEntityTreatment=" + kVar + ", onPinotUnifiedEntityContainer=" + nVar + ", onPinotTextEntity=" + oVar + ")";
    }

    public C2502ahL(String str, g gVar, h hVar, i iVar, k kVar, n nVar, o oVar) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.d = gVar;
        this.a = hVar;
        this.c = iVar;
        this.e = kVar;
        this.j = nVar;
        this.h = oVar;
    }

    /* renamed from: o.ahL$g */
    /* loaded from: classes3.dex */
    public static final class g {
        private final String b;
        private final d c;

        public final String c() {
            return this.b;
        }

        public final d d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.b, (Object) gVar.b) && C8632dsu.c(this.c, gVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            d dVar = this.c;
            return (hashCode * 31) + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            d dVar = this.c;
            return "OnPinotBoxShotEntityTreatment(__typename=" + str + ", contextualArtwork=" + dVar + ")";
        }

        public g(String str, d dVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.c = dVar;
        }
    }

    /* renamed from: o.ahL$h */
    /* loaded from: classes3.dex */
    public static final class h {
        private final q a;
        private final String d;
        private final a e;

        public final String a() {
            return this.d;
        }

        public final a b() {
            return this.e;
        }

        public final q d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c((Object) this.d, (Object) hVar.d) && C8632dsu.c(this.e, hVar.e) && C8632dsu.c(this.a, hVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            a aVar = this.e;
            int hashCode2 = aVar == null ? 0 : aVar.hashCode();
            q qVar = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (qVar != null ? qVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            a aVar = this.e;
            q qVar = this.a;
            return "OnPinotHorizontalArtworkWithPlaybackEntityTreatment(__typename=" + str + ", contextualArtwork=" + aVar + ", unifiedEntity=" + qVar + ")";
        }

        public h(String str, a aVar, q qVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = aVar;
            this.a = qVar;
        }
    }

    /* renamed from: o.ahL$i */
    /* loaded from: classes3.dex */
    public static final class i {
        private final String c;
        private final f e;

        public final f a() {
            return this.e;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c((Object) this.c, (Object) iVar.c) && C8632dsu.c(this.e, iVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            f fVar = this.e;
            return (hashCode * 31) + (fVar == null ? 0 : fVar.hashCode());
        }

        public String toString() {
            String str = this.c;
            f fVar = this.e;
            return "OnPinotAppIconEntityTreatment(__typename=" + str + ", contextualArtwork=" + fVar + ")";
        }

        public i(String str, f fVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.e = fVar;
        }
    }

    /* renamed from: o.ahL$k */
    /* loaded from: classes3.dex */
    public static final class k {
        private final String a;
        private final String b;
        private final String c;
        private final Boolean e;

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final Boolean e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return C8632dsu.c((Object) this.c, (Object) kVar.c) && C8632dsu.c((Object) this.b, (Object) kVar.b) && C8632dsu.c(this.e, kVar.e) && C8632dsu.c((Object) this.a, (Object) kVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.b;
            int hashCode2 = str == null ? 0 : str.hashCode();
            Boolean bool = this.e;
            return (((((hashCode * 31) + hashCode2) * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.c;
            String str2 = this.b;
            Boolean bool = this.e;
            String str3 = this.a;
            return "OnPinotSuggestionEntityTreatment(__typename=" + str + ", displayString=" + str2 + ", showCollectionIcon=" + bool + ", suggestionEntityId=" + str3 + ")";
        }

        public k(String str, String str2, Boolean bool, String str3) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str3, "");
            this.c = str;
            this.b = str2;
            this.e = bool;
            this.a = str3;
        }
    }

    /* renamed from: o.ahL$n */
    /* loaded from: classes3.dex */
    public static final class n {
        private final p a;
        private final String b;
        private final String e;

        public final String a() {
            return this.b;
        }

        public final p c() {
            return this.a;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                return C8632dsu.c((Object) this.b, (Object) nVar.b) && C8632dsu.c(this.a, nVar.a) && C8632dsu.c((Object) this.e, (Object) nVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            p pVar = this.a;
            int hashCode2 = pVar == null ? 0 : pVar.hashCode();
            String str = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            p pVar = this.a;
            String str2 = this.e;
            return "OnPinotUnifiedEntityContainer(__typename=" + str + ", unifiedEntity=" + pVar + ", displayString=" + str2 + ")";
        }

        public n(String str, p pVar, String str2) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = pVar;
            this.e = str2;
        }
    }

    /* renamed from: o.ahL$o */
    /* loaded from: classes3.dex */
    public static final class o {
        private final String b;
        private final String d;
        private final String e;

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.e;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o) {
                o oVar = (o) obj;
                return C8632dsu.c((Object) this.e, (Object) oVar.e) && C8632dsu.c((Object) this.b, (Object) oVar.b) && C8632dsu.c((Object) this.d, (Object) oVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.b;
            return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.e;
            String str2 = this.b;
            String str3 = this.d;
            return "OnPinotTextEntity(__typename=" + str + ", displayString=" + str2 + ", unifiedEntityId=" + str3 + ")";
        }

        public o(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str3, "");
            this.e = str;
            this.b = str2;
            this.d = str3;
        }
    }

    /* renamed from: o.ahL$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final e b;

        public final String a() {
            return this.a;
        }

        public final e c() {
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
            int hashCode = this.a.hashCode();
            e eVar = this.b;
            return (hashCode * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            e eVar = this.b;
            return "ContextualArtwork(__typename=" + str + ", artwork=" + eVar + ")";
        }

        public d(String str, e eVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.b = eVar;
        }
    }

    /* renamed from: o.ahL$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final String b;
        private final String e;

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.e;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.e, (Object) eVar.e) && C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c((Object) this.b, (Object) eVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.a;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            String str2 = this.a;
            String str3 = this.b;
            return "Artwork(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public e(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = str2;
            this.b = str3;
        }
    }

    /* renamed from: o.ahL$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final c a;
        private final String b;

        public final String a() {
            return this.b;
        }

        public final c d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.b, (Object) aVar.b) && C8632dsu.c(this.a, aVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            c cVar = this.a;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            c cVar = this.a;
            return "ContextualArtwork1(__typename=" + str + ", artwork=" + cVar + ")";
        }

        public a(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = cVar;
        }
    }

    /* renamed from: o.ahL$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String b;
        private final String c;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final String d() {
            return this.c;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.e, (Object) cVar.e) && C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c((Object) this.c, (Object) cVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.b;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            String str2 = this.b;
            String str3 = this.c;
            return "Artwork1(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public c(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = str2;
            this.c = str3;
        }
    }

    /* renamed from: o.ahL$q */
    /* loaded from: classes3.dex */
    public static final class q {
        private final String b;
        private final String c;
        private final m d;

        public final String b() {
            return this.c;
        }

        public final m c() {
            return this.d;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof q) {
                q qVar = (q) obj;
                return C8632dsu.c((Object) this.c, (Object) qVar.c) && C8632dsu.c((Object) this.b, (Object) qVar.b) && C8632dsu.c(this.d, qVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            int hashCode2 = this.b.hashCode();
            m mVar = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (mVar == null ? 0 : mVar.hashCode());
        }

        public String toString() {
            String str = this.c;
            String str2 = this.b;
            m mVar = this.d;
            return "UnifiedEntity(__typename=" + str + ", unifiedEntityId=" + str2 + ", onVideo=" + mVar + ")";
        }

        public q(String str, String str2, m mVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.b = str2;
            this.d = mVar;
        }
    }

    /* renamed from: o.ahL$m */
    /* loaded from: classes3.dex */
    public static final class m {
        private final C2514ahX e;

        public final C2514ahX a() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && C8632dsu.c(this.e, ((m) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            C2514ahX c2514ahX = this.e;
            return "OnVideo(playable=" + c2514ahX + ")";
        }

        public m(C2514ahX c2514ahX) {
            C8632dsu.c((Object) c2514ahX, "");
            this.e = c2514ahX;
        }
    }

    /* renamed from: o.ahL$f */
    /* loaded from: classes3.dex */
    public static final class f {
        private final b b;
        private final String d;

        public final String b() {
            return this.d;
        }

        public final b e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return C8632dsu.c((Object) this.d, (Object) fVar.d) && C8632dsu.c(this.b, fVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            b bVar = this.b;
            return (hashCode * 31) + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            String str = this.d;
            b bVar = this.b;
            return "ContextualArtwork2(__typename=" + str + ", artwork=" + bVar + ")";
        }

        public f(String str, b bVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.b = bVar;
        }
    }

    /* renamed from: o.ahL$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String b;
        private final String d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final String b() {
            return this.d;
        }

        public final String c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.d, (Object) bVar.d) && C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c((Object) this.b, (Object) bVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            String str = this.e;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            String str2 = this.e;
            String str3 = this.b;
            return "Artwork2(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public b(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = str2;
            this.b = str3;
        }
    }

    /* renamed from: o.ahL$p */
    /* loaded from: classes3.dex */
    public static final class p {
        private final j a;
        private final String c;
        private final l d;
        private final String e;

        public final l a() {
            return this.d;
        }

        public final String c() {
            return this.c;
        }

        public final j d() {
            return this.a;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                p pVar = (p) obj;
                return C8632dsu.c((Object) this.c, (Object) pVar.c) && C8632dsu.c((Object) this.e, (Object) pVar.e) && C8632dsu.c(this.d, pVar.d) && C8632dsu.c(this.a, pVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            int hashCode2 = this.e.hashCode();
            l lVar = this.d;
            int hashCode3 = lVar == null ? 0 : lVar.hashCode();
            j jVar = this.a;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (jVar != null ? jVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            String str2 = this.e;
            l lVar = this.d;
            j jVar = this.a;
            return "UnifiedEntity1(__typename=" + str + ", unifiedEntityId=" + str2 + ", onVideo=" + lVar + ", onGame=" + jVar + ")";
        }

        public p(String str, String str2, l lVar, j jVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.e = str2;
            this.d = lVar;
            this.a = jVar;
        }
    }

    /* renamed from: o.ahL$l */
    /* loaded from: classes3.dex */
    public static final class l {
        private final C2630ajh a;

        public final C2630ajh b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && C8632dsu.c(this.a, ((l) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            C2630ajh c2630ajh = this.a;
            return "OnVideo1(videoSummary=" + c2630ajh + ")";
        }

        public l(C2630ajh c2630ajh) {
            C8632dsu.c((Object) c2630ajh, "");
            this.a = c2630ajh;
        }
    }

    /* renamed from: o.ahL$j */
    /* loaded from: classes3.dex */
    public static final class j {
        private final C2344aeV a;

        public final C2344aeV c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && C8632dsu.c(this.a, ((j) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            C2344aeV c2344aeV = this.a;
            return "OnGame(gameSummary=" + c2344aeV + ")";
        }

        public j(C2344aeV c2344aeV) {
            C8632dsu.c((Object) c2344aeV, "");
            this.a = c2344aeV;
        }
    }
}
