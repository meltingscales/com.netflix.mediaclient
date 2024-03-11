package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2174abK;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class YS implements InterfaceC8999hM<a> {
    public static final b c = new b(null);
    private final Integer a;
    private final Integer b;
    private final String d;
    private final String e;
    private final C3166atn f;
    private final C2865aoD g;
    private final C2865aoD h;
    private final boolean i;
    private final C2865aoD j;
    private final String k;
    private final String m;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "f33b810d-0329-48ef-9a47-338ba4f3b1c8";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YS) {
            YS ys = (YS) obj;
            return C8632dsu.c((Object) this.d, (Object) ys.d) && C8632dsu.c((Object) this.k, (Object) ys.k) && C8632dsu.c((Object) this.m, (Object) ys.m) && C8632dsu.c(this.b, ys.b) && C8632dsu.c((Object) this.e, (Object) ys.e) && C8632dsu.c(this.a, ys.a) && C8632dsu.c(this.f, ys.f) && C8632dsu.c(this.g, ys.g) && C8632dsu.c(this.h, ys.h) && C8632dsu.c(this.j, ys.j);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "PinotEntitySearchPage";
    }

    public final Integer g() {
        return this.b;
    }

    public final String h() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        int hashCode2 = this.k.hashCode();
        String str = this.m;
        int hashCode3 = str == null ? 0 : str.hashCode();
        Integer num = this.b;
        int hashCode4 = num == null ? 0 : num.hashCode();
        String str2 = this.e;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.a;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.j.hashCode();
    }

    public final String i() {
        return this.d;
    }

    public final Integer j() {
        return this.a;
    }

    public final C3166atn k() {
        return this.f;
    }

    public final C2865aoD l() {
        return this.h;
    }

    public final C2865aoD m() {
        return this.g;
    }

    public final String n() {
        return this.m;
    }

    public final C2865aoD o() {
        return this.j;
    }

    public final String p() {
        return this.k;
    }

    public String toString() {
        String str = this.d;
        String str2 = this.k;
        String str3 = this.m;
        Integer num = this.b;
        String str4 = this.e;
        Integer num2 = this.a;
        C3166atn c3166atn = this.f;
        C2865aoD c2865aoD = this.g;
        C2865aoD c2865aoD2 = this.h;
        C2865aoD c2865aoD3 = this.j;
        return "PinotEntitySearchPageQuery(entityId=" + str + ", sessionId=" + str2 + ", sectionCursor=" + str3 + ", first_sections=" + num + ", entityCursor=" + str4 + ", first_entities=" + num2 + ", imageParamsForLocalizedBoxart=" + c3166atn + ", imageParamsForGamesIcon=" + c2865aoD + ", imageParamsForPQS=" + c2865aoD2 + ", imageParamsForCreatorHome=" + c2865aoD3 + ")";
    }

    public YS(String str, String str2, String str3, Integer num, String str4, Integer num2, C3166atn c3166atn, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) c3166atn, "");
        C8632dsu.c((Object) c2865aoD, "");
        C8632dsu.c((Object) c2865aoD2, "");
        C8632dsu.c((Object) c2865aoD3, "");
        this.d = str;
        this.k = str2;
        this.m = str3;
        this.b = num;
        this.e = str4;
        this.a = num2;
        this.f = c3166atn;
        this.g = c2865aoD;
        this.h = c2865aoD2;
        this.j = c2865aoD3;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2170abG.b.a(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<a> e() {
        return C8953gT.c(C2174abK.c.d, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2856anv.a.a()).d();
    }

    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8999hM.c {
        private final d b;

        public final d c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.b, ((a) obj).b);
        }

        public int hashCode() {
            d dVar = this.b;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            d dVar = this.b;
            return "Data(pinotEntitySearchPage=" + dVar + ")";
        }

        public a(d dVar) {
            this.b = dVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        private final c a;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final c e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c(this.a, dVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            c cVar = this.a;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.d;
            c cVar = this.a;
            return "PinotEntitySearchPage(__typename=" + str + ", onPinotSectionListPage=" + cVar + ")";
        }

        public d(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.a = cVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private final C2500ahJ e;

        public final C2500ahJ a() {
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
            C2500ahJ c2500ahJ = this.e;
            return "OnPinotSectionListPage(pinotPageFragment=" + c2500ahJ + ")";
        }

        public c(C2500ahJ c2500ahJ) {
            C8632dsu.c((Object) c2500ahJ, "");
            this.e = c2500ahJ;
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
