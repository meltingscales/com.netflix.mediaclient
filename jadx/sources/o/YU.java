package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2171abH;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class YU implements InterfaceC8999hM<c> {
    public static final d b = new d(null);
    private final C3165atm a;
    private final String c;
    private final Integer d;
    private final Integer e;
    private final C2865aoD f;
    private final boolean g;
    private final C2865aoD h;
    private final C2865aoD i;
    private final C2865aoD j;
    private final String k;
    private final String l;
    private final C3105asf m;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "02db377a-6c8e-4c14-b397-781919c1d557";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YU) {
            YU yu = (YU) obj;
            return C8632dsu.c((Object) this.l, (Object) yu.l) && C8632dsu.c((Object) this.k, (Object) yu.k) && C8632dsu.c(this.d, yu.d) && C8632dsu.c((Object) this.c, (Object) yu.c) && C8632dsu.c(this.e, yu.e) && C8632dsu.c(this.h, yu.h) && C8632dsu.c(this.f, yu.f) && C8632dsu.c(this.j, yu.j) && C8632dsu.c(this.i, yu.i) && C8632dsu.c(this.a, yu.a) && C8632dsu.c(this.m, yu.m);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "PinotPreQuerySearchOption5";
    }

    public final Integer g() {
        return this.e;
    }

    public final Integer h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.l.hashCode();
        String str = this.k;
        int hashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.d;
        int hashCode3 = num == null ? 0 : num.hashCode();
        String str2 = this.c;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.e;
        int hashCode5 = num2 == null ? 0 : num2.hashCode();
        int hashCode6 = this.h.hashCode();
        int hashCode7 = this.f.hashCode();
        int hashCode8 = this.j.hashCode();
        int hashCode9 = this.i.hashCode();
        C3165atm c3165atm = this.a;
        int hashCode10 = c3165atm == null ? 0 : c3165atm.hashCode();
        C3105asf c3105asf = this.m;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (c3105asf != null ? c3105asf.hashCode() : 0);
    }

    public final String i() {
        return this.c;
    }

    public final C3165atm j() {
        return this.a;
    }

    public final C2865aoD k() {
        return this.h;
    }

    public final C2865aoD l() {
        return this.f;
    }

    public final C2865aoD m() {
        return this.i;
    }

    public final C3105asf n() {
        return this.m;
    }

    public final C2865aoD o() {
        return this.j;
    }

    public final String p() {
        return this.k;
    }

    public final String r() {
        return this.l;
    }

    public String toString() {
        String str = this.l;
        String str2 = this.k;
        Integer num = this.d;
        String str3 = this.c;
        Integer num2 = this.e;
        C2865aoD c2865aoD = this.h;
        C2865aoD c2865aoD2 = this.f;
        C2865aoD c2865aoD3 = this.j;
        C2865aoD c2865aoD4 = this.i;
        C3165atm c3165atm = this.a;
        C3105asf c3105asf = this.m;
        return "PinotPreQuerySearchOption5Query(sessionId=" + str + ", sectionCursor=" + str2 + ", first_sections=" + num + ", entityCursor=" + str3 + ", first_entities=" + num2 + ", imageParamsForLocalizedBoxart=" + c2865aoD + ", imageParamsForGamesIcon=" + c2865aoD2 + ", imageParamsForPQS=" + c2865aoD3 + ", imageParamsForCreatorHome=" + c2865aoD4 + ", clientCapabilities=" + c3165atm + ", pageCapabilities=" + c3105asf + ")";
    }

    public YU(String str, String str2, Integer num, String str3, Integer num2, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3, C2865aoD c2865aoD4, C3165atm c3165atm, C3105asf c3105asf) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2865aoD, "");
        C8632dsu.c((Object) c2865aoD2, "");
        C8632dsu.c((Object) c2865aoD3, "");
        C8632dsu.c((Object) c2865aoD4, "");
        this.l = str;
        this.k = str2;
        this.d = num;
        this.c = str3;
        this.e = num2;
        this.h = c2865aoD;
        this.f = c2865aoD2;
        this.j = c2865aoD3;
        this.i = c2865aoD4;
        this.a = c3165atm;
        this.m = c3105asf;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2178abO.b.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<c> e() {
        return C8953gT.c(C2171abH.d.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2810anB.e.a()).d();
    }

    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8999hM.c {
        private final e e;

        public final e d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.e, ((c) obj).e);
        }

        public int hashCode() {
            e eVar = this.e;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public String toString() {
            e eVar = this.e;
            return "Data(pinotPreQuerySearchPage=" + eVar + ")";
        }

        public c(e eVar) {
            this.e = eVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        private final a c;
        private final String d;

        public final a b() {
            return this.c;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && C8632dsu.c(this.c, eVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            a aVar = this.c;
            return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.d;
            a aVar = this.c;
            return "PinotPreQuerySearchPage(__typename=" + str + ", onPinotSectionListPage=" + aVar + ")";
        }

        public e(String str, a aVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = aVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final C2508ahR e;

        public final C2508ahR c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.e, ((a) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            C2508ahR c2508ahR = this.e;
            return "OnPinotSectionListPage(pinotPageSectionFragment=" + c2508ahR + ")";
        }

        public a(C2508ahR c2508ahR) {
            C8632dsu.c((Object) c2508ahR, "");
            this.e = c2508ahR;
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
