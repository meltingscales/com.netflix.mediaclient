package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2184abU;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class YY implements InterfaceC8999hM<d> {
    public static final c c = new c(null);
    private final Integer a;
    private final String b;
    private final Integer d;
    private final boolean e;
    private final C2865aoD f;
    private final String g;
    private final C2865aoD h;
    private final C2865aoD i;
    private final C2865aoD j;
    private final String m;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "b53c56f9-6b98-4a39-aa21-38b27f0e2b8c";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YY) {
            YY yy = (YY) obj;
            return C8632dsu.c((Object) this.g, (Object) yy.g) && C8632dsu.c((Object) this.m, (Object) yy.m) && C8632dsu.c(this.d, yy.d) && C8632dsu.c((Object) this.b, (Object) yy.b) && C8632dsu.c(this.a, yy.a) && C8632dsu.c(this.j, yy.j) && C8632dsu.c(this.f, yy.f) && C8632dsu.c(this.i, yy.i) && C8632dsu.c(this.h, yy.h);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "PinotQuerySearchPageOption5";
    }

    public final String g() {
        return this.b;
    }

    public final C2865aoD h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = this.g.hashCode();
        String str = this.m;
        int hashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.d;
        int hashCode3 = num == null ? 0 : num.hashCode();
        String str2 = this.b;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.a;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + this.j.hashCode()) * 31) + this.f.hashCode()) * 31) + this.i.hashCode()) * 31) + this.h.hashCode();
    }

    public final Integer i() {
        return this.d;
    }

    public final Integer j() {
        return this.a;
    }

    public final String k() {
        return this.m;
    }

    public final String l() {
        return this.g;
    }

    public final C2865aoD m() {
        return this.f;
    }

    public final C2865aoD n() {
        return this.i;
    }

    public final C2865aoD o() {
        return this.j;
    }

    public String toString() {
        String str = this.g;
        String str2 = this.m;
        Integer num = this.d;
        String str3 = this.b;
        Integer num2 = this.a;
        C2865aoD c2865aoD = this.j;
        C2865aoD c2865aoD2 = this.f;
        C2865aoD c2865aoD3 = this.i;
        C2865aoD c2865aoD4 = this.h;
        return "PinotQuerySearchPageOption5Query(pageId=" + str + ", sectionCursor=" + str2 + ", first_sections=" + num + ", entityCursor=" + str3 + ", first_entities=" + num2 + ", imageParamsForLocalizedBoxart=" + c2865aoD + ", imageParamsForGamesIcon=" + c2865aoD2 + ", imageParamsForPQS=" + c2865aoD3 + ", imageParamsForCreatorHome=" + c2865aoD4 + ")";
    }

    public YY(String str, String str2, Integer num, String str3, Integer num2, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3, C2865aoD c2865aoD4) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2865aoD, "");
        C8632dsu.c((Object) c2865aoD2, "");
        C8632dsu.c((Object) c2865aoD3, "");
        C8632dsu.c((Object) c2865aoD4, "");
        this.g = str;
        this.m = str2;
        this.d = num;
        this.b = str3;
        this.a = num2;
        this.j = c2865aoD;
        this.f = c2865aoD2;
        this.i = c2865aoD3;
        this.h = c2865aoD4;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2180abQ.c.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<d> e() {
        return C8953gT.c(C2184abU.b.a, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2859any.a.d()).d();
    }

    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8999hM.c {
        private final e a;

        public final e e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.a, ((d) obj).a);
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
            return "Data(pinotPageById=" + eVar + ")";
        }

        public d(e eVar) {
            this.a = eVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        private final String d;
        private final b e;

        public final b a() {
            return this.e;
        }

        public final String c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            b bVar = this.e;
            return (hashCode * 31) + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            String str = this.d;
            b bVar = this.e;
            return "PinotPageById(__typename=" + str + ", onPinotSectionListPage=" + bVar + ")";
        }

        public e(String str, b bVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = bVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private final C2508ahR d;

        public final C2508ahR c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.d, ((b) obj).d);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            C2508ahR c2508ahR = this.d;
            return "OnPinotSectionListPage(pinotPageSectionFragment=" + c2508ahR + ")";
        }

        public b(C2508ahR c2508ahR) {
            C8632dsu.c((Object) c2508ahR, "");
            this.d = c2508ahR;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
