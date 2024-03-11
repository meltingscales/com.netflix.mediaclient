package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2175abL;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class YZ implements InterfaceC8999hM<e> {
    public static final d e = new d(null);
    private final String a;
    private final Integer b;
    private final C3165atm c;
    private final Integer d;
    private final boolean f;
    private final C2865aoD g;
    private final C2865aoD h;
    private final C2865aoD i;
    private final C2865aoD j;
    private final String l;
    private final String m;
    private final C3105asf n;

    /* renamed from: o  reason: collision with root package name */
    private final String f13414o;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "e39318f9-48e0-43ce-9175-310b9c3f67e1";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YZ) {
            YZ yz = (YZ) obj;
            return C8632dsu.c((Object) this.l, (Object) yz.l) && C8632dsu.c((Object) this.m, (Object) yz.m) && C8632dsu.c((Object) this.f13414o, (Object) yz.f13414o) && C8632dsu.c(this.d, yz.d) && C8632dsu.c((Object) this.a, (Object) yz.a) && C8632dsu.c(this.b, yz.b) && C8632dsu.c(this.h, yz.h) && C8632dsu.c(this.j, yz.j) && C8632dsu.c(this.i, yz.i) && C8632dsu.c(this.g, yz.g) && C8632dsu.c(this.c, yz.c) && C8632dsu.c(this.n, yz.n);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "PinotQuerySearchOption5";
    }

    public final Integer g() {
        return this.b;
    }

    public final Integer h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.l.hashCode();
        int hashCode2 = this.m.hashCode();
        String str = this.f13414o;
        int hashCode3 = str == null ? 0 : str.hashCode();
        Integer num = this.d;
        int hashCode4 = num == null ? 0 : num.hashCode();
        String str2 = this.a;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.b;
        int hashCode6 = num2 == null ? 0 : num2.hashCode();
        int hashCode7 = this.h.hashCode();
        int hashCode8 = this.j.hashCode();
        int hashCode9 = this.i.hashCode();
        int hashCode10 = this.g.hashCode();
        C3165atm c3165atm = this.c;
        int hashCode11 = c3165atm == null ? 0 : c3165atm.hashCode();
        C3105asf c3105asf = this.n;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (c3105asf != null ? c3105asf.hashCode() : 0);
    }

    public final String i() {
        return this.a;
    }

    public final C3165atm j() {
        return this.c;
    }

    public final C2865aoD k() {
        return this.j;
    }

    public final C3105asf l() {
        return this.n;
    }

    public final C2865aoD m() {
        return this.h;
    }

    public final C2865aoD n() {
        return this.g;
    }

    public final C2865aoD o() {
        return this.i;
    }

    public final String p() {
        return this.f13414o;
    }

    public final String s() {
        return this.l;
    }

    public final String t() {
        return this.m;
    }

    public String toString() {
        String str = this.l;
        String str2 = this.m;
        String str3 = this.f13414o;
        Integer num = this.d;
        String str4 = this.a;
        Integer num2 = this.b;
        C2865aoD c2865aoD = this.h;
        C2865aoD c2865aoD2 = this.j;
        C2865aoD c2865aoD3 = this.i;
        C2865aoD c2865aoD4 = this.g;
        C3165atm c3165atm = this.c;
        C3105asf c3105asf = this.n;
        return "PinotQuerySearchOption5Query(query=" + str + ", sessionId=" + str2 + ", sectionCursor=" + str3 + ", first_sections=" + num + ", entityCursor=" + str4 + ", first_entities=" + num2 + ", imageParamsForLocalizedBoxart=" + c2865aoD + ", imageParamsForGamesIcon=" + c2865aoD2 + ", imageParamsForPQS=" + c2865aoD3 + ", imageParamsForCreatorHome=" + c2865aoD4 + ", clientCapabilities=" + c3165atm + ", pageCapabilities=" + c3105asf + ")";
    }

    public YZ(String str, String str2, String str3, Integer num, String str4, Integer num2, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3, C2865aoD c2865aoD4, C3165atm c3165atm, C3105asf c3105asf) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) c2865aoD, "");
        C8632dsu.c((Object) c2865aoD2, "");
        C8632dsu.c((Object) c2865aoD3, "");
        C8632dsu.c((Object) c2865aoD4, "");
        this.l = str;
        this.m = str2;
        this.f13414o = str3;
        this.d = num;
        this.a = str4;
        this.b = num2;
        this.h = c2865aoD;
        this.j = c2865aoD2;
        this.i = c2865aoD3;
        this.g = c2865aoD4;
        this.c = c3165atm;
        this.n = c3105asf;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2176abM.a.b(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<e> e() {
        return C8953gT.c(C2175abL.c.b, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2860anz.a.b()).d();
    }

    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8999hM.c {
        private final b d;

        public final b b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.d, ((e) obj).d);
        }

        public int hashCode() {
            b bVar = this.d;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            b bVar = this.d;
            return "Data(pinotQuerySearchPage=" + bVar + ")";
        }

        public e(b bVar) {
            this.d = bVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private final c c;
        private final String d;

        public final String b() {
            return this.d;
        }

        public final c e() {
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
            c cVar = this.c;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.d;
            c cVar = this.c;
            return "PinotQuerySearchPage(__typename=" + str + ", onPinotSectionListPage=" + cVar + ")";
        }

        public b(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = cVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private final C2508ahR c;

        public final C2508ahR b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.c, ((c) obj).c);
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            C2508ahR c2508ahR = this.c;
            return "OnPinotSectionListPage(pinotPageSectionFragment=" + c2508ahR + ")";
        }

        public c(C2508ahR c2508ahR) {
            C8632dsu.c((Object) c2508ahR, "");
            this.c = c2508ahR;
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
