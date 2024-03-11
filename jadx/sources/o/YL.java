package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2200abk;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class YL implements InterfaceC8999hM<b> {
    public static final d d = new d(null);
    private final C2865aoD A;
    private final boolean B;
    private final boolean C;
    private final int D;
    private final boolean E;
    private final boolean G;
    private final String I;
    private final int a;
    private final C2865aoD b;
    private final boolean c;
    private final String e;
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
    private final C2865aoD f13410o;
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
        return this.u;
    }

    public final C2865aoD B() {
        return this.w;
    }

    public final C2865aoD C() {
        return this.x;
    }

    public final C2865aoD D() {
        return this.A;
    }

    public final boolean E() {
        return this.C;
    }

    public final int F() {
        return this.D;
    }

    public final boolean G() {
        return this.B;
    }

    public final String H() {
        return this.I;
    }

    public final boolean I() {
        return this.z;
    }

    public final boolean J() {
        return this.E;
    }

    public final boolean M() {
        return this.G;
    }

    @Override // o.InterfaceC8991hE
    public String a() {
        return "b2fdccc1-c4ca-4ec4-8b9f-7501f09a5c46";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YL) {
            YL yl = (YL) obj;
            return C8632dsu.c((Object) this.I, (Object) yl.I) && this.D == yl.D && this.a == yl.a && C8632dsu.c((Object) this.e, (Object) yl.e) && this.E == yl.E && this.G == yl.G && this.B == yl.B && this.C == yl.C && this.z == yl.z && C8632dsu.c(this.n, yl.n) && C8632dsu.c(this.i, yl.i) && C8632dsu.c(this.g, yl.g) && C8632dsu.c(this.j, yl.j) && C8632dsu.c(this.h, yl.h) && C8632dsu.c(this.b, yl.b) && C8632dsu.c(this.x, yl.x) && C8632dsu.c(this.f, yl.f) && C8632dsu.c(this.A, yl.A) && C8632dsu.c(this.w, yl.w) && C8632dsu.c(this.p, yl.p) && C8632dsu.c(this.l, yl.l) && C8632dsu.c(this.s, yl.s) && C8632dsu.c(this.r, yl.r) && C8632dsu.c(this.v, yl.v) && C8632dsu.c(this.t, yl.t) && C8632dsu.c(this.u, yl.u) && C8632dsu.c(this.y, yl.y) && C8632dsu.c(this.m, yl.m) && C8632dsu.c(this.k, yl.k) && C8632dsu.c(this.f13410o, yl.f13410o) && C8632dsu.c(this.q, yl.q);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "MoreEntities";
    }

    public final C2865aoD g() {
        return this.b;
    }

    public final C2865aoD h() {
        return this.i;
    }

    public int hashCode() {
        int hashCode = this.I.hashCode();
        int hashCode2 = Integer.hashCode(this.D);
        int hashCode3 = Integer.hashCode(this.a);
        String str = this.e;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.E)) * 31) + Boolean.hashCode(this.G)) * 31) + Boolean.hashCode(this.B)) * 31) + Boolean.hashCode(this.C)) * 31) + Boolean.hashCode(this.z)) * 31) + this.n.hashCode()) * 31) + this.i.hashCode()) * 31) + this.g.hashCode()) * 31) + this.j.hashCode()) * 31) + this.h.hashCode()) * 31) + this.b.hashCode()) * 31) + this.x.hashCode()) * 31) + this.f.hashCode()) * 31) + this.A.hashCode()) * 31) + this.w.hashCode()) * 31) + this.p.hashCode()) * 31) + this.l.hashCode()) * 31) + this.s.hashCode()) * 31) + this.r.hashCode()) * 31) + this.v.hashCode()) * 31) + this.t.hashCode()) * 31) + this.u.hashCode()) * 31) + this.y.hashCode()) * 31) + this.m.hashCode()) * 31) + this.k.hashCode()) * 31) + this.f13410o.hashCode()) * 31) + this.q.hashCode();
    }

    public final String i() {
        return this.e;
    }

    public final int j() {
        return this.a;
    }

    public final C2865aoD k() {
        return this.h;
    }

    public final C2865aoD l() {
        return this.g;
    }

    public final C2865aoD m() {
        return this.f;
    }

    public final C2865aoD n() {
        return this.n;
    }

    public final C2865aoD o() {
        return this.j;
    }

    public final C2865aoD p() {
        return this.q;
    }

    public final C2865aoD q() {
        return this.k;
    }

    public final C2865aoD r() {
        return this.l;
    }

    public final C2865aoD s() {
        return this.m;
    }

    public final C2865aoD t() {
        return this.f13410o;
    }

    public String toString() {
        String str = this.I;
        int i = this.D;
        int i2 = this.a;
        String str2 = this.e;
        boolean z = this.E;
        boolean z2 = this.G;
        boolean z3 = this.B;
        boolean z4 = this.C;
        boolean z5 = this.z;
        C2865aoD c2865aoD = this.n;
        C2865aoD c2865aoD2 = this.i;
        C2865aoD c2865aoD3 = this.g;
        C2865aoD c2865aoD4 = this.j;
        C2865aoD c2865aoD5 = this.h;
        C2865aoD c2865aoD6 = this.b;
        C2865aoD c2865aoD7 = this.x;
        C2865aoD c2865aoD8 = this.f;
        C2865aoD c2865aoD9 = this.A;
        C2865aoD c2865aoD10 = this.w;
        C2865aoD c2865aoD11 = this.p;
        C2865aoD c2865aoD12 = this.l;
        C2865aoD c2865aoD13 = this.s;
        C2865aoD c2865aoD14 = this.r;
        C2865aoD c2865aoD15 = this.v;
        C2865aoD c2865aoD16 = this.t;
        C2865aoD c2865aoD17 = this.u;
        C2865aoD c2865aoD18 = this.y;
        C2865aoD c2865aoD19 = this.m;
        C2865aoD c2865aoD20 = this.k;
        C2865aoD c2865aoD21 = this.f13410o;
        C2865aoD c2865aoD22 = this.q;
        return "MoreEntitiesQuery(lolomoId=" + str + ", index=" + i + ", columns=" + i2 + ", entityCursor=" + str2 + ", isPhoneSupported=" + z + ", isTabletSupported=" + z2 + ", isLolomoLite=" + z3 + ", isHorizontalPagination=" + z4 + ", includeLiveData=" + z5 + ", imageParamsForBoxart=" + c2865aoD + ", imageParamsForBillboardBackground=" + c2865aoD2 + ", imageParamsForBillboardHorizontalBackgroundAsset=" + c2865aoD3 + ", imageParamsForBillboardLogo=" + c2865aoD4 + ", imageParamsForBillboardHorizontalLogo=" + c2865aoD5 + ", imageParamsForAwardsBillboardLogo=" + c2865aoD6 + ", imageParamsForLicensedBillboardBoxart=" + c2865aoD7 + ", imageParamsForBillboardStoryArt=" + c2865aoD8 + ", imageParamsForTopTenRowBoxart=" + c2865aoD9 + ", imageParamsForTallPanelArt=" + c2865aoD10 + ", imageParamsForGamesIcon=" + c2865aoD11 + ", imageParamsForCharacterCompact=" + c2865aoD12 + ", imageParamsForGamesTrailerStillImage=" + c2865aoD13 + ", imageParamsForGamesBillboardBackground=" + c2865aoD14 + ", imageParamsForIPBasedGameLogo=" + c2865aoD15 + ", imageParamsForIPBasedGameBanner=" + c2865aoD16 + ", imageParamsForRecentlyWatchedRowBoxart=" + c2865aoD17 + ", imageParamsForRecentlyWatchedRowTitleTreatment=" + c2865aoD18 + ", imageParamsForDoubleWideCombo=" + c2865aoD19 + ", imageParamsForFeedBrandArtwork=" + c2865aoD20 + ", imageParamsForFeedHorizontalDisplayImage=" + c2865aoD21 + ", imageParamsForFeedTitleTreatment=" + c2865aoD22 + ")";
    }

    public final C2865aoD u() {
        return this.r;
    }

    public final C2865aoD v() {
        return this.s;
    }

    public final C2865aoD w() {
        return this.v;
    }

    public final C2865aoD x() {
        return this.p;
    }

    public final C2865aoD y() {
        return this.t;
    }

    public final C2865aoD z() {
        return this.y;
    }

    public YL(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3, C2865aoD c2865aoD4, C2865aoD c2865aoD5, C2865aoD c2865aoD6, C2865aoD c2865aoD7, C2865aoD c2865aoD8, C2865aoD c2865aoD9, C2865aoD c2865aoD10, C2865aoD c2865aoD11, C2865aoD c2865aoD12, C2865aoD c2865aoD13, C2865aoD c2865aoD14, C2865aoD c2865aoD15, C2865aoD c2865aoD16, C2865aoD c2865aoD17, C2865aoD c2865aoD18, C2865aoD c2865aoD19, C2865aoD c2865aoD20, C2865aoD c2865aoD21, C2865aoD c2865aoD22) {
        C8632dsu.c((Object) str, "");
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
        this.I = str;
        this.D = i;
        this.a = i2;
        this.e = str2;
        this.E = z;
        this.G = z2;
        this.B = z3;
        this.C = z4;
        this.z = z5;
        this.n = c2865aoD;
        this.i = c2865aoD2;
        this.g = c2865aoD3;
        this.j = c2865aoD4;
        this.h = c2865aoD5;
        this.b = c2865aoD6;
        this.x = c2865aoD7;
        this.f = c2865aoD8;
        this.A = c2865aoD9;
        this.w = c2865aoD10;
        this.p = c2865aoD11;
        this.l = c2865aoD12;
        this.s = c2865aoD13;
        this.r = c2865aoD14;
        this.v = c2865aoD15;
        this.t = c2865aoD16;
        this.u = c2865aoD17;
        this.y = c2865aoD18;
        this.m = c2865aoD19;
        this.k = c2865aoD20;
        this.f13410o = c2865aoD21;
        this.q = c2865aoD22;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2206abq.a.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<b> e() {
        return C8953gT.c(C2200abk.a.a, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2843ani.b.c()).d();
    }

    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8999hM.c {
        private final a a;

        public final a b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            a aVar = this.a;
            return "Data(lolomoRowByIndex=" + aVar + ")";
        }

        public b(a aVar) {
            this.a = aVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final C2458agU a;
        private final String d;

        public final C2458agU a() {
            return this.a;
        }

        public final String b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c(this.a, aVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.d;
            C2458agU c2458agU = this.a;
            return "LolomoRowByIndex(__typename=" + str + ", lolomoRowEdge=" + c2458agU + ")";
        }

        public a(String str, C2458agU c2458agU) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2458agU, "");
            this.d = str;
            this.a = c2458agU;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
