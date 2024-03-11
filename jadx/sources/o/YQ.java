package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import com.netflix.mediaclient.service.pushnotification.Payload;
import o.AbstractC8997hK;
import o.C2212abw;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class YQ implements InterfaceC8999hM<e> {
    public static final a a = new a(null);
    private final C2865aoD A;
    private final boolean B;
    private final boolean C;
    private final C2865aoD D;
    private final int G;
    private final boolean H;
    private final boolean I;
    private final AbstractC8997hK<String> b;
    private final int c;
    private final C3004aqk d;
    private final boolean e;
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
    private final C2865aoD f13411o;
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
        return this.A;
    }

    public final C2865aoD B() {
        return this.x;
    }

    public final C2865aoD C() {
        return this.y;
    }

    public final C2865aoD D() {
        return this.u;
    }

    public final int E() {
        return this.G;
    }

    public final boolean F() {
        return this.C;
    }

    public final C2865aoD G() {
        return this.D;
    }

    public final boolean H() {
        return this.B;
    }

    public final boolean I() {
        return this.z;
    }

    public final boolean J() {
        return this.H;
    }

    public final boolean M() {
        return this.I;
    }

    @Override // o.InterfaceC8991hE
    public String a() {
        return "f97226af-0556-4bfe-a78b-35c6286c91f7";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YQ) {
            YQ yq = (YQ) obj;
            return this.G == yq.G && this.c == yq.c && C8632dsu.c(this.d, yq.d) && this.H == yq.H && this.I == yq.I && this.B == yq.B && C8632dsu.c(this.b, yq.b) && this.C == yq.C && this.z == yq.z && C8632dsu.c(this.n, yq.n) && C8632dsu.c(this.g, yq.g) && C8632dsu.c(this.i, yq.i) && C8632dsu.c(this.h, yq.h) && C8632dsu.c(this.f, yq.f) && C8632dsu.c(this.j, yq.j) && C8632dsu.c(this.x, yq.x) && C8632dsu.c(this.k, yq.k) && C8632dsu.c(this.D, yq.D) && C8632dsu.c(this.A, yq.A) && C8632dsu.c(this.t, yq.t) && C8632dsu.c(this.f13411o, yq.f13411o) && C8632dsu.c(this.p, yq.p) && C8632dsu.c(this.r, yq.r) && C8632dsu.c(this.y, yq.y) && C8632dsu.c(this.v, yq.v) && C8632dsu.c(this.u, yq.u) && C8632dsu.c(this.w, yq.w) && C8632dsu.c(this.l, yq.l) && C8632dsu.c(this.m, yq.m) && C8632dsu.c(this.q, yq.q) && C8632dsu.c(this.s, yq.s);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return Payload.PARAM_RENO_MESSAGE_TYPE_NEW_LOLOMO;
    }

    public final AbstractC8997hK<String> g() {
        return this.b;
    }

    public final C3004aqk h() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.G) * 31) + Integer.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.H)) * 31) + Boolean.hashCode(this.I)) * 31) + Boolean.hashCode(this.B)) * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.C)) * 31) + Boolean.hashCode(this.z)) * 31) + this.n.hashCode()) * 31) + this.g.hashCode()) * 31) + this.i.hashCode()) * 31) + this.h.hashCode()) * 31) + this.f.hashCode()) * 31) + this.j.hashCode()) * 31) + this.x.hashCode()) * 31) + this.k.hashCode()) * 31) + this.D.hashCode()) * 31) + this.A.hashCode()) * 31) + this.t.hashCode()) * 31) + this.f13411o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.r.hashCode()) * 31) + this.y.hashCode()) * 31) + this.v.hashCode()) * 31) + this.u.hashCode()) * 31) + this.w.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.q.hashCode()) * 31) + this.s.hashCode();
    }

    public final C2865aoD i() {
        return this.j;
    }

    public final int j() {
        return this.c;
    }

    public final C2865aoD k() {
        return this.g;
    }

    public final C2865aoD l() {
        return this.k;
    }

    public final C2865aoD m() {
        return this.f;
    }

    public final C2865aoD n() {
        return this.i;
    }

    public final C2865aoD o() {
        return this.h;
    }

    public final C2865aoD p() {
        return this.l;
    }

    public final C2865aoD q() {
        return this.q;
    }

    public final C2865aoD r() {
        return this.m;
    }

    public final C2865aoD s() {
        return this.n;
    }

    public final C2865aoD t() {
        return this.f13411o;
    }

    public String toString() {
        int i = this.G;
        int i2 = this.c;
        C3004aqk c3004aqk = this.d;
        boolean z = this.H;
        boolean z2 = this.I;
        boolean z3 = this.B;
        AbstractC8997hK<String> abstractC8997hK = this.b;
        boolean z4 = this.C;
        boolean z5 = this.z;
        C2865aoD c2865aoD = this.n;
        C2865aoD c2865aoD2 = this.g;
        C2865aoD c2865aoD3 = this.i;
        C2865aoD c2865aoD4 = this.h;
        C2865aoD c2865aoD5 = this.f;
        C2865aoD c2865aoD6 = this.j;
        C2865aoD c2865aoD7 = this.x;
        C2865aoD c2865aoD8 = this.k;
        C2865aoD c2865aoD9 = this.D;
        C2865aoD c2865aoD10 = this.A;
        C2865aoD c2865aoD11 = this.t;
        C2865aoD c2865aoD12 = this.f13411o;
        C2865aoD c2865aoD13 = this.p;
        C2865aoD c2865aoD14 = this.r;
        C2865aoD c2865aoD15 = this.y;
        C2865aoD c2865aoD16 = this.v;
        C2865aoD c2865aoD17 = this.u;
        C2865aoD c2865aoD18 = this.w;
        C2865aoD c2865aoD19 = this.l;
        C2865aoD c2865aoD20 = this.m;
        C2865aoD c2865aoD21 = this.q;
        C2865aoD c2865aoD22 = this.s;
        return "NewLolomoQuery(rows=" + i + ", columns=" + i2 + ", context=" + c3004aqk + ", isPhoneSupported=" + z + ", isTabletSupported=" + z2 + ", isLolomoLite=" + z3 + ", entityCursor=" + abstractC8997hK + ", isHorizontalPagination=" + z4 + ", includeLiveData=" + z5 + ", imageParamsForBoxart=" + c2865aoD + ", imageParamsForBillboardBackground=" + c2865aoD2 + ", imageParamsForBillboardHorizontalBackgroundAsset=" + c2865aoD3 + ", imageParamsForBillboardLogo=" + c2865aoD4 + ", imageParamsForBillboardHorizontalLogo=" + c2865aoD5 + ", imageParamsForAwardsBillboardLogo=" + c2865aoD6 + ", imageParamsForLicensedBillboardBoxart=" + c2865aoD7 + ", imageParamsForBillboardStoryArt=" + c2865aoD8 + ", imageParamsForTopTenRowBoxart=" + c2865aoD9 + ", imageParamsForTallPanelArt=" + c2865aoD10 + ", imageParamsForGamesIcon=" + c2865aoD11 + ", imageParamsForCharacterCompact=" + c2865aoD12 + ", imageParamsForGamesTrailerStillImage=" + c2865aoD13 + ", imageParamsForGamesBillboardBackground=" + c2865aoD14 + ", imageParamsForIPBasedGameLogo=" + c2865aoD15 + ", imageParamsForIPBasedGameBanner=" + c2865aoD16 + ", imageParamsForRecentlyWatchedRowBoxart=" + c2865aoD17 + ", imageParamsForRecentlyWatchedRowTitleTreatment=" + c2865aoD18 + ", imageParamsForDoubleWideCombo=" + c2865aoD19 + ", imageParamsForFeedBrandArtwork=" + c2865aoD20 + ", imageParamsForFeedHorizontalDisplayImage=" + c2865aoD21 + ", imageParamsForFeedTitleTreatment=" + c2865aoD22 + ")";
    }

    public final C2865aoD u() {
        return this.s;
    }

    public final C2865aoD v() {
        return this.r;
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
        return this.w;
    }

    public YQ(int i, int i2, C3004aqk c3004aqk, boolean z, boolean z2, boolean z3, AbstractC8997hK<String> abstractC8997hK, boolean z4, boolean z5, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3, C2865aoD c2865aoD4, C2865aoD c2865aoD5, C2865aoD c2865aoD6, C2865aoD c2865aoD7, C2865aoD c2865aoD8, C2865aoD c2865aoD9, C2865aoD c2865aoD10, C2865aoD c2865aoD11, C2865aoD c2865aoD12, C2865aoD c2865aoD13, C2865aoD c2865aoD14, C2865aoD c2865aoD15, C2865aoD c2865aoD16, C2865aoD c2865aoD17, C2865aoD c2865aoD18, C2865aoD c2865aoD19, C2865aoD c2865aoD20, C2865aoD c2865aoD21, C2865aoD c2865aoD22) {
        C8632dsu.c((Object) c3004aqk, "");
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
        this.G = i;
        this.c = i2;
        this.d = c3004aqk;
        this.H = z;
        this.I = z2;
        this.B = z3;
        this.b = abstractC8997hK;
        this.C = z4;
        this.z = z5;
        this.n = c2865aoD;
        this.g = c2865aoD2;
        this.i = c2865aoD3;
        this.h = c2865aoD4;
        this.f = c2865aoD5;
        this.j = c2865aoD6;
        this.x = c2865aoD7;
        this.k = c2865aoD8;
        this.D = c2865aoD9;
        this.A = c2865aoD10;
        this.t = c2865aoD11;
        this.f13411o = c2865aoD12;
        this.p = c2865aoD13;
        this.r = c2865aoD14;
        this.y = c2865aoD15;
        this.v = c2865aoD16;
        this.u = c2865aoD17;
        this.w = c2865aoD18;
        this.l = c2865aoD19;
        this.m = c2865aoD20;
        this.q = c2865aoD21;
        this.s = c2865aoD22;
    }

    public /* synthetic */ YQ(int i, int i2, C3004aqk c3004aqk, boolean z, boolean z2, boolean z3, AbstractC8997hK abstractC8997hK, boolean z4, boolean z5, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3, C2865aoD c2865aoD4, C2865aoD c2865aoD5, C2865aoD c2865aoD6, C2865aoD c2865aoD7, C2865aoD c2865aoD8, C2865aoD c2865aoD9, C2865aoD c2865aoD10, C2865aoD c2865aoD11, C2865aoD c2865aoD12, C2865aoD c2865aoD13, C2865aoD c2865aoD14, C2865aoD c2865aoD15, C2865aoD c2865aoD16, C2865aoD c2865aoD17, C2865aoD c2865aoD18, C2865aoD c2865aoD19, C2865aoD c2865aoD20, C2865aoD c2865aoD21, C2865aoD c2865aoD22, int i3, C8627dsp c8627dsp) {
        this(i, i2, c3004aqk, z, z2, z3, (i3 & 64) != 0 ? AbstractC8997hK.e.c : abstractC8997hK, z4, z5, c2865aoD, c2865aoD2, c2865aoD3, c2865aoD4, c2865aoD5, c2865aoD6, c2865aoD7, c2865aoD8, c2865aoD9, c2865aoD10, c2865aoD11, c2865aoD12, c2865aoD13, c2865aoD14, c2865aoD15, c2865aoD16, c2865aoD17, c2865aoD18, c2865aoD19, c2865aoD20, c2865aoD21, c2865aoD22);
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2215abz.a.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(C2212abw.d.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2851anq.c.e()).d();
    }

    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8999hM.c {
        private final c a;
        private final d c;

        public final c b() {
            return this.a;
        }

        public final d e() {
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
            d dVar = this.c;
            int hashCode = dVar == null ? 0 : dVar.hashCode();
            c cVar = this.a;
            return (hashCode * 31) + (cVar != null ? cVar.hashCode() : 0);
        }

        public String toString() {
            d dVar = this.c;
            c cVar = this.a;
            return "Data(newLolomo=" + dVar + ", gatewayRequestDetails=" + cVar + ")";
        }

        public e(d dVar, c cVar) {
            this.c = dVar;
            this.a = cVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        private final b a;
        private final C2520ahd b;
        private final String c;

        public final C2520ahd c() {
            return this.b;
        }

        public final b d() {
            return this.a;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.c, (Object) dVar.c) && C8632dsu.c(this.a, dVar.a) && C8632dsu.c(this.b, dVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            b bVar = this.a;
            return (((hashCode * 31) + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.c;
            b bVar = this.a;
            C2520ahd c2520ahd = this.b;
            return "NewLolomo(__typename=" + str + ", rows=" + bVar + ", lolomoSummary=" + c2520ahd + ")";
        }

        public d(String str, b bVar, C2520ahd c2520ahd) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2520ahd, "");
            this.c = str;
            this.a = bVar;
            this.b = c2520ahd;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private final C2463agZ a;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final C2463agZ b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c(this.a, bVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.e;
            C2463agZ c2463agZ = this.a;
            return "Rows(__typename=" + str + ", lolomoRows=" + c2463agZ + ")";
        }

        public b(String str, C2463agZ c2463agZ) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2463agZ, "");
            this.e = str;
            this.a = c2463agZ;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private final String a;
        private final String e;

        public final String d() {
            return this.e;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.a, (Object) cVar.a) && C8632dsu.c((Object) this.e, (Object) cVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.e;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.a;
            String str2 = this.e;
            return "GatewayRequestDetails(__typename=" + str + ", requestId=" + str2 + ")";
        }

        public c(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.a = str;
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
