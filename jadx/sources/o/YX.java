package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2177abN;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class YX implements InterfaceC8999hM<d> {
    public static final e d = new e(null);
    private final Integer a;
    private final String b;
    private final boolean c;
    private final Integer e;
    private final C2865aoD f;
    private final C2865aoD g;
    private final C2865aoD h;
    private final C3166atn i;
    private final String j;
    private final AbstractC8997hK<Boolean> k;
    private final String l;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "13c8b002-6aa7-4010-821c-50f7d677ddb5";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YX) {
            YX yx = (YX) obj;
            return C8632dsu.c((Object) this.l, (Object) yx.l) && C8632dsu.c((Object) this.j, (Object) yx.j) && C8632dsu.c(this.a, yx.a) && C8632dsu.c((Object) this.b, (Object) yx.b) && C8632dsu.c(this.e, yx.e) && C8632dsu.c(this.i, yx.i) && C8632dsu.c(this.f, yx.f) && C8632dsu.c(this.h, yx.h) && C8632dsu.c(this.g, yx.g) && C8632dsu.c(this.k, yx.k);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "PinotPreQuerySearch";
    }

    public final C2865aoD g() {
        return this.g;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = this.l.hashCode();
        String str = this.j;
        int hashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.a;
        int hashCode3 = num == null ? 0 : num.hashCode();
        String str2 = this.b;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.e;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + this.i.hashCode()) * 31) + this.f.hashCode()) * 31) + this.h.hashCode()) * 31) + this.g.hashCode()) * 31) + this.k.hashCode();
    }

    public final Integer i() {
        return this.a;
    }

    public final Integer j() {
        return this.e;
    }

    public final C3166atn k() {
        return this.i;
    }

    public final String l() {
        return this.j;
    }

    public final C2865aoD m() {
        return this.f;
    }

    public final String n() {
        return this.l;
    }

    public final C2865aoD o() {
        return this.h;
    }

    public final AbstractC8997hK<Boolean> r() {
        return this.k;
    }

    public String toString() {
        String str = this.l;
        String str2 = this.j;
        Integer num = this.a;
        String str3 = this.b;
        Integer num2 = this.e;
        C3166atn c3166atn = this.i;
        C2865aoD c2865aoD = this.f;
        C2865aoD c2865aoD2 = this.h;
        C2865aoD c2865aoD3 = this.g;
        AbstractC8997hK<Boolean> abstractC8997hK = this.k;
        return "PinotPreQuerySearchQuery(sessionId=" + str + ", sectionCursor=" + str2 + ", first_sections=" + num + ", entityCursor=" + str3 + ", first_entities=" + num2 + ", imageParamsForLocalizedBoxart=" + c3166atn + ", imageParamsForGamesIcon=" + c2865aoD + ", imageParamsForPQS=" + c2865aoD2 + ", imageParamsForCreatorHome=" + c2865aoD3 + ", supportIrmaEntity=" + abstractC8997hK + ")";
    }

    public YX(String str, String str2, Integer num, String str3, Integer num2, C3166atn c3166atn, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3, AbstractC8997hK<Boolean> abstractC8997hK) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c3166atn, "");
        C8632dsu.c((Object) c2865aoD, "");
        C8632dsu.c((Object) c2865aoD2, "");
        C8632dsu.c((Object) c2865aoD3, "");
        C8632dsu.c((Object) abstractC8997hK, "");
        this.l = str;
        this.j = str2;
        this.a = num;
        this.b = str3;
        this.e = num2;
        this.i = c3166atn;
        this.f = c2865aoD;
        this.h = c2865aoD2;
        this.g = c2865aoD3;
        this.k = abstractC8997hK;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2179abP.a.d(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<d> e() {
        return C8953gT.c(C2177abN.e.d, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2858anx.c.d()).d();
    }

    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8999hM.c {
        private final b b;

        public final b c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.b, ((d) obj).b);
        }

        public int hashCode() {
            b bVar = this.b;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            b bVar = this.b;
            return "Data(pinotPreQuerySearchPage=" + bVar + ")";
        }

        public d(b bVar) {
            this.b = bVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final c e;

        public final c b() {
            return this.e;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c(this.e, bVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            c cVar = this.e;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            c cVar = this.e;
            return "PinotPreQuerySearchPage(__typename=" + str + ", onPinotSectionListPage=" + cVar + ")";
        }

        public b(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.e = cVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private final C2500ahJ d;

        public final C2500ahJ b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.d, ((c) obj).d);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            C2500ahJ c2500ahJ = this.d;
            return "OnPinotSectionListPage(pinotPageFragment=" + c2500ahJ + ")";
        }

        public c(C2500ahJ c2500ahJ) {
            C8632dsu.c((Object) c2500ahJ, "");
            this.d = c2500ahJ;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }
}
