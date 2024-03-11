package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2167abD;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class YR implements InterfaceC8999hM<c> {
    public static final b b = new b(null);
    private final C3165atm a;
    private final String c;
    private final Integer d;
    private final String e;
    private final boolean f;
    private final C2865aoD g;
    private final C2865aoD h;
    private final C2865aoD i;
    private final Integer j;
    private final C3105asf k;
    private final C2865aoD m;
    private final String n;

    /* renamed from: o  reason: collision with root package name */
    private final String f13412o;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "cd925059-d218-40f4-b0a9-e0f95db961f4";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YR) {
            YR yr = (YR) obj;
            return C8632dsu.c((Object) this.c, (Object) yr.c) && C8632dsu.c((Object) this.n, (Object) yr.n) && C8632dsu.c((Object) this.f13412o, (Object) yr.f13412o) && C8632dsu.c(this.j, yr.j) && C8632dsu.c((Object) this.e, (Object) yr.e) && C8632dsu.c(this.d, yr.d) && C8632dsu.c(this.h, yr.h) && C8632dsu.c(this.i, yr.i) && C8632dsu.c(this.m, yr.m) && C8632dsu.c(this.g, yr.g) && C8632dsu.c(this.a, yr.a) && C8632dsu.c(this.k, yr.k);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "PinotEntitySearchPageOption5";
    }

    public final String g() {
        return this.c;
    }

    public final C3165atm h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        int hashCode2 = this.n.hashCode();
        String str = this.f13412o;
        int hashCode3 = str == null ? 0 : str.hashCode();
        Integer num = this.j;
        int hashCode4 = num == null ? 0 : num.hashCode();
        String str2 = this.e;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.d;
        int hashCode6 = num2 == null ? 0 : num2.hashCode();
        int hashCode7 = this.h.hashCode();
        int hashCode8 = this.i.hashCode();
        int hashCode9 = this.m.hashCode();
        int hashCode10 = this.g.hashCode();
        C3165atm c3165atm = this.a;
        int hashCode11 = c3165atm == null ? 0 : c3165atm.hashCode();
        C3105asf c3105asf = this.k;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (c3105asf != null ? c3105asf.hashCode() : 0);
    }

    public final String i() {
        return this.e;
    }

    public final Integer j() {
        return this.d;
    }

    public final C2865aoD k() {
        return this.h;
    }

    public final C2865aoD l() {
        return this.i;
    }

    public final C2865aoD m() {
        return this.m;
    }

    public final Integer n() {
        return this.j;
    }

    public final C2865aoD o() {
        return this.g;
    }

    public final C3105asf p() {
        return this.k;
    }

    public final String q() {
        return this.n;
    }

    public final String s() {
        return this.f13412o;
    }

    public String toString() {
        String str = this.c;
        String str2 = this.n;
        String str3 = this.f13412o;
        Integer num = this.j;
        String str4 = this.e;
        Integer num2 = this.d;
        C2865aoD c2865aoD = this.h;
        C2865aoD c2865aoD2 = this.i;
        C2865aoD c2865aoD3 = this.m;
        C2865aoD c2865aoD4 = this.g;
        C3165atm c3165atm = this.a;
        C3105asf c3105asf = this.k;
        return "PinotEntitySearchPageOption5Query(entityId=" + str + ", sessionId=" + str2 + ", sectionCursor=" + str3 + ", first_sections=" + num + ", entityCursor=" + str4 + ", first_entities=" + num2 + ", imageParamsForLocalizedBoxart=" + c2865aoD + ", imageParamsForGamesIcon=" + c2865aoD2 + ", imageParamsForPQS=" + c2865aoD3 + ", imageParamsForCreatorHome=" + c2865aoD4 + ", clientCapabilities=" + c3165atm + ", pageCapabilities=" + c3105asf + ")";
    }

    public YR(String str, String str2, String str3, Integer num, String str4, Integer num2, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3, C2865aoD c2865aoD4, C3165atm c3165atm, C3105asf c3105asf) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) c2865aoD, "");
        C8632dsu.c((Object) c2865aoD2, "");
        C8632dsu.c((Object) c2865aoD3, "");
        C8632dsu.c((Object) c2865aoD4, "");
        this.c = str;
        this.n = str2;
        this.f13412o = str3;
        this.j = num;
        this.e = str4;
        this.d = num2;
        this.h = c2865aoD;
        this.i = c2865aoD2;
        this.m = c2865aoD3;
        this.g = c2865aoD4;
        this.a = c3165atm;
        this.k = c3105asf;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2169abF.d.e(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<c> e() {
        return C8953gT.c(C2167abD.a.c, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2854ant.a.e()).d();
    }

    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8999hM.c {
        private final a a;

        public final a b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            a aVar = this.a;
            return "Data(pinotEntitySearchPage=" + aVar + ")";
        }

        public c(a aVar) {
            this.a = aVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final e b;

        public final e b() {
            return this.b;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c(this.b, aVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            e eVar = this.b;
            return (hashCode * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            e eVar = this.b;
            return "PinotEntitySearchPage(__typename=" + str + ", onPinotSectionListPage=" + eVar + ")";
        }

        public a(String str, e eVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.b = eVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {
        private final C2508ahR c;

        public final C2508ahR a() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.c, ((e) obj).c);
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            C2508ahR c2508ahR = this.c;
            return "OnPinotSectionListPage(pinotPageSectionFragment=" + c2508ahR + ")";
        }

        public e(C2508ahR c2508ahR) {
            C8632dsu.c((Object) c2508ahR, "");
            this.c = c2508ahR;
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
