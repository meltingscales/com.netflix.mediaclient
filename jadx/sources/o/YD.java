package o;

import com.netflix.mediaclient.graphql.models.type.PinotDeviceResolution;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2195abf;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class YD implements InterfaceC8999hM<b> {
    public static final d e = new d(null);
    private final Integer a;
    private final C3165atm b;
    private final Integer c;
    private final String d;
    private final C2865aoD f;
    private final C2865aoD g;
    private final boolean h;
    private final C2865aoD i;
    private final C2865aoD j;
    private final PinotDeviceResolution k;
    private final String l;
    private final String m;
    private final String n;

    /* renamed from: o  reason: collision with root package name */
    private final C3105asf f13406o;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "72b9995e-fd35-4be5-8baf-8ed5f6bccaf3";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YD) {
            YD yd = (YD) obj;
            return C8632dsu.c((Object) this.m, (Object) yd.m) && C8632dsu.c((Object) this.n, (Object) yd.n) && C8632dsu.c((Object) this.l, (Object) yd.l) && C8632dsu.c(this.a, yd.a) && C8632dsu.c((Object) this.d, (Object) yd.d) && C8632dsu.c(this.c, yd.c) && C8632dsu.c(this.f, yd.f) && C8632dsu.c(this.j, yd.j) && C8632dsu.c(this.i, yd.i) && C8632dsu.c(this.g, yd.g) && C8632dsu.c(this.b, yd.b) && C8632dsu.c(this.f13406o, yd.f13406o) && this.k == yd.k;
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "IrmaQuerySearch";
    }

    public final Integer g() {
        return this.a;
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.m.hashCode();
        int hashCode2 = this.n.hashCode();
        String str = this.l;
        int hashCode3 = str == null ? 0 : str.hashCode();
        Integer num = this.a;
        int hashCode4 = num == null ? 0 : num.hashCode();
        String str2 = this.d;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.c;
        int hashCode6 = num2 == null ? 0 : num2.hashCode();
        int hashCode7 = this.f.hashCode();
        int hashCode8 = this.j.hashCode();
        int hashCode9 = this.i.hashCode();
        int hashCode10 = this.g.hashCode();
        C3165atm c3165atm = this.b;
        int hashCode11 = c3165atm == null ? 0 : c3165atm.hashCode();
        C3105asf c3105asf = this.f13406o;
        int hashCode12 = c3105asf == null ? 0 : c3105asf.hashCode();
        PinotDeviceResolution pinotDeviceResolution = this.k;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (pinotDeviceResolution != null ? pinotDeviceResolution.hashCode() : 0);
    }

    public final Integer i() {
        return this.c;
    }

    public final C3165atm j() {
        return this.b;
    }

    public final C2865aoD k() {
        return this.g;
    }

    public final C2865aoD l() {
        return this.f;
    }

    public final C2865aoD m() {
        return this.j;
    }

    public final C2865aoD n() {
        return this.i;
    }

    public final C3105asf o() {
        return this.f13406o;
    }

    public final String p() {
        return this.l;
    }

    public final String r() {
        return this.n;
    }

    public final String s() {
        return this.m;
    }

    public final PinotDeviceResolution t() {
        return this.k;
    }

    public String toString() {
        String str = this.m;
        String str2 = this.n;
        String str3 = this.l;
        Integer num = this.a;
        String str4 = this.d;
        Integer num2 = this.c;
        C2865aoD c2865aoD = this.f;
        C2865aoD c2865aoD2 = this.j;
        C2865aoD c2865aoD3 = this.i;
        C2865aoD c2865aoD4 = this.g;
        C3165atm c3165atm = this.b;
        C3105asf c3105asf = this.f13406o;
        PinotDeviceResolution pinotDeviceResolution = this.k;
        return "IrmaQuerySearchQuery(query=" + str + ", sessionId=" + str2 + ", sectionCursor=" + str3 + ", first_sections=" + num + ", entityCursor=" + str4 + ", first_entities=" + num2 + ", imageParamsForLocalizedBoxart=" + c2865aoD + ", imageParamsForGamesIcon=" + c2865aoD2 + ", imageParamsForPQS=" + c2865aoD3 + ", imageParamsForCreatorHome=" + c2865aoD4 + ", clientCapabilities=" + c3165atm + ", pageCapabilities=" + c3105asf + ", resolution=" + pinotDeviceResolution + ")";
    }

    public YD(String str, String str2, String str3, Integer num, String str4, Integer num2, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3, C2865aoD c2865aoD4, C3165atm c3165atm, C3105asf c3105asf, PinotDeviceResolution pinotDeviceResolution) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) c2865aoD, "");
        C8632dsu.c((Object) c2865aoD2, "");
        C8632dsu.c((Object) c2865aoD3, "");
        C8632dsu.c((Object) c2865aoD4, "");
        this.m = str;
        this.n = str2;
        this.l = str3;
        this.a = num;
        this.d = str4;
        this.c = num2;
        this.f = c2865aoD;
        this.j = c2865aoD2;
        this.i = c2865aoD3;
        this.g = c2865aoD4;
        this.b = c3165atm;
        this.f13406o = c3105asf;
        this.k = pinotDeviceResolution;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2196abg.d.e(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<b> e() {
        return C8953gT.c(C2195abf.b.a, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2838and.d.c()).d();
    }

    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8999hM.c {
        private final e a;

        public final e a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            e eVar = this.a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public String toString() {
            e eVar = this.a;
            return "Data(pinotQuerySearchPage=" + eVar + ")";
        }

        public b(e eVar) {
            this.a = eVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        private final String b;
        private final c e;

        public final c b() {
            return this.e;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            c cVar = this.e;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.b;
            c cVar = this.e;
            return "PinotQuerySearchPage(__typename=" + str + ", onPinotSectionListPage=" + cVar + ")";
        }

        public e(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = cVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private final C2428afr e;

        public final C2428afr c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.e, ((c) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            C2428afr c2428afr = this.e;
            return "OnPinotSectionListPage(irmaPageSection=" + c2428afr + ")";
        }

        public c(C2428afr c2428afr) {
            C8632dsu.c((Object) c2428afr, "");
            this.e = c2428afr;
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
