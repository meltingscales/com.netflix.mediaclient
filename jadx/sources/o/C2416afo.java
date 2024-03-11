package o;

/* renamed from: o.afo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2416afo implements InterfaceC9037hy {
    private final l a;
    private final o b;
    private final n c;
    private final m d;
    private final String e;
    private final t f;
    private final p g;
    private final s h;
    private final r i;
    private final q j;
    private final u k;
    private final x m;

    public final l a() {
        return this.a;
    }

    public final m b() {
        return this.d;
    }

    public final q c() {
        return this.j;
    }

    public final n d() {
        return this.c;
    }

    public final o e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2416afo) {
            C2416afo c2416afo = (C2416afo) obj;
            return C8632dsu.c((Object) this.e, (Object) c2416afo.e) && C8632dsu.c(this.b, c2416afo.b) && C8632dsu.c(this.d, c2416afo.d) && C8632dsu.c(this.a, c2416afo.a) && C8632dsu.c(this.h, c2416afo.h) && C8632dsu.c(this.c, c2416afo.c) && C8632dsu.c(this.j, c2416afo.j) && C8632dsu.c(this.m, c2416afo.m) && C8632dsu.c(this.g, c2416afo.g) && C8632dsu.c(this.i, c2416afo.i) && C8632dsu.c(this.f, c2416afo.f) && C8632dsu.c(this.k, c2416afo.k);
        }
        return false;
    }

    public final p f() {
        return this.g;
    }

    public final t g() {
        return this.f;
    }

    public final s h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        o oVar = this.b;
        int hashCode2 = oVar == null ? 0 : oVar.hashCode();
        m mVar = this.d;
        int hashCode3 = mVar == null ? 0 : mVar.hashCode();
        l lVar = this.a;
        int hashCode4 = lVar == null ? 0 : lVar.hashCode();
        s sVar = this.h;
        int hashCode5 = sVar == null ? 0 : sVar.hashCode();
        n nVar = this.c;
        int hashCode6 = nVar == null ? 0 : nVar.hashCode();
        q qVar = this.j;
        int hashCode7 = qVar == null ? 0 : qVar.hashCode();
        x xVar = this.m;
        int hashCode8 = xVar == null ? 0 : xVar.hashCode();
        p pVar = this.g;
        int hashCode9 = pVar == null ? 0 : pVar.hashCode();
        r rVar = this.i;
        int hashCode10 = rVar == null ? 0 : rVar.hashCode();
        t tVar = this.f;
        int hashCode11 = tVar == null ? 0 : tVar.hashCode();
        u uVar = this.k;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (uVar != null ? uVar.hashCode() : 0);
    }

    public final x i() {
        return this.m;
    }

    public final r j() {
        return this.i;
    }

    public final u k() {
        return this.k;
    }

    public final String l() {
        return this.e;
    }

    public String toString() {
        String str = this.e;
        o oVar = this.b;
        m mVar = this.d;
        l lVar = this.a;
        s sVar = this.h;
        n nVar = this.c;
        q qVar = this.j;
        x xVar = this.m;
        p pVar = this.g;
        r rVar = this.i;
        t tVar = this.f;
        u uVar = this.k;
        return "IrmaEntityFragment(__typename=" + str + ", onIrmaBoxShotEntityTreatment=" + oVar + ", onIrmaHorizontalArtworkWithPlaybackEntityTreatment=" + mVar + ", onIrmaAppIconEntityTreatment=" + lVar + ", onPinotSuggestionEntityTreatment=" + sVar + ", onIrmaEntityTreatment=" + nVar + ", onIrmaUnifiedEntityWrapper=" + qVar + ", onPinotTextEntity=" + xVar + ", onPinotBoxShotEntityTreatment=" + pVar + ", onPinotHorizontalArtworkWithPlaybackEntityTreatment=" + rVar + ", onPinotAppIconEntityTreatment=" + tVar + ", onPinotUnifiedEntityContainer=" + uVar + ")";
    }

    public C2416afo(String str, o oVar, m mVar, l lVar, s sVar, n nVar, q qVar, x xVar, p pVar, r rVar, t tVar, u uVar) {
        C8632dsu.c((Object) str, "");
        this.e = str;
        this.b = oVar;
        this.d = mVar;
        this.a = lVar;
        this.h = sVar;
        this.c = nVar;
        this.j = qVar;
        this.m = xVar;
        this.g = pVar;
        this.i = rVar;
        this.f = tVar;
        this.k = uVar;
    }

    /* renamed from: o.afo$o */
    /* loaded from: classes3.dex */
    public static final class o {
        private final f b;
        private final String c;

        public final String d() {
            return this.c;
        }

        public final f e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o) {
                o oVar = (o) obj;
                return C8632dsu.c((Object) this.c, (Object) oVar.c) && C8632dsu.c(this.b, oVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            f fVar = this.b;
            return (hashCode * 31) + (fVar == null ? 0 : fVar.hashCode());
        }

        public String toString() {
            String str = this.c;
            f fVar = this.b;
            return "OnIrmaBoxShotEntityTreatment(__typename=" + str + ", image=" + fVar + ")";
        }

        public o(String str, f fVar) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.b = fVar;
        }
    }

    /* renamed from: o.afo$m */
    /* loaded from: classes3.dex */
    public static final class m {
        private final String b;
        private final D c;
        private final i d;

        public final String a() {
            return this.b;
        }

        public final i d() {
            return this.d;
        }

        public final D e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof m) {
                m mVar = (m) obj;
                return C8632dsu.c((Object) this.b, (Object) mVar.b) && C8632dsu.c(this.c, mVar.c) && C8632dsu.c(this.d, mVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            D d = this.c;
            int hashCode2 = d == null ? 0 : d.hashCode();
            i iVar = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (iVar != null ? iVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            D d = this.c;
            i iVar = this.d;
            return "OnIrmaHorizontalArtworkWithPlaybackEntityTreatment(__typename=" + str + ", unifiedEntity=" + d + ", image=" + iVar + ")";
        }

        public m(String str, D d, i iVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.c = d;
            this.d = iVar;
        }
    }

    /* renamed from: o.afo$l */
    /* loaded from: classes3.dex */
    public static final class l {
        private final String b;
        private final g d;

        public final g d() {
            return this.d;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return C8632dsu.c((Object) this.b, (Object) lVar.b) && C8632dsu.c(this.d, lVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            g gVar = this.d;
            return (hashCode * 31) + (gVar == null ? 0 : gVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            g gVar = this.d;
            return "OnIrmaAppIconEntityTreatment(__typename=" + str + ", image=" + gVar + ")";
        }

        public l(String str, g gVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = gVar;
        }
    }

    /* renamed from: o.afo$s */
    /* loaded from: classes3.dex */
    public static final class s {
        private final String a;
        private final String b;
        private final Boolean d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final Boolean b() {
            return this.d;
        }

        public final String c() {
            return this.b;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof s) {
                s sVar = (s) obj;
                return C8632dsu.c((Object) this.a, (Object) sVar.a) && C8632dsu.c((Object) this.e, (Object) sVar.e) && C8632dsu.c(this.d, sVar.d) && C8632dsu.c((Object) this.b, (Object) sVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.e;
            int hashCode2 = str == null ? 0 : str.hashCode();
            Boolean bool = this.d;
            return (((((hashCode * 31) + hashCode2) * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.e;
            Boolean bool = this.d;
            String str3 = this.b;
            return "OnPinotSuggestionEntityTreatment(__typename=" + str + ", displayString=" + str2 + ", showCollectionIcon=" + bool + ", suggestionEntityId=" + str3 + ")";
        }

        public s(String str, String str2, Boolean bool, String str3) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str3, "");
            this.a = str;
            this.e = str2;
            this.d = bool;
            this.b = str3;
        }
    }

    /* renamed from: o.afo$n */
    /* loaded from: classes3.dex */
    public static final class n {
        private final String d;
        private final String e;

        public final String c() {
            return this.e;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                return C8632dsu.c((Object) this.e, (Object) nVar.e) && C8632dsu.c((Object) this.d, (Object) nVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.e;
            String str2 = this.d;
            return "OnIrmaEntityTreatment(recipeId=" + str + ", unifiedEntityId=" + str2 + ")";
        }

        public n(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.e = str;
            this.d = str2;
        }
    }

    /* renamed from: o.afo$q */
    /* loaded from: classes3.dex */
    public static final class q {
        private final z c;
        private final String d;

        public final z b() {
            return this.c;
        }

        public final String c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof q) {
                q qVar = (q) obj;
                return C8632dsu.c((Object) this.d, (Object) qVar.d) && C8632dsu.c(this.c, qVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            z zVar = this.c;
            return (hashCode * 31) + (zVar == null ? 0 : zVar.hashCode());
        }

        public String toString() {
            String str = this.d;
            z zVar = this.c;
            return "OnIrmaUnifiedEntityWrapper(__typename=" + str + ", unifiedEntity=" + zVar + ")";
        }

        public q(String str, z zVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = zVar;
        }
    }

    /* renamed from: o.afo$x */
    /* loaded from: classes3.dex */
    public static final class x {
        private final String c;
        private final String d;
        private final String e;

        public final String c() {
            return this.c;
        }

        public final String d() {
            return this.e;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof x) {
                x xVar = (x) obj;
                return C8632dsu.c((Object) this.e, (Object) xVar.e) && C8632dsu.c((Object) this.c, (Object) xVar.c) && C8632dsu.c((Object) this.d, (Object) xVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.c;
            return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.e;
            String str2 = this.c;
            String str3 = this.d;
            return "OnPinotTextEntity(__typename=" + str + ", displayString=" + str2 + ", unifiedEntityId=" + str3 + ")";
        }

        public x(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str3, "");
            this.e = str;
            this.c = str2;
            this.d = str3;
        }
    }

    /* renamed from: o.afo$p */
    /* loaded from: classes3.dex */
    public static final class p {
        private final String c;
        private final C2419c d;

        public final String d() {
            return this.c;
        }

        public final C2419c e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                p pVar = (p) obj;
                return C8632dsu.c((Object) this.c, (Object) pVar.c) && C8632dsu.c(this.d, pVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            C2419c c2419c = this.d;
            return (hashCode * 31) + (c2419c == null ? 0 : c2419c.hashCode());
        }

        public String toString() {
            String str = this.c;
            C2419c c2419c = this.d;
            return "OnPinotBoxShotEntityTreatment(__typename=" + str + ", contextualArtwork=" + c2419c + ")";
        }

        public p(String str, C2419c c2419c) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.d = c2419c;
        }
    }

    /* renamed from: o.afo$r */
    /* loaded from: classes3.dex */
    public static final class r {
        private final String a;
        private final C2417a b;
        private final B c;

        public final String b() {
            return this.a;
        }

        public final B c() {
            return this.c;
        }

        public final C2417a d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof r) {
                r rVar = (r) obj;
                return C8632dsu.c((Object) this.a, (Object) rVar.a) && C8632dsu.c(this.b, rVar.b) && C8632dsu.c(this.c, rVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            C2417a c2417a = this.b;
            int hashCode2 = c2417a == null ? 0 : c2417a.hashCode();
            B b = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (b != null ? b.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            C2417a c2417a = this.b;
            B b = this.c;
            return "OnPinotHorizontalArtworkWithPlaybackEntityTreatment(__typename=" + str + ", contextualArtwork=" + c2417a + ", unifiedEntity=" + b + ")";
        }

        public r(String str, C2417a c2417a, B b) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.b = c2417a;
            this.c = b;
        }
    }

    /* renamed from: o.afo$t */
    /* loaded from: classes3.dex */
    public static final class t {
        private final String a;
        private final h c;

        public final h c() {
            return this.c;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof t) {
                t tVar = (t) obj;
                return C8632dsu.c((Object) this.a, (Object) tVar.a) && C8632dsu.c(this.c, tVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            h hVar = this.c;
            return (hashCode * 31) + (hVar == null ? 0 : hVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            h hVar = this.c;
            return "OnPinotAppIconEntityTreatment(__typename=" + str + ", contextualArtwork=" + hVar + ")";
        }

        public t(String str, h hVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = hVar;
        }
    }

    /* renamed from: o.afo$u */
    /* loaded from: classes3.dex */
    public static final class u {
        private final C a;
        private final String c;
        private final String d;

        public final String a() {
            return this.c;
        }

        public final C b() {
            return this.a;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof u) {
                u uVar = (u) obj;
                return C8632dsu.c((Object) this.c, (Object) uVar.c) && C8632dsu.c(this.a, uVar.a) && C8632dsu.c((Object) this.d, (Object) uVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            C c = this.a;
            int hashCode2 = c == null ? 0 : c.hashCode();
            String str = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            C c = this.a;
            String str2 = this.d;
            return "OnPinotUnifiedEntityContainer(__typename=" + str + ", unifiedEntity=" + c + ", displayString=" + str2 + ")";
        }

        public u(String str, C c, String str2) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.a = c;
            this.d = str2;
        }
    }

    /* renamed from: o.afo$f */
    /* loaded from: classes3.dex */
    public static final class f {
        private final String a;
        private final String c;
        private final String e;

        public final String b() {
            return this.e;
        }

        public final String c() {
            return this.c;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return C8632dsu.c((Object) this.c, (Object) fVar.c) && C8632dsu.c((Object) this.e, (Object) fVar.e) && C8632dsu.c((Object) this.a, (Object) fVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.e;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            String str2 = this.e;
            String str3 = this.a;
            return "Image(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ")";
        }

        public f(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.e = str2;
            this.a = str3;
        }
    }

    /* renamed from: o.afo$D */
    /* loaded from: classes3.dex */
    public static final class D {
        private final String a;
        private final String c;
        private final y d;

        public final y a() {
            return this.d;
        }

        public final String b() {
            return this.c;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof D) {
                D d = (D) obj;
                return C8632dsu.c((Object) this.c, (Object) d.c) && C8632dsu.c((Object) this.a, (Object) d.a) && C8632dsu.c(this.d, d.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            int hashCode2 = this.a.hashCode();
            y yVar = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (yVar == null ? 0 : yVar.hashCode());
        }

        public String toString() {
            String str = this.c;
            String str2 = this.a;
            y yVar = this.d;
            return "UnifiedEntity(__typename=" + str + ", unifiedEntityId=" + str2 + ", onVideo=" + yVar + ")";
        }

        public D(String str, String str2, y yVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.a = str2;
            this.d = yVar;
        }
    }

    /* renamed from: o.afo$y */
    /* loaded from: classes3.dex */
    public static final class y {
        private final C2514ahX c;

        public final C2514ahX d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && C8632dsu.c(this.c, ((y) obj).c);
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            C2514ahX c2514ahX = this.c;
            return "OnVideo(playable=" + c2514ahX + ")";
        }

        public y(C2514ahX c2514ahX) {
            C8632dsu.c((Object) c2514ahX, "");
            this.c = c2514ahX;
        }
    }

    /* renamed from: o.afo$i */
    /* loaded from: classes3.dex */
    public static final class i {
        private final String c;
        private final String d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final String b() {
            return this.c;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c((Object) this.e, (Object) iVar.e) && C8632dsu.c((Object) this.c, (Object) iVar.c) && C8632dsu.c((Object) this.d, (Object) iVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.c;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            String str2 = this.c;
            String str3 = this.d;
            return "Image1(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ")";
        }

        public i(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.c = str2;
            this.d = str3;
        }
    }

    /* renamed from: o.afo$g */
    /* loaded from: classes3.dex */
    public static final class g {
        private final String b;
        private final String c;
        private final String e;

        public final String b() {
            return this.e;
        }

        public final String d() {
            return this.b;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.b, (Object) gVar.b) && C8632dsu.c((Object) this.c, (Object) gVar.c) && C8632dsu.c((Object) this.e, (Object) gVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.c;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.c;
            String str3 = this.e;
            return "Image2(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ")";
        }

        public g(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.c = str2;
            this.e = str3;
        }
    }

    /* renamed from: o.afo$z */
    /* loaded from: classes3.dex */
    public static final class z {
        private final String a;
        private final v c;
        private final j d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final j c() {
            return this.d;
        }

        public final String d() {
            return this.a;
        }

        public final v e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof z) {
                z zVar = (z) obj;
                return C8632dsu.c((Object) this.a, (Object) zVar.a) && C8632dsu.c((Object) this.e, (Object) zVar.e) && C8632dsu.c(this.c, zVar.c) && C8632dsu.c(this.d, zVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            int hashCode2 = this.e.hashCode();
            v vVar = this.c;
            int hashCode3 = vVar == null ? 0 : vVar.hashCode();
            j jVar = this.d;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (jVar != null ? jVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.e;
            v vVar = this.c;
            j jVar = this.d;
            return "UnifiedEntity1(__typename=" + str + ", unifiedEntityId=" + str2 + ", onVideo=" + vVar + ", onGame=" + jVar + ")";
        }

        public z(String str, String str2, v vVar, j jVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.a = str;
            this.e = str2;
            this.c = vVar;
            this.d = jVar;
        }
    }

    /* renamed from: o.afo$v */
    /* loaded from: classes3.dex */
    public static final class v {
        private final C2630ajh a;

        public final C2630ajh c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && C8632dsu.c(this.a, ((v) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            C2630ajh c2630ajh = this.a;
            return "OnVideo1(videoSummary=" + c2630ajh + ")";
        }

        public v(C2630ajh c2630ajh) {
            C8632dsu.c((Object) c2630ajh, "");
            this.a = c2630ajh;
        }
    }

    /* renamed from: o.afo$j */
    /* loaded from: classes3.dex */
    public static final class j {
        private final C2344aeV a;

        public final C2344aeV d() {
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

    /* renamed from: o.afo$c  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C2419c {
        private final String b;
        private final e c;

        public final String a() {
            return this.b;
        }

        public final e c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2419c) {
                C2419c c2419c = (C2419c) obj;
                return C8632dsu.c((Object) this.b, (Object) c2419c.b) && C8632dsu.c(this.c, c2419c.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            e eVar = this.c;
            return (hashCode * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            e eVar = this.c;
            return "ContextualArtwork(__typename=" + str + ", artwork=" + eVar + ")";
        }

        public C2419c(String str, e eVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.c = eVar;
        }
    }

    /* renamed from: o.afo$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final String c;
        private final String e;

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.c;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c((Object) this.e, (Object) eVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.c;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.c;
            String str3 = this.e;
            return "Artwork(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public e(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = str2;
            this.e = str3;
        }
    }

    /* renamed from: o.afo$a  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C2417a {
        private final C2420d a;
        private final String b;

        public final String c() {
            return this.b;
        }

        public final C2420d d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2417a) {
                C2417a c2417a = (C2417a) obj;
                return C8632dsu.c((Object) this.b, (Object) c2417a.b) && C8632dsu.c(this.a, c2417a.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            C2420d c2420d = this.a;
            return (hashCode * 31) + (c2420d == null ? 0 : c2420d.hashCode());
        }

        public String toString() {
            String str = this.b;
            C2420d c2420d = this.a;
            return "ContextualArtwork1(__typename=" + str + ", artwork=" + c2420d + ")";
        }

        public C2417a(String str, C2420d c2420d) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = c2420d;
        }
    }

    /* renamed from: o.afo$d  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C2420d {
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
            if (obj instanceof C2420d) {
                C2420d c2420d = (C2420d) obj;
                return C8632dsu.c((Object) this.e, (Object) c2420d.e) && C8632dsu.c((Object) this.b, (Object) c2420d.b) && C8632dsu.c((Object) this.a, (Object) c2420d.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.b;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            String str2 = this.b;
            String str3 = this.a;
            return "Artwork1(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public C2420d(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = str2;
            this.a = str3;
        }
    }

    /* renamed from: o.afo$B */
    /* loaded from: classes3.dex */
    public static final class B {
        private final String a;
        private final w b;
        private final String e;

        public final String b() {
            return this.e;
        }

        public final w c() {
            return this.b;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof B) {
                B b = (B) obj;
                return C8632dsu.c((Object) this.e, (Object) b.e) && C8632dsu.c((Object) this.a, (Object) b.a) && C8632dsu.c(this.b, b.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            int hashCode2 = this.a.hashCode();
            w wVar = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (wVar == null ? 0 : wVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            String str2 = this.a;
            w wVar = this.b;
            return "UnifiedEntity2(__typename=" + str + ", unifiedEntityId=" + str2 + ", onVideo=" + wVar + ")";
        }

        public B(String str, String str2, w wVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.e = str;
            this.a = str2;
            this.b = wVar;
        }
    }

    /* renamed from: o.afo$w */
    /* loaded from: classes3.dex */
    public static final class w {
        private final C2514ahX a;

        public final C2514ahX a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && C8632dsu.c(this.a, ((w) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            C2514ahX c2514ahX = this.a;
            return "OnVideo2(playable=" + c2514ahX + ")";
        }

        public w(C2514ahX c2514ahX) {
            C8632dsu.c((Object) c2514ahX, "");
            this.a = c2514ahX;
        }
    }

    /* renamed from: o.afo$h */
    /* loaded from: classes3.dex */
    public static final class h {
        private final String a;
        private final C2418b b;

        public final String b() {
            return this.a;
        }

        public final C2418b c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c((Object) this.a, (Object) hVar.a) && C8632dsu.c(this.b, hVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            C2418b c2418b = this.b;
            return (hashCode * 31) + (c2418b == null ? 0 : c2418b.hashCode());
        }

        public String toString() {
            String str = this.a;
            C2418b c2418b = this.b;
            return "ContextualArtwork2(__typename=" + str + ", artwork=" + c2418b + ")";
        }

        public h(String str, C2418b c2418b) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.b = c2418b;
        }
    }

    /* renamed from: o.afo$b  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C2418b {
        private final String b;
        private final String c;
        private final String e;

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.e;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2418b) {
                C2418b c2418b = (C2418b) obj;
                return C8632dsu.c((Object) this.b, (Object) c2418b.b) && C8632dsu.c((Object) this.c, (Object) c2418b.c) && C8632dsu.c((Object) this.e, (Object) c2418b.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.c;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            String str2 = this.c;
            String str3 = this.e;
            return "Artwork2(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public C2418b(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.c = str2;
            this.e = str3;
        }
    }

    /* renamed from: o.afo$C */
    /* loaded from: classes3.dex */
    public static final class C {
        private final A a;
        private final k b;
        private final String d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final A b() {
            return this.a;
        }

        public final String c() {
            return this.d;
        }

        public final k d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C) {
                C c = (C) obj;
                return C8632dsu.c((Object) this.d, (Object) c.d) && C8632dsu.c((Object) this.e, (Object) c.e) && C8632dsu.c(this.a, c.a) && C8632dsu.c(this.b, c.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = this.e.hashCode();
            A a = this.a;
            int hashCode3 = a == null ? 0 : a.hashCode();
            k kVar = this.b;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (kVar != null ? kVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            String str2 = this.e;
            A a = this.a;
            k kVar = this.b;
            return "UnifiedEntity3(__typename=" + str + ", unifiedEntityId=" + str2 + ", onVideo=" + a + ", onGame=" + kVar + ")";
        }

        public C(String str, String str2, A a, k kVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.d = str;
            this.e = str2;
            this.a = a;
            this.b = kVar;
        }
    }

    /* renamed from: o.afo$A */
    /* loaded from: classes3.dex */
    public static final class A {
        private final C2630ajh c;

        public final C2630ajh c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof A) && C8632dsu.c(this.c, ((A) obj).c);
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            C2630ajh c2630ajh = this.c;
            return "OnVideo3(videoSummary=" + c2630ajh + ")";
        }

        public A(C2630ajh c2630ajh) {
            C8632dsu.c((Object) c2630ajh, "");
            this.c = c2630ajh;
        }
    }

    /* renamed from: o.afo$k */
    /* loaded from: classes3.dex */
    public static final class k {
        private final C2344aeV e;

        public final C2344aeV d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && C8632dsu.c(this.e, ((k) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            C2344aeV c2344aeV = this.e;
            return "OnGame1(gameSummary=" + c2344aeV + ")";
        }

        public k(C2344aeV c2344aeV) {
            C8632dsu.c((Object) c2344aeV, "");
            this.e = c2344aeV;
        }
    }
}
