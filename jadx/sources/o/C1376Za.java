package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2182abS;
import o.C9018hf;
import o.InterfaceC8999hM;

/* renamed from: o.Za  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1376Za implements InterfaceC8999hM<a> {
    public static final c e = new c(null);
    private final String a;
    private final Integer b;
    private final boolean c;
    private final Integer d;
    private final C2865aoD f;
    private final C2865aoD g;
    private final C3166atn h;
    private final C2865aoD i;
    private final String j;
    private final String n;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "6bab979a-30f0-4695-9f50-5cb1c18ca52b";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1376Za) {
            C1376Za c1376Za = (C1376Za) obj;
            return C8632dsu.c((Object) this.j, (Object) c1376Za.j) && C8632dsu.c((Object) this.n, (Object) c1376Za.n) && C8632dsu.c(this.d, c1376Za.d) && C8632dsu.c((Object) this.a, (Object) c1376Za.a) && C8632dsu.c(this.b, c1376Za.b) && C8632dsu.c(this.h, c1376Za.h) && C8632dsu.c(this.f, c1376Za.f) && C8632dsu.c(this.g, c1376Za.g) && C8632dsu.c(this.i, c1376Za.i);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "PinotQuerySearchPage";
    }

    public final C2865aoD g() {
        return this.i;
    }

    public final Integer h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.j.hashCode();
        String str = this.n;
        int hashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.d;
        int hashCode3 = num == null ? 0 : num.hashCode();
        String str2 = this.a;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.b;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + this.h.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.i.hashCode();
    }

    public final String i() {
        return this.a;
    }

    public final Integer j() {
        return this.b;
    }

    public final String k() {
        return this.n;
    }

    public final C2865aoD l() {
        return this.f;
    }

    public final String m() {
        return this.j;
    }

    public final C2865aoD n() {
        return this.g;
    }

    public final C3166atn o() {
        return this.h;
    }

    public String toString() {
        String str = this.j;
        String str2 = this.n;
        Integer num = this.d;
        String str3 = this.a;
        Integer num2 = this.b;
        C3166atn c3166atn = this.h;
        C2865aoD c2865aoD = this.f;
        C2865aoD c2865aoD2 = this.g;
        C2865aoD c2865aoD3 = this.i;
        return "PinotQuerySearchPageQuery(pageId=" + str + ", sectionCursor=" + str2 + ", first_sections=" + num + ", entityCursor=" + str3 + ", first_entities=" + num2 + ", imageParamsForLocalizedBoxart=" + c3166atn + ", imageParamsForGamesIcon=" + c2865aoD + ", imageParamsForPQS=" + c2865aoD2 + ", imageParamsForCreatorHome=" + c2865aoD3 + ")";
    }

    public C1376Za(String str, String str2, Integer num, String str3, Integer num2, C3166atn c3166atn, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c3166atn, "");
        C8632dsu.c((Object) c2865aoD, "");
        C8632dsu.c((Object) c2865aoD2, "");
        C8632dsu.c((Object) c2865aoD3, "");
        this.j = str;
        this.n = str2;
        this.d = num;
        this.a = str3;
        this.b = num2;
        this.h = c3166atn;
        this.f = c2865aoD;
        this.g = c2865aoD2;
        this.i = c2865aoD3;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2183abT.a.a(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<a> e() {
        return C8953gT.c(C2182abS.e.c, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2814anF.b.c()).d();
    }

    /* renamed from: o.Za$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8999hM.c {
        private final e a;

        public final e a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.a, ((a) obj).a);
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
            return "Data(fetchPinotSearchPage=" + eVar + ")";
        }

        public a(e eVar) {
            this.a = eVar;
        }
    }

    /* renamed from: o.Za$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final d e;

        public final d a() {
            return this.e;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            d dVar = this.e;
            return (hashCode * 31) + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            d dVar = this.e;
            return "FetchPinotSearchPage(__typename=" + str + ", onPinotSectionListPage=" + dVar + ")";
        }

        public e(String str, d dVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.e = dVar;
        }
    }

    /* renamed from: o.Za$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final C2500ahJ d;

        public final C2500ahJ c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.d, ((d) obj).d);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            C2500ahJ c2500ahJ = this.d;
            return "OnPinotSectionListPage(pinotPageFragment=" + c2500ahJ + ")";
        }

        public d(C2500ahJ c2500ahJ) {
            C8632dsu.c((Object) c2500ahJ, "");
            this.d = c2500ahJ;
        }
    }

    /* renamed from: o.Za$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
