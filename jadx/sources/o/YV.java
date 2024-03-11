package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2172abI;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class YV implements InterfaceC8999hM<d> {
    public static final e b = new e(null);
    private final String a;
    private final boolean c;
    private final Integer d;
    private final C2865aoD e;
    private final C2865aoD g;
    private final C2865aoD h;
    private final C2865aoD i;
    private final String j;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "43a56cf6-be75-466a-9c19-269f3675126c";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YV) {
            YV yv = (YV) obj;
            return C8632dsu.c((Object) this.j, (Object) yv.j) && C8632dsu.c((Object) this.a, (Object) yv.a) && C8632dsu.c(this.d, yv.d) && C8632dsu.c(this.i, yv.i) && C8632dsu.c(this.h, yv.h) && C8632dsu.c(this.g, yv.g) && C8632dsu.c(this.e, yv.e);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "PinotHorizontalPaginatedSearchResultsOption5";
    }

    public final String g() {
        return this.a;
    }

    public final Integer h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.j.hashCode();
        String str = this.a;
        int hashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.d;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + (num != null ? num.hashCode() : 0)) * 31) + this.i.hashCode()) * 31) + this.h.hashCode()) * 31) + this.g.hashCode()) * 31) + this.e.hashCode();
    }

    public final C2865aoD i() {
        return this.h;
    }

    public final C2865aoD j() {
        return this.e;
    }

    public final C2865aoD k() {
        return this.g;
    }

    public final C2865aoD l() {
        return this.i;
    }

    public final String m() {
        return this.j;
    }

    public String toString() {
        String str = this.j;
        String str2 = this.a;
        Integer num = this.d;
        C2865aoD c2865aoD = this.i;
        C2865aoD c2865aoD2 = this.h;
        C2865aoD c2865aoD3 = this.g;
        C2865aoD c2865aoD4 = this.e;
        return "PinotHorizontalPaginatedSearchResultsOption5Query(sectionCursor=" + str + ", entityCursor=" + str2 + ", first_entities=" + num + ", imageParamsForLocalizedBoxart=" + c2865aoD + ", imageParamsForGamesIcon=" + c2865aoD2 + ", imageParamsForPQS=" + c2865aoD3 + ", imageParamsForCreatorHome=" + c2865aoD4 + ")";
    }

    public YV(String str, String str2, Integer num, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3, C2865aoD c2865aoD4) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2865aoD, "");
        C8632dsu.c((Object) c2865aoD2, "");
        C8632dsu.c((Object) c2865aoD3, "");
        C8632dsu.c((Object) c2865aoD4, "");
        this.j = str;
        this.a = str2;
        this.d = num;
        this.i = c2865aoD;
        this.h = c2865aoD2;
        this.g = c2865aoD3;
        this.e = c2865aoD4;
    }

    @Override // o.InterfaceC8991hE
    public String d() {
        throw new IllegalStateException("The query document was removed from this operation. Use generateQueryDocument.set(true) if you need it".toString());
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public void d(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, boolean z) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C2173abJ.d.c(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<d> e() {
        return C8953gT.c(C2172abI.e.a, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2809anA.e.b()).d();
    }

    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8999hM.c {
        private final b d;

        public final b b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.d, ((d) obj).d);
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
            return "Data(pinotSectionByCursor=" + bVar + ")";
        }

        public d(b bVar) {
            this.d = bVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private final C2499ahI b;
        private final String c;
        private final C2498ahH d;

        public final C2499ahI c() {
            return this.b;
        }

        public final String d() {
            return this.c;
        }

        public final C2498ahH e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c(this.b, bVar.b) && C8632dsu.c(this.d, bVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            C2499ahI c2499ahI = this.b;
            int hashCode2 = c2499ahI == null ? 0 : c2499ahI.hashCode();
            C2498ahH c2498ahH = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (c2498ahH != null ? c2498ahH.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            C2499ahI c2499ahI = this.b;
            C2498ahH c2498ahH = this.d;
            return "PinotSectionByCursor(__typename=" + str + ", pinotOption5EntityCollectionSectionFragment=" + c2499ahI + ", pinotOption5CreatorHomeFragment=" + c2498ahH + ")";
        }

        public b(String str, C2499ahI c2499ahI, C2498ahH c2498ahH) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.b = c2499ahI;
            this.d = c2498ahH;
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
