package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.AbstractC8997hK;
import o.C2108aaD;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Yv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1371Yv implements InterfaceC8999hM<e> {
    public static final c a = new c(null);
    private final boolean A;
    private final boolean B;
    private final C2865aoD C;
    private final boolean D;
    private final boolean E;
    private final String F;
    private final boolean H;
    private final int b;
    private final boolean c;
    private final AbstractC8997hK<String> d;
    private final C2865aoD e;
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
    private final C2865aoD f13416o;
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
    private final int z;

    public final C2865aoD A() {
        return this.x;
    }

    public final C2865aoD B() {
        return this.u;
    }

    public final C2865aoD C() {
        return this.w;
    }

    public final C2865aoD D() {
        return this.v;
    }

    public final boolean E() {
        return this.B;
    }

    public final boolean F() {
        return this.A;
    }

    public final String G() {
        return this.F;
    }

    public final int H() {
        return this.z;
    }

    public final boolean I() {
        return this.D;
    }

    public final boolean M() {
        return this.E;
    }

    public final boolean N() {
        return this.H;
    }

    @Override // o.InterfaceC8991hE
    public String a() {
        return "c7d1015f-10b7-4b63-9c57-1245ad46b1e4";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1371Yv) {
            C1371Yv c1371Yv = (C1371Yv) obj;
            return C8632dsu.c((Object) this.F, (Object) c1371Yv.F) && this.z == c1371Yv.z && this.b == c1371Yv.b && this.H == c1371Yv.H && this.E == c1371Yv.E && this.D == c1371Yv.D && C8632dsu.c(this.d, c1371Yv.d) && this.B == c1371Yv.B && this.A == c1371Yv.A && C8632dsu.c(this.f13416o, c1371Yv.f13416o) && C8632dsu.c(this.g, c1371Yv.g) && C8632dsu.c(this.h, c1371Yv.h) && C8632dsu.c(this.i, c1371Yv.i) && C8632dsu.c(this.f, c1371Yv.f) && C8632dsu.c(this.e, c1371Yv.e) && C8632dsu.c(this.u, c1371Yv.u) && C8632dsu.c(this.j, c1371Yv.j) && C8632dsu.c(this.C, c1371Yv.C) && C8632dsu.c(this.x, c1371Yv.x) && C8632dsu.c(this.r, c1371Yv.r) && C8632dsu.c(this.n, c1371Yv.n) && C8632dsu.c(this.q, c1371Yv.q) && C8632dsu.c(this.t, c1371Yv.t) && C8632dsu.c(this.y, c1371Yv.y) && C8632dsu.c(this.p, c1371Yv.p) && C8632dsu.c(this.v, c1371Yv.v) && C8632dsu.c(this.w, c1371Yv.w) && C8632dsu.c(this.l, c1371Yv.l) && C8632dsu.c(this.k, c1371Yv.k) && C8632dsu.c(this.m, c1371Yv.m) && C8632dsu.c(this.s, c1371Yv.s);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "FetchSingleRow";
    }

    public final C2865aoD g() {
        return this.g;
    }

    public final C2865aoD h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.F.hashCode() * 31) + Integer.hashCode(this.z)) * 31) + Integer.hashCode(this.b)) * 31) + Boolean.hashCode(this.H)) * 31) + Boolean.hashCode(this.E)) * 31) + Boolean.hashCode(this.D)) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.B)) * 31) + Boolean.hashCode(this.A)) * 31) + this.f13416o.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.f.hashCode()) * 31) + this.e.hashCode()) * 31) + this.u.hashCode()) * 31) + this.j.hashCode()) * 31) + this.C.hashCode()) * 31) + this.x.hashCode()) * 31) + this.r.hashCode()) * 31) + this.n.hashCode()) * 31) + this.q.hashCode()) * 31) + this.t.hashCode()) * 31) + this.y.hashCode()) * 31) + this.p.hashCode()) * 31) + this.v.hashCode()) * 31) + this.w.hashCode()) * 31) + this.l.hashCode()) * 31) + this.k.hashCode()) * 31) + this.m.hashCode()) * 31) + this.s.hashCode();
    }

    public final int i() {
        return this.b;
    }

    public final AbstractC8997hK<String> j() {
        return this.d;
    }

    public final C2865aoD k() {
        return this.f;
    }

    public final C2865aoD l() {
        return this.j;
    }

    public final C2865aoD m() {
        return this.i;
    }

    public final C2865aoD n() {
        return this.f13416o;
    }

    public final C2865aoD o() {
        return this.h;
    }

    public final C2865aoD p() {
        return this.m;
    }

    public final C2865aoD q() {
        return this.s;
    }

    public final C2865aoD r() {
        return this.k;
    }

    public final C2865aoD s() {
        return this.l;
    }

    public final C2865aoD t() {
        return this.n;
    }

    public String toString() {
        String str = this.F;
        int i = this.z;
        int i2 = this.b;
        boolean z = this.H;
        boolean z2 = this.E;
        boolean z3 = this.D;
        AbstractC8997hK<String> abstractC8997hK = this.d;
        boolean z4 = this.B;
        boolean z5 = this.A;
        C2865aoD c2865aoD = this.f13416o;
        C2865aoD c2865aoD2 = this.g;
        C2865aoD c2865aoD3 = this.h;
        C2865aoD c2865aoD4 = this.i;
        C2865aoD c2865aoD5 = this.f;
        C2865aoD c2865aoD6 = this.e;
        C2865aoD c2865aoD7 = this.u;
        C2865aoD c2865aoD8 = this.j;
        C2865aoD c2865aoD9 = this.C;
        C2865aoD c2865aoD10 = this.x;
        C2865aoD c2865aoD11 = this.r;
        C2865aoD c2865aoD12 = this.n;
        C2865aoD c2865aoD13 = this.q;
        C2865aoD c2865aoD14 = this.t;
        C2865aoD c2865aoD15 = this.y;
        C2865aoD c2865aoD16 = this.p;
        C2865aoD c2865aoD17 = this.v;
        C2865aoD c2865aoD18 = this.w;
        C2865aoD c2865aoD19 = this.l;
        C2865aoD c2865aoD20 = this.k;
        C2865aoD c2865aoD21 = this.m;
        C2865aoD c2865aoD22 = this.s;
        return "FetchSingleRowQuery(lolomoId=" + str + ", index=" + i + ", columns=" + i2 + ", isPhoneSupported=" + z + ", isTabletSupported=" + z2 + ", isLolomoLite=" + z3 + ", entityCursor=" + abstractC8997hK + ", isHorizontalPagination=" + z4 + ", includeLiveData=" + z5 + ", imageParamsForBoxart=" + c2865aoD + ", imageParamsForBillboardBackground=" + c2865aoD2 + ", imageParamsForBillboardHorizontalBackgroundAsset=" + c2865aoD3 + ", imageParamsForBillboardLogo=" + c2865aoD4 + ", imageParamsForBillboardHorizontalLogo=" + c2865aoD5 + ", imageParamsForAwardsBillboardLogo=" + c2865aoD6 + ", imageParamsForLicensedBillboardBoxart=" + c2865aoD7 + ", imageParamsForBillboardStoryArt=" + c2865aoD8 + ", imageParamsForTopTenRowBoxart=" + c2865aoD9 + ", imageParamsForTallPanelArt=" + c2865aoD10 + ", imageParamsForGamesIcon=" + c2865aoD11 + ", imageParamsForCharacterCompact=" + c2865aoD12 + ", imageParamsForGamesTrailerStillImage=" + c2865aoD13 + ", imageParamsForGamesBillboardBackground=" + c2865aoD14 + ", imageParamsForIPBasedGameLogo=" + c2865aoD15 + ", imageParamsForIPBasedGameBanner=" + c2865aoD16 + ", imageParamsForRecentlyWatchedRowBoxart=" + c2865aoD17 + ", imageParamsForRecentlyWatchedRowTitleTreatment=" + c2865aoD18 + ", imageParamsForDoubleWideCombo=" + c2865aoD19 + ", imageParamsForFeedBrandArtwork=" + c2865aoD20 + ", imageParamsForFeedHorizontalDisplayImage=" + c2865aoD21 + ", imageParamsForFeedTitleTreatment=" + c2865aoD22 + ")";
    }

    public final C2865aoD u() {
        return this.y;
    }

    public final C2865aoD v() {
        return this.p;
    }

    public final C2865aoD w() {
        return this.t;
    }

    public final C2865aoD x() {
        return this.q;
    }

    public final C2865aoD y() {
        return this.r;
    }

    public final C2865aoD z() {
        return this.C;
    }

    public C1371Yv(String str, int i, int i2, boolean z, boolean z2, boolean z3, AbstractC8997hK<String> abstractC8997hK, boolean z4, boolean z5, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3, C2865aoD c2865aoD4, C2865aoD c2865aoD5, C2865aoD c2865aoD6, C2865aoD c2865aoD7, C2865aoD c2865aoD8, C2865aoD c2865aoD9, C2865aoD c2865aoD10, C2865aoD c2865aoD11, C2865aoD c2865aoD12, C2865aoD c2865aoD13, C2865aoD c2865aoD14, C2865aoD c2865aoD15, C2865aoD c2865aoD16, C2865aoD c2865aoD17, C2865aoD c2865aoD18, C2865aoD c2865aoD19, C2865aoD c2865aoD20, C2865aoD c2865aoD21, C2865aoD c2865aoD22) {
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
        this.F = str;
        this.z = i;
        this.b = i2;
        this.H = z;
        this.E = z2;
        this.D = z3;
        this.d = abstractC8997hK;
        this.B = z4;
        this.A = z5;
        this.f13416o = c2865aoD;
        this.g = c2865aoD2;
        this.h = c2865aoD3;
        this.i = c2865aoD4;
        this.f = c2865aoD5;
        this.e = c2865aoD6;
        this.u = c2865aoD7;
        this.j = c2865aoD8;
        this.C = c2865aoD9;
        this.x = c2865aoD10;
        this.r = c2865aoD11;
        this.n = c2865aoD12;
        this.q = c2865aoD13;
        this.t = c2865aoD14;
        this.y = c2865aoD15;
        this.p = c2865aoD16;
        this.v = c2865aoD17;
        this.w = c2865aoD18;
        this.l = c2865aoD19;
        this.k = c2865aoD20;
        this.m = c2865aoD21;
        this.s = c2865aoD22;
    }

    public /* synthetic */ C1371Yv(String str, int i, int i2, boolean z, boolean z2, boolean z3, AbstractC8997hK abstractC8997hK, boolean z4, boolean z5, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3, C2865aoD c2865aoD4, C2865aoD c2865aoD5, C2865aoD c2865aoD6, C2865aoD c2865aoD7, C2865aoD c2865aoD8, C2865aoD c2865aoD9, C2865aoD c2865aoD10, C2865aoD c2865aoD11, C2865aoD c2865aoD12, C2865aoD c2865aoD13, C2865aoD c2865aoD14, C2865aoD c2865aoD15, C2865aoD c2865aoD16, C2865aoD c2865aoD17, C2865aoD c2865aoD18, C2865aoD c2865aoD19, C2865aoD c2865aoD20, C2865aoD c2865aoD21, C2865aoD c2865aoD22, int i3, C8627dsp c8627dsp) {
        this(str, i, i2, z, z2, z3, (i3 & 64) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, z4, z5, c2865aoD, c2865aoD2, c2865aoD3, c2865aoD4, c2865aoD5, c2865aoD6, c2865aoD7, c2865aoD8, c2865aoD9, c2865aoD10, c2865aoD11, c2865aoD12, c2865aoD13, c2865aoD14, c2865aoD15, c2865aoD16, c2865aoD17, c2865aoD18, c2865aoD19, c2865aoD20, c2865aoD21, c2865aoD22);
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2121aaK.c.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(C2108aaD.e.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2779amX.b.a()).d();
    }

    /* renamed from: o.Yv$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8999hM.c {
        private final a c;
        private final d e;

        public final d b() {
            return this.e;
        }

        public final a c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c(this.e, eVar.e) && C8632dsu.c(this.c, eVar.c);
            }
            return false;
        }

        public int hashCode() {
            d dVar = this.e;
            int hashCode = dVar == null ? 0 : dVar.hashCode();
            a aVar = this.c;
            return (hashCode * 31) + (aVar != null ? aVar.hashCode() : 0);
        }

        public String toString() {
            d dVar = this.e;
            a aVar = this.c;
            return "Data(lolomoRowByIndex=" + dVar + ", gatewayRequestDetails=" + aVar + ")";
        }

        public e(d dVar, a aVar) {
            this.e = dVar;
            this.c = aVar;
        }
    }

    /* renamed from: o.Yv$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final C2458agU c;

        public final C2458agU a() {
            return this.c;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c(this.c, dVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.a;
            C2458agU c2458agU = this.c;
            return "LolomoRowByIndex(__typename=" + str + ", lolomoRowEdge=" + c2458agU + ")";
        }

        public d(String str, C2458agU c2458agU) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2458agU, "");
            this.a = str;
            this.c = c2458agU;
        }
    }

    /* renamed from: o.Yv$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String b;
        private final String e;

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c((Object) this.b, (Object) aVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.b;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.e;
            String str2 = this.b;
            return "GatewayRequestDetails(__typename=" + str + ", requestId=" + str2 + ")";
        }

        public a(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = str2;
        }
    }

    /* renamed from: o.Yv$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
