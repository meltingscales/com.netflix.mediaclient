package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.AbstractC8997hK;
import o.C2267acy;
import o.C9018hf;
import o.InterfaceC8990hD;

/* renamed from: o.Zl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1387Zl implements InterfaceC8990hD<c> {
    public static final a e = new a(null);
    private final boolean A;
    private final boolean B;
    private final boolean C;
    private final C2865aoD D;
    private final boolean F;
    private final C2980aqM H;
    private final C2865aoD a;
    private final boolean b;
    private final int c;
    private final AbstractC8997hK<String> d;
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
    private final C2865aoD f13419o;
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
        return this.y;
    }

    public final C2865aoD B() {
        return this.D;
    }

    public final C2865aoD C() {
        return this.v;
    }

    public final C2865aoD D() {
        return this.x;
    }

    public final C2980aqM E() {
        return this.H;
    }

    public final boolean F() {
        return this.A;
    }

    public final boolean G() {
        return this.z;
    }

    public final boolean H() {
        return this.C;
    }

    public final boolean I() {
        return this.B;
    }

    public final boolean J() {
        return this.F;
    }

    @Override // o.InterfaceC8991hE
    public String a() {
        return "d766690a-c8be-4e07-b83e-ca20f834b706";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1387Zl) {
            C1387Zl c1387Zl = (C1387Zl) obj;
            return C8632dsu.c(this.H, c1387Zl.H) && this.c == c1387Zl.c && this.B == c1387Zl.B && this.F == c1387Zl.F && this.C == c1387Zl.C && C8632dsu.c(this.d, c1387Zl.d) && this.A == c1387Zl.A && this.z == c1387Zl.z && C8632dsu.c(this.n, c1387Zl.n) && C8632dsu.c(this.i, c1387Zl.i) && C8632dsu.c(this.g, c1387Zl.g) && C8632dsu.c(this.j, c1387Zl.j) && C8632dsu.c(this.h, c1387Zl.h) && C8632dsu.c(this.a, c1387Zl.a) && C8632dsu.c(this.x, c1387Zl.x) && C8632dsu.c(this.f, c1387Zl.f) && C8632dsu.c(this.D, c1387Zl.D) && C8632dsu.c(this.u, c1387Zl.u) && C8632dsu.c(this.q, c1387Zl.q) && C8632dsu.c(this.f13419o, c1387Zl.f13419o) && C8632dsu.c(this.p, c1387Zl.p) && C8632dsu.c(this.r, c1387Zl.r) && C8632dsu.c(this.w, c1387Zl.w) && C8632dsu.c(this.t, c1387Zl.t) && C8632dsu.c(this.v, c1387Zl.v) && C8632dsu.c(this.y, c1387Zl.y) && C8632dsu.c(this.k, c1387Zl.k) && C8632dsu.c(this.m, c1387Zl.m) && C8632dsu.c(this.l, c1387Zl.l) && C8632dsu.c(this.s, c1387Zl.s);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "RefreshRow";
    }

    public final C2865aoD g() {
        return this.a;
    }

    public final int h() {
        return this.c;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.H.hashCode() * 31) + Integer.hashCode(this.c)) * 31) + Boolean.hashCode(this.B)) * 31) + Boolean.hashCode(this.F)) * 31) + Boolean.hashCode(this.C)) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.A)) * 31) + Boolean.hashCode(this.z)) * 31) + this.n.hashCode()) * 31) + this.i.hashCode()) * 31) + this.g.hashCode()) * 31) + this.j.hashCode()) * 31) + this.h.hashCode()) * 31) + this.a.hashCode()) * 31) + this.x.hashCode()) * 31) + this.f.hashCode()) * 31) + this.D.hashCode()) * 31) + this.u.hashCode()) * 31) + this.q.hashCode()) * 31) + this.f13419o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.r.hashCode()) * 31) + this.w.hashCode()) * 31) + this.t.hashCode()) * 31) + this.v.hashCode()) * 31) + this.y.hashCode()) * 31) + this.k.hashCode()) * 31) + this.m.hashCode()) * 31) + this.l.hashCode()) * 31) + this.s.hashCode();
    }

    public final C2865aoD i() {
        return this.i;
    }

    public final AbstractC8997hK<String> j() {
        return this.d;
    }

    public final C2865aoD k() {
        return this.h;
    }

    public final C2865aoD l() {
        return this.g;
    }

    public final C2865aoD m() {
        return this.j;
    }

    public final C2865aoD n() {
        return this.f;
    }

    public final C2865aoD o() {
        return this.n;
    }

    public final C2865aoD p() {
        return this.k;
    }

    public final C2865aoD q() {
        return this.m;
    }

    public final C2865aoD r() {
        return this.l;
    }

    public final C2865aoD s() {
        return this.f13419o;
    }

    public final C2865aoD t() {
        return this.s;
    }

    public String toString() {
        C2980aqM c2980aqM = this.H;
        int i = this.c;
        boolean z = this.B;
        boolean z2 = this.F;
        boolean z3 = this.C;
        AbstractC8997hK<String> abstractC8997hK = this.d;
        boolean z4 = this.A;
        boolean z5 = this.z;
        C2865aoD c2865aoD = this.n;
        C2865aoD c2865aoD2 = this.i;
        C2865aoD c2865aoD3 = this.g;
        C2865aoD c2865aoD4 = this.j;
        C2865aoD c2865aoD5 = this.h;
        C2865aoD c2865aoD6 = this.a;
        C2865aoD c2865aoD7 = this.x;
        C2865aoD c2865aoD8 = this.f;
        C2865aoD c2865aoD9 = this.D;
        C2865aoD c2865aoD10 = this.u;
        C2865aoD c2865aoD11 = this.q;
        C2865aoD c2865aoD12 = this.f13419o;
        C2865aoD c2865aoD13 = this.p;
        C2865aoD c2865aoD14 = this.r;
        C2865aoD c2865aoD15 = this.w;
        C2865aoD c2865aoD16 = this.t;
        C2865aoD c2865aoD17 = this.v;
        C2865aoD c2865aoD18 = this.y;
        C2865aoD c2865aoD19 = this.k;
        C2865aoD c2865aoD20 = this.m;
        C2865aoD c2865aoD21 = this.l;
        C2865aoD c2865aoD22 = this.s;
        return "RefreshRowMutation(rowRefreshInput=" + c2980aqM + ", columns=" + i + ", isPhoneSupported=" + z + ", isTabletSupported=" + z2 + ", isLolomoLite=" + z3 + ", entityCursor=" + abstractC8997hK + ", isHorizontalPagination=" + z4 + ", includeLiveData=" + z5 + ", imageParamsForBoxart=" + c2865aoD + ", imageParamsForBillboardBackground=" + c2865aoD2 + ", imageParamsForBillboardHorizontalBackgroundAsset=" + c2865aoD3 + ", imageParamsForBillboardLogo=" + c2865aoD4 + ", imageParamsForBillboardHorizontalLogo=" + c2865aoD5 + ", imageParamsForAwardsBillboardLogo=" + c2865aoD6 + ", imageParamsForLicensedBillboardBoxart=" + c2865aoD7 + ", imageParamsForBillboardStoryArt=" + c2865aoD8 + ", imageParamsForTopTenRowBoxart=" + c2865aoD9 + ", imageParamsForTallPanelArt=" + c2865aoD10 + ", imageParamsForGamesIcon=" + c2865aoD11 + ", imageParamsForCharacterCompact=" + c2865aoD12 + ", imageParamsForGamesTrailerStillImage=" + c2865aoD13 + ", imageParamsForGamesBillboardBackground=" + c2865aoD14 + ", imageParamsForIPBasedGameLogo=" + c2865aoD15 + ", imageParamsForIPBasedGameBanner=" + c2865aoD16 + ", imageParamsForRecentlyWatchedRowBoxart=" + c2865aoD17 + ", imageParamsForRecentlyWatchedRowTitleTreatment=" + c2865aoD18 + ", imageParamsForDoubleWideCombo=" + c2865aoD19 + ", imageParamsForFeedBrandArtwork=" + c2865aoD20 + ", imageParamsForFeedHorizontalDisplayImage=" + c2865aoD21 + ", imageParamsForFeedTitleTreatment=" + c2865aoD22 + ")";
    }

    public final C2865aoD u() {
        return this.w;
    }

    public final C2865aoD v() {
        return this.t;
    }

    public final C2865aoD w() {
        return this.q;
    }

    public final C2865aoD x() {
        return this.r;
    }

    public final C2865aoD y() {
        return this.p;
    }

    public final C2865aoD z() {
        return this.u;
    }

    public C1387Zl(C2980aqM c2980aqM, int i, boolean z, boolean z2, boolean z3, AbstractC8997hK<String> abstractC8997hK, boolean z4, boolean z5, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3, C2865aoD c2865aoD4, C2865aoD c2865aoD5, C2865aoD c2865aoD6, C2865aoD c2865aoD7, C2865aoD c2865aoD8, C2865aoD c2865aoD9, C2865aoD c2865aoD10, C2865aoD c2865aoD11, C2865aoD c2865aoD12, C2865aoD c2865aoD13, C2865aoD c2865aoD14, C2865aoD c2865aoD15, C2865aoD c2865aoD16, C2865aoD c2865aoD17, C2865aoD c2865aoD18, C2865aoD c2865aoD19, C2865aoD c2865aoD20, C2865aoD c2865aoD21, C2865aoD c2865aoD22) {
        C8632dsu.c((Object) c2980aqM, "");
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
        this.H = c2980aqM;
        this.c = i;
        this.B = z;
        this.F = z2;
        this.C = z3;
        this.d = abstractC8997hK;
        this.A = z4;
        this.z = z5;
        this.n = c2865aoD;
        this.i = c2865aoD2;
        this.g = c2865aoD3;
        this.j = c2865aoD4;
        this.h = c2865aoD5;
        this.a = c2865aoD6;
        this.x = c2865aoD7;
        this.f = c2865aoD8;
        this.D = c2865aoD9;
        this.u = c2865aoD10;
        this.q = c2865aoD11;
        this.f13419o = c2865aoD12;
        this.p = c2865aoD13;
        this.r = c2865aoD14;
        this.w = c2865aoD15;
        this.t = c2865aoD16;
        this.v = c2865aoD17;
        this.y = c2865aoD18;
        this.k = c2865aoD19;
        this.m = c2865aoD20;
        this.l = c2865aoD21;
        this.s = c2865aoD22;
    }

    public /* synthetic */ C1387Zl(C2980aqM c2980aqM, int i, boolean z, boolean z2, boolean z3, AbstractC8997hK abstractC8997hK, boolean z4, boolean z5, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3, C2865aoD c2865aoD4, C2865aoD c2865aoD5, C2865aoD c2865aoD6, C2865aoD c2865aoD7, C2865aoD c2865aoD8, C2865aoD c2865aoD9, C2865aoD c2865aoD10, C2865aoD c2865aoD11, C2865aoD c2865aoD12, C2865aoD c2865aoD13, C2865aoD c2865aoD14, C2865aoD c2865aoD15, C2865aoD c2865aoD16, C2865aoD c2865aoD17, C2865aoD c2865aoD18, C2865aoD c2865aoD19, C2865aoD c2865aoD20, C2865aoD c2865aoD21, C2865aoD c2865aoD22, int i2, C8627dsp c8627dsp) {
        this(c2980aqM, i, z, z2, z3, (i2 & 32) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, z4, z5, c2865aoD, c2865aoD2, c2865aoD3, c2865aoD4, c2865aoD5, c2865aoD6, c2865aoD7, c2865aoD8, c2865aoD9, c2865aoD10, c2865aoD11, c2865aoD12, c2865aoD13, c2865aoD14, c2865aoD15, c2865aoD16, c2865aoD17, c2865aoD18, c2865aoD19, c2865aoD20, c2865aoD21, c2865aoD22);
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2266acx.b.d(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<c> e() {
        return C8953gT.c(C2267acy.a.d, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C2987aqT.c.d()).e(C2830anV.a.b()).d();
    }

    /* renamed from: o.Zl$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8990hD.b {
        private final d a;
        private final b c;

        public final d d() {
            return this.a;
        }

        public final b e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c(this.c, cVar.c) && C8632dsu.c(this.a, cVar.a);
            }
            return false;
        }

        public int hashCode() {
            b bVar = this.c;
            int hashCode = bVar == null ? 0 : bVar.hashCode();
            d dVar = this.a;
            return (hashCode * 31) + (dVar != null ? dVar.hashCode() : 0);
        }

        public String toString() {
            b bVar = this.c;
            d dVar = this.a;
            return "Data(refreshLolomoRow=" + bVar + ", gatewayRequestDetails=" + dVar + ")";
        }

        public c(b bVar, d dVar) {
            this.c = bVar;
            this.a = dVar;
        }
    }

    /* renamed from: o.Zl$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final C2458agU a;
        private final String c;

        public final String c() {
            return this.c;
        }

        public final C2458agU e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c(this.a, bVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.c;
            C2458agU c2458agU = this.a;
            return "RefreshLolomoRow(__typename=" + str + ", lolomoRowEdge=" + c2458agU + ")";
        }

        public b(String str, C2458agU c2458agU) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2458agU, "");
            this.c = str;
            this.a = c2458agU;
        }
    }

    /* renamed from: o.Zl$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final String c;

        public final String b() {
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
                return C8632dsu.c((Object) this.c, (Object) dVar.c) && C8632dsu.c((Object) this.a, (Object) dVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.a;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.c;
            String str2 = this.a;
            return "GatewayRequestDetails(__typename=" + str + ", requestId=" + str2 + ")";
        }

        public d(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.a = str2;
        }
    }

    /* renamed from: o.Zl$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }
}
