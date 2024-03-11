package o;

import com.netflix.mediaclient.graphql.models.type.PinotUnifiedEntityKind;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import o.C2181abR;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class YW implements InterfaceC8999hM<c> {
    public static final e d = new e(null);
    private final Integer a;
    private final boolean b;
    private final Integer c;
    private final String e;
    private final C2865aoD f;
    private final String g;
    private final C2865aoD h;
    private final C3166atn i;
    private final C2865aoD j;
    private final String l;
    private final List<PinotUnifiedEntityKind> n;

    /* renamed from: o  reason: collision with root package name */
    private final String f13413o;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "407fefdf-f956-4ef9-a2b6-3ddff2e5e9f6";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YW) {
            YW yw = (YW) obj;
            return C8632dsu.c((Object) this.g, (Object) yw.g) && C8632dsu.c((Object) this.f13413o, (Object) yw.f13413o) && C8632dsu.c((Object) this.l, (Object) yw.l) && C8632dsu.c(this.c, yw.c) && C8632dsu.c((Object) this.e, (Object) yw.e) && C8632dsu.c(this.a, yw.a) && C8632dsu.c(this.i, yw.i) && C8632dsu.c(this.j, yw.j) && C8632dsu.c(this.f, yw.f) && C8632dsu.c(this.h, yw.h) && C8632dsu.c(this.n, yw.n);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "PinotQuerySearch";
    }

    public final Integer g() {
        return this.a;
    }

    public final Integer h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = this.g.hashCode();
        int hashCode2 = this.f13413o.hashCode();
        String str = this.l;
        int hashCode3 = str == null ? 0 : str.hashCode();
        Integer num = this.c;
        int hashCode4 = num == null ? 0 : num.hashCode();
        String str2 = this.e;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.a;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.f.hashCode()) * 31) + this.h.hashCode()) * 31) + this.n.hashCode();
    }

    public final String i() {
        return this.e;
    }

    public final C2865aoD j() {
        return this.h;
    }

    public final C3166atn k() {
        return this.i;
    }

    public final String l() {
        return this.l;
    }

    public final String m() {
        return this.g;
    }

    public final C2865aoD n() {
        return this.j;
    }

    public final C2865aoD o() {
        return this.f;
    }

    public final List<PinotUnifiedEntityKind> r() {
        return this.n;
    }

    public final String t() {
        return this.f13413o;
    }

    public String toString() {
        String str = this.g;
        String str2 = this.f13413o;
        String str3 = this.l;
        Integer num = this.c;
        String str4 = this.e;
        Integer num2 = this.a;
        C3166atn c3166atn = this.i;
        C2865aoD c2865aoD = this.j;
        C2865aoD c2865aoD2 = this.f;
        C2865aoD c2865aoD3 = this.h;
        List<PinotUnifiedEntityKind> list = this.n;
        return "PinotQuerySearchQuery(query=" + str + ", sessionId=" + str2 + ", sectionCursor=" + str3 + ", first_sections=" + num + ", entityCursor=" + str4 + ", first_entities=" + num2 + ", imageParamsForLocalizedBoxart=" + c3166atn + ", imageParamsForGamesIcon=" + c2865aoD + ", imageParamsForPQS=" + c2865aoD2 + ", imageParamsForCreatorHome=" + c2865aoD3 + ", supportedEntityKind=" + list + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public YW(String str, String str2, String str3, Integer num, String str4, Integer num2, C3166atn c3166atn, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3, List<? extends PinotUnifiedEntityKind> list) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) c3166atn, "");
        C8632dsu.c((Object) c2865aoD, "");
        C8632dsu.c((Object) c2865aoD2, "");
        C8632dsu.c((Object) c2865aoD3, "");
        C8632dsu.c((Object) list, "");
        this.g = str;
        this.f13413o = str2;
        this.l = str3;
        this.c = num;
        this.e = str4;
        this.a = num2;
        this.i = c3166atn;
        this.j = c2865aoD;
        this.f = c2865aoD2;
        this.h = c2865aoD3;
        this.n = list;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2186abW.d.b(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<c> e() {
        return C8953gT.c(C2181abR.e.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2813anE.b.e()).d();
    }

    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8999hM.c {
        private final b b;

        public final b b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.b, ((c) obj).b);
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
            return "Data(pinotQuerySearchPage=" + bVar + ")";
        }

        public c(b bVar) {
            this.b = bVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private final a c;
        private final String d;

        public final String d() {
            return this.d;
        }

        public final a e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.d, (Object) bVar.d) && C8632dsu.c(this.c, bVar.c);
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
            return "PinotQuerySearchPage(__typename=" + str + ", onPinotSectionListPage=" + aVar + ")";
        }

        public b(String str, a aVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = aVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final C2500ahJ c;

        public final C2500ahJ e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.c, ((a) obj).c);
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            C2500ahJ c2500ahJ = this.c;
            return "OnPinotSectionListPage(pinotPageFragment=" + c2500ahJ + ")";
        }

        public a(C2500ahJ c2500ahJ) {
            C8632dsu.c((Object) c2500ahJ, "");
            this.c = c2500ahJ;
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
