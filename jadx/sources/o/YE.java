package o;

import com.netflix.mediaclient.graphql.models.type.PinotDeviceResolution;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2190aba;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class YE implements InterfaceC8999hM<e> {
    public static final b a = new b(null);
    private final String b;
    private final C3165atm c;
    private final Integer d;
    private final Integer e;
    private final C2865aoD f;
    private final boolean g;
    private final C2865aoD h;
    private final C2865aoD i;
    private final C2865aoD j;
    private final String k;
    private final PinotDeviceResolution m;
    private final C3105asf n;

    /* renamed from: o  reason: collision with root package name */
    private final String f13407o;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "d75b70ee-c6d8-4371-8beb-a1e94e5c973f";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YE) {
            YE ye = (YE) obj;
            return C8632dsu.c((Object) this.f13407o, (Object) ye.f13407o) && C8632dsu.c((Object) this.k, (Object) ye.k) && C8632dsu.c(this.e, ye.e) && C8632dsu.c((Object) this.b, (Object) ye.b) && C8632dsu.c(this.d, ye.d) && C8632dsu.c(this.h, ye.h) && C8632dsu.c(this.f, ye.f) && C8632dsu.c(this.j, ye.j) && C8632dsu.c(this.i, ye.i) && C8632dsu.c(this.c, ye.c) && C8632dsu.c(this.n, ye.n) && this.m == ye.m;
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "IrmaPreQuerySearch";
    }

    public final C3165atm g() {
        return this.c;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = this.f13407o.hashCode();
        String str = this.k;
        int hashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.e;
        int hashCode3 = num == null ? 0 : num.hashCode();
        String str2 = this.b;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.d;
        int hashCode5 = num2 == null ? 0 : num2.hashCode();
        int hashCode6 = this.h.hashCode();
        int hashCode7 = this.f.hashCode();
        int hashCode8 = this.j.hashCode();
        int hashCode9 = this.i.hashCode();
        C3165atm c3165atm = this.c;
        int hashCode10 = c3165atm == null ? 0 : c3165atm.hashCode();
        C3105asf c3105asf = this.n;
        int hashCode11 = c3105asf == null ? 0 : c3105asf.hashCode();
        PinotDeviceResolution pinotDeviceResolution = this.m;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (pinotDeviceResolution != null ? pinotDeviceResolution.hashCode() : 0);
    }

    public final Integer i() {
        return this.d;
    }

    public final Integer j() {
        return this.e;
    }

    public final C2865aoD k() {
        return this.i;
    }

    public final C2865aoD l() {
        return this.f;
    }

    public final C3105asf m() {
        return this.n;
    }

    public final C2865aoD n() {
        return this.h;
    }

    public final C2865aoD o() {
        return this.j;
    }

    public final PinotDeviceResolution q() {
        return this.m;
    }

    public final String r() {
        return this.f13407o;
    }

    public final String s() {
        return this.k;
    }

    public String toString() {
        String str = this.f13407o;
        String str2 = this.k;
        Integer num = this.e;
        String str3 = this.b;
        Integer num2 = this.d;
        C2865aoD c2865aoD = this.h;
        C2865aoD c2865aoD2 = this.f;
        C2865aoD c2865aoD3 = this.j;
        C2865aoD c2865aoD4 = this.i;
        C3165atm c3165atm = this.c;
        C3105asf c3105asf = this.n;
        PinotDeviceResolution pinotDeviceResolution = this.m;
        return "IrmaPreQuerySearchQuery(sessionId=" + str + ", sectionCursor=" + str2 + ", first_sections=" + num + ", entityCursor=" + str3 + ", first_entities=" + num2 + ", imageParamsForLocalizedBoxart=" + c2865aoD + ", imageParamsForGamesIcon=" + c2865aoD2 + ", imageParamsForPQS=" + c2865aoD3 + ", imageParamsForCreatorHome=" + c2865aoD4 + ", clientCapabilities=" + c3165atm + ", pageCapabilities=" + c3105asf + ", resolution=" + pinotDeviceResolution + ")";
    }

    public YE(String str, String str2, Integer num, String str3, Integer num2, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3, C2865aoD c2865aoD4, C3165atm c3165atm, C3105asf c3105asf, PinotDeviceResolution pinotDeviceResolution) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2865aoD, "");
        C8632dsu.c((Object) c2865aoD2, "");
        C8632dsu.c((Object) c2865aoD3, "");
        C8632dsu.c((Object) c2865aoD4, "");
        this.f13407o = str;
        this.k = str2;
        this.e = num;
        this.b = str3;
        this.d = num2;
        this.h = c2865aoD;
        this.f = c2865aoD2;
        this.j = c2865aoD3;
        this.i = c2865aoD4;
        this.c = c3165atm;
        this.n = c3105asf;
        this.m = pinotDeviceResolution;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2191abb.d.a(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(C2190aba.d.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2841ang.c.b()).d();
    }

    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8999hM.c {
        private final a d;

        public final a a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.d, ((e) obj).d);
        }

        public int hashCode() {
            a aVar = this.d;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            a aVar = this.d;
            return "Data(pinotPreQuerySearchPage=" + aVar + ")";
        }

        public e(a aVar) {
            this.d = aVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final d b;
        private final String e;

        public final d b() {
            return this.b;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c(this.b, aVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            d dVar = this.b;
            return (hashCode * 31) + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            d dVar = this.b;
            return "PinotPreQuerySearchPage(__typename=" + str + ", onPinotSectionListPage=" + dVar + ")";
        }

        public a(String str, d dVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = dVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        private final C2428afr e;

        public final C2428afr e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.e, ((d) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            C2428afr c2428afr = this.e;
            return "OnPinotSectionListPage(irmaPageSection=" + c2428afr + ")";
        }

        public d(C2428afr c2428afr) {
            C8632dsu.c((Object) c2428afr, "");
            this.e = c2428afr;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
