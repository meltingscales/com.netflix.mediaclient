package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2135aaY;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class YC implements InterfaceC8999hM<a> {
    public static final b b = new b(null);
    private final Integer a;
    private final String c;
    private final boolean d;
    private final Integer e;
    private final String f;
    private final C2865aoD g;
    private final C2865aoD h;
    private final C2865aoD i;
    private final C2865aoD j;
    private final String m;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "f2b1dddf-13ff-4a18-ba3b-e32ff094ccc7";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YC) {
            YC yc = (YC) obj;
            return C8632dsu.c((Object) this.f, (Object) yc.f) && C8632dsu.c((Object) this.m, (Object) yc.m) && C8632dsu.c(this.e, yc.e) && C8632dsu.c((Object) this.c, (Object) yc.c) && C8632dsu.c(this.a, yc.a) && C8632dsu.c(this.g, yc.g) && C8632dsu.c(this.j, yc.j) && C8632dsu.c(this.h, yc.h) && C8632dsu.c(this.i, yc.i);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "IrmaQuerySearchPage";
    }

    public final C2865aoD g() {
        return this.i;
    }

    public final Integer h() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = this.f.hashCode();
        String str = this.m;
        int hashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.e;
        int hashCode3 = num == null ? 0 : num.hashCode();
        String str2 = this.c;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.a;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + this.g.hashCode()) * 31) + this.j.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String i() {
        return this.c;
    }

    public final Integer j() {
        return this.a;
    }

    public final C2865aoD k() {
        return this.g;
    }

    public final String l() {
        return this.f;
    }

    public final C2865aoD m() {
        return this.j;
    }

    public final String n() {
        return this.m;
    }

    public final C2865aoD o() {
        return this.h;
    }

    public String toString() {
        String str = this.f;
        String str2 = this.m;
        Integer num = this.e;
        String str3 = this.c;
        Integer num2 = this.a;
        C2865aoD c2865aoD = this.g;
        C2865aoD c2865aoD2 = this.j;
        C2865aoD c2865aoD3 = this.h;
        C2865aoD c2865aoD4 = this.i;
        return "IrmaQuerySearchPageQuery(pageId=" + str + ", sectionCursor=" + str2 + ", first_sections=" + num + ", entityCursor=" + str3 + ", first_entities=" + num2 + ", imageParamsForLocalizedBoxart=" + c2865aoD + ", imageParamsForGamesIcon=" + c2865aoD2 + ", imageParamsForPQS=" + c2865aoD3 + ", imageParamsForCreatorHome=" + c2865aoD4 + ")";
    }

    public YC(String str, String str2, Integer num, String str3, Integer num2, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3, C2865aoD c2865aoD4) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2865aoD, "");
        C8632dsu.c((Object) c2865aoD2, "");
        C8632dsu.c((Object) c2865aoD3, "");
        C8632dsu.c((Object) c2865aoD4, "");
        this.f = str;
        this.m = str2;
        this.e = num;
        this.c = str3;
        this.a = num2;
        this.g = c2865aoD;
        this.j = c2865aoD2;
        this.h = c2865aoD3;
        this.i = c2865aoD4;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2192abc.c.d(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<a> e() {
        return C8953gT.c(C2135aaY.b.d, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2839ane.b.a()).d();
    }

    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8999hM.c {
        private final d d;

        public final d e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.d, ((a) obj).d);
        }

        public int hashCode() {
            d dVar = this.d;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            d dVar = this.d;
            return "Data(pinotPageById=" + dVar + ")";
        }

        public a(d dVar) {
            this.d = dVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        private final e a;
        private final String d;

        public final String b() {
            return this.d;
        }

        public final e d() {
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
            e eVar = this.a;
            return (hashCode * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.d;
            e eVar = this.a;
            return "PinotPageById(__typename=" + str + ", onPinotSectionListPage=" + eVar + ")";
        }

        public d(String str, e eVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.a = eVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        private final C2428afr b;

        public final C2428afr b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.b, ((e) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            C2428afr c2428afr = this.b;
            return "OnPinotSectionListPage(irmaPageSection=" + c2428afr + ")";
        }

        public e(C2428afr c2428afr) {
            C8632dsu.c((Object) c2428afr, "");
            this.b = c2428afr;
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
