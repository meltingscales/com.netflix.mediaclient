package o;

import com.netflix.mediaclient.graphql.models.type.PinotDeviceResolution;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2133aaW;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Yy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1374Yy implements InterfaceC8999hM<d> {
    public static final b d = new b(null);
    private final C3165atm a;
    private final String b;
    private final Integer c;
    private final String e;
    private final C2865aoD f;
    private final C2865aoD g;
    private final Integer h;
    private final C2865aoD i;
    private final boolean j;
    private final String k;
    private final PinotDeviceResolution l;
    private final C3105asf m;
    private final C2865aoD n;

    /* renamed from: o  reason: collision with root package name */
    private final String f13417o;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "a72e88f5-571a-4e71-ab63-25826250b088";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1374Yy) {
            C1374Yy c1374Yy = (C1374Yy) obj;
            return C8632dsu.c((Object) this.e, (Object) c1374Yy.e) && C8632dsu.c((Object) this.k, (Object) c1374Yy.k) && C8632dsu.c((Object) this.f13417o, (Object) c1374Yy.f13417o) && C8632dsu.c(this.h, c1374Yy.h) && C8632dsu.c((Object) this.b, (Object) c1374Yy.b) && C8632dsu.c(this.c, c1374Yy.c) && C8632dsu.c(this.i, c1374Yy.i) && C8632dsu.c(this.f, c1374Yy.f) && C8632dsu.c(this.n, c1374Yy.n) && C8632dsu.c(this.g, c1374Yy.g) && C8632dsu.c(this.a, c1374Yy.a) && C8632dsu.c(this.m, c1374Yy.m) && this.l == c1374Yy.l;
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "IrmaEntitySearchPage";
    }

    public final C3165atm g() {
        return this.a;
    }

    public final String h() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        int hashCode2 = this.k.hashCode();
        String str = this.f13417o;
        int hashCode3 = str == null ? 0 : str.hashCode();
        Integer num = this.h;
        int hashCode4 = num == null ? 0 : num.hashCode();
        String str2 = this.b;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.c;
        int hashCode6 = num2 == null ? 0 : num2.hashCode();
        int hashCode7 = this.i.hashCode();
        int hashCode8 = this.f.hashCode();
        int hashCode9 = this.n.hashCode();
        int hashCode10 = this.g.hashCode();
        C3165atm c3165atm = this.a;
        int hashCode11 = c3165atm == null ? 0 : c3165atm.hashCode();
        C3105asf c3105asf = this.m;
        int hashCode12 = c3105asf == null ? 0 : c3105asf.hashCode();
        PinotDeviceResolution pinotDeviceResolution = this.l;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (pinotDeviceResolution != null ? pinotDeviceResolution.hashCode() : 0);
    }

    public final String i() {
        return this.b;
    }

    public final Integer j() {
        return this.c;
    }

    public final C2865aoD k() {
        return this.g;
    }

    public final C2865aoD l() {
        return this.i;
    }

    public final C2865aoD m() {
        return this.f;
    }

    public final C2865aoD n() {
        return this.n;
    }

    public final Integer o() {
        return this.h;
    }

    public final C3105asf p() {
        return this.m;
    }

    public final String q() {
        return this.f13417o;
    }

    public final String r() {
        return this.k;
    }

    public final PinotDeviceResolution s() {
        return this.l;
    }

    public String toString() {
        String str = this.e;
        String str2 = this.k;
        String str3 = this.f13417o;
        Integer num = this.h;
        String str4 = this.b;
        Integer num2 = this.c;
        C2865aoD c2865aoD = this.i;
        C2865aoD c2865aoD2 = this.f;
        C2865aoD c2865aoD3 = this.n;
        C2865aoD c2865aoD4 = this.g;
        C3165atm c3165atm = this.a;
        C3105asf c3105asf = this.m;
        PinotDeviceResolution pinotDeviceResolution = this.l;
        return "IrmaEntitySearchPageQuery(entityId=" + str + ", sessionId=" + str2 + ", sectionCursor=" + str3 + ", first_sections=" + num + ", entityCursor=" + str4 + ", first_entities=" + num2 + ", imageParamsForLocalizedBoxart=" + c2865aoD + ", imageParamsForGamesIcon=" + c2865aoD2 + ", imageParamsForPQS=" + c2865aoD3 + ", imageParamsForCreatorHome=" + c2865aoD4 + ", clientCapabilities=" + c3165atm + ", pageCapabilities=" + c3105asf + ", resolution=" + pinotDeviceResolution + ")";
    }

    public C1374Yy(String str, String str2, String str3, Integer num, String str4, Integer num2, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3, C2865aoD c2865aoD4, C3165atm c3165atm, C3105asf c3105asf, PinotDeviceResolution pinotDeviceResolution) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) c2865aoD, "");
        C8632dsu.c((Object) c2865aoD2, "");
        C8632dsu.c((Object) c2865aoD3, "");
        C8632dsu.c((Object) c2865aoD4, "");
        this.e = str;
        this.k = str2;
        this.f13417o = str3;
        this.h = num;
        this.b = str4;
        this.c = num2;
        this.i = c2865aoD;
        this.f = c2865aoD2;
        this.n = c2865aoD3;
        this.g = c2865aoD4;
        this.a = c3165atm;
        this.m = c3105asf;
        this.l = pinotDeviceResolution;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2129aaS.b.a(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<d> e() {
        return C8953gT.c(C2133aaW.d.a, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2840anf.c.a()).d();
    }

    /* renamed from: o.Yy$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8999hM.c {
        private final a c;

        public final a c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.c, ((d) obj).c);
        }

        public int hashCode() {
            a aVar = this.c;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            a aVar = this.c;
            return "Data(pinotEntitySearchPage=" + aVar + ")";
        }

        public d(a aVar) {
            this.c = aVar;
        }
    }

    /* renamed from: o.Yy$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final c a;
        private final String e;

        public final c c() {
            return this.a;
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
                return C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c(this.a, aVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            c cVar = this.a;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            c cVar = this.a;
            return "PinotEntitySearchPage(__typename=" + str + ", onPinotSectionListPage=" + cVar + ")";
        }

        public a(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = cVar;
        }
    }

    /* renamed from: o.Yy$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final C2428afr b;

        public final C2428afr a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.b, ((c) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            C2428afr c2428afr = this.b;
            return "OnPinotSectionListPage(irmaPageSection=" + c2428afr + ")";
        }

        public c(C2428afr c2428afr) {
            C8632dsu.c((Object) c2428afr, "");
            this.b = c2428afr;
        }
    }

    /* renamed from: o.Yy$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
