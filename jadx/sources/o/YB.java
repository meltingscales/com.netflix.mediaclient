package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import o.C2134aaX;
import o.C9018hf;
import o.InterfaceC8999hM;

/* loaded from: classes3.dex */
public final class YB implements InterfaceC8999hM<b> {
    public static final c b = new c(null);
    private final boolean a;
    private final Integer c;
    private final String d;
    private final C2865aoD e;
    private final String g;
    private final C2865aoD h;
    private final C2865aoD i;
    private final C2865aoD j;

    @Override // o.InterfaceC8991hE
    public String a() {
        return "ec01ddb4-e626-48a0-8f17-ed2d27438e7b";
    }

    @Override // o.InterfaceC9034hv
    public boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YB) {
            YB yb = (YB) obj;
            return C8632dsu.c((Object) this.g, (Object) yb.g) && C8632dsu.c((Object) this.d, (Object) yb.d) && C8632dsu.c(this.c, yb.c) && C8632dsu.c(this.i, yb.i) && C8632dsu.c(this.h, yb.h) && C8632dsu.c(this.j, yb.j) && C8632dsu.c(this.e, yb.e);
        }
        return false;
    }

    @Override // o.InterfaceC8991hE
    public String f() {
        return "IrmaHorizontalPaginatedSearchResults";
    }

    public final C2865aoD g() {
        return this.h;
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.g.hashCode();
        String str = this.d;
        int hashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.c;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + (num != null ? num.hashCode() : 0)) * 31) + this.i.hashCode()) * 31) + this.h.hashCode()) * 31) + this.j.hashCode()) * 31) + this.e.hashCode();
    }

    public final Integer i() {
        return this.c;
    }

    public final C2865aoD j() {
        return this.e;
    }

    public final C2865aoD k() {
        return this.j;
    }

    public final C2865aoD l() {
        return this.i;
    }

    public final String n() {
        return this.g;
    }

    public String toString() {
        String str = this.g;
        String str2 = this.d;
        Integer num = this.c;
        C2865aoD c2865aoD = this.i;
        C2865aoD c2865aoD2 = this.h;
        C2865aoD c2865aoD3 = this.j;
        C2865aoD c2865aoD4 = this.e;
        return "IrmaHorizontalPaginatedSearchResultsQuery(sectionCursor=" + str + ", entityCursor=" + str2 + ", first_entities=" + num + ", imageParamsForLocalizedBoxart=" + c2865aoD + ", imageParamsForGamesIcon=" + c2865aoD2 + ", imageParamsForPQS=" + c2865aoD3 + ", imageParamsForCreatorHome=" + c2865aoD4 + ")";
    }

    public YB(String str, String str2, Integer num, C2865aoD c2865aoD, C2865aoD c2865aoD2, C2865aoD c2865aoD3, C2865aoD c2865aoD4) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2865aoD, "");
        C8632dsu.c((Object) c2865aoD2, "");
        C8632dsu.c((Object) c2865aoD3, "");
        C8632dsu.c((Object) c2865aoD4, "");
        this.g = str;
        this.d = str2;
        this.c = num;
        this.i = c2865aoD;
        this.h = c2865aoD2;
        this.j = c2865aoD3;
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
        C2136aaZ.e.d(interfaceC9069id, this, c9028hp, z);
    }

    @Override // o.InterfaceC8991hE, o.InterfaceC9034hv
    public InterfaceC8949gP<b> e() {
        return C8953gT.c(C2134aaX.b.a, false, 1, null);
    }

    @Override // o.InterfaceC9034hv
    public C9018hf b() {
        return new C9018hf.a(NotificationFactory.DATA, C3147atU.a.b()).e(C2842anh.b.e()).d();
    }

    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8999hM.c {
        private final a d;

        public final a b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.d, ((b) obj).d);
        }

        public int hashCode() {
            a aVar = this.d;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            a aVar = this.d;
            return "Data(pinotSectionByCursor=" + aVar + ")";
        }

        public b(a aVar) {
            this.d = aVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final C2411afj b;
        private final String d;
        private final C2415afn e;

        public final C2415afn b() {
            return this.e;
        }

        public final C2411afj d() {
            return this.b;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c(this.e, aVar.e) && C8632dsu.c(this.b, aVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            C2415afn c2415afn = this.e;
            int hashCode2 = c2415afn == null ? 0 : c2415afn.hashCode();
            C2411afj c2411afj = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (c2411afj != null ? c2411afj.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            C2415afn c2415afn = this.e;
            C2411afj c2411afj = this.b;
            return "PinotSectionByCursor(__typename=" + str + ", irmaEntityCollectionSectionFragment=" + c2415afn + ", irmaCreatorHomeFragment=" + c2411afj + ")";
        }

        public a(String str, C2415afn c2415afn, C2411afj c2411afj) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = c2415afn;
            this.b = c2411afj;
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
