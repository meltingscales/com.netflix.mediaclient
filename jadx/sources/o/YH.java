package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.AbstractC8997hK;
import o.C2202abm;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class YH implements InterfaceC8999hM<d> {
    public static final a a = new a(null);
    private final C2865aoD A;
    private final boolean B;
    private final boolean C;
    private final boolean D;
    private final int E;
    private final String G;
    private final String H;
    private final boolean I;
    private final C2865aoD b;
    private final AbstractC8997hK<String> c;
    private final boolean d;
    private final int e;
    private final C2865aoD f;
    private final C2865aoD g;
    private final C2865aoD h;
    private final C2865aoD i;
    private final C2865aoD j;
    private final C2865aoD k;
    private final C2865aoD l;
    private final C2865aoD m;
    private final C2865aoD n;

    /* renamed from: o  reason: collision with root package name */
    private final C2865aoD f13408o;
    private final C2865aoD p;
    private final C2865aoD q;
    private final C2865aoD r;
    private final C2865aoD s;
    private final C2865aoD t;
    private final C2865aoD u;
    private final C2865aoD v;
    private final C2865aoD w;
    private final C2865aoD x;
    private final C2865aoD y;
    private final boolean z;

    public final C2865aoD A() {
        return this.x;
    }

    public final C2865aoD B() {
        return this.u;
    }

    public final C2865aoD C() {
        return this.A;
    }

    public final C2865aoD D() {
        return this.w;
    }

    public final int E() {
        return this.E;
    }

    public final String F() {
        return this.G;
    }

    public final String G() {
        return this.H;
    }

    public final boolean H() {
        return this.z;
    }

    public final boolean I() {
        return this.B;
    }

    public final boolean J() {
        return this.I;
    }

    public final boolean K() {
        return this.C;
    }

    public final boolean N() {
        return this.D;
    }

    @Override // o.InterfaceC8991hE
    public String a() {
        return "609100b6-bf75-46d1-bcf6-36a11438f29c";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YH) {
            YH yh = (YH) obj;
            return C8632dsu.c((Object) this.H, (Object) yh.H) && this.E == yh.E && this.e == yh.e && C8632dsu.c((Object) this.G, (Object) yh.G) && this.D == yh.D && this.I == yh.I && this.C == yh.C && C8632dsu.c(this.c, yh.c) && this.B == yh.B && this.z == yh.z && C8632dsu.c(this.m, yh.m) && C8632dsu.c(this.f, yh.f) && C8632dsu.c(this.i, yh.i) && C8632dsu.c(this.j, yh.j) && C8632dsu.c(this.h, yh.h) && C8632dsu.c(this.b, yh.b) && C8632dsu.c(this.x, yh.x) && C8632dsu.c(this.g, yh.g) && C8632dsu.c(this.A, yh.A) && C8632dsu.c(this.u, yh.u) && C8632dsu.c(this.q, yh.q) && C8632dsu.c(this.k, yh.k) && C8632dsu.c(this.r, yh.r) && C8632dsu.c(this.p, yh.p) && C8632dsu.c(this.y, yh.y) && C8632dsu.c(this.t, yh.t) && C8632dsu.c(this.v, yh.v) && C8632dsu.c(this.w, yh.w) && C8632dsu.c(this.f13408o, yh.f13408o) && C8632dsu.c(this.l, yh.l) && C8632dsu.c(this.n, yh.n) && C8632dsu.c(this.s, yh.s);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "MoreRowsAdapted";
    }

    public final C2865aoD g() {
        return this.f;
    }

    public final int h() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = this.H.hashCode();
        int hashCode2 = Integer.hashCode(this.E);
        int hashCode3 = Integer.hashCode(this.e);
        String str = this.G;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.D)) * 31) + Boolean.hashCode(this.I)) * 31) + Boolean.hashCode(this.C)) * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.B)) * 31) + Boolean.hashCode(this.z)) * 31) + this.m.hashCode()) * 31) + this.f.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.h.hashCode()) * 31) + this.b.hashCode()) * 31) + this.x.hashCode()) * 31) + this.g.hashCode()) * 31) + this.A.hashCode()) * 31) + this.u.hashCode()) * 31) + this.q.hashCode()) * 31) + this.k.hashCode()) * 31) + this.r.hashCode()) * 31) + this.p.hashCode()) * 31) + this.y.hashCode()) * 31) + this.t.hashCode()) * 31) + this.v.hashCode()) * 31) + this.w.hashCode()) * 31) + this.f13408o.hashCode()) * 31) + this.l.hashCode()) * 31) + this.n.hashCode()) * 31) + this.s.hashCode();
    }

    public final AbstractC8997hK<String> i() {
        return this.c;
    }

    public final C2865aoD j() {
        return this.b;
    }

    public final C2865aoD k() {
        return this.h;
    }

    public final C2865aoD l() {
        return this.i;
    }

    public final C2865aoD m() {
        return this.m;
    }

    public final C2865aoD n() {
        return this.g;
    }

    public final C2865aoD o() {
        return this.j;
    }

    public final C2865aoD p() {
        return this.k;
    }

    public final C2865aoD q() {
        return this.s;
    }

    public final C2865aoD r() {
        return this.l;
    }

    public final C2865aoD s() {
        return this.f13408o;
    }

    public final C2865aoD t() {
        return this.n;
    }

    public String toString() {
        String str = this.H;
        int i = this.E;
        int i2 = this.e;
        String str2 = this.G;
        boolean z = this.D;
        boolean z2 = this.I;
        boolean z3 = this.C;
        AbstractC8997hK<String> abstractC8997hK = this.c;
        boolean z4 = this.B;
        boolean z5 = this.z;
        C2865aoD c2865aoD = this.m;
        C2865aoD c2865aoD2 = this.f;
        C2865aoD c2865aoD3 = this.i;
        C2865aoD c2865aoD4 = this.j;
        C2865aoD c2865aoD5 = this.h;
        C2865aoD c2865aoD6 = this.b;
        C2865aoD c2865aoD7 = this.x;
        C2865aoD c2865aoD8 = this.g;
        C2865aoD c2865aoD9 = this.A;
        C2865aoD c2865aoD10 = this.u;
        C2865aoD c2865aoD11 = this.q;
        C2865aoD c2865aoD12 = this.k;
        C2865aoD c2865aoD13 = this.r;
        C2865aoD c2865aoD14 = this.p;
        C2865aoD c2865aoD15 = this.y;
        C2865aoD c2865aoD16 = this.t;
        C2865aoD c2865aoD17 = this.v;
        C2865aoD c2865aoD18 = this.w;
        C2865aoD c2865aoD19 = this.f13408o;
        C2865aoD c2865aoD20 = this.l;
        C2865aoD c2865aoD21 = this.n;
        C2865aoD c2865aoD22 = this.s;
        return "MoreRowsAdaptedQuery(lolomoId=" + str + ", rows=" + i + ", columns=" + i2 + ", rowCursor=" + str2 + ", isPhoneSupported=" + z + ", isTabletSupported=" + z2 + ", isLolomoLite=" + z3 + ", entityCursor=" + abstractC8997hK + ", isHorizontalPagination=" + z4 + ", includeLiveData=" + z5 + ", imageParamsForBoxart=" + c2865aoD + ", imageParamsForBillboardBackground=" + c2865aoD2 + ", imageParamsForBillboardHorizontalBackgroundAsset=" + c2865aoD3 + ", imageParamsForBillboardLogo=" + c2865aoD4 + ", imageParamsForBillboardHorizontalLogo=" + c2865aoD5 + ", imageParamsForAwardsBillboardLogo=" + c2865aoD6 + ", imageParamsForLicensedBillboardBoxart=" + c2865aoD7 + ", imageParamsForBillboardStoryArt=" + c2865aoD8 + ", imageParamsForTopTenRowBoxart=" + c2865aoD9 + ", imageParamsForTallPanelArt=" + c2865aoD10 + ", imageParamsForGamesIcon=" + c2865aoD11 + ", imageParamsForCharacterCompact=" + c2865aoD12 + ", imageParamsForGamesTrailerStillImage=" + c2865aoD13 + ", imageParamsForGamesBillboardBackground=" + c2865aoD14 + ", imageParamsForIPBasedGameLogo=" + c2865aoD15 + ", imageParamsForIPBasedGameBanner=" + c2865aoD16 + ", imageParamsForRecentlyWatchedRowBoxart=" + c2865aoD17 + ", imageParamsForRecentlyWatchedRowTitleTreatment=" + c2865aoD18 + ", imageParamsForDoubleWideCombo=" + c2865aoD19 + ", imageParamsForFeedBrandArtwork=" + c2865aoD20 + ", imageParamsForFeedHorizontalDisplayImage=" + c2865aoD21 + ", imageParamsForFeedTitleTreatment=" + c2865aoD22 + ")";
    }

    public final C2865aoD u() {
        return this.r;
    }

    public final C2865aoD v() {
        return this.y;
    }

    public final C2865aoD w() {
        return this.q;
    }

    public final C2865aoD x() {
        return this.p;
    }

    public final C2865aoD y() {
        return this.t;
    }

    public final C2865aoD z() {
        return this.v;
    }

    public YH(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, AbstractC8997hK<String> abstractC8997hK, boolean z4, boolean z5, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3, C2865aoD c2865aoD4, C2865aoD c2865aoD5, C2865aoD c2865aoD6, C2865aoD c2865aoD7, C2865aoD c2865aoD8, C2865aoD c2865aoD9, C2865aoD c2865aoD10, C2865aoD c2865aoD11, C2865aoD c2865aoD12, C2865aoD c2865aoD13, C2865aoD c2865aoD14, C2865aoD c2865aoD15, C2865aoD c2865aoD16, C2865aoD c2865aoD17, C2865aoD c2865aoD18, C2865aoD c2865aoD19, C2865aoD c2865aoD20, C2865aoD c2865aoD21, C2865aoD c2865aoD22) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) c2865aoD, "");
        C8632dsu.c((Object) c2865aoD2, "");
        C8632dsu.c((Object) c2865aoD3, "");
        C8632dsu.c((Object) c2865aoD4, "");
        C8632dsu.c((Object) c2865aoD5, "");
        C8632dsu.c((Object) c2865aoD6, "");
        C8632dsu.c((Object) c2865aoD7, "");
        C8632dsu.c((Object) c2865aoD8, "");
        C8632dsu.c((Object) c2865aoD9, "");
        C8632dsu.c((Object) c2865aoD10, "");
        C8632dsu.c((Object) c2865aoD11, "");
        C8632dsu.c((Object) c2865aoD12, "");
        C8632dsu.c((Object) c2865aoD13, "");
        C8632dsu.c((Object) c2865aoD14, "");
        C8632dsu.c((Object) c2865aoD15, "");
        C8632dsu.c((Object) c2865aoD16, "");
        C8632dsu.c((Object) c2865aoD17, "");
        C8632dsu.c((Object) c2865aoD18, "");
        C8632dsu.c((Object) c2865aoD19, "");
        C8632dsu.c((Object) c2865aoD20, "");
        C8632dsu.c((Object) c2865aoD21, "");
        C8632dsu.c((Object) c2865aoD22, "");
        this.H = str;
        this.E = i;
        this.e = i2;
        this.G = str2;
        this.D = z;
        this.I = z2;
        this.C = z3;
        this.c = abstractC8997hK;
        this.B = z4;
        this.z = z5;
        this.m = c2865aoD;
        this.f = c2865aoD2;
        this.i = c2865aoD3;
        this.j = c2865aoD4;
        this.h = c2865aoD5;
        this.b = c2865aoD6;
        this.x = c2865aoD7;
        this.g = c2865aoD8;
        this.A = c2865aoD9;
        this.u = c2865aoD10;
        this.q = c2865aoD11;
        this.k = c2865aoD12;
        this.r = c2865aoD13;
        this.p = c2865aoD14;
        this.y = c2865aoD15;
        this.t = c2865aoD16;
        this.v = c2865aoD17;
        this.w = c2865aoD18;
        this.f13408o = c2865aoD19;
        this.l = c2865aoD20;
        this.n = c2865aoD21;
        this.s = c2865aoD22;
    }

    public /* synthetic */ YH(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, AbstractC8997hK abstractC8997hK, boolean z4, boolean z5, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3, C2865aoD c2865aoD4, C2865aoD c2865aoD5, C2865aoD c2865aoD6, C2865aoD c2865aoD7, C2865aoD c2865aoD8, C2865aoD c2865aoD9, C2865aoD c2865aoD10, C2865aoD c2865aoD11, C2865aoD c2865aoD12, C2865aoD c2865aoD13, C2865aoD c2865aoD14, C2865aoD c2865aoD15, C2865aoD c2865aoD16, C2865aoD c2865aoD17, C2865aoD c2865aoD18, C2865aoD c2865aoD19, C2865aoD c2865aoD20, C2865aoD c2865aoD21, C2865aoD c2865aoD22, int i3, C8627dsp c8627dsp) {
        this(str, i, i2, str2, z, z2, z3, (i3 & 128) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, z4, z5, c2865aoD, c2865aoD2, c2865aoD3, c2865aoD4, c2865aoD5, c2865aoD6, c2865aoD7, c2865aoD8, c2865aoD9, c2865aoD10, c2865aoD11, c2865aoD12, c2865aoD13, c2865aoD14, c2865aoD15, c2865aoD16, c2865aoD17, c2865aoD18, c2865aoD19, c2865aoD20, c2865aoD21, c2865aoD22);
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2204abo.a.e(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<d> e() {
        return C8953gT.c(C2202abm.d.e, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2845ank.a.c()).d();
    }

    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8999hM.c {
        private final b d;
        private final e e;

        public final e a() {
            return this.e;
        }

        public final b b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.d, dVar.d) && C8632dsu.c(this.e, dVar.e);
            }
            return false;
        }

        public int hashCode() {
            b bVar = this.d;
            int hashCode = bVar == null ? 0 : bVar.hashCode();
            e eVar = this.e;
            return (hashCode * 31) + (eVar != null ? eVar.hashCode() : 0);
        }

        public String toString() {
            b bVar = this.d;
            e eVar = this.e;
            return "Data(lolomoById=" + bVar + ", gatewayRequestDetails=" + eVar + ")";
        }

        public d(b bVar, e eVar) {
            this.d = bVar;
            this.e = eVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private final c a;
        private final String b;
        private final String d;

        public final c c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c((Object) this.d, (Object) bVar.d) && C8632dsu.c(this.a, bVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = this.d.hashCode();
            c cVar = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            String str2 = this.d;
            c cVar = this.a;
            return "LolomoById(__typename=" + str + ", lolomoId=" + str2 + ", rows=" + cVar + ")";
        }

        public b(String str, String str2, c cVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.b = str;
            this.d = str2;
            this.a = cVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private final String d;
        private final C2463agZ e;

        public final C2463agZ a() {
            return this.e;
        }

        public final String c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c(this.e, cVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.d;
            C2463agZ c2463agZ = this.e;
            return "Rows(__typename=" + str + ", lolomoRows=" + c2463agZ + ")";
        }

        public c(String str, C2463agZ c2463agZ) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2463agZ, "");
            this.d = str;
            this.e = c2463agZ;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        private final String c;
        private final String e;

        public final String a() {
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
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c((Object) this.e, (Object) eVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.e;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.c;
            String str2 = this.e;
            return "GatewayRequestDetails(__typename=" + str + ", requestId=" + str2 + ")";
        }

        public e(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.e = str2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }
}
